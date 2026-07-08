package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinExposeResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinExposeResponse() {
        this(-1, null);
    }

    public BulletinExposeResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
