package com.bytedance.tux.common.live_data;

import X.C328330Ctz;
import X.C786410Ut5;
import Y.ARunnableS73S0200000_4;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NextLiveData<T> extends MutableLiveData<T> {
    public static final C328330Ctz Companion = new Object() { // from class: X.0Ctz
    };
    public static final Handler sMainHandler = new BPEAHandler(Looper.getMainLooper());
    public int mLatestVersion = -1;
    public final HashMap<Observer<? super T>, NextLiveData<T>.b<? super T>> nextObserverMap = new HashMap<>();

    public final class b<R> implements Observer<R> {
        public final int LL;
        public final Observer<R> LLILLJJLI;
        public final boolean LLILLL;

        @Override // androidx.lifecycle.Observer
        public final void onChanged(R r) {
            if (!this.LLILLL && this.LL >= NextLiveData.this.mLatestVersion) {
                return;
            }
            this.LLILLJJLI.onChanged(r);
        }

        public b(int i, Observer<R> observer, boolean z) {
            this.LL = i;
            this.LLILLJJLI = observer;
            this.LLILLL = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<? super T> observer) {
        observeForever(observer, false);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        C786410Ut5.LJJZZIII(sMainHandler, new ARunnableS73S0200000_4(this, t, 3));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        NextLiveData<T>.b<? super T> bVarRemove = this.nextObserverMap.remove(observer);
        if (bVarRemove != null) {
            super.removeObserver(bVarRemove);
            return;
        }
        if (observer instanceof b) {
            for (Map.Entry<Observer<? super T>, NextLiveData<T>.b<? super T>> entry : this.nextObserverMap.entrySet()) {
                if (Intrinsics.LJFF(observer, entry.getValue())) {
                    Observer<? super T> key = entry.getKey();
                    super.removeObserver(observer);
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        observe(lifecycleOwner, observer, false);
    }

    public final void observeForever(Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<? super T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observeForever(bVar);
    }

    public final void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<? super T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observe(lifecycleOwner, bVar);
    }
}
