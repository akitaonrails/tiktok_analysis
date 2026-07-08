package com.ss.android.ugc.aweme.compliance.privacy.phl;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeens;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PhlVideosResponse extends BaseResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("privacy_highlights_teens")
    public final PrivacyHighlightsForTeens phlTeens;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhlVideosResponse)) {
            return false;
        }
        PhlVideosResponse phlVideosResponse = (PhlVideosResponse) obj;
        return Intrinsics.LJFF(this.phlTeens, phlVideosResponse.phlTeens) && Intrinsics.LJFF(this.logPb, phlVideosResponse.logPb);
    }

    public final int hashCode() {
        return (this.phlTeens.hashCode() * 31) + this.logPb.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhlVideosResponse(phlTeens=");
        sbLIZ.append(this.phlTeens);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhlVideosResponse(PrivacyHighlightsForTeens privacyHighlightsForTeens, LogPbBean logPbBean) {
        this.phlTeens = privacyHighlightsForTeens;
        this.logPb = logPbBean;
    }
}
