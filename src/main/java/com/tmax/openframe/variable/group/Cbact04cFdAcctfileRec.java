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
 * <p>Class that defines variables for COBOL group item FD-ACCTFILE-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact04cFdAcctfileRec {
    // [T-Up#INFO][CBACT04C.cbl:86] FD-ACCT-ID (level: 5)
    private @Getter @Setter long fdAcctId;
    // [T-Up#INFO][CBACT04C.cbl:87] FD-ACCT-ACTIVE-STATUS (level: 5)
    private @Getter String fdAcctActiveStatus = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBACT04C.cbl:88] FD-ACCT-CURR-BAL (level: 5)
    private @Getter BigDecimal fdAcctCurrBal = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl:89] FD-ACCT-CREDIT-LIMIT (level: 5)
    private @Getter BigDecimal fdAcctCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl:90] FD-ACCT-CASH-CREDIT-LIMIT (level: 5)
    private @Getter BigDecimal fdAcctCashCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl:91] FD-ACCT-OPEN-DATE (level: 5)
    private @Getter String fdAcctOpenDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBACT04C.cbl:92] FD-ACCT-EXPIRAION-DATE (level: 5)
    private @Getter String fdAcctExpiraionDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBACT04C.cbl:93] FD-ACCT-REISSUE-DATE (level: 5)
    private @Getter String fdAcctReissueDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBACT04C.cbl:94] FD-ACCT-CURR-CYC-CREDIT (level: 5)
    private @Getter BigDecimal fdAcctCurrCycCredit = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl:95] FD-ACCT-CURR-CYC-DEBIT (level: 5)
    private @Getter BigDecimal fdAcctCurrCycDebit = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl:96] FD-ACCT-ADDR-ZIP (level: 5)
    private @Getter String fdAcctAddrZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBACT04C.cbl:97] FD-ACCT-GROUP-ID (level: 5)
    private @Getter String fdAcctGroupId = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBACT04C.cbl:98] FILLER (level: 5)
    private @Getter String FILLER_1 = StringUtils.repeat(' ', 178);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 300), 300);
        try {
            setFdAcctId(CobStream.convZonedStringToLong(
                    source.substring(0, 11), 11));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctId(0);
        }
        setFdAcctActiveStatus(source.substring(11, 12));
        try {
            setFdAcctCurrBal(CobStream.convZonedStringToBigDecimal(
                    source.substring(12, 24), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctCurrBal(BigDecimal.ZERO);
        }
        try {
            setFdAcctCreditLimit(CobStream.convZonedStringToBigDecimal(
                    source.substring(24, 36), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctCreditLimit(BigDecimal.ZERO);
        }
        try {
            setFdAcctCashCreditLimit(CobStream.convZonedStringToBigDecimal(
                    source.substring(36, 48), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctCashCreditLimit(BigDecimal.ZERO);
        }
        setFdAcctOpenDate(source.substring(48, 58));
        setFdAcctExpiraionDate(source.substring(58, 68));
        setFdAcctReissueDate(source.substring(68, 78));
        try {
            setFdAcctCurrCycCredit(CobStream.convZonedStringToBigDecimal(
                    source.substring(78, 90), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctCurrCycCredit(BigDecimal.ZERO);
        }
        try {
            setFdAcctCurrCycDebit(CobStream.convZonedStringToBigDecimal(
                    source.substring(90, 102), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdAcctCurrCycDebit(BigDecimal.ZERO);
        }
        setFdAcctAddrZip(source.substring(102, 112));
        setFdAcctGroupId(source.substring(112, 122));
        setFILLER_1(source.substring(122, 300));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(CobStream.convZonedLongToString(getFdAcctId(), 11));
        sb.append(getFdAcctActiveStatus());
        sb.append(CobStream.convZonedBigDecimalToString(getFdAcctCurrBal(), 12,
                2));
        sb.append(CobStream.convZonedBigDecimalToString(getFdAcctCreditLimit(),
                12, 2));
        sb.append(CobStream.convZonedBigDecimalToString(
                getFdAcctCashCreditLimit(), 12, 2));
        sb.append(getFdAcctOpenDate());
        sb.append(getFdAcctExpiraionDate());
        sb.append(getFdAcctReissueDate());
        sb.append(CobStream.convZonedBigDecimalToString(
                getFdAcctCurrCycCredit(), 12, 2));
        sb.append(CobStream.convZonedBigDecimalToString(
                getFdAcctCurrCycDebit(), 12, 2));
        sb.append(getFdAcctAddrZip());
        sb.append(getFdAcctGroupId());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign(getFdAcctId(),
                "00000000000"));
        sb.append(getFdAcctActiveStatus());
        sb.append(PictureFormatter.decimalFormatWithSign(getFdAcctCurrBal(),
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(
                getFdAcctCreditLimit(), "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(
                getFdAcctCashCreditLimit(), "0000000000.00"));
        sb.append(getFdAcctOpenDate());
        sb.append(getFdAcctExpiraionDate());
        sb.append(getFdAcctReissueDate());
        sb.append(PictureFormatter.decimalFormatWithSign(
                getFdAcctCurrCycCredit(), "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(
                getFdAcctCurrCycDebit(), "0000000000.00"));
        sb.append(getFdAcctAddrZip());
        sb.append(getFdAcctGroupId());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setFdAcctActiveStatus(String source) {
        fdAcctActiveStatus = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setFdAcctCurrBal(BigDecimal source) {
        fdAcctCurrBal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdAcctCreditLimit(BigDecimal source) {
        fdAcctCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdAcctCashCreditLimit(BigDecimal source) {
        fdAcctCashCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdAcctOpenDate(String source) {
        fdAcctOpenDate = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFdAcctExpiraionDate(String source) {
        fdAcctExpiraionDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setFdAcctReissueDate(String source) {
        fdAcctReissueDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setFdAcctCurrCycCredit(BigDecimal source) {
        fdAcctCurrCycCredit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdAcctCurrCycDebit(BigDecimal source) {
        fdAcctCurrCycDebit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdAcctAddrZip(String source) {
        fdAcctAddrZip = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFdAcctGroupId(String source) {
        fdAcctGroupId = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 178), 178);
    }
}
