package com.ss.android.ugc.aweme.live.sfv.special;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveHighlightSpecialCardConfig {
    public static final HighlightConfig LIZ = new HighlightConfig();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(150));

    public static final class HighlightConfig {

        @C09CT("auto_switch_duration")
        public long autoSwitchDuration = 15000;

        @C09CT("preload_video_size")
        public int preloadVideoSize = 512;

        @C09CT("enable_preload")
        public boolean enablePreload = true;

        @C09CT("enable_screenshot")
        public boolean enableScreenShot = true;

        @C09CT("lightness")
        public float lightness = -0.5f;

        @C09CT("scale_y")
        public float scaleY = 0.5f;

        @C09CT("reverse_color")
        public boolean reverseColor = true;
    }

    public static HighlightConfig LIZ() {
        return (HighlightConfig) LIZIZ.getValue();
    }
}
