package kotlin.jvm.internal;

import X.C041T;
import X.C042Y;
import X.C049Y;
import X.C09AY;
import X.C10296040w;
import X.C1748720vbi;
import X.C893803eS;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuBodyReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS4S1202000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S1202000_1 awS4S1202000_1, Object obj) {
        int i;
        String str;
        SalePropTag salePropTag;
        String str2;
        String str3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("button_name", "sku_select");
        laneParams.plusAssign("button_type", "select_attr");
        laneParams.plusAssign("sub_page_name", ((SkuBodyReusedAssem) awS4S1202000_1.l1).getViewModel().LN());
        laneParams.plusAssign("select_type", awS4S1202000_1.s0);
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(awS4S1202000_1.i3 + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS4S1202000_1.i4 + 1));
        C042Y c042y = (C042Y) awS4S1202000_1.l2;
        boolean z = false;
        Object obj2 = 0;
        if (c042y != null && !c042y.LLIZLLLIL) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        C042Y c042y2 = (C042Y) awS4S1202000_1.l2;
        String str4 = null;
        if (c042y2 != null) {
            str4 = c042y2.LLILLL;
        }
        if (str4 != null) {
            laneParams.plusAssign("is_price_value_shown", 1);
            C042Y c042y3 = (C042Y) awS4S1202000_1.l2;
            Object obj3 = c042y3.LLJILJILJ;
            if (obj3 == null) {
                obj3 = c042y3.LLILLL;
            }
            laneParams.plusAssign("price_value", obj3);
        } else {
            laneParams.plusAssign("is_price_value_shown", obj2);
        }
        C042Y c042y4 = (C042Y) awS4S1202000_1.l2;
        if (c042y4 != null && (str3 = c042y4.LLJILLL) != null) {
            obj2 = str3;
        }
        laneParams.plusAssign("discount_percentage", obj2);
        C042Y c042y5 = (C042Y) awS4S1202000_1.l2;
        if (c042y5 != null && c042y5.LLILZLL != null) {
            z = true;
        }
        laneParams.plusAssign("has_sku_recommend_tag", C893803eS.LIZ(z));
        C042Y c042y6 = (C042Y) awS4S1202000_1.l2;
        if (c042y6 != null && (salePropTag = c042y6.LLILZLL) != null && (str2 = salePropTag.tagName) != null) {
            laneParams.plusAssign("sku_recommend_tag_type", str2);
        }
        SkuPanelState skuPanelState = ((SkuBodyReusedAssem) awS4S1202000_1.l1).getViewModel().LLIZ;
        if (skuPanelState != null) {
            Integer num = skuPanelState.isDefaultPreSelect;
            if (num != null) {
                laneParams.put("is_default_pre_select", Integer.valueOf(num.intValue()));
            }
            Integer num2 = skuPanelState.isDefaultPreSelect;
            if (num2 != null && num2.intValue() == 1 && (str = skuPanelState.defaultPreSelectType) != null) {
                laneParams.put("default_pre_select_type", str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1202000_1 awS4S1202000_1, Object obj) {
        int i;
        String str;
        SalePropTag salePropTag;
        String str2;
        String str3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("button_name", "sku_select");
        laneParams.plusAssign("button_type", "select_attr");
        laneParams.plusAssign("sub_page_name", ((SkuSpecSelectionBasePowerCell) awS4S1202000_1.l1).R5().LN());
        laneParams.plusAssign("select_type", awS4S1202000_1.s0);
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(awS4S1202000_1.i3 + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS4S1202000_1.i4 + 1));
        C042Y c042y = (C042Y) awS4S1202000_1.l2;
        boolean z = false;
        Object obj2 = 0;
        if (c042y != null && !c042y.LLIZLLLIL) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        C042Y c042y2 = (C042Y) awS4S1202000_1.l2;
        String str4 = null;
        if (c042y2 != null) {
            str4 = c042y2.LLILLL;
        }
        if (str4 != null) {
            laneParams.plusAssign("is_price_value_shown", 1);
            C042Y c042y3 = (C042Y) awS4S1202000_1.l2;
            Object obj3 = c042y3.LLJILJILJ;
            if (obj3 == null) {
                obj3 = c042y3.LLILLL;
            }
            laneParams.plusAssign("price_value", obj3);
        } else {
            laneParams.plusAssign("is_price_value_shown", obj2);
        }
        C042Y c042y4 = (C042Y) awS4S1202000_1.l2;
        if (c042y4 != null && (str3 = c042y4.LLJILLL) != null) {
            obj2 = str3;
        }
        laneParams.plusAssign("discount_percentage", obj2);
        C042Y c042y5 = (C042Y) awS4S1202000_1.l2;
        if (c042y5 != null && c042y5.LLILZLL != null) {
            z = true;
        }
        laneParams.plusAssign("has_sku_recommend_tag", C893803eS.LIZ(z));
        C042Y c042y6 = (C042Y) awS4S1202000_1.l2;
        if (c042y6 != null && (salePropTag = c042y6.LLILZLL) != null && (str2 = salePropTag.tagName) != null) {
            laneParams.plusAssign("sku_recommend_tag_type", str2);
        }
        SkuPanelState skuPanelState = ((SkuSpecSelectionBasePowerCell) awS4S1202000_1.l1).R5().LLIZ;
        if (skuPanelState != null) {
            Integer num = skuPanelState.isDefaultPreSelect;
            if (num != null) {
                laneParams.put("is_default_pre_select", Integer.valueOf(num.intValue()));
            }
            Integer num2 = skuPanelState.isDefaultPreSelect;
            if (num2 != null && num2.intValue() == 1 && (str = skuPanelState.defaultPreSelectType) != null) {
                laneParams.put("default_pre_select_type", str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS4S1202000_1 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S1202000_1.invoke$2(kotlin.jvm.internal.AwS4S1202000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS4S1202000_1 awS4S1202000_1, Object obj) {
        C1748720vbi.LIZIZ(((UsSkuVH) awS4S1202000_1.l1).LLJJIJIL, new C049Y(), new AwS4S1302000_1((C042Y) awS4S1202000_1.l2, awS4S1202000_1.s0, awS4S1202000_1.i3, awS4S1202000_1.i4, (SkuItem) obj, (UsSkuVH) awS4S1202000_1.l1, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1202000_1(SkuSelection skuSelection, int i, String str, C041T c041t, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = skuSelection;
        this.i3 = i;
        this.s0 = str;
        this.l2 = c041t;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1202000_1(UsSkuVH usSkuVH, C042Y c042y, String str, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = usSkuVH;
        this.l2 = c042y;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1202000_1(SkuBodyReusedAssem skuBodyReusedAssem, String str, int i, int i2, C042Y c042y, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = skuBodyReusedAssem;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = c042y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1202000_1(SkuSpecSelectionBasePowerCell skuSpecSelectionBasePowerCell, SkuSpecSelectionBasePowerCell<T> skuSpecSelectionBasePowerCell2, String str, int i, int i2, C042Y c042y) {
        super(1);
        this.$t = c042y;
        this.l1 = skuSpecSelectionBasePowerCell;
        this.s0 = skuSpecSelectionBasePowerCell2;
        this.i3 = str;
        this.i4 = i;
        this.l2 = i2;
    }
}
