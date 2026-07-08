package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_lynx_banner_allowlist_config")
public final class LiveLynxBannerReverseAllowListSetting {
    public static final LiveLynxBannerReverseAllowListSetting INSTANCE = new LiveLynxBannerReverseAllowListSetting();
    public static final BannerLynxAllowListConfig DEFAULT = new BannerLynxAllowListConfig(null, null, 3, null);

    public final BannerLynxAllowListConfig config() {
        BannerLynxAllowListConfig bannerLynxAllowListConfig = (BannerLynxAllowListConfig) SettingsManager.INSTANCE.getValueSafely(LiveLynxBannerReverseAllowListSetting.class);
        return bannerLynxAllowListConfig == null ? DEFAULT : bannerLynxAllowListConfig;
    }

    public static final class BannerLynxAllowListConfig {
        public static final TypeAdapter ADAPTER = new LiveLynxBannerReverseAllowListSetting_BannerLynxAllowListConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("allowlist_activity_ids")
        public List<String> activityIds;

        @C09CT("allowlist_banner_ids")
        public List<String> bannerIds;

        public BannerLynxAllowListConfig() {
            this(null, null, 3, null);
        }

        public final List<String> getActivityIds() {
            return this.activityIds;
        }

        public final List<String> getBannerIds() {
            return this.bannerIds;
        }

        public final void setActivityIds(List<String> list) {
            this.activityIds = list;
        }

        public final void setBannerIds(List<String> list) {
            this.bannerIds = list;
        }

        public BannerLynxAllowListConfig(List<String> list, List<String> list2) {
            this.bannerIds = list;
            this.activityIds = list2;
        }

        public BannerLynxAllowListConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
