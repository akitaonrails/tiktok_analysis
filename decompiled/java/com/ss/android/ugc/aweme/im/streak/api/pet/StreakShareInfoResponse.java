package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakShareInfoResponse extends BaseStreakResponse {

    @C09CT("share_info")
    public final StreakShareInfo streakShareInfo;

    public StreakShareInfoResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreakShareInfoResponse) && Intrinsics.LJFF(this.streakShareInfo, ((StreakShareInfoResponse) obj).streakShareInfo);
    }

    public final int hashCode() {
        StreakShareInfo streakShareInfo = this.streakShareInfo;
        if (streakShareInfo == null) {
            return 0;
        }
        return streakShareInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakShareInfoResponse(streakShareInfo=");
        sbLIZ.append(this.streakShareInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakShareInfoResponse(StreakShareInfo streakShareInfo) {
        super(null, null, null);
        this.streakShareInfo = streakShareInfo;
    }
}
