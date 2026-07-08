package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinSimpleResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinSimpleResponse() {
        this(-1, null);
    }

    public BulletinSimpleResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
