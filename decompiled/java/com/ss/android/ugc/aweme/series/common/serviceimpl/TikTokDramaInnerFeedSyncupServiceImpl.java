package com.ss.android.ugc.aweme.series.common.serviceimpl;

import com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService;
import com.ss.android.ugc.aweme.service.ProgressRecord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TikTokDramaInnerFeedSyncupServiceImpl implements IDramaInnerFeedSyncupService {
    public ProgressRecord LIZIZ;

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final boolean LIZIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final void LIZLLL(Long l) {
    }

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final ProgressRecord LIZ(Long l) {
        ProgressRecord progressRecord = this.LIZIZ;
        if (progressRecord != null && Intrinsics.LJFF(progressRecord.collectionId, l)) {
            return progressRecord;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088 A[PHI: r6
      0x0088: PHI (r6v1 boolean) = (r6v0 boolean), (r6v5 boolean) binds: [B:40:0x0085, B:18:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Long r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, float r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.TikTokDramaInnerFeedSyncupServiceImpl.LIZJ(java.lang.Long, com.ss.android.ugc.aweme.feed.model.Aweme, float):void");
    }
}
