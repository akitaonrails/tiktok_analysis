package com.bytedance.router.monitor.page;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FragmentRouter {
    public final String activityId;
    public final String activityName;
    public final WeakReference<Fragment> fragmentRef;
    public final String id;
    public final String name;
    public float pageHeight;
    public final String pageType;
    public float pageWidth;
    public final String parentId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentRouter)) {
            return false;
        }
        FragmentRouter fragmentRouter = (FragmentRouter) obj;
        return Intrinsics.LJFF(this.id, fragmentRouter.id) && Intrinsics.LJFF(this.name, fragmentRouter.name) && Intrinsics.LJFF(this.pageType, fragmentRouter.pageType) && Float.compare(this.pageWidth, fragmentRouter.pageWidth) == 0 && Float.compare(this.pageHeight, fragmentRouter.pageHeight) == 0 && Intrinsics.LJFF(this.parentId, fragmentRouter.parentId) && Intrinsics.LJFF(this.activityName, fragmentRouter.activityName) && Intrinsics.LJFF(this.activityId, fragmentRouter.activityId) && Intrinsics.LJFF(this.fragmentRef, fragmentRouter.fragmentRef);
    }

    public final void setPageHeight(float f) {
        this.pageHeight = f;
    }

    public final void setPageWidth(float f) {
        this.pageWidth = f;
    }

    public FragmentRouter(String str, String str2, String str3, float f, float f2, String str4, String str5, String str6, WeakReference<Fragment> weakReference) {
        this.id = str;
        this.name = str2;
        this.pageType = str3;
        this.pageWidth = f;
        this.pageHeight = f2;
        this.parentId = str4;
        this.activityName = str5;
        this.activityId = str6;
        this.fragmentRef = weakReference;
    }
}
