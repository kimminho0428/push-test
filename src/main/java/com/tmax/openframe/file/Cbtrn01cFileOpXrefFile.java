package com.tmax.openframe.file;

import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileBaseOperation;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.variable.Cbtrn01cVariableContainer;
import com.tmax.openframe.variable.group.Cbtrn01cFdXreffileRec;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines file I/O methods</p>
 * <ul>
 * <li>File description name: XREF-FILE</li>
 * <li>file record class: {@link Cbtrn01cFdXreffileRec}</li>
 * <li>key field: {@link Cbtrn01cFdXreffileRec#fdXrefCardNum}</li>
 * </ul>
 */
public abstract class Cbtrn01cFileOpXrefFile implements
        FileBaseOperation<Cbtrn01cFdXreffileRec, String> {
    public Cbtrn01cFdXreffileRec readNext(OpenFrameContext context) {
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
        container.getXreffileStatus().set(status.getValue());
        context.setFileStatus("Cbtrn01c", "XrefFile", status);
    }

    public FileStatus getFileStatus(OpenFrameContext context) {
        return context.getFileStatus("Cbtrn01c", "XrefFile");
    }
}
