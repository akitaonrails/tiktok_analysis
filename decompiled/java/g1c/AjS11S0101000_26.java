package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1762790vyP;
import X.InterfaceC1749380vcm;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AjS11S0101000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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

    public static final void LIZ$0(AjS11S0101000_26 ajS11S0101000_26, View view) {
        if (view != null) {
            ((InterfaceC1749380vcm) ajS11S0101000_26.l0).LIZ(ajS11S0101000_26.i1);
        }
    }

    public static final void LIZ$1(AjS11S0101000_26 ajS11S0101000_26, View view) {
        if (view != null) {
            C1762790vyP c1762790vyP = (C1762790vyP) ajS11S0101000_26.l0;
            if (c1762790vyP.LL != ajS11S0101000_26.i1) {
                Function1<Integer, Unit> clickStrategy = c1762790vyP.getClickStrategy();
                if (clickStrategy != null) {
                    clickStrategy.invoke(Integer.valueOf(ajS11S0101000_26.i1));
                }
                C1762790vyP c1762790vyP2 = (C1762790vyP) ajS11S0101000_26.l0;
                c1762790vyP2.LIZ(ajS11S0101000_26.i1, c1762790vyP2.LLILLJJLI);
            }
            ((C1762790vyP) ajS11S0101000_26.l0).LL = ajS11S0101000_26.i1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS11S0101000_26(Object obj, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
