package com.pi4j.io.w1;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Library (Core)
 * FILENAME      :  W1DummyDeviceType.java  
 * 
 * This file is part of the Pi4J project. More information about 
 * this project can be found here:  http://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2016 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Peter Schuebl
 */
public class W1DummyDeviceType implements W1DeviceType {

    public static final int FAMILY_ID = 0xFE;

    @Override
    public int getDeviceFamilyCode() {
        return FAMILY_ID;
    }

    @Override
    public Class<? extends W1Device> getDeviceClass() {
        return W1DummyDevice.class;
    }

    @Override
    public W1DummyDevice create(final File deviceDir) {
        return new W1DummyDevice(deviceDir);
    }

    static class W1DummyDevice extends W1BaseDevice {

        @Override
        public int getFamilyId() {
            return FAMILY_ID;
        }

        public W1DummyDevice(final File deviceDir) {
            super(deviceDir);
        }

    }

}