package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item IO-STATUS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn01cIoStatus {
    // [T-Up#INFO][CBTRN01C.cbl:130] IO-STAT1 (level: 5)
    private @Getter String ioStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBTRN01C.cbl:131] IO-STAT2 (level: 5)
    private @Getter String ioStat2 = StringUtils.repeat(' ', 1);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        setIoStat1(source.substring(0, 1));
        setIoStat2(source.substring(1, 2));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIoStat1());
        sb.append(getIoStat2());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIoStat1());
        sb.append(getIoStat2());
        return sb.toString();
    }

    public void setIoStat1(String source) {
        ioStat1 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setIoStat2(String source) {
        ioStat2 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }
}
