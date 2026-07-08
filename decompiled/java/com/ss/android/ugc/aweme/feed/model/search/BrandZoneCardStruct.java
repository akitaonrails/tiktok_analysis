package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandZoneCardStruct implements Serializable {

    @C09CT("dynamic_aweme_lists")
    public Map<String, ? extends List<?>> dynamicAwemeMaps;

    @C09CT("raw_ad_data")
    public AwemeRawAd rawAdData;

    public BrandZoneCardStruct() {
        this(null, null);
    }

    public final void setDynamicAwemeMaps(Map<String, ? extends List<?>> map) {
        this.dynamicAwemeMaps = map;
    }

    public final void setRawAdData(AwemeRawAd awemeRawAd) {
        this.rawAdData = awemeRawAd;
    }

    public BrandZoneCardStruct(AwemeRawAd awemeRawAd, Map<String, ? extends List<?>> map) {
        this.rawAdData = awemeRawAd;
        this.dynamicAwemeMaps = map;
    }
}
