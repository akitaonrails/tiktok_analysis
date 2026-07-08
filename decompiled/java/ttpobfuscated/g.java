package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum g {
    Base(0),
    Api1(1),
    Api2(2),
    Api3(3);

    public static final a b = new a();
    public final short a;

    public final short b() {
        return this.a;
    }

    public static final class a {
        public final g a(short s) {
            for (g gVar : g.values()) {
                if (gVar.a == s) {
                    return gVar;
                }
            }
            return null;
        }
    }

    public static g valueOf(String str) {
        return (g) C08FF.LIZ(g.class, str);
    }

    g(short s) {
        this.a = s;
    }
}
