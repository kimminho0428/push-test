package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item TRANFILE-STATUS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn01cTranfileStatus {
    // [T-Up#INFO][CBTRN01C.cbl:126] TRANFILE-STAT1 (level: 5)
    private @Getter String tranfileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBTRN01C.cbl:127] TRANFILE-STAT2 (level: 5)
    private @Getter String tranfileStat2 = StringUtils.repeat(' ', 1);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        setTranfileStat1(source.substring(0, 1));
        setTranfileStat2(source.substring(1, 2));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTranfileStat1());
        sb.append(getTranfileStat2());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTranfileStat1());
        sb.append(getTranfileStat2());
        return sb.toString();
    }

    public void setTranfileStat1(String source) {
        tranfileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setTranfileStat2(String source) {
        tranfileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }
}
