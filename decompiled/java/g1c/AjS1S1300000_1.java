package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C049H;
import X.C1013003xg;
import X.C1013103xh;
import X.C1020703yv;
import X.C10516049i;
import X.C1388190mED;
import X.C1748720vbi;
import X.C19EG;
import X.C259800zU;
import X.InterfaceC1012803xe;
import android.app.Activity;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewHeadViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.waistbanner.SeaPdpWaistBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AjS1S1300000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final void LIZ$0(AjS1S1300000_1 ajS1S1300000_1, View view) {
        if (view != null) {
            ((PaymentFragment) ajS1S1300000_1.l1).VR();
            PaymentFragment paymentFragment = (PaymentFragment) ajS1S1300000_1.l1;
            paymentFragment.withState(paymentFragment.yS(), new AwS43S1300000_1((PaymentFragment) ajS1S1300000_1.l1, (PaymentFragment) ajS1S1300000_1.s0, (String) ajS1S1300000_1.l2, (C259800zU<Integer>) ajS1S1300000_1.l3, (C259800zU<Integer>) 2));
        }
    }

    public static final void LIZ$1(AjS1S1300000_1 ajS1S1300000_1, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((View) ajS1S1300000_1.l1).getContext(), ajS1S1300000_1.s0).open();
            int i = SeaPdpReviewHeadViewHolderV2.LLJJJJ;
            Map map = (Map) ajS1S1300000_1.l2;
            C1748720vbi.LJ(view, new C10516049i(), "c48189.d29438", (PageFinder) ajS1S1300000_1.l3, new AwS115S1100000_1(map, 15));
        }
    }

    public static final void LIZ$2(AjS1S1300000_1 ajS1S1300000_1, View view) {
        Object obj;
        String str;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (view != null) {
            Activity activityLIZ = C1388190mED.LIZ(((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).itemView.getContext());
            String str2 = null;
            if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
                HashMap map3 = new HashMap();
                IPdpStarter.PdpEnterParam pdpEnterParam = ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLIZ;
                if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                    try {
                        map3.putAll(map2);
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
                String strLJII = ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLLLL.LJII("c7829.d4866", ajS1S1300000_1.s0, null);
                IPdpStarter.PdpEnterParam pdpEnterParam2 = ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLIZ;
                if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
                    obj = map.get("entrance_info");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                C1013003xg c1013003xg = IPdpStarter.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam3 = ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLIZ;
                c1013003xg.getClass();
                String strValueOf = String.valueOf(C1013003xg.LIZJ(pdpEnterParam3));
                Boolean boolValueOf = Boolean.valueOf(((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLIZLLLIL);
                IPdpStarter.PdpEnterParam pdpEnterParam4 = ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().LLIZ;
                if (pdpEnterParam4 != null) {
                    str2 = pdpEnterParam4.sourceInfo;
                }
                C1013103xh.LIZ(c1013103xh, activityLIZ, strLJII, str, map3, null, "price", strValueOf, boolValueOf, str2, ((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).c6().getSkuId(), null, false, null, null, 30752);
            }
            SeaPdpWaistBannerViewHolder seaPdpWaistBannerViewHolder = (SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1;
            C1748720vbi.LJ(seaPdpWaistBannerViewHolder.itemView, new C10516049i(), "c93481.d0", (PageFinder) ajS1S1300000_1.l3, new AwS367S0200000_1((C1020703yv) ajS1S1300000_1.l2, seaPdpWaistBannerViewHolder, 213));
            C1748720vbi.LJ(((SeaPdpWaistBannerViewHolder) ajS1S1300000_1.l1).itemView, new C049H(), "c93481.d0", (PageFinder) ajS1S1300000_1.l3, new AwS580S0100000_1((C1020703yv) ajS1S1300000_1.l2, 517));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS1S1300000_1(Object obj, String str, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
