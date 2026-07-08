package com.ss.android.ugc.aweme.common;

import X.C1733106qX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveEventObserver<T> implements LifecycleEventObserver, Observer<T> {
    public static final /* synthetic */ int LLILZIL = 0;
    public NextLiveData<T> LL;
    public LifecycleOwner LLILLJJLI;
    public Observer<? super T> LLILLL;
    public final List<T> LLILZ = new ArrayList();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.STARTED)) {
            Observer<? super T> observer = this.LLILLL;
            if (observer != null) {
                observer.onChanged(t);
                return;
            }
            return;
        }
        ((ArrayList) this.LLILZ).add(t);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle;
        if (C1733106qX.LIZ[event.ordinal()] == 1) {
            NextLiveData<T> nextLiveData = this.LL;
            if (nextLiveData != null) {
                nextLiveData.removeObserver(this);
            }
            this.LL = null;
            LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            this.LLILLJJLI = null;
            ((ArrayList) this.LLILZ).clear();
            this.LLILLL = null;
            return;
        }
        if (lifecycleOwner != this.LLILLJJLI) {
            return;
        }
        if (event != Lifecycle.Event.ON_START && event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        int size = ((ArrayList) this.LLILZ).size();
        for (int i = 0; i < size; i++) {
            Observer<? super T> observer = this.LLILLL;
            if (observer != null) {
                observer.onChanged((Object) ListProtector.get(this.LLILZ, i));
            }
        }
        ((ArrayList) this.LLILZ).clear();
    }

    public LiveEventObserver(NextLiveData<T> nextLiveData, LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        Lifecycle lifecycle;
        this.LL = nextLiveData;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = observer;
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        NextLiveData<T> nextLiveData2 = this.LL;
        if (nextLiveData2 != null) {
            nextLiveData2.observeForever(this);
        }
    }
}
