package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class AdSparkWebViewLoadNewConfig {
    public static final AdSparkWebViewLoadNewConfigModel LIZ = new AdSparkWebViewLoadNewConfigModel(false, 0, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(295));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(296));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(298));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(297));

    public static final class AdSparkWebViewLoadNewConfigModel {

        @C09CT("ad_webview_page_use_spark_hide_loading_js")
        public final boolean hideLoadingJs;

        @C09CT("ad_webview_page_use_spark_hide_loading_js_fmp")
        public final int loadingJsFmp;

        @C09CT("ad_webview_page_use_spark_remove_loading")
        public final boolean removeLoading;

        @C09CT("ad_webview_page_use_spark_webview_progress_bar")
        public final boolean webViewProgressBar;

        public AdSparkWebViewLoadNewConfigModel() {
            this(false, 0, false, false);
        }

        public AdSparkWebViewLoadNewConfigModel(boolean z, int i, boolean z2, boolean z3) {
            this.hideLoadingJs = z;
            this.loadingJsFmp = i;
            this.webViewProgressBar = z2;
            this.removeLoading = z3;
        }
    }
}
