package com.ss.android.ugc.aweme.topic.movie.detail.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieDetailResp extends BaseResponse {

    @C09CT("topic_detail")
    public final MovieDetail detail;

    @C09CT("is_collected")
    public boolean isCollected;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieDetailResp)) {
            return false;
        }
        MovieDetailResp movieDetailResp = (MovieDetailResp) obj;
        return this.isCollected == movieDetailResp.isCollected && Intrinsics.LJFF(this.detail, movieDetailResp.detail);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isCollected) * 31) + this.detail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieDetailResp(isCollected=");
        sbLIZ.append(this.isCollected);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MovieDetailResp(boolean z, MovieDetail movieDetail) {
        this.isCollected = z;
        this.detail = movieDetail;
    }
}
