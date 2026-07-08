package com.ss.android.ugc.aweme.search.visualsearch.bridge;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.IVisualSearchDetailPageShareVMService;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class VisualSearchDetailPageShareVMBridge implements IDetailPageShareVMService {
    public final HashMap<String, InterfaceC1186204kW> LIZ;

    public VisualSearchDetailPageShareVMBridge() {
        final String str = "from_smart_search_related_videos";
        final String str2 = "from_visual_search";
        final String str3 = "from_visual_search_auto_play";
        final String str4 = "from_visual_search_ai_card";
        this.LIZ = C2097608Jq.LJI(new Pair("from_smart_search_related_videos", new InterfaceC1186204kW() { // from class: X.04mz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                Object c098200Yq;
                HashMap<String, InterfaceC1186204kW> mapLIZ;
                InterfaceC1186204kW interfaceC1186204kW;
                String str5 = str;
                Object obj = null;
                try {
                    C1255104vd.LIZ.getClass();
                    IVisualSearchDetailPageShareVMService iVisualSearchDetailPageShareVMService = C1255104vd.LIZIZ;
                    if (iVisualSearchDetailPageShareVMService != null && (mapLIZ = iVisualSearchDetailPageShareVMService.LIZ()) != null && (interfaceC1186204kW = mapLIZ.get(str5)) != null) {
                        c098200Yq = interfaceC1186204kW.LIZ(c2189821An6);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                return (Pair) obj;
            }
        }), new Pair("from_visual_search", new InterfaceC1186204kW() { // from class: X.04mz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                Object c098200Yq;
                HashMap<String, InterfaceC1186204kW> mapLIZ;
                InterfaceC1186204kW interfaceC1186204kW;
                String str5 = str2;
                Object obj = null;
                try {
                    C1255104vd.LIZ.getClass();
                    IVisualSearchDetailPageShareVMService iVisualSearchDetailPageShareVMService = C1255104vd.LIZIZ;
                    if (iVisualSearchDetailPageShareVMService != null && (mapLIZ = iVisualSearchDetailPageShareVMService.LIZ()) != null && (interfaceC1186204kW = mapLIZ.get(str5)) != null) {
                        c098200Yq = interfaceC1186204kW.LIZ(c2189821An6);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                return (Pair) obj;
            }
        }), new Pair("from_visual_search_auto_play", new InterfaceC1186204kW() { // from class: X.04mz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                Object c098200Yq;
                HashMap<String, InterfaceC1186204kW> mapLIZ;
                InterfaceC1186204kW interfaceC1186204kW;
                String str5 = str3;
                Object obj = null;
                try {
                    C1255104vd.LIZ.getClass();
                    IVisualSearchDetailPageShareVMService iVisualSearchDetailPageShareVMService = C1255104vd.LIZIZ;
                    if (iVisualSearchDetailPageShareVMService != null && (mapLIZ = iVisualSearchDetailPageShareVMService.LIZ()) != null && (interfaceC1186204kW = mapLIZ.get(str5)) != null) {
                        c098200Yq = interfaceC1186204kW.LIZ(c2189821An6);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                return (Pair) obj;
            }
        }), new Pair("from_visual_search_ai_card", new InterfaceC1186204kW() { // from class: X.04mz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                Object c098200Yq;
                HashMap<String, InterfaceC1186204kW> mapLIZ;
                InterfaceC1186204kW interfaceC1186204kW;
                String str5 = str4;
                Object obj = null;
                try {
                    C1255104vd.LIZ.getClass();
                    IVisualSearchDetailPageShareVMService iVisualSearchDetailPageShareVMService = C1255104vd.LIZIZ;
                    if (iVisualSearchDetailPageShareVMService != null && (mapLIZ = iVisualSearchDetailPageShareVMService.LIZ()) != null && (interfaceC1186204kW = mapLIZ.get(str5)) != null) {
                        c098200Yq = interfaceC1186204kW.LIZ(c2189821An6);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                return (Pair) obj;
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return this.LIZ;
    }
}
