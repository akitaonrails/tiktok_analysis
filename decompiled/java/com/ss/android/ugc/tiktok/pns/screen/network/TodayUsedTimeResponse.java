package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class TodayUsedTimeResponse extends BaseResponse {

    @C09CT("time_usage_today")
    public final int todayUsedTime;

    public TodayUsedTimeResponse() {
        this(0);
    }

    public final TodayUsedTimeResponse copy(int i) {
        return new TodayUsedTimeResponse(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TodayUsedTimeResponse) && this.todayUsedTime == ((TodayUsedTimeResponse) obj).todayUsedTime;
    }

    public int hashCode() {
        return this.todayUsedTime;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TodayUsedTimeResponse(todayUsedTime=");
        sbLIZ.append(this.todayUsedTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getTodayUsedTime() {
        return this.todayUsedTime;
    }

    public TodayUsedTimeResponse(int i) {
        super(0, "");
        this.todayUsedTime = i;
    }
}
