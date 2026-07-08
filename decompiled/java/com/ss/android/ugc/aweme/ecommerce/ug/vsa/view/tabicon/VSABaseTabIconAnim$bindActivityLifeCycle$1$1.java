package com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.tabicon;

import X.AbstractC996220c20;
import X.C19EG;
import android.animation.AnimatorSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes17.dex */
public final class VSABaseTabIconAnim$bindActivityLifeCycle$1$1 implements LifecycleEventObserver {
    public final /* synthetic */ AbstractC996220c20 LL;
    public final /* synthetic */ AnimatorSet LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AnimatorSet animatorSet;
        if (event == Lifecycle.Event.ON_DESTROY && (animatorSet = this.LL.LIZIZ) != null && animatorSet.isRunning()) {
            try {
                this.LLILLJJLI.cancel();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLILLL.getLifecycle().removeObserver(this);
        }
    }

    public VSABaseTabIconAnim$bindActivityLifeCycle$1$1(AbstractC996220c20 abstractC996220c20, AnimatorSet animatorSet, C19EG c19eg) {
        this.LL = abstractC996220c20;
        this.LLILLJJLI = animatorSet;
        this.LLILLL = c19eg;
    }
}
