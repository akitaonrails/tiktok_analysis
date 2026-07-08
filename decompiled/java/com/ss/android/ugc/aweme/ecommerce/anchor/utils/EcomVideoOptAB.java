package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomVideoOptAB {
    public static final EcVideoOptConfig LIZ = new EcVideoOptConfig(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(218));

    public static final class EcVideoOptConfig {

        @C09CT("ec_video_sr_predict_enable")
        public final boolean ecVideoSRPredictEnable;

        @C09CT("ec_video_sr_entrances")
        public final List<String> ecVideoSrEntrances;

        public EcVideoOptConfig() {
            this(false, null);
        }

        public EcVideoOptConfig(boolean z, List<String> list) {
            this.ecVideoSRPredictEnable = z;
            this.ecVideoSrEntrances = list;
        }
    }
}
