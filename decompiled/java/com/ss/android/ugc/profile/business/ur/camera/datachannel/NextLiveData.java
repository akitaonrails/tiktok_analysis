package com.ss.android.ugc.profile.business.ur.camera.datachannel;

import X.C115W;
import X.C115X;
import X.InterfaceC21514819Hu;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.profile.business.ur.camera.datachannel.NextLiveData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class NextLiveData<T> extends MutableLiveData<T> implements InterfaceC21514819Hu<T> {
    public T initialValue;
    public int latestVersion = -1;
    public final Map<Function1<T, Unit>, C115W<T>> nextObserverMap = new ConcurrentHashMap();
    public static final C115X Companion = new Object() { // from class: X.115X
    };
    public static final int $stable = 8;

    public NextLiveData() {
    }

    public final int getLatestVersion$profile_release() {
        return this.latestVersion;
    }

    public NextLiveData(T t) {
        this.initialValue = t;
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        super.removeObserver(observer);
        if (observer instanceof C115W) {
            for (Map.Entry<Function1<T, Unit>, C115W<T>> entry : this.nextObserverMap.entrySet()) {
                Function1<T, Unit> key = entry.getKey();
                if (Intrinsics.LJFF(observer, entry.getValue())) {
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void setLatestVersion$profile_release(int i) {
        this.latestVersion = i;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(T t) {
        if (t != null) {
            this.latestVersion++;
            super.setValue(t);
        }
    }

    public final C115W<T> observe(LifecycleOwner lifecycleOwner, final Function1<? super T, Unit> function1, final boolean z) {
        C115W<T> c115w = this.nextObserverMap.get(function1);
        if (c115w != null) {
            return c115w;
        }
        Observer<T> observer = new Observer<T>(function1, z, this) { // from class: X.115W
            public final Function1<T, Unit> LL;
            public final boolean LLILLJJLI;
            public final NextLiveData<T> LLILLL;
            public final int LLILZ;

            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                if (!this.LLILLJJLI && this.LLILZ >= this.LLILLL.getLatestVersion$profile_release()) {
                    return;
                }
                this.LL.invoke(t);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = function1;
                this.LLILLJJLI = z;
                this.LLILLL = this;
                this.LLILZ = this.getLatestVersion$profile_release();
            }
        };
        this.nextObserverMap.put((Function1<T, Unit>) function1, (C115W<T>) observer);
        super.observe(lifecycleOwner, observer);
        return observer;
    }
}
