package com.ss.android.ugc.aweme.account.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class SaveLoginInfoPopupFrequencyModel {

    @C09CT("interval")
    public final int interval;

    @C09CT("max_count")
    public final int max_count;

    @C09CT("min_hours_between_dialog_attempts")
    public final Integer minHoursBetweenAttempts;

    @C09CT("new_user_exemption")
    public final int new_user_exemption;

    public SaveLoginInfoPopupFrequencyModel(int i, int i2, int i3, Integer num) {
        this.interval = i;
        this.max_count = i2;
        this.new_user_exemption = i3;
        this.minHoursBetweenAttempts = num;
    }
}
