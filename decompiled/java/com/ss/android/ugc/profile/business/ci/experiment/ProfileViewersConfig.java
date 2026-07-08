package com.ss.android.ugc.profile.business.ci.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileViewersConfig {

    @C09CT("enabled_max_followers")
    public Integer enabledMaxFollowers;

    public ProfileViewersConfig() {
        this(5000);
    }

    public ProfileViewersConfig(Integer num) {
        this.enabledMaxFollowers = num;
    }
}
