package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0TM3;
import X.C0TM5;
import X.C0TM6;
import X.C745280TLi;
import X.C745310TLl;
import X.InterfaceC745300TLk;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class AkS8S0201000_12 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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

    public static final void LIZ$0(AkS8S0201000_12 akS8S0201000_12, View view) {
        ((C0TM3) akS8S0201000_12.l0).LLLFZ(akS8S0201000_12.i2);
        C0TM5 c0tm5 = ((C0TM3) akS8S0201000_12.l0).LLILZIL;
        if (c0tm5 != null) {
            c0tm5.LIZIZ(((C0TM6) akS8S0201000_12.l1).LIZ);
        }
        C0TM5 c0tm52 = ((C0TM3) akS8S0201000_12.l0).LLILZIL;
        if (c0tm52 != null) {
            c0tm52.LIZ(akS8S0201000_12.i2, true);
        }
    }

    public static final void LIZ$1(AkS8S0201000_12 akS8S0201000_12, View view) {
        InterfaceC745300TLk interfaceC745300TLk = ((C745280TLi) akS8S0201000_12.l0).LLILLL;
        if (interfaceC745300TLk != null && interfaceC745300TLk.LIZIZ((C745310TLl) akS8S0201000_12.l1)) {
            C745280TLi c745280TLi = (C745280TLi) akS8S0201000_12.l0;
            int i = akS8S0201000_12.i2;
            int i2 = c745280TLi.LL;
            if (i2 != i) {
                c745280TLi.LL = i;
                c745280TLi.notifyItemChanged(i2);
                c745280TLi.notifyItemChanged(c745280TLi.LL);
            }
            InterfaceC745300TLk interfaceC745300TLk2 = ((C745280TLi) akS8S0201000_12.l0).LLILLL;
            if (interfaceC745300TLk2 != null) {
                interfaceC745300TLk2.LIZ(akS8S0201000_12.i2, true);
            }
        }
    }

    public AkS8S0201000_12(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
