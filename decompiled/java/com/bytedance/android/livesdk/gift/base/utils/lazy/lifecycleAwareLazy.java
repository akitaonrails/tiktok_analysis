package com.bytedance.android.livesdk.gift.base.utils.lazy;

import X.C01GW;
import X.C13VC;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class lifecycleAwareLazy<T> implements C01GW<T>, Serializable {
    public static final int $stable = 8;
    public Function0<? extends T> LL;
    public volatile Object LLILLJJLI = C13VC.LIZ;
    public final lifecycleAwareLazy<T> LLILLL = this;
    public final LifecycleOwner owner;

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // X.C01GW
    public T getValue() {
        T tInvoke;
        T t = (T) this.LLILLJJLI;
        C13VC c13vc = C13VC.LIZ;
        if (t != c13vc) {
            return t;
        }
        synchronized (this.LLILLL) {
            try {
                tInvoke = (T) this.LLILLJJLI;
                if (tInvoke == c13vc) {
                    tInvoke = this.LL.invoke();
                    this.LLILLJJLI = tInvoke;
                    this.LL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }

    @Override // X.C01GW
    public boolean isInitialized() {
        return this.LLILLJJLI != C13VC.LIZ;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public lifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<? extends T> function0) {
        this.owner = lifecycleOwner;
        this.LL = function0;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.bytedance.android.livesdk.gift.base.utils.lazy.lifecycleAwareLazy.1
            public final /* synthetic */ lifecycleAwareLazy<T> LL;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_CREATE) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onStart() {
                if (!this.LL.isInitialized()) {
                    this.LL.getValue();
                }
                this.LL.owner.getLifecycle().removeObserver(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = this;
            }
        });
    }
}
