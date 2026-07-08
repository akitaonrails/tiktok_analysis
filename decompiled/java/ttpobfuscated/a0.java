package ttpobfuscated;

import X.C1507240pKE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class a0 extends o7 {
    public final int m;

    public final int m() {
        return this.m;
    }

    public a0(List<C1507240pKE> list) {
        super(ha.CallBlock, list);
        this.m = ((C1507240pKE) ListProtector.get(list, 1)).LL;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        return tc.NoOp;
    }
}
