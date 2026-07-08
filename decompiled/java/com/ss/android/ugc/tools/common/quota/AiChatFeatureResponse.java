package com.ss.android.ugc.tools.common.quota;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AiChatFeatureResponse extends BaseResponse {

    @C09CT("im_user_feature_value")
    public final AiChatFeatureValue featureValue;

    public AiChatFeatureResponse() {
        this(new AiChatFeatureValue(null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AiChatFeatureResponse) && Intrinsics.LJFF(this.featureValue, ((AiChatFeatureResponse) obj).featureValue);
    }

    public final int hashCode() {
        return this.featureValue.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiChatFeatureResponse(featureValue=");
        sbLIZ.append(this.featureValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AiChatFeatureResponse(AiChatFeatureValue aiChatFeatureValue) {
        this.featureValue = aiChatFeatureValue;
    }
}
