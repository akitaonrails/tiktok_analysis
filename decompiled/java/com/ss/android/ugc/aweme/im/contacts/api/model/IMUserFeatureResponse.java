package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMUserFeatureResponse extends BaseResponse {

    @C09CT("im_user_feature_value")
    public final IMUserFeatureValueData content;

    public IMUserFeatureResponse() {
        this(new IMUserFeatureValueData(0, null, null, null, null, null, null, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMUserFeatureResponse) && Intrinsics.LJFF(this.content, ((IMUserFeatureResponse) obj).content);
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserFeatureResponse(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMUserFeatureResponse(IMUserFeatureValueData iMUserFeatureValueData) {
        this.content = iMUserFeatureValueData;
    }
}
