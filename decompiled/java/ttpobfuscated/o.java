package ttpobfuscated;

import X.C1507240pKE;
import X.C1507270pKH;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.ra;

/* JADX INFO: loaded from: classes24.dex */
public final class o extends o7 {
    public final g m;
    public final int n;

    @Override // ttpobfuscated.o7
    public g c() {
        return this.m;
    }

    public final int m() {
        return this.n;
    }

    public o(List<C1507240pKE> list) throws pa {
        super(ha.BlockStart, list);
        short sB = oa.b(((C1507240pKE) ListProtector.get(list, 1)).LL, -65536, 16);
        g gVarA = g.b.a(sB);
        if (gVarA != null) {
            this.m = gVarA;
            this.n = ((C1507240pKE) ListProtector.get(list, 3)).LL;
        } else {
            throw new pa("Unexpected ApiLevel value [" + ((Object) C1507270pKH.LIZJ(sB)) + ']');
        }
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        boolean z;
        int i = this.m.a & 65535;
        ra.a.getClass();
        if (Intrinsics.LJI(i, 65535 & ra.a.b.a) <= 0) {
            z = true;
        } else {
            z = false;
        }
        return a(z);
    }
}
