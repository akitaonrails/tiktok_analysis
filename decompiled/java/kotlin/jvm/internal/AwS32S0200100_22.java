package kotlin.jvm.internal;

import X.C09AY;
import X.C1450940nrQ;
import X.C15O7;
import Y.ACallableS250S0200000_22;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS32S0200100_22 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        ((C1450940nrQ) awS32S0200100_22.l0).LJIIIIZZ((Bitmap) obj, (Function0) awS32S0200100_22.l1, 1, Long.valueOf(awS32S0200100_22.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        ((C1450940nrQ) awS32S0200100_22.l0).LJIIIIZZ((Bitmap) obj, (Function0) awS32S0200100_22.l1, 1, Long.valueOf(awS32S0200100_22.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        ((C1450940nrQ) awS32S0200100_22.l0).LJIIIIZZ((Bitmap) obj, (Function0) awS32S0200100_22.l1, 0, Long.valueOf(awS32S0200100_22.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C1450940nrQ c1450940nrQ = (C1450940nrQ) awS32S0200100_22.l0;
        if (!c1450940nrQ.LJIILJJIL) {
            c1450940nrQ.LJIIIIZZ(bitmap, (Function0) awS32S0200100_22.l1, 0, Long.valueOf(awS32S0200100_22.j2));
            C15O7.LIZJ(new ACallableS250S0200000_22((C1450940nrQ) awS32S0200100_22.l0, bitmap, 3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        C1450940nrQ c1450940nrQ = (C1450940nrQ) awS32S0200100_22.l0;
        c1450940nrQ.LJIILJJIL = true;
        c1450940nrQ.LJIIIIZZ((Bitmap) obj, (Function0) awS32S0200100_22.l1, 1, Long.valueOf(awS32S0200100_22.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS32S0200100_22 awS32S0200100_22, Object obj) {
        C1450940nrQ c1450940nrQ = (C1450940nrQ) awS32S0200100_22.l0;
        c1450940nrQ.LJIILJJIL = true;
        c1450940nrQ.LJIIIIZZ((Bitmap) obj, (Function0) awS32S0200100_22.l1, 1, Long.valueOf(awS32S0200100_22.j2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS32S0200100_22) (LINE:67108864) kotlin.jvm.internal.AwS32S0200100_22.$t int, block:B:2:0x0000 */
    public AwS32S0200100_22(C1450940nrQ c1450940nrQ, C1450940nrQ c1450940nrQ2, Function0<Unit> function0, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = c1450940nrQ;
        this.l1 = c1450940nrQ2;
        this.j2 = function0;
    }
}
