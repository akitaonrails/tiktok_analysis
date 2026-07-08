package kotlin.jvm.internal;

import X.C042Y;
import X.C09AY;
import X.C1010603xI;
import X.C1054104Ah;
import X.C2188811AlT;
import X.C961303pL;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPurchaseMethodReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS16S1201000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        C1054104Ah c1054104Ah = ((SeaPdpCouponsViewHolder) awS16S1201000_1.l1).e6().LLJLIL;
        if (c1054104Ah != null) {
            Voucher voucher = (Voucher) awS16S1201000_1.l2;
            String str = awS16S1201000_1.s0;
            int i = awS16S1201000_1.i3 + 1;
            ((SeaPdpCouponsViewHolder) awS16S1201000_1.l1).e6();
            C1054104Ah.LJIIZILJ(c1054104Ah, voucher, str, i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        Boolean bool = (Boolean) awS16S1201000_1.l1;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            laneParams.plusAssign("page_show_type", str);
        }
        laneParams.plusAssign("bubble_position", awS16S1201000_1.s0);
        laneParams.plusAssign("selling_tag_order", Integer.valueOf(awS16S1201000_1.i3 + 1));
        C1010603xI.LIZJ(laneParams, ((SeaPdpSellingPointsItem) awS16S1201000_1.l2).daInfo);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", awS16S1201000_1.s0);
        C042Y c042y = (C042Y) awS16S1201000_1.l1;
        if (c042y != null) {
            str = c042y.LLILLJJLI;
        } else {
            str = null;
        }
        laneParams.plusAssign("button_name", str);
        if (awS16S1201000_1.i3 == 1) {
            laneParams.plusAssign("button_type", "subscribe_frequency");
        }
        SkuItem skuItem = ((SkuPurchaseMethodReusedAssem) awS16S1201000_1.l2).getViewModel().LLJJL;
        if (skuItem != null) {
            laneParams.plusAssign("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPurchaseMethodReusedAssem) awS16S1201000_1.l2).getViewModel().LLJI;
        if (skuEnterParams != null && (str2 = skuEnterParams.productId) != null) {
            laneParams.plusAssign("product_id", str2);
        }
        laneParams.plusAssign("sub_page_name", ((SkuPurchaseMethodReusedAssem) awS16S1201000_1.l2).getViewModel().LN());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "promotions");
        laneParams.plusAssign("promotion_tag_order", String.valueOf(awS16S1201000_1.i3));
        SkuPanelState skuPanelState = ((SeaPdpInfoViewHolder) awS16S1201000_1.l1).d6().LLJILJIL;
        if (skuPanelState != null) {
            str = skuPanelState.skuId;
        } else {
            str = null;
        }
        laneParams.plusAssign("sku_id", str);
        String str2 = awS16S1201000_1.s0;
        if (str2 != null) {
            C1010603xI.LIZJ(laneParams, str2);
        }
        Map<String, ? extends Object> map = ((PromotionLabel) awS16S1201000_1.l2).daInfo;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS16S1201000_1.l1).LIZIZ);
        C1054104Ah.LIZ(laneParams, awS16S1201000_1.i3, (ReviewFilterStruct) awS16S1201000_1.l2, awS16S1201000_1.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS16S1201000_1 r7, java.lang.Object r8) {
        /*
            X.03oi r8 = (X.C957403oi) r8
            java.lang.Object r0 = r7.l1
            X.04Ah r0 = (X.C1054104Ah) r0
            int r4 = r7.i3
            java.lang.Object r5 = r7.l2
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r5 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r5
            java.lang.String r3 = r7.s0
            r0.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r0.LIZIZ
            r2.putAll(r0)
            java.lang.String r6 = ""
            if (r5 == 0) goto L23
            java.lang.String r1 = r5.filterId
            if (r1 != 0) goto L24
        L23:
            r1 = r6
        L24:
            java.lang.String r0 = "filter_id"
            r2.put(r0, r1)
            if (r5 == 0) goto L2f
            java.lang.String r1 = r5.nameEng
            if (r1 != 0) goto L30
        L2f:
            r1 = r6
        L30:
            java.lang.String r0 = "filter_name"
            r2.put(r0, r1)
            if (r5 == 0) goto L4b
            java.lang.Integer r7 = r5.type
            if (r7 == 0) goto L4b
            int r1 = r7.intValue()
            r0 = 3
            if (r1 == r0) goto L98
            int r1 = r7.intValue()
            r0 = 2
            if (r1 != r0) goto L80
            java.lang.String r6 = "rate"
        L4b:
            java.lang.String r0 = "filter_type"
            r2.put(r0, r6)
            if (r5 == 0) goto L7e
            java.lang.Integer r0 = r5.count
            if (r0 == 0) goto L7e
            int r0 = r0.intValue()
        L5a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "review_cnt"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "rank"
            r2.put(r0, r1)
            java.lang.String r0 = "module_name"
            r2.put(r0, r3)
            r8.getClass()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.putAll(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            r0 = 0
            goto L5a
        L80:
            int r1 = r7.intValue()
            r0 = 1
            if (r1 != r0) goto L8a
            java.lang.String r6 = "keyword"
            goto L4b
        L8a:
            int r1 = r7.intValue()
            r0 = 5
            if (r1 == r0) goto L98
            int r1 = r7.intValue()
            r0 = 6
            if (r1 != r0) goto L4b
        L98:
            java.lang.String r6 = "impression_tag"
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S1201000_1.invoke$5(kotlin.jvm.internal.AwS16S1201000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS16S1201000_1.l1).LIZIZ);
        C1054104Ah.LIZ(laneParams, awS16S1201000_1.i3, (ReviewFilterStruct) awS16S1201000_1.l2, awS16S1201000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS16S1201000_1 awS16S1201000_1, Object obj) {
        String str;
        int size;
        String strLIZIZ;
        ProductBase productBase;
        LaneParams laneParams = (LaneParams) obj;
        ProductPackStruct productPackStruct = ((SeaPdpSkcVH) awS16S1201000_1.l1).c6().LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("sub_module_name", "skc");
        List<SalePropValue> list = ((C961303pL) awS16S1201000_1.l2).LIZIZ.salePropValueList;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("sku_value_cnt", Integer.valueOf(size));
        int i = 1;
        if (!(!a0.LJJJIL(((C961303pL) awS16S1201000_1.l2).LIZJ))) {
            i = -1;
        }
        laneParams.plusAssign("sku_default_type", Integer.valueOf(i));
        if (awS16S1201000_1.i3 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"");
            sbLIZ.append(awS16S1201000_1.s0);
            sbLIZ.append("\":");
            sbLIZ.append(awS16S1201000_1.i3);
            sbLIZ.append('}');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "{}";
        }
        laneParams.plusAssign("sku_tag_cnt", strLIZIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(C1054104Ah c1054104Ah, int i, ReviewFilterStruct reviewFilterStruct, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1054104Ah;
        this.i3 = i;
        this.l2 = reviewFilterStruct;
        this.s0 = "review_entrance";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(int i, SeaPdpInfoViewHolder seaPdpInfoViewHolder, String str, PromotionLabel promotionLabel, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l1 = seaPdpInfoViewHolder;
        this.s0 = str;
        this.l2 = promotionLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(C1054104Ah c1054104Ah, int i, ReviewFilterStruct reviewFilterStruct, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1054104Ah;
        this.i3 = i;
        this.l2 = reviewFilterStruct;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(SeaPdpCouponsViewHolder seaPdpCouponsViewHolder, Voucher voucher, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = seaPdpCouponsViewHolder;
        this.l2 = voucher;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(SeaPdpSkcVH seaPdpSkcVH, C961303pL c961303pL, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = seaPdpSkcVH;
        this.l2 = c961303pL;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(Boolean bool, String str, int i, SeaPdpSellingPointsItem seaPdpSellingPointsItem, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = bool;
        this.s0 = str;
        this.i3 = i;
        this.l2 = seaPdpSellingPointsItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1201000_1(String str, C042Y c042y, int i, SkuPurchaseMethodReusedAssem skuPurchaseMethodReusedAssem, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c042y;
        this.i3 = i;
        this.l2 = skuPurchaseMethodReusedAssem;
    }
}
