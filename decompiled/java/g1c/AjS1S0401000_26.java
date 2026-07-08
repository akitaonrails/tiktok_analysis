package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C049O;
import X.C04HR;
import X.C1013003xg;
import X.C1017603yQ;
import X.C10342042q;
import X.C1053804Ae;
import X.C128Y;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C817803Hk;
import X.C827260Wcm;
import X.C919503ib;
import X.C946803n0;
import X.C960603pE;
import X.EnumC827250Wcl;
import X.InterfaceC1018003yU;
import X.InterfaceC1748810vbr;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS18S0401000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AjS1S0401000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS1S0401000_26 ajS1S0401000_26, View view) {
        String str;
        Map<String, Object> map;
        LaneParams laneParamsLIZIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Map<String, Object> map2;
        InterfaceC1748810vbr interfaceC1748810vbrLIZ;
        Integer num;
        InterfaceC1748810vbr interfaceC1748810vbr;
        if (view != null && (str = ((BundleProduct) ajS1S0401000_26.l0).schema) != null) {
            ((PdpBundleDealVH) ajS1S0401000_26.l1).c6().LIZLLL(view, (BundleInfo) ajS1S0401000_26.l2, "product_card");
            C1753660vjg c1753660vjgC6 = ((PdpBundleDealVH) ajS1S0401000_26.l1).c6();
            BundleInfo bundleInfo = (BundleInfo) ajS1S0401000_26.l2;
            BundleProduct bundleProduct = (BundleProduct) ajS1S0401000_26.l0;
            int i = ajS1S0401000_26.i4;
            Map<String, Object> mapLIZJ = ((PdpBundleDealVH) ajS1S0401000_26.l1).e6().LLILZIL.LIZJ(new C817803Hk("c1720.d87776", Integer.valueOf(ajS1S0401000_26.i4)));
            c1753660vjgC6.getClass();
            C128Y c128yLIZ = C946803n0.LIZ(view);
            Map<String, Object> map3 = null;
            if ((c128yLIZ instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZ) != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049O(), new AwS18S0401000_26(c1753660vjgC6, (C1753660vjg) bundleInfo, (BundleInfo) bundleProduct, (BundleProduct) i, (int) mapLIZJ, (Map<String, ? extends Object>) 2));
            }
            C04HR c04hr = ((PdpBundleDealVH) ajS1S0401000_26.l1).e6().LLLLLJIL;
            View view2 = (View) ajS1S0401000_26.l3;
            EnumC827250Wcl enumC827250Wcl = EnumC827250Wcl.BUNDLE;
            C1053804Ae c1053804Ae = ((PdpBundleDealVH) ajS1S0401000_26.l1).e6().LLILZIL;
            int i2 = ajS1S0401000_26.i4;
            c1053804Ae.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c1720.d87776_i");
            sbLIZ.append(i2);
            String strLJII = c1053804Ae.LJII(C2188811AlT.LIZIZ(sbLIZ), str, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("product_id", ((BundleProduct) ajS1S0401000_26.l0).productId);
            linkedHashMap.put("product_source", ((BundleProduct) ajS1S0401000_26.l0).productSource);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(((PdpBundleDealVH) ajS1S0401000_26.l1).c6().LIZJ);
            sbLIZ2.append('_');
            sbLIZ2.append(ajS1S0401000_26.i4 + 1);
            linkedHashMap.put("track_id", C2188811AlT.LIZIZ(sbLIZ2));
            c04hr.getClass();
            if (C827260Wcm.LIZ[enumC827250Wcl.ordinal()] == 1) {
                IPdpStarter.PdpEnterParam pdpEnterParam = c04hr.LIZ.LLJI;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (pdpEnterParam != null && (num = pdpEnterParam.bizType) != null) {
                    linkedHashMap2.put("biz_type", Integer.valueOf(num.intValue()));
                }
                IPdpStarter.LIZ.getClass();
                int iLIZJ = C1013003xg.LIZJ(pdpEnterParam);
                if (pdpEnterParam != null) {
                    map = pdpEnterParam.trackParams;
                } else {
                    map = null;
                }
                Integer numValueOf = Integer.valueOf(iLIZJ);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (view2 != null && (interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view2)) != null) {
                    laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business");
                } else {
                    laneParamsLIZIZ = null;
                }
                if (pdpEnterParam != null) {
                    map3 = pdpEnterParam.trackParams;
                }
                linkedHashMap3.put("entrance_form", "horizontal_goods_card");
                linkedHashMap3.put("source_page_type", "bundle_deal");
                linkedHashMap3.put("previous_page", "product_detail");
                if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                    obj = map2.get("follow_status");
                } else {
                    obj = null;
                }
                linkedHashMap3.put("follow_status", obj);
                linkedHashMap3.put("source_previous_page", "product_detail");
                Object obj6 = linkedHashMap.get("product_id");
                Object obj7 = "";
                if (obj6 == null) {
                    obj6 = "";
                }
                linkedHashMap3.put("product_id", obj6);
                Object obj8 = linkedHashMap.get("product_source");
                if (obj8 == null) {
                    obj8 = "";
                }
                linkedHashMap3.put("product_source", obj8);
                Object obj9 = linkedHashMap.get("track_id");
                if (obj9 == null) {
                    obj9 = "";
                }
                linkedHashMap3.put("track_id", obj9);
                if (laneParamsLIZIZ != null) {
                    obj2 = laneParamsLIZIZ.get((Object) "track_id");
                } else {
                    obj2 = null;
                }
                linkedHashMap3.put("parent_track_id", obj2);
                if (laneParamsLIZIZ != null) {
                    obj3 = laneParamsLIZIZ.get((Object) "product_id");
                } else {
                    obj3 = null;
                }
                linkedHashMap3.put("parent_product_id", obj3);
                if (laneParamsLIZIZ != null) {
                    obj4 = laneParamsLIZIZ.get((Object) "request_id");
                } else {
                    obj4 = null;
                }
                linkedHashMap3.put("parent_request_id", obj4);
                if (map3 != null && ((obj5 = map3.get("first_source_page")) != null || (obj5 = map3.get("source_page_type")) != null)) {
                    obj7 = obj5;
                }
                linkedHashMap3.put("first_source_page", obj7);
                linkedHashMap2.put("trackParams", C10342042q.LIZ(map, numValueOf, linkedHashMap3));
                SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(view2.getContext(), strLJII, linkedHashMap2, false);
                C960603pE.LJII(smartRouteLIZIZ, view2);
                smartRouteLIZIZ.open();
                return;
            }
            throw new C1954807lC();
        }
    }

    public static final void LIZ$1(AjS1S0401000_26 ajS1S0401000_26, View view) {
        String str;
        Map<String, Object> map;
        LaneParams laneParamsLIZIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Map<String, Object> map2;
        InterfaceC1748810vbr interfaceC1748810vbrLIZ;
        Integer num;
        InterfaceC1748810vbr interfaceC1748810vbr;
        if (view != null && (str = ((BundleProduct) ajS1S0401000_26.l0).schema) != null) {
            ((SeaPdpBundleDealVH) ajS1S0401000_26.l1).c6().LIZLLL(view, (BundleInfo) ajS1S0401000_26.l2, "product_card");
            C1753650vjf c1753650vjfC6 = ((SeaPdpBundleDealVH) ajS1S0401000_26.l1).c6();
            BundleInfo bundleInfo = (BundleInfo) ajS1S0401000_26.l2;
            BundleProduct bundleProduct = (BundleProduct) ajS1S0401000_26.l0;
            int i = ajS1S0401000_26.i4;
            Map<String, Object> mapLIZJ = ((SeaPdpBundleDealVH) ajS1S0401000_26.l1).d6().LLLLL.LIZJ(new C817803Hk("c1720.d87776", Integer.valueOf(ajS1S0401000_26.i4)));
            c1753650vjfC6.getClass();
            C128Y c128yLIZ = C946803n0.LIZ(view);
            Map<String, Object> map3 = null;
            if ((c128yLIZ instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZ) != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049O(), new AwS18S0401000_26(c1753650vjfC6, (C1753650vjf) bundleInfo, (BundleInfo) bundleProduct, (BundleProduct) i, (int) mapLIZJ, (Map<String, ? extends Object>) 6));
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = ((SeaPdpBundleDealVH) ajS1S0401000_26.l1).d6().LLIZ;
            View view2 = (View) ajS1S0401000_26.l3;
            C1053804Ae c1053804Ae = ((SeaPdpBundleDealVH) ajS1S0401000_26.l1).d6().LLLLL;
            int i2 = ajS1S0401000_26.i4;
            c1053804Ae.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c1720.d87776_i");
            sbLIZ.append(i2);
            String strLJII = c1053804Ae.LJII(C2188811AlT.LIZIZ(sbLIZ), str, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(((SeaPdpBundleDealVH) ajS1S0401000_26.l1).c6().LIZJ);
            sbLIZ2.append('_');
            sbLIZ2.append(ajS1S0401000_26.i4 + 1);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("product_id", ((BundleProduct) ajS1S0401000_26.l0).productId), new Pair("product_source", ((BundleProduct) ajS1S0401000_26.l0).productSource), new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ2)));
            View view3 = (View) ajS1S0401000_26.l3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (pdpEnterParam != null && (num = pdpEnterParam.bizType) != null) {
                linkedHashMap.put("biz_type", Integer.valueOf(num.intValue()));
            }
            InterfaceC1018003yU.LIZ.getClass();
            int iLIZ = C1017603yQ.LIZ(pdpEnterParam);
            if (pdpEnterParam != null) {
                map = pdpEnterParam.trackParams;
            } else {
                map = null;
            }
            Integer numValueOf = Integer.valueOf(iLIZ);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (view2 != null && (interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view2)) != null) {
                laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business");
            } else {
                laneParamsLIZIZ = null;
            }
            if (pdpEnterParam != null) {
                map3 = pdpEnterParam.trackParams;
            }
            linkedHashMap2.put("entrance_form", "horizontal_goods_card");
            linkedHashMap2.put("source_page_type", "bundle_deal");
            linkedHashMap2.put("previous_page", "product_detail");
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                obj = map2.get("follow_status");
            } else {
                obj = null;
            }
            linkedHashMap2.put("follow_status", obj);
            linkedHashMap2.put("source_previous_page", "product_detail");
            Object obj6 = mapLJIIIIZZ.get("product_id");
            Object obj7 = "";
            if (obj6 == null) {
                obj6 = "";
            }
            linkedHashMap2.put("product_id", obj6);
            Object obj8 = mapLJIIIIZZ.get("product_source");
            if (obj8 == null) {
                obj8 = "";
            }
            linkedHashMap2.put("product_source", obj8);
            Object obj9 = mapLJIIIIZZ.get("track_id");
            if (obj9 == null) {
                obj9 = "";
            }
            linkedHashMap2.put("track_id", obj9);
            if (laneParamsLIZIZ != null) {
                obj2 = laneParamsLIZIZ.get((Object) "track_id");
            } else {
                obj2 = null;
            }
            linkedHashMap2.put("parent_track_id", obj2);
            if (laneParamsLIZIZ != null) {
                obj3 = laneParamsLIZIZ.get((Object) "product_id");
            } else {
                obj3 = null;
            }
            linkedHashMap2.put("parent_product_id", obj3);
            if (laneParamsLIZIZ != null) {
                obj4 = laneParamsLIZIZ.get((Object) "request_id");
            } else {
                obj4 = null;
            }
            linkedHashMap2.put("parent_request_id", obj4);
            if (map3 != null && ((obj5 = map3.get("first_source_page")) != null || (obj5 = map3.get("source_page_type")) != null)) {
                obj7 = obj5;
            }
            linkedHashMap2.put("first_source_page", obj7);
            linkedHashMap.put("trackParams", C10342042q.LIZ(map, numValueOf, linkedHashMap2));
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(view3.getContext(), strLJII, linkedHashMap, false);
            C960603pE.LJII(smartRouteLIZIZ, view3);
            smartRouteLIZIZ.open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS1S0401000_26(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i4 = i;
        this.l3 = obj4;
    }
}
