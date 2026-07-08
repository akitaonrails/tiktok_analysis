package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCipInfo implements Serializable {

    @C09CT("ads")
    public final String ads;

    @C09CT("download_failed_text")
    public final String downloadFailedText;

    @C09CT("downloading_text")
    public final String downloadingText;

    @C09CT("install_success_notify_type")
    public final Integer installSuccessNotifyType;

    @C09CT("linkInfo")
    public final String linkInfo;

    @C09CT("notify")
    public final Notify notify;

    @C09CT("policy")
    public final Policy policy;

    public AdCipInfo() {
        this(null, null, null, null, null, null, null);
    }

    public AdCipInfo(String str, String str2, Integer num, Policy policy, Notify notify, String str3, String str4) {
        this.ads = str;
        this.linkInfo = str2;
        this.installSuccessNotifyType = num;
        this.policy = policy;
        this.notify = notify;
        this.downloadFailedText = str3;
        this.downloadingText = str4;
    }
}
