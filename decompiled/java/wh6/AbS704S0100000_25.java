package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0C64;
import X.C1642080spi;
import X.C1659400tHe;
import android.view.View;

/* JADX INFO: loaded from: classes26.dex */
public class AbS704S0100000_25 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS704S0100000_25(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS704S0100000_25 abS704S0100000_25, View view) {
        View viewLJIJI;
        if (view != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_toolbar_click_on_icon_view", true, false)) {
                viewLJIJI = ((C1659400tHe) abS704S0100000_25.l0).LJIJI();
            } else {
                viewLJIJI = ((C1659400tHe) abS704S0100000_25.l0).LLILZ;
            }
            if (viewLJIJI != null) {
                viewLJIJI.performClick();
            }
        }
    }

    public static final void LIZ$1(AbS704S0100000_25 abS704S0100000_25, View view) {
        if (view != null) {
            ((C1642080spi) abS704S0100000_25.l0).LLJJIJIL.invoke();
        }
    }

    public static final void LIZ$2(AbS704S0100000_25 abS704S0100000_25, View view) {
        if (view != null) {
            ((C1642080spi) abS704S0100000_25.l0).LLJJIJIIJIL.invoke(Boolean.FALSE);
        }
    }
}
