package kotlin.jvm.internal;

import X.C044M;
import X.C09AY;
import X.C10296040w;
import X.C118300cf;
import X.C259800zU;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S0311000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0311000_1 awS1S0311000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("button_name", "add_num");
        laneParams.put("button_type", ((C259800zU) awS1S0311000_1.l0).element);
        SkuItem skuItem = ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LLJJL;
        if (skuItem != null) {
            laneParams.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LLJI;
        if (skuEnterParams != null && (str2 = skuEnterParams.productId) != null) {
            laneParams.put("product_id", str2);
        }
        laneParams.put("num_before", Integer.valueOf(awS1S0311000_1.i4));
        laneParams.put("num_after", Integer.valueOf(((C118300cf) awS1S0311000_1.l2).element));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        laneParams.plusAssign("sub_page_name", ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LN());
        if (awS1S0311000_1.z3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.put("has_promo_price_limit", str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0311000_1 awS1S0311000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("button_name", "minus_num");
        laneParams.put("button_type", ((C259800zU) awS1S0311000_1.l0).element);
        SkuItem skuItem = ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LLJJL;
        if (skuItem != null) {
            laneParams.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LLJI;
        if (skuEnterParams != null && (str2 = skuEnterParams.productId) != null) {
            laneParams.put("product_id", str2);
        }
        laneParams.put("num_before", Integer.valueOf(awS1S0311000_1.i4));
        laneParams.put("num_after", Integer.valueOf(((C118300cf) awS1S0311000_1.l2).element));
        C10296040w.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C10296040w.LIZIZ.get("is_low_stock"));
        laneParams.plusAssign("sub_page_name", ((SkuPanelBaseReusedAssem) ((C044M) awS1S0311000_1.l1)).getViewModel().LN());
        if (awS1S0311000_1.z3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.put("has_promo_price_limit", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0311000_1(C259800zU c259800zU, C259800zU<String> c259800zU2, C044M c044m, int i, C118300cf c118300cf, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i4 = c044m;
        this.l2 = i;
        this.z3 = c118300cf;
    }
}
