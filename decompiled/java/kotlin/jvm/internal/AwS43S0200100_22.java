package kotlin.jvm.internal;

import X.AbstractC1452680nuE;
import X.C09AY;
import X.C0E48;
import X.C0EC2;
import X.C1442040nd4;
import X.C1452090ntH;
import X.C1465110oEH;
import X.C2095008Iq;
import X.C991110btl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS43S0200100_22 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0200100_22 awS43S0200100_22) {
        boolean z;
        boolean z2;
        Long lLJIILIIL;
        Integer num;
        C991110btl c991110btlLJ = ((C1465110oEH) awS43S0200100_22.l0).LJ();
        if (((C1465110oEH) awS43S0200100_22.l0).LJIIJJI() && !((C1465110oEH) awS43S0200100_22.l0).LJIIIIZZ()) {
            z = true;
        } else {
            z = false;
        }
        ((C1465110oEH) awS43S0200100_22.l0).getClass();
        VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
        long j = awS43S0200100_22.j2;
        if (!z && ((C1465110oEH) awS43S0200100_22.l0).LJIJJLI == z && !c991110btlLJ.LIZ) {
            z2 = false;
        } else {
            z2 = true;
        }
        Long lValueOf = null;
        if (z) {
            lLJIILIIL = C2095008Iq.LJIILIIL(((C1465110oEH) awS43S0200100_22.l0).LJIJI);
        } else {
            lLJIILIIL = null;
        }
        if (((C1465110oEH) awS43S0200100_22.l0).LJIIJJI() && (num = ((C1465110oEH) awS43S0200100_22.l0).LJIJJ) != null) {
            lValueOf = Long.valueOf(num.intValue());
        }
        C1465110oEH c1465110oEH = (C1465110oEH) awS43S0200100_22.l0;
        boolean zLIZLLL = c1465110oEH.LIZLLL(c1465110oEH.LJIJI);
        int i = C0EC2.LIZIZ;
        return C1442040nd4.LJ(videoPublishEditModelLJIIJ, j, z2, lLJIILIIL, lValueOf, zLIZLLL, C0EC2.LIZJ((C0E48) awS43S0200100_22.l1), !r1.LJIIL, null, new AwS566S0100000_22((C1465110oEH) awS43S0200100_22.l0, 33), false, 640);
    }

    public static final Object invoke$1(AwS43S0200100_22 awS43S0200100_22) {
        ((C1452090ntH) awS43S0200100_22.l0).Gd(((AbstractC1452680nuE) awS43S0200100_22.l1).LJJ(), awS43S0200100_22.j2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS43S0200100_22) (LINE:67108864) kotlin.jvm.internal.AwS43S0200100_22.$t int, block:B:2:0x0000 */
    public AwS43S0200100_22(C1452090ntH c1452090ntH, C1452090ntH<T> c1452090ntH2, AbstractC1452680nuE abstractC1452680nuE, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = c1452090ntH;
        this.l1 = c1452090ntH2;
        this.j2 = abstractC1452680nuE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0200100_22(C1465110oEH c1465110oEH, long j, C0E48 c0e48, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1465110oEH;
        this.j2 = j;
        this.l1 = c0e48;
    }
}
