package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C011J;
import X.C0A6W;
import X.C0PCY;
import X.C0PRC;
import X.C0Q1G;
import X.C0Q22;
import X.C0Q24;
import X.C0Q3E;
import X.C0QER;
import X.C0QES;
import X.C0QPI;
import X.C0QR7;
import X.C0QUT;
import X.C1018703yb;
import X.C123100dR;
import X.C1323690kYB;
import X.C1360520lVa;
import X.C1388190mED;
import X.C13LP;
import X.C1421105hJ;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1976807ok;
import X.C19EG;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C275320Aqg;
import X.C2818017g;
import X.C419910GdJ;
import X.C444910HcX;
import X.C640270P9l;
import X.C643110PKj;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C655220Pmy;
import X.C655610Pnb;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662850PzH;
import X.C662860PzI;
import X.C663060Pzc;
import X.C663990Q2r;
import X.C664000Q2s;
import X.C674480Qcw;
import X.C674510Qcz;
import X.C674620QdA;
import X.C687020QxA;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1870830ymf;
import X.InterfaceC645880PVa;
import X.InterfaceC655260Pn2;
import X.InterfaceC657510Pqf;
import X.InterfaceC662780PzA;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.search.general.productcard.ui.EcSearchProductCardAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.middle.aifloating.EcSearchAIFloatingButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ellipsis.EcSearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ShopStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AjS42S0200000_10 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS42S0200000_10 ajS42S0200000_10, View view) throws JSONException {
        String searchId;
        String searchResultId;
        String searchId2;
        String searchResultId2;
        String str;
        String str2;
        String str3;
        C664000Q2s c664000Q2s;
        if (view != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c7013.d29458_i");
            sbLIZ.append(((C0Q22) ajS42S0200000_10.l0).LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            PageFinder pageFinderVia = PageFinder.via(((C0Q22) ajS42S0200000_10.l0).LIZIZ);
            BcmParams bcmParams = new BcmParams();
            C0Q24 c0q24 = ((C0Q22) ajS42S0200000_10.l0).LIZLLL;
            String str4 = "";
            if (c0q24 == null || (searchId = c0q24.getSearchId()) == null) {
                searchId = "";
            }
            bcmParams.put("search_id", searchId);
            C0Q24 c0q242 = ((C0Q22) ajS42S0200000_10.l0).LIZLLL;
            if (c0q242 == null || (searchResultId = c0q242.getSearchResultId()) == null) {
                searchResultId = "";
            }
            bcmParams.put("search_result_id", searchResultId);
            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(strLIZIZ, pageFinderVia, bcmParams);
            if (strCreateJumpSourceBtmToken == null) {
                strCreateJumpSourceBtmToken = "";
            }
            Context context = ((C0Q22) ajS42S0200000_10.l0).LIZIZ.getContext();
            Product product = (Product) ajS42S0200000_10.l1;
            String str5 = product.schema;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrance_form", "search_pure_user_goods_card");
            jSONObject.put("enter_from_info", "general_search");
            C0Q24 c0q243 = ((C0Q22) ajS42S0200000_10.l0).LIZLLL;
            if (c0q243 == null || (searchId2 = c0q243.getSearchId()) == null) {
                searchId2 = "";
            }
            jSONObject.put("search_id", searchId2);
            C0Q24 c0q244 = ((C0Q22) ajS42S0200000_10.l0).LIZLLL;
            if (c0q244 == null || (searchResultId2 = c0q244.getSearchResultId()) == null) {
                searchResultId2 = "";
            }
            jSONObject.put("search_result_id", searchResultId2);
            jSONObject.put("list_item_id", ((Product) ajS42S0200000_10.l1).productId);
            jSONObject.put("source_page_type", "general_search");
            jSONObject.put("entrance_info", C786410Ut5.J3(jSONObject));
            C646000PVm c646000PVm = C650950Pg5.Companion;
            View view2 = ((C0Q22) ajS42S0200000_10.l0).LIZIZ;
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view2);
            if (c650960Pg6LJI == null || (c664000Q2s = c650960Pg6LJI.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                str = "";
            }
            jSONObject.put("search_entrance", str);
            String string = null;
            if (((Boolean) C0A6W.LIZ.getValue()).booleanValue()) {
                JSONObject jSONObject2 = new JSONObject();
                String str6 = product.title;
                if (str6 != null && C123100dR.LIZ(str6)) {
                    jSONObject2.put("title", str6);
                }
                String str7 = product.formatPrice;
                if (C123100dR.LIZ(str7) && str7 != null) {
                    jSONObject2.put("price", str7);
                }
                List<String> list = product.imgUrlList;
                if (list != null) {
                    str3 = (String) C13LP.LJJJLL(list);
                } else {
                    str3 = null;
                }
                if (C123100dR.LIZ(str3) && str3 != null) {
                    jSONObject2.put("cover", str3);
                }
                Long l = product.productId;
                if (l != null) {
                    jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, l.longValue());
                }
                String strJ3 = C786410Ut5.J3(jSONObject2);
                InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(context);
                str2 = "ec_general_search_user_showcase_card_product";
                interfaceC1870830ymfLIZ.LJIIIIZZ(strJ3, "ec_general_search_user_showcase_card_product");
            } else {
                str2 = null;
            }
            HashMap mapLJI = C2097608Jq.LJI(new Pair("fullScreen", "true"));
            if (str2 != null) {
                mapLJI.put("pdp_cache_key", str2);
            }
            Uri uriLIZ = C2818017g.LIZ(str5, strCreateJumpSourceBtmToken, jSONObject, mapLJI);
            if (uriLIZ != null) {
                string = uriLIZ.toString();
            }
            ((C0Q22) ajS42S0200000_10.l0).LIZJ("search_result_click", new AwS589S0100000_10((Product) ajS42S0200000_10.l1, 4));
            ((C0Q22) ajS42S0200000_10.l0).LIZIZ("tiktokec_product_click", AFwS241S0000000_10.get$arr$(4));
            Context context2 = ((C0Q22) ajS42S0200000_10.l0).LIZIZ.getContext();
            if (string != null) {
                str4 = string;
            }
            SmartRouter.buildRoute(context2, str4).open();
        }
    }

    public static final void LIZ$1(AjS42S0200000_10 ajS42S0200000_10, View view) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        boolean z;
        boolean z2;
        String string;
        String string2;
        if (view != null) {
            final EcSearchBarEllipsisAssem ecSearchBarEllipsisAssem = (EcSearchBarEllipsisAssem) ajS42S0200000_10.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ecSearchBarEllipsisAssem.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
                if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                final String strLJJJZ = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJJZ();
                String str = "";
                if (strLJJJZ != null) {
                    Context context2 = ecSearchBarEllipsisAssem.getContext();
                    if (context2 == null || (string2 = context2.getString(2131834618)) == null) {
                        string2 = "";
                    }
                    C1360520lVa c1360520lVa = new C1360520lVa();
                    c1360520lVa.LIZLLL(string2);
                    C444910HcX c444910HcX = new C444910HcX(c1360520lVa.LIZ);
                    c444910HcX.LIZ(42);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_pen_on_doc;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv.getState(), new C687020QxA(c444910HcX, c419910GdJ, new View.OnClickListener() { // from class: X.0QVO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C0QVH c0qvhBf;
                            C0QVP c0qvpZm;
                            String str2;
                            String str3;
                            String str4;
                            View view3 = ecSearchBarEllipsisAssem.LLIZLLLIL;
                            if (view3 != null) {
                                String str5 = TuxSheet._pnsPageId;
                                C1391190mJ3.LJ(view3, C343970De7.LIZ);
                            }
                            EcSearchBarEllipsisAssem ecSearchBarEllipsisAssem2 = ecSearchBarEllipsisAssem;
                            Context context3 = ecSearchBarEllipsisAssem2.getContext();
                            String str6 = strLJJJZ;
                            String string3 = null;
                            ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchBarEllipsisAssem2), ISearchBarContextAbility.class, null);
                            if (iSearchBarContextAbility != null) {
                                c0qvhBf = iSearchBarContextAbility.Bf();
                            } else {
                                c0qvhBf = null;
                            }
                            ISearchBarContextAbility iSearchBarContextAbility2 = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchBarEllipsisAssem2), ISearchBarContextAbility.class, null);
                            if (iSearchBarContextAbility2 != null) {
                                c0qvpZm = iSearchBarContextAbility2.Zm();
                            } else {
                                c0qvpZm = null;
                            }
                            Pair[] pairArr = new Pair[5];
                            if (c0qvpZm != null) {
                                str2 = c0qvpZm.LIZ;
                            } else {
                                str2 = null;
                            }
                            pairArr[0] = new Pair("search_id", str2);
                            pairArr[1] = new Pair("search_type", "shop");
                            if (c0qvpZm != null) {
                                str3 = c0qvpZm.LIZJ;
                            } else {
                                str3 = null;
                            }
                            pairArr[2] = new Pair("search_keyword", str3);
                            if (c0qvhBf != null) {
                                str4 = c0qvhBf.LIZ;
                            } else {
                                str4 = null;
                            }
                            pairArr[3] = new Pair("enter_from", str4);
                            pairArr[4] = new Pair("text_type", "panel_filter_search_feedback");
                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                            Uri uri = UriProtector.parse(str6);
                            if (uri != null) {
                                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                                Uri.Builder builderBuildUpon = uri.buildUpon();
                                if (builderBuildUpon != null) {
                                    for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                                        if (!queryParameterNames.contains(entry.getKey())) {
                                            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                                        }
                                    }
                                    Uri uriBuild = builderBuildUpon.build();
                                    if (uriBuild != null) {
                                        string3 = uriBuild.toString();
                                    }
                                }
                            }
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context3, "aweme://webview/");
                            smartRouteBuildRoute.withParam("url", string3);
                            smartRouteBuildRoute.withParam("hide_nav_bar", "1");
                            smartRouteBuildRoute.open();
                        }
                    }, z));
                }
                if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((Number) C275320Aqg.LIZ.getValue()).intValue() == 1 && ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                    ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchBarEllipsisAssem), ISearchBarContextAbility.class, null);
                    if (iSearchBarContextAbility != null) {
                        iSearchBarContextAbility.Bf();
                    }
                    ISearchBarContextAbility iSearchBarContextAbility2 = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchBarEllipsisAssem), ISearchBarContextAbility.class, null);
                    if (iSearchBarContextAbility2 != null) {
                        iSearchBarContextAbility2.Zm();
                    }
                    Context context3 = ecSearchBarEllipsisAssem.getContext();
                    if (context3 != null && (string = context3.getString(2131839216)) != null) {
                        str = string;
                    }
                    C1360520lVa c1360520lVa2 = new C1360520lVa();
                    c1360520lVa2.LIZLLL(str);
                    C444910HcX c444910HcX2 = new C444910HcX(c1360520lVa2.LIZ);
                    c444910HcX2.LIZ(42);
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_personalization;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv.getState(), new C687020QxA(c444910HcX2, c419910GdJ2, new ACListenerS145S0100000_10(ecSearchBarEllipsisAssem, 95), z2));
                }
            }
            TuxSheet tuxSheet = (TuxSheet) ajS42S0200000_10.l1;
            if (tuxSheet != null && tuxSheet.isAdded()) {
                return;
            }
            TuxSheet tuxSheet2 = (TuxSheet) ajS42S0200000_10.l1;
            if (tuxSheet2 != null && tuxSheet2.isVisible()) {
                return;
            }
            EcSearchBarEllipsisAssem ecSearchBarEllipsisAssem2 = (EcSearchBarEllipsisAssem) ajS42S0200000_10.l0;
            if (ecSearchBarEllipsisAssem2.LLJI || (context = ecSearchBarEllipsisAssem2.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                return;
            }
            ((EcSearchBarEllipsisAssem) ajS42S0200000_10.l0).Go(Lifecycle.State.STARTED);
            TuxSheet tuxSheet3 = (TuxSheet) ajS42S0200000_10.l1;
            if (tuxSheet3 != null) {
                tuxSheet3.show(supportFragmentManager, "ellipsis");
            }
            ((EcSearchBarEllipsisAssem) ajS42S0200000_10.l0).LLJI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(g1c.AjS42S0200000_10 r46, android.view.View r47) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS42S0200000_10.LIZ$2(g1c.AjS42S0200000_10, android.view.View):void");
    }

    public static final void LIZ$3(AjS42S0200000_10 ajS42S0200000_10, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        String str5;
        ISearchContextAbility iSearchContextAbilityLIZ2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (view != null) {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("entrance_form", "search_pure_goods_card");
            View view2 = ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJJLIIIJLLLLLLLZ;
            String str6 = "";
            if (view2 == null || (iSearchContextAbilityLIZ2 = C0Q3E.LIZ(view2)) == null || (c0pcyPh1 = iSearchContextAbilityLIZ2.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLILLL) == null) {
                str = "";
            }
            linkedHashMap.put("search_id", str);
            String str7 = ((C643110PKj) ajS42S0200000_10.l0).LLILLL;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap.put("search_result_id", str7);
            ShopStruct shopStruct = ((C643110PKj) ajS42S0200000_10.l0).LL.productInfo;
            if (shopStruct == null || (str2 = shopStruct.productIdStr) == null) {
                str2 = "";
            }
            linkedHashMap.put("list_item_id", str2);
            linkedHashMap.put("enter_from", "general_search");
            ShopStruct shopStruct2 = ((C643110PKj) ajS42S0200000_10.l0).LL.productInfo;
            if (shopStruct2 == null || (str3 = shopStruct2.productIdStr) == null) {
                str3 = "";
            }
            linkedHashMap.put("product_id", str3);
            linkedHashMap.put("source_page_type", "general_search");
            linkedHashMap.put("enter_from_info", "general_search");
            View view3 = ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJJLIIIJLLLLLLLZ;
            if (view3 != null && (iSearchContextAbilityLIZ = C0Q3E.LIZ(view3)) != null && (c0pcyWw1 = iSearchContextAbilityLIZ.Ww1()) != null && (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) != null && (str5 = c663990Q2r.LL) != null) {
                str6 = str5;
            }
            linkedHashMap.put("search_entrance", str6);
            ISearchContextAbility iSearchContextAbilityLIZ3 = null;
            iEcomSearchService.LJJLIIJ(view, "c4849", "d0", linkedHashMap, null);
            ShopStruct shopStruct3 = ((C643110PKj) ajS42S0200000_10.l0).LL.productInfo;
            if (shopStruct3 != null && (str4 = shopStruct3.schema) != null) {
                SmartRouter.buildRoute(((EcSearchProductCardAssem) ajS42S0200000_10.l1).getContext(), C011J.LIZ(UriProtector.parse(str4), "fullScreen", "true").toString()).open();
                View view4 = ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJJLIIIJLLLLLLLZ;
                ISearchContextAbility iSearchContextAbilityLIZ4 = null;
                if (view4 != null) {
                    iSearchContextAbilityLIZ3 = C0Q3E.LIZ(view4);
                }
                C643110PKj c643110PKj = ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJL;
                Map mapLIZ = C663060Pzc.LIZ(iSearchContextAbilityLIZ3, c643110PKj);
                C663060Pzc.LIZJ(mapLIZ, iSearchContextAbilityLIZ3, c643110PKj);
                C1018703yb.LIZIZ("search_result_click", mapLIZ);
                View view5 = ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJJLIIIJLLLLLLLZ;
                if (view5 != null) {
                    iSearchContextAbilityLIZ4 = C0Q3E.LIZ(view5);
                }
                Map mapLIZ2 = C663060Pzc.LIZ(iSearchContextAbilityLIZ4, ((EcSearchProductCardAssem) ajS42S0200000_10.l1).LLJL);
                C663060Pzc.LIZIZ(mapLIZ2, iSearchContextAbilityLIZ4);
                C1018703yb.LIZIZ("tiktokec_product_click", mapLIZ2);
            }
        }
    }

    public static final void LIZ$4(AjS42S0200000_10 ajS42S0200000_10, View view) {
        String str;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) ajS42S0200000_10.l0;
            C661010PwJ c661010PwJ = ((EcStoreLiveV2Assem) ajS42S0200000_10.l1).LLJZIJLIL;
            if (c661010PwJ == null || (searchMixFeedBase = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.docId) == null) {
                str = "";
            }
            C662810PzD.LIZJ(linearLayout, str);
            ((EcStoreLiveV2Assem) ajS42S0200000_10.l1).zp(true, null, null);
            C662860PzI.LJI(PageFinder.via((View) ajS42S0200000_10.l0), C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS42S0200000_10.l1), null, ((EcStoreLiveV2Assem) ajS42S0200000_10.l1).LLJZIJLIL, "a2270.b6880.c3812.d4738_w6322");
        }
    }

    public static final void LIZ$5(AjS42S0200000_10 ajS42S0200000_10, View view) throws JSONException {
        Context context;
        C0QUT c0qutBo2;
        Map<String, Object> mapLIZ;
        String strInvoke;
        String str;
        C0QUT c0qutBo22;
        String strLJ;
        if (view != null && (context = ((View) ajS42S0200000_10.l0).getContext()) != null) {
            IEcSearchPageStateObserveAbility iEcSearchPageStateObserveAbilityHo = ((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1).Ho();
            if (iEcSearchPageStateObserveAbilityHo != null) {
                c0qutBo2 = iEcSearchPageStateObserveAbilityHo.bo2();
            } else {
                c0qutBo2 = null;
            }
            C674510Qcz c674510Qcz = ((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1).LLJILJILJ;
            if (c674510Qcz != null) {
                mapLIZ = c674510Qcz.LIZ();
            } else {
                mapLIZ = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_method", "fixed");
            linkedHashMap.put("search_entrance_type", C674620QdA.LJ(c0qutBo2));
            if (mapLIZ != null) {
                linkedHashMap.putAll(mapLIZ);
            }
            C1421105hJ.LIZJ("ai_search_keyboard_fixed_click", linkedHashMap);
            C674480Qcw c674480Qcw = C674480Qcw.LIZ;
            C0QPI c0qpi = (C0QPI) ((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1).LLIZLLLIL.getValue();
            if (c0qpi == null || (strInvoke = c0qpi.LL.invoke()) == null) {
                strInvoke = "";
            }
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c87517.d77691", PageFinder.via(C724240Sb0.LJI((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1)), null);
            EcSearchAIFloatingButtonAssem ecSearchAIFloatingButtonAssem = (EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1;
            C674510Qcz c674510Qcz2 = ecSearchAIFloatingButtonAssem.LLJILJILJ;
            if (c674510Qcz2 != null) {
                str = c674510Qcz2.LIZ;
            } else {
                str = null;
            }
            IEcSearchPageStateObserveAbility iEcSearchPageStateObserveAbilityHo2 = ecSearchAIFloatingButtonAssem.Ho();
            if (iEcSearchPageStateObserveAbilityHo2 != null) {
                c0qutBo22 = iEcSearchPageStateObserveAbilityHo2.bo2();
            } else {
                c0qutBo22 = null;
            }
            C0QER c0qerLIZJ = C640270P9l.LIZJ(C724240Sb0.LJI((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1), C724240Sb0.LIZ((EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1));
            c674480Qcw.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op_type", 1);
            jSONObject.put("enter_source", 1);
            jSONObject.put("entry_time", System.currentTimeMillis());
            String strJ3 = C786410Ut5.J3(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("typewriter_effect", 1);
            jSONObject2.put("input_content", strInvoke);
            if (c0qerLIZJ != null) {
                jSONObject2.put("root_enter_from_type", c0qerLIZJ.getEcSearchEntranceValue());
            }
            String strJ32 = C786410Ut5.J3(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("search_entrance", C0QR7.LJ(c0qerLIZJ));
            jSONObject3.put("enter_method", "fixed");
            if (c0qutBo22 != null) {
                strLJ = C674620QdA.LJ(c0qutBo22);
            } else {
                strLJ = null;
            }
            jSONObject3.put("search_entrance_type", strLJ);
            if (str != null) {
                jSONObject3.put("ai_session_id", str);
            }
            SmartRouter.buildRoute(context, C1976807ok.LIZ(UriProtector.parse("aweme://ec/ai_search?"), new Pair("requestParams", strJ3), new Pair("trackParams", C786410Ut5.J3(jSONObject3)), new Pair("featureParams", strJ32), new Pair("source_btm_token", strCreateJumpSourceBtmToken), new Pair("disableNativePreRequest", "1")).toString()).open();
            EcSearchAIFloatingButtonAssem ecSearchAIFloatingButtonAssem2 = (EcSearchAIFloatingButtonAssem) ajS42S0200000_10.l1;
            C674510Qcz c674510Qcz3 = ecSearchAIFloatingButtonAssem2.LLJILJILJ;
            if (c674510Qcz3 != null) {
                c674510Qcz3.LIZIZ = false;
                c674510Qcz3.LIZJ = null;
            }
            ecSearchAIFloatingButtonAssem2.LLJJ = true;
        }
    }

    public static final void LIZ$6(AjS42S0200000_10 ajS42S0200000_10, View view) throws JSONException {
        Aweme aweme;
        String str;
        User user;
        Object obj;
        Object objValueOf;
        Object obj2;
        Object uid;
        Object obj3;
        Object requestId;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str2;
        SearchMixFeedBase searchMixFeedBase2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct2;
        List<EComShopLabel> list;
        SearchMixFeedBase searchMixFeedBase4;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase9;
        EComShopCardStruct eComShopCardStruct7;
        Aweme aweme2;
        SearchMixFeedBase searchMixFeedBase10;
        EComShopCardStruct eComShopCardStruct8;
        if (view != null) {
            EComShopCardStruct eComShopCardStruct9 = ((InterfaceC655260Pn2) ajS42S0200000_10.l0).LJJIIZ().shopCard;
            EComShopCardStruct eComShopCardStruct10 = null;
            if (eComShopCardStruct9 != null) {
                aweme = eComShopCardStruct9.liveEntity;
            } else {
                aweme = null;
            }
            if (aweme != null) {
                EcStoreInfoAssem ecStoreInfoAssem = (EcStoreInfoAssem) ajS42S0200000_10.l1;
                C661010PwJ c661010PwJ = ecStoreInfoAssem.LLLFF;
                String str3 = "";
                if (c661010PwJ == null || (searchMixFeedBase10 = c661010PwJ.LL) == null || (eComShopCardStruct8 = searchMixFeedBase10.shopCard) == null || (str = eComShopCardStruct8.docId) == null) {
                    str = "";
                }
                C662810PzD.LIZIZ(view, str);
                C661010PwJ c661010PwJ2 = ecStoreInfoAssem.LLLFF;
                if (c661010PwJ2 != null && (searchMixFeedBase9 = c661010PwJ2.LL) != null && (eComShopCardStruct7 = searchMixFeedBase9.shopCard) != null && (aweme2 = eComShopCardStruct7.liveEntity) != null) {
                    C0Q3E.LIZJ(aweme2).fe(new C655220Pmy(new AwS586S0100000_7(view, 590)));
                    SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecStoreInfoAssem), SearchServiceCenter$NavigateAbility.class, null);
                    if (searchServiceCenter$NavigateAbility != null) {
                        searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL(ecStoreInfoAssem), aweme2, null, false, null, null);
                    }
                }
                C661010PwJ c661010PwJ3 = ecStoreInfoAssem.LLLFF;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(ecStoreInfoAssem);
                PageFinder pageFinderVia = PageFinder.via(view);
                if (c661010PwJ3 != null && (searchMixFeedBase8 = c661010PwJ3.LL) != null && (eComShopCardStruct6 = searchMixFeedBase8.shopCard) != null) {
                    user = eComShopCardStruct6.userInfo;
                } else {
                    user = null;
                }
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
                jSONObject.put("enter_from", "general_search");
                if (c661010PwJ3 == null || (searchMixFeedBase7 = c661010PwJ3.LL) == null || (eComShopCardStruct5 = searchMixFeedBase7.shopCard) == null || (obj = eComShopCardStruct5.docId) == null) {
                    obj = "";
                }
                jSONObject.put("search_result_id", obj);
                jSONObject.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
                if (user != null) {
                    objValueOf = Integer.valueOf(user.getFollowerStatus());
                } else {
                    objValueOf = null;
                }
                jSONObject.put("follow_status", objValueOf);
                jSONObject.put("search_type", "general");
                if (c661010PwJ3 == null || (searchMixFeedBase6 = c661010PwJ3.LL) == null || (eComShopCardStruct4 = searchMixFeedBase6.shopCard) == null || (obj2 = eComShopCardStruct4.roomId) == null) {
                    obj2 = "";
                }
                jSONObject.put("list_item_id", obj2);
                jSONObject.put("enter_from_merge", "general_search");
                jSONObject.put("enter_method", "others_photo");
                jSONObject.put("action_type", "click");
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                jSONObject.put("anchor_id", uid);
                if (c661010PwJ3 == null || (searchMixFeedBase5 = c661010PwJ3.LL) == null || (eComShopCardStruct3 = searchMixFeedBase5.shopCard) == null || (obj3 = eComShopCardStruct3.roomId) == null) {
                    obj3 = "";
                }
                jSONObject.put("room_id", obj3);
                if (c661010PwJ3 != null && (searchMixFeedBase4 = c661010PwJ3.LL) != null) {
                    requestId = searchMixFeedBase4.getRequestId();
                } else {
                    requestId = null;
                }
                jSONObject.put("request_id", requestId);
                jSONObject.put("is_ecom", 1);
                jSONObject.put("aladdin_button_type", "click_info");
                jSONObject.put("page_name", "general_search");
                JSONArray jSONArray = new JSONArray();
                if (c661010PwJ3 != null && (searchMixFeedBase3 = c661010PwJ3.LL) != null && (eComShopCardStruct2 = searchMixFeedBase3.shopCard) != null && (list = eComShopCardStruct2.shopLabels) != null) {
                    int i = 0;
                    for (EComShopLabel eComShopLabel : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("position", i);
                            jSONObject2.put("tag", eComShopLabel.type);
                            jSONArray.put(jSONObject2);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                jSONObject.put("shop_label", jSONArray);
                if (c661010PwJ3 != null) {
                    C662860PzI.LIZIZ(jSONObject, c661010PwJ3);
                }
                jSONObject.put("end_to_end_search_session_id", C0QES.LIZ(C0QES.LIZ, null, false, 7));
                c1507790pL7.getClass();
                C1507790pL7.LJ("search_result_click", jSONObject, "a2270.b6880.c3812.d0", pageFinderVia);
                C662860PzI.LJFF(ecStoreInfoAssem.LLLFF, C1558520qew.LJIIL(ecStoreInfoAssem), PageFinder.via(view));
                C661010PwJ c661010PwJ4 = ecStoreInfoAssem.LLLFF;
                if (c661010PwJ4 != null && (searchMixFeedBase2 = c661010PwJ4.LL) != null) {
                    eComShopCardStruct10 = searchMixFeedBase2.shopCard;
                }
                if (C662850PzH.LJ(eComShopCardStruct10) && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null) {
                    C661010PwJ c661010PwJ5 = ecStoreInfoAssem.LLLFF;
                    if (c661010PwJ5 != null && (searchMixFeedBase = c661010PwJ5.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str2 = eComShopCardStruct.shopId) != null) {
                        str3 = str2;
                    }
                    InterfaceC662780PzA interfaceC662780PzALJIJI = interfaceC657510PqfLIZLLL.LJIJI(str3, false, null);
                    if (interfaceC662780PzALJIJI != null) {
                        interfaceC662780PzALJIJI.LJIL(C0Q1G.SOURCE);
                        return;
                    }
                    return;
                }
                return;
            }
            ((EcStoreInfoAssem) ajS42S0200000_10.l1).Ap(view, "click_info", "goods_click_photo");
        }
    }

    public static final void LIZ$7(AjS42S0200000_10 ajS42S0200000_10, final View view) {
        String str;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str2;
        SearchMixFeedBase searchMixFeedBase2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct2;
        Aweme aweme;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct3;
        if (view != null) {
            EComShopCardStruct eComShopCardStruct4 = ((InterfaceC655260Pn2) ajS42S0200000_10.l0).LJJIIZ().shopCard;
            EComShopCardStruct eComShopCardStruct5 = null;
            if (eComShopCardStruct4 != null && eComShopCardStruct4.liveEntity != null) {
                final EcStoreInfoV2Assem ecStoreInfoV2Assem = (EcStoreInfoV2Assem) ajS42S0200000_10.l1;
                C661010PwJ c661010PwJ = ecStoreInfoV2Assem.LLLFF;
                String str3 = "";
                if (c661010PwJ == null || (searchMixFeedBase4 = c661010PwJ.LL) == null || (eComShopCardStruct3 = searchMixFeedBase4.shopCard) == null || (str = eComShopCardStruct3.docId) == null) {
                    str = "";
                }
                C662810PzD.LIZIZ(view, str);
                C661010PwJ c661010PwJ2 = ecStoreInfoV2Assem.LLLFF;
                if (c661010PwJ2 != null && (searchMixFeedBase3 = c661010PwJ2.LL) != null && (eComShopCardStruct2 = searchMixFeedBase3.shopCard) != null && (aweme = eComShopCardStruct2.liveEntity) != null) {
                    C0Q3E.LIZJ(aweme).fe(new C655220Pmy(new AwS376S0200000_10(view, ecStoreInfoV2Assem, 161)));
                    SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecStoreInfoV2Assem), SearchServiceCenter$NavigateAbility.class, null);
                    if (searchServiceCenter$NavigateAbility != null) {
                        searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL(ecStoreInfoV2Assem), aweme, new InterfaceC645880PVa(view, ecStoreInfoV2Assem) { // from class: X.0Pz0
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

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return Intrinsics.LJFF(interfaceC1891350zJl, this);
                            }

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return Intrinsics.LJFF(interfaceC1891350zJl, this);
                            }

                            {
                                this.LL = new C650430PfF(new AwS376S0200000_10(view, ecStoreInfoV2Assem, 160));
                            }
                        }, false, null, null);
                    }
                }
                C662860PzI.LJFF(ecStoreInfoV2Assem.LLLFF, C1558520qew.LJIIL(ecStoreInfoV2Assem), PageFinder.via(view));
                C661010PwJ c661010PwJ3 = ecStoreInfoV2Assem.LLLFF;
                if (c661010PwJ3 != null && (searchMixFeedBase2 = c661010PwJ3.LL) != null) {
                    eComShopCardStruct5 = searchMixFeedBase2.shopCard;
                }
                if (C662850PzH.LJ(eComShopCardStruct5) && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null) {
                    C661010PwJ c661010PwJ4 = ecStoreInfoV2Assem.LLLFF;
                    if (c661010PwJ4 != null && (searchMixFeedBase = c661010PwJ4.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str2 = eComShopCardStruct.shopId) != null) {
                        str3 = str2;
                    }
                    InterfaceC662780PzA interfaceC662780PzALJIJI = interfaceC657510PqfLIZLLL.LJIJI(str3, false, null);
                    if (interfaceC662780PzALJIJI != null) {
                        interfaceC662780PzALJIJI.LJIL(C0Q1G.SOURCE);
                        return;
                    }
                    return;
                }
                return;
            }
            ((EcStoreInfoV2Assem) ajS42S0200000_10.l1).zp(view, "click_info", "goods_click_photo");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS42S0200000_10(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
