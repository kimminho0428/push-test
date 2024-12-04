package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:16 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CcWorkAreas {
    // [T-Up#INFO][CVCRD01Y.cpy:3] CC-WORK-AREA (level: 5)
    private @Getter @Setter @Builder.Default CcWorkArea ccWorkArea = new CcWorkArea();

    public static CcWorkAreas createDefaultValueInstance() {
        return new CcWorkAreas.builder().ccWorkArea(
                CcWorkArea.createDefaultValueInstance()).build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 213), 213);
        getCcWorkArea().set(source.substring(0, 213));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcWorkArea().get());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcWorkArea().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CcWorkArea {
        // [T-Up#INFO][CVCRD01Y.cpy:4] CCARD-AID (level: 10)
        private @Getter @Builder.Default String ccardAid = StringUtils.repeat(
                ' ', 5);
        // [T-Up#INFO][CVCRD01Y.cpy:5] CCARD-AID-ENTER (level: 88)
        public static final String CCARD_AID_ENTER = "ENTER";
        // [T-Up#INFO][CVCRD01Y.cpy:6] CCARD-AID-CLEAR (level: 88)
        public static final String CCARD_AID_CLEAR = "CLEAR";
        // [T-Up#INFO][CVCRD01Y.cpy:7] CCARD-AID-PA1 (level: 88)
        public static final String CCARD_AID_PA1 = "PA1  ";
        // [T-Up#INFO][CVCRD01Y.cpy:8] CCARD-AID-PA2 (level: 88)
        public static final String CCARD_AID_PA2 = "PA2  ";
        // [T-Up#INFO][CVCRD01Y.cpy:9] CCARD-AID-PFK01 (level: 88)
        public static final String CCARD_AID_PFK01 = "PFK01";
        // [T-Up#INFO][CVCRD01Y.cpy:10] CCARD-AID-PFK02 (level: 88)
        public static final String CCARD_AID_PFK02 = "PFK02";
        // [T-Up#INFO][CVCRD01Y.cpy:11] CCARD-AID-PFK03 (level: 88)
        public static final String CCARD_AID_PFK03 = "PFK03";
        // [T-Up#INFO][CVCRD01Y.cpy:12] CCARD-AID-PFK04 (level: 88)
        public static final String CCARD_AID_PFK04 = "PFK04";
        // [T-Up#INFO][CVCRD01Y.cpy:13] CCARD-AID-PFK05 (level: 88)
        public static final String CCARD_AID_PFK05 = "PFK05";
        // [T-Up#INFO][CVCRD01Y.cpy:14] CCARD-AID-PFK06 (level: 88)
        public static final String CCARD_AID_PFK06 = "PFK06";
        // [T-Up#INFO][CVCRD01Y.cpy:15] CCARD-AID-PFK07 (level: 88)
        public static final String CCARD_AID_PFK07 = "PFK07";
        // [T-Up#INFO][CVCRD01Y.cpy:16] CCARD-AID-PFK08 (level: 88)
        public static final String CCARD_AID_PFK08 = "PFK08";
        // [T-Up#INFO][CVCRD01Y.cpy:17] CCARD-AID-PFK09 (level: 88)
        public static final String CCARD_AID_PFK09 = "PFK09";
        // [T-Up#INFO][CVCRD01Y.cpy:18] CCARD-AID-PFK10 (level: 88)
        public static final String CCARD_AID_PFK10 = "PFK10";
        // [T-Up#INFO][CVCRD01Y.cpy:19] CCARD-AID-PFK11 (level: 88)
        public static final String CCARD_AID_PFK11 = "PFK11";
        // [T-Up#INFO][CVCRD01Y.cpy:20] CCARD-AID-PFK12 (level: 88)
        public static final String CCARD_AID_PFK12 = "PFK12";
        // *      10  CCARD-LAST-PROG                  PIC X(8).
        // [T-Up#INFO][CVCRD01Y.cpy:22] CCARD-NEXT-PROG (level: 10)
        private @Getter @Builder.Default String ccardNextProg = StringUtils
                .repeat(' ', 8);
        // *      10  CCARD-RETURN-TO-PROG             PIC X(8).
        // [T-Up#INFO][CVCRD01Y.cpy:24] CCARD-NEXT-MAPSET (level: 10)
        private @Getter @Builder.Default String ccardNextMapset = StringUtils
                .repeat(' ', 7);
        // [T-Up#INFO][CVCRD01Y.cpy:25] CCARD-NEXT-MAP (level: 10)
        private @Getter @Builder.Default String ccardNextMap = StringUtils
                .repeat(' ', 7);
        // *      10  CCARD-RETURN-FLAG                PIC X(1).
        // *        88  CCARD-RETURN-FLAG-OFF          VALUE LOW-VALUES.
        // *        88  CCARD-RETURN-FLAG-ON           VALUE '1'.
        // [T-Up#INFO][CVCRD01Y.cpy:29] CCARD-ERROR-MSG (level: 10)
        private @Getter @Builder.Default String ccardErrorMsg = StringUtils
                .repeat(' ', 75);
        // [T-Up#INFO][CVCRD01Y.cpy:30] CCARD-RETURN-MSG (level: 10)
        private @Getter @Builder.Default String ccardReturnMsg = StringUtils
                .repeat(' ', 75);
        // [T-Up#INFO][CVCRD01Y.cpy:31] CCARD-RETURN-MSG-OFF (level: 88)
        public static final String CCARD_RETURN_MSG_OFF = StringUtils.repeat(
                (char) 0x00, 75);
        // *      10  CCARD-FUNCTION                   PIC X(1).
        // *        88  CCARD-NO-VALUE                  VALUE LOW-VALUES.
        // *        88  CCARD-GET-DATA                  VALUE '1'.
        // [T-Up#INFO][CVCRD01Y.cpy:35] CC-ACCT-ID (level: 10)
        private @Getter @Builder.Default String ccAcctId = StringUtils.repeat(
                ' ', 11);
        // [T-Up#INFO][CVCRD01Y.cpy:38] CC-CARD-NUM (level: 10)
        private @Getter @Builder.Default String ccCardNum = StringUtils.repeat(
                ' ', 16);
        // [T-Up#INFO][CVCRD01Y.cpy:41] CC-CUST-ID (level: 10)
        private @Getter @Builder.Default String ccCustId = StringUtils.repeat(
                ' ', 9);

        public static CcWorkArea createDefaultValueInstance() {
            return new CcWorkArea.builder()
                    .ccAcctId(StringUtils.repeat(' ', 11))
                    .ccCardNum(StringUtils.repeat(' ', 16))
                    .ccCustId(StringUtils.repeat(' ', 9)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 213),
                    213);
            setCcardAid(source.substring(0, 5));
            setCcardNextProg(source.substring(5, 13));
            setCcardNextMapset(source.substring(13, 20));
            setCcardNextMap(source.substring(20, 27));
            setCcardErrorMsg(source.substring(27, 102));
            setCcardReturnMsg(source.substring(102, 177));
            setCcAcctId(source.substring(177, 188));
            setCcCardNum(source.substring(188, 204));
            setCcCustId(source.substring(204, 213));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcardAid());
            sb.append(getCcardNextProg());
            sb.append(getCcardNextMapset());
            sb.append(getCcardNextMap());
            sb.append(getCcardErrorMsg());
            sb.append(getCcardReturnMsg());
            sb.append(getCcAcctId());
            sb.append(getCcCardNum());
            sb.append(getCcCustId());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcardAid());
            sb.append(getCcardNextProg());
            sb.append(getCcardNextMapset());
            sb.append(getCcardNextMap());
            sb.append(getCcardErrorMsg());
            sb.append(getCcardReturnMsg());
            sb.append(getCcAcctId());
            sb.append(getCcCardNum());
            sb.append(getCcCustId());
            return sb.toString();
        }

        public void setCcardAid(String source) {
            ccardAid = StringUtils.truncate(StringUtils.rightPad(source, 5), 5);
        }

        public void setCcardNextProg(String source) {
            ccardNextProg = StringUtils.truncate(
                    StringUtils.rightPad(source, 8), 8);
        }

        public void setCcardNextMapset(String source) {
            ccardNextMapset = StringUtils.truncate(
                    StringUtils.rightPad(source, 7), 7);
        }

        public void setCcardNextMap(String source) {
            ccardNextMap = StringUtils.truncate(
                    StringUtils.rightPad(source, 7), 7);
        }

        public void setCcardErrorMsg(String source) {
            ccardErrorMsg = StringUtils.truncate(
                    StringUtils.rightPad(source, 75), 75);
        }

        public void setCcardReturnMsg(String source) {
            ccardReturnMsg = StringUtils.truncate(
                    StringUtils.rightPad(source, 75), 75);
        }

        public void setCcAcctId(String source) {
            ccAcctId = StringUtils.truncate(StringUtils.rightPad(source, 11),
                    11);
        }

        public long getCcAcctIdN() {
            try {
                return CobStream.convZonedStringToLong(getCcAcctId(), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCcAcctIdN(long source) {
            setCcAcctId(CobStream.convZonedLongToString(source, 11));
        }

        public void setCcCardNum(String source) {
            ccCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                    16);
        }

        public long getCcCardNumN() {
            try {
                return CobStream.convZonedStringToLong(getCcCardNum(), 16);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCcCardNumN(long source) {
            setCcCardNum(CobStream.convZonedLongToString(source, 16));
        }

        public void setCcCustId(String source) {
            ccCustId = StringUtils.truncate(StringUtils.rightPad(source, 9), 9);
        }

        public int getCcCustIdN() {
            try {
                return CobStream.convZonedStringToInt(getCcCustId(), 9);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCcCustIdN(int source) {
            setCcCustId(CobStream.convZonedIntToString(source, 9));
        }
    }
}
