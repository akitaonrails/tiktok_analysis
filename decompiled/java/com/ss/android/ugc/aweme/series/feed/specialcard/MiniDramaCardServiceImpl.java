package com.ss.android.ugc.aweme.series.feed.specialcard;

import X.C0TRR;
import X.C11S5;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService;

/* JADX INFO: loaded from: classes5.dex */
public final class MiniDramaCardServiceImpl implements IMiniDramaCardService {
    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final C0TRR LIZ() {
        return new C0TRR() { // from class: X.0TPJ
            @Override // X.C0TRR
            public final int LIZIZ() {
                return 1;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
            @Override // X.C0TRR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r12, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r13, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r14) {
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0TPJ.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final void LIZIZ() {
        C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.0Bug
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MiniDramaCardServiceImpl@8a98.notifyDNUCardShow$1");
                try {
                    C303270Buf.LIZ.storeLong("DNU_CARD_SHOW_TIME", System.currentTimeMillis());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MiniDramaCardServiceImpl@8a98.notifyDNUCardShow$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final void LIZJ(final long j, final long j2) {
        C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.0Bue
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MiniDramaCardServiceImpl@8a98.notifyVideoProgress$1");
                try {
                    if (j2 - j >= ((Number) C0AUE.LIZ.getValue()).longValue()) {
                        Keva keva = C303270Buf.LIZ;
                        if (!keva.getBoolean("HAS_PLAY_10S", false)) {
                            keva.storeBoolean("HAS_PLAY_10S", true);
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MiniDramaCardServiceImpl@8a98.notifyVideoProgress$1");
            }
        });
    }
}
