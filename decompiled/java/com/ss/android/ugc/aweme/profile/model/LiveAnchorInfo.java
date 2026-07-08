package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public class LiveAnchorInfo implements Serializable {

    @C09CT("scheduled_master_switch")
    public boolean globalSwitch;

    @C09CT("scheduled_profile_switch")
    public boolean profileSwitch;

    @C09CT("scheduled_time_text")
    public String scheduledTimeText;

    public String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public boolean isGlobalSwitch() {
        return this.globalSwitch;
    }

    public boolean isProfileSwitch() {
        return this.profileSwitch;
    }

    public void setGlobalSwitch(boolean z) {
        this.globalSwitch = z;
    }

    public void setProfileSwitch(boolean z) {
        this.profileSwitch = z;
    }

    public void setScheduledTimeText(String str) {
        this.scheduledTimeText = str;
    }
}
