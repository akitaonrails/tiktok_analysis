package com.ss.android.ugc.tiktok.report.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes22.dex */
public final class ReportUrlSettings {

    public static final class Config {

        @C09CT("report_url")
        public final String commonReportUrl;

        @C09CT("ecommerce_review_report_url")
        public final String ecommerceReportReviewUrl;

        @C09CT("ecommerce_report_url")
        public final String ecommerceReportUrl;

        @C09CT("search_web_inapp_report_url")
        public final String searchWebInappReportUrl;

        public Config() {
            this("", "", "", "");
        }

        public Config(String str, String str2, String str3, String str4) {
            this.commonReportUrl = str;
            this.ecommerceReportUrl = str2;
            this.ecommerceReportReviewUrl = str3;
            this.searchWebInappReportUrl = str4;
        }
    }

    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("report_sdk_url_configuration", Config.class, null);
        return config == null ? new Config("", "", "", "") : config;
    }
}
