package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SharePermission {

    @C09CT("extra")
    public String extra;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_share_status")
    public Integer userShareStatus = 0;

    @C09CT("ttn_share_status")
    public Integer ttnShareStatus = 0;

    public static /* synthetic */ void getUserShareStatus$annotations() {
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Integer getTtnShareStatus() {
        return this.ttnShareStatus;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Integer getUserShareStatus() {
        return this.userShareStatus;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setTtnShareStatus(Integer num) {
        this.ttnShareStatus = num;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserShareStatus(Integer num) {
        this.userShareStatus = num;
    }
}
