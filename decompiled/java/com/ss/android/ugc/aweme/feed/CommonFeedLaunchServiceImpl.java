package com.ss.android.ugc.aweme.feed;

import X.C04TD;
import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes13.dex */
public class CommonFeedLaunchServiceImpl implements ICommonFeedLaunchService {
    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZLLL() {
    }

    public static ICommonFeedLaunchService LJ() {
        Object objLIZ = C04TD.LIZ(ICommonFeedLaunchService.class, false);
        return objLIZ != null ? (ICommonFeedLaunchService) objLIZ : new CommonFeedLaunchServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZJ() {
        C1440005kM.LIZIZ(new IEvent() { // from class: X.0Szn
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZ(boolean z) {
        if (Feed0VVManager.LIZJ == null) {
            Feed0VVManager.LIZJ = Boolean.valueOf(z);
        }
    }
}
