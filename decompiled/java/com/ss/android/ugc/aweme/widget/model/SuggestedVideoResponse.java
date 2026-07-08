package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestedVideoResponse {

    @C09CT("data")
    public final SuggestedVideoData data;

    @C09CT("error")
    public final SuggestedVideoError error;

    public SuggestedVideoResponse() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedVideoResponse)) {
            return false;
        }
        SuggestedVideoResponse suggestedVideoResponse = (SuggestedVideoResponse) obj;
        return Intrinsics.LJFF(this.data, suggestedVideoResponse.data) && Intrinsics.LJFF(this.error, suggestedVideoResponse.error);
    }

    public int hashCode() {
        SuggestedVideoData suggestedVideoData = this.data;
        int iHashCode = (suggestedVideoData == null ? 0 : suggestedVideoData.hashCode()) * 31;
        SuggestedVideoError suggestedVideoError = this.error;
        return iHashCode + (suggestedVideoError != null ? suggestedVideoError.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoResponse(SuggestedVideoData suggestedVideoData, SuggestedVideoError suggestedVideoError) {
        this.data = suggestedVideoData;
        this.error = suggestedVideoError;
    }
}
