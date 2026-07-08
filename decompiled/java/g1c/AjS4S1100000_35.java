package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;

/* JADX INFO: loaded from: classes36.dex */
public class AjS4S1100000_35 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final void LIZ$0(AjS4S1100000_35 ajS4S1100000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV3VH) ajS4S1100000_35.l1).u7(ajS4S1100000_35.s0, "c2857.d98326");
        }
    }

    public static final void LIZ$1(AjS4S1100000_35 ajS4S1100000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV3VH) ajS4S1100000_35.l1).u7(ajS4S1100000_35.s0, "c2857.d98326");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS4S1100000_35(USSESSellerModuleV3VH uSSESSellerModuleV3VH, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = uSSESSellerModuleV3VH;
        this.s0 = str;
    }
}
