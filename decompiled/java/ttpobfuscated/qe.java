package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes14.dex */
public enum qe {
    raw,
    cert;

    public static final /* synthetic */ qe[] a() {
        return new qe[]{raw, cert};
    }

    public static qe valueOf(String str) {
        return (qe) C08FF.LIZ(qe.class, str);
    }
}
