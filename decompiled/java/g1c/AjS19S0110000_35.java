package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV2VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH;

/* JADX INFO: loaded from: classes36.dex */
public class AjS19S0110000_35 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV3VH) ajS19S0110000_35.l0).P7(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    public static final void LIZ$1(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV3VH) ajS19S0110000_35.l0).P7(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    public static final void LIZ$2(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV2VH) ajS19S0110000_35.l0).J6(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    public static final void LIZ$3(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleV2VH) ajS19S0110000_35.l0).J6(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    public static final void LIZ$4(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleVH) ajS19S0110000_35.l0).z6(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    public static final void LIZ$5(AjS19S0110000_35 ajS19S0110000_35, View view) {
        if (view != null) {
            ((USSESSellerModuleVH) ajS19S0110000_35.l0).z6(view.getContext(), ajS19S0110000_35.z1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS19S0110000_35(Object obj, boolean z, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
