package com.bytedance.android.widget;

import X.C328310Ctx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class NextLiveData<T> extends MutableLiveData<T> {
    public int mLatestVersion = -1;
    public Map<Observer, C328310Ctx> nextObserverMap = new HashMap();

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        C328310Ctx c328310CtxRemove = this.nextObserverMap.remove(observer);
        if (c328310CtxRemove != null) {
            super.removeObserver(c328310CtxRemove);
            return;
        }
        super.removeObserver(observer);
        if (observer instanceof C328310Ctx) {
            for (Map.Entry<Observer, C328310Ctx> entry : this.nextObserverMap.entrySet()) {
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

    public void observeForever(Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        C328310Ctx c328310Ctx = new C328310Ctx(this, this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, c328310Ctx);
        super.observeForever(c328310Ctx);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        C328310Ctx c328310Ctx = new C328310Ctx(this, this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, c328310Ctx);
        super.observe(lifecycleOwner, c328310Ctx);
    }
}
