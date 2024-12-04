package com.tmax.openframe.variable.group;

import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item REPORT-PAGE-TOTALS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn03cReportPageTotals {
    // [T-Up#INFO][CVTRA07Y.cpy:52] FILLER (level: 5)
    private @Getter String FILLER_1 = "Page Total" + StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CVTRA07Y.cpy:54] FILLER (level: 5)
    private @Getter String FILLER_2 = StringUtils.repeat(".", 86);
    // [T-Up#INFO][CVTRA07Y.cpy:55] REPT-PAGE-TOTAL (level: 5)
    private @Getter String reptPageTotal = reptPageTotalFormat.apply(0L);
    private final static Function<Long, String> reptPageTotalFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+###,###,###.##;-###,###,###.##");
        return StringUtils.leftPad(nf.format(data), 11, ' ');
    };

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 112), 112);
        setFILLER_1(source.substring(0, 11));
        setFILLER_2(source.substring(11, 97));
        setReptPageTotal(source.substring(97, 112));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(getFILLER_2());
        sb.append(getReptPageTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(getFILLER_2());
        sb.append(getReptPageTotal());
        return sb.toString();
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 11), 11);
    }

    public void setFILLER_2(String source) {
        FILLER_2 = StringUtils.truncate(StringUtils.rightPad(source, 86), 86);
    }

    public void setReptPageTotal(String source) {
        reptPageTotal = StringUtils.truncate(StringUtils.rightPad(source, 15),
                15);
    }

    public void setReptPageTotal(long source) {
        reptPageTotal = reptPageTotalFormat.apply(source);
    }
}