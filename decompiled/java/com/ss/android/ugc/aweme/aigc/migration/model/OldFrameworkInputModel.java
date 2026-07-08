package com.ss.android.ugc.aweme.aigc.migration.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OldFrameworkInputModel {

    @C09CT("gen_task_for_workflow_model")
    public final GenTaskForWorkflowModel genTaskForWorkflowModel;

    @C09CT("parent_task_input")
    public final ParentTaskInput parentTaskInput;

    public OldFrameworkInputModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OldFrameworkInputModel)) {
            return false;
        }
        OldFrameworkInputModel oldFrameworkInputModel = (OldFrameworkInputModel) obj;
        return Intrinsics.LJFF(this.genTaskForWorkflowModel, oldFrameworkInputModel.genTaskForWorkflowModel) && Intrinsics.LJFF(this.parentTaskInput, oldFrameworkInputModel.parentTaskInput);
    }

    public final int hashCode() {
        GenTaskForWorkflowModel genTaskForWorkflowModel = this.genTaskForWorkflowModel;
        int iHashCode = (genTaskForWorkflowModel == null ? 0 : genTaskForWorkflowModel.hashCode()) * 31;
        ParentTaskInput parentTaskInput = this.parentTaskInput;
        return iHashCode + (parentTaskInput != null ? parentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OldFrameworkInputModel(genTaskForWorkflowModel=");
        sbLIZ.append(this.genTaskForWorkflowModel);
        sbLIZ.append(", parentTaskInput=");
        sbLIZ.append(this.parentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OldFrameworkInputModel(GenTaskForWorkflowModel genTaskForWorkflowModel, ParentTaskInput parentTaskInput) {
        this.genTaskForWorkflowModel = genTaskForWorkflowModel;
        this.parentTaskInput = parentTaskInput;
    }
}
