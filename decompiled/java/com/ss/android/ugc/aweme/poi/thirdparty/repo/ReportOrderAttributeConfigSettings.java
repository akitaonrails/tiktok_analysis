package com.ss.android.ugc.aweme.poi.thirdparty.repo;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
public final class ReportOrderAttributeConfigSettings {
    public static final ReportOrderAttributeConfigSettings INSTANCE = new ReportOrderAttributeConfigSettings();
    public static final ReportOrderAttributeConfig DEFAULT_GROUP = new ReportOrderAttributeConfig(Boolean.TRUE, 3);

    public final ReportOrderAttributeConfig config() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ReportOrderAttributeConfig reportOrderAttributeConfig = DEFAULT_GROUP;
        ReportOrderAttributeConfig reportOrderAttributeConfig2 = (ReportOrderAttributeConfig) settingsManagerLIZLLL.LJIIIIZZ("report_order_attribute_config", ReportOrderAttributeConfig.class, reportOrderAttributeConfig);
        return reportOrderAttributeConfig2 != null ? reportOrderAttributeConfig2 : reportOrderAttributeConfig;
    }

    public final ReportOrderAttributeConfig getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }

    public static final class ReportOrderAttributeConfig {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("retry_count")
        public final Integer retryCount;

        public ReportOrderAttributeConfig() {
            this(null, null);
        }

        public ReportOrderAttributeConfig(Boolean bool, Integer num) {
            this.enable = bool;
            this.retryCount = num;
        }
    }
}
