package com.ss.android.ugc.aweme.minis.perf.prefetch;

import X.C04TD;
import X.C093Y;
import X.C1504420pFg;
import X.C1504430pFh;
import X.C1504440pFi;
import X.C1504480pFm;
import X.C1504500pFo;
import X.C2195221Avo;
import X.C23250099c;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.perf.prefetch.api.IMinisPrefetchService;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchServiceImpl implements IMinisPrefetchService {
    public final Map<String, C1504440pFi> LIZ = new LinkedHashMap();
    public final Map<String, Set<String>> LIZIZ = new LinkedHashMap();
    public final Map<String, List<C1504500pFo>> LIZJ = new LinkedHashMap();

    public static IMinisPrefetchService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IMinisPrefetchService.class, false);
        if (objLIZ != null) {
            return (IMinisPrefetchService) objLIZ;
        }
        if (C04TD.o2 == null) {
            synchronized (IMinisPrefetchService.class) {
                if (C04TD.o2 == null) {
                    C04TD.o2 = new MinisPrefetchServiceImpl();
                }
            }
        }
        return C04TD.o2;
    }

    @Override // com.ss.android.ugc.aweme.minis.perf.prefetch.api.IMinisPrefetchService
    public final void LIZJ(String str) {
        this.LIZIZ.remove(str);
        this.LIZ.remove(str);
        this.LIZJ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.minis.perf.prefetch.api.IMinisPrefetchService
    public final void LIZ(String str, AwS602S0100000_23 awS602S0100000_23) {
        if (!MinisPerfConfigSettings.LIZ().apiPrefetchEnabled) {
            awS602S0100000_23.invoke(C1504480pFm.LJII);
            return;
        }
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ != null) {
            Set<String> setLJ = (Set) ((LinkedHashMap) this.LIZIZ).get(strLIZ);
            if (setLJ != null && !setLJ.isEmpty()) {
                if (setLJ.contains(str)) {
                    awS602S0100000_23.invoke(C1504480pFm.LJIIIIZZ);
                    return;
                }
            } else {
                setLJ = C093Y.LJ(str);
                this.LIZIZ.put(strLIZ, setLJ);
            }
            setLJ.add(str);
            C1504440pFi c1504440pFi = (C1504440pFi) ((LinkedHashMap) this.LIZ).get(strLIZ);
            if (c1504440pFi == null) {
                C1504500pFo c1504500pFo = new C1504500pFo(str, awS602S0100000_23);
                List<C1504500pFo> arrayList = (List) ((LinkedHashMap) this.LIZJ).get(strLIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(c1504500pFo);
                this.LIZJ.put(strLIZ, arrayList);
                return;
            }
            C23250099c.LIZLLL(c1504440pFi.LIZLLL, null, null, new C1504430pFh(c1504440pFi, str, awS602S0100000_23, null), 3);
            return;
        }
        awS602S0100000_23.invoke(C1504480pFm.LJFF);
    }

    @Override // com.ss.android.ugc.aweme.minis.perf.prefetch.api.IMinisPrefetchService
    public final void LIZIZ(SchemaParserData schemaParserData, String str) {
        String str2;
        if (MinisPerfConfigSettings.LIZ().apiPrefetchEnabled && (str2 = schemaParserData.clientKey) != null) {
            C1504440pFi c1504440pFi = (C1504440pFi) ((LinkedHashMap) this.LIZ).get(str2);
            if (c1504440pFi == null) {
                c1504440pFi = new C1504440pFi(schemaParserData, str2);
            }
            this.LIZ.put(str2, c1504440pFi);
            C23250099c.LIZLLL(c1504440pFi.LIZLLL, null, null, new C1504420pFg(c1504440pFi, str, null), 3);
            List<C1504500pFo> list = (List) ((LinkedHashMap) this.LIZJ).get(str2);
            if (list != null) {
                for (C1504500pFo c1504500pFo : list) {
                    C23250099c.LIZLLL(c1504440pFi.LIZLLL, null, null, new C1504430pFh(c1504440pFi, c1504500pFo.LIZ, c1504500pFo.LIZIZ, null), 3);
                }
                this.LIZJ.remove(str2);
            }
        }
    }
}
