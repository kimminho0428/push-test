package com.tmax.openframe.file;

import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileBaseOperation;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.variable.Cbtrn01cVariableContainer;
import com.tmax.openframe.variable.group.Cbtrn01cFdAcctfileRec;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines file I/O methods</p>
 * <ul>
 * <li>File description name: ACCOUNT-FILE</li>
 * <li>file record class: {@link Cbtrn01cFdAcctfileRec}</li>
 * <li>key field: {@link Cbtrn01cFdAcctfileRec#fdAcctId}</li>
 * </ul>
 */
public abstract class Cbtrn01cFileOpAccountFile implements
        FileBaseOperation<Cbtrn01cFdAcctfileRec, Long> {
    public Cbtrn01cFdAcctfileRec readNext(OpenFrameContext context) {
        if (getFileStatus(context) == FileStatus.AT_END_CONDITION_SEQ_READ) {
            setFileStatus(context, FileStatus.ALREADY_AT_END_CONDITION);
            return null;
        } else {
            return readNextRecord(context);
        }
    }

    public void setFileStatus(OpenFrameContext context, FileStatus status) {
        Cbtrn01cVariableContainer container = (Cbtrn01cVariableContainer) context
                .getProgramVariableContainer("Cbtrn01c");
        container.getAcctfileStatus().set(status.getValue());
        context.setFileStatus("Cbtrn01c", "AccountFile", status);
    }

    public FileStatus getFileStatus(OpenFrameContext context) {
        return context.getFileStatus("Cbtrn01c", "AccountFile");
    }
}
