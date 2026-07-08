package ttpobfuscated;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class t implements s {
    public final ConcurrentHashMap<String, p> a = new ConcurrentHashMap<>();

    @Override // ttpobfuscated.s
    public void a(p pVar) {
        p pVar2 = this.a.get(pVar.a);
        if (pVar2 != null) {
            pVar2.b = pVar.b;
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.a.put(pVar.a, pVar);
    }

    @Override // ttpobfuscated.s
    public p b(String str) {
        p pVar = null;
        while (str.length() > 0 && (pVar = this.a.get(str)) == null) {
            str = kotlin.text.a0.LJJZZIII('.', str, "");
        }
        return pVar;
    }

    @Override // ttpobfuscated.s
    public boolean a(String str) {
        ed edVar;
        p pVarB = b(str);
        if (pVarB != null && (edVar = pVarB.b) != null && edVar.b()) {
            return true;
        }
        return false;
    }
}
