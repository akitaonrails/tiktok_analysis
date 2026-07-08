package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("badge_cache_optimize_enable")
public final class BadgeCacheOptimizeEnableSetting {
    public static final BadgeCacheOptimizeEnableSetting INSTANCE = new BadgeCacheOptimizeEnableSetting();
    public static final BadgeCacheOptimizeParams DEFAULT = new BadgeCacheOptimizeParams(false, false, false, false, false, LSPassThroughRecordSizeConfig.DEFAULT, 300000, 5000);

    public static final long getCacheExpireTimeMs() {
        return INSTANCE.getConfig().cacheExpireTimeMs;
    }

    private final BadgeCacheOptimizeParams getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BadgeCacheOptimizeParams badgeCacheOptimizeParams = DEFAULT;
        BadgeCacheOptimizeParams badgeCacheOptimizeParams2 = (BadgeCacheOptimizeParams) settingsManager.getValueSafely("badge_cache_optimize_enable", badgeCacheOptimizeParams);
        return badgeCacheOptimizeParams2 != null ? badgeCacheOptimizeParams2 : badgeCacheOptimizeParams;
    }

    public static final int getMaxCacheSize() {
        return INSTANCE.getConfig().maxCacheSize;
    }

    public static final int getMemberCountThreshold() {
        return INSTANCE.getConfig().memberCountThreshold;
    }

    public static final boolean isAnchorEnabled() {
        return INSTANCE.getConfig().anchorEnable;
    }

    public static final boolean isAudienceEnabled() {
        return INSTANCE.getConfig().audienceEnable;
    }

    public static final boolean isDeferredCacheEnabled() {
        return INSTANCE.getConfig().deferredCacheEnable;
    }

    public static final boolean isEnabled() {
        BadgeCacheOptimizeEnableSetting badgeCacheOptimizeEnableSetting = INSTANCE;
        return badgeCacheOptimizeEnableSetting.getConfig().anchorEnable || badgeCacheOptimizeEnableSetting.getConfig().audienceEnable;
    }

    public static final boolean isOtherAudienceCacheEnabled() {
        return INSTANCE.getConfig().otherAudienceCacheEnable;
    }

    public static final boolean isSelfViewCacheEnabled() {
        return INSTANCE.getConfig().selfViewCacheEnable;
    }

    public final BadgeCacheOptimizeParams getDEFAULT() {
        return DEFAULT;
    }

    public static final class BadgeCacheOptimizeParams {
        public static final TypeAdapter ADAPTER = new BadgeCacheOptimizeEnableSetting_BadgeCacheOptimizeParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("anchor_enable")
        public boolean anchorEnable;

        @C09CT("audience_enable")
        public boolean audienceEnable;

        @C09CT("cache_expire_time_ms")
        public long cacheExpireTimeMs;

        @C09CT("deferred_cache_enable")
        public boolean deferredCacheEnable;

        @C09CT("max_cache_size")
        public int maxCacheSize;

        @C09CT("member_count_threshold")
        public int memberCountThreshold;

        @C09CT("other_audience_cache_enable")
        public boolean otherAudienceCacheEnable;

        @C09CT("self_view_cache_enable")
        public boolean selfViewCacheEnable;

        public BadgeCacheOptimizeParams() {
            this(false, false, false, false, false, LSPassThroughRecordSizeConfig.DEFAULT, 300000L, 5000);
        }

        public BadgeCacheOptimizeParams(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, long j, int i2) {
            this.anchorEnable = z;
            this.audienceEnable = z2;
            this.selfViewCacheEnable = z3;
            this.otherAudienceCacheEnable = z4;
            this.deferredCacheEnable = z5;
            this.maxCacheSize = i;
            this.cacheExpireTimeMs = j;
            this.memberCountThreshold = i2;
        }
    }
}
