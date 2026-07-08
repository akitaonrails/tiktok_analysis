package com.ss.android.ugc.aweme.ad.experiment;

import X.C01GW;
import X.C09CT;
import X.C1023770ckR;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPageResourceOptimizeExperiment {
    public static final AdLandPageResourceOptimizeExperiment LIZ = new AdLandPageResourceOptimizeExperiment();
    public static final ResourceOptimizeModel LIZIZ = new ResourceOptimizeModel(false, false, false, false, false, LSPassThroughRecordSizeConfig.DEFAULT);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1023770ckR());

    public static final class ResourceOptimizeModel {

        @C09CT("do_preconnect_duration")
        public int doPreconnectDuration;

        @C09CT("enable_consume_prefetch")
        public boolean enableConsumePrefetch;

        @C09CT("enable_gecko_preconnect")
        public boolean enableGeckoPreconnect;

        @C09CT("enable_gecko_prefetch")
        public boolean enableGeckoPrefetch;

        @C09CT("use_singleton_webview")
        public boolean enableNewWebviewOnLaunch;

        @C09CT("use_prewarm_singleton_webview")
        public boolean usePrewarmSingletonWebView;

        public ResourceOptimizeModel() {
            this(false, false, false, false, false, LSPassThroughRecordSizeConfig.DEFAULT);
        }

        public ResourceOptimizeModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            this.enableGeckoPrefetch = z;
            this.enableConsumePrefetch = z2;
            this.enableGeckoPreconnect = z3;
            this.enableNewWebviewOnLaunch = z4;
            this.usePrewarmSingletonWebView = z5;
            this.doPreconnectDuration = i;
        }
    }

    public static final ResourceOptimizeModel LIZ() {
        LIZ.getClass();
        return (ResourceOptimizeModel) LIZJ.getValue();
    }
}
