/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 18/ott/2013
 * Copyright 2013 by Andrea Vacondio (andrea.vacondio@gmail.com).
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
package org.pdfsam.gui.io;

import java.io.File;

import javafx.stage.FileChooser;

import org.pdfsam.context.DefaultUserContext;
import org.pdfsam.support.io.FileType;

/**
 * Contains a single instance of {@link FileChooser} and provides static methods to get and configure the instance
 * 
 * @author Andrea Vacondio
 * 
 */
public final class FileChoosers {

    private static final FileChooser INSTANCE = new FileChooser();
    static {
        File initialDir = new File(DefaultUserContext.getInstance().getDefaultWorkingPath());
        if (initialDir.isDirectory()) {
            INSTANCE.setInitialDirectory(new File(DefaultUserContext.getInstance().getDefaultWorkingPath()));
        }
    }

    private FileChoosers() {
        // hide
    }

    /**
     * 
     * @param filter
     *            the file type extension accepted
     * @param title
     * @return a shared instance of FileChooser with the given title.
     */
    public static FileChooser getFileChooser(FileType filter, String title) {
        INSTANCE.getExtensionFilters().setAll(filter.getFilter());
        INSTANCE.setInitialFileName("");
        INSTANCE.setTitle(title);
        return INSTANCE;
    }

}