package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack;

import X.C18ZQ;
import android.app.Activity;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultActivityStackDependencyService implements IActivityStackDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void addAppBackGroundListener(C18ZQ c18zq) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void addNonWeakAppBackGroundListener(C18ZQ c18zq) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity[] getActivityStack() {
        return new Activity[0];
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity getTopActivity() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity getValidTopActivity() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public boolean isAppBackGround() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void removeAppBackGroundListener(C18ZQ c18zq) {
    }
}
