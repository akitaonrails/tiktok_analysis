package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C08JS;
import X.C09CT;
import X.C10RT;
import X.C10VW;
import X.C123100dR;
import X.C1766890w51;
import X.C1766910w53;
import X.C1766930w55;
import X.C1766940w56;
import X.C1766990w5B;
import X.C1767040w5G;
import X.C1767080w5K;
import X.C178700mP;
import X.C18C6;
import X.C20684815ws;
import X.C2211621BhA;
import X.C2211631BhB;
import X.C2211641BhC;
import X.C443120HZe;
import X.C739840T0k;
import X.EnumC2211681BhG;
import X.InterfaceC1740760vOs;
import X.InterfaceC2211711BhJ;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class BTMTrackerServiceImpl implements IBTMTrackerService {
    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final Map<String, String> LJIIJJI() {
        Map<String, String> map = C1767080w5K.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, String> map2 = C1767080w5K.LIZ;
        Map<String, String> map3 = (Map) settingsManagerLIZLLL.LJIIIIZZ("lynx_channel_page_map", Map.class, map2);
        return map3 != null ? map3 : map2;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final Pair<Boolean, Boolean> getBDBTMReplaceSwitch() {
        return new Pair<>(Boolean.valueOf(C1766910w53.LIZ().f11switch), Boolean.valueOf(C1766910w53.LIZ().realSwitch));
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final List<C443120HZe<String, String, JSONObject>> getBDBTMList(View view) {
        C1766930w55 c1766930w55 = C1766930w55.LIZ;
        PageFinder pageFinderVia = PageFinder.via(view);
        c1766930w55.getClass();
        String str = null;
        try {
            List<C1766940w56> list = ((C18C6) C1766930w55.LIZIZ(null, pageFinderVia).getSecond()).LIZ;
            Collections.reverse(list);
            ArrayList arrayList = new ArrayList();
            for (C1766940w56 c1766940w56 : list) {
                String str2 = c1766940w56.LIZIZ;
                if (str2 != null) {
                    String str3 = (String) a0.LJJLIIIJILLIZJL(str2, new String[]{"_"}, 0, 6).get(0);
                    C1766930w55 c1766930w552 = C1766930w55.LIZ;
                    C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
                    c1766930w552.getClass();
                    C1767040w5G c1767040w5GLIZLLL = C1766930w55.LIZLLL(str3, str, c1766990w5B);
                    arrayList.add(new C443120HZe(c1767040w5GLIZLLL.LIZ, c1767040w5GLIZLLL.LIZIZ, c1767040w5GLIZLLL.LIZJ));
                    str = str2;
                }
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final List<C2211641BhC> getPageRecordChain(boolean z) {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC == null) {
            c2211641BhC = C2211621BhA.LIZLLL;
        }
        return LIZIZ(c2211641BhC, z);
    }

    public static List LIZIZ(C2211641BhC c2211641BhC, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (c2211641BhC != null) {
            if (z) {
                ListProtector.add(arrayList, 0, c2211641BhC);
            } else {
                ArrayList arrayList2 = new ArrayList();
                C2211641BhC c2211641BhC2 = c2211641BhC;
                while (true) {
                    c2211641BhC2 = c2211641BhC2.LJIIIZ;
                    if (c2211641BhC2 == null) {
                        break;
                    }
                    arrayList2.add(c2211641BhC2);
                }
                ListProtector.add(arrayList2, 0, c2211641BhC);
                arrayList.addAll(0, arrayList2);
                C2211641BhC c2211641BhC3 = c2211641BhC.LJIIJ;
                if (c2211641BhC3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C2211641BhC c2211641BhC4 = c2211641BhC3;
                    while (true) {
                        c2211641BhC4 = c2211641BhC4.LJIIIZ;
                        if (c2211641BhC4 == null) {
                            break;
                        }
                        arrayList3.add(c2211641BhC4);
                    }
                    ListProtector.add(arrayList3, 0, c2211641BhC3);
                    arrayList.addAll(0, arrayList3);
                }
            }
            c2211641BhC = c2211641BhC.LJIJ;
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final void LJIIIZ(final Fragment fragment, final String str) {
        InterfaceC1740760vOs interfaceC1740760vOs = new InterfaceC1740760vOs() { // from class: X.0w5H
            public final /* synthetic */ Map<String, String> LLILLJJLI = null;

            @Override // X.InterfaceC1740760vOs
            public final String w3() {
                return String.valueOf(fragment.hashCode());
            }

            @Override // X.InterfaceC1740760vOs
            public String getBtmPageCode() {
                return str;
            }

            @Override // X.InterfaceC1740760vOs
            public final Map<String, String> r9() {
                return this.LLILLJJLI;
            }
        };
        C10RT c10rt = new C10RT();
        c10rt.LIZ = interfaceC1740760vOs.w3();
        c10rt.LIZJ = interfaceC1740760vOs.getBtmPageCode();
        c10rt.LJIIJJI = C178700mP.LIZ(null, c10rt.LJIIJJI);
        c10rt.LIZLLL = EnumC2211681BhG.FRAGMENT;
        if (fragment != null) {
            c10rt.LJFF = new WeakReference<>(fragment);
            c10rt.LJI = new WeakReference<>(fragment.getActivity());
        }
        C2211631BhB.LJIIJJI(new C10VW(c10rt));
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final Pair<C18C6, C18C6> LJIIL(View view, String str) {
        C1766930w55 c1766930w55 = C1766930w55.LIZ;
        PageFinder pageFinderVia = PageFinder.via(view);
        c1766930w55.getClass();
        return C1766930w55.LIZIZ(str, pageFinderVia);
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final String LJIILIIL(String str, boolean z) {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC == null) {
            c2211641BhC = C2211621BhA.LIZLLL;
        }
        return LIZ(LIZIZ(c2211641BhC, z), null, str);
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final List<C2211641BhC> getPageRecordChain(View view, boolean z) {
        C2211621BhA.LIZ.getClass();
        return LIZIZ(C2211621BhA.LIZLLL(view, null), z);
    }

    public static final class PageRecordSimpleForSpark {

        @C09CT("btm_pre")
        public final String btmPre;

        @C09CT("data")
        public final Map<String, String> data;

        @C09CT("page_code")
        public final String pageCode;

        public PageRecordSimpleForSpark(String str, Map<String, String> map, String str2) {
            this.pageCode = str;
            this.data = map;
            this.btmPre = str2;
        }
    }

    public static String LIZ(List list, View view, String str) throws JSONException {
        String string;
        Map<String, String> map;
        ArrayList arrayList = new ArrayList();
        for (C2211641BhC c2211641BhC : (ArrayList) list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhC.LJJJ;
            if (concurrentHashMap != null) {
                linkedHashMap.putAll(concurrentHashMap);
            }
            C1766890w51 c1766890w51 = c2211641BhC.LJJIZ;
            if (c1766890w51 != null && (map = c1766890w51.LJ) != null) {
                linkedHashMap.putAll(map);
            }
            arrayList.add(new PageRecordSimpleForSpark(c2211641BhC.LIZIZ(), linkedHashMap, c2211641BhC.LJ));
        }
        String strLIZLLL = C08JS.LIZLLL(arrayList);
        if (C1766910w53.LIZ().f11switch) {
            C1766930w55 c1766930w55 = C1766930w55.LIZ;
            PageFinder pageFinderVia = PageFinder.via(view);
            c1766930w55.getClass();
            try {
                string = C1766930w55.LIZJ(pageFinderVia, true, str).toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tt_params", strLIZLLL);
            jSONObject.putOpt("bd_params", string);
            jSONObject.putOpt("type", "btm_route_data");
            C20684815ws.LJIJ("btm_tt_switch_to_bd_diff", jSONObject);
            if (C123100dR.LIZ(str)) {
                if (C1766910w53.LIZ().realSwitch4GlobalProps) {
                    return string;
                }
            } else if (C1766910w53.LIZ().realSwitch) {
                return string;
            }
        }
        return strLIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0T0k, X.1BhJ] */
    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final C739840T0k LJIIJ(final Object obj, final String str, final boolean z) {
        ?? r0 = new InterfaceC2211711BhJ() { // from class: X.0T0k
            @Override // X.InterfaceC1740760vOs
            public final Map<String, String> r9() {
                return null;
            }

            @Override // X.InterfaceC2211711BhJ, X.InterfaceC1740760vOs
            public final String w3() {
                return C739940T0u.LIZ(this);
            }

            @Override // X.InterfaceC2211711BhJ
            public final Object LLFZ() {
                return obj;
            }

            @Override // X.InterfaceC2211711BhJ
            public final boolean RO() {
                return z;
            }

            @Override // X.InterfaceC2211711BhJ, X.InterfaceC1740760vOs
            public String getBtmPageCode() {
                return str;
            }
        };
        C2211631BhB.LJIILJJIL(r0);
        return r0;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final String getPageRecordChainStringDataSubPage(View view, boolean z, String str) {
        C2211621BhA.LIZ.getClass();
        return LIZ(LIZIZ(C2211621BhA.LIZLLL(view, null), z), view, str);
    }
}
