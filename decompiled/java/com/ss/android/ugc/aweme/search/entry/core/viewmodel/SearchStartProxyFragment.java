package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.RouteIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchStartProxyFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGspJzshMWsvHELIOSJj02ZjMlLDg+JyEpJWEALSQ+KicAPCQ+PR8hJz01Dz0yLygpJzs=";
    public RouteIntent LL;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RouteIntent routeIntent = this.LL;
        if (routeIntent != null && routeIntent.getOnActivityResultCallback() != null) {
            RouteIntent routeIntent2 = this.LL;
            if (routeIntent2 != null) {
                OnActivityResultCallback onActivityResultCallback = routeIntent2.getOnActivityResultCallback();
                if (onActivityResultCallback != null) {
                    onActivityResultCallback.onActivityResult(i, i2, intent);
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
