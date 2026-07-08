package kotlin.jvm.internal;

import X.C03O1;
import X.C09AY;
import X.C1010603xI;
import X.C957403oi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S1211000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
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

    public static final Object invoke$0(AwS1S1211000_1 awS1S1211000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "promotions");
        laneParams.plusAssign("promotion_tag_order", String.valueOf(awS1S1211000_1.i4));
        if (awS1S1211000_1.z3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("promotion_tag_icon", str);
        SkuPanelState skuPanelState = ((SeaPdpInfoViewHolder) awS1S1211000_1.l1).d6().LLJILJIL;
        if (skuPanelState != null) {
            str2 = skuPanelState.skuId;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("sku_id", str2);
        String str3 = awS1S1211000_1.s0;
        if (str3 != null) {
            C1010603xI.LIZJ(laneParams, str3);
        }
        Map<String, ? extends Object> map = ((PromotionLabel) awS1S1211000_1.l2).daInfo;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1211000_1 awS1S1211000_1, Object obj) {
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZJ("page_name", ((C03O1) awS1S1211000_1.l1).LIZ.get("page_name"));
        c957403oi.LIZJ("is_check_passed", Integer.valueOf(awS1S1211000_1.i4));
        c957403oi.LIZIZ("api_path", awS1S1211000_1.s0);
        if (awS1S1211000_1.z3) {
            str = "yes";
        } else {
            str = "no";
        }
        c957403oi.LIZJ("is_retry", str);
        HashMap map = (HashMap) awS1S1211000_1.l2;
        if (map != null) {
            c957403oi.LIZIZ("anchor_show_type", map.get("anchor_show_type"));
            c957403oi.LIZIZ("author_id", ((HashMap) awS1S1211000_1.l2).get("author_id"));
            c957403oi.LIZIZ("enter_from_info", ((HashMap) awS1S1211000_1.l2).get("enter_from_info"));
            c957403oi.LIZIZ("entrance_form", ((HashMap) awS1S1211000_1.l2).get("entrance_form"));
            c957403oi.LIZIZ("entrance_info", ((HashMap) awS1S1211000_1.l2).get("entrance_info"));
            c957403oi.LIZIZ("follow_status", ((HashMap) awS1S1211000_1.l2).get("follow_status"));
            c957403oi.LIZIZ("product_id", ((HashMap) awS1S1211000_1.l2).get("product_id"));
            c957403oi.LIZIZ("product_source", ((HashMap) awS1S1211000_1.l2).get("product_source"));
            c957403oi.LIZIZ("source", ((HashMap) awS1S1211000_1.l2).get("source"));
            c957403oi.LIZIZ("source_from", ((HashMap) awS1S1211000_1.l2).get("source_from"));
            c957403oi.LIZIZ("source_page_type", ((HashMap) awS1S1211000_1.l2).get("source_page_type"));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1211000_1(int i, boolean z, SeaPdpInfoViewHolder seaPdpInfoViewHolder, String str, PromotionLabel promotionLabel, int i2) {
        super(1);
        this.$t = i2;
        this.i4 = i;
        this.z3 = z;
        this.l1 = seaPdpInfoViewHolder;
        this.s0 = str;
        this.l2 = promotionLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1211000_1(C03O1 c03o1, C03O1 c03o12, int i, String str, boolean z, HashMap<String, Object> map) {
        super(1);
        this.$t = map;
        this.l1 = c03o1;
        this.i4 = c03o12;
        this.s0 = i;
        this.z3 = str;
        this.l2 = z;
    }
}
