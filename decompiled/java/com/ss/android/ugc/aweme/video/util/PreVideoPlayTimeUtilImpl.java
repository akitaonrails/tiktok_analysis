package com.ss.android.ugc.aweme.video.util;

import X.C08XD;
import X.C1227904rF;
import X.C1321805Fg;
import X.C1322005Fi;
import X.C1322105Fj;
import X.C23250099c;
import X.C584250Mvn;
import Y.AComparatorS21S0000000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PreVideoPlayTimeUtilImpl implements IPreVideoPlayTimeUtil {
    @Override // com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil
    public final Map<String, String> LIZIZ() {
        String str;
        C1322105Fj.LLILLJJLI.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : C1322105Fj.LIZ().getAll().entrySet()) {
            try {
                C1322105Fj.LLILLJJLI.getClass();
                C1227904rF c1227904rF = (C1227904rF) C1322105Fj.LLILZIL.getValue();
                String strValueOf = String.valueOf(entry.getValue());
                c1227904rF.getClass();
                arrayList.add(C1227904rF.LIZIZ(strValueOf, C1322005Fi.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS21S0000000_2(1));
        }
        C1322005Fi c1322005Fi = arrayList.isEmpty() ^ true ? (C1322005Fi) ListProtector.get(arrayList, 0) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1322005Fi != null && (str = c1322005Fi.LIZ) != null) {
            linkedHashMap.put("pre_item_id", str);
            linkedHashMap.put("pre_item_playtime", String.valueOf(C584250Mvn.LIZIZ.getLong(str, 0L)));
            Long l = (Long) ((LinkedHashMap) C584250Mvn.LIZJ).get(str);
            linkedHashMap.put("pre_item_watch_time", String.valueOf(l != null ? l.longValue() : 0L));
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil
    public final void LIZ(String str) {
        C1322105Fj c1322105Fj = C1322105Fj.LLILLJJLI;
        c1322105Fj.getClass();
        C23250099c.LIZLLL(c1322105Fj, null, null, new C1321805Fg(str, null), 3);
    }
}
