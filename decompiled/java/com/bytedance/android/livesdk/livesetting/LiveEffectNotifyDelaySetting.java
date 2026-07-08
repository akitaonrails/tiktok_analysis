package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_delay")
public final class LiveEffectNotifyDelaySetting {
    public static final EffectNotifyDelayInfo DEFAULT;
    public static final LiveEffectNotifyDelaySetting INSTANCE = new LiveEffectNotifyDelaySetting();
    public static final EffectNotifyDelayInfo value;

    public static final class EffectNotifyDelayInfo {
        public static final TypeAdapter ADAPTER;

        @C09CT("banner_anchor")
        public int bannerAnchor;

        @C09CT("banner_audience")
        public int bannerAudience;

        @C09CT("mid_touch_anchor")
        public int midTouchAnchor;

        @C09CT("mid_touch_audience")
        public int midTouchAudience;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveEffectNotifyDelaySetting_EffectNotifyDelayInfo_OptTypeAdapter();
        }

        public EffectNotifyDelayInfo() {
            this(5000, 15000, 5000, 15000);
        }

        public EffectNotifyDelayInfo(int i, int i2, int i3, int i4) {
            this.bannerAudience = i;
            this.bannerAnchor = i2;
            this.midTouchAudience = i3;
            this.midTouchAnchor = i4;
        }
    }

    static {
        EffectNotifyDelayInfo effectNotifyDelayInfo = new EffectNotifyDelayInfo(5000, 15000, 5000, 15000);
        DEFAULT = effectNotifyDelayInfo;
        value = (EffectNotifyDelayInfo) SettingsManager.INSTANCE.getValueSafely("live_effect_notify_delay", effectNotifyDelayInfo);
    }

    public final int getBannerAnchorDelay() {
        EffectNotifyDelayInfo effectNotifyDelayInfo = value;
        if (effectNotifyDelayInfo == null || Integer.valueOf(effectNotifyDelayInfo.bannerAnchor) == null) {
            return 15000;
        }
        return effectNotifyDelayInfo.bannerAnchor;
    }

    public final int getBannerAudienceDelay() {
        EffectNotifyDelayInfo effectNotifyDelayInfo = value;
        if (effectNotifyDelayInfo == null || Integer.valueOf(effectNotifyDelayInfo.bannerAudience) == null) {
            return 5000;
        }
        return effectNotifyDelayInfo.bannerAudience;
    }

    public final int getMidTouchAnchorDelay() {
        EffectNotifyDelayInfo effectNotifyDelayInfo = value;
        if (effectNotifyDelayInfo == null || Integer.valueOf(effectNotifyDelayInfo.midTouchAnchor) == null) {
            return 15000;
        }
        return effectNotifyDelayInfo.midTouchAnchor;
    }

    public final int getMidTouchAudienceDelay() {
        EffectNotifyDelayInfo effectNotifyDelayInfo = value;
        if (effectNotifyDelayInfo == null || Integer.valueOf(effectNotifyDelayInfo.midTouchAudience) == null) {
            return 5000;
        }
        return effectNotifyDelayInfo.midTouchAudience;
    }
}
