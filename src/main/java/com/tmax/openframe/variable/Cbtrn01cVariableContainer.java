package com.tmax.openframe.variable;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.variable.group.*;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables that defined in the data division of COBOL program</p>
 */
public class Cbtrn01cVariableContainer {
    // *****************************************************************
    //       *COPY CVTRA06Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVTRA06Y.cpy)
    // *****************************************************************
    // *    Data-structure for DALYTRANsaction record (RECLN = 350)
    // *****************************************************************
    // [T-Up#INFO][CVTRA06Y.cpy:5] DALYTRAN-RECORD (level: 1)
    private @Getter @Setter DalytranRecord dalytranRecord = new DalytranRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:100] DALYTRAN-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cDalytranStatus dalytranStatus = new Cbtrn01cDalytranStatus();
    //       *COPY CVCUS01Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVCUS01Y.cpy)
    // *****************************************************************
    // *    Data-structure for Customer entity (RECLN 500)
    // *****************************************************************
    // [T-Up#INFO][CVCUS01Y.cpy:5] CUSTOMER-RECORD (level: 1)
    private @Getter @Setter CustomerRecord customerRecord = new CustomerRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:105] CUSTFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cCustfileStatus custfileStatus = new Cbtrn01cCustfileStatus();
    //       *COPY CVACT03Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVACT03Y.cpy)
    // *****************************************************************
    // *    Data-structure for card xref (RECLN 50)
    // *****************************************************************
    // [T-Up#INFO][CVACT03Y.cpy:5] CARD-XREF-RECORD (level: 1)
    private @Getter @Setter CardXrefRecord cardXrefRecord = new CardXrefRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:110] XREFFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cXreffileStatus xreffileStatus = new Cbtrn01cXreffileStatus();
    //       *COPY CVACT02Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVACT02Y.cpy)
    // *****************************************************************
    // *    Data-structure for card entity (RECLN 150)
    // *****************************************************************
    // [T-Up#INFO][CVACT02Y.cpy:5] CARD-RECORD (level: 1)
    private @Getter @Setter CardRecord cardRecord = new CardRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:115] CARDFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cCardfileStatus cardfileStatus = new Cbtrn01cCardfileStatus();
    //       *COPY CVACT01Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVACT01Y.cpy)
    // *****************************************************************
    // *    Data-structure for  account entity (RECLN 300)
    // *****************************************************************
    // [T-Up#INFO][CVACT01Y.cpy:5] ACCOUNT-RECORD (level: 1)
    private @Getter @Setter AccountRecord accountRecord = new AccountRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:120] ACCTFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cAcctfileStatus acctfileStatus = new Cbtrn01cAcctfileStatus();
    //       *COPY CVTRA05Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVTRA05Y.cpy)
    // *****************************************************************
    // *    Data-structure for TRANsaction record (RECLN = 350)
    // *****************************************************************
    // [T-Up#INFO][CVTRA05Y.cpy:5] TRAN-RECORD (level: 1)
    private @Getter @Setter TranRecord tranRecord = new TranRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT
    // *
    // [T-Up#INFO][CBTRN01C.cbl:125] TRANFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cTranfileStatus tranfileStatus = new Cbtrn01cTranfileStatus();
    // [T-Up#INFO][CBTRN01C.cbl:129] IO-STATUS (level: 1)
    private @Getter @Setter Cbtrn01cIoStatus ioStatus = new Cbtrn01cIoStatus();
    // [T-Up#INFO][CBTRN01C.cbl:133] TWO-BYTES-BINARY (level: 1)
    private @Getter @Setter int twoBytesBinary;
    // [T-Up#INFO][CBTRN01C.cbl:138] IO-STATUS-04 (level: 1)
    private @Getter @Setter Cbtrn01cIoStatus04 ioStatus04 = new Cbtrn01cIoStatus04();
    // [T-Up#INFO][CBTRN01C.cbl:142] APPL-RESULT (level: 1)
    private @Getter @Setter int applResult;
    // [T-Up#INFO][CBTRN01C.cbl:143] APPL-AOK (level: 88)
    public static final int APPL_AOK = 0;
    // [T-Up#INFO][CBTRN01C.cbl:144] APPL-EOF (level: 88)
    public static final int APPL_EOF = 16;
    // [T-Up#INFO][CBTRN01C.cbl:146] END-OF-DAILY-TRANS-FILE (level: 1)
    private @Getter String endOfDailyTransFile = "N";
    // [T-Up#INFO][CBTRN01C.cbl:147] ABCODE (level: 1)
    private @Getter @Setter int abcode;
    // [T-Up#INFO][CBTRN01C.cbl:148] TIMING (level: 1)
    private @Getter @Setter int timing;
    // [T-Up#INFO][CBTRN01C.cbl:149] WS-MISC-VARIABLES (level: 1)
    private @Getter @Setter Cbtrn01cWsMiscVariables wsMiscVariables = new Cbtrn01cWsMiscVariables();
    // [T-Up#INFO][CBTRN01C.cbl:67] FD-TRAN-RECORD (level: 1)
    private @Getter @Setter Cbtrn01cFdTranRecord fdTranRecord = new Cbtrn01cFdTranRecord();
    // [T-Up#INFO][CBTRN01C.cbl:72] FD-CUSTFILE-REC (level: 1)
    private @Getter @Setter Cbtrn01cFdCustfileRec fdCustfileRec = new Cbtrn01cFdCustfileRec();
    // [T-Up#INFO][CBTRN01C.cbl:77] FD-XREFFILE-REC (level: 1)
    private @Getter @Setter Cbtrn01cFdXreffileRec fdXreffileRec = new Cbtrn01cFdXreffileRec();
    // [T-Up#INFO][CBTRN01C.cbl:82] FD-CARDFILE-REC (level: 1)
    private @Getter @Setter Cbtrn01cFdCardfileRec fdCardfileRec = new Cbtrn01cFdCardfileRec();
    // [T-Up#INFO][CBTRN01C.cbl:87] FD-ACCTFILE-REC (level: 1)
    private @Getter @Setter Cbtrn01cFdAcctfileRec fdAcctfileRec = new Cbtrn01cFdAcctfileRec();
    // [T-Up#INFO][CBTRN01C.cbl:92] FD-TRANFILE-REC (level: 1)
    private @Getter @Setter Cbtrn01cFdTranfileRec fdTranfileRec = new Cbtrn01cFdTranfileRec();

    public Cbtrn01cTwoBytesAlpha getTwoBytesAlpha() {
        return Cbtrn01cTwoBytesAlpha.builder().twoBytesLeft(getTwoBytesLeft())
                .twoBytesRight(getTwoBytesRight()).build();
    }

    public void setTwoBytesAlpha(String source) {
        setTwoBytesLeft(source.substring(0, 1));
        setTwoBytesRight(source.substring(1, 2));
    }

    public void setTwoBytesAlpha(Cbtrn01cTwoBytesAlpha source) {
        setTwoBytesAlpha(source.get());
    }

    public String getTwoBytesLeft() {
        return CobStream.convShortToString((short) getTwoBytesBinary())
                .substring(0, 1);
    }

    public void setTwoBytesLeft(String source) {
        try {
            setTwoBytesBinary(CobStream.convStringToShort(StringUtils.overlay(
                    CobStream.convShortToString((short) getTwoBytesBinary()),
                    source, 0, 1)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTwoBytesBinary(0);
        }
    }

    public String getTwoBytesRight() {
        return CobStream.convShortToString((short) getTwoBytesBinary())
                .substring(1, 2);
    }

    public void setTwoBytesRight(String source) {
        try {
            setTwoBytesBinary(CobStream.convStringToShort(StringUtils.overlay(
                    CobStream.convShortToString((short) getTwoBytesBinary()),
                    source, 1, 2)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTwoBytesBinary(0);
        }
    }

    public void setEndOfDailyTransFile(String source) {
        endOfDailyTransFile = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class Cbtrn01cTwoBytesAlpha {
        // [T-Up#INFO][CBTRN01C.cbl:135] TWO-BYTES-LEFT (level: 5)
        private @Getter String twoBytesLeft = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN01C.cbl:136] TWO-BYTES-RIGHT (level: 5)
        private @Getter String twoBytesRight = StringUtils.repeat(' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(twoBytesLeft);
            sb.append(twoBytesRight);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getTwoBytesLeft());
            sb.append(getTwoBytesRight());
            return sb.toString();
        }
    }
}