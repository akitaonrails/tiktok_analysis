package ttpobfuscated;

import X.C1507240pKE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public abstract class x0 extends o7 {
    public final y0 m;

    public final int n() {
        return ((C1507240pKE) ListProtector.get(this.b, 2)).LL;
    }

    public final int o() {
        return ((C1507240pKE) ListProtector.get(this.b, 3)).LL;
    }

    public final y0 m() {
        return this.m;
    }

    public final List<String> d(xc xcVar) {
        return a(xcVar, n());
    }

    public final String e(xc xcVar) {
        return d(xcVar, n());
    }

    public x0(ha haVar, List<C1507240pKE> list) {
        super(haVar, list);
        this.m = new y0(((C1507240pKE) ListProtector.get(list, 1)).LL);
    }
}
