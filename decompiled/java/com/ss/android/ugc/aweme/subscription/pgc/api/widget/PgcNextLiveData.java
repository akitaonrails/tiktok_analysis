package com.ss.android.ugc.aweme.subscription.pgc.api.widget;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class PgcNextLiveData<T> extends MutableLiveData<T> {
    public int mLatestVersion = -1;
    public final Map<Observer<? super T>, PgcNextLiveData<T>.a<T>> nextObserverMap = new ConcurrentHashMap();

    public final class a<R> implements Observer<R> {
        public final int LL;
        public final Observer<? super R> LLILLJJLI;
        public final boolean LLILLL;

        public a() {
            throw null;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(R r) {
            if (!this.LLILLL && this.LL >= PgcNextLiveData.this.mLatestVersion) {
                return;
            }
            this.LLILLJJLI.onChanged(r);
        }

        public a(int i, Observer observer, boolean z) {
            this.LL = i;
            this.LLILLJJLI = observer;
            this.LLILLL = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        PgcNextLiveData<T>.a<T> aVarRemove = this.nextObserverMap.remove(observer);
        if (aVarRemove != null) {
            super.removeObserver(aVarRemove);
            return;
        }
        super.removeObserver(observer);
        if (observer instanceof a) {
            for (Map.Entry<Observer<? super T>, PgcNextLiveData<T>.a<T>> entry : this.nextObserverMap.entrySet()) {
                if (observer.equals(entry.getValue())) {
                    Observer<? super T> key = entry.getKey();
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

    public void observeForever(Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        PgcNextLiveData<T>.a<T> aVar = new a<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, aVar);
        super.observeForever(aVar);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        PgcNextLiveData<T>.a<T> aVar = new a<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, aVar);
        super.observe(lifecycleOwner, aVar);
    }
}
