package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C0C64;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewStatusModel;

/* JADX INFO: loaded from: classes5.dex */
public final class TTWebViewEnableStatusSettings {
    public static final TTWebViewEnableStatusSettings LIZ = new TTWebViewEnableStatusSettings();
    public static final TikTokTTWebViewStatusModel LIZIZ = new TikTokTTWebViewStatusModel();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TikTokTTWebViewStatusModel extends TTWebViewStatusModel {

        @C09CT("allow_confirm_window")
        public boolean allowConfirmWindow;

        @C09CT("enable_hook_new_webView")
        public boolean enableHookNewWebView;

        @C09CT("initialize_delay_time")
        public long initializeDelayTime;

        @C09CT("initialize_type")
        public int initializeType;

        @C09CT("optimize_download")
        public boolean optimizeDownload;

        @C09CT("statics_optimize_level")
        public int staticsOptimizeLevel;

        @C09CT("bundle_keep_alive")
        public int bundleKeepAlive = 1;

        @C09CT("allowed_max_download_times")
        public int allowedMaxDownloadTimes = 5;

        @C09CT("delay_if_feed_page")
        public Long delayIfFeedPage = 30000L;

        @C09CT("duration_of_not_playing")
        public long durNotPlaying = 10000;
    }

    public static TikTokTTWebViewStatusModel LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        TikTokTTWebViewStatusModel tikTokTTWebViewStatusModel = LIZIZ;
        TikTokTTWebViewStatusModel tikTokTTWebViewStatusModel2 = (TikTokTTWebViewStatusModel) c0c64LJIILLIIL.LJJIIJ(true, "ttwebview_enable_status", 31744, TikTokTTWebViewStatusModel.class, tikTokTTWebViewStatusModel, 2);
        return tikTokTTWebViewStatusModel2 != null ? tikTokTTWebViewStatusModel2 : tikTokTTWebViewStatusModel;
    }
}
