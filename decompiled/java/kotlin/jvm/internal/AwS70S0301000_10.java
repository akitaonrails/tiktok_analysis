package kotlin.jvm.internal;

import X.C09AY;
import X.C0PRC;
import X.C0Q1G;
import X.C0QES;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1766860w4y;
import X.C212367188v;
import X.C2188811AlT;
import X.C658550PsL;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662850PzH;
import X.C662860PzI;
import X.C663070Pzd;
import X.EnumC657940PrM;
import X.InterfaceC662780PzA;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreNoLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS70S0301000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS70S0301000_10 awS70S0301000_10) {
        C663070Pzd c663070Pzd = new C663070Pzd((Context) awS70S0301000_10.l0, (AttributeSet) awS70S0301000_10.l1, awS70S0301000_10.i3);
        C658550PsL c658550PsL = (C658550PsL) awS70S0301000_10.l2;
        if (c658550PsL != null) {
            c663070Pzd.getStatusDelegate().LIZJ().add(c658550PsL);
        }
        ((C658550PsL) awS70S0301000_10.l2).addView(c663070Pzd);
        return c663070Pzd;
    }

    public static final Object invoke$1(AwS70S0301000_10 awS70S0301000_10) throws JSONException {
        Map<String, String> map;
        Object imprId;
        Object imprId2;
        Object obj;
        Object obj2;
        Aweme aweme;
        int i;
        InterfaceC662780PzA interfaceC662780PzA;
        SearchMixFeedBase searchMixFeedBase;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct;
        List<EComShopLabel> list;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct3;
        Object obj3;
        Map<String, String> map2;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase7;
        SearchMixFeedBase searchMixFeedBase8;
        View view = (View) awS70S0301000_10.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ec_search_tab_name", "general_search");
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJI(view, "c3978", "d0", linkedHashMap, null);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c3812.d0127_i");
        sbLIZ.append(awS70S0301000_10.i3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PageFinder pageFinderVia = PageFinder.via((View) awS70S0301000_10.l0);
        C212367188v c212367188v = BcmParams.Companion;
        BcmStandardTrackEvent bcmStandardTrackEvent = ((AddressCardProducts) awS70S0301000_10.l1).bcmStandardTrackEvent;
        EComShopCardStruct eComShopCardStruct6 = null;
        if (bcmStandardTrackEvent != null) {
            map = bcmStandardTrackEvent.chainParamMap;
        } else {
            map = null;
        }
        c212367188v.getClass();
        SmartRouter.buildRoute(((View) awS70S0301000_10.l0).getContext(), C662810PzD.LJI((AddressCardProducts) awS70S0301000_10.l1, true, ((EcStoreNoLiveAssem) awS70S0301000_10.l2).LLJZ, btmSDK.createJumpSourceBtmToken(strLIZIZ, pageFinderVia, C212367188v.LIZJ(map)), C1558520qew.LJIIL((EcStoreNoLiveAssem) awS70S0301000_10.l2), ((EcStoreNoLiveAssem) awS70S0301000_10.l2).getContext(), EnumC657940PrM.GENERAL_SEARCH_STORE_CARD)).open();
        int i2 = awS70S0301000_10.i3;
        C661010PwJ c661010PwJ = ((EcStoreNoLiveAssem) awS70S0301000_10.l2).LLJZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((EcStoreNoLiveAssem) awS70S0301000_10.l2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("a2270.b6880.c3812.d0127_i");
        sbLIZ2.append(awS70S0301000_10.i3);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        PageFinder pageFinderVia2 = PageFinder.via((View) awS70S0301000_10.l0);
        AddressCardProducts addressCardProducts = (AddressCardProducts) awS70S0301000_10.l1;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ != null && (searchMixFeedBase8 = c661010PwJ.LL) != null) {
            imprId = searchMixFeedBase8.getImprId();
        } else {
            imprId = null;
        }
        jSONObject.put("impr_id", imprId);
        if (c661010PwJ != null && (searchMixFeedBase7 = c661010PwJ.LL) != null) {
            imprId2 = searchMixFeedBase7.getImprId();
        } else {
            imprId2 = null;
        }
        jSONObject.put("request_id", imprId2);
        jSONObject.put("enter_from", "general_search");
        if (c661010PwJ != null && (searchMixFeedBase6 = c661010PwJ.LL) != null && (eComShopCardStruct5 = searchMixFeedBase6.shopCard) != null && eComShopCardStruct5.liveEntity != null) {
            obj = "live";
        } else {
            obj = "mt_goods";
        }
        jSONObject.put("list_result_type", obj);
        Object obj4 = "";
        if (c661010PwJ == null || (searchMixFeedBase5 = c661010PwJ.LL) == null || (eComShopCardStruct4 = searchMixFeedBase5.shopCard) == null || (obj2 = eComShopCardStruct4.roomId) == null) {
            obj2 = "";
        }
        jSONObject.put("list_item_id", obj2);
        jSONObject.put("discount_rate", addressCardProducts.discountRate);
        jSONObject.put("product_id", addressCardProducts.productId);
        BcmStandardTrackEvent bcmStandardTrackEvent2 = addressCardProducts.bcmStandardTrackEvent;
        if (bcmStandardTrackEvent2 != null && (map2 = bcmStandardTrackEvent2.trackParamMap) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        if (c661010PwJ != null && (searchMixFeedBase4 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase4.shopCard) != null && (obj3 = eComShopCardStruct3.docId) != null) {
            obj4 = obj3;
        }
        jSONObject.put("search_result_id", obj4);
        jSONObject.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
        jSONObject.put("token_type", "shop");
        jSONObject.put("rank", ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, SearchServiceCenter$CardCommonAbility.class)).k4().getLayoutPosition());
        jSONObject.put("aladdin_rank", i2);
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct2 = searchMixFeedBase3.shopCard) != null) {
            aweme = eComShopCardStruct2.liveEntity;
        } else {
            aweme = null;
        }
        if (aweme != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_live", i);
        jSONObject.put("aladdin_button_type", "click_goods");
        jSONObject.put("page_name", "general_search");
        JSONArray jSONArray = new JSONArray();
        if (c661010PwJ != null && (searchMixFeedBase2 = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase2.shopCard) != null && (list = eComShopCardStruct.shopLabels) != null) {
            int i3 = 0;
            for (EComShopLabel eComShopLabel : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("position", i3);
                    jSONObject2.put("tag", eComShopLabel.type);
                    jSONArray.put(jSONObject2);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        jSONObject.put("shop_label", jSONArray);
        if (c661010PwJ != null) {
            C662860PzI.LIZIZ(jSONObject, c661010PwJ);
        }
        jSONObject.put("end_to_end_search_session_id", C0QES.LIZ(C0QES.LIZ, null, false, 7));
        c1507790pL7.getClass();
        C1507790pL7.LJ("search_result_click", jSONObject, strLIZIZ2, pageFinderVia2);
        C661010PwJ c661010PwJ2 = ((EcStoreNoLiveAssem) awS70S0301000_10.l2).LLJZ;
        AddressCardProducts addressCardProducts2 = (AddressCardProducts) awS70S0301000_10.l1;
        int i5 = awS70S0301000_10.i3;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((EcStoreNoLiveAssem) awS70S0301000_10.l2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("a2270.b6880.c3812.d0127_i");
        sbLIZ3.append(awS70S0301000_10.i3);
        C662860PzI.LJIIIZ(c661010PwJ2, addressCardProducts2, i5, interfaceC665370Q7zLJIIL2, C2188811AlT.LIZIZ(sbLIZ3), PageFinder.via((View) awS70S0301000_10.l0), false);
        C661010PwJ c661010PwJ3 = ((EcStoreNoLiveAssem) awS70S0301000_10.l2).LLJZ;
        if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null) {
            eComShopCardStruct6 = searchMixFeedBase.shopCard;
        }
        if (C662850PzH.LJ(eComShopCardStruct6) && (interfaceC662780PzA = ((EcStoreNoLiveAssem) awS70S0301000_10.l2).LLJZIJLIL) != null) {
            interfaceC662780PzA.LJIL(C0Q1G.PRODUCT_COVER);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0301000_10(Context context, AttributeSet attributeSet, int i, C658550PsL c658550PsL, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = context;
        this.l1 = attributeSet;
        this.i3 = i;
        this.l2 = c658550PsL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0301000_10(View view, int i, AddressCardProducts addressCardProducts, EcStoreNoLiveAssem ecStoreNoLiveAssem, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i3 = i;
        this.l1 = addressCardProducts;
        this.l2 = ecStoreNoLiveAssem;
    }
}
