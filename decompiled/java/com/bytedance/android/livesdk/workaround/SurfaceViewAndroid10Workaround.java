package com.bytedance.android.livesdk.workaround;

import X.C1697810uHb;
import android.os.Build;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("surfaceview_android10_workaround")
public final class SurfaceViewAndroid10Workaround {
    public static final SurfaceViewAndroid10Workaround INSTANCE = new SurfaceViewAndroid10Workaround();
    public static final Options DEFAULT = new Options(false, false, false, false, false, false, false, C1697810uHb.LJIIJJI("sm-j260m", "sm-j260f", "sm-a260f", "sm-g570m", "sm-a260g", "sm-g950f", "cph 1901"), C1697810uHb.LJIIJJI("rmx3231", "sm-j400f", "tecno bd4", "nokia c01 plus", "sm-j400m", "zte blade a31 plus", "sm-a032f", "sm-a032m", "i85", "blu g52l", "sky elite n55max", "noolah_mobile p11", "sm-j410g", "sm-j410f", "sm-j260mu", "moto e5 play", "sm-j260m", "samsung-sm-j327a", "sm-j327w", "tfy-lx2", "cma-lx2", "tfy-lx3", "cma-lx3", "hey-w09", "any-lx3", "tfy-lx1", "redmi 8a", "redmi 7a", "redmi 8a dual", "lm-k200"));

    private final Options getOptimizeConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Options options = DEFAULT;
        Options options2 = (Options) settingsManager.getValueSafely("surfaceview_android10_workaround", options);
        return options2 != null ? options2 : options;
    }

    public static final boolean isFurtherOptimizePositionChangeProxy() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optFurtherPositionChange;
        }
        return false;
    }

    public static final boolean isOptimizePositionChangeProxy() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optPositionChange;
        }
        return false;
    }

    public static final boolean isProxyPositionChangeListenerEnableMainSurfaceValidation() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.enableViewRootJudge;
        }
        return false;
    }

    public static final boolean isProxyPositionChangeListenerOfSurfaceViewOtherPlan() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optOtherPlan;
        }
        return false;
    }

    public final boolean isHardWareBlockModels() {
        Options optimizeConfig = getOptimizeConfig();
        return optimizeConfig != null && optimizeConfig.optEnablePreviewPositionChange && Build.VERSION.SDK_INT == 26 && getOptimizeConfig().hardwareBlockModels.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public final boolean isProxyPositionChangeListenerOfSurfaceView() {
        Options optimizeConfig = getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optEnablePositionChange;
        }
        return false;
    }

    public final boolean isProxyPreviewPositionChangeListenerOfSurfaceView() {
        List<String> list;
        Options optimizeConfig = getOptimizeConfig();
        boolean z = optimizeConfig != null ? optimizeConfig.optEnablePreviewPositionChange : false;
        Options optimizeConfig2 = getOptimizeConfig();
        return z && !((optimizeConfig2 == null || (list = optimizeConfig2.surfaceviewBlockModels) == null) ? false : list.contains(Build.MODEL.toLowerCase(Locale.ROOT)));
    }

    public final boolean removeTransLogic() {
        return getOptimizeConfig().removeTransLogic;
    }

    public final Options getDEFAULT() {
        return DEFAULT;
    }
}
