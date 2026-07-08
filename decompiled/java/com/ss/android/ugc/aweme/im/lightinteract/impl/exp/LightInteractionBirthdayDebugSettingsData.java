package com.ss.android.ugc.aweme.im.lightinteract.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionBirthdayDebugSettingsData {

    @C09CT("add_birthday_mock_push")
    public final boolean addBirthdayMockPush;

    @C09CT("skip_request_frequency_control")
    public final boolean skipRequestFrequencyControl;

    public LightInteractionBirthdayDebugSettingsData() {
        this(false, false);
    }

    public LightInteractionBirthdayDebugSettingsData(boolean z, boolean z2) {
        this.skipRequestFrequencyControl = z;
        this.addBirthdayMockPush = z2;
    }
}
