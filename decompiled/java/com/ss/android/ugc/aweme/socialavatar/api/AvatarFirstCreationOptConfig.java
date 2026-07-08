package com.ss.android.ugc.aweme.socialavatar.api;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AvatarFirstCreationOptConfig {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("generation_quota_per_day")
    public final int generationQuotaPerDay;

    public AvatarFirstCreationOptConfig() {
        this(0, 1);
    }

    public AvatarFirstCreationOptConfig(int i, int i2) {
        this.enabled = i;
        this.generationQuotaPerDay = i2;
    }
}
