package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C046000Eo;
import X.C046100Ep;
import X.C703302op;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardProductCell;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardUserRightCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AjS41S0200000_6 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void LIZ$0(AjS41S0200000_6 ajS41S0200000_6, View view) {
        String strLIZJ;
        if (view != null) {
            Function0<String> function0 = ((C046100Ep) ajS41S0200000_6.l0).LLILZIL;
            if (function0 == null || (strLIZJ = function0.invoke()) == null) {
                C046100Ep c046100Ep = (C046100Ep) ajS41S0200000_6.l0;
                strLIZJ = c046100Ep.LL.LIZJ(c046100Ep.LLILZ);
            }
            if (C703302op.LIZ(strLIZJ)) {
                SmartRouter.buildRoute(((ECBillboardProductCell) ajS41S0200000_6.l1).itemView.getContext(), strLIZJ).open();
            }
            ((C046100Ep) ajS41S0200000_6.l0).LLILLJJLI.invoke();
        }
    }

    public static final void LIZ$1(AjS41S0200000_6 ajS41S0200000_6, View view) {
        if (view != null) {
            String strInvoke = ((C046000Eo) ajS41S0200000_6.l0).LLILZIL.invoke();
            if (C703302op.LIZ(strInvoke)) {
                SmartRouter.buildRoute(((ECBillboardUserRightCell) ajS41S0200000_6.l1).itemView.getContext(), strInvoke).open();
            }
            ((C046000Eo) ajS41S0200000_6.l0).LLILLJJLI.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS41S0200000_6(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
