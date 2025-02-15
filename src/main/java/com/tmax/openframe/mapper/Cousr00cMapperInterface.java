package com.tmax.openframe.mapper;

import com.tmax.openframe.DataConverter;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;
import org.mapstruct.factory.*;
import com.tmax.openframe.variable.group.Cousr00cCarddemoCommarea;
import com.tmax.openframe.variable.group.Cosgn00cDfhcommarea;
import com.tmax.openframe.variable.group.Coadm01cDfhcommarea;
import com.tmax.openframe.variable.group.Cousr00cDfhcommarea;
import com.tmax.openframe.variable.group.Cousr03cDfhcommarea;
import com.tmax.openframe.variable.group.SecUserData;
import com.tmax.openframe.dto.AwsM2CarddemoUsrsecVsamKsdsDto;
import com.tmax.openframe.variable.group.Cousr02cDfhcommarea;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:19 KST</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cousr00cMapperInterface {
    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr00cCarddemoCommarea}</li>
     * <li>target class: {@link Cosgn00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr00cCarddemoCommareaToCosgn00cDfhcommarea {
        Cousr00cCarddemoCommareaToCosgn00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr00cCarddemoCommareaToCosgn00cDfhcommarea.class);

        Cosgn00cDfhcommarea toTarget(Cousr00cCarddemoCommarea source);

        Cousr00cCarddemoCommarea toSource(Cosgn00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr00cCarddemoCommarea source,
                @MappingTarget Cosgn00cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu00Info().getCdemoCu00UsridFirst()
                    + source.getCdemoCu00Info().getCdemoCu00UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu00Info().getCdemoCu00PageNum(), 8)
                    + source.getCdemoCu00Info().getCdemoCu00NextPageFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cosgn00cDfhcommarea source,
                @MappingTarget Cousr00cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    StringUtils.substring(source.getLkCommarea(), 0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    StringUtils.substring(source.getLkCommarea(), 4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    StringUtils.substring(source.getLkCommarea(), 12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    StringUtils.substring(source.getLkCommarea(), 16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    StringUtils.substring(source.getLkCommarea(), 24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    StringUtils.substring(source.getLkCommarea(), 32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    StringUtils.substring(source.getLkCommarea(), 43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    StringUtils.substring(source.getLkCommarea(), 68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    StringUtils.substring(source.getLkCommarea(), 93, 118));
            try {
                target.getCdemoAccountInfo().setCdemoAcctId(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 118, 129),
                                11));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    StringUtils.substring(source.getLkCommarea(), 129, 130));
            try {
                target.getCdemoCardInfo().setCdemoCardNum(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 130, 146),
                                16));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoMoreInfo().setCdemoLastMap(
                    StringUtils.substring(source.getLkCommarea(), 146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    StringUtils.substring(source.getLkCommarea(), 153, 160));
            target.getCdemoCu00Info().setCdemoCu00UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu00Info().setCdemoCu00UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu00Info().setCdemoCu00PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu00Info().setCdemoCu00NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu00Info().setCdemoCu00UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu00Info().setCdemoCu00UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr00cCarddemoCommarea}</li>
     * <li>target class: {@link Coadm01cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr00cCarddemoCommareaToCoadm01cDfhcommarea {
        Cousr00cCarddemoCommareaToCoadm01cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr00cCarddemoCommareaToCoadm01cDfhcommarea.class);

        Coadm01cDfhcommarea toTarget(Cousr00cCarddemoCommarea source);

        Cousr00cCarddemoCommarea toSource(Coadm01cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr00cCarddemoCommarea source,
                @MappingTarget Coadm01cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu00Info().getCdemoCu00UsridFirst()
                    + source.getCdemoCu00Info().getCdemoCu00UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu00Info().getCdemoCu00PageNum(), 8)
                    + source.getCdemoCu00Info().getCdemoCu00NextPageFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelected());
        }

        @AfterMapping
        default void makeSource(Coadm01cDfhcommarea source,
                @MappingTarget Cousr00cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    StringUtils.substring(source.getLkCommarea(), 0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    StringUtils.substring(source.getLkCommarea(), 4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    StringUtils.substring(source.getLkCommarea(), 12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    StringUtils.substring(source.getLkCommarea(), 16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    StringUtils.substring(source.getLkCommarea(), 24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    StringUtils.substring(source.getLkCommarea(), 32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    StringUtils.substring(source.getLkCommarea(), 43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    StringUtils.substring(source.getLkCommarea(), 68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    StringUtils.substring(source.getLkCommarea(), 93, 118));
            try {
                target.getCdemoAccountInfo().setCdemoAcctId(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 118, 129),
                                11));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    StringUtils.substring(source.getLkCommarea(), 129, 130));
            try {
                target.getCdemoCardInfo().setCdemoCardNum(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 130, 146),
                                16));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoMoreInfo().setCdemoLastMap(
                    StringUtils.substring(source.getLkCommarea(), 146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    StringUtils.substring(source.getLkCommarea(), 153, 160));
            target.getCdemoCu00Info().setCdemoCu00UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu00Info().setCdemoCu00UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu00Info().setCdemoCu00PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu00Info().setCdemoCu00NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu00Info().setCdemoCu00UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu00Info().setCdemoCu00UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr00cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr00cCarddemoCommareaToCousr00cDfhcommarea {
        Cousr00cCarddemoCommareaToCousr00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr00cCarddemoCommareaToCousr00cDfhcommarea.class);

        Cousr00cDfhcommarea toTarget(Cousr00cCarddemoCommarea source);

        Cousr00cCarddemoCommarea toSource(Cousr00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr00cCarddemoCommarea source,
                @MappingTarget Cousr00cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu00Info().getCdemoCu00UsridFirst()
                    + source.getCdemoCu00Info().getCdemoCu00UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu00Info().getCdemoCu00PageNum(), 8)
                    + source.getCdemoCu00Info().getCdemoCu00NextPageFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr00cDfhcommarea source,
                @MappingTarget Cousr00cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    StringUtils.substring(source.getLkCommarea(), 0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    StringUtils.substring(source.getLkCommarea(), 4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    StringUtils.substring(source.getLkCommarea(), 12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    StringUtils.substring(source.getLkCommarea(), 16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    StringUtils.substring(source.getLkCommarea(), 24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    StringUtils.substring(source.getLkCommarea(), 32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    StringUtils.substring(source.getLkCommarea(), 43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    StringUtils.substring(source.getLkCommarea(), 68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    StringUtils.substring(source.getLkCommarea(), 93, 118));
            try {
                target.getCdemoAccountInfo().setCdemoAcctId(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 118, 129),
                                11));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    StringUtils.substring(source.getLkCommarea(), 129, 130));
            try {
                target.getCdemoCardInfo().setCdemoCardNum(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 130, 146),
                                16));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoMoreInfo().setCdemoLastMap(
                    StringUtils.substring(source.getLkCommarea(), 146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    StringUtils.substring(source.getLkCommarea(), 153, 160));
            target.getCdemoCu00Info().setCdemoCu00UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu00Info().setCdemoCu00UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu00Info().setCdemoCu00PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu00Info().setCdemoCu00NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu00Info().setCdemoCu00UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu00Info().setCdemoCu00UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr00cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr03cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr00cCarddemoCommareaToCousr03cDfhcommarea {
        Cousr00cCarddemoCommareaToCousr03cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr00cCarddemoCommareaToCousr03cDfhcommarea.class);

        Cousr03cDfhcommarea toTarget(Cousr00cCarddemoCommarea source);

        Cousr00cCarddemoCommarea toSource(Cousr03cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr00cCarddemoCommarea source,
                @MappingTarget Cousr03cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu00Info().getCdemoCu00UsridFirst()
                    + source.getCdemoCu00Info().getCdemoCu00UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu00Info().getCdemoCu00PageNum(), 8)
                    + source.getCdemoCu00Info().getCdemoCu00NextPageFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr03cDfhcommarea source,
                @MappingTarget Cousr00cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    StringUtils.substring(source.getLkCommarea(), 0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    StringUtils.substring(source.getLkCommarea(), 4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    StringUtils.substring(source.getLkCommarea(), 12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    StringUtils.substring(source.getLkCommarea(), 16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    StringUtils.substring(source.getLkCommarea(), 24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    StringUtils.substring(source.getLkCommarea(), 32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    StringUtils.substring(source.getLkCommarea(), 43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    StringUtils.substring(source.getLkCommarea(), 68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    StringUtils.substring(source.getLkCommarea(), 93, 118));
            try {
                target.getCdemoAccountInfo().setCdemoAcctId(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 118, 129),
                                11));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    StringUtils.substring(source.getLkCommarea(), 129, 130));
            try {
                target.getCdemoCardInfo().setCdemoCardNum(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 130, 146),
                                16));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoMoreInfo().setCdemoLastMap(
                    StringUtils.substring(source.getLkCommarea(), 146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    StringUtils.substring(source.getLkCommarea(), 153, 160));
            target.getCdemoCu00Info().setCdemoCu00UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu00Info().setCdemoCu00UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu00Info().setCdemoCu00PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu00Info().setCdemoCu00NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu00Info().setCdemoCu00UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu00Info().setCdemoCu00UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link SecUserData}</li>
     * <li>target class: {@link AwsM2CarddemoUsrsecVsamKsdsDto}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface SecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto {
        SecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto INSTANCE = Mappers
                .getMapper(SecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto.class);

        @Mapping(source = "secUsrId", target = "secUsrId")
        @Mapping(source = "secUsrFname", target = "secUsrFname")
        @Mapping(source = "secUsrLname", target = "secUsrLname")
        @Mapping(source = "secUsrPwd", target = "secUsrPwd")
        @Mapping(source = "secUsrType", target = "secUsrType")
        @Mapping(source = "secUsrFiller", target = "secUsrFiller")
        AwsM2CarddemoUsrsecVsamKsdsDto toTarget(SecUserData source);

        @Mapping(source = "secUsrId", target = "secUsrId")
        @Mapping(source = "secUsrFname", target = "secUsrFname")
        @Mapping(source = "secUsrLname", target = "secUsrLname")
        @Mapping(source = "secUsrPwd", target = "secUsrPwd")
        @Mapping(source = "secUsrType", target = "secUsrType")
        @Mapping(source = "secUsrFiller", target = "secUsrFiller")
        SecUserData toSource(AwsM2CarddemoUsrsecVsamKsdsDto source);
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr00cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr02cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr00cCarddemoCommareaToCousr02cDfhcommarea {
        Cousr00cCarddemoCommareaToCousr02cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr00cCarddemoCommareaToCousr02cDfhcommarea.class);

        Cousr02cDfhcommarea toTarget(Cousr00cCarddemoCommarea source);

        Cousr00cCarddemoCommarea toSource(Cousr02cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr00cCarddemoCommarea source,
                @MappingTarget Cousr02cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu00Info().getCdemoCu00UsridFirst()
                    + source.getCdemoCu00Info().getCdemoCu00UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu00Info().getCdemoCu00PageNum(), 8)
                    + source.getCdemoCu00Info().getCdemoCu00NextPageFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelFlg()
                    + source.getCdemoCu00Info().getCdemoCu00UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr02cDfhcommarea source,
                @MappingTarget Cousr00cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    StringUtils.substring(source.getLkCommarea(), 0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    StringUtils.substring(source.getLkCommarea(), 4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    StringUtils.substring(source.getLkCommarea(), 12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    StringUtils.substring(source.getLkCommarea(), 16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    StringUtils.substring(source.getLkCommarea(), 24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    StringUtils.substring(source.getLkCommarea(), 32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    StringUtils.substring(source.getLkCommarea(), 43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    StringUtils.substring(source.getLkCommarea(), 68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    StringUtils.substring(source.getLkCommarea(), 93, 118));
            try {
                target.getCdemoAccountInfo().setCdemoAcctId(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 118, 129),
                                11));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    StringUtils.substring(source.getLkCommarea(), 129, 130));
            try {
                target.getCdemoCardInfo().setCdemoCardNum(
                        DataConverter.convZonedStringToLong(StringUtils
                                .substring(source.getLkCommarea(), 130, 146),
                                16));
            } catch (Exception e) {
                e.printStackTrace();
            }
            target.getCdemoMoreInfo().setCdemoLastMap(
                    StringUtils.substring(source.getLkCommarea(), 146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    StringUtils.substring(source.getLkCommarea(), 153, 160));
            target.getCdemoCu00Info().setCdemoCu00UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu00Info().setCdemoCu00UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu00Info().setCdemoCu00PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu00Info().setCdemoCu00NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu00Info().setCdemoCu00UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu00Info().setCdemoCu00UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }
}
