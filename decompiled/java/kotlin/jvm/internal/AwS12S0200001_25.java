package kotlin.jvm.internal;

import X.C09AY;
import X.C1675860tiC;
import X.C1677280tkU;
import X.C1677660tl6;
import X.C1685400txa;
import X.C1686260tyy;
import X.C1695220uDQ;
import X.C1695230uDR;
import X.C814420VxA;
import X.C817403Hg;
import X.InterfaceC1669010tX9;
import X.InterfaceC1677220tkO;
import X.InterfaceC1680820tqC;
import X.InterfaceC20090813jG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS12S0200001_25 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0200001_25 awS12S0200001_25, Object obj) {
        long jLIZJ;
        long jLongValue = ((Number) obj).longValue();
        C1677660tl6 c1677660tl6 = (C1677660tl6) awS12S0200001_25.l0;
        if (c1677660tl6.LIZIZ == Long.MIN_VALUE) {
            c1677660tl6.LIZIZ = jLongValue;
        }
        C1677280tkU c1677280tkU = new C1677280tkU(c1677660tl6.LJ);
        if (awS12S0200001_25.f2 == 0.0f) {
            C1677660tl6 c1677660tl62 = (C1677660tl6) awS12S0200001_25.l0;
            jLIZJ = c1677660tl62.LIZ.LIZLLL(new C1677280tkU(c1677660tl62.LJ), C1677660tl6.LJFF, ((C1677660tl6) awS12S0200001_25.l0).LIZJ);
        } else {
            jLIZJ = C814420VxA.LIZJ((jLongValue - ((C1677660tl6) awS12S0200001_25.l0).LIZIZ) / r7);
        }
        C1677660tl6 c1677660tl63 = (C1677660tl6) awS12S0200001_25.l0;
        InterfaceC1677220tkO<C1677280tkU> interfaceC1677220tkO = c1677660tl63.LIZ;
        C1677280tkU c1677280tkU2 = C1677660tl6.LJFF;
        float f = ((C1677280tkU) interfaceC1677220tkO.LIZJ(jLIZJ, c1677280tkU, c1677280tkU2, c1677660tl63.LIZJ)).LIZ;
        C1677660tl6 c1677660tl64 = (C1677660tl6) awS12S0200001_25.l0;
        c1677660tl64.LIZJ = (C1677280tkU) c1677660tl64.LIZ.LIZIZ(jLIZJ, c1677280tkU, c1677280tkU2, c1677660tl64.LIZJ);
        C1677660tl6 c1677660tl65 = (C1677660tl6) awS12S0200001_25.l0;
        c1677660tl65.LIZIZ = jLongValue;
        float f2 = c1677660tl65.LJ - f;
        c1677660tl65.LJ = f;
        ((Function1) awS12S0200001_25.l1).invoke(Float.valueOf(f2));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r1
      0x0060: PHI (r1v2 float) = (r1v1 float), (r1v5 float) binds: [B:16:0x005d, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS12S0200001_25 r4, java.lang.Object r5) {
        /*
            X.0tlN r5 = (X.C1677830tlN) r5
            float r1 = r4.f2
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4b
            java.lang.Object r0 = r5.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            float r3 = r4.f2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L60
        L19:
            java.lang.Object r0 = r4.l0
            X.03Hg r0 = (X.C817403Hg) r0
            float r0 = r0.element
            float r2 = r3 - r0
            java.lang.Object r0 = r4.l1
            X.13jG r0 = (X.InterfaceC20090813jG) r0
            float r0 = r0.LIZJ(r2)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L47
            java.lang.Object r0 = r5.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L47
        L3b:
            java.lang.Object r1 = r4.l0
            X.03Hg r1 = (X.C817403Hg) r1
            float r0 = r1.element
            float r0 = r0 + r2
            r1.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L47:
            r5.LIZ()
            goto L3b
        L4b:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L19
            java.lang.Object r0 = r5.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            float r3 = r4.f2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L60
            goto L19
        L60:
            r3 = r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS12S0200001_25.invoke$1(kotlin.jvm.internal.AwS12S0200001_25, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS12S0200001_25 awS12S0200001_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        float f = awS12S0200001_25.f2;
        InterfaceC1680820tqC interfaceC1680820tqC = (InterfaceC1680820tqC) awS12S0200001_25.l0;
        C1685400txa c1685400txa = (C1685400txa) awS12S0200001_25.l1;
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            C1686260tyy c1686260tyy = c1695230uDRLJLJI.LIZ;
            c1686260tyy.LJII(f, 0.0f);
            c1686260tyy.LJFF(45.0f, 0L);
            C1675860tiC.LJFF(interfaceC1669010tX9, interfaceC1680820tqC, c1685400txa, 46);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0200001_25(float f, C817403Hg c817403Hg, InterfaceC20090813jG interfaceC20090813jG, int i) {
        super(1);
        this.$t = i;
        this.f2 = f;
        this.l0 = c817403Hg;
        this.l1 = interfaceC20090813jG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0200001_25(float f, InterfaceC1680820tqC interfaceC1680820tqC, C1695220uDQ c1695220uDQ, int i) {
        super(1);
        this.$t = i;
        this.f2 = f;
        this.l0 = interfaceC1680820tqC;
        this.l1 = c1695220uDQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0200001_25(C1677660tl6 c1677660tl6, C1677660tl6 c1677660tl62, float f, Function1<? super Float, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1677660tl6;
        this.f2 = c1677660tl62;
        this.l1 = f;
    }
}
