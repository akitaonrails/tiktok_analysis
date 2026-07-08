package com.ss.android.ugc.aweme.setting.performance.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumIsPreDownloadInWeakNet {
    public static final WeakNetConfig LIZ = new WeakNetConfig(false, false, 10, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(122));

    public static final boolean LIZ() {
        C01GW c01gw = LIZIZ;
        return !((WeakNetConfig) c01gw.getValue()).isCancelPreDownload && ((WeakNetConfig) c01gw.getValue()).isLoadingLimited;
    }

    public static final class WeakNetConfig {

        @C09CT("is_cancel_pre_download")
        public final boolean isCancelPreDownload;

        @C09CT("is_convey_download")
        public final boolean isConveyDownload;

        @C09CT("is_loading")
        public final boolean isLoadingLimited;

        @C09CT("loading_time")
        public final int loadingTime;

        public WeakNetConfig() {
            this(false, false, 10, false);
        }

        public WeakNetConfig(boolean z, boolean z2, int i, boolean z3) {
            this.isCancelPreDownload = z;
            this.isLoadingLimited = z2;
            this.loadingTime = i;
            this.isConveyDownload = z3;
        }
    }
}
