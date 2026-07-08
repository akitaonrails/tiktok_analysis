package com.ss.android.ugc.aweme.profile.viewer.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileViewerAnimationInvalidPeriodSettingsModel {

    @C09CT("frequency")
    public final int frequencyInSecond;

    public ProfileViewerAnimationInvalidPeriodSettingsModel() {
        this(21600);
    }

    public ProfileViewerAnimationInvalidPeriodSettingsModel(int i) {
        this.frequencyInSecond = i;
    }
}
