package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommonSettingsConfig {

    @C09CT("gecko_sync_channel")
    public final PoiGeckoSyncChannels geckoSyncChannels;

    public PoiCommonSettingsConfig() {
        this(null);
    }

    public PoiCommonSettingsConfig(PoiGeckoSyncChannels poiGeckoSyncChannels) {
        this.geckoSyncChannels = poiGeckoSyncChannels;
    }
}
