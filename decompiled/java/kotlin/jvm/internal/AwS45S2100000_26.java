package kotlin.jvm.internal;

import X.C09AY;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C123100dR;
import X.C1397630mTR;
import X.C1709570uaZ;
import X.C1712630ufV;
import X.C1714230ui5;
import X.C1714660uim;
import X.C197039127h;
import X.C786410Ut5;
import X.C957403oi;
import X.EnumC1407150min;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPromotionBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuWaistBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS45S2100000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("popup_name", awS45S2100000_26.s0);
        laneParams.plusAssign("page_name", "shipping_address");
        String str = awS45S2100000_26.s1;
        if (str != null) {
            laneParams.plusAssign("popup_for", str);
        }
        for (Map.Entry entry : ((Map) awS45S2100000_26.l2).entrySet()) {
            laneParams.plusAssign((String) entry.getKey(), entry.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((UsHeaderVH) awS45S2100000_26.l2).L6().LLILZIL.LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS45S2100000_26.l2;
        String str = awS45S2100000_26.s0;
        String str2 = awS45S2100000_26.s1;
        cashierRouterInterceptor.getClass();
        CashierRouterInterceptor.LIZJ(str, str2, "FAIL", null, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s1));
        Map<String, ? extends Object> map = (Map) awS45S2100000_26.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS45S2100000_26.s0);
        c197039127h.setEnabled(C123100dR.LIZ(awS45S2100000_26.s1));
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_headset_fill));
        c197039127h.setButtonVariant(0);
        c197039127h.setButtonSize(3);
        final C1712630ufV c1712630ufV = (C1712630ufV) awS45S2100000_26.l2;
        final String str = awS45S2100000_26.s1;
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0ufg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = c1712630ufV.getContext();
                String str2 = str;
                if (str2 == null) {
                    return;
                }
                SmartRouter.buildRoute(context, str2).open();
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        C1714660uim c1714660uimVR;
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ((BaseVerifyUIContentAssem) awS45S2100000_26.l2);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            String str = awS45S2100000_26.s0;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = awS45S2100000_26.s1;
            if (str3 != null) {
                str2 = str3;
            }
            c1714660uimVR.LJFF("got_it", str, str2);
        }
        ((BaseVerifyUIContentAssem) awS45S2100000_26.l2).Go("REJECT", null);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        ((C1397630mTR) obj).LJ(2131840288, new AwS45S2100000_26((BaseVerifyUIContentAssem) awS45S2100000_26.l2, awS45S2100000_26.s0, awS45S2100000_26.s1, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS45S2100000_26.l2).LIZIZ);
        laneParams.plusAssign("page_name", awS45S2100000_26.s0);
        laneParams.plusAssign("toast_name", "product_not_available");
        String str = awS45S2100000_26.s1;
        if (str != null) {
            laneParams.plusAssign("entrance_info", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", awS45S2100000_26.s0);
        laneParams.withParamsGroup(((C1054004Ag) awS45S2100000_26.l2).LIZIZ);
        C1010603xI.LIZJ(laneParams, awS45S2100000_26.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS45S2100000_26.l2).LIZIZ);
        laneParams.plusAssign("page_name", awS45S2100000_26.s0);
        laneParams.plusAssign("toast_name", "product_not_available");
        String str = awS45S2100000_26.s1;
        if (str != null) {
            laneParams.plusAssign("entrance_info", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map map = (Map) awS45S2100000_26.l2;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("entry", awS45S2100000_26.s0);
        c957403oi.LIZJ("entry_name", awS45S2100000_26.s1);
        c957403oi.LIZJ("button_for", "orders");
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map map = (Map) awS45S2100000_26.l2;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("entry", awS45S2100000_26.s0);
        c957403oi.LIZJ("entry_name", awS45S2100000_26.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((UsHeaderVH) awS45S2100000_26.l2).L6().LLILZIL.LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((PdpCarouselPromotionBannerAssem) awS45S2100000_26.l2).up().LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((PdpCarouselPromotionBannerAssem) awS45S2100000_26.l2).up().LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("toast_name", "review_translation_failed");
        laneParams.plusAssign("review_id", awS45S2100000_26.s0);
        laneParams.plusAssign("start_state", (EnumC1407150min) awS45S2100000_26.l2);
        String str = awS45S2100000_26.s1;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("error_msg", str);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((SkuWaistBannerAssem) awS45S2100000_26.l2).getViewModel().LLL.LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS45S2100000_26.s0));
        laneParams.withParamsGroup(((SkuWaistBannerAssem) awS45S2100000_26.l2).getViewModel().LLL.LJ(awS45S2100000_26.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        C1709570uaZ c1709570uaZ = (C1709570uaZ) obj;
        if (c1709570uaZ != null && c1709570uaZ.LJJIJIIJI() != null) {
            CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS45S2100000_26.l2;
            String str = awS45S2100000_26.s0;
            String str2 = awS45S2100000_26.s1;
            cashierRouterInterceptor.getClass();
            CashierRouterInterceptor.LIZJ(str, str2, "SUCCESS", c1709570uaZ, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS45S2100000_26 awS45S2100000_26, Object obj) {
        CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS45S2100000_26.l2;
        String str = awS45S2100000_26.s0;
        String str2 = awS45S2100000_26.s1;
        cashierRouterInterceptor.getClass();
        CashierRouterInterceptor.LIZJ(str, str2, "CANCEL", null, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(C1054004Ag c1054004Ag, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054004Ag;
        this.s0 = "product_detail";
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(C1054104Ah c1054104Ah, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.s0 = "product_detail";
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(Map map, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = map;
        this.s0 = "advanced_interactions";
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(C1054004Ag c1054004Ag, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1054004Ag;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(CashierRouterInterceptor cashierRouterInterceptor, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = cashierRouterInterceptor;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(BaseVerifyUIContentAssem baseVerifyUIContentAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = baseVerifyUIContentAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(String str, EnumC1407150min enumC1407150min, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = enumC1407150min;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(String str, UsHeaderVH usHeaderVH, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = usHeaderVH;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(String str, PdpCarouselPromotionBannerAssem pdpCarouselPromotionBannerAssem, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = pdpCarouselPromotionBannerAssem;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(String str, SkuWaistBannerAssem skuWaistBannerAssem, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = skuWaistBannerAssem;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S2100000_26(String str, String str2, C1712630ufV c1712630ufV, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1712630ufV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S2100000_26(String str, String str2, String str3, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
