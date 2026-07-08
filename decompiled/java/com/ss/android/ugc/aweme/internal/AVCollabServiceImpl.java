package com.ss.android.ugc.aweme.internal;

import X.C19EG;
import X.C214878197k;
import X.C21524119Lj;
import X.C2540509xT;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AVCollabServiceImpl implements IAVCollabService {
    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final boolean LIZ() {
        return C214878197k.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LIZIZ() {
        C214878197k.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final long LIZLLL() {
        return C214878197k.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJ() {
        C214878197k.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final boolean LJIIIZ() {
        return C214878197k.LIZIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final long LJI() {
        if (C2540509xT.LIZIZ()) {
            return C214878197k.LIZIZ.LJI();
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJFF(int i) {
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        iCollabEventTrackingServiceLJII.reportClickInviteCollab("video_post_page", z);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJII(int i) {
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        iCollabEventTrackingServiceLJII.reportShowInviteCollab("video_post_page", z);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LIZJ(C19EG c19eg, C21524119Lj c21524119Lj) {
        C214878197k.LIZIZ.LIZJ(c19eg, c21524119Lj);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJIIIIZZ(C19EG c19eg, List list, C21524119Lj c21524119Lj) {
        C214878197k.LIZIZ.LJIIL(c19eg, "video_post_page", list, c21524119Lj);
    }
}
