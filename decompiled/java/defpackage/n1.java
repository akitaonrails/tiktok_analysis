package defpackage;

import X.C01GW;
import X.C13LQ;
import X.C452501pT;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {
    public static final String[] LIZ = new String[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1076));

    public static Map LIZ(Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C13LQ.LJIILLIIL(entry.getKey(), (Object[]) LIZIZ.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        return null;
    }
}
