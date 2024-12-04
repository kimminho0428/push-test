package com.tmax.openframe.mapper;

import com.tmax.openframe.DataConverter;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;
import org.mapstruct.factory.*;
import com.tmax.openframe.variable.group.Cousr02cCarddemoCommarea;
import com.tmax.openframe.variable.group.Cousr00cDfhcommarea;
import com.tmax.openframe.variable.group.Cosgn00cDfhcommarea;
import com.tmax.openframe.variable.group.Coadm01cDfhcommarea;
import com.tmax.openframe.variable.group.Cousr02cDfhcommarea;
import com.tmax.openframe.variable.group.SecUserData;
import com.tmax.openframe.dto.AwsM2CarddemoUsrsecVsamKsdsDto;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:19 KST</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cousr02cMapperInterface {
    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr02cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr02cCarddemoCommareaToCousr00cDfhcommarea {
        Cousr02cCarddemoCommareaToCousr00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr02cCarddemoCommareaToCousr00cDfhcommarea.class);

        Cousr00cDfhcommarea toTarget(Cousr02cCarddemoCommarea source);

        Cousr02cCarddemoCommarea toSource(Cousr00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr02cCarddemoCommarea source,
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
                    + source.getCdemoCu02Info().getCdemoCu02UsridFirst()
                    + source.getCdemoCu02Info().getCdemoCu02UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu02Info().getCdemoCu02PageNum(), 8)
                    + source.getCdemoCu02Info().getCdemoCu02NextPageFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr00cDfhcommarea source,
                @MappingTarget Cousr02cCarddemoCommarea target) {
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
            target.getCdemoCu02Info().setCdemoCu02UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu02Info().setCdemoCu02UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu02Info().setCdemoCu02PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu02Info().setCdemoCu02NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu02Info().setCdemoCu02UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu02Info().setCdemoCu02UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr02cCarddemoCommarea}</li>
     * <li>target class: {@link Cosgn00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr02cCarddemoCommareaToCosgn00cDfhcommarea {
        Cousr02cCarddemoCommareaToCosgn00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr02cCarddemoCommareaToCosgn00cDfhcommarea.class);

        Cosgn00cDfhcommarea toTarget(Cousr02cCarddemoCommarea source);

        Cousr02cCarddemoCommarea toSource(Cosgn00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr02cCarddemoCommarea source,
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
                    + source.getCdemoCu02Info().getCdemoCu02UsridFirst()
                    + source.getCdemoCu02Info().getCdemoCu02UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu02Info().getCdemoCu02PageNum(), 8)
                    + source.getCdemoCu02Info().getCdemoCu02NextPageFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cosgn00cDfhcommarea source,
                @MappingTarget Cousr02cCarddemoCommarea target) {
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
            target.getCdemoCu02Info().setCdemoCu02UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu02Info().setCdemoCu02UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu02Info().setCdemoCu02PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu02Info().setCdemoCu02NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu02Info().setCdemoCu02UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu02Info().setCdemoCu02UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr02cCarddemoCommarea}</li>
     * <li>target class: {@link Coadm01cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr02cCarddemoCommareaToCoadm01cDfhcommarea {
        Cousr02cCarddemoCommareaToCoadm01cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr02cCarddemoCommareaToCoadm01cDfhcommarea.class);

        Coadm01cDfhcommarea toTarget(Cousr02cCarddemoCommarea source);

        Cousr02cCarddemoCommarea toSource(Coadm01cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr02cCarddemoCommarea source,
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
                    + source.getCdemoCu02Info().getCdemoCu02UsridFirst()
                    + source.getCdemoCu02Info().getCdemoCu02UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu02Info().getCdemoCu02PageNum(), 8)
                    + source.getCdemoCu02Info().getCdemoCu02NextPageFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelected());
        }

        @AfterMapping
        default void makeSource(Coadm01cDfhcommarea source,
                @MappingTarget Cousr02cCarddemoCommarea target) {
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
            target.getCdemoCu02Info().setCdemoCu02UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu02Info().setCdemoCu02UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu02Info().setCdemoCu02PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu02Info().setCdemoCu02NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu02Info().setCdemoCu02UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu02Info().setCdemoCu02UsrSelected(
                    StringUtils.substring(source.getLkCommarea(), 186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr02cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr02cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @org.mapstruct.Builder(disableBuilder = true))
    public interface Cousr02cCarddemoCommareaToCousr02cDfhcommarea {
        Cousr02cCarddemoCommareaToCousr02cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr02cCarddemoCommareaToCousr02cDfhcommarea.class);

        Cousr02cDfhcommarea toTarget(Cousr02cCarddemoCommarea source);

        Cousr02cCarddemoCommarea toSource(Cousr02cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr02cCarddemoCommarea source,
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
                    + source.getCdemoCu02Info().getCdemoCu02UsridFirst()
                    + source.getCdemoCu02Info().getCdemoCu02UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu02Info().getCdemoCu02PageNum(), 8)
                    + source.getCdemoCu02Info().getCdemoCu02NextPageFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelFlg()
                    + source.getCdemoCu02Info().getCdemoCu02UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr02cDfhcommarea source,
                @MappingTarget Cousr02cCarddemoCommarea target) {
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
            target.getCdemoCu02Info().setCdemoCu02UsridFirst(
                    StringUtils.substring(source.getLkCommarea(), 160, 168));
            target.getCdemoCu02Info().setCdemoCu02UsridLast(
                    StringUtils.substring(source.getLkCommarea(), 168, 176));
            target.getCdemoCu02Info().setCdemoCu02PageNum(
                    ((int) DataConverter.convZonedStringToLong(StringUtils
                            .substring(source.getLkCommarea(), 176, 184), 8)));
            target.getCdemoCu02Info().setCdemoCu02NextPageFlg(
                    StringUtils.substring(source.getLkCommarea(), 184, 185));
            target.getCdemoCu02Info().setCdemoCu02UsrSelFlg(
                    StringUtils.substring(source.getLkCommarea(), 185, 186));
            target.getCdemoCu02Info().setCdemoCu02UsrSelected(
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
}
