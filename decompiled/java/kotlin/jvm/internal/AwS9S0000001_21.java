package kotlin.jvm.internal;

import X.C09AY;
import X.C1384510m8H;
import X.C1384530m8J;
import X.C1384750m8f;
import X.C1385090m9D;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS9S0000001_21 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0000001_21(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        ((C1384750m8f) obj).LIZLLL.LIZ((int) (awS9S0000001_21.f0 * 100));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        ((C1384750m8f) obj).LJFF.LIZJ(awS9S0000001_21.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        C1384530m8J c1384530m8J = ((C1384750m8f) obj).LJ;
        float f = awS9S0000001_21.f0;
        int i = (c1384530m8J.LIZ > f ? 1 : (c1384530m8J.LIZ == f ? 0 : -1));
        if (f <= 0) {
            f = 48.0f;
        }
        c1384530m8J.LIZ = f;
        c1384530m8J.LJI.LIZ(1200);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        C1385090m9D c1385090m9D = ((C1384750m8f) obj).LIZLLL;
        float f = awS9S0000001_21.f0;
        int i = 255;
        int i2 = (int) (f * 255);
        int i3 = c1385090m9D.LIZJ;
        if (i2 < 0) {
            i = 0;
        } else if (i2 <= 255) {
            i = i2;
        }
        c1385090m9D.LIZJ = i;
        c1385090m9D.LJIILJJIL.LIZ(1100);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        ((C1384750m8f) obj).LJFF.LIZIZ(awS9S0000001_21.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        C1384510m8H c1384510m8H = ((C1384750m8f) obj).LJFF;
        float f = awS9S0000001_21.f0;
        int i = (c1384510m8H.LJ > f ? 1 : (c1384510m8H.LJ == f ? 0 : -1));
        if (f < 0) {
            f = 0.0f;
        }
        c1384510m8H.LJ = f;
        c1384510m8H.LJIIJJI.LIZ(1404);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS9S0000001_21 awS9S0000001_21, Object obj) {
        C1384530m8J c1384530m8J = ((C1384750m8f) obj).LJ;
        float f = awS9S0000001_21.f0;
        int i = (c1384530m8J.LIZLLL > f ? 1 : (c1384530m8J.LIZLLL == f ? 0 : -1));
        if (f < 0) {
            f = 2.75f;
        }
        c1384530m8J.LIZLLL = f;
        c1384530m8J.LJI.LIZ(1203);
        return Unit.LIZ;
    }
}
