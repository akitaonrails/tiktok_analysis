package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class IABExposurePivModel {

    @C09CT("exposure_piv_on_other_percent")
    public final float exposurePivOnOtherPercent;

    @C09CT("exposure_piv_on_sheet_percent")
    public final float exposurePivOnThreePercent;

    public IABExposurePivModel() {
        this(0.24f, 0.49f);
    }

    public IABExposurePivModel(float f, float f2) {
        this.exposurePivOnThreePercent = f;
        this.exposurePivOnOtherPercent = f2;
    }
}
