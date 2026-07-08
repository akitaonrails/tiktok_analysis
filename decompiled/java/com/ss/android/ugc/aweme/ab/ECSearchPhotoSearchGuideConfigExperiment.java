package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ECSearchPhotoSearchGuideConfigExperiment {
    public static final GuideConfig LIZ = new GuideConfig(false, 1, false, 14);
    public static final C01GW LIZIZ;

    static {
        new GuideConfig(true, 1, true, 14);
        new GuideConfig(true, 2, true, 14);
        new GuideConfig(true, 1, false, 14);
        LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(71));
    }

    public static GuideConfig LIZ() {
        return (GuideConfig) LIZIZ.getValue();
    }

    public static final class GuideConfig {

        @C09CT("test_min_duration")
        public final int duration;

        @C09CT("enable_sys_recommend_product")
        public final boolean enable;

        @C09CT("extend_album_back_show")
        public final boolean enableBackExtendShow;

        @C09CT("sys_recommend_product_ui_style")
        public final int style;

        public GuideConfig(boolean z, int i, boolean z2, int i2) {
            this.enable = z;
            this.style = i;
            this.enableBackExtendShow = z2;
            this.duration = i2;
        }
    }
}
