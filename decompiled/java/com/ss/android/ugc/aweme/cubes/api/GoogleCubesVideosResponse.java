package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleCubesVideosResponse extends BaseResponse {

    @C09CT("data")
    public final GoogleCubesVideosData data;

    @C09CT("error")
    public final GoogleCubesVideosError error;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleCubesVideosResponse)) {
            return false;
        }
        GoogleCubesVideosResponse googleCubesVideosResponse = (GoogleCubesVideosResponse) obj;
        return Intrinsics.LJFF(this.data, googleCubesVideosResponse.data) && Intrinsics.LJFF(this.error, googleCubesVideosResponse.error);
    }

    public final int hashCode() {
        GoogleCubesVideosData googleCubesVideosData = this.data;
        int iHashCode = (googleCubesVideosData == null ? 0 : googleCubesVideosData.hashCode()) * 31;
        GoogleCubesVideosError googleCubesVideosError = this.error;
        return iHashCode + (googleCubesVideosError != null ? googleCubesVideosError.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoogleCubesVideosResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GoogleCubesVideosResponse(GoogleCubesVideosData googleCubesVideosData, GoogleCubesVideosError googleCubesVideosError) {
        this.data = googleCubesVideosData;
        this.error = googleCubesVideosError;
    }
}
