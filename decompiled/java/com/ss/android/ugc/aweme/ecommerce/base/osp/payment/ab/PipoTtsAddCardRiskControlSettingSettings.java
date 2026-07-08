package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsAddCardRiskControlSettingSettings {
    public static final PipoTtsAddCardRiskControlSettingModel LIZ = new PipoTtsAddCardRiskControlSettingModel(false, false, null, 7, null);
    public static final boolean LIZIZ;

    static {
        LIZ();
        LIZIZ = LIZ().enableRiskTracking;
    }

    public static final PipoTtsAddCardRiskControlSettingModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsAddCardRiskControlSettingModel pipoTtsAddCardRiskControlSettingModel = LIZ;
        PipoTtsAddCardRiskControlSettingModel pipoTtsAddCardRiskControlSettingModel2 = (PipoTtsAddCardRiskControlSettingModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_add_card_risk_control_setting", PipoTtsAddCardRiskControlSettingModel.class, pipoTtsAddCardRiskControlSettingModel);
        return pipoTtsAddCardRiskControlSettingModel2 != null ? pipoTtsAddCardRiskControlSettingModel2 : pipoTtsAddCardRiskControlSettingModel;
    }

    public static final class PipoTtsAddCardRiskControlSettingModel {

        @C09CT("enable_pre_risk_control")
        public boolean enablePreRiskControl;

        @C09CT("enable_risk_tracking")
        public boolean enableRiskTracking;

        @C09CT("pi_black_list")
        public List<String> piBlackList;

        public PipoTtsAddCardRiskControlSettingModel() {
            this(false, false, null, 7, null);
        }

        public PipoTtsAddCardRiskControlSettingModel(boolean z, boolean z2, List<String> list) {
            this.enablePreRiskControl = z;
            this.enableRiskTracking = z2;
            this.piBlackList = list;
        }

        public PipoTtsAddCardRiskControlSettingModel(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
