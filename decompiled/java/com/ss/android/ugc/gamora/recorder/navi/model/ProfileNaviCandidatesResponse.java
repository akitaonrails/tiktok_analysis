package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviCandidatesResponse extends BaseResponse {

    @C09CT("initial_navis")
    public final List<ProfileNaviCandidate> initialNavis;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviCandidatesResponse) && Intrinsics.LJFF(this.initialNavis, ((ProfileNaviCandidatesResponse) obj).initialNavis);
    }

    public final int hashCode() {
        List<ProfileNaviCandidate> list = this.initialNavis;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviCandidatesResponse(initialNavis=");
        sbLIZ.append(this.initialNavis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileNaviCandidatesResponse(List<ProfileNaviCandidate> list) {
        this.initialNavis = list;
    }
}
