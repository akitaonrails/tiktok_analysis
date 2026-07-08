package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1003803wC;
import X.C1018703yb;
import X.C10516049i;
import X.C1054004Ag;
import X.C1748720vbi;
import X.C703602os;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.rightguidance.RightGuidanceModuleCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RightGuidanceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESShopPerfVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AjS2S1200000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final void LIZ$0(AjS2S1200000_1 ajS2S1200000_1, View view) {
        String str;
        if (view != null) {
            C1748720vbi.LIZLLL(((RightGuidanceModuleCell) ajS2S1200000_1.l1).itemView, new C10516049i(), new AwS52S1000000_1(ajS2S1200000_1.s0, 31));
            RightGuidanceModule rightGuidanceModule = (RightGuidanceModule) ajS2S1200000_1.l2;
            if (rightGuidanceModule != null && (str = rightGuidanceModule.schema) != null) {
                SmartRouter.buildRoute(((RightGuidanceModuleCell) ajS2S1200000_1.l1).itemView.getContext(), UriProtector.parse(str).toString()).open();
            }
        }
    }

    public static final void LIZ$1(AjS2S1200000_1 ajS2S1200000_1, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((USSESShopPerfVH) ajS2S1200000_1.l1).itemView.getContext(), ajS2S1200000_1.s0).open();
            C1054004Ag c1054004Ag = ((PdpViewModel) ((USSESShopPerfVH) ajS2S1200000_1.l1).LLJJIJIL.getValue()).LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1018703yb.LJII("tiktokec_module_click", new AwS17S2200000_1(c1054004Ag, (C1054004Ag) "seller_service", "learn_more", (String) C1003803wC.LIZ(((C703602os) ajS2S1200000_1.l2).LLILZIL), (Map<String, ? extends Object>) 13));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS2S1200000_1(Object obj, Object obj2, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
