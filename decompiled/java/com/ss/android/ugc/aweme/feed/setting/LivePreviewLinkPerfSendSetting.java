package com.ss.android.ugc.aweme.feed.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewLinkPerfSendSetting {
    public static final PreviewLinkPerfSendConfig LIZ = new PreviewLinkPerfSendConfig(false, 15);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(318));

    public static final class PreviewLinkPerfSendConfig {

        @C09CT("collect_interval")
        public int collectIntervalSec;

        @C09CT("enable")
        public boolean isEnable;

        public PreviewLinkPerfSendConfig() {
            this(false, 15);
        }

        public PreviewLinkPerfSendConfig(boolean z, int i) {
            this.isEnable = z;
            this.collectIntervalSec = i;
        }
    }
}
