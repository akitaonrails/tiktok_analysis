package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class SleepHourSettingResponse extends BaseResponse {

    @C09CT("next_timestamp")
    public final long nextTimeStamps;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SleepHourSettingResponse) && this.nextTimeStamps == ((SleepHourSettingResponse) obj).nextTimeStamps;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.nextTimeStamps);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SleepHourSettingResponse(nextTimeStamps=");
        sbLIZ.append(this.nextTimeStamps);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SleepHourSettingResponse() {
        this(0L);
    }

    public SleepHourSettingResponse(long j) {
        this.nextTimeStamps = j;
    }
}
