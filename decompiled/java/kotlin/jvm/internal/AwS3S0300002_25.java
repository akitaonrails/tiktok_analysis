package kotlin.jvm.internal;

import X.C09AY;
import X.C1641100so8;
import X.C1641110so9;
import X.C1641120soA;
import X.C1641160soE;
import X.C1641170soF;
import X.C1641180soG;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS3S0300002_25 extends C09AY implements Function1 {
    public final int $t;
    public float f3;
    public float f4;
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

    public static final Object invoke$0(AwS3S0300002_25 awS3S0300002_25, Object obj) {
        C1641160soE c1641160soE = (C1641160soE) obj;
        c1641160soE.LJ = (int) C1641100so8.LIZIZ(awS3S0300002_25.f3, (Context) awS3S0300002_25.l0);
        c1641160soE.LJFF = (int) C1641100so8.LIZIZ(awS3S0300002_25.f4, (Context) awS3S0300002_25.l0);
        C1641120soA c1641120soA = (C1641120soA) awS3S0300002_25.l1;
        c1641160soE.LIZIZ = c1641120soA.LIZ;
        c1641160soE.LJIIZILJ = true;
        c1641160soE.LJIIIZ = c1641120soA.LJIIZILJ;
        c1641160soE.LJIILLIIL = c1641120soA.LJIJ;
        c1641160soE.LJIIJ = c1641120soA.LJIJJLI;
        c1641160soE.LJIIJJI = c1641120soA.LJIL;
        c1641160soE.LJIJJLI = c1641120soA.LIZIZ;
        c1641160soE.LJJIIJ = c1641120soA.LJIIL;
        c1641160soE.LJJIIJZLJL = c1641120soA.LJIILIIL;
        c1641160soE.LIZJ = (int) C1641100so8.LIZIZ(c1641120soA.LIZLLL, (Context) awS3S0300002_25.l0);
        c1641160soE.LIZLLL = (int) C1641100so8.LIZIZ(((C1641120soA) awS3S0300002_25.l1).LIZJ, (Context) awS3S0300002_25.l0);
        C1641120soA c1641120soA2 = (C1641120soA) awS3S0300002_25.l1;
        c1641160soE.LJIJI = c1641120soA2.LJ;
        c1641160soE.LJIJ = c1641120soA2.LJJ;
        c1641160soE.LJJIIZ = c1641120soA2.LJJIFFI;
        c1641160soE.LJJIIZI = c1641120soA2.LJJII;
        c1641160soE.LJJI = c1641120soA2.LJJIII;
        c1641160soE.LJJIJ = true;
        Function1<? super C1641170soF, Unit> function1 = c1641120soA2.LJIILLIIL;
        if (function1 != null) {
            function1.invoke(c1641160soE);
        }
        ((Function1) awS3S0300002_25.l2).invoke(c1641160soE);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0300002_25 awS3S0300002_25, Object obj) {
        C1641180soG c1641180soG = (C1641180soG) obj;
        c1641180soG.LJ = (int) C1641110so9.LIZ(awS3S0300002_25.f3, (Context) awS3S0300002_25.l0);
        c1641180soG.LJFF = (int) C1641110so9.LIZ(awS3S0300002_25.f4, (Context) awS3S0300002_25.l0);
        C1641120soA c1641120soA = (C1641120soA) awS3S0300002_25.l1;
        c1641180soG.LIZIZ = c1641120soA.LIZ;
        c1641180soG.LJIIZILJ = true;
        c1641180soG.LJIIIZ = c1641120soA.LJIIZILJ;
        c1641180soG.LJIILLIIL = c1641120soA.LJIJ;
        c1641180soG.LJIIJ = c1641120soA.LJIJJLI;
        c1641180soG.LJIIJJI = c1641120soA.LJIL;
        c1641180soG.LJIJJLI = c1641120soA.LIZIZ;
        c1641180soG.LJJIIJ = c1641120soA.LJIIL;
        c1641180soG.LJJIIJZLJL = c1641120soA.LJIILIIL;
        c1641180soG.LIZJ = (int) C1641110so9.LIZ(c1641120soA.LIZLLL, (Context) awS3S0300002_25.l0);
        C1641120soA c1641120soA2 = (C1641120soA) awS3S0300002_25.l1;
        c1641180soG.LJIJI = c1641120soA2.LJ;
        c1641180soG.LJIJ = c1641120soA2.LJJ;
        Function1<? super C1641170soF, Unit> function1 = c1641120soA2.LJIILLIIL;
        if (function1 != null) {
            function1.invoke(c1641180soG);
        }
        ((Function1) awS3S0300002_25.l2).invoke(c1641180soG);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S0300002_25(Context context, Context context2, float f, float f2, C1641120soA c1641120soA, Function1<? super C1641170soF, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = context;
        this.f3 = context2;
        this.f4 = f;
        this.l1 = f2;
        this.l2 = c1641120soA;
    }
}
