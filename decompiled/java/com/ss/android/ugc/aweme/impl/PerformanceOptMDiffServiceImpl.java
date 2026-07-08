package com.ss.android.ugc.aweme.impl;

import X.C2185491Ag7;
import X.C2185521AgA;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptMTDiffService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class PerformanceOptMDiffServiceImpl implements IPerformanceOptMTDiffService {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptMTDiffService
    public final List<C2185491Ag7> getThreadBoostConfig() {
        return Collections.singletonList(new C2185491Ag7(1, Collections.singletonList(new C2185521AgA("aoapp.musically", 39)), null, null, 0L, 10000L, false, true, false, 1884));
    }
}
