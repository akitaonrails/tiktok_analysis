package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinAccountErrorInfo {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final int errorCode;

    public BulletinAccountErrorInfo() {
        this(-1, null);
    }

    public BulletinAccountErrorInfo(int i, String str) {
        this.errorCode = i;
        this.description = str;
    }
}
