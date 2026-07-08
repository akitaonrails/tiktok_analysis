package com.ss.android.ugc.aweme.vibefeed.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeInteractRecord {

    @C09CT("liked_cnt")
    public Integer likedCnt;

    @C09CT("send_co_like_today")
    public Boolean sendCoLikeToday;

    @C09CT("send_inline_msg")
    public Boolean sendInlineMsg;

    @C09CT("send_msg_cnt")
    public Integer sendMsgCnt;

    @C09CT("send_reminder_today")
    public Boolean sendReminderToday;

    public VibeInteractRecord() {
        this(0, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public VibeInteractRecord(Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.likedCnt = num;
        this.sendMsgCnt = num2;
        this.sendReminderToday = bool;
        this.sendInlineMsg = bool2;
        this.sendCoLikeToday = bool3;
    }
}
