package kotlin.jvm.internal;

import X.C039P;
import X.C039Q;
import X.C03FA;
import X.C03JV;
import X.C03ZD;
import X.C09AY;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C703302op;
import X.C714302qb;
import X.C719102rN;
import X.C720002rW;
import X.C722302rt;
import X.C802303Bl;
import X.C802403Bm;
import X.C862603Yq;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS26S0310000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        String str;
        int i;
        HashMap map = (HashMap) obj;
        map.putAll((Map) awS26S0310000_1.l0);
        map.put("module_name", "order_summary");
        if (!awS26S0310000_1.z3) {
            str = "see_more";
        } else {
            str = "see_less";
        }
        map.put("button_name", str);
        map.put("is_clickable", "1");
        String str2 = ((C039Q) awS26S0310000_1.l1).LLILZIL;
        if (str2 != null) {
            map.put("summary_info", str2);
        }
        if (((C714302qb) awS26S0310000_1.l2).LJJIFFI != null) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_plus_effective", Integer.valueOf(i));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        String str;
        int i;
        HashMap map = (HashMap) obj;
        map.putAll((Map) awS26S0310000_1.l0);
        map.put("module_name", "order_summary");
        if (!awS26S0310000_1.z3) {
            str = "see_more";
        } else {
            str = "see_less";
        }
        map.put("button_name", str);
        String str2 = ((C039P) awS26S0310000_1.l1).LLILZIL;
        if (str2 != null) {
            map.put("summary_info", str2);
        }
        if (((C714302qb) awS26S0310000_1.l2).LJJIFFI != null) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_plus_effective", Integer.valueOf(i));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0afc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS26S0310000_1 r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 3281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS26S0310000_1.invoke$2(kotlin.jvm.internal.AwS26S0310000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, (C722302rt) awS26S0310000_1.l0, false, null, false, null, null, null, null, null, null, null, (Integer) awS26S0310000_1.l1, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, (C720002rW) awS26S0310000_1.l2, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, awS26S0310000_1.z3, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -8197, -9, -65, 1048575);
    }

    public static final Object invoke$4(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        Image image;
        C03JV c03jv = (C03JV) obj;
        List list = (List) awS26S0310000_1.l0;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List list2 = (List) awS26S0310000_1.l1;
        if (list2 != null) {
            image = (Image) C13LP.LJJJLZIJ(0, list2);
        } else {
            image = null;
        }
        return C03JV.LIZ(c03jv, 0, list, (C722302rt) awS26S0310000_1.l2, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, awS26S0310000_1.z3, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, image, null, null, null, null, null, null, false, null, Boolean.TRUE, false, null, null, false, null, null, null, null, null, null, null, -7, -1, -1073741889, 1048319);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final Object invoke$5(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        String priceVal;
        String priceStr;
        String str;
        String str2;
        ?? arrayList;
        ?? arrayList2;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        Integer num;
        String str3;
        PromotionLabelVO promotionLabelVO;
        List<PromotionLabel> list;
        String str4;
        Price price;
        Price price2;
        Price price3;
        HashMap map = (HashMap) obj;
        map.put("show_original_price_value", ((C719102rN) awS26S0310000_1.l0).LLLJIL);
        SkuPrice skuPrice = ((C719102rN) awS26S0310000_1.l0).LLLLLJIL;
        String strSubstring = null;
        if (skuPrice != null && (price3 = skuPrice.realPrice) != null) {
            priceVal = price3.getPriceVal();
        } else {
            priceVal = null;
        }
        map.put("show_final_price_value", priceVal);
        SkuPrice skuPrice2 = ((C719102rN) awS26S0310000_1.l0).LLLLLJIL;
        if (skuPrice2 != null && (price2 = skuPrice2.realPrice) != null) {
            priceStr = price2.getPriceStr();
        } else {
            priceStr = null;
        }
        map.put("sale_price", priceStr);
        C719102rN c719102rN = (C719102rN) awS26S0310000_1.l0;
        String priceStr2 = c719102rN.LLLJ;
        if (priceStr2 == null) {
            SkuPrice skuPrice3 = c719102rN.LLLLLJIL;
            if (skuPrice3 != null && (price = skuPrice3.realPrice) != null) {
                priceStr2 = price.getPriceStr();
            } else {
                priceStr2 = null;
            }
        }
        map.put("original_price", priceStr2);
        SkuPrice skuPrice4 = ((C719102rN) awS26S0310000_1.l0).LLLLLJIL;
        if (skuPrice4 != null) {
            str = skuPrice4.skuListPrice;
        } else {
            str = null;
        }
        map.put("original_price_value", str);
        SkuPrice skuPrice5 = ((C719102rN) awS26S0310000_1.l0).LLLLLJIL;
        int i = 1;
        if (skuPrice5 != null && (str4 = skuPrice5.discount) != null && C703302op.LIZ(str4)) {
            strSubstring = str4.substring(0, str4.length() - 1);
        }
        map.put("discount_percentage", strSubstring);
        SkuPrice skuPrice6 = ((C719102rN) awS26S0310000_1.l0).LLLLLJIL;
        if (skuPrice6 != null && (promotionLabelVO = skuPrice6.priceLabels) != null && (list = promotionLabelVO.promotionLabels) != null) {
            Iterator<PromotionLabel> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PromotionLabel next = it2.next();
                if (next.type == 101) {
                    if (next != null) {
                        str2 = "after_coupon_price_icon";
                    }
                }
            }
            str2 = "null";
        } else {
            str2 = "null";
        }
        map.put("after_coupon_price_icon_type", str2);
        MainOrderSetting mainOrderSetting = ((C802303Bl) awS26S0310000_1.l1).LLILZIL;
        if (mainOrderSetting == null || (num = mainOrderSetting.skuCardStyle) == null || num.intValue() != 1 || awS26S0310000_1.z3 || !C703302op.LIZ(((C719102rN) awS26S0310000_1.l0).LLLJ) || (str3 = ((C719102rN) awS26S0310000_1.l0).LLJZIJLIL) == null || !C703302op.LIZ(str3)) {
            i = 0;
        }
        map.put("if_show_discounted_percentage", Integer.valueOf(i));
        Map<String, String> map2 = ((C719102rN) awS26S0310000_1.l0).LLL;
        if (map2 != null) {
            map.putAll(map2);
        }
        List<PromotionLogo> list2 = ((C719102rN) awS26S0310000_1.l0).LLJJ;
        if (list2 != null && (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(666), 30)) != null) {
            map.put("product_promotion_tag", strLJJLIIIJ2);
        }
        List<PromotionSellingPoint> list3 = ((C719102rN) awS26S0310000_1.l0).LLLLLLL;
        if (list3 != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(667), 30)) != null) {
            map.put("label_type", strLJJLIIIJ);
        }
        Integer num2 = ((C719102rN) awS26S0310000_1.l0).LLLII;
        if (num2 != null) {
            map.put("stock_num", Integer.valueOf(num2.intValue()));
        }
        Integer num3 = ((C719102rN) awS26S0310000_1.l0).LLLLLLLLLL;
        if (num3 != null) {
            map.put("sales_rating_tag", Integer.valueOf(num3.intValue()));
        }
        Integer num4 = ((C719102rN) awS26S0310000_1.l0).LLLLLLLZIL;
        if (num4 != null) {
            map.put("product_sales", Integer.valueOf(num4.intValue()));
        }
        Float f = ((C719102rN) awS26S0310000_1.l0).LLJJL;
        if (f != null) {
            map.put("product_rating", Float.valueOf(f.floatValue()));
        }
        UserRight userRight = ((C719102rN) awS26S0310000_1.l0).LLJJIII;
        if (userRight != null) {
            List<UserRightDetail> list4 = userRight.userRightDetails;
            if (list4 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<UserRightDetail> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().nameEn);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            List<UserRightDetail> list5 = userRight.priceRightDetails;
            if (list5 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                Iterator<UserRightDetail> it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(it4.next().nameEn);
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            map.put("rights_tag", C13LP.LJJLIIIJ(C13LP.LJLIL(arrayList2, arrayList), ",", null, null, 0, null, null, 62));
        }
        Map map3 = (Map) awS26S0310000_1.l2;
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$6(kotlin.jvm.internal.AwS26S0310000_1 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS26S0310000_1.invoke$6(kotlin.jvm.internal.AwS26S0310000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[PHI: r5
      0x0039: PHI (r5v3 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:62:0x00db, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS26S0310000_1 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS26S0310000_1.invoke$7(kotlin.jvm.internal.AwS26S0310000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C03FA.LIZIZ);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("sub_page_name", "choose_your_location");
        laneParams.plusAssign("module_name", "address");
        USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) awS26S0310000_1.l0;
        boolean z = awS26S0310000_1.z3;
        boolean zLJII = ((Address) awS26S0310000_1.l1).LJII();
        int bindingAdapterPosition = ((USLogisticSelectAddressItemVH) awS26S0310000_1.l0).getBindingAdapterPosition() - ((AddressSelectViewModel) ((USLogisticSelectAddressItemVH) awS26S0310000_1.l0).LLJILJILJ.getValue()).LLJIJIL;
        boolean zBooleanValue = false;
        if (bindingAdapterPosition < 0) {
            bindingAdapterPosition = 0;
        }
        ReachableAddress reachableAddress = (ReachableAddress) ((USLogisticSelectAddressItemVH) awS26S0310000_1.l0).LLILLJJLI;
        boolean z2 = reachableAddress.isSelect;
        Boolean bool = reachableAddress.reachable;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        uSLogisticSelectAddressItemVH.getClass();
        USLogisticSelectAddressItemVH.W5(laneParams, z, zLJII, bindingAdapterPosition, z2, zBooleanValue);
        LaneParams laneParams2 = new LaneParams();
        Function1 function1 = (Function1) awS26S0310000_1.l2;
        if (function1 != null) {
            function1.invoke(laneParams2);
        }
        laneParams.putAll(laneParams2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS26S0310000_1 awS26S0310000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C03FA.LIZIZ);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("sub_page_name", "choose_your_location");
        laneParams.plusAssign("module_name", "address");
        USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) awS26S0310000_1.l0;
        boolean z = awS26S0310000_1.z3;
        boolean zLJII = ((Address) awS26S0310000_1.l1).LJII();
        int bindingAdapterPosition = ((USLogisticSelectAddressItemVH) awS26S0310000_1.l0).getBindingAdapterPosition() - ((AddressSelectViewModel) ((USLogisticSelectAddressItemVH) awS26S0310000_1.l0).LLJILJILJ.getValue()).LLJIJIL;
        boolean zBooleanValue = false;
        if (bindingAdapterPosition < 0) {
            bindingAdapterPosition = 0;
        }
        ReachableAddress reachableAddress = (ReachableAddress) awS26S0310000_1.l2;
        boolean z2 = reachableAddress.isSelect;
        Boolean bool = reachableAddress.reachable;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        uSLogisticSelectAddressItemVH.getClass();
        USLogisticSelectAddressItemVH.W5(laneParams, z, zLJII, bindingAdapterPosition, z2, zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0310000_1(C719102rN c719102rN, C719102rN c719102rN2, C802303Bl c802303Bl, boolean z, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c719102rN;
        this.l1 = c719102rN2;
        this.z3 = c802303Bl;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0310000_1(C719102rN c719102rN, boolean z, C802403Bm c802403Bm, C802303Bl c802303Bl, int i) {
        super(1);
        this.$t = i;
        this.l0 = c719102rN;
        this.z3 = z;
        this.l1 = c802403Bm;
        this.l2 = c802303Bl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0310000_1(C720002rW c720002rW, C722302rt c722302rt, Integer num, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c722302rt;
        this.l1 = num;
        this.l2 = c720002rW;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0310000_1(C722302rt c722302rt, List list, List list2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c722302rt;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0310000_1(C862603Yq c862603Yq, boolean z, InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, C03ZD c03zd, int i) {
        super(1);
        this.$t = i;
        this.l0 = c862603Yq;
        this.z3 = z;
        this.l1 = installmentPlanListElementViewHolder;
        this.l2 = c03zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0310000_1(Address address, ReachableAddress reachableAddress, USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSLogisticSelectAddressItemVH;
        this.z3 = z;
        this.l1 = address;
        this.l2 = reachableAddress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0310000_1(PaymentViewModel paymentViewModel, PaymentViewModel paymentViewModel2, Context context, InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> interfaceC1631620sYq, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = paymentViewModel;
        this.l1 = paymentViewModel2;
        this.l2 = context;
        this.z3 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0310000_1(USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH, USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH2, boolean z, Address address, Function1<? super LaneParams, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = uSLogisticSelectAddressItemVH;
        this.z3 = uSLogisticSelectAddressItemVH2;
        this.l1 = z;
        this.l2 = address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0310000_1(Map map, Map<String, Object> map2, boolean z, C039P c039p, C714302qb c714302qb) {
        super(1);
        this.$t = c714302qb;
        this.l0 = map;
        this.z3 = map2;
        this.l1 = z;
        this.l2 = c039p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0310000_1(Map map, Map<String, Object> map2, boolean z, C039Q c039q, C714302qb c714302qb) {
        super(1);
        this.$t = c714302qb;
        this.l0 = map;
        this.z3 = map2;
        this.l1 = z;
        this.l2 = c039q;
    }
}
