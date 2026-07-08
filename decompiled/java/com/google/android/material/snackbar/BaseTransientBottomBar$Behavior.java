package com.google.android.material.snackbar;

import X.C0V4M;
import X.C16G0;
import X.C19S6;
import X.C795500VIm;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes14.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final C795500VIm LJII = new Object(this) { // from class: X.0VIm
        {
            this.getClass();
            this.LJ = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.LJFF = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.LIZJ = 0;
        }
    };

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean LIZ(View view) {
        getClass();
        return view instanceof C19S6;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0V4M.LIZIZ == null) {
                    C0V4M.LIZIZ = new C0V4M();
                }
                synchronized (C0V4M.LIZIZ.LIZ) {
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else if (c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
            if (C0V4M.LIZIZ == null) {
                C0V4M.LIZIZ = new C0V4M();
            }
            C0V4M.LIZIZ.LIZ();
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }
}
