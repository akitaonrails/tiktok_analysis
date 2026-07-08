package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AICreateImageModel {

    @C09CT("gen_tasks")
    public final List<ImageGenTaskConfig> genTasksConfig;

    @C09CT("model_by_own")
    public final boolean modelByOwn;

    @C09CT("model_display_name")
    public final String modelDisplayName;

    @C09CT("model_display_remark")
    public final String modelDisplayRemark;

    @C09CT("model_icon_url")
    public final String modelIconUrl;

    @C09CT("model_quota_req_key")
    public final String modelQuotaReqKey;

    public AICreateImageModel() {
        this(null, false, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICreateImageModel)) {
            return false;
        }
        AICreateImageModel aICreateImageModel = (AICreateImageModel) obj;
        return Intrinsics.LJFF(this.genTasksConfig, aICreateImageModel.genTasksConfig) && this.modelByOwn == aICreateImageModel.modelByOwn && Intrinsics.LJFF(this.modelQuotaReqKey, aICreateImageModel.modelQuotaReqKey) && Intrinsics.LJFF(this.modelDisplayName, aICreateImageModel.modelDisplayName) && Intrinsics.LJFF(this.modelDisplayRemark, aICreateImageModel.modelDisplayRemark) && Intrinsics.LJFF(this.modelIconUrl, aICreateImageModel.modelIconUrl);
    }

    public final int hashCode() {
        return (((((((((this.genTasksConfig.hashCode() * 31) + C786410Ut5.Z2(this.modelByOwn)) * 31) + this.modelQuotaReqKey.hashCode()) * 31) + this.modelDisplayName.hashCode()) * 31) + this.modelDisplayRemark.hashCode()) * 31) + this.modelIconUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICreateImageModel(genTasksConfig=");
        sbLIZ.append(this.genTasksConfig);
        sbLIZ.append(", modelByOwn=");
        sbLIZ.append(this.modelByOwn);
        sbLIZ.append(", modelQuotaReqKey=");
        sbLIZ.append(this.modelQuotaReqKey);
        sbLIZ.append(", modelDisplayName=");
        sbLIZ.append(this.modelDisplayName);
        sbLIZ.append(", modelDisplayRemark=");
        sbLIZ.append(this.modelDisplayRemark);
        sbLIZ.append(", modelIconUrl=");
        sbLIZ.append(this.modelIconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static AICreateImageModel LIZ(AICreateImageModel aICreateImageModel, List list, String str) {
        return new AICreateImageModel(list, aICreateImageModel.modelByOwn, str, aICreateImageModel.modelDisplayName, aICreateImageModel.modelDisplayRemark, aICreateImageModel.modelIconUrl);
    }

    public AICreateImageModel(List<ImageGenTaskConfig> list, boolean z, String str, String str2, String str3, String str4) {
        this.genTasksConfig = list;
        this.modelByOwn = z;
        this.modelQuotaReqKey = str;
        this.modelDisplayName = str2;
        this.modelDisplayRemark = str3;
        this.modelIconUrl = str4;
    }

    public AICreateImageModel(List list, boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
