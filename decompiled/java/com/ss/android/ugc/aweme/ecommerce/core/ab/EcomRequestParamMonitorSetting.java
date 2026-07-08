package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomRequestParamMonitorSetting {
    public static final EcomRequestParamsMonitorModel LIZ = new EcomRequestParamsMonitorModel(Boolean.FALSE, null, 2, null);

    public static final EcomRequestParamsMonitorModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomRequestParamsMonitorModel ecomRequestParamsMonitorModel = LIZ;
            EcomRequestParamsMonitorModel ecomRequestParamsMonitorModel2 = (EcomRequestParamsMonitorModel) settingsManagerLIZLLL.LJIIIIZZ("ttec_request_parameter_monitor", EcomRequestParamsMonitorModel.class, ecomRequestParamsMonitorModel);
            return ecomRequestParamsMonitorModel2 != null ? ecomRequestParamsMonitorModel2 : ecomRequestParamsMonitorModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class EcomRequestParamsMonitorModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("rules")
        public final List<String> rules;

        public EcomRequestParamsMonitorModel(Boolean bool, List<String> list) {
            this.enable = bool;
            this.rules = list;
        }

        public EcomRequestParamsMonitorModel(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
