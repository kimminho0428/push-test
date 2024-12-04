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
 * <p>Class that defines variables for COBOL group item FD-DISCGRP-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact04cFdDiscgrpRec {
    // [T-Up#INFO][CBACT04C.cbl:78] FD-DISCGRP-KEY (level: 5)
    private @Getter @Setter Cbact04cFdDiscgrpKey fdDiscgrpKey = new Cbact04cFdDiscgrpKey();
    // [T-Up#INFO][CBACT04C.cbl:82] FD-DISCGRP-DATA (level: 5)
    private @Getter String fdDiscgrpData = StringUtils.repeat(' ', 34);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 50), 50);
        getFdDiscgrpKey().set(source.substring(0, 16));
        setFdDiscgrpData(source.substring(16, 50));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdDiscgrpKey().toString());
        sb.append(getFdDiscgrpData());
        return sb.toString();
    }

    public void setFdDiscgrpData(String source) {
        fdDiscgrpData = StringUtils.truncate(StringUtils.rightPad(source, 34),
                34);
    }

    public static @AllArgsConstructor @NoArgsConstructor class Cbact04cFdDiscgrpKey {
        // [T-Up#INFO][CBACT04C.cbl:79] FD-DIS-ACCT-GROUP-ID (level: 10)
        private @Getter String fdDisAcctGroupId = StringUtils.repeat(' ', 10);
        // [T-Up#INFO][CBACT04C.cbl:80] FD-DIS-TRAN-TYPE-CD (level: 10)
        private @Getter String fdDisTranTypeCd = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBACT04C.cbl:81] FD-DIS-TRAN-CAT-CD (level: 10)
        private @Getter @Setter int fdDisTranCatCd;

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            setFdDisAcctGroupId(source.substring(0, 10));
            setFdDisTranTypeCd(source.substring(10, 12));
            try {
                setFdDisTranCatCd(CobStream.convZonedStringToInt(
                        source.substring(12, 16), 4));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setFdDisTranCatCd(0);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getFdDisAcctGroupId());
            sb.append(getFdDisTranTypeCd());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) getFdDisTranCatCd(), "0000"));
            return sb.toString();
        }

        public void setFdDisAcctGroupId(String source) {
            fdDisAcctGroupId = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public void setFdDisTranTypeCd(String source) {
            fdDisTranTypeCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }
    }
}
