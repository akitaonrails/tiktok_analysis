package com.ss.android.ugc.aweme.search.visualsearch.bridge;

import X.C2097608Jq;
import X.InterfaceC1255404vg;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.IVisualSearchDetailPageOperatorService;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class VisualSearchDetailPageOperatorBridge implements IDetailPageOperatorService {
    public final HashMap<String, InterfaceC1255404vg> LIZ = C2097608Jq.LJI(new Pair("from_find_similar_details_info", new InterfaceC1255404vg() { // from class: X.04vf
        public final /* synthetic */ String LIZ = "from_find_similar_details_info";

        @Override // X.InterfaceC1255404vg
        public final InterfaceC1603360rpG LIZ(C2189821An6 c2189821An6, AbstractC1255880imo<?, ?> abstractC1255880imo, JediViewModel<?> jediViewModel) {
            Object c098200Yq;
            HashMap<String, InterfaceC1255404vg> mapLIZ;
            InterfaceC1255404vg interfaceC1255404vg;
            String str = this.LIZ;
            Object obj = null;
            try {
                C1255204ve.LIZ.getClass();
                IVisualSearchDetailPageOperatorService iVisualSearchDetailPageOperatorService = C1255204ve.LIZIZ;
                if (iVisualSearchDetailPageOperatorService != null && (mapLIZ = iVisualSearchDetailPageOperatorService.LIZ()) != null && (interfaceC1255404vg = mapLIZ.get(str)) != null) {
                    c098200Yq = interfaceC1255404vg.LIZ(c2189821An6, abstractC1255880imo, jediViewModel);
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
            return (InterfaceC1603360rpG) obj;
        }
    }));

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        return this.LIZ;
    }
}
