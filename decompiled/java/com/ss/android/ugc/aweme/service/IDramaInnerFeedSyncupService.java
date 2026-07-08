package com.ss.android.ugc.aweme.service;

import X.C1600860rlE;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public interface IDramaInnerFeedSyncupService {
    public static final C1600860rlE LIZ = C1600860rlE.LIZ;

    public static final class DowngradeInstance implements IDramaInnerFeedSyncupService {
        @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
        public final ProgressRecord LIZ(Long l) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
        public final boolean LIZIZ() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
        public final void LIZJ(Long l, Aweme aweme, float f) {
        }

        @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
        public final void LIZLLL(Long l) {
        }
    }

    ProgressRecord LIZ(Long l);

    boolean LIZIZ();

    void LIZJ(Long l, Aweme aweme, float f);

    void LIZLLL(Long l);
}
