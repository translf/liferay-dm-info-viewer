/**
 * Copyright (C) 2013 Permeance Technologies
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

package au.com.permeance.liferay.portlet.documentlibrary.model;


/**
 * Folder Usage Collector.
 * 
 * @author Tim Telcik <tim.telcik@permeance.com.au>
 */
public class DLFolderUsageCollector {
	
	private long folderSize = 0L;
	private long folderCount = 0L;
	private long fileCount = 0L;
	
	
	public DLFolderUsageCollector() {
	}

	public long getFolderSize() {
		return folderSize;
	}

	public long getFolderCount() {
		return folderCount;
	}

	public long getFileCount() {
		return fileCount;
	}

	public void incrementFolderCount() {
		this.folderCount++;
	}
	
	public void incrementFolderCount( long count ) {
		this.folderCount += count;
	}
	
	public void incrementFileCount() {
		this.fileCount++;
	}
	
	public void incrementFileCount( long count ) {
		this.fileCount += count;
	}
	
	public void incrementFolderSize( long size ) {
		this.folderSize += size;
	}	
	
	public DLFolderUsage buildFolderUsage() {
		DLFolderUsage folderUsage = new DLFolderUsage();
		folderUsage.setFileCount(getFileCount());
		folderUsage.setFolderCount(getFolderCount());
		folderUsage.setFolderSize(getFolderSize());
		return folderUsage;
	}

}
