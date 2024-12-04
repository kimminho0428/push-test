package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item IO-STATUS-04</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact03cIoStatus04 {
    // [T-Up#INFO][CBACT03C.cbl:58] IO-STATUS-0401 (level: 5)
    private @Getter @Setter int ioStatus0401 = 0;
    // [T-Up#INFO][CBACT03C.cbl:59] IO-STATUS-0403 (level: 5)
    private @Getter @Setter int ioStatus0403 = 0;

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
        try {
            setIoStatus0401(CobStream.convZonedStringToInt(
                    source.substring(0, 1), 1));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setIoStatus0401(0);
        }
        try {
            setIoStatus0403(CobStream.convZonedStringToInt(
                    source.substring(1, 4), 3));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setIoStatus0403(0);
        }
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(CobStream.convZonedIntToString(getIoStatus0401(), 1));
        sb.append(CobStream.convZonedIntToString(getIoStatus0403(), 3));
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getIoStatus0401(), "0"));
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getIoStatus0403(), "000"));
        return sb.toString();
    }
}
