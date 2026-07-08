package ttpobfuscated;

import X.C08FF;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes24.dex */
public enum re {
    CONFIG("CONFIG"),
    GECKO("GECKO");

    public static final a b = new a();
    public final String a;

    public final String b() {
        return this.a;
    }

    public static final class a {
        public final re a(String str) {
            for (re reVar : re.values()) {
                if (kotlin.text.u.LJIJI(reVar.b(), str, true)) {
                    return reVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static re valueOf(String str) {
        return (re) C08FF.LIZ(re.class, str);
    }

    re(String str) {
        this.a = str;
    }
}
