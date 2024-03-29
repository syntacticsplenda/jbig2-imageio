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

package com.levigo.jbig2.err;

/**
 * Can be used if a segment header value is invalid.
 * 
 * @author <a href="mailto:m.krzikalla@levigo.de">Matthäus Krzikalla</a>
 * 
 */
public class InvalidHeaderValueException extends JBIG2Exception {

  private static final long serialVersionUID = -5534202639860867867L;

  public InvalidHeaderValueException() {
  }

  public InvalidHeaderValueException(String message) {
    super(message);
  }

  public InvalidHeaderValueException(Throwable cause) {
    super(cause);
  }

  public InvalidHeaderValueException(String message, Throwable cause) {
    super(message, cause);
  }

}
