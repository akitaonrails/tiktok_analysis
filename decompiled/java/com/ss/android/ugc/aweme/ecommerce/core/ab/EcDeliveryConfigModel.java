package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcDeliveryConfigModel {

    @C09CT("geo_selected_cache_duration")
    public final Long cacheDuration;

    @C09CT("ttsus_enable_open_district_select_page")
    public final Boolean enableOpenDistrictSelectPage;

    public EcDeliveryConfigModel() {
        this(Boolean.FALSE, 86400L);
    }

    public EcDeliveryConfigModel(Boolean bool, Long l) {
        this.enableOpenDistrictSelectPage = bool;
        this.cacheDuration = l;
    }
}
