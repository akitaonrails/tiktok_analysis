package kotlin.jvm.internal;

import X.C038K;
import X.C03O0;
import X.C043B;
import X.C044L;
import X.C044Z;
import X.C04BX;
import X.C04DL;
import X.C09AY;
import X.C1010603xI;
import X.C10306041g;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1075704Ip;
import X.C123100dR;
import X.C1397630mTR;
import X.C13LP;
import X.C1533950q1J;
import X.C1741890vQh;
import X.C1753740vjo;
import X.C2188811AlT;
import X.C426160GnO;
import X.C719102rN;
import X.C7726030a;
import X.C786410Ut5;
import X.C799403Ai;
import X.C801903Bh;
import X.C802103Bj;
import X.C829203Lu;
import X.C855703Vz;
import X.C957403oi;
import X.C961303pL;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis.UsShippingVH;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS88S0201000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        HashMap<String, Object> map = ((C802103Bj) awS88S0201000_1.l0).LIZ.LLLIL;
        if (map != null) {
            c957403oi.LJ(map);
        }
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("page_name", "order_submit");
        c957403oi.LIZJ("toast_name", "discount_quantity_limitation");
        c957403oi.LIZJ("quantity_limit", Integer.valueOf(awS88S0201000_1.i2));
        String str = ((C719102rN) awS88S0201000_1.l1).LLLLIL;
        if (str != null) {
            c957403oi.LIZJ("product_id", str);
        }
        String str2 = ((C719102rN) awS88S0201000_1.l1).LLILZLL;
        if (str2 != null) {
            c957403oi.LIZJ("sku_id", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        HashMap<String, Object> map = ((C801903Bh) awS88S0201000_1.l0).LIZLLL;
        if (map != null) {
            c957403oi.LJ(map);
        }
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("page_name", "order_submit");
        c957403oi.LIZJ("toast_name", "discount_quantity_limitation");
        c957403oi.LIZJ("quantity_limit", Integer.valueOf(awS88S0201000_1.i2));
        String str = ((C719102rN) awS88S0201000_1.l1).LLLLIL;
        if (str != null) {
            c957403oi.LIZJ("product_id", str);
        }
        String str2 = ((C719102rN) awS88S0201000_1.l1).LLILZLL;
        if (str2 != null) {
            c957403oi.LIZJ("sku_id", str2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        int iIntValue;
        String str;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        Map<String, String> map;
        String str3;
        HashMap map2 = (HashMap) obj;
        map2.put("is_clickable", 0);
        map2.put("combo_rank", Integer.valueOf(awS88S0201000_1.i2 + 1));
        C799403Ai c799403Ai = C799403Ai.LIZ;
        C719102rN c719102rN = (C719102rN) awS88S0201000_1.l0;
        String str4 = c719102rN.LLJJIJIL;
        String str5 = c719102rN.LLILZLL;
        c799403Ai.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str4);
        sbLIZ.append('_');
        sbLIZ.append(str5);
        Integer num = (Integer) C7726030a.LIZ(C2188811AlT.LIZIZ(sbLIZ), C799403Ai.LJ);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map2.put("rank", Integer.valueOf(iIntValue));
        map2.put("product_promotion_tag", C799403Ai.LIZ((C719102rN) awS88S0201000_1.l0));
        map2.put("rights_content", C799403Ai.LIZIZ((C719102rN) awS88S0201000_1.l0));
        if (C123100dR.LIZ(((C719102rN) awS88S0201000_1.l0).LLJILJILJ)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("product_status", str);
        if (C123100dR.LIZ(((C719102rN) awS88S0201000_1.l0).LLJZIJLIL) && (map = ((C719102rN) awS88S0201000_1.l0).LLL) != null && (str3 = map.get("discount_percentage")) != null) {
            map2.put("discount_ratio", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(CastDoubleProtector.parseDouble(str3) / 100.0d)}, 1)));
        }
        Map map3 = (Map) awS88S0201000_1.l1;
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        QuantityControlInfo quantityControlInfo = ((C719102rN) awS88S0201000_1.l0).LLLF;
        if (quantityControlInfo != null && (str2 = quantityControlInfo.noticeDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            map2.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        tuxTextView.setTuxFont(awS88S0201000_1.i2);
        tuxTextView.setTextColor(((LinkRichText) awS88S0201000_1.l0).LIZIZ(((UsShippingVH) awS88S0201000_1.l1).itemView.getContext()));
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        Object obj2;
        Object obj3;
        Object objValueOf;
        Price price;
        HashMap<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "order_submit");
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C038K) awS88S0201000_1.l0).LLJJI;
        Object priceVal = null;
        if (orderSubmitAssemViewModel != null && (map = orderSubmitAssemViewModel.LLLIL) != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("option_type", "insurance_type");
        InsuranceInfo insuranceInfo = ((C038K) awS88S0201000_1.l0).LLJILLL;
        if (insuranceInfo != null) {
            obj3 = insuranceInfo.insuranceProductNameEn;
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("option_name", obj3);
        InsuranceInfo insuranceInfo2 = ((C038K) awS88S0201000_1.l0).LLJILLL;
        if (insuranceInfo2 != null) {
            objValueOf = Integer.valueOf(insuranceInfo2.hasDefaultSelected() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        laneParams.plusAssign("is_default", objValueOf);
        laneParams.plusAssign("if_always_default", Integer.valueOf(awS88S0201000_1.i2));
        InsuranceInfo insuranceInfo3 = ((C038K) awS88S0201000_1.l0).LLJILLL;
        if (insuranceInfo3 != null && (price = insuranceInfo3.insurancePremiumPayment) != null) {
            priceVal = price.getPriceVal();
        }
        laneParams.plusAssign("option_price", priceVal);
        laneParams.plusAssign("product_id", ((C719102rN) awS88S0201000_1.l1).LLLLIL);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        HashMap map = (HashMap) awS88S0201000_1.l0;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("load_success", Integer.valueOf(awS88S0201000_1.i2));
        c957403oi.LIZJ("page_name", "order_submit");
        Object obj2 = awS88S0201000_1.l1;
        if ((obj2 instanceof Long) && !Intrinsics.LJFF(obj2, -1L)) {
            c957403oi.LIZLLL("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) awS88S0201000_1.l1).longValue()));
        }
        c957403oi.LIZJ("image_load_duration", Long.valueOf(SystemClock.elapsedRealtime() - C03O0.LJJIFFI));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        String str = "";
        if (C13LP.LJJJLL((List) awS88S0201000_1.l0) != null) {
            String str2 = ((DialogButton) C13LP.LJJJJZI((List) awS88S0201000_1.l0)).text;
            if (str2 == null) {
                str2 = "";
            }
            c1397630mTR.LIZJ(0, str2, new AwS109S0101000_1(awS88S0201000_1.i2, (C829203Lu) awS88S0201000_1.l1, 8));
        }
        if (C13LP.LJJJLZIJ(1, (List) awS88S0201000_1.l0) != null) {
            String str3 = ((DialogButton) ListProtector.get((List) awS88S0201000_1.l0, 1)).text;
            if (str3 != null) {
                str = str3;
            }
            c1397630mTR.LIZJ(1, str, new AwS109S0101000_1(awS88S0201000_1.i2, (C829203Lu) awS88S0201000_1.l1, 9));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        C1054004Ag c1054004Ag = (C1054004Ag) awS88S0201000_1.l0;
        C855703Vz.LIZ(c957403oi, c1054004Ag.LIZIZ, c1054004Ag.LJIIZILJ, (SkuPrice) awS88S0201000_1.l1, awS88S0201000_1.i2, "product_detail");
        c957403oi.LIZJ("action_refer", "product_detail");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        Integer numValueOf;
        List<InstallmentPlan> list;
        HashMap map = (HashMap) obj;
        map.put("parent_option_name", "tiktok_paylater");
        map.put("option_name", "tiktok_paylater_installment");
        map.put("option_type", "sub_payment_type");
        map.put("rank", Integer.valueOf(awS88S0201000_1.i2));
        BnplInfo bnplInfo = ((C10306041g) ((PdpPaymentModuleViewHolder) awS88S0201000_1.l0).LLILLJJLI).LIZ;
        String priceStr = null;
        if (bnplInfo != null && (list = bnplInfo.installmentPlans) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        map.put("installment_cnt", numValueOf);
        Amount amount = ((InstallmentPlan) awS88S0201000_1.l1).totalRepayment;
        if (amount != null) {
            priceStr = amount.getPriceStr();
        }
        map.put("service_fee", priceStr);
        map.put("total_payment", ((InstallmentPlan) awS88S0201000_1.l1).extraDescription);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        ReviewMedia reviewMedia = (ReviewMedia) obj;
        View viewLIZIZ = (View) ((C1753740vjo) ((PdpReviewViewHolder) awS88S0201000_1.l0).c6().WR2().LIZJ.getValue()).LIZJ(((C426160GnO) awS88S0201000_1.l1).getContext(), reviewMedia);
        if (viewLIZIZ == null) {
            int i = PdpReviewViewHolder.LLJLIL;
            viewLIZIZ = C1075704Ip.LIZIZ(((C426160GnO) awS88S0201000_1.l1).getContext(), reviewMedia);
        }
        int i2 = awS88S0201000_1.i2;
        ViewGroup.LayoutParams layoutParams = viewLIZIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.width = i2;
            layoutParams.height = i2;
            C786410Ut5.W5(viewLIZIZ, layoutParams);
        }
        return viewLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        String str;
        String strLIZIZ;
        C04BX c04bxLIZ;
        String str2;
        C04BX c04bxLIZ2;
        ProductBase productBase;
        LaneParams laneParams = (LaneParams) obj;
        ProductPackStruct productPackStruct = ((SeaPdpSkcVH) awS88S0201000_1.l0).c6().LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        laneParams.plusAssign("button_name", "sku_select");
        int i = 1;
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(((C961303pL) ((SeaPdpSkcVH) awS88S0201000_1.l0).LLILLJJLI).LIZ + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS88S0201000_1.i2 + 1));
        String[] strArr = ((SeaPdpSkcVH) awS88S0201000_1.l0).c6().LLLLIIL;
        if (strArr != null) {
            C04DL c04dl = (C04DL) awS88S0201000_1.l1;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str3 = strArr[i2];
                if (c04dl != null && (c04bxLIZ2 = c04dl.LIZ()) != null) {
                    str2 = c04bxLIZ2.LIZ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str3)) {
                    if (str3 == null || a0.LJJJIL(str3)) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        laneParams.plusAssign("sku_default_type", Integer.valueOf(i));
        C04DL c04dl2 = (C04DL) awS88S0201000_1.l1;
        if (c04dl2 != null && (c04bxLIZ = c04dl2.LIZ()) != null && c04bxLIZ.LJ != null) {
            if (C1533950q1J.LJ(((C04DL) awS88S0201000_1.l1).LIZ().LJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"");
                sbLIZ.append(((C04DL) awS88S0201000_1.l1).LIZ().LJFF);
                sbLIZ.append("\":1}");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "{\"hot\":1}";
            }
        } else {
            strLIZIZ = "{}";
        }
        laneParams.plusAssign("sku_tag_cnt", strLIZIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        String str;
        String strLIZIZ;
        C04BX c04bxLIZ;
        String str2;
        C04BX c04bxLIZ2;
        ProductBase productBase;
        LaneParams laneParams = (LaneParams) obj;
        ProductPackStruct productPackStruct = ((SeaPdpSkcVH) awS88S0201000_1.l0).c6().LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        laneParams.plusAssign("button_name", "sku_select");
        int i = 1;
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(((C961303pL) ((SeaPdpSkcVH) awS88S0201000_1.l0).LLILLJJLI).LIZ + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS88S0201000_1.i2 + 1));
        String[] strArr = ((SeaPdpSkcVH) awS88S0201000_1.l0).c6().LLLLIIL;
        if (strArr != null) {
            C04DL c04dl = (C04DL) awS88S0201000_1.l1;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str3 = strArr[i2];
                if (c04dl != null && (c04bxLIZ2 = c04dl.LIZ()) != null) {
                    str2 = c04bxLIZ2.LIZ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str3)) {
                    if (str3 == null || a0.LJJJIL(str3)) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        laneParams.plusAssign("sku_default_type", Integer.valueOf(i));
        C04DL c04dl2 = (C04DL) awS88S0201000_1.l1;
        if (c04dl2 != null && (c04bxLIZ = c04dl2.LIZ()) != null && c04bxLIZ.LJ != null) {
            if (C1533950q1J.LJ(((C04DL) awS88S0201000_1.l1).LIZ().LJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"");
                sbLIZ.append(((C04DL) awS88S0201000_1.l1).LIZ().LJFF);
                sbLIZ.append("\":1}");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "{\"hot\":1}";
            }
        } else {
            strLIZIZ = "{}";
        }
        laneParams.plusAssign("sku_tag_cnt", strLIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        int iMin = Math.min(Math.max(skuState.getCurrentQuantityLimit().LIZ, awS88S0201000_1.i2), skuState.getCurrentQuantityLimit().LIZIZ);
        ((C044Z) awS88S0201000_1.l0).LJJJZ(new AwS109S0101000_1(iMin, (C044L) awS88S0201000_1.l1, 1));
        SkuPanelState skuPanelStateDw = ((C044Z) awS88S0201000_1.l0).dw();
        if (skuPanelStateDw != null) {
            skuPanelStateDw.productQuantity = Integer.valueOf(iMin);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        String priceStr;
        HashMap map = (HashMap) obj;
        map.put("parent_option_name", "tiktok_paylater");
        map.put("option_name", "tiktok_paylater_installment");
        map.put("option_type", "sub_payment_type");
        map.put("rank", Integer.valueOf(awS88S0201000_1.i2));
        map.put("installment_cnt", Integer.valueOf(((BnplInfo) awS88S0201000_1.l0).installmentPlans.size()));
        Amount amount = ((InstallmentPlan) awS88S0201000_1.l1).totalRepayment;
        if (amount != null) {
            priceStr = amount.getPriceStr();
        } else {
            priceStr = null;
        }
        map.put("service_fee", priceStr);
        map.put("total_payment", ((InstallmentPlan) awS88S0201000_1.l1).extraDescription);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        int iMin = Math.min(Math.max(skuState.getCurrentQuantityLimit().LIZ, awS88S0201000_1.i2), skuState.getCurrentQuantityLimit().LIZIZ);
        ((C043B) awS88S0201000_1.l0).LJJJZ(new AwS109S0101000_1(iMin, (C044L) awS88S0201000_1.l1, 4));
        SkuPanelState skuPanelStateDw = ((C043B) awS88S0201000_1.l0).dw();
        if (skuPanelStateDw != null) {
            skuPanelStateDw.productQuantity = Integer.valueOf(iMin);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        EcomAddressInterceptor ecomAddressInterceptor = (EcomAddressInterceptor) awS88S0201000_1.l0;
        Object obj2 = awS88S0201000_1.l1;
        int i = awS88S0201000_1.i2;
        ecomAddressInterceptor.getClass();
        EcomAddressInterceptor.LIZ(1, i, obj2, (List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS88S0201000_1 awS88S0201000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        C1054104Ah c1054104Ah = (C1054104Ah) awS88S0201000_1.l0;
        C855703Vz.LIZ(c957403oi, c1054104Ah.LIZIZ, c1054104Ah.LJIIL, (SkuPrice) awS88S0201000_1.l1, awS88S0201000_1.i2, "product_detail");
        c957403oi.LIZJ("action_refer", "product_detail");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S0201000_1(int i, int i2, C719102rN c719102rN, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S0201000_1(int i, int i2, C043B<ViewModel> c043b, C044L c044l) {
        super(1);
        this.$t = c044l;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c043b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S0201000_1(int i, int i2, C044Z<ViewModel> c044z, C044L c044l) {
        super(1);
        this.$t = c044l;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c044z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(int i, LinkRichText linkRichText, UsShippingVH usShippingVH, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = linkRichText;
        this.l1 = usShippingVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(int i, BnplInfo bnplInfo, InstallmentPlan installmentPlan, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = bnplInfo;
        this.l1 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(int i, PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder, InstallmentPlan installmentPlan, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = pdpPaymentModuleViewHolder;
        this.l1 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(C038K c038k, int i, C719102rN c719102rN, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c038k;
        this.i2 = i;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(C801903Bh c801903Bh, int i, C719102rN c719102rN, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c801903Bh;
        this.i2 = i;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(C802103Bj c802103Bj, int i, C719102rN c719102rN, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c802103Bj;
        this.i2 = i;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(C1054004Ag c1054004Ag, SkuPrice skuPrice, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1054004Ag;
        this.l1 = skuPrice;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(C1054104Ah c1054104Ah, SkuPrice skuPrice, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1054104Ah;
        this.l1 = skuPrice;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(PdpReviewViewHolder pdpReviewViewHolder, C426160GnO c426160GnO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = pdpReviewViewHolder;
        this.l1 = c426160GnO;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(SeaPdpSkcVH seaPdpSkcVH, int i, C04DL c04dl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = seaPdpSkcVH;
        this.i2 = i;
        this.l1 = c04dl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0201000_1(EcomAddressInterceptor ecomAddressInterceptor, Object obj, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = ecomAddressInterceptor;
        this.l1 = obj;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S0201000_1(HashMap map, HashMap<String, Object> map2, int i, Object obj) {
        super(1);
        this.$t = obj;
        this.l0 = map;
        this.i2 = map2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S0201000_1(List list, List<DialogButton> list2, int i, C829203Lu c829203Lu) {
        super(1);
        this.$t = c829203Lu;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
