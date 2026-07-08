package com.google.gson;

import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends k implements Iterable<k> {
    public final List<k> LL;

    private final k LIZJ$redex$base() {
        if (((ArrayList) this.LL).isEmpty()) {
            return new h();
        }
        h hVar = new h(((ArrayList) this.LL).size());
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            hVar.LJJIFFI(((k) it2.next()).LIZJ());
        }
        return hVar;
    }

    private final k LIZJ$redex$opt() {
        if (((ArrayList) this.LL).isEmpty()) {
            return new h();
        }
        h hVar = new h(((ArrayList) this.LL).size());
        ArrayList arrayList = (ArrayList) this.LL;
        int i = 0;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hVar.LJJIFFI(((k) obj).LIZJ());
        }
        return hVar;
    }

    @Override // com.google.gson.k
    public final boolean LJ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final byte LJFF() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJFF();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final char LJIIIIZZ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIIIIZZ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final double LJIIIZ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIIIZ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final float LJIIJ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIIJ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final int LJIIJJI() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIIJJI();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final long LJIIZILJ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIIZILJ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final Number LJIJ() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIJ();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final short LJIJI() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIJI();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.k
    public final String LJIL() {
        if (((ArrayList) this.LL).size() == 1) {
            return ((k) ((ArrayList) this.LL).get(0)).LJIL();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return this.LL.iterator();
    }

    public final int size() {
        return this.LL.size();
    }

    public h() {
        this.LL = new ArrayList();
    }

    @Override // com.google.gson.k
    public final k LIZJ() {
        return !ReDexExperimentOpt.getAbTest() ? LIZJ$redex$base() : LIZJ$redex$opt();
    }

    public h(int i) {
        this.LL = new ArrayList(i);
    }

    public final void LJJIFFI(k kVar) {
        if (kVar == null) {
            kVar = m.LL;
        }
        ((ArrayList) this.LL).add(kVar);
    }

    public final void LJJII(Number number) {
        k qVar;
        List<k> list = this.LL;
        if (number == null) {
            qVar = m.LL;
        } else {
            qVar = new q(number);
        }
        ((ArrayList) list).add(qVar);
    }

    public final void LJJIII(String str) {
        k qVar;
        List<k> list = this.LL;
        if (str == null) {
            qVar = m.LL;
        } else {
            qVar = new q(str);
        }
        ((ArrayList) list).add(qVar);
    }

    public final boolean LJJIIJ(q qVar) {
        return ((ArrayList) this.LL).contains(qVar);
    }

    public final k LJJIIJZLJL(int i) {
        return this.LL.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof h) && ((h) obj).LL.equals(this.LL)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
