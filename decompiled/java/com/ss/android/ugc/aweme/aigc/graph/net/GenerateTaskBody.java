package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GenerateTaskBody {

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("extra")
    public final String extra;

    @C09CT("inputs")
    public final List<InputInfo> inputs;

    @C09CT("workflow_id")
    public final long serverWorkflowId;

    @C09CT("task_type")
    public final String taskType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateTaskBody)) {
            return false;
        }
        GenerateTaskBody generateTaskBody = (GenerateTaskBody) obj;
        return Intrinsics.LJFF(this.businessScene, generateTaskBody.businessScene) && Intrinsics.LJFF(this.taskType, generateTaskBody.taskType) && this.serverWorkflowId == generateTaskBody.serverWorkflowId && Intrinsics.LJFF(this.inputs, generateTaskBody.inputs) && Intrinsics.LJFF(this.extra, generateTaskBody.extra);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.businessScene.hashCode() * 31) + this.taskType.hashCode()) * 31) + C786410Ut5.Y2(this.serverWorkflowId)) * 31) + this.inputs.hashCode()) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerateTaskBody(businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", serverWorkflowId=");
        sbLIZ.append(this.serverWorkflowId);
        sbLIZ.append(", inputs=");
        sbLIZ.append(this.inputs);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GenerateTaskBody(String str, String str2, long j, List<InputInfo> list, String str3) {
        this.businessScene = str;
        this.taskType = str2;
        this.serverWorkflowId = j;
        this.inputs = list;
        this.extra = str3;
    }

    public GenerateTaskBody(String str, String str2, long j, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : str3);
    }
}
