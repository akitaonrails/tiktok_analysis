package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiWebViewGneSettings {
    public static final WebViewSchemaConfigModel LIZ = new WebViewSchemaConfigModel(new LinkedHashMap());

    public static String LIZ() {
        SchemaConfig schemaConfig;
        String str;
        Map<String, SchemaConfig> map = LIZJ().schemaConfig;
        return (map == null || (schemaConfig = map.get("poi_report_page_url")) == null || (str = schemaConfig.schema) == null) ? "aweme://webview_popup?height=80%25&show_mask=1&show_loading=0&popup_enter_type=bottom&disable_swipe=1&mask_bg_color=00000080&use_spark=1" : str;
    }

    public static String LIZIZ() {
        SchemaConfig schemaConfig;
        String str;
        Map<String, SchemaConfig> map = LIZJ().schemaConfig;
        return (map == null || (schemaConfig = map.get("poi_report_page_url")) == null || (str = schemaConfig.url) == null) ? "https://feedback.tiktokv.com/gne/report?_pia_=1" : str;
    }

    public static final WebViewSchemaConfigModel LIZJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        WebViewSchemaConfigModel webViewSchemaConfigModel = LIZ;
        WebViewSchemaConfigModel webViewSchemaConfigModel2 = (WebViewSchemaConfigModel) settingsManagerLIZLLL.LJIIIIZZ("tiktok_poi_webview_gne", WebViewSchemaConfigModel.class, webViewSchemaConfigModel);
        return webViewSchemaConfigModel2 != null ? webViewSchemaConfigModel2 : webViewSchemaConfigModel;
    }

    public static final class WebViewSchemaConfigModel {

        @C09CT("webview_schema_config")
        public final Map<String, SchemaConfig> schemaConfig;

        public WebViewSchemaConfigModel() {
            this(null);
        }

        public WebViewSchemaConfigModel(Map<String, SchemaConfig> map) {
            this.schemaConfig = map;
        }
    }

    public static final class SchemaConfig {

        @C09CT("schema")
        public final String schema;

        @C09CT("url")
        public final String url;

        public SchemaConfig() {
            this(null, null);
        }

        public SchemaConfig(String str, String str2) {
            this.schema = str;
            this.url = str2;
        }
    }
}
