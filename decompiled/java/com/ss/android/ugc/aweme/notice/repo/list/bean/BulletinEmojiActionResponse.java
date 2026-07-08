package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiActionResponse {

    @C09CT("action_status")
    public final Integer actionStatus;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinEmojiActionResponse(Integer num, String str, Integer num2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.actionStatus = num2;
    }
}
