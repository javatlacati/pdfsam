/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 04/mar/2015
 * Copyright 2013-2014 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.pdfbox;

import org.sejda.core.service.AlternateMixTaskTest;
import org.sejda.model.parameter.AlternateMixParameters;
import org.sejda.model.task.Task;

/**
 * @author Andrea Vacondio
 *
 */
public class AlternateMixPdfBoxTaskTest extends AlternateMixTaskTest {

    public Task<AlternateMixParameters> getTask() {
        return new AlternateMixTask();
    }

}
