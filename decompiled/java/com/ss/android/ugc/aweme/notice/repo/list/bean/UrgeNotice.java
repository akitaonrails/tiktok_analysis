package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public class UrgeNotice {

    @C09CT("blcok_urge_setting")
    public int blcokUrgeSetting;

    @C09CT("content")
    public String content;

    @C09CT("urge_unread_count")
    public long urgeUnreadCount;

    public int getBlcokUrgeSetting() {
        return this.blcokUrgeSetting;
    }

    public String getContent() {
        return this.content;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public void setBlcokUrgeSetting(int i) {
        this.blcokUrgeSetting = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }
}
