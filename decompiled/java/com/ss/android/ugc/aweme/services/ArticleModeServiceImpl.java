package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C04TD;
import X.C1395020mPE;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ArticleModeServiceImpl implements IArticleModeService {
    public final C01GW articleRssService$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(358));
    public final C01GW articleAnchorService$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(357));

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeAnchorService getArticleAnchorService() {
        return (IArticleModeAnchorService) this.articleAnchorService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeRssService getArticleRssService() {
        return (IArticleModeRssService) this.articleRssService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeLoggingService getArticleLoggingService() {
        return C1395020mPE.LIZ;
    }

    public static IArticleModeService createIArticleModeServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IArticleModeService.class, z);
        if (objLIZ != null) {
            return (IArticleModeService) objLIZ;
        }
        if (C04TD.x4 == null) {
            synchronized (IArticleModeService.class) {
                if (C04TD.x4 == null) {
                    C04TD.x4 = new ArticleModeServiceImpl();
                }
            }
        }
        return C04TD.x4;
    }
}
