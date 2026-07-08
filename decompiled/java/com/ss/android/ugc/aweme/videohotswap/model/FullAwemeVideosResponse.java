package com.ss.android.ugc.aweme.videohotswap.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FullAwemeVideosResponse extends BaseResponse {

    @C09CT("aweme_details")
    public final List<Aweme> awemes;

    public FullAwemeVideosResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullAwemeVideosResponse) && Intrinsics.LJFF(this.awemes, ((FullAwemeVideosResponse) obj).awemes);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullAwemeVideosResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullAwemeVideosResponse(List<? extends Aweme> list) {
        this.awemes = list;
    }
}
