package com.ss.android.ugc.aweme.tako.router;

import X.AbstractC738140SxQ;
import X.AnonymousClass1999;
import X.C19EG;
import X.C294780Bgy;
import X.C724240Sb0;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.saf.SAFRoute;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: loaded from: classes33.dex */
public abstract class TakoRouteArg implements Parcelable, IRouteArg {
    public static final int $stable = 0;
    public final int enterAnim = -1;
    public final int exitAnim = -1;
    public final String path;

    public static /* synthetic */ void getPath$annotations() {
    }

    public int getEnterAnim() {
        return this.enterAnim;
    }

    public int getExitAnim() {
        return this.exitAnim;
    }

    public final String getPath() {
        return this.path;
    }

    public TakoRouteArg(String str) {
        this.path = str;
    }

    public final void open(Fragment fragment) {
        C19EG activity;
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = fragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        break;
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == null) {
                            break;
                        }
                    }
                }
            }
        }
        if (AnonymousClass1999.LIZ(interfaceC214902198i)) {
            SAFRoute sAFRouteSafNavigation = SmartRouter.safNavigation(interfaceC214902198i, this.path);
            sAFRouteSafNavigation.withNavArg(this);
            sAFRouteSafNavigation.withEnterAnimation(getEnterAnim(), getExitAnim());
            sAFRouteSafNavigation.withExitAnimation(getEnterAnim(), getExitAnim());
            sAFRouteSafNavigation.open(Integer.MIN_VALUE, null);
            return;
        }
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, this.path);
        smartRouteBuildRoute.withNavArg(this);
        smartRouteBuildRoute.withAnimation(getEnterAnim(), getExitAnim());
        smartRouteBuildRoute.open();
    }

    public final void open(AbstractC738140SxQ abstractC738140SxQ) {
        open(C724240Sb0.LJI(abstractC738140SxQ));
    }
}
