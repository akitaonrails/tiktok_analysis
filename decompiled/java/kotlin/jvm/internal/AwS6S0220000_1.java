package kotlin.jvm.internal;

import X.C09AY;
import X.C1054104Ah;
import X.C1062904Dr;
import X.C1063304Dv;
import X.C1397630mTR;
import X.C1397650mTT;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1757010vp5;
import X.C1942307jB;
import X.C719302rP;
import X.C893803eS;
import X.C957403oi;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS6S0220000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0220000_1 awS6S0220000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131840238, new AwS89S0110000_1((Function0) awS6S0220000_1.l0, (Function0<Unit>) awS6S0220000_1.z3, true));
        if (awS6S0220000_1.z2) {
            List<C1397650mTT> list = c1397630mTR.LJ;
            Context context = (Context) awS6S0220000_1.l1;
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((C1397650mTT) it2.next()).LIZ(new AwS580S0100000_1(context, 153));
            }
        }
        c1397630mTR.LJI(2131840239, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0220000_1 awS6S0220000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS6S0220000_1((C719302rP) awS6S0220000_1.l0, (C719302rP) awS6S0220000_1.l1, (Map<String, String>) awS6S0220000_1.z2, awS6S0220000_1.z3, true));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S0220000_1 awS6S0220000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("shop_info_list", ((C719302rP) awS6S0220000_1.l0).LLIZLLLIL);
        map.put("product_panel_title", ((C719302rP) awS6S0220000_1.l0).LLJILJIL);
        map.put("track_message", (Map) awS6S0220000_1.l1);
        map.put("show_gift", Boolean.valueOf(awS6S0220000_1.z2));
        map.put("product_detail_from_combined_sku", Boolean.valueOf(awS6S0220000_1.z3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S0220000_1 awS6S0220000_1, Object obj) {
        Object obj2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        String strLIZIZ4;
        String strLIZIZ5;
        String strLIZIZ6;
        String strLIZIZ7;
        String strLIZIZ8;
        String str;
        String strLIZIZ9;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054104Ah) awS6S0220000_1.l0).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LIZJ("page_name", "product_detail");
        String str2 = "1";
        c957403oi.LIZJ("is_inapp", "1");
        if (awS6S0220000_1.z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZJ("is_ddl", obj2);
        Uri uri4 = (Uri) awS6S0220000_1.l1;
        String strLIZIZ10 = null;
        if ((uri4 == null || (strLIZIZ = C1942307jB.LIZIZ(uri4, "gclid")) == null) && (((uri = (Uri) awS6S0220000_1.l1) == null || (strLIZIZ = C1942307jB.LIZIZ(uri, "fbclid")) == null) && (((uri2 = (Uri) awS6S0220000_1.l1) == null || (strLIZIZ = C1942307jB.LIZIZ(uri2, "ttclid")) == null) && ((uri3 = (Uri) awS6S0220000_1.l1) == null || (strLIZIZ = C1942307jB.LIZIZ(uri3, "gbraid")) == null)))) {
            Uri uri5 = (Uri) awS6S0220000_1.l1;
            if (uri5 != null) {
                strLIZIZ = C1942307jB.LIZIZ(uri5, "afid");
            } else {
                strLIZIZ = null;
            }
        }
        c957403oi.LIZJ("ug_click_id", strLIZIZ);
        Uri uri6 = (Uri) awS6S0220000_1.l1;
        String str3 = "";
        if (uri6 == null || (strLIZIZ2 = C1942307jB.LIZIZ(uri6, "previous_page")) == null) {
            strLIZIZ2 = "";
        }
        c957403oi.LIZJ("ug_previous_page", strLIZIZ2);
        Uri uri7 = (Uri) awS6S0220000_1.l1;
        if (uri7 == null || (strLIZIZ3 = C1942307jB.LIZIZ(uri7, "media_source")) == null) {
            strLIZIZ3 = "";
        }
        c957403oi.LIZJ("ug_media_source", strLIZIZ3);
        Uri uri8 = (Uri) awS6S0220000_1.l1;
        if (uri8 == null || (strLIZIZ4 = C1942307jB.LIZIZ(uri8, "af_c_id")) == null) {
            strLIZIZ4 = "";
        }
        c957403oi.LIZJ("ug_campaign_id", strLIZIZ4);
        Uri uri9 = (Uri) awS6S0220000_1.l1;
        if (uri9 == null || (strLIZIZ5 = C1942307jB.LIZIZ(uri9, "af_adset_id")) == null) {
            strLIZIZ5 = "";
        }
        c957403oi.LIZJ("ug_adset_id", strLIZIZ5);
        Uri uri10 = (Uri) awS6S0220000_1.l1;
        if (uri10 == null || (strLIZIZ6 = C1942307jB.LIZIZ(uri10, "af_ad_id")) == null) {
            strLIZIZ6 = "";
        }
        c957403oi.LIZJ("ug_ad_id", strLIZIZ6);
        Uri uri11 = (Uri) awS6S0220000_1.l1;
        if (uri11 != null) {
            strLIZIZ7 = C1942307jB.LIZIZ(uri11, "top_product_ids");
        } else {
            strLIZIZ7 = null;
        }
        c957403oi.LIZJ("ug_top_product_ids", strLIZIZ7);
        Uri uri12 = (Uri) awS6S0220000_1.l1;
        if (uri12 != null) {
            strLIZIZ10 = C1942307jB.LIZIZ(uri12, "creative_id");
        }
        c957403oi.LIZJ("ug_creative_id", strLIZIZ10);
        Uri uri13 = (Uri) awS6S0220000_1.l1;
        if (uri13 == null || (strLIZIZ8 = C1942307jB.LIZIZ(uri13, "ad_info")) == null) {
            strLIZIZ8 = "";
        }
        c957403oi.LIZJ("ug_ad_info", strLIZIZ8);
        Uri uri14 = (Uri) awS6S0220000_1.l1;
        if (uri14 != null && (strLIZIZ9 = C1942307jB.LIZIZ(uri14, "extra")) != null) {
            str3 = strLIZIZ9;
        }
        c957403oi.LIZJ("ug_extra", str3);
        if (!awS6S0220000_1.z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZJ("is_ddl", str2);
        if (awS6S0220000_1.z3) {
            str = "full";
        } else {
            str = "half";
        }
        c957403oi.LIZJ("landpage_form", str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS6S0220000_1 awS6S0220000_1, Object obj) {
        String str;
        Object obj2;
        boolean zLJFF;
        String str2;
        BuyButton buyButton;
        ProductBase productBase;
        ProductPrice productPrice;
        SkuPrice skuPrice;
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        HashMap map = new HashMap();
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS6S0220000_1.l0;
        boolean z = awS6S0220000_1.z2;
        C1062904Dr c1062904Dr = (C1062904Dr) awS6S0220000_1.l1;
        boolean z2 = awS6S0220000_1.z3;
        map.put("pdp_unique_id", seaPdpViewModel.LLLZZIL);
        if (z) {
            str = "able_to_buy";
        } else {
            str = "unable_to_buy";
        }
        map.put("button_type", str);
        map.put("is_clickable", C893803eS.LIZ(z));
        SkuItem skuItemIR2 = seaPdpViewModel.IR2();
        int i = 0;
        if (skuItemIR2 == null || (skuPrice = skuItemIR2.price) == null || (obj2 = skuPrice.discount) == null) {
            obj2 = 0;
        }
        map.put("discount_percentage", obj2);
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
            zLJFF = Intrinsics.LJFF(productPrice.needIcon, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        map.put("is_buy_with_coupon", C893803eS.LIZ(zLJFF));
        if (c1062904Dr != null && (C1757010vp5.LIZ(c1062904Dr.LL) || C1757010vp5.LIZ(c1062904Dr.LLILLJJLI))) {
            i = 1;
        }
        map.put("if_ellipses_show", Integer.valueOf(i));
        if (z2) {
            C1063304Dv bottomBarVO = seaPdpMainState.getBottomBarVO();
            if (bottomBarVO != null && (buyButton = bottomBarVO.LJ) != null) {
                str2 = buyButton.daInfo;
            } else {
                str2 = null;
            }
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
            if (mapLJIIJ != null) {
                map.putAll(mapLJIIJ);
            }
            Map<String, Object> mapLIZ = seaPdpViewModel.XR2().LIZ();
            if (mapLIZ != null) {
                map.putAll(mapLIZ);
            }
        }
        return map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S0220000_1(C719302rP c719302rP, C719302rP c719302rP2, Map<String, String> map, boolean z, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = c719302rP;
        this.l1 = c719302rP2;
        this.z2 = map;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0220000_1(C1054104Ah c1054104Ah, boolean z, Uri uri, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054104Ah;
        this.z2 = z;
        this.l1 = uri;
        this.z3 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0220000_1(Context context, Function0 function0, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = function0;
        this.z3 = z2;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0220000_1(SeaPdpViewModel seaPdpViewModel, boolean z, C1062904Dr c1062904Dr, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.z2 = z;
        this.l1 = c1062904Dr;
        this.z3 = z2;
    }
}
