package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkWebViewOptimizeExperiment {
    public static final WebViewOptimizeModel LIZ = new WebViewOptimizeModel(false, false, false, false, false, true);
    public static final C01GW LIZIZ;

    static {
        new WebViewOptimizeModel(true, true, true, true, true, true);
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1945));
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class WebViewOptimizeModel {

        @C09CT("enable_common_opt")
        public final boolean enableCommonOpt;

        @C09CT("enable_lazy_bridge")
        public final boolean enableLazyBridge;

        @C09CT("enable_multi_thread")
        public final boolean enableMultiThread;

        @C09CT("enable_warmup_spark")
        public final boolean enableWarmupSpark;

        @C09CT("enable_warmup_webview")
        public final boolean enableWarmupWebView;

        @C09CT("warmup_webview_in_idle")
        public final boolean warmupWebviewInIdle;

        public WebViewOptimizeModel() {
            this(false, false, false, false, false, true);
        }

        public WebViewOptimizeModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.enableCommonOpt = z;
            this.enableWarmupSpark = z2;
            this.enableWarmupWebView = z3;
            this.enableMultiThread = z4;
            this.enableLazyBridge = z5;
            this.warmupWebviewInIdle = z6;
        }
    }
}
