package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C0RD4;
import X.C2511109sj;
import X.C786410Ut5;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner LLILLL;
    public Thread LLILZ;
    public final Map<String, Object> LL = new HashMap();
    public final Map<String, NextLiveData<C0RD4>> LLILLJJLI = new HashMap();
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public final AtomicInteger LLILZLL = new AtomicInteger(0);

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        ((HashMap) this.LL).clear();
        ((HashMap) this.LLILLJJLI).clear();
        this.LLILLL = null;
    }

    public final void AQ2(Observer observer) {
        if (observer == null) {
            return;
        }
        Iterator it2 = ((HashMap) this.LLILLJJLI).values().iterator();
        while (it2.hasNext()) {
            ((LiveData) it2.next()).removeObserver(observer);
        }
    }

    public final <T> T get(String str) {
        T t = (T) ((HashMap) this.LL).get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final NextLiveData<C0RD4> wQ2(String str) {
        NextLiveData<C0RD4> nextLiveData = (NextLiveData) ((HashMap) this.LLILLJJLI).get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (((HashMap) this.LL).containsKey(str)) {
                nextLiveData.setValue(new C0RD4(str, ((HashMap) this.LL).get(str)));
            }
            ((HashMap) this.LLILLJJLI).put(str, nextLiveData);
        }
        return nextLiveData;
    }

    public static DataCenter vQ2(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        DataCenter dataCenter = (DataCenter) viewModelProvider.get(DataCenter.class);
        dataCenter.LLILLL = lifecycleOwner;
        return dataCenter;
    }

    public final void BQ2(String str, Observer observer) {
        LiveData liveData;
        if (!TextUtils.isEmpty(str) && observer != null && (liveData = (LiveData) ((HashMap) this.LLILLJJLI).get(str)) != null) {
            liveData.removeObserver(observer);
        }
    }

    public final <T> T get(String str, T t) {
        if (!((HashMap) this.LL).containsKey(str)) {
            return t;
        }
        return (T) get(str);
    }

    public DataCenter zQ2(final Object obj, final String str) {
        if (this.LLILZ == null) {
            this.LLILZ = Looper.getMainLooper().getThread();
        }
        if (C786410Ut5.u3() != this.LLILZ) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new Runnable() { // from class: X.06WY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DataCenter@5f59.put$2");
                    try {
                        this.LLILLL.zQ2(obj, str);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DataCenter@5f59.put$2");
                }
            });
            return this;
        }
        while (this.LLILZLL.get() > 0) {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        synchronized (this) {
            try {
                ((HashMap) this.LL).put(str, obj);
                MutableLiveData mutableLiveData = (MutableLiveData) ((HashMap) this.LLILLJJLI).get(str);
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(new C0RD4(str, obj));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    public final void xQ2(String str, Observer observer, LifecycleOwner lifecycleOwner) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            if (this.LLILLL == null && C2511109sj.LIZ) {
                return;
            }
            wQ2(str).observe(lifecycleOwner, observer, false);
        }
    }

    public final void yQ2(String str, Observer observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            if (this.LLILLL == null && C2511109sj.LIZ) {
                return;
            }
            wQ2(str).observe(this.LLILLL, observer, z);
        }
    }
}
