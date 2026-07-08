package ttpobfuscated;

import X.C08FF;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes24.dex */
public enum ja {
    CaseInsensitive(2),
    HashConversion(4);

    public static final a b = new a();
    public final int a;

    public static final /* synthetic */ ja[] a() {
        return new ja[]{CaseInsensitive, HashConversion};
    }

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final EnumSet<ja> a(int i) {
            EnumSet<ja> enumSetNoneOf = EnumSet.noneOf(ja.class);
            if (i != 0) {
                for (ja jaVar : ja.values()) {
                    int i2 = jaVar.a;
                    if ((i2 & i) == i2) {
                        enumSetNoneOf.add(jaVar);
                    }
                }
            }
            return enumSetNoneOf;
        }

        public final ja b(int i) {
            for (ja jaVar : ja.values()) {
                if (jaVar.a == i) {
                    return jaVar;
                }
            }
            return null;
        }
    }

    public static ja valueOf(String str) {
        return (ja) C08FF.LIZ(ja.class, str);
    }

    ja(int i) {
        this.a = i;
    }
}
