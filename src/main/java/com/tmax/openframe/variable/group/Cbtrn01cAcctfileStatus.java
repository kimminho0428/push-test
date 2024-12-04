package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item ACCTFILE-STATUS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn01cAcctfileStatus {
    // [T-Up#INFO][CBTRN01C.cbl:121] ACCTFILE-STAT1 (level: 5)
    private @Getter String acctfileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBTRN01C.cbl:122] ACCTFILE-STAT2 (level: 5)
    private @Getter String acctfileStat2 = StringUtils.repeat(' ', 1);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        setAcctfileStat1(source.substring(0, 1));
        setAcctfileStat2(source.substring(1, 2));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAcctfileStat1());
        sb.append(getAcctfileStat2());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAcctfileStat1());
        sb.append(getAcctfileStat2());
        return sb.toString();
    }

    public void setAcctfileStat1(String source) {
        acctfileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setAcctfileStat2(String source) {
        acctfileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }
}
