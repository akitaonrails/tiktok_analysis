package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1011703xT;
import X.C10516049i;
import X.C1388190mED;
import X.C1748720vbi;
import X.C1750200ve6;
import X.C1753400vjG;
import X.C23271099x;
import X.C2327809Ae;
import X.C948503nH;
import X.EnumC1751780vge;
import X.InterfaceC1748810vbr;
import X.InterfaceC1753440vjK;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AjS8S0400000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(g1c.AjS8S0400000_26 r19, android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS8S0400000_26.LIZ$0(g1c.AjS8S0400000_26, android.view.View):void");
    }

    public static final void LIZ$1(AjS8S0400000_26 ajS8S0400000_26, View view) {
        C1753400vjG c1753400vjG;
        InterfaceC1753440vjK interfaceC1753440vjK;
        if (view != null) {
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            if (activityLIZ != null) {
                SeaPdpViewModel seaPdpViewModelLJIL = ((SeaPdpHeadNavBarWidget) ajS8S0400000_26.l1).LJIL();
                SeaPdpFragment seaPdpFragment = ((SeaPdpHeadNavBarWidget) ajS8S0400000_26.l1).LLJ;
                ShareInfo shareInfo = (ShareInfo) ajS8S0400000_26.l3;
                seaPdpViewModelLJIL.getClass();
                C948503nH.LJFF(seaPdpViewModelLJIL, C23271099x.INSTANCE, new C1750200ve6(shareInfo, seaPdpViewModelLJIL, activityLIZ, seaPdpFragment, null));
            }
            View view2 = (View) ajS8S0400000_26.l0;
            if ((view2 instanceof C1753400vjG) && (interfaceC1753440vjK = (c1753400vjG = (C1753400vjG) view2).LLILZIL) != null) {
                c1753400vjG.getCevShareIconFromXml();
                interfaceC1753440vjK.LIZIZ();
            }
            SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget = (SeaPdpHeadNavBarWidget) ajS8S0400000_26.l1;
            seaPdpHeadNavBarWidget.withState(seaPdpHeadNavBarWidget.LJIL(), new AwS392S0200000_26(seaPdpHeadNavBarWidget, (PDPBenefitInfo) ajS8S0400000_26.l2, 91));
        }
    }

    public static final void LIZ$2(AjS8S0400000_26 ajS8S0400000_26, View view) {
        WaistJumpSchema waistJumpSchema;
        if (view != null) {
            BannerComponent bannerComponent = ((PromotionWaist) ajS8S0400000_26.l0).tailComponent;
            if (bannerComponent != null) {
                waistJumpSchema = bannerComponent.jumpSchema;
            } else {
                waistJumpSchema = null;
            }
            C1011703xT.LIZ(waistJumpSchema, (InterfaceC1748810vbr) ajS8S0400000_26.l1, ((View) ajS8S0400000_26.l2).getContext(), ((PdpViewModel) ajS8S0400000_26.l3).LLJI);
            C1748720vbi.LJFF((View) ajS8S0400000_26.l2, new C10516049i(), AFwS215S0000000_26.get$arr$(410), new AwS605S0100000_26((PromotionWaist) ajS8S0400000_26.l0, 572));
        }
    }

    public static final void LIZ$3(AjS8S0400000_26 ajS8S0400000_26, View view) {
        if (view != null) {
            ((PdpBundleDealVH) ajS8S0400000_26.l0).c6().LIZLLL((View) ajS8S0400000_26.l1, (BundleInfo) ajS8S0400000_26.l2, "add_to_cart_blank");
            ((PdpBundleDealVH) ajS8S0400000_26.l0).f6((BundleAddButton) ajS8S0400000_26.l3, (BundleInfo) ajS8S0400000_26.l2);
        }
    }

    public static final void LIZ$4(AjS8S0400000_26 ajS8S0400000_26, View view) {
        Float fLJIIIIZZ;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            C1748720vbi.LIZIZ(((PdpHeadNavBarWidget) ajS8S0400000_26.l0).LLJ, new C10516049i(), new AwS605S0100000_26((LiveInfo) ajS8S0400000_26.l1, 898));
            String str = ((LiveInfo) ajS8S0400000_26.l1).link;
            if (str != null && !a0.LJJJIL(str)) {
                PdpViewModel pdpViewModelLJIJI = ((PdpHeadNavBarWidget) ajS8S0400000_26.l0).LJIJI();
                SellerInfo sellerInfo = (SellerInfo) ajS8S0400000_26.l2;
                String str2 = sellerInfo.sellerId;
                String str3 = sellerInfo.rating;
                String str4 = null;
                if (str3 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                } else {
                    fLJIIIIZZ = null;
                }
                StoreLabel storeLabel = ((SellerInfo) ajS8S0400000_26.l2).storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str4 = storeOfficialLabel.labelTypeStr;
                }
                PdpViewModel.VR2(pdpViewModelLJIJI, (Context) ajS8S0400000_26.l3, str, str2, fLJIIIIZZ, "top_bar", str4, ((PdpHeadNavBarWidget) ajS8S0400000_26.l0).LJIJI().Tg2(), null, null, "click_top_bar", null, null, null, null, EnumC1751780vge.NAV_TOP_BUTTON, "c35259.d44698", null, null, null, 949632);
            }
        }
    }

    public static final void LIZ$5(AjS8S0400000_26 ajS8S0400000_26, View view) {
        if (view != null) {
            ((SeaPdpBundleDealVH) ajS8S0400000_26.l0).c6().LIZLLL((View) ajS8S0400000_26.l1, (BundleInfo) ajS8S0400000_26.l2, "add_to_cart_blank");
            ((SeaPdpBundleDealVH) ajS8S0400000_26.l0).e6((BundleAddButton) ajS8S0400000_26.l3, (BundleInfo) ajS8S0400000_26.l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS8S0400000_26(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
