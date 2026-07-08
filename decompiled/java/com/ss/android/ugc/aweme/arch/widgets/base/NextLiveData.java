package com.ss.android.ugc.aweme.arch.widgets.base;

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

/* JADX INFO: loaded from: classes5.dex */
public class NextLiveData<T> extends MutableLiveData<T> {
    public static Handler sMainHandler = new BPEAHandler(Looper.getMainLooper());
    public int mLatestVersion = -1;
    public Map<Observer, NextLiveData<T>.b<T>> nextObserverMap = new HashMap();

    public class b<R> implements Observer<R> {
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
        C786410Ut5.LJJZZIII(sMainHandler, new ARunnableS73S0200000_4(t, this, 6));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        NextLiveData<T>.b<T> bVarRemove = this.nextObserverMap.remove(observer);
        if (bVarRemove != null) {
            super.removeObserver(bVarRemove);
            return;
        }
        if (observer instanceof b) {
            for (Map.Entry<Observer, NextLiveData<T>.b<T>> entry : this.nextObserverMap.entrySet()) {
                if (observer.equals(entry.getValue())) {
                    Observer key = entry.getKey();
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

    public void observeForever(Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observeForever(bVar);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observe(lifecycleOwner, bVar);
    }
}
