/**
 * Copyright (C) 1995-2014 levigo holding gmbh.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.levigo.jbig2.segments;

import java.io.IOException;

import com.levigo.jbig2.SegmentHeader;
import com.levigo.jbig2.SegmentData;
import com.levigo.jbig2.err.IntegerMaxValueException;
import com.levigo.jbig2.err.InvalidHeaderValueException;
import com.levigo.jbig2.io.SubInputStream;

/**
 * This segment flags an end of stripe (see JBIG2 ISO standard, 7.4.9).
 * 
 * @author <a href="mailto:m.krzikalla@levigo.de">Matthäus Krzikalla</a>
 * 
 */
public class EndOfStripe implements SegmentData {

  private SubInputStream subInputStream;
  private int lineNumber;

  private void parseHeader() throws IOException, IntegerMaxValueException, InvalidHeaderValueException {
    lineNumber = (int) (subInputStream.readBits(32) & 0xffffffff);
  }

  public void init(SegmentHeader header, SubInputStream sis) throws IntegerMaxValueException,
      InvalidHeaderValueException, IOException {
    this.subInputStream = sis;
    parseHeader();
  }

  public int getLineNumber() {
    return lineNumber;
  }
}
