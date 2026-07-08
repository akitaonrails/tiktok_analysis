package kotlin.jvm.internal;

import X.C041T;
import X.C042Y;
import X.C09AY;
import X.C10296040w;
import X.C893803eS;
import X.InterfaceC10470047o;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.USCombinedSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS23S0202000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS23S0202000_1 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS23S0202000_1.invoke$0(kotlin.jvm.internal.AwS23S0202000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS23S0202000_1 r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS23S0202000_1.invoke$1(kotlin.jvm.internal.AwS23S0202000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS23S0202000_1 awS23S0202000_1, Object obj) {
        String str;
        int i;
        int i2;
        String str2;
        SalePropTag salePropTag;
        String str3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("button_name", "sku_select");
        laneParams.plusAssign("button_type", "select_attr");
        laneParams.plusAssign("sub_page_name", ((SkuSpecSelectionBasePowerCell) awS23S0202000_1.l0).R5().LN());
        C042Y c042y = (C042Y) awS23S0202000_1.l1;
        boolean z = false;
        if (c042y != null && c042y.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams.plusAssign("select_type", str);
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(awS23S0202000_1.i2 + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS23S0202000_1.i3 + 1));
        C042Y c042y2 = (C042Y) awS23S0202000_1.l1;
        if (c042y2 != null && !c042y2.LLIZLLLIL) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        C042Y c042y3 = (C042Y) awS23S0202000_1.l1;
        if (c042y3 != null && c042y3.LLILLL != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        laneParams.plusAssign("is_price_value_shown", Integer.valueOf(i2));
        C042Y c042y4 = (C042Y) awS23S0202000_1.l1;
        if (c042y4 != null && c042y4.LLILZLL != null) {
            z = true;
        }
        laneParams.plusAssign("has_sku_recommend_tag", C893803eS.LIZ(z));
        C042Y c042y5 = (C042Y) awS23S0202000_1.l1;
        if (c042y5 != null && (salePropTag = c042y5.LLILZLL) != null && (str3 = salePropTag.tagName) != null) {
            laneParams.plusAssign("sku_recommend_tag_type", str3);
        }
        SkuPanelState skuPanelState = ((SkuSpecSelectionBasePowerCell) awS23S0202000_1.l0).R5().LLIZ;
        if (skuPanelState != null) {
            Integer num = skuPanelState.isDefaultPreSelect;
            if (num != null) {
                laneParams.put("is_default_pre_select", Integer.valueOf(num.intValue()));
            }
            Integer num2 = skuPanelState.isDefaultPreSelect;
            if (num2 != null && num2.intValue() == 1 && (str2 = skuPanelState.defaultPreSelectType) != null) {
                laneParams.put("default_pre_select_type", str2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS23S0202000_1 awS23S0202000_1, Object obj) {
        String str;
        int i;
        int i2;
        String str2;
        SalePropTag salePropTag;
        String str3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("button_name", "sku_select");
        laneParams.plusAssign("button_type", "select_attr");
        laneParams.plusAssign("sub_page_name", ((SkuPanelBaseReusedAssem) ((InterfaceC10470047o) awS23S0202000_1.l0)).getViewModel().LN());
        C042Y c042y = (C042Y) awS23S0202000_1.l1;
        boolean z = false;
        if (c042y != null && c042y.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams.plusAssign("select_type", str);
        laneParams.plusAssign("pdp_sku_attr_rank", Integer.valueOf(awS23S0202000_1.i2 + 1));
        laneParams.plusAssign("pdp_sku_value_rank", Integer.valueOf(awS23S0202000_1.i3 + 1));
        C042Y c042y2 = (C042Y) awS23S0202000_1.l1;
        if (c042y2 != null && !c042y2.LLIZLLLIL) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        C042Y c042y3 = (C042Y) awS23S0202000_1.l1;
        if (c042y3 != null && c042y3.LLILLL != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        laneParams.plusAssign("is_price_value_shown", Integer.valueOf(i2));
        C042Y c042y4 = (C042Y) awS23S0202000_1.l1;
        if (c042y4 != null && c042y4.LLILZLL != null) {
            z = true;
        }
        laneParams.plusAssign("has_sku_recommend_tag", C893803eS.LIZ(z));
        C042Y c042y5 = (C042Y) awS23S0202000_1.l1;
        if (c042y5 != null && (salePropTag = c042y5.LLILZLL) != null && (str3 = salePropTag.tagName) != null) {
            laneParams.plusAssign("sku_recommend_tag_type", str3);
        }
        SkuPanelState skuPanelState = ((SkuPanelBaseReusedAssem) ((InterfaceC10470047o) awS23S0202000_1.l0)).getViewModel().LLIZ;
        if (skuPanelState != null) {
            Integer num = skuPanelState.isDefaultPreSelect;
            if (num != null) {
                laneParams.put("is_default_pre_select", Integer.valueOf(num.intValue()));
            }
            Integer num2 = skuPanelState.isDefaultPreSelect;
            if (num2 != null && num2.intValue() == 1 && (str2 = skuPanelState.defaultPreSelectType) != null) {
                laneParams.put("default_pre_select_type", str2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0202000_1(C042Y c042y, int i, int i2, UsSkuVH usSkuVH, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c042y;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = usSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0202000_1(InterfaceC10470047o interfaceC10470047o, C042Y c042y, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = interfaceC10470047o;
        this.l1 = c042y;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0202000_1(USCombinedSkuCell uSCombinedSkuCell, int i, C041T c041t, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = uSCombinedSkuCell;
        this.i2 = i;
        this.l1 = c041t;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS23S0202000_1(SkuSpecSelectionBasePowerCell skuSpecSelectionBasePowerCell, SkuSpecSelectionBasePowerCell<T> skuSpecSelectionBasePowerCell2, C042Y c042y, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = skuSpecSelectionBasePowerCell;
        this.l1 = skuSpecSelectionBasePowerCell2;
        this.i2 = c042y;
        this.i3 = i;
    }
}
