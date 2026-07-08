package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCloseResponse {

    @C09CT("data")
    public final BulletinAccountErrorInfo data;

    @C09CT("message")
    public final String message;

    public BulletinCloseResponse() {
        this("", null);
    }

    public BulletinCloseResponse(String str, BulletinAccountErrorInfo bulletinAccountErrorInfo) {
        this.message = str;
        this.data = bulletinAccountErrorInfo;
    }
}
