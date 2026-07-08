package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C048L;
import X.C11XN;
import X.C11XV;
import X.C1748720vbi;
import X.C19EG;
import X.C2327809Ae;
import X.C703302op;
import X.C724240Sb0;
import X.C919503ib;
import X.EnumC1751650vgR;
import X.InterfaceC2260541Dds;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV2VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public class AjS24S0300000_35 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS24S0300000_35 ajS24S0300000_35, View view) {
        if (view != null) {
            ((SeaPdpCouponsViewHolder) ajS24S0300000_35.l0).c6((Voucher) ajS24S0300000_35.l1, (C11XN) ajS24S0300000_35.l2);
            Integer costType = ((Voucher) ajS24S0300000_35.l1).getCostType();
            if (costType != null && costType.intValue() == 3 && ((C11XN) ajS24S0300000_35.l2) == C11XN.USE) {
                C1748720vbi.LIZLLL(((SeaPdpCouponsViewHolder) ajS24S0300000_35.l0).itemView, new C048L(), AFwS283S0000000_35.get$arr$(6));
            }
        }
    }

    public static final void LIZ$1(AjS24S0300000_35 ajS24S0300000_35, View view) {
        if (view != null) {
            Integer num = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value = EnumC1751650vgR.PREVIOUS.getValue();
            Float fLJIIIIZZ = null;
            PdpFragment pdpFragment = null;
            if (num != null && num.intValue() == value) {
                PdpViewModel pdpViewModelZ6 = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).z6();
                C19EG c19egLIZ = C724240Sb0.LIZ(((USSESSellerModuleV2VH) ajS24S0300000_35.l1).LLJJIJIL);
                Fragment fragment = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).LLJJIJIL;
                if (fragment instanceof PdpFragment) {
                    pdpFragment = (PdpFragment) fragment;
                }
                pdpViewModelZ6.pR2(c19egLIZ, pdpFragment);
                return;
            }
            if (!C703302op.LIZ(((LiveInfo) ajS24S0300000_35.l0).link)) {
                return;
            }
            Integer num2 = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value2 = EnumC1751650vgR.LIVEROOM.getValue();
            if (num2 != null && num2.intValue() == value2) {
                Context context = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).itemView.getContext();
                String str = ((LiveInfo) ajS24S0300000_35.l0).link;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String strLJI = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).z6().LLILZIL.LJI("c2857.d21872", null);
                if (strLJI != null) {
                    linkedHashMap.put("source_btm_token", strLJI);
                }
                C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
                return;
            }
            Integer num3 = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value3 = EnumC1751650vgR.SHOPPAGE.getValue();
            if (num3 == null || num3.intValue() != value3) {
                return;
            }
            PdpViewModel pdpViewModelZ62 = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).z6();
            Context context2 = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).itemView.getContext();
            String str2 = ((LiveInfo) ajS24S0300000_35.l0).link;
            USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) ajS24S0300000_35.l2;
            String str3 = uSSESSellerModuleVO.sellerName;
            String str4 = uSSESSellerModuleVO.rating;
            if (str4 != null) {
                fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4);
            }
            int iTg2 = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).z6().Tg2();
            USSESSellerModuleVO uSSESSellerModuleVO2 = (USSESSellerModuleVO) ajS24S0300000_35.l2;
            List<SellerDetailInfo> list = uSSESSellerModuleVO2.shopDetailInfos;
            String strU6 = ((USSESSellerModuleV2VH) ajS24S0300000_35.l1).u6(uSSESSellerModuleVO2.brandLabels);
            ShopPerformance shopPerformance = ((USSESSellerModuleVO) ajS24S0300000_35.l2).shopPerformance;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("is_live", 1);
            linkedHashMap2.put("source_previous_page", "product_detail");
            PdpViewModel.VR2(pdpViewModelZ62, context2, str2, str3, fLJIIIIZZ, "showcase_detail", null, iTg2, null, null, "showcase_detail", list, "shop_pic", strU6, shopPerformance, null, "c2857.d21872", null, null, linkedHashMap2, 434592);
        }
    }

    public static final void LIZ$2(AjS24S0300000_35 ajS24S0300000_35, View view) {
        if (view != null) {
            Integer num = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value = EnumC1751650vgR.PREVIOUS.getValue();
            Float fLJIIIIZZ = null;
            PdpFragment pdpFragment = null;
            if (num != null && num.intValue() == value) {
                PdpViewModel pdpViewModelT7 = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).t7();
                C19EG c19egLIZ = C724240Sb0.LIZ(((USSESSellerModuleV3VH) ajS24S0300000_35.l1).LLJJIJIL);
                Fragment fragment = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).LLJJIJIL;
                if (fragment instanceof PdpFragment) {
                    pdpFragment = (PdpFragment) fragment;
                }
                pdpViewModelT7.pR2(c19egLIZ, pdpFragment);
                return;
            }
            if (!C703302op.LIZ(((LiveInfo) ajS24S0300000_35.l0).link)) {
                return;
            }
            Integer num2 = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value2 = EnumC1751650vgR.LIVEROOM.getValue();
            if (num2 != null && num2.intValue() == value2) {
                Context context = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).itemView.getContext();
                String str = ((LiveInfo) ajS24S0300000_35.l0).link;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String strLJI = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).t7().LLILZIL.LJI("c2857.d21872", null);
                if (strLJI != null) {
                    linkedHashMap.put("source_btm_token", strLJI);
                }
                C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
                return;
            }
            Integer num3 = ((LiveInfo) ajS24S0300000_35.l0).jumpAction;
            int value3 = EnumC1751650vgR.SHOPPAGE.getValue();
            if (num3 == null || num3.intValue() != value3) {
                return;
            }
            PdpViewModel pdpViewModelT72 = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).t7();
            Context context2 = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).itemView.getContext();
            String str2 = ((LiveInfo) ajS24S0300000_35.l0).link;
            USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) ajS24S0300000_35.l2;
            String str3 = uSSESSellerModuleVO.sellerName;
            String str4 = uSSESSellerModuleVO.rating;
            if (str4 != null) {
                fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4);
            }
            int iTg2 = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).t7().Tg2();
            USSESSellerModuleVO uSSESSellerModuleVO2 = (USSESSellerModuleVO) ajS24S0300000_35.l2;
            List<SellerDetailInfo> list = uSSESSellerModuleVO2.shopDetailInfos;
            String strB7 = ((USSESSellerModuleV3VH) ajS24S0300000_35.l1).b7(uSSESSellerModuleVO2.brandLabels);
            ShopPerformance shopPerformance = ((USSESSellerModuleVO) ajS24S0300000_35.l2).shopPerformance;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("is_live", 1);
            linkedHashMap2.put("source_previous_page", "product_detail");
            PdpViewModel.VR2(pdpViewModelT72, context2, str2, str3, fLJIIIIZZ, "showcase_detail", null, iTg2, null, null, "showcase_detail", list, "shop_pic", strB7, shopPerformance, null, "c2857.d21872", null, null, linkedHashMap2, 434592);
        }
    }

    public static final void LIZ$3(AjS24S0300000_35 ajS24S0300000_35, View view) {
        if (view != null) {
            ((InterfaceC2260541Dds) ajS24S0300000_35.l0).LIZ((Voucher) ajS24S0300000_35.l1, (C11XV) ajS24S0300000_35.l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS24S0300000_35(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
