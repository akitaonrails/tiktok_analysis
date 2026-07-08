package com.ss.android.ugc.aweme.im.saas.host.impl.spark;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class EnterChatReferral {

    @C09CT("ad")
    public final AdReferralInfo adReferralInfo;

    @C09CT("biz_uid")
    public final long bizUid;

    @C09CT("source")
    public final String source;

    @C09CT("last_update_time")
    public final long updateTime;

    public EnterChatReferral() {
        this("", null, 0L, 0L);
    }

    public EnterChatReferral(String str, AdReferralInfo adReferralInfo, long j, long j2) {
        this.source = str;
        this.adReferralInfo = adReferralInfo;
        this.updateTime = j;
        this.bizUid = j2;
    }
}
