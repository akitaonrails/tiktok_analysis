package com.bytedance.android.livesdk.livesetting.performance;

import X.C1100880eko;
import X.C1161920gLG;
import X.C1954807lC;
import X.EnumC1100890ekp;
import android.os.SystemClock;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_perf_auto_adaptive_params")
public final class LiveHostAutoAdaptiveParams {
    public static final LiveHostAutoAdaptiveParamsConfig DEFAULT;
    public static final LiveHostAutoAdaptiveParams INSTANCE = new LiveHostAutoAdaptiveParams();
    public static long disableLikeAvatarLastTime;
    public static long disableLikeBoomLastTime;
    public static long disableLikeBottomLastTime;
    public static long guideAnimationLastTime;
    public static long insertStickerAnimationLastTime;
    public static boolean isLiveHost;
    public static final boolean localTest;
    public static long multiGuestAnimationLastTime;
    public static final Map<String, Integer> statusMap;
    public static final LiveHostAutoAdaptiveParamsConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveHostAutoAdaptiveParamsConfig liveHostAutoAdaptiveParamsConfig = new LiveHostAutoAdaptiveParamsConfig(100, 2000, 2L);
        DEFAULT = liveHostAutoAdaptiveParamsConfig;
        LiveHostAutoAdaptiveParamsConfig liveHostAutoAdaptiveParamsConfig2 = (LiveHostAutoAdaptiveParamsConfig) SettingsManager.INSTANCE.getValueSafely(LiveHostAutoAdaptiveParams.class);
        if (liveHostAutoAdaptiveParamsConfig2 != null) {
            liveHostAutoAdaptiveParamsConfig = liveHostAutoAdaptiveParamsConfig2;
        }
        value = liveHostAutoAdaptiveParamsConfig;
        statusMap = new LinkedHashMap();
        localTest = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }

    public static final boolean disableALog() {
        return isLiveHost && INSTANCE.isDisable("alog") && !localTest;
    }

    public static final boolean disableApmLog() {
        return isLiveHost && INSTANCE.isDisable("apm_log") && !localTest;
    }

    public static final boolean disableLiveCenterAnim() {
        return isLiveHost && INSTANCE.isDisable("live_center_anim");
    }

    public static final boolean disablePreloadPublicScreenIcon() {
        return isLiveHost && INSTANCE.isDisable("consume_normal");
    }

    public static final void restore() {
        statusMap.clear();
    }

    public static final boolean disableGuideAnimation() {
        guideAnimationLastTime = SystemClock.uptimeMillis();
        return isLiveHost && INSTANCE.isDisable("guide_animation");
    }

    public static final boolean disableInsertStickerAnimation() {
        insertStickerAnimationLastTime = SystemClock.uptimeMillis();
        return isLiveHost && INSTANCE.isDisable("effect_insert");
    }

    public static final boolean disableMultiGuestAnimation() {
        multiGuestAnimationLastTime = SystemClock.uptimeMillis();
        return isLiveHost && INSTANCE.isDisable("multi_guest");
    }

    public static final LiveHostAutoAdaptiveParamsConfig getValue() {
        return value;
    }

    public final long getDisableLikeAvatarLastTime() {
        return disableLikeAvatarLastTime;
    }

    public final long getDisableLikeBoomLastTime() {
        return disableLikeBoomLastTime;
    }

    public final long getDisableLikeBottomLastTime() {
        return disableLikeBottomLastTime;
    }

    public final long getGuideAnimationLastTime() {
        return guideAnimationLastTime;
    }

    public final long getInsertStickerAnimationLastTime() {
        return insertStickerAnimationLastTime;
    }

    public final long getMultiGuestAnimationLastTime() {
        return multiGuestAnimationLastTime;
    }

    public final boolean isLiveHost() {
        return isLiveHost;
    }

    public final boolean isDisable(String str) {
        Integer num = statusMap.get(str);
        if (num == null || num.intValue() == 0) {
            return false;
        }
        return true;
    }

    public final void setDisableLikeAvatarLastTime(long j) {
        disableLikeAvatarLastTime = j;
    }

    public final void setDisableLikeBoomLastTime(long j) {
        disableLikeBoomLastTime = j;
    }

    public final void setDisableLikeBottomLastTime(long j) {
        disableLikeBottomLastTime = j;
    }

    public final void setGuideAnimationLastTime(long j) {
        guideAnimationLastTime = j;
    }

    public final void setInsertStickerAnimationLastTime(long j) {
        insertStickerAnimationLastTime = j;
    }

    public final void setLiveHost(boolean z) {
        isLiveHost = z;
    }

    public final void setMultiGuestAnimationLastTime(long j) {
        multiGuestAnimationLastTime = j;
    }

    public final void disable(EnumC1100890ekp enumC1100890ekp, String str) {
        int iIntValue;
        int i = C1100880eko.LIZ[enumC1100890ekp.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    i2 = 4;
                } else {
                    throw new C1954807lC();
                }
            }
        }
        Map<String, Integer> map = statusMap;
        Integer num = map.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(str, Integer.valueOf(i2 | iIntValue));
    }

    public final void enable(EnumC1100890ekp enumC1100890ekp, String str) {
        int iIntValue;
        int i = C1100880eko.LIZ[enumC1100890ekp.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    i2 = 4;
                } else {
                    throw new C1954807lC();
                }
            }
        }
        Map<String, Integer> map = statusMap;
        Integer num = map.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(str, Integer.valueOf((~i2) & iIntValue));
    }
}
