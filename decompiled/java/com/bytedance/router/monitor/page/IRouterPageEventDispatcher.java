package com.bytedance.router.monitor.page;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes33.dex */
public interface IRouterPageEventDispatcher {
    void dispatchActivityCreated(Object obj);

    void dispatchActivityDestroyed(Object obj);

    void dispatchActivityOpReached(Object obj, Intent intent, String str);

    void dispatchFragmentOnHiddenChanged(Object obj, boolean z);

    void dispatchFragmentOnPaused(Object obj);

    void dispatchFragmentOnResumed(Object obj);

    void dispatchFragmentOpReached(Fragment fragment, FragmentOpType fragmentOpType);

    void dispatchSmartRouteFailed(String str);

    void dispatchSmartRouteIntercepted(String str, String str2);

    void dispatchSmartRouteOpen(Context context, Intent intent, String str, String str2, String str3);

    void dispatchSmartRouteSuccess(String str);
}
