package com.ss.android.ugc.aweme.aigc.migration.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GenTaskForWorkflowModel {

    @C09CT("skip_quota")
    public final Boolean skipQuota;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("workflow_json")
    public final String workflowJson;

    public GenTaskForWorkflowModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenTaskForWorkflowModel)) {
            return false;
        }
        GenTaskForWorkflowModel genTaskForWorkflowModel = (GenTaskForWorkflowModel) obj;
        return Intrinsics.LJFF(this.taskType, genTaskForWorkflowModel.taskType) && Intrinsics.LJFF(this.workflowJson, genTaskForWorkflowModel.workflowJson) && Intrinsics.LJFF(this.templateId, genTaskForWorkflowModel.templateId) && Intrinsics.LJFF(this.skipQuota, genTaskForWorkflowModel.skipQuota);
    }

    public final int hashCode() {
        String str = this.taskType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.workflowJson;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.skipQuota;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenTaskForWorkflowModel(taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", workflowJson=");
        sbLIZ.append(this.workflowJson);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", skipQuota=");
        sbLIZ.append(this.skipQuota);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GenTaskForWorkflowModel(String str, String str2, String str3, Boolean bool) {
        this.taskType = str;
        this.workflowJson = str2;
        this.templateId = str3;
        this.skipQuota = bool;
    }
}
