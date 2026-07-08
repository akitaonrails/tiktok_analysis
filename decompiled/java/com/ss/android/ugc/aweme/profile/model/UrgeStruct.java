package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class UrgeStruct implements Serializable {

    @C09CT("block_urge_setting")
    public int blockUrgeSetting;

    @C09CT("latest_aweme_time")
    public long latestAwemeTime;

    @C09CT("latest_room_time")
    public long latestRoomTime;

    @C09CT("urge_unread_count")
    public long urgeUnreadCount;

    @C09CT("user_urged")
    public int userUrged;

    public boolean shouldHostShowTip() {
        return this.blockUrgeSetting == 0 && this.urgeUnreadCount > 0;
    }

    public int getBlockUrgeSetting() {
        return this.blockUrgeSetting;
    }

    public long getLatestAwemeTime() {
        return this.latestAwemeTime;
    }

    public long getLatestRoomTime() {
        return this.latestRoomTime;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public int getUserUrged() {
        return this.userUrged;
    }

    public void setBlockUrgeSetting(int i) {
        this.blockUrgeSetting = i;
    }

    public void setLatestAwemeTime(long j) {
        this.latestAwemeTime = j;
    }

    public void setLatestRoomTime(long j) {
        this.latestRoomTime = j;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }

    public void setUserUrged(int i) {
        this.userUrged = i;
    }
}
