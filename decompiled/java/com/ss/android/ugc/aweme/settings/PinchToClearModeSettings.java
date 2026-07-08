package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes12.dex */
public final class PinchToClearModeSettings {
    public static final PinchToClearModeSettingsModel LIZ = new PinchToClearModeSettingsModel(1.1f, 1.0f, 4.0f, 0.5f);

    public static final class PinchToClearModeSettingsModel {

        @C09CT("enter_clear_mode_scale")
        public final float enterScale;

        @C09CT("exit_clear_mode_scale")
        public final float exitScale;

        @C09CT("max_scale")
        public final float maxScale;

        @C09CT("min_scale")
        public final float minScale;

        public PinchToClearModeSettingsModel() {
            this(1.1f, 1.0f, 4.0f, 0.5f);
        }

        public PinchToClearModeSettingsModel(float f, float f2, float f3, float f4) {
            this.enterScale = f;
            this.exitScale = f2;
            this.maxScale = f3;
            this.minScale = f4;
        }
    }

    public static final PinchToClearModeSettingsModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PinchToClearModeSettingsModel pinchToClearModeSettingsModel = LIZ;
        PinchToClearModeSettingsModel pinchToClearModeSettingsModel2 = (PinchToClearModeSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("pinch_to_clear_mode_settings", PinchToClearModeSettingsModel.class, pinchToClearModeSettingsModel);
        return pinchToClearModeSettingsModel2 != null ? pinchToClearModeSettingsModel2 : pinchToClearModeSettingsModel;
    }
}
