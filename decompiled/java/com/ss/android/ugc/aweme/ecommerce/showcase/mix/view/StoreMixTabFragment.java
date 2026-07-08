package com.ss.android.ugc.aweme.ecommerce.showcase.mix.view;

import X.AnonymousClass0317;
import X.C01GW;
import X.C020B;
import X.C034S;
import X.C03NS;
import X.C051Y;
import X.C086F;
import X.C08ZS;
import X.C098200Yq;
import X.C0B4P;
import X.C0H1U;
import X.C0PEM;
import X.C1043010dFT;
import X.C1120604Zw;
import X.C1161040gJq;
import X.C1161090gJv;
import X.C1161140gK0;
import X.C1161630gKn;
import X.C1161640gKo;
import X.C1161650gKp;
import X.C1161670gKr;
import X.C1161820gL6;
import X.C1161850gL9;
import X.C1161970gLL;
import X.C1162660gMS;
import X.C1163360gNa;
import X.C1163430gNh;
import X.C1165490gR1;
import X.C1166220gSC;
import X.C1166240gSE;
import X.C1166590gSn;
import X.C13BV;
import X.C1421105hJ;
import X.C1537410q6t;
import X.C1540620qC4;
import X.C1545060qJE;
import X.C1697810uHb;
import X.C189200o6;
import X.C18Z8;
import X.C1954807lC;
import X.C1AQS;
import X.C2010707uD;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C948503nH;
import X.C989990brx;
import X.C990550bsr;
import X.C997290c3j;
import X.C997300c3k;
import X.EnumC1160550gJ3;
import X.EnumC1161660gKq;
import X.EnumC1161690gKt;
import X.EnumC1161720gKw;
import X.EnumC452301pR;
import X.InterfaceC1161460gKW;
import X.InterfaceC1170200gYc;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.MultiTabContentChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ui.StoreFooterCell;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.StoreMynaFirstScreenPreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.StoreMynaFirstScreenPreloadItem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS3S2101000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixTabFragment extends ECBaseMixTabFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgHELIOSICo7Ki4gLWshIDd9PiwpPmEAPCo+LAI6MBEtKwkhKSIhLCEn";
    public int LLLLLZL;
    public MultiTabContentChunkData LLLLZI;
    public boolean LLLLZIL;
    public volatile boolean LLLLZ = true;
    public final C01GW LLLLZLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS562S0100000_18(this, 216));
    public final C01GW LLLLZLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 213));
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 219));
    public final ConcurrentHashMap<Object, String> LLLZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LLLZI = new ConcurrentHashMap<>();
    public final C01GW LLLZIIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(103));
    public final C01GW LLLZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 218));
    public final C01GW LLLZL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 217));
    public final C01GW LLLZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 214));
    public final C01GW LLLZLZ = C452501pT.LIZIZ(new C1166220gSC(this));
    public final C01GW LLLZZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 215));
    public final C01GW LLLZZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 212));

    @Override // X.InterfaceC1161510gKb
    public final String EK() {
        return "store_raven_tab";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final List<InterfaceC1161460gKW> rT() {
        return C1697810uHb.LJIIJJI(this.LLLZZ.getValue(), this.LLLZZIL.getValue());
    }

    static {
        C1545060qJE.LJIIJJI.put("ecAddToCart", new InterfaceC1170200gYc() { // from class: X.0gYY
            @Override // X.InterfaceC1170200gYc
            public final String LIZ(C1170180gYa c1170180gYa) {
                Object objValueOf;
                int i;
                String string;
                try {
                    Object obj = c1170180gYa.LIZJ.get("code");
                    if (obj != null && (string = obj.toString()) != null) {
                        i = CastIntegerProtector.parseInt(string);
                    } else {
                        i = -1;
                    }
                    objValueOf = Integer.valueOf(i);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    objValueOf = Unit.LIZ;
                }
                if (c1170180gYa.LIZ == 1 && Intrinsics.LJFF(objValueOf, 0)) {
                    return "success";
                }
                return "fail";
            }
        });
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final View VR() {
        int i = this.LLLLLZL;
        if (i == 1) {
            return (View) this.LLLZIL.getValue();
        }
        if (i != 2) {
            return null;
        }
        return (View) this.LLLZL.getValue();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1161820gL6 bS() {
        C1161820gL6 c1161820gL6 = new C1161820gL6();
        c1161820gL6.LIZ = new C1161640gKo((C1165490gR1) this.LLLZLL.getValue());
        return c1161820gL6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return "unknown";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getTabName() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.showcase.settings.ECMixStorePageSchemaComponentData[] r0 = X.C1166610gSp.LIZ
            android.os.Bundle r1 = r6.getArguments()
            r5 = 0
            if (r1 == 0) goto L13
            java.lang.String r0 = "tab_id"
            long r0 = r1.getLong(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L13:
            com.ss.android.ugc.aweme.ecommerce.showcase.settings.ECMixStorePageSchemaComponentData[] r4 = X.C1166610gSp.LIZ()
            int r3 = r4.length
            r2 = 0
        L19:
            if (r2 >= r3) goto L29
            r1 = r4[r2]
            java.lang.Long r0 = r1.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r1.name
            if (r0 != 0) goto L2b
        L29:
            java.lang.String r0 = "unknown"
        L2b:
            return r0
        L2c:
            int r2 = r2 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment.getTabName():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment
    public final Map<String, Class<?>> hU() {
        return (ConcurrentHashMap) this.LLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment, com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLLZ.clear();
        this.LLLZI.clear();
        super.onDestroy();
    }

    public final TabBarItemData rU() {
        return (TabBarItemData) this.LLLZLZ.getValue();
    }

    public final C1166240gSE sU() {
        return (C1166240gSE) this.LLLLZLLLI.getValue();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final View uS() {
        int i = this.LLLLLZL;
        if (i == 1) {
            return (View) this.LLLZIL.getValue();
        }
        if (i != 2) {
            return null;
        }
        return (View) this.LLLZL.getValue();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final boolean LJIIJJI() {
        Object obj;
        RavenData<Object> ravenDataNH = dU().nH("ec_store_data_product_list_has_more");
        Object obj2 = null;
        if (ravenDataNH != null && (obj = ravenDataNH.data) != null) {
            obj2 = obj;
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment
    public final C03NS cU() {
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IPerformanceOptDependencyService.class.getName(), anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("INDEPENDENT_SHOP_");
        sbLIZ.append(getTabName());
        sbLIZ.append("_list");
        return ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C1166240gSE c1166240gSESU = sU();
        C1161850gL9.LIZ(c1166240gSESU != null ? c1166240gSESU.LIZ : null, EnumC1161690gKt.FIRST_TAB_RESUME_START, null, null);
        super.onResume();
        C1166240gSE c1166240gSESU2 = sU();
        C1161850gL9.LIZ(c1166240gSESU2 != null ? c1166240gSESU2.LIZ : null, EnumC1161690gKt.FIRST_TAB_RESUME_END, null, null);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final Class<? extends PowerLoadingCell> UR() {
        return StoreFooterCell.class;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final boolean GT(int i) {
        if (i <= 4) {
            kU("ec_store_event_trigger_load_more", null);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment, com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1161040gJq VT(C1161040gJq c1161040gJq) {
        int size;
        int size2;
        Map<String, List<C1161140gK0>> map;
        C1161630gKn c1161630gKn = (C1161630gKn) this.LLLZZIL.getValue();
        Pair[] pairArr = new Pair[2];
        List<C1161140gK0> listLIZIZ = c1161040gJq.LIZIZ();
        if (listLIZIZ != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        pairArr[0] = new Pair("body_component_count", Integer.valueOf(size));
        List<C1161140gK0> listLIZ = c1161040gJq.LIZ();
        if (listLIZ != null) {
            size2 = listLIZ.size();
        } else {
            size2 = 0;
        }
        pairArr[1] = new Pair("all_component_count", Integer.valueOf(size2));
        c1161630gKn.LJIIJJI(System.currentTimeMillis(), "transform_response_start", C2097608Jq.LJIIIIZZ(pairArr));
        if (sU() != null) {
            ArrayList arrayList = new ArrayList();
            C1161090gJv c1161090gJv = c1161040gJq.LL;
            if (c1161090gJv != null && (map = c1161090gJv.LIZIZ) != null) {
                Iterator<Map.Entry<String, List<C1161140gK0>>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Iterator<T> it3 = it2.next().getValue().iterator();
                    while (it3.hasNext()) {
                        BaseComponentData baseComponentData = ((C1161140gK0) it3.next()).LIZLLL;
                        String strLIZIZ = "";
                        if (baseComponentData instanceof RavenSparkModule) {
                            RavenSparkModule ravenSparkModule = (RavenSparkModule) baseComponentData;
                            String schema = ravenSparkModule.getSchema();
                            if (schema != null) {
                                ConcurrentHashMap<Object, String> concurrentHashMap = this.LLLZ;
                                String strPutIfAbsent = concurrentHashMap.get(schema);
                                if (strPutIfAbsent == null) {
                                    String strQU = qU(schema);
                                    if (strQU != null) {
                                        strLIZIZ = strQU;
                                    }
                                    strPutIfAbsent = concurrentHashMap.putIfAbsent(schema, strLIZIZ);
                                    if (strPutIfAbsent == null) {
                                        strPutIfAbsent = strLIZIZ;
                                    }
                                }
                                strLIZIZ = strPutIfAbsent;
                            }
                            ravenSparkModule.setSchema(strLIZIZ);
                            if (this.LLLLZ) {
                                arrayList.add(C2097908Jt.LIZJ(new Pair("init_data", ravenSparkModule.getInitData())));
                            }
                        } else if (baseComponentData instanceof RavenMynaModule) {
                            RavenMynaModule ravenMynaModule = (RavenMynaModule) baseComponentData;
                            String schema2 = ravenMynaModule.getSchema();
                            ConcurrentHashMap<String, String> concurrentHashMap2 = this.LLLZI;
                            String strPutIfAbsent2 = concurrentHashMap2.get(schema2);
                            if (strPutIfAbsent2 == null) {
                                String strQU2 = qU(schema2);
                                C1163430gNh c1163430gNh = C1163360gNa.LIZ;
                                if (strQU2 != null && !a0.LJJJIL(strQU2)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strQU2);
                                    sbLIZ.append("&base_on_width_dp=750&view_scale=1&font_scale=1");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                                strPutIfAbsent2 = concurrentHashMap2.putIfAbsent(schema2, strLIZIZ);
                                if (strPutIfAbsent2 == null) {
                                    strPutIfAbsent2 = strLIZIZ;
                                }
                            }
                            ravenMynaModule.setSchema(strPutIfAbsent2);
                            if (this.LLLLZ) {
                                arrayList.add(C2097908Jt.LIZJ(new Pair("init_data", ravenMynaModule.getInitData())));
                            }
                        }
                    }
                }
            }
            if (this.LLLLZ) {
                C948503nH.LJ(C948503nH.LIZIZ(this), C0PEM.LIZJ, new C08ZS(arrayList, null));
            }
        }
        ((C1161630gKn) this.LLLZZIL.getValue()).LJIIJJI(System.currentTimeMillis(), "transform_response_end", C2097608Jq.LJ());
        return c1161040gJq;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1540620qC4 gS(String str) {
        String str2;
        Context context = getContext();
        if (context == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            context = C1161970gLL.LIZIZ().LIZJ();
        }
        C1166240gSE c1166240gSESU = sU();
        if (c1166240gSESU == null || (str2 = c1166240gSESU.LIZ) == null) {
            str2 = "store_mix";
        }
        return new C1540620qC4(context, true, str, str2, false, false, false, false, false, false, null, 16320);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void kT(long j) {
        long j2;
        boolean zLJFF;
        int i;
        int i2;
        long jLongValue;
        String str;
        Object obj;
        Long l;
        long jLongValue2;
        int i3;
        long jLongValue3;
        Map<String, Object> map;
        Long l2;
        n nVar;
        h hVarLJJIIZI;
        n nVar2;
        long jLJIIZILJ;
        Map<String, Object> map2;
        Bundle bundle;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1166240gSE c1166240gSESU = sU();
        long jLongValue4 = 0;
        if (c1166240gSESU != null && (bundle = c1166240gSESU.LJ) != null) {
            j2 = bundle.getLong("start_click_time");
        } else {
            j2 = 0;
        }
        long j3 = j - j2;
        if (!this.LLLLZIL) {
            boolean z = C1163360gNa.LIZIZ;
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("storeOnFirstScreenEnd=");
                sbLIZ.append(j3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            int i4 = 1;
            this.LLLLZIL = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1166240gSE c1166240gSESU2 = sU();
            if (c1166240gSESU2 != null && (map2 = c1166240gSESU2.LIZLLL) != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.put("page_name", "shop");
            linkedHashMap.put("subtab_name", getTabName());
            linkedHashMap.put("subpage_name", "store_v2");
            linkedHashMap.put("start_click_to_now", Long.valueOf(j3));
            linkedHashMap.put("start_to_now", Long.valueOf(jCurrentTimeMillis - j2));
            TabBarItemData tabBarItemDataRU = rU();
            if (tabBarItemDataRU != null) {
                zLJFF = Intrinsics.LJFF(tabBarItemDataRU.isMain, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (zLJFF) {
                i = 2;
            } else {
                i = 1;
            }
            linkedHashMap.put("is_default_tab", Integer.valueOf(i));
            C1166240gSE c1166240gSESU3 = sU();
            if (c1166240gSESU3 != null && c1166240gSESU3.LIZIZ) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            linkedHashMap.put("has_landing_deeplink", Integer.valueOf(i2));
            try {
                try {
                    MultiTabContentChunkData multiTabContentChunkData = this.LLLLZI;
                    if (multiTabContentChunkData != null && (nVar2 = multiTabContentChunkData.timingInfo) != null) {
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("api_duration=");
                            sbLIZ2.append(nVar2.LJJIIZ("api_duration"));
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        k kVarLJJIIZ = nVar2.LJJIIZ("api_duration");
                        if (kVarLJJIIZ != null) {
                            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
                        } else {
                            jLJIIZILJ = 0;
                        }
                        linkedHashMap.put("api_duration", Long.valueOf(jLJIIZILJ));
                    }
                    MultiTabContentChunkData multiTabContentChunkData2 = this.LLLLZI;
                    if (multiTabContentChunkData2 != null && (nVar = multiTabContentChunkData2.globalData) != null && (hVarLJJIIZI = nVar.LJJIIZI("server_perf_info")) != null) {
                        JSONArray jSONArray = new JSONArray(hVarLJJIIZI.toString());
                        AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(linkedHashMap, (Map<String, Object>) 16);
                        try {
                            int length = jSONArray.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                awS617S0100000_3.invoke(Integer.valueOf(i5), JSONArrayProtectorUtils.getJSONObject(jSONArray, i5));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1421105hJ.LIZJ("rd_tiktokec_meaningful_rendered", linkedHashMap);
                C1161630gKn c1161630gKn = (C1161630gKn) this.LLLZZIL.getValue();
                Object obj2 = c1161630gKn.LLILZ;
                StoreMixTabFragment storeMixTabFragment = c1161630gKn.LLIZ;
                synchronized (obj2) {
                    try {
                        jLongValue = -1;
                        if (c1161630gKn.LLILZIL && !c1161630gKn.LLILZLL) {
                            c1161630gKn.LLILLJJLI.put("on_first_screen_draw_end", Long.valueOf(j));
                            c1161630gKn.LLILLL.put("first_screen_max_draw_end", Long.valueOf(j));
                            c1161630gKn.LLILZLL = true;
                            Pair[] pairArr = new Pair[9];
                            pairArr[0] = new Pair("page_name", "shop");
                            pairArr[1] = new Pair("subpage_name", "store_v2");
                            pairArr[2] = new Pair("subtab_name", storeMixTabFragment.getTabName());
                            TabBarItemData tabBarItemDataRU2 = storeMixTabFragment.rU();
                            if (tabBarItemDataRU2 != null && (l2 = tabBarItemDataRU2.tabType) != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = -1;
                            }
                            pairArr[3] = new Pair("tab_type", Long.valueOf(jLongValue2));
                            TabBarItemData tabBarItemDataRU3 = storeMixTabFragment.rU();
                            if (tabBarItemDataRU3 != null && Intrinsics.LJFF(tabBarItemDataRU3.isMain, Boolean.TRUE)) {
                                i3 = 2;
                            } else {
                                i3 = 1;
                            }
                            pairArr[4] = new Pair("is_default_tab", Integer.valueOf(i3));
                            C1166240gSE c1166240gSESU4 = storeMixTabFragment.sU();
                            if (c1166240gSESU4 == null || !c1166240gSESU4.LIZIZ) {
                                i4 = 2;
                            }
                            pairArr[5] = new Pair("has_landing_deeplink", Integer.valueOf(i4));
                            pairArr[6] = new Pair("stage_count", Integer.valueOf(c1161630gKn.LLILLJJLI.size()));
                            Long l3 = c1161630gKn.LLILLJJLI.get("submit_first_screen_start");
                            if (l3 != null) {
                                jLongValue3 = l3.longValue();
                            } else {
                                jLongValue3 = 0;
                            }
                            pairArr[7] = new Pair("submit_first_screen_start_ts", Long.valueOf(jLongValue3));
                            Long l4 = c1161630gKn.LLILLJJLI.get("on_first_screen_draw_end");
                            if (l4 != null) {
                                jLongValue4 = l4.longValue();
                            }
                            pairArr[8] = new Pair("on_first_screen_draw_end_ts", Long.valueOf(jLongValue4));
                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                            C1166240gSE c1166240gSESU5 = storeMixTabFragment.sU();
                            if (c1166240gSESU5 != null && (map = c1166240gSESU5.LIZLLL) != null) {
                                mapLJIIJ.putAll(map);
                            }
                            mapLJIIJ.putAll(c1161630gKn.LLILLL);
                            c1161630gKn.LJIILIIL("total_cost", "submit_first_screen_start", "on_first_screen_draw_end", mapLJIIJ);
                            c1161630gKn.LJIILIIL("submit_to_response_cost", "submit_first_screen_start", "response_received", mapLJIIJ);
                            c1161630gKn.LJIILIIL("response_to_parse_cost", "response_received", "parse_start", mapLJIIJ);
                            c1161630gKn.LJIILIIL("transform_response_cost", "transform_response_start", "transform_response_end", mapLJIIJ);
                            c1161630gKn.LJIILIIL("parse_cost", "parse_start", "parse_transform_complete", mapLJIIJ);
                            c1161630gKn.LJIILIIL("parse_complete_to_components_ready_cost", "parse_transform_complete", "components_ready", mapLJIIJ);
                            c1161630gKn.LJIILIIL("components_ready_to_set_immediately_cost", "components_ready", "body_list_set_immediately_start", mapLJIIJ);
                            c1161630gKn.LJIILIIL("body_list_set_immediately_cost", "body_list_set_immediately_start", "body_list_set_immediately_end", mapLJIIJ);
                            c1161630gKn.LJIILIIL("set_immediately_to_spark_finish_cost", "body_list_set_immediately_end", "spark_first_screen_finish", mapLJIIJ);
                            c1161630gKn.LJIILIIL("set_immediately_to_myna_finish_cost", "body_list_set_immediately_end", "myna_first_screen_finish", mapLJIIJ);
                            c1161630gKn.LJIILIIL("set_immediately_to_draw_end_cost", "body_list_set_immediately_end", "on_first_screen_draw_end", mapLJIIJ);
                            c1161630gKn.LLILZIL = false;
                            C1421105hJ.LIZJ("rd_tiktokec_store_raven_first_screen_duration", mapLJIIJ);
                            if (C1163360gNa.LIZIZ) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("set_immediately_to_draw_end_cost=");
                                sbLIZ3.append(((LinkedHashMap) mapLJIIJ).get("set_immediately_to_draw_end_cost"));
                                C2188811AlT.LIZIZ(sbLIZ3);
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                TabBarItemData tabBarItemDataRU4 = rU();
                if (tabBarItemDataRU4 != null && (l = tabBarItemDataRU4.tabType) != null) {
                    jLongValue = l.longValue();
                }
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("tabType", Long.valueOf(jLongValue)));
                C1166240gSE c1166240gSESU6 = sU();
                if (c1166240gSESU6 != null) {
                    str = c1166240gSESU6.LIZ;
                } else {
                    str = null;
                }
                C1161850gL9.LIZ(str, EnumC1161690gKt.PAGE_END, Long.valueOf(j), mapLIZJ);
                RavenData<Object> ravenDataNH = dU().nH("is_meaningful_rendered");
                if (ravenDataNH == null || (obj = ravenDataNH.data) == null) {
                    obj = null;
                }
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.LJFF(obj, bool)) {
                    kU("meaningful_rendered", null);
                    if (C1163360gNa.LIZIZ) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("setRavenData: ");
                        sbLIZ4.append("is_meaningful_rendered");
                        sbLIZ4.append(", ");
                        sbLIZ4.append(bool);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    dU().uJ("is_meaningful_rendered", new RavenData<>(bool, -1L));
                }
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            }
        }
        RJ(j);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void nT(int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("index_to_bottom", Integer.valueOf(i));
        kU("ec_store_event_trigger_load_more", javaOnlyMap);
    }

    public final String qU(String str) {
        String strValueOf;
        if (str == null) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(C2010707uD.LIZJ(UriProtector.parse(str), "biz", "store_raven_tab"));
        }
        C1166240gSE c1166240gSESU = sU();
        if (c1166240gSESU != null) {
            return C1166590gSn.LIZ(c1166240gSESU, strValueOf, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.bytedance.hybrid.spark.raven.page.RavenFragment, com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uU(com.bytedance.hybrid.spark.raven.data.RavenPage r32) {
        /*
            Method dump skipped, instruction units count: 1857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment.uU(com.bytedance.hybrid.spark.raven.data.RavenPage):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment
    public final void jU(Object obj, String str) {
        Map map;
        Map map2;
        int iIntValue;
        int iIntValue2;
        int i;
        int iHashCode = str.hashCode();
        int iIntValue3 = -1;
        if (iHashCode != -1838799974) {
            if (iHashCode != 163387871) {
                if (iHashCode == 574698970 && str.equals("ec_store_event_product_list_skeleton") && (obj instanceof RavenEvent)) {
                    Object obj2 = ((RavenEvent) obj).data;
                    if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                        Integer numLIZIZ = C051Y.LIZIZ(map2.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
                        if (numLIZIZ != null) {
                            iIntValue = numLIZIZ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        Integer numLIZIZ2 = C051Y.LIZIZ(map2.get("column_type"));
                        if (numLIZIZ2 != null) {
                            iIntValue2 = numLIZIZ2.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        Integer numLIZIZ3 = C051Y.LIZIZ(map2.get("skeleton_type"));
                        if (numLIZIZ3 != null) {
                            iIntValue3 = numLIZIZ3.intValue();
                        }
                        if (iIntValue2 == 0) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        this.LLLLLZL = i;
                        if (iIntValue == 1) {
                            if (iIntValue3 != 0) {
                                if (iIntValue3 == 1) {
                                    this.LLLI = EnumC1160550gJ3.BODY;
                                    this.LLLII = true;
                                    C086F c086f = C086F.LIZ;
                                    ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(this, 81);
                                    c086f.getClass();
                                    C086F.LJII(aRunnableS102S0100000_2);
                                    return;
                                }
                                return;
                            }
                            this.LLLI = EnumC1160550gJ3.FRAGMENT;
                            this.LLLII = false;
                            C086F c086f2 = C086F.LIZ;
                            ARunnableS102S0100000_2 aRunnableS102S0100000_22 = new ARunnableS102S0100000_2(this, 82);
                            c086f2.getClass();
                            C086F.LJII(aRunnableS102S0100000_22);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("ec_store_event_setup_product_tab") || !(obj instanceof RavenPage)) {
                return;
            }
            this.LLLLZ = false;
            uU((RavenPage) obj);
            return;
        }
        if (!str.equals("ec_store_event_product_list_scroll") || !(obj instanceof RavenEvent)) {
            return;
        }
        Object obj3 = ((RavenEvent) obj).data;
        if (!(obj3 instanceof Map) || (map = (Map) obj3) == null) {
            return;
        }
        Integer numLIZIZ4 = C051Y.LIZIZ(map.get("position"));
        if (numLIZIZ4 != null) {
            iIntValue3 = numLIZIZ4.intValue();
        }
        Object obj4 = map.get("smooth");
        if (iIntValue3 < 0) {
            return;
        }
        if (Intrinsics.LJFF(obj4, Boolean.TRUE)) {
            C18Z8 c18z8 = this.LLJILJIL;
            if (c18z8 == null) {
                return;
            }
            c18z8.smoothScrollToPosition(iIntValue3);
            return;
        }
        C18Z8 c18z82 = this.LLJILJIL;
        if (c18z82 == null) {
            return;
        }
        c18z82.scrollToPosition(iIntValue3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment, com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        String str2;
        StoreMynaFirstScreenPreloadItem storeMynaFirstScreenPreloadItem;
        ?? arrayList;
        int iIntValue;
        EnumC1161660gKq enumC1161660gKq;
        int i;
        Object c098200Yq;
        Object c098200Yq2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        StoreMynaFirstScreenPreloadConfig[] preloadConfig;
        super.onViewCreated(view, bundle);
        C1166240gSE c1166240gSESU = sU();
        if (c1166240gSESU != null) {
            str = c1166240gSESU.LIZ;
        } else {
            str = null;
        }
        C1161850gL9.LIZ(str, EnumC1161690gKt.FIRST_TAB_CREATE_START, null, null);
        C1166240gSE c1166240gSESU2 = sU();
        if (c1166240gSESU2 != null) {
            num = c1166240gSESU2.LJIIJ;
        } else {
            num = null;
        }
        int value = EnumC1161720gKw.SINGLE_COLUMN.getValue();
        if (num != null && num.intValue() == value) {
            str2 = "single";
        } else {
            int value2 = EnumC1161720gKw.DOUBLE_COLUMN.getValue();
            if (num != null && num.intValue() == value2) {
                str2 = "double";
            } else {
                str2 = null;
            }
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        StoreMynaFirstScreenPreloadItem[] storeMynaFirstScreenPreloadItemArr = C1161670gKr.LIZ;
        StoreMynaFirstScreenPreloadItem[] storeMynaFirstScreenPreloadItemArr2 = (StoreMynaFirstScreenPreloadItem[]) settingsManagerLIZLLL.LJIIIIZZ("ec_store_myna_first_screen_preload_config", StoreMynaFirstScreenPreloadItem[].class, storeMynaFirstScreenPreloadItemArr);
        if (storeMynaFirstScreenPreloadItemArr2 != null) {
            storeMynaFirstScreenPreloadItemArr = storeMynaFirstScreenPreloadItemArr2;
        }
        int length = storeMynaFirstScreenPreloadItemArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                storeMynaFirstScreenPreloadItem = storeMynaFirstScreenPreloadItemArr[i2];
                if (Intrinsics.LJFF(storeMynaFirstScreenPreloadItem.getProductListLayout(), str2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                storeMynaFirstScreenPreloadItem = null;
                break;
            }
        }
        if (storeMynaFirstScreenPreloadItem != null && (preloadConfig = storeMynaFirstScreenPreloadItem.getPreloadConfig()) != null) {
            arrayList = new ArrayList();
            for (StoreMynaFirstScreenPreloadConfig storeMynaFirstScreenPreloadConfig : preloadConfig) {
                String schema = storeMynaFirstScreenPreloadConfig.getSchema();
                if (schema != null && !a0.LJJJIL(schema)) {
                    arrayList.add(storeMynaFirstScreenPreloadConfig);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        for (StoreMynaFirstScreenPreloadConfig storeMynaFirstScreenPreloadConfig2 : arrayList) {
            Integer preloadCount = storeMynaFirstScreenPreloadConfig2.getPreloadCount();
            if (preloadCount != null) {
                iIntValue = preloadCount.intValue();
                if (iIntValue <= 0) {
                    continue;
                }
            } else {
                iIntValue = 6;
            }
            String schema2 = storeMynaFirstScreenPreloadConfig2.getSchema();
            C1165490gR1 c1165490gR1 = (C1165490gR1) this.LLLZLL.getValue();
            if (((Boolean) C0B4P.LIZ.getValue()).booleanValue()) {
                enumC1161660gKq = EnumC1161660gKq.FULL_PRELOAD;
            } else {
                enumC1161660gKq = EnumC1161660gKq.NONE;
            }
            Context context = getContext();
            if (context != null) {
                C989990brx c989990brx = MynaRavenUIAssem.LLJLIL;
                c989990brx.getClass();
                if (enumC1161660gKq != EnumC1161660gKq.NONE && schema2 != null && !a0.LJJJIL(schema2)) {
                    if (C1161650gKp.LIZ[enumC1161660gKq.ordinal()] == 1) {
                        i = iIntValue;
                    } else {
                        i = 0;
                    }
                    if (enumC1161660gKq == EnumC1161660gKq.FULL_PRELOAD && i <= 0) {
                        new C1043010dFT();
                        C1043010dFT.LIZIZ("MynaRavenUIAssem", new C020B(iIntValue, 4));
                    } else {
                        try {
                            Uri uri = UriProtector.parse(Uri.decode(schema2));
                            if (uri != null && Intrinsics.LJFF(uri.getScheme(), "aweme") && Intrinsics.LJFF(uri.getHost(), "myna") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0) {
                                c098200Yq = new Pair(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
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
                        Pair pair = (Pair) c098200Yq;
                        if (pair != null) {
                            String str3 = (String) pair.getFirst();
                            String str4 = (String) pair.getSecond();
                            List listSingletonList = Collections.singletonList(new C990550bsr(str4, i, schema2));
                            new C1043010dFT();
                            C1043010dFT.LIZ("MynaRavenUIAssem", new AwS3S2101000_18(str3, str4, enumC1161660gKq, i, 0));
                            try {
                                int i3 = C1161650gKp.LIZ[enumC1161660gKq.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        C1162660gMS.LIZ(str3, listSingletonList, new C997290c3j(c989990brx));
                                    }
                                } else {
                                    C1162660gMS.LIZIZ(str3, context, listSingletonList, c1165490gR1, new C997300c3k(c989990brx));
                                }
                                c098200Yq2 = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                            if (thM5exceptionOrNullimpl != null) {
                                new C1043010dFT();
                                C1043010dFT.LIZIZ("MynaRavenUIAssem", new AwS167S1100000_18(str3, thM5exceptionOrNullimpl, 4));
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                continue;
            }
        }
        StoreMixFragment storeMixFragment = (StoreMixFragment) requireParentFragment();
        if (storeMixFragment != null) {
            StoreMixViewModel storeMixViewModelZS = storeMixFragment.zS();
            storeMixViewModelZS.wQ2(2, new AwS597S0100000_18(this, 79));
            storeMixViewModelZS.wQ2(3, new AwS597S0100000_18(this, 80));
        }
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout != null) {
            C0H1U.LIZIZ(frameLayout);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void lT(long j, String str, Map map) {
        ((C1161630gKn) this.LLLZZIL.getValue()).LJIIJJI(j, str, map);
    }
}
