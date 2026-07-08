package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0E2F;
import X.C0E2G;
import X.C0E2I;
import X.C0E2K;
import X.C0EUR;
import X.C0FLA;
import X.C0FN4;
import X.C373410EkV;
import X.C389250FNz;
import X.EnumC373340EkO;
import X.EnumC373600Eko;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AkS77S0100000_5 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS77S0100000_5(Function0 function0, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = function0;
    }

    public static final void LIZ$0(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((C0EUR) akS77S0100000_5.l0).LLLLIL().LJIIIZ();
    }

    public static final void LIZ$1(AkS77S0100000_5 akS77S0100000_5, View view) {
        C0E2F c0e2f;
        if (((C373410EkV) akS77S0100000_5.l0).LLLLILI().LIZ.LJ != EnumC373600Eko.PLAY) {
            ((C373410EkV) akS77S0100000_5.l0).LLLLIL().LIZ.invoke(C0E2I.LIZ);
        }
        Function1<C0E2F, Unit> function1 = ((C373410EkV) akS77S0100000_5.l0).LLLLIL().LIZ;
        if (((C373410EkV) akS77S0100000_5.l0).LLLLILI().LIZ.LIZLLL == EnumC373340EkO.ADD_KEYFRAME) {
            c0e2f = C0E2G.LIZ;
        } else {
            c0e2f = C0E2K.LIZ;
        }
        function1.invoke(c0e2f);
    }

    public static final void LIZ$2(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((C389250FNz) akS77S0100000_5.l0).LLLLIL().LJFF.invoke();
    }

    public static final void LIZ$3(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((C389250FNz) akS77S0100000_5.l0).LLLLIL().LIZJ.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$4(irm.AkS77S0100000_5 r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS77S0100000_5.LIZ$4(irm.AkS77S0100000_5, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$5(irm.AkS77S0100000_5 r63, android.view.View r64) {
        /*
            Method dump skipped, instruction units count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS77S0100000_5.LIZ$5(irm.AkS77S0100000_5, android.view.View):void");
    }

    public static final void LIZ$6(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((Function0) akS77S0100000_5.l0).invoke();
    }

    public static final void LIZ$7(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((C0FLA) akS77S0100000_5.l0).LJFF();
    }

    public static final void LIZ$8(AkS77S0100000_5 akS77S0100000_5, View view) {
        ((Function0) akS77S0100000_5.l0).invoke();
    }

    public static final void LIZ$9(AkS77S0100000_5 akS77S0100000_5, View view) {
        C0FN4 c0fn4 = (C0FN4) akS77S0100000_5.l0;
        c0fn4.LLILZIL = 0;
        View view2 = c0fn4.LLIZ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0fn4, view2);
        c0fn4.removeView(view2);
        Function0<Unit> function0 = c0fn4.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public AkS77S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
