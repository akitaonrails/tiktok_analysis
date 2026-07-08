package com.bytedance.ies.sdk.datachannel;

import X.C19719512Dh;
import X.C500270Jjd;
import X.C500280Jje;
import X.InterfaceC207249167z;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class NextLiveData<T> extends MutableLiveData<T> implements InterfaceC207249167z<T> {
    public static final C500280Jje Companion = new Object() { // from class: X.0Jje
    };
    public T mInitialValue;
    public int mLatestVersion = -1;
    public final Map<Function1<T, Unit>, C500270Jjd<T>> nextObserverMap = new ConcurrentHashMap();

    public final void forceClearObserver$live_datachannel_release() {
        Iterator<Map.Entry<Function1<T, Unit>, C500270Jjd<T>>> it2 = this.nextObserverMap.entrySet().iterator();
        while (it2.hasNext()) {
            removeObserver(it2.next().getValue());
        }
        this.nextObserverMap.clear();
    }

    public NextLiveData() {
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        T t = (T) super.getValue();
        return t == null ? this.mInitialValue : t;
    }

    public final int getMLatestVersion$live_datachannel_release() {
        return this.mLatestVersion;
    }

    public NextLiveData(T t) {
        this.mInitialValue = t;
    }

    public final Observer<T> getRealObserver(Function1<? super T, Unit> function1) {
        return this.nextObserverMap.get(function1);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (t != null) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        super.removeObserver(observer);
        if (observer instanceof C500270Jjd) {
            if (DataChannel.LLILZLL) {
                Map<Function1<T, Unit>, C500270Jjd<T>> map = this.nextObserverMap;
                C19719512Dh.LIZJ(map).remove(((C500270Jjd) observer).LL);
                return;
            }
            for (Map.Entry<Function1<T, Unit>, C500270Jjd<T>> entry : this.nextObserverMap.entrySet()) {
                Function1<T, Unit> key = entry.getKey();
                if (Intrinsics.LJFF(observer, entry.getValue())) {
                    if (key == null) {
                        return;
                    }
                    this.nextObserverMap.remove(key);
                    return;
                }
            }
        }
    }

    public final void setMLatestVersion$live_datachannel_release(int i) {
        this.mLatestVersion = i;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(T t) {
        if (t != null) {
            this.mLatestVersion++;
            super.setValue(t);
        }
    }

    public final C500270Jjd<T> observeForever(Function1<? super T, Unit> function1, boolean z) {
        if (this.nextObserverMap.containsKey(function1)) {
            return this.nextObserverMap.get(function1);
        }
        C500270Jjd<T> c500270Jjd = new C500270Jjd<>(function1, z, this);
        this.nextObserverMap.put(function1, c500270Jjd);
        super.observeForever(c500270Jjd);
        return c500270Jjd;
    }

    public final C500270Jjd<T> observe(LifecycleOwner lifecycleOwner, Function1<? super T, Unit> function1, boolean z) {
        if (this.nextObserverMap.containsKey(function1)) {
            return this.nextObserverMap.get(function1);
        }
        C500270Jjd<T> c500270Jjd = new C500270Jjd<>(function1, z, this);
        this.nextObserverMap.put(function1, c500270Jjd);
        super.observe(lifecycleOwner, c500270Jjd);
        return c500270Jjd;
    }
}
