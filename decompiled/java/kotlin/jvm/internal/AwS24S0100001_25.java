package kotlin.jvm.internal;

import X.AbstractC1668700tWe;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C1296530jqN;
import X.C1324630kZh;
import X.C1325700kbQ;
import X.C1383705bH;
import X.C13FE;
import X.C13FK;
import X.C1668200tVq;
import X.C1671580tbI;
import X.C1675860tiC;
import X.C1675970tiN;
import X.C1676910tjt;
import X.C1680770tq7;
import X.C1683760tuw;
import X.C1685910tyP;
import X.C1696880uG6;
import X.C1697810uHb;
import X.C2267001DoI;
import X.C814420VxA;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import X.InterfaceC1686290tz1;
import X.InterfaceC1690500u5o;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS24S0100001_25 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        long j = ((C1680770tq7) obj).LIZ;
        float fLIZLLL = C1680770tq7.LIZLLL(j) * awS24S0100001_25.f1;
        float fLIZIZ = C1680770tq7.LIZIZ(j) * awS24S0100001_25.f1;
        if (C1680770tq7.LIZLLL(((C1680770tq7) ((C05P0) awS24S0100001_25.l0).getValue()).LIZ) != fLIZLLL || C1680770tq7.LIZIZ(((C1680770tq7) ((C05P0) awS24S0100001_25.l0).getValue()).LIZ) != fLIZIZ) {
            ((C05P0) awS24S0100001_25.l0).setValue(new C1680770tq7(C1671580tbI.LIZ(fLIZLLL, fLIZIZ)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        if (((Number) ((C05P1) awS24S0100001_25.l0).getValue()).floatValue() > 0.0f) {
            interfaceC1669010tX9.LLIIJLIL();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L));
            float fSqrt = (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
            float f = awS24S0100001_25.f1 * fSqrt;
            float fFloatValue = ((Number) ((C05P1) awS24S0100001_25.l0).getValue()).floatValue() * (fSqrt + f);
            float f2 = fIntBitsToFloat / fSqrt;
            float f3 = fIntBitsToFloat2 / fSqrt;
            float f4 = fFloatValue - f;
            C1675860tiC.LJIIIZ(interfaceC1669010tX9, C1668200tVq.LIZLLL(C1697810uHb.LJIIJJI(new C1685910tyP(C1685910tyP.LIZIZ), new C1685910tyP(C1685910tyP.LJIIIZ)), (((long) Float.floatToRawIntBits(f4 * f2)) << 32) | (((long) Float.floatToRawIntBits(f4 * f3)) & 4294967295L), (((long) Float.floatToRawIntBits(f2 * fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue * f3)) & 4294967295L), 8), 0L, 0L, 0.0f, null, 6, 62);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        if (awS24S0100001_25.f1 > 0.0f) {
            C1675860tiC.LJIIIZ(interfaceC1669010tX9, (AbstractC1668700tWe) awS24S0100001_25.l0, 0L, 0L, 0.0f, null, 6, 62);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        if (!((C1676910tjt) awS24S0100001_25.l0).LJII()) {
            C1676910tjt c1676910tjt = (C1676910tjt) awS24S0100001_25.l0;
            long j = jLongValue / 1;
            float f = awS24S0100001_25.f1;
            if (((C13FK) c1676910tjt.LJI).LIZ() == Long.MIN_VALUE) {
                ((C13FK) c1676910tjt.LJI).LJIIIIZZ(j);
                ((C13FE) c1676910tjt.LIZ.LIZ).setValue(Boolean.TRUE);
            }
            long jLIZ = j - ((C13FK) c1676910tjt.LJI).LIZ();
            boolean z = true;
            if (f != 0.0f) {
                jLIZ = C814420VxA.LIZJ(jLIZ / ((double) f));
            }
            if (c1676910tjt.LIZIZ == null) {
                ((C13FK) c1676910tjt.LJFF).LJIIIIZZ(jLIZ);
            }
            if (f != 0.0f) {
                z = false;
            }
            c1676910tjt.LJIIIIZZ(jLIZ, z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        int iLJLLJ = ((InterfaceC1690500u5o) awS24S0100001_25.l0).LJLLJ(awS24S0100001_25.f1);
        ((C1325700kbQ) obj).LIZJ = new C1324630kZh(iLJLLJ, iLJLLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float f = ((C2267001DoI) awS24S0100001_25.l0).LJIIJJI;
        float f2 = awS24S0100001_25.f1;
        float f3 = f * f2;
        float f4 = r3.LJIIL * f2;
        float fLIZLLL = (C1680770tq7.LIZLLL(interfaceC1675870tiD.LIZIZ()) - f3) / 2.0f;
        float fLIZIZ = (C1680770tq7.LIZIZ(interfaceC1675870tiD.LIZIZ()) - f4) / 2.0f;
        long j = C1685910tyP.LJ;
        float f5 = fLIZLLL + f3;
        C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(fLIZLLL, fLIZIZ), C1383705bH.LIZ(f5, fLIZIZ), 0.0f, 0, 504);
        float f6 = fLIZIZ + f4;
        C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(f5, fLIZIZ), C1383705bH.LIZ(f5, f6), 0.0f, 0, 504);
        C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(f5, f6), C1383705bH.LIZ(fLIZLLL, f6), 0.0f, 0, 504);
        C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(fLIZLLL, f6), C1383705bH.LIZ(fLIZLLL, fLIZIZ), 0.0f, 0, 504);
        float f7 = 1;
        float f8 = fLIZLLL + f7;
        float f9 = fLIZIZ + f7;
        long j2 = C1685910tyP.LIZIZ;
        float f10 = f3 + f8;
        C1675860tiC.LJI(interfaceC1675870tiD, j2, C1383705bH.LIZ(f8, f9), C1383705bH.LIZ(f10, f9), 0.0f, 0, 504);
        float f11 = f4 + f9;
        C1675860tiC.LJI(interfaceC1675870tiD, j2, C1383705bH.LIZ(f10, f9), C1383705bH.LIZ(f10, f11), 0.0f, 0, 504);
        C1675860tiC.LJI(interfaceC1675870tiD, j2, C1383705bH.LIZ(f10, f11), C1383705bH.LIZ(f8, f11), 0.0f, 0, 504);
        C1675860tiC.LJI(interfaceC1675870tiD, j2, C1383705bH.LIZ(f8, f11), C1383705bH.LIZ(f8, f9), 0.0f, 0, 504);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS24S0100001_25 awS24S0100001_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float fLJJJJLL = interfaceC1675870tiD.LJJJJLL(C1675970tiN.LIZIZ);
        float fLJJJJLL2 = interfaceC1675870tiD.LJJJJLL(awS24S0100001_25.f1);
        Paint paint = (Paint) awS24S0100001_25.l0;
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
        Canvas canvas = C1296530jqN.LIZ;
        ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ.drawRoundRect(0.0f, fLJJJJLL, Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)), Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) + fLJJJJLL, fLJJJJLL2, fLJJJJLL2, paint);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS24S0100001_25(float f, float f2, C05P0<C1680770tq7> c05p0) {
        super(1);
        this.$t = c05p0;
        this.f1 = f;
        this.l0 = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0100001_25(float f, C05P1 c05p1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c05p1;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0100001_25(float f, C1683760tuw c1683760tuw, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = c1683760tuw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0100001_25(float f, InterfaceC1690500u5o interfaceC1690500u5o, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1690500u5o;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0100001_25(float f, Paint paint, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS24S0100001_25(C1676910tjt c1676910tjt, C1676910tjt<Object> c1676910tjt2, float f) {
        super(1);
        this.$t = f;
        this.l0 = c1676910tjt;
        this.f1 = c1676910tjt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0100001_25(C2267001DoI c2267001DoI, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2267001DoI;
        this.f1 = f;
    }
}
