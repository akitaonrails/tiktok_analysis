package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleImageModeMaxResolutionExperiment {
    public static final ResolutionConfig LIZ = new ResolutionConfig(1080, 1920, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(114));

    public static final class ResolutionConfig {

        @C09CT("height")
        public final int height;

        @C09CT("maxImageSideMultiples")
        public int maxImageSideMultiples;

        @C09CT("width")
        public final int width;

        public ResolutionConfig() {
            this(1080, 1920, 1);
        }

        public final void setMaxImageSideMultiples(int i) {
            this.maxImageSideMultiples = i;
        }

        public ResolutionConfig(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.maxImageSideMultiples = i3;
        }
    }

    public static int LIZ() {
        return ((ResolutionConfig) LIZIZ.getValue()).width;
    }
}
