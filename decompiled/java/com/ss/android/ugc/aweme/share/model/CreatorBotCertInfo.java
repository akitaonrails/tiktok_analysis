package com.ss.android.ugc.aweme.share.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorBotCertInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("custom_verify")
    public final String customVerify;

    @C09CT("is_verify")
    public final Boolean isVerify;

    public CreatorBotCertInfo(Boolean bool, String str) {
        this.isVerify = bool;
        this.customVerify = str;
    }
}
