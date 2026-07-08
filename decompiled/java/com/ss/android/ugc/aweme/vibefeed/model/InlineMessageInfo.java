package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InlineMessageInfo {

    @C09CT("like_count")
    public Integer likeCnt;

    @C09CT("send_message_count")
    public Integer sendMsgCnt;

    @C09CT("send_reminder_today")
    public Boolean sendReminderToday;

    public InlineMessageInfo() {
        this(0, 0, Boolean.FALSE);
    }

    public InlineMessageInfo(Integer num, Integer num2, Boolean bool) {
        this.likeCnt = num;
        this.sendMsgCnt = num2;
        this.sendReminderToday = bool;
    }
}
