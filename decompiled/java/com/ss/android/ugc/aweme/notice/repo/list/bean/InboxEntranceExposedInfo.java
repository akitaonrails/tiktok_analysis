package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxEntranceExposedInfo {

    @C09CT("next_unread_notice")
    public final MusNotice nextUnreadNotice;

    @C09CT("next_unread_priority")
    public final int nextUnreadNoticePriority;

    @C09CT("notice_list")
    public final NoticeItems notices;

    public InboxEntranceExposedInfo() {
        this(null, null, 0);
    }

    public final InboxEntranceExposedInfo copy(NoticeItems noticeItems, MusNotice musNotice, int i) {
        return new InboxEntranceExposedInfo(noticeItems, musNotice, i);
    }

    public InboxEntranceExposedInfo(NoticeItems noticeItems, MusNotice musNotice, int i) {
        this.notices = noticeItems;
        this.nextUnreadNotice = musNotice;
        this.nextUnreadNoticePriority = i;
    }
}
