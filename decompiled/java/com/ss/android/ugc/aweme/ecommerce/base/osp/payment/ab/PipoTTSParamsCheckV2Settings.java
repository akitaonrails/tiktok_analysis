package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTTSParamsCheckV2Settings {
    public static final PipoParamsCheckV2Config LIZ = new PipoParamsCheckV2Config(C2097608Jq.LJ());

    public static final class PipoParamsCheckV2Config {

        @C09CT("enabled_strategies")
        public final Map<String, String> enabledStrategies;

        public PipoParamsCheckV2Config() {
            this(C2097608Jq.LJ());
        }

        public PipoParamsCheckV2Config(Map<String, String> map) {
            this.enabledStrategies = map;
        }
    }

    public static String LIZ(String str) {
        Map<String, String> map;
        PipoParamsCheckV2Config pipoParamsCheckV2Config = (PipoParamsCheckV2Config) SettingsManager.LIZLLL().LJIIIIZZ("pipo_params_check_v2_tts_settings", PipoParamsCheckV2Config.class, LIZ);
        if (pipoParamsCheckV2Config != null && (map = pipoParamsCheckV2Config.enabledStrategies) != null) {
            return map.get(str);
        }
        return null;
    }
}
