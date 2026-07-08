package com.bytedance.ies.sdk.datachannel;

import X.AnonymousClass1681;
import X.AnonymousClass1682;
import X.AnonymousClass1685;
import X.AnonymousClass1686;
import X.C13LP;
import X.C1697810uHb;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class DataChannelGlobal extends BaseDataChannel implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final DataChannelGlobal LLILZ = new DataChannelGlobal();
    public static final Map<WeakReference<LifecycleOwner>, List<WeakReference<Object>>> LLILZIL = new ConcurrentHashMap();
    public static final List<Class<?>> LLILZLL = new ArrayList();
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // com.bytedance.ies.sdk.datachannel.BaseDataChannel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LL).clear();
        ((ConcurrentHashMap) this.LLILLJJLI).clear();
    }

    public final <T extends GlobalEvent<Unit>> void GQ2(Class<T> cls) {
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

    public final <T extends AnonymousClass1685<O>, O> void IQ2(Class<T> cls) {
        ((ConcurrentHashMap) this.LL).remove(cls);
    }

    public final <T extends AnonymousClass1686<O>, O> O gg0(Class<T> cls) {
        AnonymousClass1681 anonymousClass1681 = (AnonymousClass1681) vQ2(cls);
        if (anonymousClass1681 != null) {
            return (O) anonymousClass1681.getValue();
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Object key = null;
        for (Map.Entry entry : ((ConcurrentHashMap) LLILZIL).entrySet()) {
            if (Intrinsics.LJFF(((Reference) entry.getKey()).get(), lifecycleOwner)) {
                Iterator it2 = ((Iterable) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    Object obj = ((Reference) it2.next()).get();
                    if (obj != null) {
                        LLILZ.zQ2(obj);
                    }
                }
                key = entry.getKey();
            }
        }
        if (key != null) {
            ((ConcurrentHashMap) LLILZIL).remove(key);
        }
    }

    public final void AQ2(LifecycleOwner lifecycleOwner, Object obj) {
        if (LLIZ) {
            Iterator it2 = ((ArrayList) LLILZLL).iterator();
            while (it2.hasNext()) {
                if (((Class) it2.next()).isAssignableFrom(lifecycleOwner.getClass())) {
                    return;
                }
            }
            if (!lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                return;
            }
            boolean z = false;
            for (Map.Entry entry : ((ConcurrentHashMap) LLILZIL).entrySet()) {
                if (Intrinsics.LJFF(((Reference) entry.getKey()).get(), lifecycleOwner)) {
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (Intrinsics.LJFF(((Reference) obj2).get(), obj)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (C13LP.LJJJLZIJ(0, arrayList) == null) {
                        ((List) entry.getValue()).add(new WeakReference(obj));
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            lifecycleOwner.getLifecycle().addObserver(this);
            ((ConcurrentHashMap) LLILZIL).put(new WeakReference(lifecycleOwner), C1697810uHb.LJIILJJIL(new WeakReference(obj)));
        }
    }

    public final <T extends GlobalEvent<O>, O> void FQ2(Class<T> cls, O o) {
        if (xQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        LiveData liveData2 = (LiveData) vQ2(cls);
        if (liveData2 == null) {
            return;
        }
        liveData2.setValue(o);
    }

    public final <T extends GlobalChannel<O>, O> void HQ2(Class<T> cls, O o) {
        if (xQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        LiveData liveData2 = (LiveData) vQ2(cls);
        if (liveData2 == null) {
            return;
        }
        liveData2.setValue(o);
    }

    public final <T extends AnonymousClass1685<O>, O> void JQ2(Class<T> cls, O o) {
        AnonymousClass1682 anonymousClass1682 = (AnonymousClass1682) vQ2(cls);
        if (anonymousClass1682 != null) {
            anonymousClass1682.o = o;
        }
    }

    public final void CQ2(Class cls, Object obj, Function1 function1) {
        yQ2(obj, null, cls, false, function1);
    }

    public final void DQ2(Class cls, Object obj, Function1 function1) {
        yQ2(obj, null, cls, true, function1);
    }

    public final <T extends NextLiveData<O>, O> void BQ2(Object obj, LifecycleOwner lifecycleOwner, Class<T> cls, Function1<? super O, Unit> function1) {
        yQ2(obj, lifecycleOwner, cls, false, function1);
        AQ2(lifecycleOwner, obj);
    }

    public final <T extends NextLiveData<O>, O> void EQ2(Object obj, LifecycleOwner lifecycleOwner, Class<T> cls, Function1<? super O, Unit> function1) {
        yQ2(obj, lifecycleOwner, cls, true, function1);
        AQ2(lifecycleOwner, obj);
    }
}
