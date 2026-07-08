package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C04J1;
import X.C13LP;
import X.C2402509bD;
import X.C2500209qy;
import X.C424730Gl5;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AjS61S0100000_3 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS61S0100000_3(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS61S0100000_3 ajS61S0100000_3, View view) {
        C2402509bD c2402509bD;
        Function2<C2402509bD, Boolean, Unit> function2;
        if (view != null && (function2 = (c2402509bD = (C2402509bD) ajS61S0100000_3.l0).LLILLL) != null) {
            function2.invoke(c2402509bD, Boolean.TRUE);
        }
    }

    public static final void LIZ$1(AjS61S0100000_3 ajS61S0100000_3, View view) {
        int iLJJJZ;
        if (view != null) {
            if (C04J1.LIZ) {
                iLJJJZ = C13LP.LJJJZ(view, new C2500209qy((C424730Gl5) ajS61S0100000_3.l0, 22)) / 2;
            } else {
                iLJJJZ = C13LP.LJJJZ(view, new C2500209qy((C424730Gl5) ajS61S0100000_3.l0, 23));
            }
            if (iLJJJZ >= 0) {
                C424730Gl5 c424730Gl5 = (C424730Gl5) ajS61S0100000_3.l0;
                if (c424730Gl5.LL != iLJJJZ) {
                    Function1<Integer, Unit> clickStrategy = c424730Gl5.getClickStrategy();
                    if (clickStrategy != null) {
                        clickStrategy.invoke(Integer.valueOf(iLJJJZ));
                    }
                    ((C424730Gl5) ajS61S0100000_3.l0).setCurIndex(iLJJJZ);
                }
                ((C424730Gl5) ajS61S0100000_3.l0).LL = iLJJJZ;
            }
        }
    }
}
