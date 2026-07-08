package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C1463030oAv;
import X.C1463050oAx;
import X.InterfaceC358010E1v;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS0S0331000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AwS0S0331000_22 awS0S0331000_22) {
        C01TT.LIZLLL(new AwS423S0200000_22((C1463050oAx) awS0S0331000_22.l0, new AwS0S0331000_22((C1463050oAx) awS0S0331000_22.l0, (AVMusic) awS0S0331000_22.l1, awS0S0331000_22.i6, awS0S0331000_22.z3, (Function1) awS0S0331000_22.l2, awS0S0331000_22.z4, awS0S0331000_22.z5, 1), 27));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0331000_22 awS0S0331000_22) {
        C1463030oAv c1463030oAvLJII = ((C1463050oAx) awS0S0331000_22.l0).LJII();
        final AVMusic aVMusic = (AVMusic) awS0S0331000_22.l1;
        int i = awS0S0331000_22.i6;
        final boolean z = awS0S0331000_22.z3;
        final C1463050oAx c1463050oAx = (C1463050oAx) awS0S0331000_22.l0;
        final Function1 function1 = (Function1) awS0S0331000_22.l2;
        final boolean z2 = awS0S0331000_22.z4;
        final boolean z3 = awS0S0331000_22.z5;
        c1463030oAvLJII.LIZJ(aVMusic, i, 2, z, new InterfaceC358010E1v() { // from class: X.0oB8
            @Override // X.InterfaceC358010E1v
            public final void onFailed() {
                c1463050oAx.LIZIZ.LLILLL(false, true, true, z);
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                ((InterfaceC376040Eok) c1463050oAx.LJIIJJI.getValue()).gh0(null);
                c1463050oAx.LJIIL = false;
            }

            @Override // X.InterfaceC358010E1v
            public final void LIZ(int i2) {
                c1463050oAx.LJIIJ(aVMusic);
                c1463050oAx.LIZIZ.L(i2);
                c1463050oAx.LIZIZ.LLILLL(true, z2, z3, z);
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                c1463050oAx.LIZIZ.LLLLLLJ();
                ((InterfaceC376040Eok) c1463050oAx.LJIIJJI.getValue()).gh0(null);
                c1463050oAx.getClass();
                c1463050oAx.LJIIL = false;
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0331000_22(C1463050oAx c1463050oAx, C1463050oAx c1463050oAx2, AVMusic aVMusic, int i, boolean z, Function1<? super Boolean, Unit> function1, boolean z2, boolean z3) {
        super(0);
        this.$t = z3 ? 1 : 0;
        this.l0 = c1463050oAx;
        this.l1 = c1463050oAx2;
        this.i6 = aVMusic;
        this.z3 = i;
        this.l2 = z;
        this.z4 = function1;
        this.z5 = z2;
    }
}
