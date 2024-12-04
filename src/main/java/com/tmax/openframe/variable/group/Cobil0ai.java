package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:15 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item COBIL0AI</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class Cobil0ai {
    // [T-Up#INFO][COBIL00.CPY:19] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_1 = StringUtils.repeat(' ',
            12);
    // [T-Up#INFO][COBIL00.CPY:20] TRNNAMEL (level: 2)
    private @Getter @Setter int trnnamel;
    // [T-Up#INFO][COBIL00.CPY:21] TRNNAMEF (level: 2)
    private @Getter @Builder.Default String trnnamef = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:24] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_2 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:25] TRNNAMEI (level: 2)
    private @Getter @Builder.Default String trnnamei = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:26] TITLE01L (level: 2)
    private @Getter @Setter int title01l;
    // [T-Up#INFO][COBIL00.CPY:27] TITLE01F (level: 2)
    private @Getter @Builder.Default String title01f = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:30] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_3 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:31] TITLE01I (level: 2)
    private @Getter @Builder.Default String title01i = StringUtils.repeat(' ',
            40);
    // [T-Up#INFO][COBIL00.CPY:32] CURDATEL (level: 2)
    private @Getter @Setter int curdatel;
    // [T-Up#INFO][COBIL00.CPY:33] CURDATEF (level: 2)
    private @Getter @Builder.Default String curdatef = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:36] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_4 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:37] CURDATEI (level: 2)
    private @Getter @Builder.Default String curdatei = StringUtils.repeat(' ',
            8);
    // [T-Up#INFO][COBIL00.CPY:38] PGMNAMEL (level: 2)
    private @Getter @Setter int pgmnamel;
    // [T-Up#INFO][COBIL00.CPY:39] PGMNAMEF (level: 2)
    private @Getter @Builder.Default String pgmnamef = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:42] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_5 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:43] PGMNAMEI (level: 2)
    private @Getter @Builder.Default String pgmnamei = StringUtils.repeat(' ',
            8);
    // [T-Up#INFO][COBIL00.CPY:44] TITLE02L (level: 2)
    private @Getter @Setter int title02l;
    // [T-Up#INFO][COBIL00.CPY:45] TITLE02F (level: 2)
    private @Getter @Builder.Default String title02f = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:48] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_6 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:49] TITLE02I (level: 2)
    private @Getter @Builder.Default String title02i = StringUtils.repeat(' ',
            40);
    // [T-Up#INFO][COBIL00.CPY:50] CURTIMEL (level: 2)
    private @Getter @Setter int curtimel;
    // [T-Up#INFO][COBIL00.CPY:51] CURTIMEF (level: 2)
    private @Getter @Builder.Default String curtimef = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:54] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_7 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:55] CURTIMEI (level: 2)
    private @Getter @Builder.Default String curtimei = StringUtils.repeat(' ',
            8);
    // [T-Up#INFO][COBIL00.CPY:56] ACTIDINL (level: 2)
    private @Getter @Setter int actidinl;
    // [T-Up#INFO][COBIL00.CPY:57] ACTIDINF (level: 2)
    private @Getter @Builder.Default String actidinf = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:60] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_8 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:61] ACTIDINI (level: 2)
    private @Getter @Builder.Default String actidini = StringUtils.repeat(' ',
            11);
    // [T-Up#INFO][COBIL00.CPY:62] CURBALL (level: 2)
    private @Getter @Setter int curball;
    // [T-Up#INFO][COBIL00.CPY:63] CURBALF (level: 2)
    private @Getter @Builder.Default String curbalf = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COBIL00.CPY:66] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_9 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:67] CURBALI (level: 2)
    private @Getter @Builder.Default String curbali = StringUtils.repeat(' ',
            14);
    // [T-Up#INFO][COBIL00.CPY:68] CONFIRML (level: 2)
    private @Getter @Setter int confirml;
    // [T-Up#INFO][COBIL00.CPY:69] CONFIRMF (level: 2)
    private @Getter @Builder.Default String confirmf = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:72] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_10 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:73] CONFIRMI (level: 2)
    private @Getter @Builder.Default String confirmi = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COBIL00.CPY:74] ERRMSGL (level: 2)
    private @Getter @Setter int errmsgl;
    // [T-Up#INFO][COBIL00.CPY:75] ERRMSGF (level: 2)
    private @Getter @Builder.Default String errmsgf = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COBIL00.CPY:78] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_11 = StringUtils.repeat(' ',
            4);
    // [T-Up#INFO][COBIL00.CPY:79] ERRMSGI (level: 2)
    private @Getter @Builder.Default String errmsgi = StringUtils.repeat(' ',
            78);

    public static Cobil0ai createDefaultValueInstance() {
        return new Cobil0ai.builder().build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 294), 294);
        setFILLER_1(source.substring(0, 12));
        try {
            setTrnnamel(CobStream.convStringToShort(source.substring(12, 14)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTrnnamel(0);
        }
        setTrnnamef(source.substring(14, 15));
        setFILLER_2(source.substring(15, 19));
        setTrnnamei(source.substring(19, 23));
        try {
            setTitle01l(CobStream.convStringToShort(source.substring(23, 25)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTitle01l(0);
        }
        setTitle01f(source.substring(25, 26));
        setFILLER_3(source.substring(26, 30));
        setTitle01i(source.substring(30, 70));
        try {
            setCurdatel(CobStream.convStringToShort(source.substring(70, 72)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCurdatel(0);
        }
        setCurdatef(source.substring(72, 73));
        setFILLER_4(source.substring(73, 77));
        setCurdatei(source.substring(77, 85));
        try {
            setPgmnamel(CobStream.convStringToShort(source.substring(85, 87)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setPgmnamel(0);
        }
        setPgmnamef(source.substring(87, 88));
        setFILLER_5(source.substring(88, 92));
        setPgmnamei(source.substring(92, 100));
        try {
            setTitle02l(CobStream.convStringToShort(source.substring(100, 102)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTitle02l(0);
        }
        setTitle02f(source.substring(102, 103));
        setFILLER_6(source.substring(103, 107));
        setTitle02i(source.substring(107, 147));
        try {
            setCurtimel(CobStream.convStringToShort(source.substring(147, 149)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCurtimel(0);
        }
        setCurtimef(source.substring(149, 150));
        setFILLER_7(source.substring(150, 154));
        setCurtimei(source.substring(154, 162));
        try {
            setActidinl(CobStream.convStringToShort(source.substring(162, 164)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setActidinl(0);
        }
        setActidinf(source.substring(164, 165));
        setFILLER_8(source.substring(165, 169));
        setActidini(source.substring(169, 180));
        try {
            setCurball(CobStream.convStringToShort(source.substring(180, 182)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCurball(0);
        }
        setCurbalf(source.substring(182, 183));
        setFILLER_9(source.substring(183, 187));
        setCurbali(source.substring(187, 201));
        try {
            setConfirml(CobStream.convStringToShort(source.substring(201, 203)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setConfirml(0);
        }
        setConfirmf(source.substring(203, 204));
        setFILLER_10(source.substring(204, 208));
        setConfirmi(source.substring(208, 209));
        try {
            setErrmsgl(CobStream.convStringToShort(source.substring(209, 211)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setErrmsgl(0);
        }
        setErrmsgf(source.substring(211, 212));
        setFILLER_11(source.substring(212, 216));
        setErrmsgi(source.substring(216, 294));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(CobStream.convShortToString((short) getTrnnamel()));
        sb.append(getTrnnamef());
        sb.append(getFILLER_2());
        sb.append(getTrnnamei());
        sb.append(CobStream.convShortToString((short) getTitle01l()));
        sb.append(getTitle01f());
        sb.append(getFILLER_3());
        sb.append(getTitle01i());
        sb.append(CobStream.convShortToString((short) getCurdatel()));
        sb.append(getCurdatef());
        sb.append(getFILLER_4());
        sb.append(getCurdatei());
        sb.append(CobStream.convShortToString((short) getPgmnamel()));
        sb.append(getPgmnamef());
        sb.append(getFILLER_5());
        sb.append(getPgmnamei());
        sb.append(CobStream.convShortToString((short) getTitle02l()));
        sb.append(getTitle02f());
        sb.append(getFILLER_6());
        sb.append(getTitle02i());
        sb.append(CobStream.convShortToString((short) getCurtimel()));
        sb.append(getCurtimef());
        sb.append(getFILLER_7());
        sb.append(getCurtimei());
        sb.append(CobStream.convShortToString((short) getActidinl()));
        sb.append(getActidinf());
        sb.append(getFILLER_8());
        sb.append(getActidini());
        sb.append(CobStream.convShortToString((short) getCurball()));
        sb.append(getCurbalf());
        sb.append(getFILLER_9());
        sb.append(getCurbali());
        sb.append(CobStream.convShortToString((short) getConfirml()));
        sb.append(getConfirmf());
        sb.append(getFILLER_10());
        sb.append(getConfirmi());
        sb.append(CobStream.convShortToString((short) getErrmsgl()));
        sb.append(getErrmsgf());
        sb.append(getFILLER_11());
        sb.append(getErrmsgi());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFILLER_1());
        sb.append(String.valueOf(getTrnnamel()));
        sb.append(getTrnnamef());
        sb.append(getFILLER_2());
        sb.append(getTrnnamei());
        sb.append(String.valueOf(getTitle01l()));
        sb.append(getTitle01f());
        sb.append(getFILLER_3());
        sb.append(getTitle01i());
        sb.append(String.valueOf(getCurdatel()));
        sb.append(getCurdatef());
        sb.append(getFILLER_4());
        sb.append(getCurdatei());
        sb.append(String.valueOf(getPgmnamel()));
        sb.append(getPgmnamef());
        sb.append(getFILLER_5());
        sb.append(getPgmnamei());
        sb.append(String.valueOf(getTitle02l()));
        sb.append(getTitle02f());
        sb.append(getFILLER_6());
        sb.append(getTitle02i());
        sb.append(String.valueOf(getCurtimel()));
        sb.append(getCurtimef());
        sb.append(getFILLER_7());
        sb.append(getCurtimei());
        sb.append(String.valueOf(getActidinl()));
        sb.append(getActidinf());
        sb.append(getFILLER_8());
        sb.append(getActidini());
        sb.append(String.valueOf(getCurball()));
        sb.append(getCurbalf());
        sb.append(getFILLER_9());
        sb.append(getCurbali());
        sb.append(String.valueOf(getConfirml()));
        sb.append(getConfirmf());
        sb.append(getFILLER_10());
        sb.append(getConfirmi());
        sb.append(String.valueOf(getErrmsgl()));
        sb.append(getErrmsgf());
        sb.append(getFILLER_11());
        sb.append(getErrmsgi());
        return sb.toString();
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
    }

    public void setTrnnamef(String source) {
        trnnamef = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_2 getFILLER_REDEFINE_2() {
        return _FILLER_REDEFINE_2.builder().trnnamea(getTrnnamea()).build();
    }

    public void setFILLER_REDEFINE_2(String source) {
        setTrnnamea(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_2(_FILLER_REDEFINE_2 source) {
        setFILLER_REDEFINE_2(source.get());
    }

    public String getTrnnamea() {
        return getTrnnamef();
    }

    public void setTrnnamea(String source) {
        setTrnnamef(source);
    }

    public void setFILLER_2(String source) {
        FILLER_2 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setTrnnamei(String source) {
        trnnamei = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setTitle01f(String source) {
        title01f = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_4 getFILLER_REDEFINE_4() {
        return _FILLER_REDEFINE_4.builder().title01a(getTitle01a()).build();
    }

    public void setFILLER_REDEFINE_4(String source) {
        setTitle01a(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_4(_FILLER_REDEFINE_4 source) {
        setFILLER_REDEFINE_4(source.get());
    }

    public String getTitle01a() {
        return getTitle01f();
    }

    public void setTitle01a(String source) {
        setTitle01f(source);
    }

    public void setFILLER_3(String source) {
        FILLER_3 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setTitle01i(String source) {
        title01i = StringUtils.truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setCurdatef(String source) {
        curdatef = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_6 getFILLER_REDEFINE_6() {
        return _FILLER_REDEFINE_6.builder().curdatea(getCurdatea()).build();
    }

    public void setFILLER_REDEFINE_6(String source) {
        setCurdatea(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_6(_FILLER_REDEFINE_6 source) {
        setFILLER_REDEFINE_6(source.get());
    }

    public String getCurdatea() {
        return getCurdatef();
    }

    public void setCurdatea(String source) {
        setCurdatef(source);
    }

    public void setFILLER_4(String source) {
        FILLER_4 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setCurdatei(String source) {
        curdatei = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setPgmnamef(String source) {
        pgmnamef = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_8 getFILLER_REDEFINE_8() {
        return _FILLER_REDEFINE_8.builder().pgmnamea(getPgmnamea()).build();
    }

    public void setFILLER_REDEFINE_8(String source) {
        setPgmnamea(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_8(_FILLER_REDEFINE_8 source) {
        setFILLER_REDEFINE_8(source.get());
    }

    public String getPgmnamea() {
        return getPgmnamef();
    }

    public void setPgmnamea(String source) {
        setPgmnamef(source);
    }

    public void setFILLER_5(String source) {
        FILLER_5 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setPgmnamei(String source) {
        pgmnamei = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setTitle02f(String source) {
        title02f = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_10 getFILLER_REDEFINE_10() {
        return _FILLER_REDEFINE_10.builder().title02a(getTitle02a()).build();
    }

    public void setFILLER_REDEFINE_10(String source) {
        setTitle02a(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_10(_FILLER_REDEFINE_10 source) {
        setFILLER_REDEFINE_10(source.get());
    }

    public String getTitle02a() {
        return getTitle02f();
    }

    public void setTitle02a(String source) {
        setTitle02f(source);
    }

    public void setFILLER_6(String source) {
        FILLER_6 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setTitle02i(String source) {
        title02i = StringUtils.truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setCurtimef(String source) {
        curtimef = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_12 getFILLER_REDEFINE_12() {
        return _FILLER_REDEFINE_12.builder().curtimea(getCurtimea()).build();
    }

    public void setFILLER_REDEFINE_12(String source) {
        setCurtimea(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_12(_FILLER_REDEFINE_12 source) {
        setFILLER_REDEFINE_12(source.get());
    }

    public String getCurtimea() {
        return getCurtimef();
    }

    public void setCurtimea(String source) {
        setCurtimef(source);
    }

    public void setFILLER_7(String source) {
        FILLER_7 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setCurtimei(String source) {
        curtimei = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setActidinf(String source) {
        actidinf = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_14 getFILLER_REDEFINE_14() {
        return _FILLER_REDEFINE_14.builder().actidina(getActidina()).build();
    }

    public void setFILLER_REDEFINE_14(String source) {
        setActidina(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_14(_FILLER_REDEFINE_14 source) {
        setFILLER_REDEFINE_14(source.get());
    }

    public String getActidina() {
        return getActidinf();
    }

    public void setActidina(String source) {
        setActidinf(source);
    }

    public void setFILLER_8(String source) {
        FILLER_8 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setActidini(String source) {
        actidini = StringUtils.truncate(StringUtils.rightPad(source, 11), 11);
    }

    public void setCurbalf(String source) {
        curbalf = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_16 getFILLER_REDEFINE_16() {
        return _FILLER_REDEFINE_16.builder().curbala(getCurbala()).build();
    }

    public void setFILLER_REDEFINE_16(String source) {
        setCurbala(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_16(_FILLER_REDEFINE_16 source) {
        setFILLER_REDEFINE_16(source.get());
    }

    public String getCurbala() {
        return getCurbalf();
    }

    public void setCurbala(String source) {
        setCurbalf(source);
    }

    public void setFILLER_9(String source) {
        FILLER_9 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setCurbali(String source) {
        curbali = StringUtils.truncate(StringUtils.rightPad(source, 14), 14);
    }

    public void setConfirmf(String source) {
        confirmf = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_18 getFILLER_REDEFINE_18() {
        return _FILLER_REDEFINE_18.builder().confirma(getConfirma()).build();
    }

    public void setFILLER_REDEFINE_18(String source) {
        setConfirma(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_18(_FILLER_REDEFINE_18 source) {
        setFILLER_REDEFINE_18(source.get());
    }

    public String getConfirma() {
        return getConfirmf();
    }

    public void setConfirma(String source) {
        setConfirmf(source);
    }

    public void setFILLER_10(String source) {
        FILLER_10 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setConfirmi(String source) {
        confirmi = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setErrmsgf(String source) {
        errmsgf = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public _FILLER_REDEFINE_20 getFILLER_REDEFINE_20() {
        return _FILLER_REDEFINE_20.builder().errmsga(getErrmsga()).build();
    }

    public void setFILLER_REDEFINE_20(String source) {
        setErrmsga(source.substring(0, 1));
    }

    public void setFILLER_REDEFINE_20(_FILLER_REDEFINE_20 source) {
        setFILLER_REDEFINE_20(source.get());
    }

    public String getErrmsga() {
        return getErrmsgf();
    }

    public void setErrmsga(String source) {
        setErrmsgf(source);
    }

    public void setFILLER_11(String source) {
        FILLER_11 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setErrmsgi(String source) {
        errmsgi = StringUtils.truncate(StringUtils.rightPad(source, 78), 78);
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_2 {
        // [T-Up#INFO][COBIL00.CPY:23] TRNNAMEA (level: 3)
        private @Getter @Builder.Default String trnnamea = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(trnnamea);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getTrnnamea());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_4 {
        // [T-Up#INFO][COBIL00.CPY:29] TITLE01A (level: 3)
        private @Getter @Builder.Default String title01a = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(title01a);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getTitle01a());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_6 {
        // [T-Up#INFO][COBIL00.CPY:35] CURDATEA (level: 3)
        private @Getter @Builder.Default String curdatea = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(curdatea);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCurdatea());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_8 {
        // [T-Up#INFO][COBIL00.CPY:41] PGMNAMEA (level: 3)
        private @Getter @Builder.Default String pgmnamea = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(pgmnamea);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getPgmnamea());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_10 {
        // [T-Up#INFO][COBIL00.CPY:47] TITLE02A (level: 3)
        private @Getter @Builder.Default String title02a = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(title02a);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getTitle02a());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_12 {
        // [T-Up#INFO][COBIL00.CPY:53] CURTIMEA (level: 3)
        private @Getter @Builder.Default String curtimea = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(curtimea);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCurtimea());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_14 {
        // [T-Up#INFO][COBIL00.CPY:59] ACTIDINA (level: 3)
        private @Getter @Builder.Default String actidina = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(actidina);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getActidina());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_16 {
        // [T-Up#INFO][COBIL00.CPY:65] CURBALA (level: 3)
        private @Getter @Builder.Default String curbala = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(curbala);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCurbala());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_18 {
        // [T-Up#INFO][COBIL00.CPY:71] CONFIRMA (level: 3)
        private @Getter @Builder.Default String confirma = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(confirma);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getConfirma());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_20 {
        // [T-Up#INFO][COBIL00.CPY:77] ERRMSGA (level: 3)
        private @Getter @Builder.Default String errmsga = StringUtils.repeat(
                ' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(errmsga);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getErrmsga());
            return sb.toString();
        }
    }
}