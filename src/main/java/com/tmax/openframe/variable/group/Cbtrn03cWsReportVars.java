package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-REPORT-VARS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn03cWsReportVars {
    // [T-Up#INFO][CBTRN03C.cbl:128] WS-FIRST-TIME (level: 5)
    private @Getter String wsFirstTime = "Y";
    // [T-Up#INFO][CBTRN03C.cbl:129] WS-LINE-COUNTER (level: 5)
    private @Getter @Setter int wsLineCounter = 0;
    // [T-Up#INFO][CBTRN03C.cbl:131] WS-PAGE-SIZE (level: 5)
    private @Getter @Setter int wsPageSize = 20;
    // [T-Up#INFO][CBTRN03C.cbl:133] WS-BLANK-LINE (level: 5)
    private @Getter String wsBlankLine = StringUtils.repeat(' ', 133);
    // [T-Up#INFO][CBTRN03C.cbl:134] WS-PAGE-TOTAL (level: 5)
    private @Getter BigDecimal wsPageTotal = BigDecimal.valueOf(0);
    // [T-Up#INFO][CBTRN03C.cbl:135] WS-ACCOUNT-TOTAL (level: 5)
    private @Getter BigDecimal wsAccountTotal = BigDecimal.valueOf(0);
    // [T-Up#INFO][CBTRN03C.cbl:136] WS-GRAND-TOTAL (level: 5)
    private @Getter BigDecimal wsGrandTotal = BigDecimal.valueOf(0);
    // [T-Up#INFO][CBTRN03C.cbl:137] WS-CURR-CARD-NUM (level: 5)
    private @Getter String wsCurrCardNum = StringUtils.repeat(' ', 16);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsFirstTime());
        sb.append(String.valueOf(getWsLineCounter()));
        sb.append(String.valueOf(getWsPageSize()));
        sb.append(getWsBlankLine());
        sb.append(PictureFormatter.decimalFormatWithSign(getWsPageTotal(),
                "000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(getWsAccountTotal(),
                "000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(getWsGrandTotal(),
                "000000000.00"));
        sb.append(getWsCurrCardNum());
        return sb.toString();
    }

    public void setWsFirstTime(String source) {
        wsFirstTime = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsBlankLine(String source) {
        wsBlankLine = StringUtils.truncate(StringUtils.rightPad(source, 133),
                133);
    }

    public void setWsPageTotal(BigDecimal source) {
        wsPageTotal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsAccountTotal(BigDecimal source) {
        wsAccountTotal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsGrandTotal(BigDecimal source) {
        wsGrandTotal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsCurrCardNum(String source) {
        wsCurrCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                16);
    }
}