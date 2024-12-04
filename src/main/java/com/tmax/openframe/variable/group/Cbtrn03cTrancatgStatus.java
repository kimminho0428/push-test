package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item TRANCATG-STATUS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn03cTrancatgStatus {
    // [T-Up#INFO][CBTRN03C.cbl:110] TRANCATG-STAT1 (level: 5)
    private @Getter String trancatgStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBTRN03C.cbl:111] TRANCATG-STAT2 (level: 5)
    private @Getter String trancatgStat2 = StringUtils.repeat(' ', 1);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        setTrancatgStat1(source.substring(0, 1));
        setTrancatgStat2(source.substring(1, 2));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTrancatgStat1());
        sb.append(getTrancatgStat2());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTrancatgStat1());
        sb.append(getTrancatgStat2());
        return sb.toString();
    }

    public void setTrancatgStat1(String source) {
        trancatgStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setTrancatgStat2(String source) {
        trancatgStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }
}
