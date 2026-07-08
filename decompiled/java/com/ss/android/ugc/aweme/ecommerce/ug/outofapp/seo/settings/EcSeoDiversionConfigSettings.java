package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSeoDiversionConfigSettings {
    public static final EcSeoDiversionConfigModel LIZ = new EcSeoDiversionConfigModel(0, null, null, null, 1, null, null);

    public static final EcSeoDiversionConfigModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcSeoDiversionConfigModel ecSeoDiversionConfigModel = LIZ;
            EcSeoDiversionConfigModel ecSeoDiversionConfigModel2 = (EcSeoDiversionConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_seo_diversion_config", EcSeoDiversionConfigModel.class, ecSeoDiversionConfigModel);
            return ecSeoDiversionConfigModel2 != null ? ecSeoDiversionConfigModel2 : ecSeoDiversionConfigModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }

    public static final class CommonPathConfig {

        @C09CT("fallback_schema")
        public final String fallbackSchema;

        @C09CT("need_diversion")
        public final Integer needDiversion;

        @C09CT("host_path")
        public final String path;

        public CommonPathConfig() {
            this(null, 0, null);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommonPathConfig(path=");
            sbLIZ.append(this.path);
            sbLIZ.append(", needDiversion=");
            sbLIZ.append(this.needDiversion);
            sbLIZ.append(", fallbackSchema=");
            sbLIZ.append(this.fallbackSchema);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CommonPathConfig(String str, Integer num, String str2) {
            this.path = str;
            this.needDiversion = num;
            this.fallbackSchema = str2;
        }
    }

    public static final class EcSeoDiversionConfigModel {

        @C09CT("default_path_config")
        public final CommonPathConfig defaultPathConfig;

        @C09CT("default_search_schema")
        public final String defaultSearchSchema;

        @C09CT("max_wait_time")
        public final Long maxWaitTime;

        @C09CT("path_config_list")
        public final List<CommonPathConfig> pathConfigList;

        @C09CT("seo_channel_key_list")
        public final List<String> seoChannelKeyList;

        @C09CT("seo_enable")
        public final Integer seoEnable;

        @C09CT("seo_pdp_channel_check_optimize_enable")
        public final Integer seoPdpChannelCheckOptimizeEnable;

        public EcSeoDiversionConfigModel() {
            this(0, null, null, null, 1, null, null);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcSeoDiversionConfigModel(seoEnable=");
            sbLIZ.append(this.seoEnable);
            sbLIZ.append(", seoChannelKeyList=");
            sbLIZ.append(this.seoChannelKeyList);
            sbLIZ.append(", maxWaitTime=");
            sbLIZ.append(this.maxWaitTime);
            sbLIZ.append(", defaultSearchSchema=");
            sbLIZ.append(this.defaultSearchSchema);
            sbLIZ.append(", seoPdpChannelCheckOptimizeEnable=");
            sbLIZ.append(this.seoPdpChannelCheckOptimizeEnable);
            sbLIZ.append(", pathConfigList=");
            sbLIZ.append(this.pathConfigList);
            sbLIZ.append(", defaultPathConfig=");
            sbLIZ.append(this.defaultPathConfig);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcSeoDiversionConfigModel(Integer num, List<String> list, Long l, String str, Integer num2, List<CommonPathConfig> list2, CommonPathConfig commonPathConfig) {
            this.seoEnable = num;
            this.seoChannelKeyList = list;
            this.maxWaitTime = l;
            this.defaultSearchSchema = str;
            this.seoPdpChannelCheckOptimizeEnable = num2;
            this.pathConfigList = list2;
            this.defaultPathConfig = commonPathConfig;
        }
    }
}
