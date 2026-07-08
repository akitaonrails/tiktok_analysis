package com.ss.android.ugc.aweme.web.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WebViewXRequestedWithExperiment {
    public static final WebViewXRequestedWithConfig LIZ = new WebViewXRequestedWithConfig(null, "");

    public static final class WebViewXRequestedWithConfig {

        @C09CT("host_list")
        public final List<String> hostList;

        @C09CT("x_requested_with")
        public final String xRequestedWith;

        public WebViewXRequestedWithConfig() {
            this(null, "");
        }

        public WebViewXRequestedWithConfig(List<String> list, String str) {
            this.hostList = list;
            this.xRequestedWith = str;
        }
    }
}
