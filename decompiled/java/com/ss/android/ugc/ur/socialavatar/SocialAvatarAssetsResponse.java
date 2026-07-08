package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarAssetsResponse extends BaseResponse {

    @C09CT("inputs")
    public final List<AssetInput> inputs;

    @C09CT("outputs")
    public final List<AssetOutput> outputs;

    @C09CT("task_id")
    public final String taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarAssetsResponse)) {
            return false;
        }
        SocialAvatarAssetsResponse socialAvatarAssetsResponse = (SocialAvatarAssetsResponse) obj;
        return Intrinsics.LJFF(this.inputs, socialAvatarAssetsResponse.inputs) && Intrinsics.LJFF(this.outputs, socialAvatarAssetsResponse.outputs) && Intrinsics.LJFF(this.taskId, socialAvatarAssetsResponse.taskId);
    }

    public final int hashCode() {
        List<AssetInput> list = this.inputs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AssetOutput> list2 = this.outputs;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.taskId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarAssetsResponse(inputs=");
        sbLIZ.append(this.inputs);
        sbLIZ.append(", outputs=");
        sbLIZ.append(this.outputs);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarAssetsResponse(List<AssetInput> list, List<AssetOutput> list2, String str) {
        this.inputs = list;
        this.outputs = list2;
        this.taskId = str;
    }
}
