package com.ss.android.ugc.aweme.drama;

import X.C13BV;

/* JADX INFO: loaded from: classes29.dex */
public interface IDramaInterceptService {
    C13BV LIZ();

    public static final class DowngradeInstance implements IDramaInterceptService {
        @Override // com.ss.android.ugc.aweme.drama.IDramaInterceptService
        public final C13BV LIZ() {
            return C13BV.INSTANCE;
        }
    }
}
