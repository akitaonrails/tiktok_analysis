package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0MLK;
import X.C568720MSg;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AbS325S0300000_8 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS325S0300000_8 abS325S0300000_8, View view) {
        if (view != null) {
            ((Function0) abS325S0300000_8.l0).invoke();
            C568720MSg c568720MSg = (C568720MSg) abS325S0300000_8.l1;
            if (c568720MSg != null) {
                c568720MSg.LIZIZ();
            }
            ((C0MLK) abS325S0300000_8.l2).Iw1();
        }
    }

    public static final void LIZ$1(AbS325S0300000_8 abS325S0300000_8, View view) {
        if (view != null) {
            ((Function0) abS325S0300000_8.l0).invoke();
            C568720MSg c568720MSg = (C568720MSg) abS325S0300000_8.l1;
            if (c568720MSg != null) {
                c568720MSg.LIZIZ();
            }
            ((C0MLK) abS325S0300000_8.l2).W2();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS325S0300000_8(Function0 function0, C568720MSg c568720MSg, C0MLK c0mlk, int i) {
        super(500L);
        this.$t = i;
        this.l0 = function0;
        this.l1 = c568720MSg;
        this.l2 = c0mlk;
    }
}
