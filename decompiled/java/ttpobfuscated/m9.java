package ttpobfuscated;

import X.C098200Yq;
import X.C13LP;
import X.C1507240pKE;
import X.C189200o6;
import X.C19719612Di;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class m9 extends o7 {
    public m9(List<C1507240pKE> list) {
        super(ha.MatchKeySubset, list);
    }

    public final List<String> a(Map<String, ? extends Object> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (str.length() != 0) {
                key = str + '.' + key;
            }
            if (value instanceof Map) {
                C19719612Di.LJJI(a((Map<String, ? extends Object>) value, key), arrayList);
            } else {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        Object c098200Yq;
        List<String> listB;
        try {
            listB = b(xcVar);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (listB != null) {
            if (C13LP.LLIIJI(listB).containsAll(C13LP.LLIIJI(a(this, ec.b(ccVar.b), null, 2, null)))) {
                c098200Yq = tc.True;
            } else {
                c098200Yq = tc.False;
            }
            if (c098200Yq != null) {
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = tc.Undefined;
                }
                return (tc) c098200Yq;
            }
        }
        throw new na("No keys in the MatchKeySubsetInstruction operand");
    }

    public static /* synthetic */ List a(m9 m9Var, Map map, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = e3.c;
        }
        return m9Var.a((Map<String, ? extends Object>) map, str);
    }
}
