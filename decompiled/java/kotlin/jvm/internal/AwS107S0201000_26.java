package kotlin.jvm.internal;

import X.C09AY;
import X.C1261860iwS;
import X.C1713290ugZ;
import X.C1744320vUc;
import X.C1752920viU;
import X.C1761230vvt;
import X.C1761290vvz;
import X.C817803Hk;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS107S0201000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
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

    public static final Object invoke$0(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        return C1713290ugZ.LIZ((C1713290ugZ) obj, null, null, null, (List) awS107S0201000_26.l0, ((List) awS107S0201000_26.l1).size() + awS107S0201000_26.i2, 7);
    }

    public static final Object invoke$1(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        return C1713290ugZ.LIZ((C1713290ugZ) obj, null, null, null, (List) awS107S0201000_26.l0, ((List) awS107S0201000_26.l1).size() + awS107S0201000_26.i2, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS107S0201000_26 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r4
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem) r0
            X.03bj r0 = r0.Ho()
            java.lang.String r1 = r0.LLILLL
            java.lang.String r0 = "fill_type"
            r4.plusAssign(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption) r0
            java.lang.Integer r2 = r0.getType()
            if (r2 == 0) goto L4b
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L41
            java.lang.String r1 = "rfc_info"
        L24:
            java.lang.String r0 = "option_name"
            r4.plusAssign(r0, r1)
            int r0 = r3.i2
            if (r0 != 0) goto L3e
            java.lang.String r1 = "1"
        L2f:
            java.lang.String r0 = "is_default"
            r4.plusAssign(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "add_certification"
            r4.plusAssign(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            java.lang.String r1 = "0"
            goto L2f
        L41:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L4b
            java.lang.String r1 = "curp_info"
            goto L24
        L4b:
            java.lang.String r1 = ""
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS107S0201000_26.invoke$2(kotlin.jvm.internal.AwS107S0201000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        Object obj2;
        Object obj3;
        int i;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("data_state", Integer.valueOf(awS107S0201000_26.i2));
        Map map = (Map) awS107S0201000_26.l0;
        Object obj4 = null;
        if (map != null) {
            obj2 = map.get("entrance_form");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("entrance_form", obj2);
        Map map2 = (Map) awS107S0201000_26.l0;
        if (map2 != null) {
            obj3 = map2.get("source_page_type");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("source_page_type", obj3);
        Map map3 = (Map) awS107S0201000_26.l0;
        if (map3 != null) {
            obj4 = map3.get("enter_from_info");
        }
        laneParams.plusAssign("enter_from_info", obj4);
        if (((OneClickPayContext) awS107S0201000_26.l1) != null) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_one_click_pay", Integer.valueOf(i));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(laneParams.size()));
        laneParams.plusAssign("rank", Integer.valueOf(awS107S0201000_26.i2 + 1));
        laneParams.plusAssign("action_type", "click");
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS107S0201000_26.l0).mS().LLJJI);
        List<District> list = ((District) ((C1744320vUc) awS107S0201000_26.l1).LIZ).parRegions;
        if (list != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        Object obj2;
        String str;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        Map<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_id", ((C1752920viU) awS107S0201000_26.l0).LLILZ);
        laneParams.plusAssign("source_page_type", "pdp_shop_recommend");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1752920viU) awS107S0201000_26.l0).LLILLL.LLJI;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("enter_from")) == null) {
            obj2 = "homepage_mall";
        }
        laneParams.plusAssign("enter_from", obj2);
        ShopProductData shopProductData = ((Feed) awS107S0201000_26.l1).shopProduct;
        if (shopProductData != null) {
            str = shopProductData.id;
        } else {
            str = null;
        }
        laneParams.plusAssign("product_id", str);
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("entrance_info", "");
        laneParams.plusAssign("original_price", "");
        laneParams.plusAssign("sale_price", "");
        laneParams.withParamsGroup(((C1752920viU) awS107S0201000_26.l0).LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(awS107S0201000_26.i2))));
        ShopProductData shopProductData2 = ((Feed) awS107S0201000_26.l1).shopProduct;
        if (shopProductData2 != null && (bCMStandardTrack = shopProductData2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS107S0201000_26 awS107S0201000_26, Object obj) {
        int length;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("like_cnt", Integer.valueOf(awS107S0201000_26.i2));
        laneParams.plusAssign("rate", ((C1761290vvz) awS107S0201000_26.l0).LIZIZ);
        String str2 = ((C1761290vvz) awS107S0201000_26.l0).LJIJ;
        if (str2 != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        if (Intrinsics.LJFF(((C1761290vvz) awS107S0201000_26.l0).LJIIJJI, Boolean.TRUE)) {
            str = "comment";
        } else {
            str = "default";
        }
        laneParams.plusAssign("text_type", str);
        Integer num = ((C1761290vvz) awS107S0201000_26.l0).LJIILJJIL;
        if (num != null) {
            laneParams.plusAssign("is_third_party", Integer.valueOf(num.intValue()));
        }
        laneParams.plusAssign("is_local", Integer.valueOf(((C1761290vvz) awS107S0201000_26.l0).LJIJI ? 1 : 0));
        C1761230vvt c1761230vvt = (C1761230vvt) awS107S0201000_26.l1;
        C1761290vvz c1761290vvz = (C1761290vvz) awS107S0201000_26.l0;
        c1761230vvt.getClass();
        C1761230vvt.LIZLLL(laneParams, c1761290vvz);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0201000_26(int i, C1761290vvz c1761290vvz, C1761230vvt c1761230vvt, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c1761290vvz;
        this.l1 = c1761230vvt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0201000_26(int i, int i2, DistrictFragment districtFragment, C1744320vUc<District> c1744320vUc) {
        super(1);
        this.$t = c1744320vUc;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0201000_26(int i, int i2, Map<String, ? extends Object> map, OneClickPayContext oneClickPayContext) {
        super(1);
        this.$t = oneClickPayContext;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0201000_26(C1752920viU c1752920viU, Feed feed, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1752920viU;
        this.l1 = feed;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0201000_26(AddressIdentityAssem addressIdentityAssem, IdentityInfoOption identityInfoOption, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = addressIdentityAssem;
        this.l1 = identityInfoOption;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0201000_26(List list, List<C1261860iwS> list2, int i, List<C1261860iwS> list3) {
        super(1);
        this.$t = list3;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
