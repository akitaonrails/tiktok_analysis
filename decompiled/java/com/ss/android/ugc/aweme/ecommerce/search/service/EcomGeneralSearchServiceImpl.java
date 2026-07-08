package com.ss.android.ugc.aweme.ecommerce.search.service;

import X.C03H5;
import X.C05DO;
import X.C05DP;
import X.C077I;
import X.C07L9;
import X.C09AE;
import X.C0A6U;
import X.C0PEM;
import X.C0PQG;
import X.C0PQI;
import X.C0PQR;
import X.C0PQW;
import X.C0PQX;
import X.C0PR3;
import X.C0PRC;
import X.C0PUO;
import X.C0Q3E;
import X.C11H6;
import X.C11H7;
import X.C1202104n5;
import X.C123100dR;
import X.C137100fh;
import X.C137200fi;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1507790pL7;
import X.C1842007Ji;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2327809Ae;
import X.C293650Bf9;
import X.C294610Bgh;
import X.C299440BoU;
import X.C301860BsO;
import X.C301870BsP;
import X.C645630PUb;
import X.C645680PUg;
import X.C646340PWu;
import X.C650500PfM;
import X.C654590Plx;
import X.C655440PnK;
import X.C656620PpE;
import X.C661010PwJ;
import X.C662730Pz5;
import X.C673460QbI;
import X.C680920QnK;
import X.C682630Qq5;
import X.EnumC645610PTz;
import X.EnumC646330PWt;
import X.EnumC657940PrM;
import X.InterfaceC594520NTm;
import X.InterfaceC653600PkM;
import X.InterfaceC655050Pmh;
import X.InterfaceC662740Pz6;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.general.SearchLiveDynamicBottomAnchorAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.SearchProductAnchorAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.SearchProductAnchorAssemV2;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreNoLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomGeneralSearchServiceImpl implements IEcomGeneralSearchService {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ() {
        return C13LE.LIZ(SearchProductAnchorAssemV2.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIL() {
        return C13LE.LIZ(SearchLiveDynamicBottomAnchorAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJIJIIJIL() {
        return C13LE.LIZ(SearchProductAnchorAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C19719912Dl LJJIJIL() {
        return C13LE.LIZ(C0PQI.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final List<?> LIZIZ() {
        return Collections.singletonList(C680920QnK.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ISearchShowcaseEntranceProvider LIZJ() {
        return new ISearchShowcaseEntranceProvider() { // from class: X.0PUf
            @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider
            public final Integer getLayoutResId() {
                return Integer.valueOf(R.layout.f0k);
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider
            public final InterfaceC653620PkO getSearchShowcaseEntranceView(ViewGroup viewGroup) {
                return new C0Q23(viewGroup);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC653600PkM LIZLLL() {
        return new InterfaceC653600PkM() { // from class: X.0PUd
            @Override // X.InterfaceC653600PkM
            public final void getLayoutId() {
            }

            @Override // X.InterfaceC653600PkM
            public final C0Q21 LIZ(ViewGroup viewGroup) {
                return new C0Q21(viewGroup);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJFF() {
        ((Boolean) C137100fh.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJII() {
        return ((Boolean) C077I.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C0PR3 LJIILJJIL() {
        return new C0PQW();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C11H7<Integer, String, EnumC645610PTz> LJIJI() {
        C0PUO.LIZ.getClass();
        C11H6<Integer, String, EnumC645610PTz, C09AE> c11h6 = C0PUO.LIZJ;
        if (c11h6 != null) {
            return new C11H7<>(c11h6.LIZ, c11h6.LIZIZ, c11h6.LIZJ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIJJ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05DO(10, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIJJLI() {
        return ((Boolean) C137200fi.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ITopLiveProductViewProvider LJJI() {
        return new ITopLiveProductViewProvider() { // from class: X.0Pod
            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final String getAnchorInfo() {
                return "search_live_merge_entrance";
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final String getCouponTypeKey() {
                return "coupon_type";
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final boolean shouldShow() {
                return C0BT5.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final String getCouponType(Aweme aweme) {
                List<Product> productsInfo;
                Product product;
                if (aweme != null && (productsInfo = aweme.getProductsInfo()) != null && (product = (Product) C13LP.LJJJLL(productsInfo)) != null) {
                    return C656160PoU.LIZ(product);
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final ITopLiveProductView getTopLiveProductView(ViewGroup viewGroup) {
                if (C0BT3.LIZ() == 8) {
                    return new C0Q29(viewGroup.getContext(), null, 14);
                }
                return new C0QAZ(viewGroup.getContext(), C0BT3.LIZ(), null, 22);
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final void addBagIconIfNeed(LinearLayout linearLayout, Boolean bool, boolean z) {
                double d;
                if (linearLayout != null) {
                    C786410Ut5.LJJL(linearLayout.findViewById(R.id.mu4), linearLayout);
                    if (Intrinsics.LJFF(bool, Boolean.TRUE) && C0C64.LJIILLIIL().LJIJ(31744, 0, "show_live_large_card_shop_icon", true) == 1) {
                        if (z) {
                            d = 14.0d;
                        } else {
                            d = 12.0d;
                        }
                        TuxIconView tuxIconView = new TuxIconView(linearLayout.getContext(), null, 0, 6, null);
                        tuxIconView.setId(R.id.mu4);
                        tuxIconView.setIconRes(R.raw.icon_bag_fill);
                        tuxIconView.setTintColorRes(R.attr.ee);
                        tuxIconView.setIconHeight(C341940Daq.LIZ(d));
                        tuxIconView.setIconWidth(C341940Daq.LIZ(d));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginEnd(C341940Daq.LIZ(2.0d));
                        layoutParams.gravity = 17;
                        linearLayout.addView(tuxIconView, 0, layoutParams);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final Map<String, Object> getEcomParams(String str, Boolean bool, Map<String, Object> map) {
                boolean z;
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                String strLJJIFFI = "";
                if (!z) {
                    try {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "bundle");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                            strLJJIFFI = u.LJJIFFI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "/template.js", "", false);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (a0.LJJIIZI(strLJJIFFI, "on-live-single", false)) {
                    if (bool != null) {
                        map.put("has_ecom_intent", Boolean.valueOf(bool.booleanValue()));
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_user_merge_card_product_entrance", true) == 1) {
                        map.put("show_user_merge_card_product_entrance", 1);
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_user_merge_card_shop_icon", true) == 1) {
                        map.put("show_user_merge_card_shop_icon", 1);
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_user_single_card_product_entrance", true) == 1) {
                        map.put("show_user_single_card_product_entrance", 1);
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_user_single_card_shop_icon", true) == 1) {
                        map.put("show_user_single_card_shop_icon", 1);
                    }
                }
                return map;
            }

            @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
            public final EnterRoomConfig prepareEcLiveExtraArgs(EnterRoomConfig enterRoomConfig, String str, String str2) {
                long j;
                EnterRoomConfig.ECWrapData eCWrapData;
                EnterRoomConfig.RoomsData roomsData;
                EnterRoomConfig.RoomsData roomsData2;
                EnterRoomConfig.ECWrapData eCWrapData2;
                HashMap<String, String> map;
                String str3;
                if (str != null) {
                    try {
                        if (((Boolean) C276270AsD.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(str2, "hot_user") && enterRoomConfig != null && (eCWrapData2 = enterRoomConfig.mECData) != null && (map = eCWrapData2.ecCommonExtraParam) != null) {
                            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                            if (logData == null || (str3 = logData.list_item_id) == null) {
                                str3 = "";
                            }
                            map.put("list_item_id", str3);
                        }
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString("room_id");
                        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
                            j = roomsData2.roomId;
                        } else {
                            j = 0;
                        }
                        if (!Intrinsics.LJFF(strOptString, String.valueOf(j))) {
                            return enterRoomConfig;
                        }
                        String strOptString2 = jSONObject.optString("live_auto_route_schema");
                        if (C123100dR.LIZ(strOptString2)) {
                            Uri.Builder builderBuildUpon = UriProtector.parse(strOptString2).buildUpon();
                            builderBuildUpon.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()));
                            String string = builderBuildUpon.toString();
                            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                                roomsData.extraSchema = string;
                            }
                            return enterRoomConfig;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("product_bag_extra");
                        if (jSONObjectOptJSONObject != null) {
                            if (enterRoomConfig != null) {
                                EnterRoomConfig.ECWrapData eCWrapData3 = enterRoomConfig.mECData;
                                if (eCWrapData3 != null) {
                                    eCWrapData3.autoOpenProductBag = jSONObjectOptJSONObject.optInt("auto_open_product_bag", 0);
                                }
                                EnterRoomConfig.ECWrapData eCWrapData4 = enterRoomConfig.mECData;
                                if (eCWrapData4 != null) {
                                    eCWrapData4.autoOpenProductBagTrackParams = jSONObjectOptJSONObject.optString("auto_open_product_bag_track_params");
                                }
                            }
                            String strOptString3 = jSONObjectOptJSONObject.optString("product_bag_page_params");
                            if (C123100dR.LIZ(strOptString3) && strOptString3 != null && enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null) {
                                eCWrapData.productBagPageParams = strOptString3;
                            }
                        }
                        return enterRoomConfig;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return enterRoomConfig;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C0PR3 LJJIJL() {
        if (((Boolean) C077I.LIZ.getValue()).booleanValue()) {
            return new C0PQR();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final Integer LJJIIJ() {
        return Integer.valueOf(R.id.ggt);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LIZ(Product product) {
        return C656620PpE.LIZ(product);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJ(SearchResultParam searchResultParam) {
        if (!C650500PfM.LIZJ(searchResultParam.getSearchEnterParam()) && ((Boolean) C137100fh.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C673460QbI(null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC594520NTm LJIIIIZZ(C0PQX c0pqx) {
        return new C0PQI(c0pqx);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIIL(Product product) {
        if (product != null && C293650Bf9.LIZ() == 7 && ((Boolean) C0A6U.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIILLIIL(final C645630PUb c645630PUb) {
        C655440PnK c655440PnK;
        Product product = c645630PUb.LIZ;
        if (product == null || (c655440PnK = c645630PUb.LIZIZ) == null) {
            return false;
        }
        Function0<Unit> function0 = c645630PUb.LJIIJJI;
        if (function0 != null) {
            function0.invoke();
        }
        C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
        C654590Plx c654590Plx = c645630PUb.LIZJ;
        InterfaceC662740Pz6 interfaceC662740Pz6 = new InterfaceC662740Pz6() { // from class: X.0PUc
            @Override // X.InterfaceC662740Pz6
            public final String LIZ() {
                Function0<String> function02 = c645630PUb.LJIILL;
                if (function02 != null) {
                    return function02.invoke();
                }
                return null;
            }

            @Override // X.InterfaceC662740Pz6
            public final void LIZJ(Aweme aweme, C654590Plx c654590Plx2) {
                Function2<Aweme, C654590Plx, Unit> function2 = c645630PUb.LJIILJJIL;
                if (function2 != null) {
                    function2.invoke(aweme, c654590Plx2);
                }
            }

            @Override // X.InterfaceC662740Pz6
            public final void LIZLLL(Aweme aweme, C653660PkS c653660PkS, SearchCardInfo searchCardInfo) {
                InterfaceC1631620sYq<Aweme, C653660PkS, SearchCardInfo, Unit> interfaceC1631620sYq = c645630PUb.LJIIL;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(aweme, c653660PkS, searchCardInfo);
                }
            }

            @Override // X.InterfaceC662740Pz6
            public final void LIZIZ(Aweme aweme, C654590Plx c654590Plx2, EnterRoomConfig enterRoomConfig, String str) {
                InterfaceC1631630sYr<Aweme, C654590Plx, EnterRoomConfig, String, Unit> interfaceC1631630sYr = c645630PUb.LJIILIIL;
                if (interfaceC1631630sYr != null) {
                    interfaceC1631630sYr.invoke(aweme, c654590Plx2, enterRoomConfig, str);
                }
            }
        };
        String str = c645630PUb.LIZLLL;
        String str2 = c645630PUb.LJ;
        boolean z = c645630PUb.LJI;
        String str3 = c645630PUb.LJII;
        PageFinder pageFinder = c645630PUb.LJIIIIZZ;
        EnumC657940PrM enumC657940PrM = c645630PUb.LJIIIZ;
        Context context = c645630PUb.LJIIJ;
        boolean z2 = c645630PUb.LJIILLIIL;
        c662730Pz5.getClass();
        C662730Pz5.LIZ(product, c655440PnK, c654590Plx, interfaceC662740Pz6, str, str2, z, str3, pageFinder, enumC657940PrM, context, z2);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIFFI(int i) {
        if (i != 1) {
            if (i == 2) {
                C299440BoU.LIZ = false;
                return;
            }
            return;
        }
        C299440BoU.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ReusedUISlotAssem<? extends C03H5> LJJIIJZLJL(EnumC646330PWt enumC646330PWt) {
        switch (C646340PWu.LIZ[enumC646330PWt.ordinal()]) {
        }
        return new EcStoreNoLiveAssem(enumC646330PWt);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJJIJ(EnumC645610PTz enumC645610PTz) {
        Boolean bool;
        if (((Number) C1842007Ji.LIZ.getValue()).intValue() != 0 && (bool = (Boolean) ((Map) C07L9.LIZLLL.getValue()).get(enumC645610PTz.getSceneName())) != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1.contains(X.C0QXL.LIZ(r5)) == false) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> LJIIJJI(X.C0PGI r4, java.lang.String r5) {
        /*
            r3 = this;
            X.0PGI r0 = X.C0PGI.BEFORE_REQUEST_WORDS
            if (r4 != r0) goto L20
            if (r5 == 0) goto L1d
            X.01GW r0 = X.C645660PUe.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            X.0QXL r0 = X.C0QXL.LIZ
            r0.getClass()
            java.lang.String r0 = X.C0QXL.LIZ(r5)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L20
        L1d:
            X.08CX r0 = X.C08CX.INSTANCE
            return r0
        L20:
            X.01GW r1 = X.C07LB.LIZIZ
            java.lang.Object r0 = r1.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            X.13BV r0 = X.C13BV.INSTANCE
        L30:
            java.util.Set r0 = X.C13LP.LLIIJI(r0)
            return r0
        L35:
            X.0PGI r0 = X.C0PGI.FETCH
            if (r4 != r0) goto L62
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r2 = r1.iterator()
        L4c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            goto L4c
        L62:
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r4.getSceneName()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 != 0) goto L30
            X.13BV r0 = X.C13BV.INSTANCE
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.service.EcomGeneralSearchServiceImpl.LJIIJJI(X.0PGI, java.lang.String):java.util.Set");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIILL(String str, String str2) {
        if (C294610Bgh.LIZ()) {
            C682630Qq5.LIZ(null, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIJ(int i, String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05DP(i, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJJII(int i, String str) {
        Double dLJII;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "ecom_good_card_style");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                dLJII = C2327809Ae.LJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } else {
                dLJII = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C13LP.LJJJJ(dLJII, (List) C301870BsP.LIZIZ.getValue())) {
            if (!((List) C301860BsO.LIZIZ.getValue()).contains(Integer.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIILIIL(String str, String str2, String str3) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("biz_name", "related_products_card");
        linkedHashMap.put("stage", str);
        if (str2 != null && C123100dR.LIZ(str2)) {
            linkedHashMap.put("fail_reason", str2);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_ec_search_biz_show", linkedHashMap);
        int i = 1;
        if (Intrinsics.LJFF(str, "insert")) {
            C0PQR.LIZJ++;
            return;
        }
        if (!Intrinsics.LJFF(str, "fail") || Intrinsics.LJFF(str2, C0PQG.AWEME_HAS_ANCHOR.getMessage()) || Intrinsics.LJFF(str2, C0PQG.WATCH_DURATION_LESS_THAN_THRESHOLD.getMessage())) {
            return;
        }
        if (!Intrinsics.LJFF(str2, C0PQG.RS_NEXT_LINE.getMessage())) {
            if (Intrinsics.LJFF(str2, C0PQG.RELATED_PRODUCT_TOO_FEW.getMessage())) {
                i = 2;
            } else if (Intrinsics.LJFF(str2, C0PQG.PRODUCT_NEXT_LINE.getMessage())) {
                i = 3;
            } else if (Intrinsics.LJFF(str2, C0PQG.HIT_COUNT_THRESHOLD_IN_SINGLE_SEARCH.getMessage())) {
                i = 4;
            } else if (Intrinsics.LJFF(str2, C0PQG.CLICK_PRODUCT_NEXT_LINE.getMessage())) {
                i = 5;
            } else {
                i = 6;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", "general_search");
        linkedHashMap2.put("search_id", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
        linkedHashMap2.put("search_result_id", String.valueOf(str3));
        linkedHashMap2.put("reason_id", String.valueOf(i));
        C1507790pL7.LIZJ("recommend_goods_card_not_show", linkedHashMap2);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIIZI(DynamicPatch dynamicPatch, String str, Map<String, Object> map) {
        String str2;
        String strLIZIZ;
        Integer numLJIIJJI = null;
        if (dynamicPatch == null) {
            str2 = null;
        } else {
            try {
                str2 = dynamicPatch.schema;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "products_card";
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "ecom_good_card_style");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("products_card_");
        sbLIZ.append(numLJIIJJI);
        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("biz_name", strLIZIZ);
        linkedHashMap.put("stage", str);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_ec_search_biz_show", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC655050Pmh LJJIJIIJI(SearchMixFeedBase searchMixFeedBase, Aweme aweme, EnumC646330PWt enumC646330PWt) {
        return new C661010PwJ(searchMixFeedBase, aweme, enumC646330PWt);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJI(String str, String str2, String str3, String str4) {
        C645680PUg.LIZ(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIIIZ(String str, String str2, String str3, String str4) {
        C645680PUg.LIZ(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIIZ(SearchMixFeedBase searchMixFeedBase, DynamicPatch dynamicPatch, String str, String str2) {
        LJIIZILJ(searchMixFeedBase, dynamicPatch, str, str2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase r7, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L92
            int r0 = r8.getOriginType()
        L7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L16
            int r0 = r0.intValue()
            double r0 = (double) r0
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L16:
            X.01GW r0 = X.C301850BsN.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.C13LP.LJJJJ(r3, r0)
            if (r0 == 0) goto L91
            X.0pL7 r5 = X.C1507790pL7.LIZ
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "search_id"
            r2.put(r0, r10)
            java.lang.String r0 = "stage"
            r2.put(r0, r9)
            java.lang.String r4 = ""
            if (r7 == 0) goto L43
            java.lang.Integer r0 = r7.docType
            if (r0 == 0) goto L43
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L44
        L43:
            r1 = r4
        L44:
            java.lang.String r0 = "doc_type"
            r2.put(r0, r1)
            if (r7 == 0) goto L57
            int r0 = r7.feedType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L58
        L57:
            r1 = r4
        L58:
            java.lang.String r0 = "card_type"
            r2.put(r0, r1)
            if (r8 == 0) goto L6e
            int r0 = r8.getOriginType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L6e
            r4 = r0
        L6e:
            java.lang.String r0 = "origin_type"
            r2.put(r0, r4)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "type"
            r2.put(r0, r1)
            if (r11 == 0) goto L89
            int r0 = r11.length()
            if (r0 <= 0) goto L89
            java.lang.String r0 = "load_type"
            r2.put(r0, r11)
        L89:
            r5.getClass()
            java.lang.String r0 = "tiktokec_general_search_card_track"
            X.C1507790pL7.LIZJ(r0, r2)
        L91:
            return
        L92:
            if (r7 == 0) goto L16
            int r0 = r7.feedType
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.service.EcomGeneralSearchServiceImpl.LJIIZILJ(com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJ(EnumC645610PTz enumC645610PTz, String str, String str2, String str3, Boolean bool) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, enumC645610PTz.getSceneName());
        linkedHashMap.put("srcId", str);
        linkedHashMap.put("stage", str2);
        linkedHashMap.put("reason", str3);
        linkedHashMap.put("isEcom", String.valueOf(bool));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_ecom_click_search", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIII(EnumC645610PTz enumC645610PTz, String str, String str2, int i, String str3, String str4, Map<String, ? extends Object> map) {
        C0PUO.LIZ.getClass();
        if (((Number) C1842007Ji.LIZ.getValue()).intValue() != 0) {
            C0PUO.LIZLLL(enumC645610PTz, str, str2, i, str3, str4, map, true, AFwS241S0000000_10.get$arr$(487));
        } else {
            C1202104n5.LIZ().LJJ(enumC645610PTz, str2, "networkFail", "exp disable", Boolean.TRUE);
        }
    }
}
