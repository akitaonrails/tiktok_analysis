package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C18MV;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;

/* JADX INFO: loaded from: classes33.dex */
public class AbS155S0201000_32 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS155S0201000_32 abS155S0201000_32, View view) {
        C18MV c18mv = (C18MV) abS155S0201000_32.l0;
        c18mv.I5(c18mv.LL, abS155S0201000_32.i2, (AnchorProductInfoModel) abS155S0201000_32.l1, "info");
    }

    public static final void LIZ$1(AbS155S0201000_32 abS155S0201000_32, View view) {
        C18MV c18mv = (C18MV) abS155S0201000_32.l0;
        c18mv.I5(c18mv.LL, abS155S0201000_32.i2, (AnchorProductInfoModel) abS155S0201000_32.l1, "other");
    }

    public static final void LIZ$2(AbS155S0201000_32 abS155S0201000_32, View view) {
        C18MV c18mv = (C18MV) abS155S0201000_32.l0;
        c18mv.I5(c18mv.LL, abS155S0201000_32.i2, (AnchorProductInfoModel) abS155S0201000_32.l1, "pic");
    }

    public static final void LIZ$3(AbS155S0201000_32 abS155S0201000_32, View view) {
        C18MV c18mv = (C18MV) abS155S0201000_32.l0;
        c18mv.I5(c18mv.LL, abS155S0201000_32.i2, (AnchorProductInfoModel) abS155S0201000_32.l1, "info");
    }

    public static final void LIZ$4(AbS155S0201000_32 abS155S0201000_32, View view) {
        C18MV c18mv = (C18MV) abS155S0201000_32.l0;
        c18mv.I5(c18mv.LL, abS155S0201000_32.i2, (AnchorProductInfoModel) abS155S0201000_32.l1, "info");
    }

    public AbS155S0201000_32(C18MV c18mv, int i, AnchorProductInfoModel anchorProductInfoModel, int i2) {
        this.$t = i2;
        this.l0 = c18mv;
        this.i2 = i;
        this.l1 = anchorProductInfoModel;
    }
}
