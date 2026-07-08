package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ChatSAFLifecycleCheckSetting {
    public static final MetaData LIZ = new MetaData(0.5f, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(195));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(194));

    public static final class MetaData {

        @C09CT("check_saf")
        public final boolean checkSAFCheck;

        @C09CT("crash_radio")
        public final float crashRatio;

        public MetaData() {
            this(0.5f, false);
        }

        public MetaData(float f, boolean z) {
            this.crashRatio = f;
            this.checkSAFCheck = z;
        }
    }
}
