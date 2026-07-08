package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABLoginConfigExp {
    public static final IABLoginConfig LIZ = new IABLoginConfig(false, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(294));

    public static final class IABLoginConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("first_party_cancel")
        public final String firstPartyCancel;

        @C09CT("first_regular")
        public final String firstRegulars;

        @C09CT("third_regulars")
        public final String thirdRegulars;

        public IABLoginConfig() {
            this(false, null, null, null);
        }

        public IABLoginConfig(boolean z, String str, String str2, String str3) {
            this.enable = z;
            this.thirdRegulars = str;
            this.firstRegulars = str2;
            this.firstPartyCancel = str3;
        }
    }
}
