package com.ss.android.ugc.aweme.notice.repo.list.bean;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemNoticeData {
    public final List<NoticeChannelInfo> channelList;
    public final boolean isUnreadDivider;
    public final MusNotice notice;

    public SystemNoticeData() {
        this(null, null, false);
    }

    public final boolean isUnreadDivider() {
        return this.isUnreadDivider;
    }

    public SystemNoticeData(MusNotice musNotice, List<NoticeChannelInfo> list, boolean z) {
        this.notice = musNotice;
        this.channelList = list;
        this.isUnreadDivider = z;
    }
}
