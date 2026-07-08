package com.ss.android.ugc.aweme.im.saas.host.impl.vibefeed;

import X.C1557990qe5;
import X.C869590Y9l;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService;

/* JADX INFO: loaded from: classes12.dex */
public final class VibeFeedRuntimeFeatureImpl implements VibeFeedRuntimeFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final void LIZ() {
        IVibeFeedService iVibeFeedService = (IVibeFeedService) PluggableExtentionKt.pluggableSpi$default(IVibeFeedService.class, false, false, false, 14, null);
        if (iVibeFeedService != null) {
            iVibeFeedService.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final boolean LJFF() {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        return iVibeEntranceServiceLIZ != null && iVibeEntranceServiceLIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final boolean LIZIZ(String str) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            return iVibeEntranceServiceLIZ.LIZIZ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final boolean LIZLLL(String str) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            return iVibeEntranceServiceLIZ.LIZLLL(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final void LJ(C869590Y9l c869590Y9l) {
        IVibeFeedService iVibeFeedService = (IVibeFeedService) PluggableExtentionKt.pluggableSpi$default(IVibeFeedService.class, false, false, false, 14, null);
        if (iVibeFeedService != null) {
            iVibeFeedService.LJ(c869590Y9l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature
    public final void LIZJ(Context context, String str, IMUser iMUser, String str2, String str3, String str4) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LIZJ(context, str, iMUser, str2, str3, str4);
        }
    }
}
