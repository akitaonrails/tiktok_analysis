package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C13LP;
import X.C1741890vQh;
import X.C722902rz;
import X.C957403oi;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics.USHalfLogisticsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS6S2300000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S2300000_1 awS6S2300000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj2 = ((Map) awS6S2300000_1.l2).get("biz_type");
        Object obj3 = "";
        if (obj2 == null) {
            obj2 = "";
        }
        c957403oi.LIZJ("biz_type", obj2);
        Object obj4 = ((Map) awS6S2300000_1.l2).get("page_name");
        if (obj4 == null) {
            obj4 = "";
        }
        c957403oi.LIZJ("page_name", obj4);
        Object obj5 = ((Map) awS6S2300000_1.l2).get("previous_page");
        if (obj5 == null) {
            obj5 = "";
        }
        c957403oi.LIZJ("previous_page", obj5);
        Object obj6 = ((Map) awS6S2300000_1.l2).get("author_id");
        if (obj6 == null) {
            obj6 = "";
        }
        c957403oi.LIZJ("author_id", obj6);
        Object obj7 = ((Map) awS6S2300000_1.l2).get("entrance_form");
        if (obj7 == null) {
            obj7 = "";
        }
        c957403oi.LIZJ("entrance_form", obj7);
        Object obj8 = ((Map) awS6S2300000_1.l2).get("track_id");
        if (obj8 != null) {
            c957403oi.LIZJ("track_id", obj8);
        }
        Object obj9 = ((Map) awS6S2300000_1.l2).get("source_page_type");
        if (obj9 == null) {
            obj9 = "";
        }
        c957403oi.LIZJ("source_page_type", obj9);
        Object obj10 = ((Map) awS6S2300000_1.l2).get("source_content_id");
        if (obj10 == null) {
            obj10 = "";
        }
        c957403oi.LIZJ("source_content_id", obj10);
        Object obj11 = ((Map) awS6S2300000_1.l2).get("enter_from_info");
        if (obj11 == null) {
            obj11 = "";
        }
        c957403oi.LIZJ("enter_from_info", obj11);
        c957403oi.LIZJ("purchase_path", awS6S2300000_1.s0);
        Object obj12 = ((Map) awS6S2300000_1.l2).get("product_id");
        if (obj12 == null) {
            obj12 = "";
        }
        c957403oi.LIZJ("product_id", obj12);
        Object obj13 = ((Map) awS6S2300000_1.l2).get("product_source");
        if (obj13 == null) {
            obj13 = "";
        }
        c957403oi.LIZJ("product_source", obj13);
        Object obj14 = ((Map) awS6S2300000_1.l2).get("entrance_info");
        if (obj14 == null) {
            obj14 = "";
        }
        c957403oi.LIZJ("entrance_info", obj14);
        c957403oi.LIZJ("page_show_type", "full_screen");
        c957403oi.LIZJ("is_single_sku", 1);
        String str = awS6S2300000_1.s1;
        if (str != null) {
            c957403oi.LIZJ("sku_id", str);
        }
        Integer num = (Integer) awS6S2300000_1.l3;
        if (num != null) {
            c957403oi.LIZJ("quantity", Integer.valueOf(num.intValue()));
        }
        Object obj15 = ((Map) awS6S2300000_1.l2).get("request_id");
        if (obj15 != null) {
            c957403oi.LIZJ("request_id", obj15);
        }
        Object obj16 = ((Map) awS6S2300000_1.l2).get("product_type");
        if (obj16 != null) {
            c957403oi.LIZJ("product_type", obj16);
        }
        Object obj17 = ((Map) awS6S2300000_1.l2).get("campaign_id");
        if (obj17 != null) {
            c957403oi.LIZJ("campaign_id", obj17);
        }
        Object obj18 = ((Map) awS6S2300000_1.l2).get("coupon_type_id");
        if (obj18 != null) {
            c957403oi.LIZJ("coupon_type_id", obj18);
        }
        Object obj19 = ((Map) awS6S2300000_1.l2).get("origin_price");
        if (obj19 == null) {
            obj19 = "";
        }
        c957403oi.LIZJ("origin_price", obj19);
        Object obj20 = ((Map) awS6S2300000_1.l2).get("sales_price");
        if (obj20 != null) {
            obj3 = obj20;
        }
        c957403oi.LIZJ("sales_price", obj3);
        Map<String, ? extends Object> map = (Map) awS6S2300000_1.l4;
        if (map != null) {
            c957403oi.LJ(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S2300000_1 awS6S2300000_1, Object obj) {
        PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
        Context context = (Context) awS6S2300000_1.l2;
        PaymentMethod paymentMethod = (PaymentMethod) awS6S2300000_1.l3;
        PaymentBindHelper.LJI(paymentBindHelper, context, paymentMethod.LJIILLIIL, awS6S2300000_1.s0, (String) obj, (CommuteType) awS6S2300000_1.l4, "ordersubmit", paymentMethod.id, awS6S2300000_1.s1, null, null, null, false, null, null, paymentMethod.displayName, 16128);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S2300000_1 awS6S2300000_1, Object obj) {
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list;
        LogisticExpressionArea logisticExpressionArea;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "logistics");
        laneParams.plusAssign("delivery_info", ((USHalfLogisticsCell) awS6S2300000_1.l2).LLJ);
        laneParams.plusAssign("is_clickable", awS6S2300000_1.s0);
        laneParams.plusAssign("click_area", awS6S2300000_1.s1);
        laneParams.plusAssign("btm", ((USHalfLogisticsCell) awS6S2300000_1.l2).N5().LLLZLZ.LIZ("c20856.d0"));
        C722902rz c722902rz = (C722902rz) awS6S2300000_1.l3;
        if (c722902rz != null && (logisticPanelModule = c722902rz.LLJI) != null && (logisticArea = logisticPanelModule.logisticArea) != null && (list = logisticArea.logisticExpressionAreas) != null && (logisticExpressionArea = (LogisticExpressionArea) C13LP.LJJJLL(list)) != null && (logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo) != null && (str = logisticsExpressionAreaExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        Map map = (Map) awS6S2300000_1.l4;
        if (map != null) {
            laneParams.putAll(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S2300000_1 awS6S2300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS6S2300000_1.l2).LIZIZ);
        laneParams.plusAssign("button_name", awS6S2300000_1.s0);
        laneParams.plusAssign("sku_id", awS6S2300000_1.s1);
        laneParams.withParamsGroup(((C1054004Ag) awS6S2300000_1.l2).LJIIJJI(awS6S2300000_1.s1));
        Map<String, ? extends Object> map = (Map) awS6S2300000_1.l3;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        HashMap map2 = (HashMap) awS6S2300000_1.l4;
        if (map2 != null) {
            laneParams.withParamsGroup(map2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2300000_1(USHalfLogisticsCell uSHalfLogisticsCell, C722902rz c722902rz, Map map, int i) {
        super(1);
        this.$t = i;
        this.l2 = uSHalfLogisticsCell;
        this.s0 = "1";
        this.s1 = "change_shipping_method";
        this.l3 = c722902rz;
        this.l4 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2300000_1(Integer num, String str, Map map, Map map2, int i) {
        super(1);
        this.$t = i;
        this.l2 = map;
        this.s0 = "normal";
        this.s1 = str;
        this.l3 = num;
        this.l4 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S2300000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, String str, String str2, Map<String, ? extends Object> map, HashMap<String, Object> map2) {
        super(1);
        this.$t = map2;
        this.l2 = c1054004Ag;
        this.s0 = c1054004Ag2;
        this.s1 = str;
        this.l3 = str2;
        this.l4 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2300000_1(Context context, PaymentMethod paymentMethod, String str, CommuteType commuteType, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = context;
        this.l3 = paymentMethod;
        this.s0 = str;
        this.l4 = commuteType;
        this.s1 = str2;
    }
}
