package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class KidsApplogAllowKeysModel {

    @C09CT("ignore_list")
    public final List<String> ignoreList;

    public KidsApplogAllowKeysModel() {
        this(C1697810uHb.LJIIJJI("uoo", "idfa", "webcast_language", "webcast_locale", "content_language", "allow_sell_data", "longitude", "webcast_sdk_version", "gaid", "gps_access", "address_book_access", "city", "city_name", "latitude", "ad_personality_mode", "search_source", "show_location", "mac_address", "google_aid", "android_id", "bid_ad_params", "ad_user_agent", "ssid", "openudid", "idfv", "vid", "clientudid"));
    }

    public KidsApplogAllowKeysModel(List<String> list) {
        this.ignoreList = list;
    }
}
