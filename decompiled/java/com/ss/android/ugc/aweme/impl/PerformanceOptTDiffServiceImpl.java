package com.ss.android.ugc.aweme.impl;

import X.C2185491Ag7;
import X.C2185521AgA;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptMTDiffService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class PerformanceOptTDiffServiceImpl implements IPerformanceOptMTDiffService {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptMTDiffService
    public List<C2185491Ag7> getThreadBoostConfig() {
        return Collections.singletonList(new C2185491Ag7(1, Collections.singletonList(new C2185521AgA("droid.ugc.trill", 39)), null, null, 0L, 10000L, false, true, false, 1884));
    }
}
