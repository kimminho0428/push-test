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
 * <p>  Generation date : 2024/03/20 15:15:17 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CarddemoMainMenuOptions {
    // [T-Up#INFO][COMEN02Y.cpy:22] CDEMO-MENU-OPT-COUNT (level: 5)
    private @Getter @Setter @Builder.Default int cdemoMenuOptCount = 10;
    // [T-Up#INFO][COMEN02Y.cpy:78] CDEMO-MENU-OPTIONS (level: 5)
    private @Getter @Setter @Builder.Default CdemoMenuOptions cdemoMenuOptions = new CdemoMenuOptions();

    public static CarddemoMainMenuOptions createDefaultValueInstance() {
        return new CarddemoMainMenuOptions.builder()
                .cdemoMenuOptCount(0)
                .cdemoMenuOptions(CdemoMenuOptions.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 462), 462);
        try {
            setCdemoMenuOptCount(CobStream.convZonedStringToInt(
                    source.substring(0, 2), 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCdemoMenuOptCount(0);
        }
        getCdemoMenuOptions().set(source.substring(462, 922));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(CobStream.convZonedIntToString(getCdemoMenuOptCount(), 2));
        sb.append(getCdemoMenuOptions().get());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getCdemoMenuOptCount(), "00"));
        sb.append(getCdemoMenuOptions().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoMenuOptions {
        // [T-Up#INFO][COMEN02Y.cpy:79] CDEMO-MENU-OPT (level: 10)
        private @Getter @Setter @Builder.Default CdemoMenuOpt cdemoMenuOpt = new CdemoMenuOpt();

        public static CdemoMenuOptions createDefaultValueInstance() {
            return new CdemoMenuOptions.builder().cdemoMenuOpt(
                    CdemoMenuOpt.createDefaultValueInstance()).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 460),
                    460);
            getCdemoMenuOpt().set(source.substring(0, 460));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoMenuOpt().get());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoMenuOpt().toString());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoMenuOpt {
        // [T-Up#INFO][COMEN02Y.cpy:80] CDEMO-MENU-OPT-NUM (level: 15)
        private @Getter @Setter @Builder.Default int[] cdemoMenuOptNum = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // [T-Up#INFO][COMEN02Y.cpy:81] CDEMO-MENU-OPT-NAME (level: 15)
        private @Getter @Setter @Builder.Default String[] cdemoMenuOptName = new String[] {
                "Account View                       ",
                "Account Update                     ",
                "Credit Card List                   ",
                "Credit Card View                   ",
                "Credit Card Update                 ",
                "Transaction List                   ",
                "Transaction View                   ",
                "Transaction Add                    ",
                "Transaction Reports                ",
                "Bill Payment                       " };
        // [T-Up#INFO][COMEN02Y.cpy:82] CDEMO-MENU-OPT-PGMNAME (level: 15)
        private @Getter @Setter @Builder.Default String[] cdemoMenuOptPgmname = new String[] {
                "COACTVWC", "COACTUPC", "COCRDLIC", "COCRDSLC", "COCRDUPC",
                "COTRN00C", "COTRN01C", "COTRN02C", "CORPT00C", "COBIL00C" };
        // [T-Up#INFO][COMEN02Y.cpy:83] CDEMO-MENU-OPT-USRTYPE (level: 15)
        private @Getter @Setter @Builder.Default String[] cdemoMenuOptUsrtype = new String[] {
                "U", "U", "U", "U", "U", "U", "U", "U", "U", "U" };

        public static CdemoMenuOpt createDefaultValueInstance() {
            return new CdemoMenuOpt.builder()
                    .cdemoMenuOptNum(new int[10])
                    .cdemoMenuOptName(
                            Collections
                                    .nCopies(10, StringUtils.repeat(' ', 35))
                                    .toArray(new String[0]))
                    .cdemoMenuOptPgmname(
                            Collections.nCopies(10, StringUtils.repeat(' ', 8))
                                    .toArray(new String[0]))
                    .cdemoMenuOptUsrtype(
                            Collections.nCopies(10, StringUtils.repeat(' ', 1))
                                    .toArray(new String[0])).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 460),
                    460);
            setCdemoMenuOptNum(CobStream.convZonedStringToInt(
                    source.substring(0, 20), 10, 2));
            setCdemoMenuOptName(source.split("(?<=\\G.{35})"));
            setCdemoMenuOptPgmname(source.split("(?<=\\G.{8})"));
            setCdemoMenuOptUsrtype(source.split("(?<=\\G.{1})"));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(CobStream.convZonedIntToString(getCdemoMenuOptNum(), 2));
            sb.append(Arrays.stream(getCdemoMenuOptName()).collect(
                    Collectors.joining()));
            sb.append(Arrays.stream(getCdemoMenuOptPgmname()).collect(
                    Collectors.joining()));
            sb.append(Arrays.stream(getCdemoMenuOptUsrtype()).collect(
                    Collectors.joining()));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.join("", Arrays.stream(getCdemoMenuOptNum())
                    .mapToObj(String::valueOf).toArray(String[]::new)));
            sb.append(String.join("", getCdemoMenuOptName()));
            sb.append(String.join("", getCdemoMenuOptPgmname()));
            sb.append(String.join("", getCdemoMenuOptUsrtype()));
            return sb.toString();
        }

        public int getCdemoMenuOptNum(int index) {
            return cdemoMenuOptNum[index];
        }

        public void setCdemoMenuOptNum(int index, int source) {
            cdemoMenuOptNum[index] = source;
        }

        public String getCdemoMenuOptName(int index) {
            return cdemoMenuOptName[index];
        }

        public void setCdemoMenuOptName(int index, String source) {
            cdemoMenuOptName[index] = source;
        }

        public String getCdemoMenuOptPgmname(int index) {
            return cdemoMenuOptPgmname[index];
        }

        public void setCdemoMenuOptPgmname(int index, String source) {
            cdemoMenuOptPgmname[index] = source;
        }

        public String getCdemoMenuOptUsrtype(int index) {
            return cdemoMenuOptUsrtype[index];
        }

        public void setCdemoMenuOptUsrtype(int index, String source) {
            cdemoMenuOptUsrtype[index] = source;
        }
    }
}
