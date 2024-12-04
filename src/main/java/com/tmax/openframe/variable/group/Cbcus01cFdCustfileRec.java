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
 * <p>Class that defines variables for COBOL group item FD-CUSTFILE-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbcus01cFdCustfileRec {
    // [T-Up#INFO][CBCUS01C.cbl:39] FD-CUST-ID (level: 5)
    private @Getter @Setter int fdCustId;
    // [T-Up#INFO][CBCUS01C.cbl:40] FD-CUST-DATA (level: 5)
    private @Getter String fdCustData = StringUtils.repeat(' ', 491);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 500), 500);
        try {
            setFdCustId(CobStream.convZonedStringToInt(source.substring(0, 9),
                    9));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdCustId(0);
        }
        setFdCustData(source.substring(9, 500));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign((long) getFdCustId(),
                "000000000"));
        sb.append(getFdCustData());
        return sb.toString();
    }

    public void setFdCustData(String source) {
        fdCustData = StringUtils.truncate(StringUtils.rightPad(source, 491),
                491);
    }
}
