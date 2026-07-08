package kotlin.jvm.internal;

import X.C00H3;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C13LQ;
import X.C957403oi;
import X.EnumC1012703xd;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S2400000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S2400000_1 awS1S2400000_1, Object obj) {
        int i;
        Object obj2;
        Object obj3;
        ProductPackStruct productPackStruct;
        ProductBase productBase;
        String str;
        SkuPanelState skuPanelStatePv0;
        String[] strArr;
        Object objLJJIIZ;
        ProductPackStruct productPackStruct2;
        List<SaleProp> list;
        C957403oi c957403oi = (C957403oi) obj;
        Map<String, ? extends Object> map = (Map) awS1S2400000_1.l2;
        if (map != null) {
            c957403oi.LJ(map);
        }
        Map<String, ? extends Object> map2 = (Map) awS1S2400000_1.l3;
        if (map2 != null) {
            c957403oi.LJ(map2);
        }
        c957403oi.LIZLLL("entrance_form", awS1S2400000_1.s0);
        c957403oi.LIZLLL("button_name", awS1S2400000_1.s1);
        PdpViewModel pdpViewModel = (PdpViewModel) awS1S2400000_1.l4;
        if (pdpViewModel != null && (productPackStruct2 = pdpViewModel.LLJILLL) != null && (list = productPackStruct2.saleProps) != null) {
            Iterator<SaleProp> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                Integer num = it2.next().salePropType;
                int value = EnumC1012703xd.COLOR.getValue();
                if (num != null && num.intValue() == value) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        PdpViewModel pdpViewModel2 = (PdpViewModel) awS1S2400000_1.l4;
        if (pdpViewModel2 != null && (skuPanelStatePv0 = pdpViewModel2.Pv0()) != null && (strArr = skuPanelStatePv0.checkedSkuIds) != null && (objLJJIIZ = C13LQ.LJJIIZ(i, strArr)) != null) {
            c957403oi.LIZLLL("color_id", objLJJIIZ);
        }
        PdpViewModel pdpViewModel3 = (PdpViewModel) awS1S2400000_1.l4;
        if (pdpViewModel3 != null && (productPackStruct = pdpViewModel3.LLJILLL) != null && (productBase = productPackStruct.baseInfo) != null && (str = productBase.categoryName) != null) {
            c957403oi.LIZLLL("product_category_lv1", str);
        }
        Map map3 = (Map) awS1S2400000_1.l2;
        if (map3 != null && (obj3 = map3.get("page_name")) != null) {
            c957403oi.LIZLLL("source_page_type", obj3);
        }
        Map map4 = (Map) awS1S2400000_1.l2;
        if (map4 != null && (obj2 = map4.get("source_page_type")) != null) {
            c957403oi.LIZLLL("parent_source_page_type", obj2);
        }
        c957403oi.LIZLLL("is_ai_scene", 1);
        Map map5 = (Map) awS1S2400000_1.l5;
        if (map5 != null) {
            c957403oi.LJ(C00H3.LIZ(map5));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f A[PHI: r4
      0x016f: PHI (r4v2 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) = 
      (r4v1 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
      (r4v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
      (r4v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
     binds: [B:80:0x016b, B:23:0x0052, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS1S2400000_1 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S2400000_1.invoke$1(kotlin.jvm.internal.AwS1S2400000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS1S2400000_1 awS1S2400000_1, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS1S2400000_1.l2).LIZIZ);
        laneParams.plusAssign("button_for", awS1S2400000_1.s0);
        Boolean bool = (Boolean) awS1S2400000_1.l3;
        String str = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.put("is_clickable", obj2);
        }
        Boolean bool2 = (Boolean) awS1S2400000_1.l4;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.put("is_buy_with_coupon", str);
        }
        String str2 = awS1S2400000_1.s1;
        if (str2 != null) {
            laneParams.put("red_dot_type", str2);
        }
        Integer num = (Integer) awS1S2400000_1.l5;
        if (num != null) {
            laneParams.put("red_dot_number", Integer.valueOf(num.intValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS1S2400000_1 awS1S2400000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS1S2400000_1.l2).LIZIZ);
        laneParams.plusAssign("button_name", awS1S2400000_1.s0);
        laneParams.plusAssign("sku_id", awS1S2400000_1.s1);
        laneParams.withParamsGroup(((C1054104Ah) awS1S2400000_1.l2).LJIIJ(awS1S2400000_1.s1));
        HashMap map = (HashMap) awS1S2400000_1.l3;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        Map<String, ? extends Object> map2 = (Map) awS1S2400000_1.l4;
        if (map2 != null) {
            laneParams.withParamsGroup(map2);
        }
        Map map3 = (Map) awS1S2400000_1.l5;
        if (map3 != null) {
            laneParams.putAll(map3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS1S2400000_1 awS1S2400000_1, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS1S2400000_1.l2).LIZIZ);
        laneParams.plusAssign("button_for", awS1S2400000_1.s0);
        Boolean bool = (Boolean) awS1S2400000_1.l3;
        String str = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.put("is_clickable", obj2);
        }
        Boolean bool2 = (Boolean) awS1S2400000_1.l4;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.put("is_buy_with_coupon", str);
        }
        String str2 = awS1S2400000_1.s1;
        if (str2 != null) {
            laneParams.put("red_dot_type", str2);
        }
        Integer num = (Integer) awS1S2400000_1.l5;
        if (num != null) {
            laneParams.put("red_dot_number", Integer.valueOf(num.intValue()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2400000_1(PdpViewModel pdpViewModel, String str, Map map, Map map2, Map map3, int i) {
        super(1);
        this.$t = i;
        this.l2 = map;
        this.l3 = map2;
        this.s0 = str;
        this.s1 = "ai_try_on";
        this.l4 = pdpViewModel;
        this.l5 = map3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2400000_1(C1054004Ag c1054004Ag, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054004Ag;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = bool2;
        this.s1 = str2;
        this.l5 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2400000_1(C1054104Ah c1054104Ah, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = bool2;
        this.s1 = str2;
        this.l5 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S2400000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, String str, String str2, HashMap<String, Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        super(1);
        this.$t = map3;
        this.l2 = c1054104Ah;
        this.s0 = c1054104Ah2;
        this.s1 = str;
        this.l3 = str2;
        this.l4 = map;
        this.l5 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2400000_1(MiniOspViewModel miniOspViewModel, String str, Context context, String str2, Boolean bool, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l2 = miniOspViewModel;
        this.s0 = str;
        this.l3 = context;
        this.s1 = str2;
        this.l4 = bool;
        this.l5 = num;
    }
}
