package com.ss.android.ugc.nearby.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyTabConfig {
    public static final Config LIZ = new Config(false, null, null, null);

    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("nearby_tab_revamp_config", Config.class, LIZ);
        return config == null ? new Config(false, null, null, null) : config;
    }

    public static final class Config {

        @C09CT("content_region")
        public final LocationRegion contentRegion;

        @C09CT("current_region")
        public final LocationRegion currentRegion;

        @C09CT("fallback_content_type")
        public final String isRecallNearbyTab;

        @C09CT("nearby_roaming_enable")
        public final boolean nearbyRoamingEnable;

        public Config() {
            this(false, null, null, null);
        }

        public Config(boolean z, LocationRegion locationRegion, String str, LocationRegion locationRegion2) {
            this.nearbyRoamingEnable = z;
            this.currentRegion = locationRegion;
            this.isRecallNearbyTab = str;
            this.contentRegion = locationRegion2;
        }
    }
}
