package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1752920viU;
import X.C2188811AlT;
import X.C817803Hk;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS10S0302000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS10S0302000_26 awS10S0302000_26, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("click_area", "picture");
        laneParams.plusAssign("is_free_shipping", Integer.valueOf(awS10S0302000_26.i3));
        laneParams.plusAssign("source_previous_page", "product_detail");
        laneParams.plusAssign("request_id", ((C1752920viU) awS10S0302000_26.l0).LLILZ);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS10S0302000_26.i4 + 1));
        FeedExtra feedExtra = ((Feed) awS10S0302000_26.l1).extra;
        String str2 = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        Map map = (Map) awS10S0302000_26.l2;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS10S0302000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752920viU) awS10S0302000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS10S0302000_26.i4 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        ShopProductData shopProductData = ((Feed) awS10S0302000_26.l1).shopProduct;
        if (shopProductData != null) {
            str2 = shopProductData.id;
        }
        laneParams.plusAssign("product_id", str2);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        laneParams.withParamsGroup(((C1752920viU) awS10S0302000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS10S0302000_26.i4))));
        ShopProductData shopProductData2 = ((Feed) awS10S0302000_26.l1).shopProduct;
        if (shopProductData2 != null && (bCMStandardTrack = shopProductData2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0302000_26 awS10S0302000_26, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        String str2;
        Object obj4;
        Map<String, String> trackParam;
        Map<String, Object> map;
        Map<String, Object> map2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752920viU) awS10S0302000_26.l0).LLILZ);
        laneParams.plusAssign("button_name", "add_to_cart");
        laneParams.plusAssign("button_type", "add_to_cart");
        laneParams.plusAssign("item_order", Integer.valueOf(awS10S0302000_26.i3 + 1));
        FeedExtra feedExtra = ((Feed) awS10S0302000_26.l1).extra;
        Object objLJJJLL = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        Map map3 = (Map) awS10S0302000_26.l2;
        if (map3 != null) {
            obj2 = map3.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752920viU) awS10S0302000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS10S0302000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJI;
        if (pdpEnterParam == null || (map2 = pdpEnterParam.trackParams) == null || (obj3 = map2.get("enter_from")) == null) {
            obj3 = "homepage_mall";
        }
        laneParams.plusAssign("enter_from", obj3);
        laneParams.plusAssign("product_id", ((Feed) awS10S0302000_26.l1).shopProduct.id);
        ProductPackStruct productPackStruct = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJILLL;
        if (productPackStruct != null) {
            str2 = productPackStruct.productId;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("parent_product_id", str2);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJI;
        if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
            obj4 = map.get("track_id");
        } else {
            obj4 = null;
        }
        laneParams.plusAssign("parent_track_id", obj4);
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        String str3 = "skip_pdp";
        laneParams.plusAssign("purchase_path", "skip_pdp");
        if (awS10S0302000_26.i4 > 1) {
            str3 = "pass_sku";
        }
        laneParams.plusAssign("pdp_path", str3);
        List<String> list = ((Feed) awS10S0302000_26.l1).shopProduct.skuIds;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        }
        laneParams.plusAssign("sku_id", objLJJJLL);
        laneParams.withParamsGroup(((C1752920viU) awS10S0302000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS10S0302000_26.i3))));
        BCMStandardTrack bCMStandardTrack = ((Feed) awS10S0302000_26.l1).shopProduct.standardEvent;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S0302000_26 awS10S0302000_26, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        Map<String, Object> map;
        Map<String, Object> map2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752920viU) awS10S0302000_26.l0).LLILZ);
        laneParams.plusAssign("button_name", "add_to_cart");
        laneParams.plusAssign("button_type", "add_to_cart");
        laneParams.plusAssign("item_order", Integer.valueOf(awS10S0302000_26.i3 + 1));
        FeedExtra feedExtra = ((Feed) awS10S0302000_26.l1).extra;
        Object obj4 = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        Map map3 = (Map) awS10S0302000_26.l2;
        if (map3 != null) {
            obj2 = map3.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752920viU) awS10S0302000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS10S0302000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJI;
        if (pdpEnterParam == null || (map2 = pdpEnterParam.trackParams) == null || (obj3 = map2.get("enter_from")) == null) {
            obj3 = "homepage_mall";
        }
        laneParams.plusAssign("enter_from", obj3);
        ShopProductData shopProductData = ((Feed) awS10S0302000_26.l1).shopProduct;
        if (shopProductData != null) {
            str2 = shopProductData.id;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("product_id", str2);
        ProductPackStruct productPackStruct = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJILLL;
        if (productPackStruct != null) {
            str3 = productPackStruct.productId;
        } else {
            str3 = null;
        }
        laneParams.plusAssign("parent_product_id", str3);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = ((C1752920viU) awS10S0302000_26.l0).LLILLL.LLJI;
        if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
            obj4 = map.get("track_id");
        }
        laneParams.plusAssign("parent_track_id", obj4);
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        String str4 = "skip_pdp";
        laneParams.plusAssign("purchase_path", "skip_pdp");
        if (awS10S0302000_26.i4 > 1) {
            str4 = "pass_sku";
        }
        laneParams.plusAssign("pdp_path", str4);
        laneParams.withParamsGroup(((C1752920viU) awS10S0302000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS10S0302000_26.i3))));
        ShopProductData shopProductData2 = ((Feed) awS10S0302000_26.l1).shopProduct;
        if (shopProductData2 != null && (bCMStandardTrack = shopProductData2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS10S0302000_26 awS10S0302000_26, Object obj) {
        Object obj2;
        Object obj3;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("source_previous_page", "product_detail");
        laneParams.plusAssign("request_id", ((C1752920viU) awS10S0302000_26.l0).LLILZ);
        laneParams.plusAssign("is_free_shipping", Integer.valueOf(awS10S0302000_26.i3));
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS10S0302000_26.i4 + 1));
        Map map = (Map) awS10S0302000_26.l1;
        String str = null;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS10S0302000_26.l1;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        FeedExtra feedExtra = ((Feed) awS10S0302000_26.l2).extra;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        }
        laneParams.plusAssign("rec_params", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752920viU) awS10S0302000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS10S0302000_26.i4 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        laneParams.plusAssign("product_id", ((Feed) awS10S0302000_26.l2).shopProduct.id);
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        laneParams.withParamsGroup(((C1752920viU) awS10S0302000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS10S0302000_26.i4))));
        BCMStandardTrack bCMStandardTrack = ((Feed) awS10S0302000_26.l2).shopProduct.standardEvent;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS10S0302000_26(int r3, int r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r5, X.C1752920viU r6, java.util.Map r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 0: goto L15;
                case 1: goto L22;
                case 2: goto L22;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r6
            r1.i3 = r3
            r1.i4 = r4
            r1.l1 = r7
            r1.l2 = r5
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.i3 = r3
            r1.l0 = r6
            r1.i4 = r4
            r1.l1 = r5
            r1.l2 = r7
            r0 = 1
            goto L11
        L22:
            r1 = r2
            r1.l0 = r6
            r1.i3 = r3
            r1.l1 = r5
            r1.l2 = r7
            r1.i4 = r4
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S0302000_26.<init>(int, int, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed, X.0viU, java.util.Map, int):void");
    }
}
