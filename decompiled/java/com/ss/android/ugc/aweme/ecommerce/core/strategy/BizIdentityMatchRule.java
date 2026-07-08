package com.ss.android.ugc.aweme.ecommerce.core.strategy;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BizIdentityMatchRule {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public BizIdentityMatchRule() {
        this(null, null, null, 15);
    }

    public final boolean isMatch(BizIdentity bizIdentity) {
        if (!Intrinsics.LJFF(this.LIZ, "*") && !Intrinsics.LJFF(this.LIZ, bizIdentity.LIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LIZIZ, "*") && !Intrinsics.LJFF(this.LIZIZ, bizIdentity.LIZIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LIZJ, "*") && !Intrinsics.LJFF(this.LIZJ, bizIdentity.LIZJ)) {
            return false;
        }
        return true;
    }

    public BizIdentityMatchRule(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? "*" : str;
        str2 = (i & 2) != 0 ? "*" : str2;
        str3 = (i & 4) != 0 ? "*" : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
