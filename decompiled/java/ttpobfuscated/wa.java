package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum wa {
    json,
    csv,
    noop;

    public static final /* synthetic */ wa[] a() {
        return new wa[]{json, csv, noop};
    }

    public static wa valueOf(String str) {
        return (wa) C08FF.LIZ(wa.class, str);
    }
}
