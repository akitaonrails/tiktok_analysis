package com.ss.android.ugc.aweme.feed.utils;

import X.C1260910iuv;
import X.C1264800j1C;
import X.C2174831A9p;
import X.C698200Ra6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.IMafVideoLogService;

/* JADX INFO: loaded from: classes22.dex */
public final class MafVideoLogger implements IMafVideoLogService {
    @Override // com.ss.android.ugc.aweme.util.IMafVideoLogService
    public final Object LIZ(Aweme aweme, Object obj) {
        if (obj instanceof C1260910iuv) {
            C1260910iuv c1260910iuv = (C1260910iuv) obj;
            C698200Ra6.LIZ.getClass();
            c1260910iuv.LLFF = Boolean.valueOf(C698200Ra6.LIZIZ(aweme));
            c1260910iuv.LLFFF = Boolean.valueOf(C2174831A9p.LIZ(aweme, null));
            if (C1264800j1C.LIZIZ()) {
                c1260910iuv.LLFII = Boolean.valueOf(C698200Ra6.LIZIZ(aweme));
            }
        }
        return obj;
    }
}
