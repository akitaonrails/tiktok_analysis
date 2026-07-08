package com.ss.android.ugc.aweme.commercialize.utils;

import X.C04TD;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class NoticeChallengePropertyUtilImpl implements NoticeChallengePropertyUtil {
    public static NoticeChallengePropertyUtil LIZ() {
        Object objLIZ = C04TD.LIZ(NoticeChallengePropertyUtil.class, false);
        if (objLIZ != null) {
            return (NoticeChallengePropertyUtil) objLIZ;
        }
        if (C04TD.LLLJ == null) {
            synchronized (NoticeChallengePropertyUtil.class) {
                if (C04TD.LLLJ == null) {
                    C04TD.LLLJ = new NoticeChallengePropertyUtilImpl();
                }
            }
        }
        return C04TD.LLLJ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil
    public final void LJ(Challenge challenge) {
        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJ(challenge);
    }
}
