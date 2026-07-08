package com.ss.android.ugc.aweme.socialavatar.api.mixstudio;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MixStudioUseFriendsIDSettingsConfig implements Serializable {

    @C09CT("cache_expire_time")
    public final long cacheExpireTime;

    @C09CT("maximum_polling_times")
    public final int maximumPollingTimes;

    @C09CT("polling_interval")
    public final long pollingInternal;

    public MixStudioUseFriendsIDSettingsConfig() {
        this(600000L, 3, 2000L);
    }

    public MixStudioUseFriendsIDSettingsConfig(long j, int i, long j2) {
        this.cacheExpireTime = j;
        this.maximumPollingTimes = i;
        this.pollingInternal = j2;
    }
}
