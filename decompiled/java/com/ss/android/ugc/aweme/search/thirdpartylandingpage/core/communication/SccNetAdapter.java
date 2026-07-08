package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.communication;

import X.C080U;
import X.C0X9S;
import X.C1496940p3c;
import X.C1496960p3e;
import X.C19719512Dh;
import X.C786410Ut5;
import X.InterfaceC1485405rg;
import X.InterfaceC1489790os5;
import X.InterfaceC1501010pAB;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC1501360pAk;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import Y.ARunnableS12S0310000_23;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public final class SccNetAdapter implements InterfaceC1489790os5 {
    public ExecutorService LIZ;

    public interface TTNetAdapterApi {
        @InterfaceC1501160pAQ
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088649", "x-tt-pns-dt-pass-id: 268959745"})
        C0X9S<TypedInput> doGet(@InterfaceC2174708fZ String str, @InterfaceC820680WHi boolean z, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501010pAB(method = "{CUSTOM}")
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088649", "x-tt-pns-dt-pass-id: 268959745"})
        C0X9S<TypedInput> send(@InterfaceC1501360pAk("CUSTOM") String str, @InterfaceC2174708fZ String str2, @InterfaceC820680WHi boolean z, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2177008fw Object obj, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
    }

    public final Map<String, List<String>> LIZIZ(List<C080U> list) {
        if (list != null && !list.isEmpty()) {
            HashMap map = new HashMap();
            for (C080U c080u : list) {
                if (c080u != null) {
                    if (map.get(c080u.LIZ) == null) {
                        map.put(c080u.LIZ, new ArrayList());
                    }
                    List list2 = (List) map.get(c080u.LIZ);
                    if (C19719512Dh.LJI(list2)) {
                        list2.add(c080u.LIZIZ);
                    }
                }
            }
            return map;
        }
        return null;
    }

    @Override // X.InterfaceC1489790os5
    public final void LIZ(C1496960p3e c1496960p3e, C1496940p3c c1496940p3c, boolean z) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = C786410Ut5.d4(3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        ExecutorService executorService = this.LIZ;
        if (executorService != null) {
            executorService.execute(new ARunnableS12S0310000_23(this, c1496960p3e, z, c1496940p3c, 1));
        }
    }
}
