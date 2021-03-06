/* Copyright 2012 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 *
 *  EuclideanSpace is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  EuclideanSpace is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with EuclideanSpace.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.euclideanspace.spad.builder;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/**
 * @author Martin John Baker
 */
public class FileContentBuffer extends InputStream {

	/**
	 * holds the data 
	 */
	LinkedList<String> data = new LinkedList<String>();

	/**
	 * line currently being read
	 */
	byte[] currentLine = null;
	/**
	 * pointer to position in line currently being read
	 */
	int lineIndex = 0;
	
	public FileContentBuffer(){
	}
	
	/**
	 * required for InputStream which is used by file.create in close
	 */
	@Override
	public int read() throws IOException {
		if (currentLine == null) {
			if (data.isEmpty()) return -1;
			currentLine = data.removeFirst().getBytes();
			lineIndex = 0;
		}
		int val = currentLine[lineIndex++];
		if (lineIndex >= currentLine.length) {
		  currentLine = null;
		}
		return val;
	}

	public void write(String line){
		data.addLast(line);
	}

	/**
	 * close is not needed.
	 */
	/*public void close(){
		System.err.println("FileContentBuffer.close():" + name);
	}*/

}
