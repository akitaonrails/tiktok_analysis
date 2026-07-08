package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AICreateVideoModel {

    @C09CT("gen_tasks")
    public final List<VideoGenTaskConfig> genTasksConfig;

    @C09CT("have_audio")
    public final boolean haveAudio;

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

    @C09CT("model_tags")
    public final List<AICreateModelTag> modelTags;

    public AICreateVideoModel() {
        this(null, false, false, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICreateVideoModel)) {
            return false;
        }
        AICreateVideoModel aICreateVideoModel = (AICreateVideoModel) obj;
        return Intrinsics.LJFF(this.genTasksConfig, aICreateVideoModel.genTasksConfig) && this.haveAudio == aICreateVideoModel.haveAudio && this.modelByOwn == aICreateVideoModel.modelByOwn && Intrinsics.LJFF(this.modelQuotaReqKey, aICreateVideoModel.modelQuotaReqKey) && Intrinsics.LJFF(this.modelDisplayName, aICreateVideoModel.modelDisplayName) && Intrinsics.LJFF(this.modelDisplayRemark, aICreateVideoModel.modelDisplayRemark) && Intrinsics.LJFF(this.modelTags, aICreateVideoModel.modelTags) && Intrinsics.LJFF(this.modelIconUrl, aICreateVideoModel.modelIconUrl);
    }

    public final int hashCode() {
        return (((((((((((((this.genTasksConfig.hashCode() * 31) + C786410Ut5.Z2(this.haveAudio)) * 31) + C786410Ut5.Z2(this.modelByOwn)) * 31) + this.modelQuotaReqKey.hashCode()) * 31) + this.modelDisplayName.hashCode()) * 31) + this.modelDisplayRemark.hashCode()) * 31) + this.modelTags.hashCode()) * 31) + this.modelIconUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICreateVideoModel(genTasksConfig=");
        sbLIZ.append(this.genTasksConfig);
        sbLIZ.append(", haveAudio=");
        sbLIZ.append(this.haveAudio);
        sbLIZ.append(", modelByOwn=");
        sbLIZ.append(this.modelByOwn);
        sbLIZ.append(", modelQuotaReqKey=");
        sbLIZ.append(this.modelQuotaReqKey);
        sbLIZ.append(", modelDisplayName=");
        sbLIZ.append(this.modelDisplayName);
        sbLIZ.append(", modelDisplayRemark=");
        sbLIZ.append(this.modelDisplayRemark);
        sbLIZ.append(", modelTags=");
        sbLIZ.append(this.modelTags);
        sbLIZ.append(", modelIconUrl=");
        sbLIZ.append(this.modelIconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static AICreateVideoModel LIZ(AICreateVideoModel aICreateVideoModel, List list, String str) {
        return new AICreateVideoModel(list, aICreateVideoModel.haveAudio, aICreateVideoModel.modelByOwn, str, aICreateVideoModel.modelDisplayName, aICreateVideoModel.modelDisplayRemark, aICreateVideoModel.modelTags, aICreateVideoModel.modelIconUrl);
    }

    public AICreateVideoModel(List<VideoGenTaskConfig> list, boolean z, boolean z2, String str, String str2, String str3, List<AICreateModelTag> list2, String str4) {
        this.genTasksConfig = list;
        this.haveAudio = z;
        this.modelByOwn = z2;
        this.modelQuotaReqKey = str;
        this.modelDisplayName = str2;
        this.modelDisplayRemark = str3;
        this.modelTags = list2;
        this.modelIconUrl = str4;
    }

    public AICreateVideoModel(List list, boolean z, boolean z2, String str, String str2, String str3, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? C13BV.INSTANCE : list2, (i & 128) == 0 ? str4 : "");
    }
}
