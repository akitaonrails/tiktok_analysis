package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TikTokResolution {
    public static final TiktokResolution LIZ = new TiktokResolution(720, 1280);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(71));

    public static final class TiktokResolution {

        @C09CT("height")
        public final int height;

        @C09CT("width")
        public final int width;

        public TiktokResolution() {
            this(720, 1280);
        }

        public TiktokResolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
