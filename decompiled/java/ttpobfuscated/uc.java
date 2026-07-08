package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum uc {
    Equal(0),
    NotEqual(1);

    public static final a b = new a();
    public final int a;

    public static final /* synthetic */ uc[] a() {
        return new uc[]{Equal, NotEqual};
    }

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final uc a(int i) {
            for (uc ucVar : uc.values()) {
                if (ucVar.a == i) {
                    return ucVar;
                }
            }
            return null;
        }
    }

    public static uc valueOf(String str) {
        return (uc) C08FF.LIZ(uc.class, str);
    }

    uc(int i) {
        this.a = i;
    }
}
