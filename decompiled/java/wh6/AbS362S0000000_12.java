package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1389890mGx;
import X.C766270U4b;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class AbS362S0000000_12 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS362S0000000_12(int i) {
        super(300L);
        this.$t = i;
    }

    public static final void LIZ$0(AbS362S0000000_12 abS362S0000000_12, View view) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131830133);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$1(AbS362S0000000_12 abS362S0000000_12, View view) {
        if (view != null) {
            C766270U4b.LIZLLL(2131854502);
        }
    }
}
