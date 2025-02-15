package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item FD-XREFFILE-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn01cFdXreffileRec {
    // [T-Up#INFO][CBTRN01C.cbl:78] FD-XREF-CARD-NUM (level: 5)
    private @Getter String fdXrefCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN01C.cbl:79] FD-XREF-DATA (level: 5)
    private @Getter String fdXrefData = StringUtils.repeat(' ', 34);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 50), 50);
        setFdXrefCardNum(source.substring(0, 16));
        setFdXrefData(source.substring(16, 50));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdXrefCardNum());
        sb.append(getFdXrefData());
        return sb.toString();
    }

    public void setFdXrefCardNum(String source) {
        fdXrefCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                16);
    }

    public void setFdXrefData(String source) {
        fdXrefData = StringUtils.truncate(StringUtils.rightPad(source, 34), 34);
    }
}
