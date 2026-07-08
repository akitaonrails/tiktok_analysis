package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice;

import X.AbstractC1906720ziY;
import X.C1243910iTV;
import X.C19EG;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultNoticeDependencyService implements INoticeDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public void clearUnreadCount(int... iArr) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public AbstractC1906720ziY createNotificationChunk(C1243910iTV c1243910iTV, C19EG c19eg, Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public int getUnreadSingleGroupSum(int... iArr) {
        return 0;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public void sendShopNoticeCountChangeEvent() {
    }
}
