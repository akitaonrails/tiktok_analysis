package com.ss.android.ugc.aweme.ecommerce.core.strategy;

import X.C2188811AlT;
import X.C987903td;

/* JADX INFO: loaded from: classes2.dex */
public final class BizIdentity {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String getUniqueKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizIdentity(String str, C987903td c987903td) {
        this(str, c987903td.LIZ, c987903td.LIZIZ);
    }

    public BizIdentity(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
