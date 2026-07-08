package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C0C64;
import X.C1AF0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class EditEffectPanelSettings {
    public static final EditEffectSettingsModel LIZ = new EditEffectSettingsModel();

    public static final class EditEffectSettingsModel {

        @C09CT("panel_column")
        public int panelColumn = 4;

        @C09CT("auto_download_line")
        public int autoDownloadLine = 2;

        @C09CT("pre_download_size_after_click")
        public int preDownloadSize = 3;
    }

    public static final EditEffectSettingsModel LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EditEffectSettingsModel editEffectSettingsModel = LIZ;
            EditEffectSettingsModel editEffectSettingsModel2 = (EditEffectSettingsModel) c0c64LJIILLIIL.LJJII(EditEffectSettingsModel.class, editEffectSettingsModel, "edit_effect_panel_config", true);
            return editEffectSettingsModel2 != null ? editEffectSettingsModel2 : editEffectSettingsModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}
