package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ServerIntelligentResponse extends BaseResponse {

    @C09CT("dynamic_popup")
    public final DynamicPopup dynamicPopup;

    @C09CT("final_score")
    public final Float score;

    @C09CT("show")
    public final Boolean shouldShow;

    public ServerIntelligentResponse() {
        this(Boolean.TRUE, Float.valueOf(-1.0f), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerIntelligentResponse)) {
            return false;
        }
        ServerIntelligentResponse serverIntelligentResponse = (ServerIntelligentResponse) obj;
        return Intrinsics.LJFF(this.shouldShow, serverIntelligentResponse.shouldShow) && Intrinsics.LJFF(this.score, serverIntelligentResponse.score) && Intrinsics.LJFF(this.dynamicPopup, serverIntelligentResponse.dynamicPopup);
    }

    public final int hashCode() {
        Boolean bool = this.shouldShow;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f = this.score;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        DynamicPopup dynamicPopup = this.dynamicPopup;
        return iHashCode2 + (dynamicPopup != null ? dynamicPopup.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerIntelligentResponse(shouldShow=");
        sbLIZ.append(this.shouldShow);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", dynamicPopup=");
        sbLIZ.append(this.dynamicPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ServerIntelligentResponse(Boolean bool, Float f, DynamicPopup dynamicPopup) {
        this.shouldShow = bool;
        this.score = f;
        this.dynamicPopup = dynamicPopup;
    }
}
