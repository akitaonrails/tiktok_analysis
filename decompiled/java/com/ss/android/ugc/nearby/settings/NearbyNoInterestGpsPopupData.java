package com.ss.android.ugc.nearby.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyNoInterestGpsPopupData {

    @C09CT("gps_prompt_exposures")
    public final Integer cardIndex;

    @C09CT("variant_group")
    public final Integer expGroup;

    public NearbyNoInterestGpsPopupData() {
        this(null, null);
    }

    public NearbyNoInterestGpsPopupData(Integer num, Integer num2) {
        this.expGroup = num;
        this.cardIndex = num2;
    }
}
