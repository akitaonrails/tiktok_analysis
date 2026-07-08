package com.bytedance.hybrid.spark.security.web_js.setting;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class InlineInjectOptSettings {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("row", "https://mon.tiktokv.com/monitor_browser/collect/batch/security/?bid=tiktok_pns&ev_type=csp"), new Pair("eu", "https://mon-i18n.tiktokv.com/monitor_browser/collect/batch/security/?bid=tiktok_pns&ev_type=csp"), new Pair("us", "https://mon16-normal-useast5.tiktokv.us/monitor_browser/collect/batch/security/?bid=tiktok_pns&ev_type=csp"));

    @C09CT("enable_iframe")
    public boolean enableIframe;

    @C09CT("enable_main")
    public final boolean enableMainFrame;

    @C09CT("report_uris")
    public final Map<String, String> reportUris;

    public InlineInjectOptSettings() {
        this(false, false, LIZ);
    }

    public InlineInjectOptSettings(boolean z, boolean z2, Map<String, String> map) {
        this.enableMainFrame = z;
        this.enableIframe = z2;
        this.reportUris = map;
    }
}
