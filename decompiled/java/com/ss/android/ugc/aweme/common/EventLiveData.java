package com.ss.android.ugc.aweme.common;

import X.C1423905hl;
import X.C786410Ut5;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;

/* JADX INFO: loaded from: classes3.dex */
public final class EventLiveData<T> extends NextLiveData<T> {
    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(final T t) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            setValue(t);
        } else {
            C786410Ut5.LJJZZIII(C1423905hl.LIZ, new Runnable(this, t) { // from class: X.05hk
                public final MutableLiveData<T> LL;
                public final T LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EventLiveDataSetter$SetValRunnable@ba2.run");
                    try {
                        this.LL.setValue(this.LLILLJJLI);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EventLiveDataSetter$SetValRunnable@ba2.run");
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = this;
                    this.LLILLJJLI = t;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            new LiveEventObserver(this, lifecycleOwner, observer);
        }
    }

    public final LiveEventObserver<T> subscribe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        return new LiveEventObserver<>(this, lifecycleOwner, observer);
    }
}
