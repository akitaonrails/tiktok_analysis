package com.bytedance.ies.sdk.datachannel;

import X.AnonymousClass1681;
import X.AnonymousClass1682;
import X.AnonymousClass1683;
import X.AnonymousClass1684;
import X.C09B4;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import Y.ARunnableS16S0400000_7;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class DataChannel extends BaseDataChannel {
    public static boolean LLILZLL;
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;
    public LifecycleOwner LLILZ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    public final void AQ2() {
        NextLiveData nextLiveData;
        ((ConcurrentHashMap) this.LLILLJJLI).clear();
        Iterator it2 = ((ConcurrentHashMap) this.LL).entrySet().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if ((value instanceof NextLiveData) && (nextLiveData = (NextLiveData) value) != null) {
                nextLiveData.forceClearObserver$live_datachannel_release();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.datachannel.BaseDataChannel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    public final void FQ2(Class cls) {
        if (xQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(Unit.LIZ);
                return;
            }
            return;
        }
        LiveData liveData2 = (LiveData) vQ2(cls);
        if (liveData2 == null) {
            return;
        }
        liveData2.setValue(Unit.LIZ);
    }

    public final <T extends AnonymousClass1683<O>, O> O gg0(Class<T> cls) {
        AnonymousClass1681 anonymousClass1681 = (AnonymousClass1681) vQ2(cls);
        if (anonymousClass1681 != null) {
            return (O) anonymousClass1681.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IQ2(Class cls, Pair pair) {
        AnonymousClass1682 anonymousClass1682;
        if (gg0(cls) == null && (anonymousClass1682 = (AnonymousClass1682) vQ2(cls)) != null) {
            anonymousClass1682.o = pair;
        }
    }

    public final <T extends Event<O>, O> DataChannel LC0(Class<T> cls, O o) {
        if (xQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            LiveData liveData2 = (LiveData) vQ2(cls);
            if (liveData2 != null) {
                liveData2.setValue(o);
                return this;
            }
        }
        return this;
    }

    public final <T extends AnonymousClass1684<O>, O> DataChannel SX0(Class<T> cls, O o) {
        AnonymousClass1682 anonymousClass1682 = (AnonymousClass1682) vQ2(cls);
        if (anonymousClass1682 != null) {
            anonymousClass1682.o = o;
        }
        return this;
    }

    public final <T extends Channel<O>, O> DataChannel zW(Class<T> cls, O o) {
        if (xQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            LiveData liveData2 = (LiveData) vQ2(cls);
            if (liveData2 != null) {
                liveData2.setValue(o);
                return this;
            }
        }
        return this;
    }

    public final void BQ2(LifecycleOwner lifecycleOwner, Class cls, Function1 function1) {
        NextLiveData nextLiveData;
        if (LLIZ) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS16S0400000_7(function1, this, lifecycleOwner, cls, 1));
            return;
        }
        if (lifecycleOwner != null) {
            NextLiveData nextLiveData2 = (NextLiveData) vQ2(cls);
            if (nextLiveData2 == null) {
                return;
            }
            nextLiveData2.observe(lifecycleOwner, function1, false);
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILZ;
        if (lifecycleOwner2 == null || (nextLiveData = (NextLiveData) vQ2(cls)) == null) {
            return;
        }
        nextLiveData.observe(lifecycleOwner2, function1, false);
    }

    public final void CQ2(Class cls, Object obj, Function1 function1) {
        yQ2(obj, null, cls, false, function1);
    }

    public final void DQ2(Class cls, Object obj, Function1 function1) {
        yQ2(obj, null, cls, true, function1);
    }

    public final void EQ2(LifecycleOwner lifecycleOwner, Class cls, Function1 function1) {
        NextLiveData nextLiveData;
        if (LLIZLLLIL) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS16S0400000_7(function1, this, lifecycleOwner, cls, 2));
            return;
        }
        if (lifecycleOwner != null) {
            NextLiveData nextLiveData2 = (NextLiveData) vQ2(cls);
            if (nextLiveData2 == null) {
                return;
            }
            nextLiveData2.observe(lifecycleOwner, function1, true);
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILZ;
        if (lifecycleOwner2 == null || (nextLiveData = (NextLiveData) vQ2(cls)) == null) {
            return;
        }
        nextLiveData.observe(lifecycleOwner2, function1, true);
    }

    public final <T extends NextLiveData<O>, O> void GQ2(LifecycleOwner lifecycleOwner, Class<T> cls, Function1<? super O, Unit> function1) {
        NextLiveData nextLiveData;
        Observer realObserver;
        if (lifecycleOwner != null && (nextLiveData = (NextLiveData) vQ2(cls)) != null && (realObserver = nextLiveData.getRealObserver(function1)) != null) {
            nextLiveData.removeObserver(realObserver);
        }
    }

    @InterfaceC1294060jmO
    public final <T extends NextLiveData<O>, O> void HQ2(LifecycleOwner lifecycleOwner, Class<T> cls, Function1<? super O, Unit> function1) {
        LiveData liveData;
        if (lifecycleOwner != null && (liveData = (LiveData) vQ2(cls)) != null) {
            liveData.removeObserver(new C09B4(function1));
        }
    }
}
