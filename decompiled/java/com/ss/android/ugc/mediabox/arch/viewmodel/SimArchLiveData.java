package com.ss.android.ugc.mediabox.arch.viewmodel;

import X.C1C7U;
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
public class SimArchLiveData<T> extends MutableLiveData<T> {
    public static Handler sMainHandler = new BPEAHandler(Looper.getMainLooper());
    public int mLatestVersion = -1;
    public Map<Observer, SimArchLiveData<T>.a<T>> nextObserverMap = new HashMap();

    public class a<R> implements Observer<R> {
        public final int LL;
        public final Observer<? super R> LLILLJJLI;
        public final boolean LLILLL;

        @Override // androidx.lifecycle.Observer
        public final void onChanged(R r) {
            if (!this.LLILLL && this.LL >= SimArchLiveData.this.mLatestVersion) {
                return;
            }
            this.LLILLJJLI.onChanged(r);
        }

        public a(int i, Observer<? super R> observer, boolean z) {
            this.LL = i;
            this.LLILLJJLI = observer;
            this.LLILLL = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$postValue$0(Object obj) {
        C1C7U.LIZ("SimArchLiveData@3cf.postValue$1L");
        setValue(obj);
        C1C7U.LIZIZ("SimArchLiveData@3cf.postValue$1L");
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<? super T> observer) {
        observeForever(observer, false);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        C786410Ut5.LJJZZIII(sMainHandler, new ARunnableS73S0200000_4(this, t, 52));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        SimArchLiveData<T>.a<T> aVarRemove = this.nextObserverMap.remove(observer);
        if (aVarRemove != null) {
            super.removeObserver(aVarRemove);
            return;
        }
        if (observer instanceof a) {
            for (Map.Entry<Observer, SimArchLiveData<T>.a<T>> entry : this.nextObserverMap.entrySet()) {
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
        SimArchLiveData<T>.a<T> aVar = new a<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, aVar);
        super.observeForever(aVar);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        SimArchLiveData<T>.a<T> aVar = new a<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, aVar);
        super.observe(lifecycleOwner, aVar);
    }
}
