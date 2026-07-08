package com.bytedance.jedi.arch;

import X.C01GW;
import X.C194559119x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelEnsuranceKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class lifecycleAwareLazy<T extends ViewModel> implements C01GW<T>, Serializable, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final Function0<String> LLILLJJLI;
    public Function0<? extends T> LLILLL;
    public volatile Object LLILZ;
    public final lifecycleAwareLazy<T> LLILZIL;

    public static /* synthetic */ void getValue$annotations() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onStart();
        }
    }

    @Override // X.C01GW
    public T getValue() {
        T tInvoke;
        Object obj = this.LLILZ;
        C194559119x c194559119x = C194559119x.LIZ;
        if (obj != c194559119x) {
            return (T) obj;
        }
        synchronized (this.LLILZIL) {
            try {
                Object obj2 = this.LLILZ;
                if (obj2 != c194559119x) {
                    tInvoke = (T) obj2;
                } else {
                    tInvoke = this.LLILLL.invoke();
                    this.LLILZ = tInvoke;
                    this.LLILLL = null;
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
        return this.LLILZ != C194559119x.LIZ;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.LLILLJJLI == null) {
            this.LL.getLifecycle().removeObserver(this);
        } else {
            LIZ(this.LL, getValue(), this.LLILLJJLI);
        }
    }

    public String toString() {
        return isInitialized() ? getValue().toString() : "Lazy value not initialized yet.";
    }

    public lifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<? extends T> function0) {
        this(lifecycleOwner, null, function0);
    }

    public lifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<String> function0, Function0<? extends T> function02) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = C194559119x.LIZ;
        this.LLILZIL = this;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public void LIZ(LifecycleOwner lifecycleOwner, T t, Function0<String> function0) {
        ViewModelEnsuranceKt.ensureViewModel((Fragment) lifecycleOwner, t, function0);
    }
}
