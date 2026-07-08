package com.ss.android.ugc.aweme.iap.component.impl;

import X.AbstractC1387200mCc;
import X.AbstractC19484711Kz;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0C64;
import X.C0KOO;
import X.C11S5;
import X.C13BV;
import X.C13DA;
import X.C1541950qED;
import X.C15438062q;
import X.C1615460s8m;
import X.C1615560s8w;
import X.C1615950s9Z;
import X.C1616810sAx;
import X.C1616830sAz;
import X.C1616850sB1;
import X.C1616880sB4;
import X.C1616920sB8;
import X.C1617260sBg;
import X.C189200o6;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19EG;
import X.C2097608Jq;
import X.C2296808zG;
import X.C2536509wp;
import X.C2540209xQ;
import X.C290690BaN;
import X.C376301dB;
import X.C452501pT;
import X.C517260KQi;
import X.C518170KTv;
import X.C717310SBt;
import X.C717330SBv;
import X.C752960TgE;
import X.EnumC1615550s8v;
import X.EnumC1616780sAu;
import X.InterfaceC1554220qY0;
import X.InterfaceC1615440s8k;
import Y.ARunnableS14S1000000_23;
import Y.AfS9S0100100_24;
import android.app.Activity;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.iap.component.IPgcPaymentService;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import com.ss.android.ugc.aweme.iap.component.impl.renderer.LynxPurchasePanelSheet;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class PgcPaymentServiceImpl implements IPgcPaymentService {
    public static final Gson LIZJ = new Gson();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(193));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 586));

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final boolean LJIILJJIL() {
        return false;
    }

    public final C1616850sB1 LJIILL() {
        return (C1616850sB1) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final String getPriceRegion() {
        C1616920sB8.LIZ.getClass();
        return C1616920sB8.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final List<Class<?>> provideXBridgetIDLMethodListForLynxPrefetch() {
        return Collections.singletonList(C1617260sBg.class);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZ(Map<String, String> map) {
        C0KOO.LIZ.getClass();
        C0KOO.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZIZ(int i) {
        C1616850sB1 c1616850sB1LJIILL;
        if (C517260KQi.LIZ() && (c1616850sB1LJIILL = LJIILL()) != null) {
            c1616850sB1LJIILL.LIZLLL.remove(Integer.valueOf(i));
        }
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZJ(C1616880sB4 c1616880sB4) {
        C1616850sB1 c1616850sB1LJIILL;
        if (!C517260KQi.LIZ() || (c1616850sB1LJIILL = LJIILL()) == null) {
            return;
        }
        C1616920sB8.LIZ.getClass();
        c1616880sB4.LJ = C1616920sB8.LIZ();
        c1616850sB1LJIILL.LIZJ(c1616880sB4, true).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0sB6
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PgcPaymentServiceImpl@624d.preLoadPaywallComponent$disposable$1");
                C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.preLoadPaywallComponent$disposable$1");
            }
        }, new C09JN() { // from class: X.0sB7
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PgcPaymentServiceImpl@624d.preLoadPaywallComponent$disposable$2");
                C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.preLoadPaywallComponent$disposable$2");
            }
        });
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_preload_iap_pgc_forest", true) == 1 && !a0.LJJJIL("aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&&scene=purchase_panel&business_line=2")) {
            C11S5.LIZ().LIZIZ(new ARunnableS14S1000000_23(3));
        }
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZLLL(Object obj) {
        ProfileUser profileUser;
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        ProfileComponents next;
        List<? extends ProfileComponents> list2;
        ProfileComponents next2;
        Object c098200Yq;
        String uid;
        UserProfileInfo userProfileInfo;
        n nVarLJJIJ;
        n nVarLJJIJ2;
        k kVarLJJIIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pgc_payment_handle_profile_user", true) == 1 && C517260KQi.LIZ() && (obj instanceof ProfileUser) && (profileUser = (ProfileUser) obj) != null && (profileComponents = profileUser.headerComponents) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.componentId, "advanced_feature")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ProfileComponents profileComponents2 = next;
            if (profileComponents2 != null && (list2 = profileComponents2.components) != null) {
                Iterator<? extends ProfileComponents> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.componentName, "advanced_feature_live_subscription")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ProfileComponents profileComponents3 = next2;
                if (profileComponents3 != null) {
                    try {
                        n nVar = profileComponents3.bizData;
                        if (nVar != null && (nVarLJJIJ = nVar.LJJIJ("sub_info")) != null && (nVarLJJIJ2 = nVarLJJIJ.LJJIJ("audience_sub_info")) != null && (kVarLJJIIZ = nVarLJJIJ2.LJJIIZ("sub_status")) != null && (!(kVarLJJIIZ instanceof m))) {
                            c098200Yq = Integer.valueOf(kVarLJJIIZ.LJIIJJI());
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Integer num = (Integer) c098200Yq;
                    if (num == null || num.intValue() == 1) {
                        return;
                    }
                    ProfileCommonInfo profileCommonInfo = profileUser.common;
                    if (profileCommonInfo == null || (userProfileInfo = profileCommonInfo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                        uid = "";
                    }
                    if (uid.length() == 0) {
                        return;
                    }
                    LIZJ(new C1616880sB4(EnumC1616780sAu.SUBSCRIPTION, null, uid, "other_profile", 20));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJ(C1616880sB4 c1616880sB4) {
        C1616850sB1 c1616850sB1LJIILL;
        if (C517260KQi.LIZ() && (c1616850sB1LJIILL = LJIILL()) != null) {
            c1616850sB1LJIILL.LIZJ.remove(C1616850sB1.LIZIZ(c1616880sB4.LIZJ, c1616880sB4.LIZLLL));
        }
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJI(String str) {
        if (!C517260KQi.LIZ()) {
            return;
        }
        LIZIZ(EnumC1616780sAu.SUBSCRIPTION.getValue());
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final AbstractC19484711Kz<PaymentComponentResponse> LJIIIIZZ(C1616880sB4 c1616880sB4) {
        InterfaceC1615440s8k interfaceC1615440s8k = (InterfaceC1615440s8k) this.LIZ.getValue();
        if (interfaceC1615440s8k == null) {
            return AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("PaymentComponentApi unavailable"));
        }
        C13DA c13da = new C13DA();
        c13da.put("business_line", Integer.valueOf(c1616880sB4.LIZIZ.getValue()));
        c13da.put(Scene.SCENE_SERVICE, c1616880sB4.LIZ);
        String str = c1616880sB4.LIZLLL;
        if (str != null && str.length() > 0) {
            c13da.put("creator_id", str);
        }
        String str2 = c1616880sB4.LIZJ;
        if (str2 != null && str2.length() > 0) {
            c13da.put("spu_id", str2);
        }
        Map mapBuild = c13da.build();
        long jLJ = C518170KTv.LJ("prefetch_config", null, null, null, mapBuild, 30);
        String str3 = c1616880sB4.LIZ;
        int value = c1616880sB4.LIZIZ.getValue();
        return interfaceC1615440s8k.LIZ(str3, Integer.valueOf(value), c1616880sB4.LIZJ, c1616880sB4.LIZLLL, Boolean.FALSE, c1616880sB4.LJ, c1616880sB4.LJFF).LJIILL(new AfS9S0100100_24(jLJ, mapBuild, 2)).LJIIL(new AfS9S0100100_24(jLJ, mapBuild, 3));
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final List<C1616830sAz> LJIIIZ(int i) {
        C1616850sB1 c1616850sB1LJIILL = LJIILL();
        if (c1616850sB1LJIILL != null) {
            List<C1616830sAz> list = c1616850sB1LJIILL.LIZLLL.get(Integer.valueOf(i));
            if (list == null) {
                C13BV c13bv = C13BV.INSTANCE;
                if (c13bv != null) {
                    return c13bv;
                }
            } else {
                return list;
            }
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final Map LJIIJ(String str) {
        C1615950s9Z c1615950s9Z;
        C1616850sB1 c1616850sB1LJIILL = LJIILL();
        if (c1616850sB1LJIILL != null && (c1615950s9Z = c1616850sB1LJIILL.LIZJ.get(C1616850sB1.LIZIZ(str, null))) != null) {
            Gson gson = LIZJ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("payment_component_response", new JSONObject(GsonProtectorUtils.toJson(gson, c1615950s9Z.LIZ))));
            Map<String, C1615460s8m> map = c1615950s9Z.LIZIZ;
            if (map != null) {
                mapLJIIJ.put("iap_id_to_marketplace_prices", new JSONObject(GsonProtectorUtils.toJson(gson, map)));
            }
            return mapLJIIJ;
        }
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJII(String str, PaymentComponentResponse paymentComponentResponse) {
        C1616850sB1 c1616850sB1LJIILL;
        if (C517260KQi.LIZ() && (c1616850sB1LJIILL = LJIILL()) != null) {
            Map<String, C1615460s8m> map = null;
            String strLIZIZ = C1616850sB1.LIZIZ(str, null);
            synchronized (c1616850sB1LJIILL.LIZJ) {
                try {
                    ConcurrentHashMap<String, C1615950s9Z> concurrentHashMap = c1616850sB1LJIILL.LIZJ;
                    C1615950s9Z c1615950s9Z = concurrentHashMap.get(strLIZIZ);
                    if (c1615950s9Z != null) {
                        map = c1615950s9Z.LIZIZ;
                    }
                    concurrentHashMap.put(strLIZIZ, new C1615950s9Z(paymentComponentResponse, map));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final String LJIIJJI(EnumC1616780sAu enumC1616780sAu, EnumC1615550s8v enumC1615550s8v) {
        int i = C1615560s8w.LIZIZ[enumC1616780sAu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return "";
            }
            int i2 = C1615560s8w.LIZ[enumC1615550s8v.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                    return "";
                }
                return C2540209xQ.LIZ();
            }
            return C2536509wp.LIZ();
        }
        return "80UJVV6Y1101";
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJIIL(int i, List list) {
        C1616850sB1 c1616850sB1LJIILL;
        if (!C517260KQi.LIZ() || (c1616850sB1LJIILL = LJIILL()) == null) {
            return;
        }
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(33));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1616830sAz c1616830sAz = (C1616830sAz) it2.next();
            String str = c1616830sAz.LJFF;
            if (str == null || str.length() == 0) {
                c1616830sAz = new C1616830sAz(c1616830sAz.LIZ, c1616830sAz.LIZIZ, c1616830sAz.LIZJ, c1616830sAz.LIZLLL, c1616830sAz.LJ, (String) c01gwLIZIZ.getValue(), c1616830sAz.LJI, c1616830sAz.LJII, c1616830sAz.LJIIIIZZ, c1616830sAz.LJIIIZ, c1616830sAz.LJIIJ, c1616830sAz.LJIIJJI, c1616830sAz.LJIIL);
            }
            arrayList.add(c1616830sAz);
        }
        c1616850sB1LJIILL.LIZ(i, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final Object LJIILIIL(C1616880sB4 c1616880sB4, C717310SBt c717310SBt, C717330SBv c717330SBv) {
        if (C517260KQi.LIZ() && C290690BaN.LIZ()) {
            C1616850sB1 c1616850sB1LJIILL = LJIILL();
            if (c1616850sB1LJIILL == null) {
                return c717310SBt.invoke(c717330SBv);
            }
            return C2296808zG.LJ(new C376301dB(c717310SBt, c1616850sB1LJIILL, c1616880sB4, null), c717330SBv);
        }
        return c717310SBt.invoke(c717330SBv);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJFF(String str, String str2, String str3, Map<String, String> map, Map<String, ? extends Object> map2, final Function0<Unit> function0) {
        C1616850sB1 c1616850sB1LJIILL;
        Object c098200Yq;
        Object c098200Yq2;
        EnumC1616780sAu enumC1616780sAu;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZIZ = null;
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        }
        if (!(activityLIZIZ instanceof C19EG) || activityLIZIZ == null || (c1616850sB1LJIILL = LJIILL()) == null) {
            return;
        }
        C752960TgE c752960TgE = LynxPurchasePanelSheet.LLJLLL;
        C1615950s9Z c1615950s9Z = c1616850sB1LJIILL.LIZJ.get(C1616850sB1.LIZIZ(str2, str3));
        c752960TgE.getClass();
        int length = str.length();
        String str4 = str;
        if (length == 0) {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("lynx_purchase_panel_default_schema", "aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&scene=purchase_panel&skip_precheck=1");
            str4 = strLJI;
            if (strLJI == null) {
                str4 = "aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&scene=purchase_panel&skip_precheck=1";
            }
        }
        if (str4.length() != 0) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(str4).buildUpon();
                if (str2.length() > 0) {
                    builderBuildUpon.appendQueryParameter("spu_id", str2);
                }
                if (str3.length() > 0) {
                    builderBuildUpon.appendQueryParameter("creator_id", str3);
                }
                if (str2.length() > 0) {
                    enumC1616780sAu = EnumC1616780sAu.SHORT_DRAMA;
                } else if (str3.length() > 0) {
                    enumC1616780sAu = EnumC1616780sAu.SUBSCRIPTION;
                } else {
                    enumC1616780sAu = EnumC1616780sAu.UNSPECIFIED;
                }
                builderBuildUpon.appendQueryParameter("business_line", String.valueOf(enumC1616780sAu.getValue()));
                builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "purchase_panel");
                if (enumC1616780sAu == EnumC1616780sAu.SUBSCRIPTION) {
                    builderBuildUpon.appendQueryParameter("enable_web_payment", String.valueOf(C1616810sAx.LIZIZ.LJIILJJIL()));
                }
                String priceRegion = C1616810sAx.LIZIZ.getPriceRegion();
                if (priceRegion.length() > 0) {
                    builderBuildUpon.appendQueryParameter("price_region", priceRegion);
                }
                c098200Yq = builderBuildUpon.build().toString();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = str4;
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            String str5 = (String) obj;
            String str6 = str5;
            if (map != null) {
                str6 = str5;
                if (!map.isEmpty()) {
                    try {
                        Uri.Builder builderBuildUpon2 = UriProtector.parse(str5).buildUpon();
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                        c098200Yq2 = builderBuildUpon2.build().toString();
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Object obj2 = str5;
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj2 = c098200Yq2;
                    }
                    str6 = (String) obj2;
                }
            }
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str6);
            sparkContext.usePreload = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c1615950s9Z != null) {
                Gson gson = LynxPurchasePanelSheet.LLJZ;
                linkedHashMap.put("iap_schema_config", new JSONObject(GsonProtectorUtils.toJson(gson, c1615950s9Z.LIZ)));
                Map<String, C1615460s8m> map3 = c1615950s9Z.LIZIZ;
                if (map3 != null) {
                    linkedHashMap.put("iap_id_to_marketplace_prices", new JSONObject(GsonProtectorUtils.toJson(gson, map3)));
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                linkedHashMap.put("iap_tracking_data", new JSONObject(GsonProtectorUtils.toJson(LynxPurchasePanelSheet.LLJZ, map2)));
            }
            if (!linkedHashMap.isEmpty()) {
                sparkContext.LJJLIIIJILLIZJL(linkedHashMap);
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.06Mr
                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                    Function0<Unit> function02;
                    if (atomicBoolean.compareAndSet(false, true) && (function02 = function0) != null) {
                        function02.invoke();
                    }
                }
            });
            C1541950qED.LIZJ.getClass();
            new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
        }
    }
}
