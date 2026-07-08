package com.ss.android.ugc.aweme.setting.api;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxMsgRequestBody {

    @C09CT("msg_type")
    public final int msgType;

    @C09CT("uid")
    public final String uid;

    @C09CT("build_number")
    public final String versionCode;

    @C09CT("version_code")
    public final String versionName;

    public InboxMsgRequestBody(int i, String str, String str2, String str3) {
        this.msgType = i;
        this.uid = str;
        this.versionName = str2;
        this.versionCode = str3;
    }
}
