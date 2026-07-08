package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C1866870ygH;
import X.C452501pT;

/* JADX INFO: loaded from: classes29.dex */
public final class SparkWebViewWarmUpConfig {
    public static final SparkWebViewWarmUpConfigModel LIZ = new SparkWebViewWarmUpConfigModel(0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1866870ygH());

    public static final int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final class SparkWebViewWarmUpConfigModel {

        @C09CT("group")
        public final int group;

        public SparkWebViewWarmUpConfigModel() {
            this(0);
        }

        public SparkWebViewWarmUpConfigModel(int i) {
            this.group = i;
        }
    }
}
