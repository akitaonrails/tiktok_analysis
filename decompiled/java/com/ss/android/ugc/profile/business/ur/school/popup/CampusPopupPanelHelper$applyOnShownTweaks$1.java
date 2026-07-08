package com.ss.android.ugc.profile.business.ur.school.popup;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public final class CampusPopupPanelHelper$applyOnShownTweaks$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart(androidx.lifecycle.LifecycleOwner r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.fragment.app.Fragment
            r5 = 0
            if (r0 == 0) goto L12
            r0 = r7
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L12
            android.view.View r2 = r0.getView()
        Le:
            r4 = 0
            if (r2 == 0) goto L14
            goto L16
        L12:
            r2 = r5
            goto Le
        L14:
            r0 = r5
            goto L39
        L16:
            r0 = 2131368636(0x7f0a1abc, float:1.8357228E38)
            android.view.View r1 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L3d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L14
            r0 = 1
            android.view.View r1 = r1.getChildAt(r0)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r1 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L14
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L14
            android.view.View r0 = r1.getChildAt(r4)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L14
            r0.setBackgroundColor(r4)     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3d
        L39:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3d
            goto L49
        L3d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L49:
            if (r2 == 0) goto La6
            r0 = 2131364390(0x7f0a0a26, float:1.8348616E38)
            android.view.View r3 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> Laa
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto La6
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L84
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L84
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Laa
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Throwable -> Laa
            int r0 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Throwable -> Laa
            r1.topMargin = r0     // Catch: java.lang.Throwable -> Laa
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Laa
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Throwable -> Laa
            int r0 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Throwable -> Laa
            r1.bottomMargin = r0     // Catch: java.lang.Throwable -> Laa
            X.C786410Ut5.d6(r3, r1)     // Catch: java.lang.Throwable -> Laa
        L84:
            int r2 = r3.getChildCount()     // Catch: java.lang.Throwable -> Laa
        L88:
            if (r4 >= r2) goto La4
            android.view.View r1 = r3.getChildAt(r4)     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r1 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto La1
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto La1
            int r0 = r1.getOrientation()     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto La1
            r0 = 48
            r1.setGravity(r0)     // Catch: java.lang.Throwable -> Laa
        La1:
            int r4 = r4 + 1
            goto L88
        La4:
            kotlin.Unit r5 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Laa
        La6:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> Laa
            goto Lb6
        Laa:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lb6:
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            r0.removeObserver(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.popup.CampusPopupPanelHelper$applyOnShownTweaks$1.onStart(androidx.lifecycle.LifecycleOwner):void");
    }
}
