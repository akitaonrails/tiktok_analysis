package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0PRC;
import X.C0Q3E;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1741890vQh;
import X.C197039127h;
import X.C212367188v;
import X.C2188811AlT;
import X.C655220Pmy;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662860PzI;
import X.InterfaceC645880PVa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.ShopCardCategory;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreNoLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AjS2S0301000_10 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS2S0301000_10 ajS2S0301000_10, View view) throws JSONException {
        String str;
        String str2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        if (view != null) {
            EcStoreNoLiveAssem ecStoreNoLiveAssem = (EcStoreNoLiveAssem) ajS2S0301000_10.l0;
            C197039127h c197039127h = (C197039127h) ajS2S0301000_10.l1;
            ShopCardCategory shopCardCategory = (ShopCardCategory) ajS2S0301000_10.l2;
            int i = ajS2S0301000_10.i3;
            C661010PwJ c661010PwJ = ecStoreNoLiveAssem.LLJZ;
            String str4 = "";
            if (c661010PwJ == null || (searchMixFeedBase3 = c661010PwJ.LL) == null || (eComShopCardStruct3 = searchMixFeedBase3.shopCard) == null || (str = eComShopCardStruct3.docId) == null) {
                str = "";
            }
            C662810PzD.LIZIZ(c197039127h, str);
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c3812.d3618", PageFinder.via((View) c197039127h), null);
            Context context = c197039127h.getContext();
            String str5 = shopCardCategory.schema;
            HashMap<String, Object> mapLJ = C662810PzD.LJ(null, "", null, false, ecStoreNoLiveAssem.LLJZ, C1558520qew.LJIIL(ecStoreNoLiveAssem), true);
            mapLJ.remove("entrance_form");
            mapLJ.remove("page_name");
            mapLJ.put("source_previous_page", "general_search");
            mapLJ.put("enter_method", "click_button");
            Uri.Builder builderBuildUpon = UriProtector.parse(str5).buildUpon();
            builderBuildUpon.appendQueryParameter("track_params", C1741890vQh.LJIIIIZZ(mapLJ));
            if (strCreateJumpSourceBtmToken != null) {
                builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
            }
            SmartRouter.buildRoute(context, builderBuildUpon.toString()).open();
            C661010PwJ c661010PwJ2 = ecStoreNoLiveAssem.LLJZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(ecStoreNoLiveAssem);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.b6880.c3812.d36180_i");
            sbLIZ.append(i);
            C662860PzI.LJIILLIIL("click_filter_tab", c661010PwJ2, interfaceC665370Q7zLJIIL, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) c197039127h));
            C661010PwJ c661010PwJ3 = ecStoreNoLiveAssem.LLJZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(ecStoreNoLiveAssem);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("a2270.b6880.c3812.d36180_i");
            sbLIZ2.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            PageFinder pageFinderVia = PageFinder.via((View) c197039127h);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL2, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
            if (c661010PwJ3 == null || (searchMixFeedBase2 = c661010PwJ3.LL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct2.docId) == null) {
                str2 = "";
            }
            jSONObject.put("search_result_id", str2);
            jSONObject.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL2, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
            if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str3 = eComShopCardStruct.shopId) != null) {
                str4 = str3;
            }
            jSONObject.put("shop_id", str4);
            jSONObject.put("tab_name", shopCardCategory.name);
            jSONObject.put("tab_rank", i);
            c1507790pL7.getClass();
            C1507790pL7.LJ("search_shop_card_tab_click", jSONObject, strLIZIZ, pageFinderVia);
            C662860PzI.LJIILL(ecStoreNoLiveAssem.LLJZ, C1558520qew.LJIIL(ecStoreNoLiveAssem), PageFinder.via((View) c197039127h));
        }
    }

    public static final void LIZ$1(AjS2S0301000_10 ajS2S0301000_10, View view) throws JSONException {
        String str;
        Aweme aweme;
        Map<String, String> map;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        if (view != null) {
            View view2 = (View) ajS2S0301000_10.l0;
            C661010PwJ c661010PwJ = ((EcStoreLiveAssem) ajS2S0301000_10.l1).LLJLL;
            if (c661010PwJ == null || (searchMixFeedBase = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.docId) == null) {
                str = "";
            }
            C662810PzD.LIZJ(view2, str);
            EcStoreLiveAssem ecStoreLiveAssem = (EcStoreLiveAssem) ajS2S0301000_10.l1;
            AddressCardProducts addressCardProducts = (AddressCardProducts) ajS2S0301000_10.l2;
            int i = ajS2S0301000_10.i3;
            C661010PwJ c661010PwJ2 = ecStoreLiveAssem.LLJLL;
            if (c661010PwJ2 != null && (aweme = c661010PwJ2.LLILLJJLI) != null) {
                SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(ecStoreLiveAssem), SearchServiceCenter$NavigateAbility.class);
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("c3812.d4738_w6322_i");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                PageFinder pageFinderVia = PageFinder.via((View) ecStoreLiveAssem.sp());
                C212367188v c212367188v = BcmParams.Companion;
                if (addressCardProducts != null && (bcmStandardTrackEvent = addressCardProducts.bcmStandardTrackEvent) != null) {
                    map = bcmStandardTrackEvent.chainParamMap;
                } else {
                    map = null;
                }
                c212367188v.getClass();
                String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(strLIZIZ, pageFinderVia, C212367188v.LIZJ(map));
                AwemeBizExtKt.setSourceBtmToken(aweme, strCreateJumpSourceBtmToken);
                AwS95S1200000_10 awS95S1200000_10 = new AwS95S1200000_10(addressCardProducts, ecStoreLiveAssem, strCreateJumpSourceBtmToken, 22);
                final Map mapCreateReportParams$default = BtmSDK.createReportParams$default(btmSDK, "a2270.b6880.c3812.d4738", PageFinder.via((View) ecStoreLiveAssem.sp()), null, 4, null);
                if (searchServiceCenter$NavigateAbility.zT1()) {
                    C0Q3E.LIZJ(aweme).fe(new C655220Pmy(awS95S1200000_10));
                    searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL(ecStoreLiveAssem), aweme, new InterfaceC645880PVa(mapCreateReportParams$default) { // from class: X.0PzG
                        public final C650430PfF LL;

                        @Override // X.InterfaceC645880PVa
                        public final boolean LLJJJIL() {
                            return false;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        @Override // X.InterfaceC645880PVa
                        public final C650430PfF LLIZLLLIL() {
                            return this.LL;
                        }

                        {
                            this.LL = new C650430PfF(new AwS589S0100000_10(mapCreateReportParams$default, (Map<String, String>) 657));
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }
                    }, false, null, null);
                } else {
                    searchServiceCenter$NavigateAbility.hk0(C1558520qew.LJIIL(ecStoreLiveAssem), aweme, awS95S1200000_10);
                }
            }
            C661010PwJ c661010PwJ3 = ((EcStoreLiveAssem) ajS2S0301000_10.l1).LLJLL;
            AddressCardProducts addressCardProducts2 = (AddressCardProducts) ajS2S0301000_10.l2;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((EcStoreLiveAssem) ajS2S0301000_10.l1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("a2270.b6880.c3812.d4738_w6322_i");
            sbLIZ2.append(ajS2S0301000_10.i3);
            C662860PzI.LJI(PageFinder.via((View) ajS2S0301000_10.l0), interfaceC665370Q7zLJIIL, addressCardProducts2, c661010PwJ3, C2188811AlT.LIZIZ(sbLIZ2));
            C661010PwJ c661010PwJ4 = ((EcStoreLiveAssem) ajS2S0301000_10.l1).LLJLL;
            AddressCardProducts addressCardProducts3 = (AddressCardProducts) ajS2S0301000_10.l2;
            int i2 = ajS2S0301000_10.i3;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((EcStoreLiveAssem) ajS2S0301000_10.l1);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("a2270.b6880.c3812.d4738_w6322_i");
            sbLIZ3.append(ajS2S0301000_10.i3);
            C662860PzI.LJII(c661010PwJ4, addressCardProducts3, i2, interfaceC665370Q7zLJIIL2, C2188811AlT.LIZIZ(sbLIZ3), PageFinder.via((View) ajS2S0301000_10.l0));
        }
    }

    public static final void LIZ$2(AjS2S0301000_10 ajS2S0301000_10, View view) throws JSONException {
        String str;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        if (view != null) {
            View view2 = (View) ajS2S0301000_10.l0;
            C661010PwJ c661010PwJ = ((EcStoreLiveV2Assem) ajS2S0301000_10.l1).LLJZIJLIL;
            if (c661010PwJ == null || (searchMixFeedBase = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.docId) == null) {
                str = "";
            }
            C662810PzD.LIZJ(view2, str);
            ((EcStoreLiveV2Assem) ajS2S0301000_10.l1).zp(false, (AddressCardProducts) ajS2S0301000_10.l2, Integer.valueOf(ajS2S0301000_10.i3));
            C661010PwJ c661010PwJ2 = ((EcStoreLiveV2Assem) ajS2S0301000_10.l1).LLJZIJLIL;
            AddressCardProducts addressCardProducts = (AddressCardProducts) ajS2S0301000_10.l2;
            int i = ajS2S0301000_10.i3;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS2S0301000_10.l1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.b6880.c3812.d4738_w6322_i");
            sbLIZ.append(ajS2S0301000_10.i3);
            C662860PzI.LJIIIZ(c661010PwJ2, addressCardProducts, i, interfaceC665370Q7zLJIIL, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) ajS2S0301000_10.l0), true);
            C661010PwJ c661010PwJ3 = ((EcStoreLiveV2Assem) ajS2S0301000_10.l1).LLJZIJLIL;
            AddressCardProducts addressCardProducts2 = (AddressCardProducts) ajS2S0301000_10.l2;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS2S0301000_10.l1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("a2270.b6880.c3812.d4738_w6322_i");
            sbLIZ2.append(ajS2S0301000_10.i3);
            C662860PzI.LJI(PageFinder.via((View) ajS2S0301000_10.l0), interfaceC665370Q7zLJIIL2, addressCardProducts2, c661010PwJ3, C2188811AlT.LIZIZ(sbLIZ2));
            C661010PwJ c661010PwJ4 = ((EcStoreLiveV2Assem) ajS2S0301000_10.l1).LLJZIJLIL;
            AddressCardProducts addressCardProducts3 = (AddressCardProducts) ajS2S0301000_10.l2;
            int i2 = ajS2S0301000_10.i3;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS2S0301000_10.l1);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("a2270.b6880.c3812.d4738_w6322_i");
            sbLIZ3.append(ajS2S0301000_10.i3);
            C662860PzI.LJII(c661010PwJ4, addressCardProducts3, i2, interfaceC665370Q7zLJIIL3, C2188811AlT.LIZIZ(sbLIZ3), PageFinder.via((View) ajS2S0301000_10.l0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS2S0301000_10(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
