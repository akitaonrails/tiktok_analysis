package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum zf {
    IsEqualTo(1),
    ContainedIn(3),
    StartsWith(4),
    EndsWith(5),
    Contains(6),
    OrderedCompareTo(7),
    Matches(8),
    Reserved1(254),
    Reserved2(255);

    public static final a b = new a();
    public final int a;

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final zf a(int i) {
            for (zf zfVar : zf.values()) {
                if (zfVar.a == i) {
                    return zfVar;
                }
            }
            return null;
        }
    }

    public static zf valueOf(String str) {
        return (zf) C08FF.LIZ(zf.class, str);
    }

    zf(int i) {
        this.a = i;
    }
}
