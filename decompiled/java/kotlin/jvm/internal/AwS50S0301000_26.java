package kotlin.jvm.internal;

import X.AbstractC1763110vyv;
import X.C09AY;
import X.C1010603xI;
import X.C13LP;
import X.C1709570uaZ;
import X.C1709880ub4;
import X.C1752390vhd;
import X.C1752420vhg;
import X.C1752970viZ;
import X.C1762410vxn;
import X.C1762960vyg;
import X.C1762980vyi;
import X.C1763690vzr;
import X.C2188811AlT;
import X.C817803Hk;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductCardButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS50S0301000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS50S0301000_26 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS50S0301000_26.invoke$0(kotlin.jvm.internal.AwS50S0301000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752420vhg) awS50S0301000_26.l0).LLILZ);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS50S0301000_26.i3 + 1));
        FeedExtra feedExtra = ((Feed) awS50S0301000_26.l1).extra;
        String str2 = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        Map map = (Map) awS50S0301000_26.l2;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS50S0301000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752420vhg) awS50S0301000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS50S0301000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        FeedProduct feedProduct = ((Feed) awS50S0301000_26.l1).product;
        if (feedProduct != null) {
            str2 = feedProduct.id;
        }
        laneParams.plusAssign("product_id", str2);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        laneParams.withParamsGroup(((C1752420vhg) awS50S0301000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS50S0301000_26.i3))));
        FeedProduct feedProduct2 = ((Feed) awS50S0301000_26.l1).product;
        if (feedProduct2 != null && (bCMStandardTrack = feedProduct2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752420vhg) awS50S0301000_26.l0).LLILZ);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS50S0301000_26.i3 + 1));
        Map map = (Map) awS50S0301000_26.l1;
        String str2 = null;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS50S0301000_26.l1;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        FeedExtra feedExtra = ((Feed) awS50S0301000_26.l2).extra;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752420vhg) awS50S0301000_26.l0).LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(awS50S0301000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        FeedProduct feedProduct = ((Feed) awS50S0301000_26.l2).product;
        if (feedProduct != null) {
            str2 = feedProduct.id;
        }
        laneParams.plusAssign("product_id", str2);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        laneParams.withParamsGroup(((C1752420vhg) awS50S0301000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS50S0301000_26.i3))));
        BCMStandardTrack bCMStandardTrack = ((Feed) awS50S0301000_26.l2).product.standardEvent;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        String str;
        C1763690vzr c1763690vzr;
        Bitmap bitmap = (Bitmap) obj;
        AbstractC1763110vyv abstractC1763110vyv = (AbstractC1763110vyv) C13LP.LJJJLZIJ(awS50S0301000_26.i3, (List) awS50S0301000_26.l0);
        Map<String, ? extends Object> map = null;
        if (abstractC1763110vyv instanceof C1762980vyi) {
            str = ((C1762980vyi) abstractC1763110vyv).LJ;
        } else if (abstractC1763110vyv instanceof C1762960vyg) {
            str = ((C1762960vyg) abstractC1763110vyv).LJ;
        } else {
            str = null;
        }
        PdpViewModel pdpViewModel = ((C1762410vxn) awS50S0301000_26.l1).LLILZLL;
        if (pdpViewModel != null && (c1763690vzr = pdpViewModel.LLLLLJLJLL) != null) {
            Context context = (Context) awS50S0301000_26.l2;
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LLJI;
            if (pdpEnterParam != null) {
                map = pdpEnterParam.trackParams;
            }
            c1763690vzr.LIZIZ(context, "blank_pages", map, bitmap, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(((C1752970viZ) awS50S0301000_26.l0).LLJ));
        laneParams.putAll(C1010603xI.LIZ(((ProductTile) awS50S0301000_26.l1).daInfo));
        PdpProductCardButton pdpProductCardButton = ((ProductTile) awS50S0301000_26.l1).cartButton;
        if (pdpProductCardButton != null) {
            str = pdpProductCardButton.daInfo;
        } else {
            str = null;
        }
        laneParams.putAll(C1010603xI.LIZ(str));
        laneParams.plusAssign("request_id", ((C1752970viZ) awS50S0301000_26.l0).LLJI);
        laneParams.plusAssign("button_name", "add_to_cart");
        laneParams.plusAssign("button_type", "able_to_cart");
        laneParams.plusAssign("item_order", Integer.valueOf(((ProductRecommendFeedCell) awS50S0301000_26.l2).getPosition() + 1));
        if (awS50S0301000_26.i3 > 1) {
            str2 = "pass_sku";
        } else {
            str2 = "skip_pdp_and_sku";
        }
        laneParams.plusAssign("pdp_path", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752390vhd) awS50S0301000_26.l0).LLILLL);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS50S0301000_26.i3 + 1));
        FeedExtra feedExtra = ((Feed) awS50S0301000_26.l1).extra;
        String str2 = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        Map map = (Map) awS50S0301000_26.l2;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS50S0301000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752390vhd) awS50S0301000_26.l0).LLILLL);
        sbLIZ.append('_');
        sbLIZ.append(awS50S0301000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        FeedProduct feedProduct = ((Feed) awS50S0301000_26.l1).product;
        if (feedProduct != null) {
            str2 = feedProduct.id;
        }
        laneParams.plusAssign("product_id", str2);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(((C1752390vhd) awS50S0301000_26.l0).LLILLJJLI.LLLLL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS50S0301000_26.i3))));
        FeedProduct feedProduct2 = ((Feed) awS50S0301000_26.l1).product;
        if (feedProduct2 != null && (bCMStandardTrack = feedProduct2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            linkedHashMap.putAll(trackParam);
        }
        laneParams.withParamsGroup(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS50S0301000_26 awS50S0301000_26, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752390vhd) awS50S0301000_26.l0).LLILLL);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("item_order", Integer.valueOf(awS50S0301000_26.i3 + 1));
        Map map = (Map) awS50S0301000_26.l1;
        String str2 = null;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("product_source", obj2);
        Map map2 = (Map) awS50S0301000_26.l1;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("sales_price", obj3);
        FeedExtra feedExtra = ((Feed) awS50S0301000_26.l2).extra;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams.plusAssign("rec_params", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1752390vhd) awS50S0301000_26.l0).LLILLL);
        sbLIZ.append('_');
        sbLIZ.append(awS50S0301000_26.i3 + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        FeedProduct feedProduct = ((Feed) awS50S0301000_26.l2).product;
        if (feedProduct != null) {
            str2 = feedProduct.id;
        }
        laneParams.plusAssign("product_id", str2);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(((C1752390vhd) awS50S0301000_26.l0).LLILLJJLI.LLLLL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS50S0301000_26.i3))));
        BCMStandardTrack bCMStandardTrack = ((Feed) awS50S0301000_26.l2).product.standardEvent;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            linkedHashMap.putAll(trackParam);
        }
        laneParams.withParamsGroup(linkedHashMap);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS50S0301000_26(int r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r4, X.C1752390vhd r5, java.util.Map r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 5 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.i3 = r3
            r1.l1 = r6
            r1.l2 = r4
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.i3 = r3
            r1.l1 = r4
            r1.l2 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS50S0301000_26.<init>(int, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed, X.0vhd, java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS50S0301000_26(int r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r4, X.C1752420vhg r5, java.util.Map r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.i3 = r3
            r1.l1 = r6
            r1.l2 = r4
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.i3 = r3
            r1.l1 = r4
            r1.l2 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS50S0301000_26.<init>(int, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed, X.0vhg, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0301000_26(C1709570uaZ c1709570uaZ, C1709880ub4 c1709880ub4, PaymentOption paymentOption, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1709570uaZ;
        this.l1 = c1709880ub4;
        this.l2 = paymentOption;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0301000_26(C1752970viZ c1752970viZ, ProductTile productTile, ProductRecommendFeedCell productRecommendFeedCell, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1752970viZ;
        this.l1 = productTile;
        this.l2 = productRecommendFeedCell;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS50S0301000_26(List list, List<AbstractC1763110vyv> list2, int i, C1762410vxn c1762410vxn, Context context) {
        super(1);
        this.$t = context;
        this.l0 = list;
        this.i3 = list2;
        this.l1 = i;
        this.l2 = c1762410vxn;
    }
}
