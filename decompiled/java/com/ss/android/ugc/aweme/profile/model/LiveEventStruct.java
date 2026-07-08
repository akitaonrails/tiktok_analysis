package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveEventStruct implements Serializable {

    @C09CT("is_paid_event")
    public boolean isPaidEvent;

    @C09CT("periodic_settings")
    public String periodicSettings;

    @C09CT("periodic_shows")
    public String periodicTitle;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    public final String getMobLiveEventType() {
        return this.isPaidEvent ? "paid" : isPeriodicEvent() ? "free_periodic" : "free";
    }

    public final boolean isPeriodicEvent() {
        String str = this.periodicSettings;
        return !(str == null || str.length() == 0);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPeriodicSettings() {
        return this.periodicSettings;
    }

    public final String getPeriodicTitle() {
        return this.periodicTitle;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPaidEvent() {
        return this.isPaidEvent;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPaidEvent(boolean z) {
        this.isPaidEvent = z;
    }

    public final void setPeriodicSettings(String str) {
        this.periodicSettings = str;
    }

    public final void setPeriodicTitle(String str) {
        this.periodicTitle = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
