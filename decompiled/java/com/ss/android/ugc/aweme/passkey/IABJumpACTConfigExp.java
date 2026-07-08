package com.ss.android.ugc.aweme.passkey;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class IABJumpACTConfigExp {
    public static final EnableIABJumpACTModel LIZ = new EnableIABJumpACTModel(false, "", "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(159));

    public static final class EnableIABJumpACTModel {

        @C09CT("enable_iab_jump_act")
        public final boolean enableIABJumpACT;

        @C09CT("private_key")
        public final String privateKey;

        @C09CT("ua")
        public final String ua;

        public EnableIABJumpACTModel() {
            this(false, "", "");
        }

        public EnableIABJumpACTModel(boolean z, String str, String str2) {
            this.enableIABJumpACT = z;
            this.privateKey = str;
            this.ua = str2;
        }
    }
}
