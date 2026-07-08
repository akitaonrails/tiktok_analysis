package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1405960mgs;
import X.C1421730n6J;
import X.C1421760n6M;
import X.C1421800n6Q;
import X.C631370Opb;
import X.C724240Sb0;
import X.InterfaceC1420660n4a;
import X.InterfaceC1421750n6L;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PropClientMetadata;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownAssem;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class AjS68S0100000_22 extends AbstractViewOnClickListenerC420730Ged {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS68S0100000_22(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS68S0100000_22 ajS68S0100000_22, View view) {
        InterfaceC1420660n4a interfaceC1420660n4aOp;
        Map<String, String> map;
        if (view != null && (interfaceC1420660n4aOp = ((SkuPropDropdownAssem) ajS68S0100000_22.l0).op()) != null) {
            Fragment fragmentLJI = C724240Sb0.LJI((SkuPropDropdownAssem) ajS68S0100000_22.l0);
            View viewLJJIJL = ((SkuPropDropdownAssem) ajS68S0100000_22.l0).LJJIJL();
            PropClientMetadata propClientMetadata = ((C1405960mgs) C631370Opb.LIZ((SkuPropDropdownAssem) ajS68S0100000_22.l0)).LLILZIL;
            if (propClientMetadata != null) {
                map = propClientMetadata.eventTrackingTriggerKeys;
            } else {
                map = null;
            }
            interfaceC1420660n4aOp.Td2(viewLJJIJL, fragmentLJI, map);
        }
    }

    public static final void LIZ$1(AjS68S0100000_22 ajS68S0100000_22, View view) {
        InterfaceC1421750n6L actionListener;
        if (view != null && (actionListener = ((C1421730n6J) ajS68S0100000_22.l0).getActionListener()) != null) {
            actionListener.LIZIZ();
        }
    }

    public static final void LIZ$2(AjS68S0100000_22 ajS68S0100000_22, View view) {
        InterfaceC1421750n6L actionListener;
        if (view != null && (actionListener = ((C1421800n6Q) ajS68S0100000_22.l0).getActionListener()) != null) {
            actionListener.LIZIZ();
        }
    }

    public static final void LIZ$3(AjS68S0100000_22 ajS68S0100000_22, View view) {
        InterfaceC1421750n6L actionListener;
        if (view != null && (actionListener = ((C1421730n6J) ajS68S0100000_22.l0).getActionListener()) != null) {
            actionListener.LIZIZ();
        }
    }

    public static final void LIZ$4(AjS68S0100000_22 ajS68S0100000_22, View view) {
        InterfaceC1421750n6L actionListener;
        if (view != null && (actionListener = ((C1421760n6M) ajS68S0100000_22.l0).getActionListener()) != null) {
            actionListener.LIZIZ();
        }
    }
}
