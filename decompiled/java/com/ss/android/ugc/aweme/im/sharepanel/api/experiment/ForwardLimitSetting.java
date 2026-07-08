package com.ss.android.ugc.aweme.im.sharepanel.api.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ForwardLimitSetting {
    public static final ForwardLimitConfig LIZ = new ForwardLimitConfig(1, 5, 1, -1, 30);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(279));

    public static final class ForwardLimitConfig {

        @C09CT("expired_days")
        public final int expiredDays;

        @C09CT("max_chat_per_session_cat1")
        public final int maxChatPerSessionCat1;

        @C09CT("max_chat_per_session_cat2")
        public final int maxChatPerSessionCat2;

        @C09CT("max_session_cat1")
        public final int maxSessionCat1;

        @C09CT("max_session_cat2")
        public final int maxSessionCat2;

        public ForwardLimitConfig() {
            this(1, 5, 1, -1, 30);
        }

        public ForwardLimitConfig(int i, int i2, int i3, int i4, int i5) {
            this.maxChatPerSessionCat1 = i;
            this.maxSessionCat1 = i2;
            this.maxChatPerSessionCat2 = i3;
            this.maxSessionCat2 = i4;
            this.expiredDays = i5;
        }
    }

    public static int LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            return ((ForwardLimitConfig) LIZIZ.getValue()).maxChatPerSessionCat2;
        }
        return ((ForwardLimitConfig) LIZIZ.getValue()).maxChatPerSessionCat1;
    }

    public static int LIZIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            return ((ForwardLimitConfig) LIZIZ.getValue()).maxSessionCat2;
        }
        return ((ForwardLimitConfig) LIZIZ.getValue()).maxSessionCat1;
    }
}
