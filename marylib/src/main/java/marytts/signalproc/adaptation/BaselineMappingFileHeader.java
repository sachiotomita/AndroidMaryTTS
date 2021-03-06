/**
 * Copyright 2007 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 * <p/>
 * This file is part of MARY TTS.
 * <p/>
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package marytts.signalproc.adaptation;

import marytts.signalproc.analysis.EnergyFileHeader;
import marytts.signalproc.analysis.LsfFileHeader;
import marytts.signalproc.analysis.PitchFileHeader;

/**
 * Baseline class for voice conversion function binary file header
 *
 * @author Oytun T&uumlrk
 */
public class BaselineMappingFileHeader {
    public String sourceTag; //Source name tag (i.e. style or speaker identity)
    public String targetTag; //Target name tag (i.e. style or speaker identity)

    public LsfFileHeader lsfParams;
    public PitchFileHeader ptcParams;
    public EnergyFileHeader energyParams;

    public BaselineMappingFileHeader() {
        sourceTag = "source"; //Source name tag (i.e. style or speaker identity)
        targetTag = "target"; //Target name tag (i.e. style or speaker identity)

        lsfParams = new LsfFileHeader();
        ptcParams = new PitchFileHeader();
        energyParams = new EnergyFileHeader();
    }

    public BaselineMappingFileHeader(BaselineMappingFileHeader existing) {
        sourceTag = existing.sourceTag;
        targetTag = existing.targetTag;

        lsfParams = new LsfFileHeader(existing.lsfParams);
        ptcParams = new PitchFileHeader(existing.ptcParams);
        energyParams = new EnergyFileHeader(existing.energyParams);
    }
}

