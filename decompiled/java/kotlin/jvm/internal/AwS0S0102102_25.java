package kotlin.jvm.internal;

import X.C09AY;
import X.C1665800tRy;
import X.C1678500tmS;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0102102_25 extends C09AY implements Function2 {
    public final int $t;
    public float f4;
    public float f5;
    public int i1;
    public int i2;
    public long j3;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0102102_25 awS0S0102102_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S0102102_25.l0;
        long j = awS0S0102102_25.j3;
        C1678500tmS.LIZ(awS0S0102102_25.f4, awS0S0102102_25.f5, C341440Da2.LIZ(awS0S0102102_25.i1 | 1), awS0S0102102_25.i2, j, (InterfaceC1680500tpg) obj, interfaceC1685750ty9);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0102102_25 awS0S0102102_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        long j = awS0S0102102_25.j3;
        float f = awS0S0102102_25.f4;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S0102102_25.l0;
        C1665800tRy.LIZIZ(f, awS0S0102102_25.f5, C341440Da2.LIZ(awS0S0102102_25.i1 | 1), awS0S0102102_25.i2, j, (InterfaceC1680500tpg) obj, interfaceC1685750ty9);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S0102102_25(float r3, float r4, int r5, int r6, long r7, X.InterfaceC1685750ty9 r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L16
            r1 = r2
            r1.j3 = r7
            r1.f4 = r3
            r1.l0 = r9
            r1.f5 = r4
            r1.i1 = r5
            r1.i2 = r6
            r0 = 2
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r9
            r1.j3 = r7
            r1.f4 = r3
            r1.f5 = r4
            r1.i1 = r5
            r1.i2 = r6
            r0 = 2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S0102102_25.<init>(float, float, int, int, long, X.0ty9, int):void");
    }
}
