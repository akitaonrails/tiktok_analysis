package com.google.gson;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends k {
    public final com.google.gson.internal.s<String, k> LL = new com.google.gson.internal.s<>();

    @Override // com.google.gson.k
    /* JADX INFO: renamed from: LJJIIJZLJL, reason: merged with bridge method [inline-methods] */
    public final n LIZJ() {
        n nVar = new n();
        for (Map.Entry<String, k> entry : this.LL.entrySet()) {
            nVar.LJJIFFI(entry.getKey(), entry.getValue().LIZJ());
        }
        return nVar;
    }

    public final Set<String> LJJIJIL() {
        return this.LL.keySet();
    }

    public final Set<Map.Entry<String, k>> entrySet() {
        return this.LL.entrySet();
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final int size() {
        return this.LL.size();
    }

    public final k LJJIIZ(String str) {
        return this.LL.get(str);
    }

    public final h LJJIIZI(String str) {
        return (h) this.LL.get(str);
    }

    public final n LJJIJ(String str) {
        return (n) this.LL.get(str);
    }

    public final q LJJIJIIJI(String str) {
        return (q) this.LL.get(str);
    }

    public final boolean LJJIJIIJIL(String str) {
        return this.LL.containsKey(str);
    }

    public final k LJJIJL(String str) {
        return this.LL.remove(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof n) && ((n) obj).LL.equals(this.LL)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void LJJIFFI(String str, k kVar) {
        if (kVar == null) {
            kVar = m.LL;
        }
        this.LL.put(str, kVar);
    }

    public final void LJJII(Boolean bool, String str) {
        k qVar;
        if (bool == null) {
            qVar = m.LL;
        } else {
            qVar = new q((Object) bool);
        }
        LJJIFFI(str, qVar);
    }

    public final void LJJIII(Number number, String str) {
        k qVar;
        if (number == null) {
            qVar = m.LL;
        } else {
            qVar = new q((Object) number);
        }
        LJJIFFI(str, qVar);
    }

    public final void LJJIIJ(String str, String str2) {
        k qVar;
        if (str2 == null) {
            qVar = m.LL;
        } else {
            qVar = new q((Object) str2);
        }
        LJJIFFI(str, qVar);
    }
}
