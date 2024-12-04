package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:14 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-LITERALS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CoactvwcWsLiterals {
    // [T-Up#INFO][COACTVWC.cbl:142] LIT-THISPGM (level: 5)
    private @Getter String litThispgm = "COACTVWC";
    // [T-Up#INFO][COACTVWC.cbl:144] LIT-THISTRANID (level: 5)
    private @Getter String litThistranid = "CAVW";
    // [T-Up#INFO][COACTVWC.cbl:146] LIT-THISMAPSET (level: 5)
    private @Getter String litThismapset = "COACTVW ";
    // [T-Up#INFO][COACTVWC.cbl:148] LIT-THISMAP (level: 5)
    private @Getter String litThismap = "CACTVWA";
    // [T-Up#INFO][COACTVWC.cbl:150] LIT-CCLISTPGM (level: 5)
    private @Getter String litCclistpgm = "COCRDLIC";
    // [T-Up#INFO][COACTVWC.cbl:152] LIT-CCLISTTRANID (level: 5)
    private @Getter String litCclisttranid = "CCLI";
    // [T-Up#INFO][COACTVWC.cbl:154] LIT-CCLISTMAPSET (level: 5)
    private @Getter String litCclistmapset = "COCRDLI";
    // [T-Up#INFO][COACTVWC.cbl:156] LIT-CCLISTMAP (level: 5)
    private @Getter String litCclistmap = "CCRDSLA";
    // [T-Up#INFO][COACTVWC.cbl:158] LIT-CARDUPDATEPGM (level: 5)
    private @Getter String litCardupdatepgm = "COCRDUPC";
    // [T-Up#INFO][COACTVWC.cbl:160] LIT-CARDUDPATETRANID (level: 5)
    private @Getter String litCardudpatetranid = "CCUP";
    // [T-Up#INFO][COACTVWC.cbl:162] LIT-CARDUPDATEMAPSET (level: 5)
    private @Getter String litCardupdatemapset = "COCRDUP ";
    // [T-Up#INFO][COACTVWC.cbl:164] LIT-CARDUPDATEMAP (level: 5)
    private @Getter String litCardupdatemap = "CCRDUPA";
    // [T-Up#INFO][COACTVWC.cbl:167] LIT-MENUPGM (level: 5)
    private @Getter String litMenupgm = "COMEN01C";
    // [T-Up#INFO][COACTVWC.cbl:169] LIT-MENUTRANID (level: 5)
    private @Getter String litMenutranid = "CM00";
    // [T-Up#INFO][COACTVWC.cbl:171] LIT-MENUMAPSET (level: 5)
    private @Getter String litMenumapset = "COMEN01";
    // [T-Up#INFO][COACTVWC.cbl:173] LIT-MENUMAP (level: 5)
    private @Getter String litMenumap = "COMEN1A";
    // [T-Up#INFO][COACTVWC.cbl:175] LIT-CARDDTLPGM (level: 5)
    private @Getter String litCarddtlpgm = "COCRDSLC";
    // [T-Up#INFO][COACTVWC.cbl:177] LIT-CARDDTLTRANID (level: 5)
    private @Getter String litCarddtltranid = "CCDL";
    // [T-Up#INFO][COACTVWC.cbl:179] LIT-CARDDTLMAPSET (level: 5)
    private @Getter String litCarddtlmapset = "COCRDSL";
    // [T-Up#INFO][COACTVWC.cbl:181] LIT-CARDDTLMAP (level: 5)
    private @Getter String litCarddtlmap = "CCRDSLA";
    // [T-Up#INFO][COACTVWC.cbl:183] LIT-ACCTFILENAME (level: 5)
    private @Getter String litAcctfilename = "ACCTDAT ";
    // [T-Up#INFO][COACTVWC.cbl:185] LIT-CARDFILENAME (level: 5)
    private @Getter String litCardfilename = "CARDDAT ";
    // [T-Up#INFO][COACTVWC.cbl:187] LIT-CUSTFILENAME (level: 5)
    private @Getter String litCustfilename = "CUSTDAT ";
    // [T-Up#INFO][COACTVWC.cbl:189] LIT-CARDFILENAME-ACCT-PATH (level: 5)
    private @Getter String litCardfilenameAcctPath = "CARDAIX ";
    // [T-Up#INFO][COACTVWC.cbl:191] LIT-CARDXREFNAME-ACCT-PATH (level: 5)
    private @Getter String litCardxrefnameAcctPath = "CXACAIX ";
    // [T-Up#INFO][COACTVWC.cbl:193] LIT-ALL-ALPHA-FROM (level: 5)
    private @Getter String litAllAlphaFrom = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    // [T-Up#INFO][COACTVWC.cbl:196] LIT-ALL-SPACES-TO (level: 5)
    private @Getter String litAllSpacesTo = StringUtils.repeat(' ', 52);
    // [T-Up#INFO][COACTVWC.cbl:198] LIT-UPPER (level: 5)
    private @Getter String litUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // [T-Up#INFO][COACTVWC.cbl:200] LIT-LOWER (level: 5)
    private @Getter String litLower = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getLitThispgm());
        sb.append(getLitThistranid());
        sb.append(getLitThismapset());
        sb.append(getLitThismap());
        sb.append(getLitCclistpgm());
        sb.append(getLitCclisttranid());
        sb.append(getLitCclistmapset());
        sb.append(getLitCclistmap());
        sb.append(getLitCardupdatepgm());
        sb.append(getLitCardudpatetranid());
        sb.append(getLitCardupdatemapset());
        sb.append(getLitCardupdatemap());
        sb.append(getLitMenupgm());
        sb.append(getLitMenutranid());
        sb.append(getLitMenumapset());
        sb.append(getLitMenumap());
        sb.append(getLitCarddtlpgm());
        sb.append(getLitCarddtltranid());
        sb.append(getLitCarddtlmapset());
        sb.append(getLitCarddtlmap());
        sb.append(getLitAcctfilename());
        sb.append(getLitCardfilename());
        sb.append(getLitCustfilename());
        sb.append(getLitCardfilenameAcctPath());
        sb.append(getLitCardxrefnameAcctPath());
        sb.append(getLitAllAlphaFrom());
        sb.append(getLitAllSpacesTo());
        sb.append(getLitUpper());
        sb.append(getLitLower());
        return sb.toString();
    }

    public void setLitThispgm(String source) {
        litThispgm = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitThistranid(String source) {
        litThistranid = StringUtils
                .truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setLitThismapset(String source) {
        litThismapset = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitThismap(String source) {
        litThismap = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCclistpgm(String source) {
        litCclistpgm = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCclisttranid(String source) {
        litCclisttranid = StringUtils.truncate(StringUtils.rightPad(source, 4),
                4);
    }

    public void setLitCclistmapset(String source) {
        litCclistmapset = StringUtils.truncate(StringUtils.rightPad(source, 7),
                7);
    }

    public void setLitCclistmap(String source) {
        litCclistmap = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCardupdatepgm(String source) {
        litCardupdatepgm = StringUtils.truncate(
                StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCardudpatetranid(String source) {
        litCardudpatetranid = StringUtils.truncate(
                StringUtils.rightPad(source, 4), 4);
    }

    public void setLitCardupdatemapset(String source) {
        litCardupdatemapset = StringUtils.truncate(
                StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCardupdatemap(String source) {
        litCardupdatemap = StringUtils.truncate(
                StringUtils.rightPad(source, 7), 7);
    }

    public void setLitMenupgm(String source) {
        litMenupgm = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitMenutranid(String source) {
        litMenutranid = StringUtils
                .truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setLitMenumapset(String source) {
        litMenumapset = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitMenumap(String source) {
        litMenumap = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCarddtlpgm(String source) {
        litCarddtlpgm = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCarddtltranid(String source) {
        litCarddtltranid = StringUtils.truncate(
                StringUtils.rightPad(source, 4), 4);
    }

    public void setLitCarddtlmapset(String source) {
        litCarddtlmapset = StringUtils.truncate(
                StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCarddtlmap(String source) {
        litCarddtlmap = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitAcctfilename(String source) {
        litAcctfilename = StringUtils.truncate(StringUtils.rightPad(source, 8),
                8);
    }

    public void setLitCardfilename(String source) {
        litCardfilename = StringUtils.truncate(StringUtils.rightPad(source, 8),
                8);
    }

    public void setLitCustfilename(String source) {
        litCustfilename = StringUtils.truncate(StringUtils.rightPad(source, 8),
                8);
    }

    public void setLitCardfilenameAcctPath(String source) {
        litCardfilenameAcctPath = StringUtils.truncate(
                StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCardxrefnameAcctPath(String source) {
        litCardxrefnameAcctPath = StringUtils.truncate(
                StringUtils.rightPad(source, 8), 8);
    }

    public void setLitAllAlphaFrom(String source) {
        litAllAlphaFrom = StringUtils.truncate(
                StringUtils.rightPad(source, 52), 52);
    }

    public void setLitAllSpacesTo(String source) {
        litAllSpacesTo = StringUtils.truncate(StringUtils.rightPad(source, 52),
                52);
    }

    public void setLitUpper(String source) {
        litUpper = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }

    public void setLitLower(String source) {
        litLower = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }
}
