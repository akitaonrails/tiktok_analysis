package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSubscribeResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("subscribe_status")
    public final Integer subscribeStatus;

    public BulletinSubscribeResponse() {
        this(-1, null, -1);
    }

    public BulletinSubscribeResponse(int i, String str, Integer num) {
        this.statusCode = i;
        this.statusMsg = str;
        this.subscribeStatus = num;
    }
}
