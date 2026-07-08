package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C497740JfY;
import X.C931820aM8;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("livesdk_linkmic_float_window_optimize_v2")
public final class LivesdkLinkmicFloatWindowOptimizeSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final int ROUND_CORNER_WITHOUT_BRODER_V3 = 3;
    public static final int ROUND_CORNER_WITH_BORDER_V1 = 1;
    public static final int ROUND_CORNER_WITH_BRODER_V2 = 2;
    public static final LivesdkLinkmicFloatWindowOptimizeSetting INSTANCE = new LivesdkLinkmicFloatWindowOptimizeSetting();
    public static final double CORNER_RADIUS_PX = (int) C497740JfY.LIZIZ(8.0f);
    public static final int STROKE_WIDTH = (int) C497740JfY.LIZIZ(1.5f);

    public final boolean enableAnchorMixStream() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_floating_layout_opt_style_v2") != 0;
    }

    public final int getAnchorValue() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_floating_layout_opt_style_v2");
    }

    public final int getAudienceValue() {
        Integer numLJ = C931820aM8.LJ("linkmic_floating_layout_opt_style_v2");
        if (numLJ != null) {
            return numLJ.intValue();
        }
        return 0;
    }

    public final double getCORNER_RADIUS_PX() {
        return CORNER_RADIUS_PX;
    }

    public final int getSTROKE_WIDTH() {
        return STROKE_WIDTH;
    }

    public final boolean isV0(boolean z) {
        if (z) {
            if (getAnchorValue() == 0) {
                return true;
            }
            return false;
        }
        if (getAudienceValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isV1(boolean z) {
        if (z) {
            if (getAnchorValue() != 1) {
                return false;
            }
        } else if (getAudienceValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isV2(boolean z) {
        if (z) {
            if (getAnchorValue() == 2) {
                return true;
            }
            return false;
        }
        if (getAudienceValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isV3(boolean z) {
        if (z) {
            if (getAnchorValue() == 3) {
                return true;
            }
            return false;
        }
        if (getAudienceValue() == 3) {
            return true;
        }
        return false;
    }
}
