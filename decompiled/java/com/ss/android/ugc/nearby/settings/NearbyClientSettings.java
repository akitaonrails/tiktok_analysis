package com.ss.android.ugc.nearby.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyClientSettings {
    public static final NearbyRevampSettingsModel LIZ = new NearbyRevampSettingsModel(null, null, null, true, true, 259200, null, null, null);

    public static long LIZ() {
        NoInterestGpsPopupIntreval noInterestGpsPopupIntreval;
        Long l;
        Map<String, NoInterestGpsPopupIntreval> map = LIZIZ().noInterestGpsPopupIntrevalMap;
        if (map == null || (noInterestGpsPopupIntreval = map.get("LowInterestType")) == null || (l = noInterestGpsPopupIntreval.afterClickIntervalSeconds) == null) {
            return 604800000L;
        }
        return l.longValue();
    }

    public static final NearbyRevampSettingsModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        NearbyRevampSettingsModel nearbyRevampSettingsModel = LIZ;
        NearbyRevampSettingsModel nearbyRevampSettingsModel2 = (NearbyRevampSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("ttls_nearby_tab_revamp_settings", NearbyRevampSettingsModel.class, nearbyRevampSettingsModel);
        return nearbyRevampSettingsModel2 != null ? nearbyRevampSettingsModel2 : nearbyRevampSettingsModel;
    }

    public static final class NoInterestGpsPopupIntreval {

        @C09CT("no_popup_time")
        public final Long afterClickIntervalSeconds;

        @C09CT("max_show_count")
        public final Integer authorizeShowFrequency;

        public NoInterestGpsPopupIntreval(Long l, Integer num) {
            this.afterClickIntervalSeconds = l;
            this.authorizeShowFrequency = num;
        }
    }

    public static final class NoticeInterval {

        @C09CT("after_click_interval_seconds")
        public final Long afterClickIntervalSeconds;

        @C09CT("default_interval_seconds")
        public final Long defaultIntervalSecond;

        public NoticeInterval(Long l, Long l2) {
            this.afterClickIntervalSeconds = l;
            this.defaultIntervalSecond = l2;
        }
    }

    public static final class BannerCardInterval {

        @C09CT("after_click_interval_seconds")
        public final Long afterClickIntervalSeconds;

        @C09CT("authorize_show_frequency")
        public final Integer authorizeShowFrequency;

        @C09CT("default_interval_seconds")
        public final Long defaultIntervalSecond;

        public BannerCardInterval(Long l, Integer num, Long l2) {
            this.afterClickIntervalSeconds = l;
            this.authorizeShowFrequency = num;
            this.defaultIntervalSecond = l2;
        }
    }

    public static final class LocationFeedbackCardInterval {

        @C09CT("no_popup_time")
        public final Long afterClickIntervalTime;

        @C09CT("max_show_count")
        public final Integer authorizeShowFrequency;

        @C09CT("enter_nearby_time")
        public final Long enterNearbyIntervalTime;

        public LocationFeedbackCardInterval(Integer num, Long l, Long l2) {
            this.authorizeShowFrequency = num;
            this.afterClickIntervalTime = l;
            this.enterNearbyIntervalTime = l2;
        }
    }

    public static final class NearbyRevampSettingsModel {

        @C09CT("nearby_bottom_banner_type_interval")
        public final Map<String, BannerCardInterval> bottomBannerTypeIntervalMap;

        @C09CT("nearby_revamp_cache_enable")
        public final boolean enableCache;

        @C09CT("nearby_revamp_preload_enable")
        public final boolean enablePreload;

        @C09CT("nearby_insert_card_type_interval")
        public final Map<String, LocationFeedbackCardInterval> insertCardTypeIntervalMap;

        @C09CT("learn_more_url_intro_android")
        public final String learnMoreUrlIntroAndroid;

        @C09CT("nearby_gps_popup_interval")
        public final Map<String, NoInterestGpsPopupIntreval> noInterestGpsPopupIntrevalMap;

        @C09CT("notices_type_interval")
        public final Map<String, NoticeInterval> noticeTypeIntervalMap;

        @C09CT("nearby_roaming_seconds")
        public final int roamingSeconds;

        @C09CT("nearby_tab_max_length")
        public final Integer tabMaxLength;

        public NearbyRevampSettingsModel() {
            this(null, null, null, true, true, 259200, null, null, null);
        }

        public NearbyRevampSettingsModel(String str, Map<String, NoticeInterval> map, Integer num, boolean z, boolean z2, int i, Map<String, BannerCardInterval> map2, Map<String, LocationFeedbackCardInterval> map3, Map<String, NoInterestGpsPopupIntreval> map4) {
            this.learnMoreUrlIntroAndroid = str;
            this.noticeTypeIntervalMap = map;
            this.tabMaxLength = num;
            this.enablePreload = z;
            this.enableCache = z2;
            this.roamingSeconds = i;
            this.bottomBannerTypeIntervalMap = map2;
            this.insertCardTypeIntervalMap = map3;
            this.noInterestGpsPopupIntrevalMap = map4;
        }
    }
}
