package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1733740vDY;
import X.C2260851DeN;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public class AjS0S2500000_35 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;

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

    public static final void LIZ$0(AjS0S2500000_35 ajS0S2500000_35, View view) {
        if (view != null) {
            ((C2260851DeN) ajS0S2500000_35.l2).LL.LIZLLL.dismiss();
            String strLIZ = C1733740vDY.LIZ(((EcommerceEntrance) ajS0S2500000_35.l3).schema, C1733740vDY.LIZIZ(view, "c2505.d48421"));
            IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
            if (iECommerceShowcaseService != null) {
                iECommerceShowcaseService.LJIIJ(view.getContext(), strLIZ, ((User) ajS0S2500000_35.l4).getIdStr(), ((C2260851DeN) ajS0S2500000_35.l2).LJIJI(), "live_half_screen_profile", "visit_shop", ((C2260851DeN) ajS0S2500000_35.l2).LJIJJ(), Integer.valueOf((int) ((User) ajS0S2500000_35.l4).getFollowInfo().getFollowStatus()), null, ajS0S2500000_35.s0, ajS0S2500000_35.s1, ((C2260851DeN) ajS0S2500000_35.l2).LL.LJFF.getIdStr(), (Map) ajS0S2500000_35.l5, (Map) ajS0S2500000_35.l6);
            }
            C2260851DeN.LJIJJLI(((C2260851DeN) ajS0S2500000_35.l2).LL);
        }
    }

    public static final void LIZ$1(AjS0S2500000_35 ajS0S2500000_35, View view) {
        if (view != null) {
            ((C2260851DeN) ajS0S2500000_35.l2).LL.LIZLLL.dismiss();
            String strLIZ = C1733740vDY.LIZ(((EcommerceEntrance) ajS0S2500000_35.l3).schema, C1733740vDY.LIZIZ(view, "c2505.d48421"));
            IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
            if (iECommerceShowcaseService != null) {
                iECommerceShowcaseService.LJIIJ(view.getContext(), strLIZ, ((User) ajS0S2500000_35.l4).getIdStr(), ((C2260851DeN) ajS0S2500000_35.l2).LJIJI(), "live_half_screen_profile", "visit_shop", ((C2260851DeN) ajS0S2500000_35.l2).LJIJJ(), Integer.valueOf((int) ((User) ajS0S2500000_35.l4).getFollowInfo().getFollowStatus()), null, ajS0S2500000_35.s0, ajS0S2500000_35.s1, ((C2260851DeN) ajS0S2500000_35.l2).LL.LJFF.getIdStr(), (Map) ajS0S2500000_35.l5, (Map) ajS0S2500000_35.l6);
            }
            C2260851DeN.LJIJJLI(((C2260851DeN) ajS0S2500000_35.l2).LL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S2500000_35(C2260851DeN c2260851DeN, EcommerceEntrance ecommerceEntrance, User user, String str, String str2, Map map, Map map2, int i) {
        super(700L);
        this.$t = i;
        this.l2 = c2260851DeN;
        this.l3 = ecommerceEntrance;
        this.l4 = user;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = map;
        this.l6 = map2;
    }
}
