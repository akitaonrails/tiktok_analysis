package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1054004Ag;
import X.C11XJ;
import X.C11XN;
import X.C11XV;
import X.C1741890vQh;
import X.C2260521Ddq;
import X.C2327809Ae;
import X.InterfaceC2260541Dds;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV2VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityAuthorizedData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityDTCData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabelData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.TopRatedInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public class AjS48S0200000_35 extends AbstractViewOnClickListenerC420730Ged {
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
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SeaPdpCouponsViewHolder seaPdpCouponsViewHolder = (SeaPdpCouponsViewHolder) ajS48S0200000_35.l0;
            seaPdpCouponsViewHolder.c6(seaPdpCouponsViewHolder.f6((C11XJ) seaPdpCouponsViewHolder.itemView.findViewById(R.id.mk7)), (C11XN) ajS48S0200000_35.l1);
        }
    }

    public static final void LIZ$1(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SeaPdpCouponsViewHolder seaPdpCouponsViewHolder = (SeaPdpCouponsViewHolder) ajS48S0200000_35.l0;
            seaPdpCouponsViewHolder.c6(seaPdpCouponsViewHolder.f6((C11XJ) seaPdpCouponsViewHolder.itemView.findViewById(R.id.tli)), (C11XN) ajS48S0200000_35.l1);
        }
    }

    public static final void LIZ$10(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            String str = ((USSESSellerModuleVO) ajS48S0200000_35.l0).aboutShopLink;
            if (str != null && !a0.LJJJIL(str)) {
                Float fLJIIIIZZ = null;
                if (0 == 0) {
                    PdpViewModel pdpViewModelU6 = ((USSESSellerModuleVH) ajS48S0200000_35.l1).u6();
                    Context context = ((USSESSellerModuleVH) ajS48S0200000_35.l1).itemView.getContext();
                    USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    String str2 = uSSESSellerModuleVO.sellerName;
                    String str3 = uSSESSellerModuleVO.rating;
                    if (str3 != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                    }
                    int iTg2 = ((USSESSellerModuleVH) ajS48S0200000_35.l1).u6().Tg2();
                    USSESSellerModuleVO uSSESSellerModuleVO2 = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    PdpViewModel.VR2(pdpViewModelU6, context, str, str2, fLJIIIIZZ, "showcase_detail", null, iTg2, null, null, "showcase_detail", uSSESSellerModuleVO2.shopDetailInfos, "shop_name", ((USSESSellerModuleVH) ajS48S0200000_35.l1).q6(uSSESSellerModuleVO2.brandLabels), ((USSESSellerModuleVO) ajS48S0200000_35.l0).shopPerformance, null, "c2857.d0", null, null, null, 958880);
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            USSESSellerModuleVH uSSESSellerModuleVH = (USSESSellerModuleVH) ajS48S0200000_35.l1;
            List<String> list = USSESSellerModuleVH.LLJLLIL;
            uSSESSellerModuleVH.w6("shop_name", "c2857.d0");
        }
    }

    public static final void LIZ$11(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((USSESSellerModuleVH) ajS48S0200000_35.l1).itemView.getContext(), ((StoreIdentityLabelData) ajS48S0200000_35.l0).explanationSchema).open();
            C1054004Ag c1054004Ag = ((USSESSellerModuleVH) ajS48S0200000_35.l1).u6().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "shop_badge", null, ((USSESSellerModuleVH) ajS48S0200000_35.l1).d6(), 2);
            }
        }
    }

    public static final void LIZ$12(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        if (view != null && (str = ((StoreIdentityAuthorizedData) ajS48S0200000_35.l0).schema) != null) {
            ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).u7(str, "c2857.d98326");
        }
    }

    public static final void LIZ$13(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        Object obj;
        Map<String, Object> map;
        if (view != null && (str = ((ShopPerformanceInfo) ajS48S0200000_35.l0).detailPageUrl) != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            USSESSellerModuleV2VH uSSESSellerModuleV2VH = (USSESSellerModuleV2VH) ajS48S0200000_35.l1;
            USSESSellerModuleVO uSSESSellerModuleVOX5 = uSSESSellerModuleV2VH.X5();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = uSSESSellerModuleV2VH.z6().LLJI;
            if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj = map.get("source_page_type")) == null) {
                obj = "unknown";
            }
            linkedHashMap.put("source_page_type", obj);
            linkedHashMap.put("enter_from", uSSESSellerModuleV2VH.z6().HR2());
            String strJR2 = uSSESSellerModuleV2VH.z6().JR2();
            String str2 = "";
            if (strJR2 == null) {
                strJR2 = "";
            }
            linkedHashMap.put("entrance_info", strJR2);
            linkedHashMap.put("product_id", uSSESSellerModuleV2VH.z6().getProductId());
            linkedHashMap.put("previous_page", "product_detail");
            String strU6 = uSSESSellerModuleV2VH.u6(uSSESSellerModuleVOX5.brandLabels);
            if (strU6 != null) {
                str2 = strU6;
            }
            linkedHashMap.put("entrance_selling_point", str2);
            SmartRouter.buildRoute(((USSESSellerModuleV2VH) ajS48S0200000_35.l1).itemView.getContext(), builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)).build().toString()).open();
            C1054004Ag c1054004Ag = ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).z6().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "shop_badge_metrics", null, ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).e6(), 2);
            }
        }
    }

    public static final void LIZ$14(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        if (view != null && (str = ((TopRatedInfo) ajS48S0200000_35.l0).schema) != null) {
            ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).u7(str, "c2857.d24710");
        }
    }

    public static final void LIZ$15(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        if (view != null && (str = ((TopRatedInfo) ajS48S0200000_35.l0).schema) != null) {
            ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).u7(str, "c2857.d24710");
        }
    }

    public static final void LIZ$16(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            ((InterfaceC2260541Dds) ajS48S0200000_35.l0).LIZLLL((Voucher) ajS48S0200000_35.l1);
        }
    }

    public static final void LIZ$2(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SeaPdpCouponsViewHolder seaPdpCouponsViewHolder = (SeaPdpCouponsViewHolder) ajS48S0200000_35.l0;
            seaPdpCouponsViewHolder.c6(seaPdpCouponsViewHolder.f6((C11XJ) seaPdpCouponsViewHolder.itemView.findViewById(R.id.pm0)), (C11XN) ajS48S0200000_35.l1);
        }
    }

    public static final void LIZ$3(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            ((SeaPdpCouponsViewHolder) ajS48S0200000_35.l0).h6((Voucher) ajS48S0200000_35.l1);
        }
    }

    public static final void LIZ$4(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        Object obj;
        Map<String, Object> map;
        if (view != null && (str = ((ShopPerformanceInfo) ajS48S0200000_35.l0).detailPageUrl) != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            USSESSellerModuleV3VH uSSESSellerModuleV3VH = (USSESSellerModuleV3VH) ajS48S0200000_35.l1;
            USSESSellerModuleVO uSSESSellerModuleVOX5 = uSSESSellerModuleV3VH.X5();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = uSSESSellerModuleV3VH.t7().LLJI;
            if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj = map.get("source_page_type")) == null) {
                obj = "unknown";
            }
            linkedHashMap.put("source_page_type", obj);
            linkedHashMap.put("enter_from", uSSESSellerModuleV3VH.t7().HR2());
            String strJR2 = uSSESSellerModuleV3VH.t7().JR2();
            String str2 = "";
            if (strJR2 == null) {
                strJR2 = "";
            }
            linkedHashMap.put("entrance_info", strJR2);
            linkedHashMap.put("product_id", uSSESSellerModuleV3VH.t7().getProductId());
            linkedHashMap.put("previous_page", "product_detail");
            String strB7 = uSSESSellerModuleV3VH.b7(uSSESSellerModuleVOX5.brandLabels);
            if (strB7 != null) {
                str2 = strB7;
            }
            linkedHashMap.put("entrance_selling_point", str2);
            SmartRouter.buildRoute(((USSESSellerModuleV3VH) ajS48S0200000_35.l1).itemView.getContext(), builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)).build().toString()).open();
            C1054004Ag c1054004Ag = ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).t7().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "shop_badge_metrics", null, ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).z6(), 2);
            }
        }
    }

    public static final void LIZ$5(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((USSESSellerModuleV3VH) ajS48S0200000_35.l1).itemView.getContext(), ((StoreIdentityLabelData) ajS48S0200000_35.l0).explanationSchema).open();
            C1054004Ag c1054004Ag = ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).t7().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "shop_badge", null, ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).z6(), 2);
            }
        }
    }

    public static final void LIZ$6(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            String str = ((USSESSellerModuleVO) ajS48S0200000_35.l0).aboutShopLink;
            if (str != null && !a0.LJJJIL(str)) {
                Float fLJIIIIZZ = null;
                if (0 == 0) {
                    PdpViewModel pdpViewModelT7 = ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).t7();
                    Context context = ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).itemView.getContext();
                    USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    String str2 = uSSESSellerModuleVO.sellerName;
                    String str3 = uSSESSellerModuleVO.rating;
                    if (str3 != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                    }
                    int iTg2 = ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).t7().Tg2();
                    USSESSellerModuleVO uSSESSellerModuleVO2 = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    PdpViewModel.VR2(pdpViewModelT7, context, str, str2, fLJIIIIZZ, "showcase_detail", null, iTg2, null, null, "showcase_detail", uSSESSellerModuleVO2.shopDetailInfos, "shop_name", ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).b7(uSSESSellerModuleVO2.brandLabels), ((USSESSellerModuleVO) ajS48S0200000_35.l0).shopPerformance, null, "c2857.d0", null, null, null, 958880);
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).N7("shop_name", "c2857.d0");
        }
    }

    public static final void LIZ$7(AjS48S0200000_35 ajS48S0200000_35, View view) {
        String str;
        if (view != null && (str = ((StoreIdentityDTCData) ajS48S0200000_35.l0).schema) != null) {
            ((USSESSellerModuleV3VH) ajS48S0200000_35.l1).u7(str, "c2857.d3673");
        }
    }

    public static final void LIZ$8(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            String str = ((USSESSellerModuleVO) ajS48S0200000_35.l0).aboutShopLink;
            if (str != null && !a0.LJJJIL(str)) {
                Float fLJIIIIZZ = null;
                if (0 == 0) {
                    PdpViewModel pdpViewModelZ6 = ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).z6();
                    Context context = ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).itemView.getContext();
                    USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    String str2 = uSSESSellerModuleVO.sellerName;
                    String str3 = uSSESSellerModuleVO.rating;
                    if (str3 != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                    }
                    int iTg2 = ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).z6().Tg2();
                    USSESSellerModuleVO uSSESSellerModuleVO2 = (USSESSellerModuleVO) ajS48S0200000_35.l0;
                    PdpViewModel.VR2(pdpViewModelZ6, context, str, str2, fLJIIIIZZ, "showcase_detail", null, iTg2, null, null, "showcase_detail", uSSESSellerModuleVO2.shopDetailInfos, "shop_name", ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).u6(uSSESSellerModuleVO2.brandLabels), ((USSESSellerModuleVO) ajS48S0200000_35.l0).shopPerformance, null, "c2857.d0", null, null, null, 958880);
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            USSESSellerModuleV2VH uSSESSellerModuleV2VH = (USSESSellerModuleV2VH) ajS48S0200000_35.l1;
            List<String> list = USSESSellerModuleV2VH.LLLFF;
            uSSESSellerModuleV2VH.D6("shop_name", "c2857.d0");
        }
    }

    public static final void LIZ$9(AjS48S0200000_35 ajS48S0200000_35, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((USSESSellerModuleV2VH) ajS48S0200000_35.l1).itemView.getContext(), ((StoreIdentityLabelData) ajS48S0200000_35.l0).explanationSchema).open();
            C1054004Ag c1054004Ag = ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).z6().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "shop_badge", null, ((USSESSellerModuleV2VH) ajS48S0200000_35.l1).e6(), 2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS48S0200000_35(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS48S0200000_35(C2260521Ddq c2260521Ddq, Voucher voucher, C11XV c11xv, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c2260521Ddq;
        this.l1 = voucher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS48S0200000_35(USSESSellerModuleVO uSSESSellerModuleVO, TuxTextView tuxTextView, USSESSellerModuleV2VH uSSESSellerModuleV2VH, int i) {
        super(700L);
        this.$t = i;
        this.l0 = uSSESSellerModuleVO;
        this.l1 = uSSESSellerModuleV2VH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS48S0200000_35(USSESSellerModuleVO uSSESSellerModuleVO, TuxTextView tuxTextView, USSESSellerModuleV3VH uSSESSellerModuleV3VH, int i) {
        super(700L);
        this.$t = i;
        this.l0 = uSSESSellerModuleVO;
        this.l1 = uSSESSellerModuleV3VH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS48S0200000_35(USSESSellerModuleVO uSSESSellerModuleVO, TuxTextView tuxTextView, USSESSellerModuleVH uSSESSellerModuleVH, int i) {
        super(700L);
        this.$t = i;
        this.l0 = uSSESSellerModuleVO;
        this.l1 = uSSESSellerModuleVH;
    }
}
