package com.ss.android.ugc.aweme.forward.statistics;

import X.C04TD;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardStatisticsServiceImpl implements IForwardStatisticsService {
    public static IForwardStatisticsService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IForwardStatisticsService.class, false);
        if (objLIZ != null) {
            return (IForwardStatisticsService) objLIZ;
        }
        if (C04TD.E0 == null) {
            synchronized (IForwardStatisticsService.class) {
                if (C04TD.E0 == null) {
                    C04TD.E0 = new ForwardStatisticsServiceImpl();
                }
            }
        }
        return C04TD.E0;
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final HashMap LIZ(Aweme aweme, String str) {
        HashMap map = new HashMap();
        map.put("enter_from", str);
        if (aweme != null) {
            map.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            map.put("group_id", aweme.getAid());
        }
        return map;
    }
}
