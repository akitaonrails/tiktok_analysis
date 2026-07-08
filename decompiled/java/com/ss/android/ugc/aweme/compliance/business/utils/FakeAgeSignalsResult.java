package com.ss.android.ugc.aweme.compliance.business.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FakeAgeSignalsResult {

    @C09CT("fake_age_lower")
    public int fakeAgeLower;

    @C09CT("fake_age_signals_result_enable")
    public int fakeAgeSignalsResultEnable;

    @C09CT("fake_age_upper")
    public int fakeAgeUpper;

    @C09CT("fake_user_status")
    public int fakeUserStatus;

    public FakeAgeSignalsResult() {
        this(0, 0, 15, 18);
    }

    public FakeAgeSignalsResult(int i, int i2, int i3, int i4) {
        this.fakeAgeSignalsResultEnable = i;
        this.fakeUserStatus = i2;
        this.fakeAgeLower = i3;
        this.fakeAgeUpper = i4;
    }
}
