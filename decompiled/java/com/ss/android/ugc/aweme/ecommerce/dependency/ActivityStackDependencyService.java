package com.ss.android.ugc.aweme.ecommerce.dependency;

import X.C04TD;
import X.C18ZN;
import X.C18ZQ;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class ActivityStackDependencyService implements IActivityStackDependencyService {
    public final ConcurrentHashMap<C18ZQ, C18ZN> appBackGroundListenersMap = new ConcurrentHashMap<>();
    public final Map<C18ZQ, C18ZN> weakAppBackGroundListenersMap = Collections.synchronizedMap(new WeakHashMap());

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity[] getActivityStack() {
        return ActivityStack.getActivityStack();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity getTopActivity() {
        return ActivityStack.getTopActivity();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public Activity getValidTopActivity() {
        return ActivityStack.getValidTopActivity();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public boolean isAppBackGround() {
        return ActivityStack.isAppBackGround();
    }

    public static IActivityStackDependencyService createIActivityStackDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IActivityStackDependencyService.class, z);
        if (objLIZ != null) {
            return (IActivityStackDependencyService) objLIZ;
        }
        if (C04TD.LLZL == null) {
            synchronized (IActivityStackDependencyService.class) {
                if (C04TD.LLZL == null) {
                    C04TD.LLZL = new ActivityStackDependencyService();
                }
            }
        }
        return C04TD.LLZL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void addAppBackGroundListener(final C18ZQ c18zq) {
        if (c18zq == null) {
            return;
        }
        ActivityStack.addAppBackGroundListener(new C18ZN(this, c18zq) { // from class: X.18ZO
            public final /* synthetic */ C18ZQ LL;

            @Override // X.C18ZN
            public final void onAppBackground() {
                this.LL.onAppBackground();
            }

            @Override // X.C18ZN
            public final void onAppForeground() {
                this.LL.onAppForeground();
            }

            {
                this.LL = c18zq;
                this.weakAppBackGroundListenersMap.put(c18zq, this);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void addNonWeakAppBackGroundListener(final C18ZQ c18zq) {
        if (c18zq == null) {
            return;
        }
        ActivityStack.addNonWeakAppBackGroundListener(new C18ZN(this, c18zq) { // from class: X.18ZP
            public final /* synthetic */ C18ZQ LL;

            @Override // X.C18ZN
            public final void onAppBackground() {
                this.LL.onAppBackground();
            }

            @Override // X.C18ZN
            public final void onAppForeground() {
                this.LL.onAppForeground();
            }

            {
                this.LL = c18zq;
                this.appBackGroundListenersMap.put(c18zq, this);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService
    public void removeAppBackGroundListener(C18ZQ c18zq) {
        if (c18zq == null) {
            return;
        }
        C18ZN c18znRemove = this.appBackGroundListenersMap.remove(c18zq);
        if (c18znRemove != null) {
            ActivityStack.removeAppBackGroundListener(c18znRemove);
        }
        C18ZN c18znRemove2 = this.weakAppBackGroundListenersMap.remove(c18zq);
        if (c18znRemove2 != null) {
            ActivityStack.removeAppBackGroundListener(c18znRemove2);
        }
    }
}
