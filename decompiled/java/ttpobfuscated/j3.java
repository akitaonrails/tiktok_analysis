package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum j3 {
    compromisedDb,
    noDbFileFound;

    public static final /* synthetic */ j3[] a() {
        return new j3[]{compromisedDb, noDbFileFound};
    }

    public static j3 valueOf(String str) {
        return (j3) C08FF.LIZ(j3.class, str);
    }
}
