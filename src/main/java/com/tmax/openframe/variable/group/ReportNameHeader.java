package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item REPORT-NAME-HEADER</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class ReportNameHeader {
    // [T-Up#INFO][CVTRA07Y.cpy:6] REPT-SHORT-NAME (level: 5)
    private @Getter @Builder.Default String reptShortName = "DALYREPT"
            + StringUtils.repeat(' ', 30);
    // [T-Up#INFO][CVTRA07Y.cpy:8] REPT-LONG-NAME (level: 5)
    private @Getter @Builder.Default String reptLongName = "Daily Transaction Report"
            + StringUtils.repeat(' ', 17);
    // [T-Up#INFO][CVTRA07Y.cpy:10] REPT-DATE-HEADER (level: 5)
    private @Getter @Builder.Default String reptDateHeader = "Date Range: ";
    // [T-Up#INFO][CVTRA07Y.cpy:12] REPT-START-DATE (level: 5)
    private @Getter @Builder.Default String reptStartDate = StringUtils.repeat(
            ' ', 10);
    // [T-Up#INFO][CVTRA07Y.cpy:13] FILLER (level: 5)
    private @Getter @Builder.Default String FILLER_1 = " to ";
    // [T-Up#INFO][CVTRA07Y.cpy:14] REPT-END-DATE (level: 5)
    private @Getter @Builder.Default String reptEndDate = StringUtils.repeat(
            ' ', 10);

    public static ReportNameHeader createDefaultValueInstance() {
        return new ReportNameHeader.builder()
                .reptShortName(StringUtils.repeat(' ', 38))
                .reptLongName(StringUtils.repeat(' ', 41))
                .reptDateHeader(StringUtils.repeat(' ', 12))
                .reptStartDate(StringUtils.repeat(' ', 10))
                .reptEndDate(StringUtils.repeat(' ', 10)).build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 115), 115);
        setReptShortName(source.substring(0, 38));
        setReptLongName(source.substring(38, 79));
        setReptDateHeader(source.substring(79, 91));
        setReptStartDate(source.substring(91, 101));
        setFILLER_1(source.substring(101, 105));
        setReptEndDate(source.substring(105, 115));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getReptShortName());
        sb.append(getReptLongName());
        sb.append(getReptDateHeader());
        sb.append(getReptStartDate());
        sb.append(getFILLER_1());
        sb.append(getReptEndDate());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getReptShortName());
        sb.append(getReptLongName());
        sb.append(getReptDateHeader());
        sb.append(getReptStartDate());
        sb.append(getFILLER_1());
        sb.append(getReptEndDate());
        return sb.toString();
    }

    public void setReptShortName(String source) {
        reptShortName = StringUtils.truncate(StringUtils.rightPad(source, 38),
                38);
    }

    public void setReptLongName(String source) {
        reptLongName = StringUtils.truncate(StringUtils.rightPad(source, 41),
                41);
    }

    public void setReptDateHeader(String source) {
        reptDateHeader = StringUtils.truncate(StringUtils.rightPad(source, 12),
                12);
    }

    public void setReptStartDate(String source) {
        reptStartDate = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setReptEndDate(String source) {
        reptEndDate = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }
}
