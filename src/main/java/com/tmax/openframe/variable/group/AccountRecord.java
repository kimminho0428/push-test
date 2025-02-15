package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:18 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class AccountRecord {
    // [T-Up#INFO][CVACT01Y.cpy:6] ACCT-ID (level: 5)
    private @Getter @Setter long acctId;
    // [T-Up#INFO][CVACT01Y.cpy:7] ACCT-ACTIVE-STATUS (level: 5)
    private @Getter @Builder.Default String acctActiveStatus = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][CVACT01Y.cpy:8] ACCT-CURR-BAL (level: 5)
    private @Getter @Builder.Default BigDecimal acctCurrBal = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy:9] ACCT-CREDIT-LIMIT (level: 5)
    private @Getter @Builder.Default BigDecimal acctCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy:10] ACCT-CASH-CREDIT-LIMIT (level: 5)
    private @Getter @Builder.Default BigDecimal acctCashCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy:11] ACCT-OPEN-DATE (level: 5)
    private @Getter @Builder.Default String acctOpenDate = StringUtils.repeat(
            ' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy:12] ACCT-EXPIRAION-DATE (level: 5)
    private @Getter @Builder.Default String acctExpiraionDate = StringUtils
            .repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy:13] ACCT-REISSUE-DATE (level: 5)
    private @Getter @Builder.Default String acctReissueDate = StringUtils
            .repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy:14] ACCT-CURR-CYC-CREDIT (level: 5)
    private @Getter @Builder.Default BigDecimal acctCurrCycCredit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy:15] ACCT-CURR-CYC-DEBIT (level: 5)
    private @Getter @Builder.Default BigDecimal acctCurrCycDebit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy:16] ACCT-ADDR-ZIP (level: 5)
    private @Getter @Builder.Default String acctAddrZip = StringUtils.repeat(
            ' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy:17] ACCT-GROUP-ID (level: 5)
    private @Getter @Builder.Default String acctGroupId = StringUtils.repeat(
            ' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy:18] FILLER (level: 5)
    private @Getter @Builder.Default String FILLER_1 = StringUtils.repeat(' ',
            178);

    public static AccountRecord createDefaultValueInstance() {
        return new AccountRecord.builder().build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 300), 300);
        try {
            setAcctId(CobStream.convZonedStringToLong(source.substring(0, 11),
                    11));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctId(0);
        }
        setAcctActiveStatus(source.substring(11, 12));
        try {
            setAcctCurrBal(CobStream.convZonedStringToBigDecimal(
                    source.substring(12, 24), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctCurrBal(BigDecimal.ZERO);
        }
        try {
            setAcctCreditLimit(CobStream.convZonedStringToBigDecimal(
                    source.substring(24, 36), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctCreditLimit(BigDecimal.ZERO);
        }
        try {
            setAcctCashCreditLimit(CobStream.convZonedStringToBigDecimal(
                    source.substring(36, 48), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctCashCreditLimit(BigDecimal.ZERO);
        }
        setAcctOpenDate(source.substring(48, 58));
        setAcctExpiraionDate(source.substring(58, 68));
        setAcctReissueDate(source.substring(68, 78));
        try {
            setAcctCurrCycCredit(CobStream.convZonedStringToBigDecimal(
                    source.substring(78, 90), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctCurrCycCredit(BigDecimal.ZERO);
        }
        try {
            setAcctCurrCycDebit(CobStream.convZonedStringToBigDecimal(
                    source.substring(90, 102), 12, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setAcctCurrCycDebit(BigDecimal.ZERO);
        }
        setAcctAddrZip(source.substring(102, 112));
        setAcctGroupId(source.substring(112, 122));
        setFILLER_1(source.substring(122, 300));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(CobStream.convZonedLongToString(getAcctId(), 11));
        sb.append(getAcctActiveStatus());
        sb.append(CobStream
                .convZonedBigDecimalToString(getAcctCurrBal(), 12, 2));
        sb.append(CobStream.convZonedBigDecimalToString(getAcctCreditLimit(),
                12, 2));
        sb.append(CobStream.convZonedBigDecimalToString(
                getAcctCashCreditLimit(), 12, 2));
        sb.append(getAcctOpenDate());
        sb.append(getAcctExpiraionDate());
        sb.append(getAcctReissueDate());
        sb.append(CobStream.convZonedBigDecimalToString(getAcctCurrCycCredit(),
                12, 2));
        sb.append(CobStream.convZonedBigDecimalToString(getAcctCurrCycDebit(),
                12, 2));
        sb.append(getAcctAddrZip());
        sb.append(getAcctGroupId());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign(getAcctId(),
                "00000000000"));
        sb.append(getAcctActiveStatus());
        sb.append(PictureFormatter.decimalFormatWithSign(getAcctCurrBal(),
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(getAcctCreditLimit(),
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(
                getAcctCashCreditLimit(), "0000000000.00"));
        sb.append(getAcctOpenDate());
        sb.append(getAcctExpiraionDate());
        sb.append(getAcctReissueDate());
        sb.append(PictureFormatter.decimalFormatWithSign(
                getAcctCurrCycCredit(), "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(getAcctCurrCycDebit(),
                "0000000000.00"));
        sb.append(getAcctAddrZip());
        sb.append(getAcctGroupId());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setAcctActiveStatus(String source) {
        acctActiveStatus = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setAcctCurrBal(BigDecimal source) {
        acctCurrBal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCreditLimit(BigDecimal source) {
        acctCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCashCreditLimit(BigDecimal source) {
        acctCashCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctOpenDate(String source) {
        acctOpenDate = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setAcctExpiraionDate(String source) {
        acctExpiraionDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctReissueDate(String source) {
        acctReissueDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctCurrCycCredit(BigDecimal source) {
        acctCurrCycCredit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCurrCycDebit(BigDecimal source) {
        acctCurrCycDebit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctAddrZip(String source) {
        acctAddrZip = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctGroupId(String source) {
        acctGroupId = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 178), 178);
    }
}
