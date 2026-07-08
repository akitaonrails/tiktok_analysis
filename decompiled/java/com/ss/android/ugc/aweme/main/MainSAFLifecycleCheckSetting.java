package com.ss.android.ugc.aweme.main;

import X.C01GW;
import X.C09CT;
import X.C19348410mo;
import X.C19348510mp;
import X.C452501pT;

/* JADX INFO: loaded from: classes30.dex */
public final class MainSAFLifecycleCheckSetting {
    public static final MetaData LIZ = new MetaData(0.5f, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C19348410mo());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C19348510mp());

    public static final class MetaData {

        @C09CT("crash_radio")
        public final float crashRatio;

        @C09CT("check_saf")
        public final boolean enableSAFCheck;

        public MetaData() {
            this(0.5f, false);
        }

        public MetaData(float f, boolean z) {
            this.crashRatio = f;
            this.enableSAFCheck = z;
        }
    }
}
