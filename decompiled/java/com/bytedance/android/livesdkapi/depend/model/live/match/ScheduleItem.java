package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ScheduleItem {

    @C09CT("duration")
    public Long duration;

    @C09CT("start_time")
    public Long startTime;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        sb.replace(0, 2, "ScheduleItem{");
        sb.append('}');
        return sb.toString();
    }
}
