package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum tc {
    False(0),
    True(1),
    OrderedAscending(2),
    OrderedSame(3),
    OrderedDescending(4),
    AnyResult(13),
    Undefined(14),
    NoOp(15);

    public static final a b = new a();
    public final int a;

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final tc a(int i) {
            for (tc tcVar : tc.values()) {
                if (tcVar.a == i) {
                    return tcVar;
                }
            }
            return null;
        }
    }

    public static tc valueOf(String str) {
        return (tc) C08FF.LIZ(tc.class, str);
    }

    tc(int i) {
        this.a = i;
    }
}
