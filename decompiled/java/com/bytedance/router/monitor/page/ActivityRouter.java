package com.bytedance.router.monitor.page;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes36.dex */
public final class ActivityRouter {
    public final WeakReference<Activity> activityRef;
    public final String id;
    public final String name;
    public String redirectFragment;
    public final String traceId;

    public final void setRedirectFragment(String str) {
        this.redirectFragment = str;
    }

    public ActivityRouter(String str, String str2, String str3, String str4, WeakReference<Activity> weakReference) {
        this.id = str;
        this.traceId = str2;
        this.name = str3;
        this.redirectFragment = str4;
        this.activityRef = weakReference;
    }
}
