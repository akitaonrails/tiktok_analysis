package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1675860tiC;
import X.C1680680tpy;
import X.C1683130ttv;
import X.C1685400txa;
import X.C1692260u8e;
import X.C1692280u8g;
import X.C1695220uDQ;
import X.C259800zU;
import X.C817403Hg;
import X.InterfaceC1669010tX9;
import X.InterfaceC1680820tqC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS15S0300100_25 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S0300100_25 awS15S0300100_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        C1683130ttv c1683130ttv = (C1683130ttv) awS15S0300100_25.l0;
        float f = c1683130ttv.LIZ;
        float f2 = c1683130ttv.LIZIZ;
        C259800zU c259800zU = (C259800zU) awS15S0300100_25.l1;
        long j = awS15S0300100_25.j3;
        C1685400txa c1685400txa = (C1685400txa) awS15S0300100_25.l2;
        interfaceC1669010tX9.LJLJI().LIZ.LJII(f, f2);
        try {
            C1675860tiC.LJ(interfaceC1669010tX9, (InterfaceC1680820tqC) c259800zU.element, 0L, j, 0L, 0.0f, c1685400txa, 0, 890);
            interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -f2);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -f2);
            throw th;
        }
    }

    public static final Object invoke$1(AwS15S0300100_25 awS15S0300100_25, Object obj) {
        int iLJI;
        int iLJFF;
        C1692260u8e c1692260u8e = (C1692260u8e) obj;
        long j = awS15S0300100_25.j3;
        float[] fArr = (float[]) awS15S0300100_25.l0;
        C118300cf c118300cf = (C118300cf) awS15S0300100_25.l1;
        C817403Hg c817403Hg = (C817403Hg) awS15S0300100_25.l2;
        if (c1692260u8e.LIZIZ > C1692280u8g.LJI(j)) {
            iLJI = c1692260u8e.LIZIZ;
        } else {
            iLJI = C1692280u8g.LJI(j);
        }
        if (c1692260u8e.LIZJ < C1692280u8g.LJFF(j)) {
            iLJFF = c1692260u8e.LIZJ;
        } else {
            iLJFF = C1692280u8g.LJFF(j);
        }
        long jLIZ = C1680680tpy.LIZ(c1692260u8e.LIZLLL(iLJI), c1692260u8e.LIZLLL(iLJFF));
        c1692260u8e.LIZ.LJ(jLIZ, c118300cf.element, fArr);
        int iLJ = c118300cf.element + (C1692280u8g.LJ(jLIZ) * 4);
        for (int i = c118300cf.element; i < iLJ; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f2 = c817403Hg.element;
            fArr[i2] = f + f2;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f2;
        }
        c118300cf.element = iLJ;
        c817403Hg.element += c1692260u8e.LIZ.getHeight();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0300100_25(long j, float[] fArr, C118300cf c118300cf, C817403Hg c817403Hg, int i) {
        super(1);
        this.$t = i;
        this.j3 = j;
        this.l0 = fArr;
        this.l1 = c118300cf;
        this.l2 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0300100_25(C1683130ttv c1683130ttv, C259800zU c259800zU, long j, C1695220uDQ c1695220uDQ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1683130ttv;
        this.l1 = c259800zU;
        this.j3 = j;
        this.l2 = c1695220uDQ;
    }
}
