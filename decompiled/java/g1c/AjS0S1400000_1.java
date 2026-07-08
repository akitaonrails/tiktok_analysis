package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C03O0;
import X.C04HT;
import X.C10516049i;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C719102rN;
import X.C7933037z;
import X.C974903rX;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VasBadgeModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS210S0300000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AjS0S1400000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS0S1400000_1 ajS0S1400000_1, View view) {
        VasBadgeModule vasBadgeModule;
        String str;
        if (view != null && (vasBadgeModule = (VasBadgeModule) ajS0S1400000_1.l1) != null && (str = vasBadgeModule.popup) != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap map = new HashMap();
            String str2 = ajS0S1400000_1.s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            map.put("page_name", str2);
            String str4 = ((C719102rN) ajS0S1400000_1.l3).LLLLIL;
            if (str4 != null) {
                str3 = str4;
            }
            map.put("product_id", str3);
            C03O0.LJJJLZIJ(c03o0, "authentic_badge", map, null, null, null, null, null, null, null, null, null, null, ((OrderSubmitAssemViewModel) ajS0S1400000_1.l2).LLLZLZ.LIZ("c33849.d0"), null, null, null, 983036);
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            String strLIZJ = ((OrderSubmitAssemViewModel) ajS0S1400000_1.l2).LLLZLZ.LIZJ("c33849.d0", null);
            if (strLIZJ != null) {
                sparkContext.LJJJZ("source_btm_token", strLIZJ);
            }
            try {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = ((C7933037z) ajS0S1400000_1.l4).getContext();
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void LIZ$1(AjS0S1400000_1 ajS0S1400000_1, View view) {
        if (view != null) {
            SmartRouter.buildRoute((Context) ajS0S1400000_1.l1, ajS0S1400000_1.s0).open();
            int i = C04HT.LLJJJJ;
            View view2 = (View) ajS0S1400000_1.l2;
            Map map = (Map) ajS0S1400000_1.l3;
            C1748720vbi.LJ(view2, new C10516049i(), "c55267.d3519", (PageFinder) ajS0S1400000_1.l4, new AwS115S1100000_1(map, 42));
        }
    }

    public static final void LIZ$2(AjS0S1400000_1 ajS0S1400000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((UsAddressItemVH) ajS0S1400000_1.l1).itemView, new C10516049i(), new AwS210S0300000_1((Address) ajS0S1400000_1.l2, (UsAddressItemVH) ajS0S1400000_1.l1, (C974903rX) ajS0S1400000_1.l4, 112));
            ((UsAddressItemVH) ajS0S1400000_1.l1).b6().KM(view.getContext(), C1748730vbj.LIZ(view), (Address) ajS0S1400000_1.l2, null, null, Integer.valueOf(((UsAddressItemVH) ajS0S1400000_1.l1).LLJI), null, null, ajS0S1400000_1.s0, (Map) ajS0S1400000_1.l3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S1400000_1(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
