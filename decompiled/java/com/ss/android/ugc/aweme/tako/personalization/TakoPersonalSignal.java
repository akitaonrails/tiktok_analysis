package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoPersonalSignal {

    @C09CT("product_profile")
    public final ProductProfile productProfile;

    @C09CT("search_profile")
    public final SearchProfile searchProfile;

    @C09CT("tako_profile")
    public final TakoProfile takoProfile;

    @C09CT("user_consumption")
    public final UserConsumption userConsumption;

    public TakoPersonalSignal() {
        this(null, null, null, null);
    }

    public TakoPersonalSignal(UserConsumption userConsumption, SearchProfile searchProfile, TakoProfile takoProfile, ProductProfile productProfile) {
        this.userConsumption = userConsumption;
        this.searchProfile = searchProfile;
        this.takoProfile = takoProfile;
        this.productProfile = productProfile;
    }
}
