package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class NextLiveData<T> extends MutableLiveData<T> {
    public int mLatestVersion = -1;
    public Map<Observer, NextObserver> nextObserverMap = new HashMap();

    public class NextObserver<T> implements Observer<T> {
        public int initVersion;
        public boolean notifyWhenObserve;
        public Observer<T> observer;

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t) {
            if (!this.notifyWhenObserve && this.initVersion >= NextLiveData.this.mLatestVersion) {
                return;
            }
            this.observer.onChanged(t);
        }

        public NextObserver(int i, Observer<T> observer, boolean z) {
            this.initVersion = i;
            this.observer = observer;
            this.notifyWhenObserve = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<T> observer) {
        observeForever(observer, false);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<T> observer) {
        NextObserver nextObserverRemove = this.nextObserverMap.remove(observer);
        if (nextObserverRemove != null) {
            super.removeObserver(nextObserverRemove);
            return;
        }
        super.removeObserver(observer);
        if (observer instanceof NextObserver) {
            for (Map.Entry<Observer, NextObserver> entry : this.nextObserverMap.entrySet()) {
                if (observer.equals(entry.getValue())) {
                    Observer key = entry.getKey();
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
    public void observe(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        observe(lifecycleOwner, observer, false);
    }

    public void observeForever(Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextObserver nextObserver = new NextObserver(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, nextObserver);
        super.observeForever(nextObserver);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextObserver nextObserver = new NextObserver(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, nextObserver);
        super.observe(lifecycleOwner, nextObserver);
    }
}
