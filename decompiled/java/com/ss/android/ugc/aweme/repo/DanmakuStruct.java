package com.ss.android.ugc.aweme.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuStruct {

    @C09CT("danmaku_id")
    public String danmakuID;

    @C09CT("digg_count")
    public long diggCount;

    @C09CT("has_digged")
    public boolean hasDigged;

    @C09CT("item_id")
    public String itemId;

    @C09CT("offset_time")
    public long offsetTime;

    @C09CT("text")
    public String text;

    @C09CT("user_id")
    public String userId;

    public final String getDanmakuID() {
        return this.danmakuID;
    }

    public final long getDiggCount() {
        return this.diggCount;
    }

    public final boolean getHasDigged() {
        return this.hasDigged;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final long getOffsetTime() {
        return this.offsetTime;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setDanmakuID(String str) {
        this.danmakuID = str;
    }

    public final void setDiggCount(long j) {
        this.diggCount = j;
    }

    public final void setHasDigged(boolean z) {
        this.hasDigged = z;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setOffsetTime(long j) {
        this.offsetTime = j;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }
}
