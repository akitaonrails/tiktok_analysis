package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_picture_mem_opt")
public final class LiveBroadcastPictureMemOpt {
    public static final LiveBroadcastPicMemOpt DEFAULT;
    public static final LiveBroadcastPictureMemOpt INSTANCE;
    public static Runnable cleanFrescoAnimationCacheTask;
    public static final long delayTime;
    public static Pair<Integer, Integer> effectIconSize;
    public static boolean isAnchor;
    public static final C01GW solidifyValue$delegate;
    public static final LiveBroadcastPicMemOpt value;

    public static /* synthetic */ void getCleanFrescoAnimationCacheTask$annotations() {
    }

    public static /* synthetic */ void getDelayTime$annotations() {
    }

    static {
        LiveBroadcastPictureMemOpt liveBroadcastPictureMemOpt = new LiveBroadcastPictureMemOpt();
        INSTANCE = liveBroadcastPictureMemOpt;
        solidifyValue$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(144));
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = new LiveBroadcastPicMemOpt();
        DEFAULT = liveBroadcastPicMemOpt;
        LiveBroadcastPicMemOpt solidifyValue = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_broadcast_picture_mem_opt") ? liveBroadcastPictureMemOpt.getSolidifyValue() : (LiveBroadcastPicMemOpt) SettingsManager.INSTANCE.getValueSafely("live_broadcast_picture_mem_opt", liveBroadcastPicMemOpt);
        if (solidifyValue != null) {
            liveBroadcastPicMemOpt = solidifyValue;
        }
        value = liveBroadcastPicMemOpt;
        delayTime = liveBroadcastPicMemOpt.delayTime;
        cleanFrescoAnimationCacheTask = new Runnable() { // from class: X.0L5A
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBroadcastPictureMemOpt@6f8b.cleanFrescoAnimationCacheTask$1");
                try {
                    if (LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache()) {
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0L59(null), 2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBroadcastPictureMemOpt@6f8b.cleanFrescoAnimationCacheTask$1");
            }
        };
    }

    public static final boolean fitEffectPanelIconSize() {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = value;
        return liveBroadcastPicMemOpt.enable && liveBroadcastPicMemOpt.fitEffectPanelIconSize;
    }

    public static final boolean fitStickerPanelImageSize() {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = value;
        return liveBroadcastPicMemOpt.enable && liveBroadcastPicMemOpt.fitStickerPanelImageSize;
    }

    public static final boolean forbidPreloadInvalidGecko() {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = value;
        return liveBroadcastPicMemOpt.enable && liveBroadcastPicMemOpt.forbidPreloadInvalidGecko;
    }

    public static final boolean frescoLoadPicEnableInSample() {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = value;
        return liveBroadcastPicMemOpt.enable && liveBroadcastPicMemOpt.frescoLoadPicEnableInSample && isAnchor;
    }

    private final LiveBroadcastPicMemOpt getSolidifyValue() {
        return (LiveBroadcastPicMemOpt) solidifyValue$delegate.getValue();
    }

    public static final boolean optGeckoWebPAnimationCache() {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = value;
        return liveBroadcastPicMemOpt.enable && liveBroadcastPicMemOpt.optGeckoWebPAnimationCache;
    }

    public static final Runnable getCleanFrescoAnimationCacheTask() {
        return cleanFrescoAnimationCacheTask;
    }

    public static final long getDelayTime() {
        return delayTime;
    }

    public final Pair<Integer, Integer> getEffectIconSize() {
        return effectIconSize;
    }

    public final boolean isAnchor() {
        return isAnchor;
    }

    public static final void cleanGeckoWebPResources(Function0<Unit> function0) {
        if (optGeckoWebPAnimationCache()) {
            function0.invoke();
        }
    }

    public static final void setCleanFrescoAnimationCacheTask(Runnable runnable) {
        cleanFrescoAnimationCacheTask = runnable;
    }

    public final void setAnchor(boolean z) {
        isAnchor = z;
    }

    public final void setEffectIconSize(Pair<Integer, Integer> pair) {
        effectIconSize = pair;
    }
}
