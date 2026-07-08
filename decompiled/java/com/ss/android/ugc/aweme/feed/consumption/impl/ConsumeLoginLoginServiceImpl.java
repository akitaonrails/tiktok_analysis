package com.ss.android.ugc.aweme.feed.consumption.impl;

import X.C04TD;
import X.C2252051DCp;
import X.RunnableC486940J7s;
import com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsumeLoginLoginServiceImpl implements IFeedConsumeLoginService {
    public static IFeedConsumeLoginService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IFeedConsumeLoginService.class, false);
        if (objLIZ != null) {
            return (IFeedConsumeLoginService) objLIZ;
        }
        if (C04TD.r0 == null) {
            synchronized (IFeedConsumeLoginService.class) {
                if (C04TD.r0 == null) {
                    C04TD.r0 = new ConsumeLoginLoginServiceImpl();
                }
            }
        }
        return C04TD.r0;
    }

    @Override // com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService
    public final void LIZ() {
        C2252051DCp.LIZ.getClass();
        C2252051DCp.LJFF().execute(RunnableC486940J7s.LL);
    }

    @Override // com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService
    public final void LIZJ() {
        C2252051DCp.LIZ.getClass();
        C2252051DCp.LJFF().execute(RunnableC486940J7s.LL);
    }
}
