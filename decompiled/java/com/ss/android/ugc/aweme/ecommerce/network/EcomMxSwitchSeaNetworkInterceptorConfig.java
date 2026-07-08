package com.ss.android.ugc.aweme.ecommerce.network;

import X.C08CX;
import X.C09CT;
import X.C13LP;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomMxSwitchSeaNetworkInterceptorConfig {
    public static final Set<String> LIZ;
    public static final Set<String> LIZIZ;

    public static final class EcomMxSwitchSeaNetworkInterceptorModel {

        @C09CT("hosts")
        public String hosts;

        @C09CT("paths")
        public String paths;

        public EcomMxSwitchSeaNetworkInterceptorModel() {
            this("", "");
        }

        public EcomMxSwitchSeaNetworkInterceptorModel(String str, String str2) {
            this.hosts = str;
            this.paths = str2;
        }
    }

    static {
        EcomMxSwitchSeaNetworkInterceptorModel ecomMxSwitchSeaNetworkInterceptorModel = new EcomMxSwitchSeaNetworkInterceptorModel("", "");
        EcomMxSwitchSeaNetworkInterceptorModel ecomMxSwitchSeaNetworkInterceptorModel2 = (EcomMxSwitchSeaNetworkInterceptorModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_mx_net_interceptor_switch_config", EcomMxSwitchSeaNetworkInterceptorModel.class, ecomMxSwitchSeaNetworkInterceptorModel);
        if (ecomMxSwitchSeaNetworkInterceptorModel2 != null) {
            ecomMxSwitchSeaNetworkInterceptorModel = ecomMxSwitchSeaNetworkInterceptorModel2;
        }
        String str = ecomMxSwitchSeaNetworkInterceptorModel.hosts;
        LIZ = a0.LJJJIL(str) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
        String str2 = ecomMxSwitchSeaNetworkInterceptorModel.paths;
        LIZIZ = a0.LJJJIL(str2) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6));
    }
}
