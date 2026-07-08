package com.bytedance.lynx.hybrid.webkit.ttwebview;

import X.C09CT;
import com.google.gson.h;
import com.google.gson.n;

/* JADX INFO: loaded from: classes24.dex */
public class TTWebViewStatusModel {

    @C09CT("allow_bid_list")
    public h allowBidList;

    @C09CT("allow_url_list")
    public h allowUrlList;

    @C09CT("block_bid_list")
    public h blockBidList;

    @C09CT("block_url_list")
    public h blockUrlList;

    @C09CT("browser_pre_init_delay_time")
    public Long browserPreInitDelayTime;

    @C09CT("cookie_dir_trace_rate")
    public float cookieDirTraceRate;

    @C09CT("disable_uninstall_by_sdk")
    public boolean disableUninstall;

    @C09CT("enable_add_document_js")
    public boolean enableAddDocumentJS;

    @C09CT("iframe_js_inject_optimize")
    public boolean enableOptimizeIframeJSInjection;

    @C09CT("js_inject_preload")
    public boolean enablePreloadJSInjection;

    @C09CT("enable_resource_event_report")
    public boolean enableResourceEventReport;

    @C09CT("enable_ttweb_ttnet_res_load")
    public boolean enableTTNetLoad;

    @C09CT("enable_web_provider_report")
    public boolean enableWebProviderReport;

    @C09CT("enable_web_statics_report")
    public boolean enableWebStaticsReport;

    @C09CT("enable_web_trace_report")
    public boolean enableWebTraceReport;

    @C09CT("enable_cellular")
    public boolean isCellularEnabled;

    @C09CT("clear")
    public boolean isClear;

    @C09CT("enable_download")
    public boolean isDownloadEnabled;

    @C09CT("enable_ttwebview")
    public boolean isTTWebViewEnabled;

    @C09CT("max_supported_cookie_db_version")
    public int maxSupportedCookieDBVersion;

    @C09CT("min_supported_cookie_db_version")
    public int minSupportedCookieDBVersion;

    @C09CT("optimize_offline_response")
    public boolean optimizeOfflineResponse;

    @C09CT("prerender_delay_time")
    public Long prerenderDelayTime;

    @C09CT("ttweb_config")
    public n ttwebConfig;

    @C09CT("version_config")
    public n versionConfig;

    @C09CT("report_web_error_rate")
    public float webViewErrorReportRate;

    @C09CT("storage_threshold")
    public long storageThreshold = 524288000;

    @C09CT("should_collect_kernel_info_in_main_thread")
    public boolean shouldCollectKernelInfoInMainThread = true;

    @C09CT("check_delay_time")
    public int checkDelayTime = 600;

    @C09CT("cookie_DB_delay_time")
    public int cookieDBDelayTime = 180;

    @C09CT("cookie_dir_depth")
    public int cookieDirDepth = -1;

    @C09CT("metrics_config")
    public n metricsConfig = new n();

    public TTWebViewStatusModel() {
        n nVar = new n();
        nVar.LJJIIJ("sdk_ttnet_native_data_flow_id_header", "x-tt-dataflow-id");
        nVar.LJJIIJ("sdk_ttnet_native_data_flow_id", "671089921");
        this.ttwebConfig = nVar;
        this.versionConfig = new n();
        this.blockUrlList = new h();
        this.blockBidList = new h();
        this.allowUrlList = new h();
        this.allowBidList = new h();
        this.webViewErrorReportRate = 0.1f;
        this.minSupportedCookieDBVersion = -1;
        this.maxSupportedCookieDBVersion = -1;
    }
}
