package kotlin.jvm.internal;

import X.C09AY;
import X.C1675860tiC;
import X.C1695210uDP;
import X.C1695230uDR;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0000102_25 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public float f2;
    public long j0;

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

    public static final Object invoke$0(AwS0S0000102_25 awS0S0000102_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(awS0S0000102_25.f1);
        float fLJJJJLL2 = interfaceC1669010tX9.LJJJJLL(awS0S0000102_25.f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (awS0S0000102_25.j0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (awS0S0000102_25.j0 & 4294967295L)) - fLJJJJLL2;
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            c1695230uDRLJLJI.LIZ.LIZJ(0.0f, fLJJJJLL, fIntBitsToFloat, fIntBitsToFloat2, 1);
            interfaceC1669010tX9.LLIIJLIL();
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

    public static final Object invoke$1(AwS0S0000102_25 awS0S0000102_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, awS0S0000102_25.j0, awS0S0000102_25.f1 - (awS0S0000102_25.f2 / 2), 0L, 0.0f, new C1695210uDP(awS0S0000102_25.f2, 0.0f, 0, 0, null, 30), 108);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S0000102_25(float r3, float r4, long r5, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L10
            r1 = r2
            r1.j0 = r5
            r1.f1 = r3
            r1.f2 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.f1 = r3
            r1.f2 = r4
            r1.j0 = r5
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S0000102_25.<init>(float, float, long, int):void");
    }
}
