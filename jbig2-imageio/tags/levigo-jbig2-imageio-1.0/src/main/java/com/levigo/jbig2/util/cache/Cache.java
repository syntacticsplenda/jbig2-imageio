/**
 * Copyright (C) 1995-2010 levigo holding gmbh.
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package com.levigo.jbig2.util.cache;

/**
 * @author <a href="mailto:m.krzikalla@levigo.de">Matth�us Krzikalla</a>
 */
public interface Cache {


  Object put(Object key, Object value, int sizeEstimate);

  Object get(Object key);

  /**
   * Removes all mappings from a map (optional operation).
   * 
   * @throws UnsupportedOperationException if {@code clear()} is not supported by the map.
   */
  void clear();

  Object remove(Object key);
}