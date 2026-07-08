package com.ss.android.ugc.aweme.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSAFLifecycleCheckSetting {
    public static final MetaData LIZ = new MetaData(0.5f, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(59));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(58));

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
