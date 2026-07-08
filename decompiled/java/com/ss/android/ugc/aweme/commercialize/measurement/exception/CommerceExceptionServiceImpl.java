package com.ss.android.ugc.aweme.commercialize.measurement.exception;

import X.C1013720cUE;
import X.C1017070cZd;
import X.C1022670cif;
import X.C1AF0;
import X.C2097608Jq;
import X.C257750A8f;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceExceptionServiceImpl implements ICommerceExceptionService {
    public static final Throwable LIZ = new Throwable("commerce_service_exception_global");

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.exception.ICommerceExceptionService
    public final void LIZ(C1013720cUE c1013720cUE, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        String string;
        if (!C257750A8f.LIZIZ && aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, ? extends Object> mapLJ = c1013720cUE.LJI;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            linkedHashMap.putAll(mapLJ);
            linkedHashMap.put("biz_tag", c1013720cUE.LJ);
            linkedHashMap.put("biz_refer", c1013720cUE.LJFF);
            Long creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
            if (creativeId != null && (string = creativeId.toString()) != null) {
                linkedHashMap.put("value", string);
                linkedHashMap.put("log_extra", awemeRawAdLJJIJLIJ.getLogExtra());
                C1022670cif.LIZ.getClass();
                linkedHashMap.put("session_info", C1022670cif.LIZ().LIZIZ(string));
            }
            if (c1013720cUE.LIZIZ) {
                Throwable th = c1013720cUE.LIZLLL;
                if (th == null) {
                    th = LIZ;
                }
                Intrinsics.LJFF(th, LIZ);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        arrayList.add(new Pair(key, value.toString()));
                    }
                }
                Npth.reportBizException(c1013720cUE.LIZ, th, c1013720cUE.LIZJ, C2097608Jq.LJIILLIIL(arrayList));
                return;
            }
            Throwable th2 = c1013720cUE.LIZLLL;
            if (th2 == null) {
                th2 = LIZ;
            }
            Intrinsics.LJFF(th2, LIZ);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 != null) {
                    arrayList2.add(new Pair(key2, value2.toString()));
                }
            }
            C1AF0.LJI(th2, c1013720cUE.LIZJ, C2097608Jq.LJIILLIIL(arrayList2));
        }
    }
}
