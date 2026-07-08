package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserPortraitDelaySettingsModel {

    @C09CT("im_user_portrait_long_delay")
    public final long longDelay;

    @C09CT("im_user_portrait_short_delay")
    public final long shortDelay;

    public IMUserPortraitDelaySettingsModel() {
        this(8000L, 30000L);
    }

    public IMUserPortraitDelaySettingsModel(long j, long j2) {
        this.shortDelay = j;
        this.longDelay = j2;
    }
}
