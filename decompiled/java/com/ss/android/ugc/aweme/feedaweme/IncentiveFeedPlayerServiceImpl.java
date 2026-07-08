package com.ss.android.ugc.aweme.feedaweme;

import X.C0R1H;
import X.C19EG;
import X.C19FO;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.touchpoint.api.service.IIncentiveFeedPlayerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.IFeedPlayerService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IncentiveFeedPlayerServiceImpl implements IIncentiveFeedPlayerService {
    @Override // com.bytedance.touchpoint.api.service.IIncentiveFeedPlayerService
    public final void LIZ(Activity activity) {
        IFeedPlayerService iFeedPlayerService;
        C19FO c19fo;
        Lifecycle.State stateLIZJ;
        Boolean boolValueOf = null;
        if ((activity instanceof C19EG) && (c19fo = (C19FO) activity) != null && (stateLIZJ = C0R1H.LIZJ(c19fo)) != null) {
            boolValueOf = Boolean.valueOf(stateLIZJ.isAtLeast(Lifecycle.State.RESUMED));
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && (iFeedPlayerService = (IFeedPlayerService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayerService.class, false, false, false, 14, null)) != null) {
            iFeedPlayerService.resume();
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveFeedPlayerService
    public final void LIZIZ(Activity activity) {
        IFeedPlayerService iFeedPlayerService;
        C19FO c19fo;
        Lifecycle.State stateLIZJ;
        Boolean boolValueOf = null;
        if ((activity instanceof C19EG) && (c19fo = (C19FO) activity) != null && (stateLIZJ = C0R1H.LIZJ(c19fo)) != null) {
            boolValueOf = Boolean.valueOf(stateLIZJ.isAtLeast(Lifecycle.State.RESUMED));
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && (iFeedPlayerService = (IFeedPlayerService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayerService.class, false, false, false, 14, null)) != null) {
            iFeedPlayerService.pause();
        }
    }
}
