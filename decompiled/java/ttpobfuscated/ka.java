package ttpobfuscated;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes24.dex */
public final class ka {
    public static final int a(EnumSet<ja> enumSet) {
        int i = 0;
        for (ja jaVar : ja.values()) {
            if (enumSet.contains(jaVar)) {
                i |= jaVar.a;
            }
        }
        return i;
    }
}
