package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item TRANSACTION-HEADER-1</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn03cTransactionHeader1 {
    // [T-Up#INFO][CVTRA07Y.cpy:35] FILLER (level: 5)
    private @Getter String FILLER_1 = "Transaction ID"
            + StringUtils.repeat(' ', 3);
    // [T-Up#INFO][CVTRA07Y.cpy:37] FILLER (level: 5)
    private @Getter String FILLER_2 = "Account ID" + StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CVTRA07Y.cpy:39] FILLER (level: 5)
    private @Getter String FILLER_3 = "Transaction Type"
            + StringUtils.repeat(' ', 3);
    // [T-Up#INFO][CVTRA07Y.cpy:41] FILLER (level: 5)
    private @Getter String FILLER_4 = "Tran Category"
            + StringUtils.repeat(' ', 22);
    // [T-Up#INFO][CVTRA07Y.cpy:43] FILLER (level: 5)
    private @Getter String FILLER_5 = "Tran Source"
            + StringUtils.repeat(' ', 3);
    // [T-Up#INFO][CVTRA07Y.cpy:45] FILLER (level: 5)
    private @Getter String FILLER_6 = " ";
    // [T-Up#INFO][CVTRA07Y.cpy:46] FILLER (level: 5)
    private @Getter String FILLER_7 = "        Amount"
            + StringUtils.repeat(' ', 2);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 114), 114);
        setFILLER_1(source.substring(0, 17));
        setFILLER_2(source.substring(17, 29));
        setFILLER_3(source.substring(29, 48));
        setFILLER_4(source.substring(48, 83));
        setFILLER_5(source.substring(83, 97));
        setFILLER_6(source.substring(97, 98));
        setFILLER_7(source.substring(98, 114));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(getFILLER_2());
        sb.append(getFILLER_3());
        sb.append(getFILLER_4());
        sb.append(getFILLER_5());
        sb.append(getFILLER_6());
        sb.append(getFILLER_7());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(getFILLER_2());
        sb.append(getFILLER_3());
        sb.append(getFILLER_4());
        sb.append(getFILLER_5());
        sb.append(getFILLER_6());
        sb.append(getFILLER_7());
        return sb.toString();
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 17), 17);
    }

    public void setFILLER_2(String source) {
        FILLER_2 = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
    }

    public void setFILLER_3(String source) {
        FILLER_3 = StringUtils.truncate(StringUtils.rightPad(source, 19), 19);
    }

    public void setFILLER_4(String source) {
        FILLER_4 = StringUtils.truncate(StringUtils.rightPad(source, 35), 35);
    }

    public void setFILLER_5(String source) {
        FILLER_5 = StringUtils.truncate(StringUtils.rightPad(source, 14), 14);
    }

    public void setFILLER_6(String source) {
        FILLER_6 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setFILLER_7(String source) {
        FILLER_7 = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }
}
