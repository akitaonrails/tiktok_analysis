package com.ss.android.ugc.aweme.compliance.agegate.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TikTokAgeCelebrateBirthdayUpdateRequest {

    @C09CT("celebrate_birthday")
    public final Integer celebrateBirthdayStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TikTokAgeCelebrateBirthdayUpdateRequest) && Intrinsics.LJFF(this.celebrateBirthdayStatus, ((TikTokAgeCelebrateBirthdayUpdateRequest) obj).celebrateBirthdayStatus);
    }

    public final int hashCode() {
        Integer num = this.celebrateBirthdayStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokAgeCelebrateBirthdayUpdateRequest(celebrateBirthdayStatus=");
        sbLIZ.append(this.celebrateBirthdayStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TikTokAgeCelebrateBirthdayUpdateRequest(Integer num) {
        this.celebrateBirthdayStatus = num;
    }
}
