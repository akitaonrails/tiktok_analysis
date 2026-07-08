package com.ss.android.ugc.aweme.setting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoPreloadDowngrade {
    public static final PhotoPreloadConfig LIZ = new PhotoPreloadConfig(false, 1, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(121));

    public static final class PhotoPreloadConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("image_size")
        public final int imageSize;

        @C09CT("video_size")
        public final int videoSize;

        public PhotoPreloadConfig() {
            this(false, 1, 0);
        }

        public PhotoPreloadConfig(boolean z, int i, int i2) {
            this.enable = z;
            this.imageSize = i;
            this.videoSize = i2;
        }
    }
}
