package com.ss.android.ugc.aweme.account.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class LeakedPasswordNotificationModel {

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("learn_more_link")
    public String learnMoreLink;

    public LeakedPasswordNotificationModel() {
        this(false, null);
    }

    public LeakedPasswordNotificationModel(boolean z, String str) {
        this.enabled = z;
        this.learnMoreLink = str;
    }
}
