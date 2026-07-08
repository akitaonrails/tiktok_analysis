package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack;

import X.C18ZQ;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public interface IActivityStackDependencyService extends IECommerceHostService {
    void addAppBackGroundListener(C18ZQ c18zq);

    void addNonWeakAppBackGroundListener(C18ZQ c18zq);

    Activity[] getActivityStack();

    Activity getTopActivity();

    Activity getValidTopActivity();

    boolean isAppBackGround();

    void removeAppBackGroundListener(C18ZQ c18zq);
}
