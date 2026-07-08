package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum uf {
    Logs("logs"),
    Sample("sample");

    public static final a b = new Object() { // from class: ttpobfuscated.uf.a
        public final uf a(String str) {
            for (uf ufVar : uf.values()) {
                if (kotlin.text.u.LJIJI(ufVar.a, str, true)) {
                    return ufVar;
                }
            }
            return null;
        }
    };
    public final String a;

    public static final /* synthetic */ uf[] a() {
        return new uf[]{Logs, Sample};
    }

    public final String b() {
        return this.a;
    }

    public static uf valueOf(String str) {
        return (uf) C08FF.LIZ(uf.class, str);
    }

    uf(String str) {
        this.a = str;
    }
}
