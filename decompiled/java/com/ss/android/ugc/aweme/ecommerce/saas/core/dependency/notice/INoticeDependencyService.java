package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice;

import X.AbstractC1906720ziY;
import X.C1243910iTV;
import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes20.dex */
public interface INoticeDependencyService extends IECommerceHostService {
    void clearUnreadCount(int... iArr);

    AbstractC1906720ziY createNotificationChunk(C1243910iTV c1243910iTV, C19EG c19eg, Fragment fragment);

    int getUnreadSingleGroupSum(int... iArr);

    void sendShopNoticeCountChangeEvent();
}
