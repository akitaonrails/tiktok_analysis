package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AdSparkWebViewTitleNewConfig {
    public static final AdSparkWebViewNewTitleConfigModel LIZ = new AdSparkWebViewNewTitleConfigModel(2, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(412));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(411));

    public static final class AdSparkWebViewNewTitleConfigModel {

        @C09CT("ad_webview_page_use_spark_new_header")
        public final boolean newHeader;

        @C09CT("ad_webview_page_use_spark_use_webview_title")
        public final int useWebViewTitle;

        public AdSparkWebViewNewTitleConfigModel() {
            this(2, false);
        }

        public AdSparkWebViewNewTitleConfigModel(int i, boolean z) {
            this.useWebViewTitle = i;
            this.newHeader = z;
        }
    }
}
