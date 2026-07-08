package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class EcVmSdkConfigSettings {
    public static final EcVmSdkConfigModel LIZ = new EcVmSdkConfigModel(null, null, null, false, false, false, null);

    public static final EcVmSdkConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcVmSdkConfigModel ecVmSdkConfigModel = LIZ;
        EcVmSdkConfigModel ecVmSdkConfigModel2 = (EcVmSdkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_vmsdk_config", EcVmSdkConfigModel.class, ecVmSdkConfigModel);
        return ecVmSdkConfigModel2 != null ? ecVmSdkConfigModel2 : ecVmSdkConfigModel;
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class EcVmSdkConfigModel {

        @C09CT("access_key_online")
        public final String accessKeyOnline;

        @C09CT("access_key_ppe")
        public final String accessKeyPPE;

        @C09CT("ecvm_base_config")
        public final String ecvmBaseConfig;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_common_check_api")
        public final boolean enableCommonCheckApi;

        @C09CT("enable_common_check_route")
        public final boolean enableCommonCheckRoute;

        @C09CT("param_common_check")
        public final String paramCommonCheck;

        public EcVmSdkConfigModel() {
            this(null, null, null, false, false, false, null);
        }

        public EcVmSdkConfigModel(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
            this.accessKeyOnline = str;
            this.accessKeyPPE = str2;
            this.ecvmBaseConfig = str3;
            this.enable = z;
            this.enableCommonCheckApi = z2;
            this.enableCommonCheckRoute = z3;
            this.paramCommonCheck = str4;
        }
    }
}
