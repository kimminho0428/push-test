package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:17 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item TRAN-RECORD</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CodsTranRecord {
    // [T-Up#INFO][CODS.cbl:54] TRAN-ID (level: 5)
    private @Getter String tranId = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CODS.cbl:55] TRAN-TYPE-CD (level: 5)
    private @Getter String tranTypeCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CODS.cbl:56] TRAN-CAT-CD (level: 5)
    private @Getter @Setter int tranCatCd;
    // [T-Up#INFO][CODS.cbl:57] TRAN-SOURCE (level: 5)
    private @Getter String tranSource = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CODS.cbl:58] TRAN-DESC (level: 5)
    private @Getter String tranDesc = StringUtils.repeat(' ', 100);
    // [T-Up#INFO][CODS.cbl:59] TRAN-AMT (level: 5)
    private @Getter BigDecimal tranAmt = BigDecimal.ZERO;
    // [T-Up#INFO][CODS.cbl:60] TRAN-MERCHANT-ID (level: 5)
    private @Getter @Setter int tranMerchantId;
    // [T-Up#INFO][CODS.cbl:61] TRAN-MERCHANT-NAME (level: 5)
    private @Getter String tranMerchantName = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CODS.cbl:62] TRAN-MERCHANT-CITY (level: 5)
    private @Getter String tranMerchantCity = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CODS.cbl:63] TRAN-MERCHANT-ZIP (level: 5)
    private @Getter String tranMerchantZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CODS.cbl:64] TRAN-CARD-NUM (level: 5)
    private @Getter String tranCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CODS.cbl:65] TRAN-ORIG-TS (level: 5)
    private @Getter String tranOrigTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CODS.cbl:66] TRAN-PROC-TS (level: 5)
    private @Getter String tranProcTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CODS.cbl:67] FILLER (level: 5)
    private @Getter String FILLER_1 = StringUtils.repeat(' ', 20);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 350), 350);
        setTranId(source.substring(0, 16));
        setTranTypeCd(source.substring(16, 18));
        try {
            setTranCatCd(CobStream.convZonedStringToInt(
                    source.substring(18, 22), 4));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTranCatCd(0);
        }
        setTranSource(source.substring(22, 32));
        setTranDesc(source.substring(32, 132));
        try {
            setTranAmt(CobStream.convZonedStringToBigDecimal(
                    source.substring(132, 143), 11, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTranAmt(BigDecimal.ZERO);
        }
        try {
            setTranMerchantId(CobStream.convZonedStringToInt(
                    source.substring(143, 152), 9));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTranMerchantId(0);
        }
        setTranMerchantName(source.substring(152, 202));
        setTranMerchantCity(source.substring(202, 252));
        setTranMerchantZip(source.substring(252, 262));
        setTranCardNum(source.substring(262, 278));
        setTranOrigTs(source.substring(278, 304));
        setTranProcTs(source.substring(304, 330));
        setFILLER_1(source.substring(330, 350));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTranId());
        sb.append(getTranTypeCd());
        sb.append(PictureFormatter.intFormatWithoutSign((long) getTranCatCd(),
                "0000"));
        sb.append(getTranSource());
        sb.append(getTranDesc());
        sb.append(PictureFormatter.decimalFormatWithSign(getTranAmt(),
                "000000000.00"));
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getTranMerchantId(), "000000000"));
        sb.append(getTranMerchantName());
        sb.append(getTranMerchantCity());
        sb.append(getTranMerchantZip());
        sb.append(getTranCardNum());
        sb.append(getTranOrigTs());
        sb.append(getTranProcTs());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setTranId(String source) {
        tranId = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setTranTypeCd(String source) {
        tranTypeCd = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
    }

    public void setTranSource(String source) {
        tranSource = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setTranDesc(String source) {
        tranDesc = StringUtils.truncate(StringUtils.rightPad(source, 100), 100);
    }

    public void setTranAmt(BigDecimal source) {
        tranAmt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setTranMerchantName(String source) {
        tranMerchantName = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setTranMerchantCity(String source) {
        tranMerchantCity = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setTranMerchantZip(String source) {
        tranMerchantZip = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setTranCardNum(String source) {
        tranCardNum = StringUtils
                .truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setTranOrigTs(String source) {
        tranOrigTs = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }

    public void setTranProcTs(String source) {
        tranProcTs = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 20), 20);
    }
}
