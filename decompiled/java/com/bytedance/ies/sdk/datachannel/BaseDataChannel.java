package com.bytedance.ies.sdk.datachannel;

import X.AnonymousClass1680;
import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import X.C500270Jjd;
import X.C786410Ut5;
import X.InterfaceC207249167z;
import android.os.Build;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseDataChannel extends ViewModel {
    public final Map<Class<?>, InterfaceC207249167z<?>> LL = new ConcurrentHashMap();
    public final Map<Object, Map<Class<?>, C500270Jjd<Object>>> LLILLJJLI = new ConcurrentHashMap();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AnonymousClass1680());

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LL).clear();
    }

    public final boolean xQ2() {
        return C786410Ut5.u3() != this.LLILLL.getValue();
    }

    public final <T extends InterfaceC207249167z<O>, O> T vQ2(Class<T> cls) {
        T tNewInstance;
        T t;
        if (DataChannel.LLILZLL) {
            return (T) wQ2(cls);
        }
        synchronized (this) {
            InterfaceC207249167z interfaceC207249167z = (InterfaceC207249167z) ((ConcurrentHashMap) this.LL).get(cls);
            if (interfaceC207249167z == null || (tNewInstance = cls.cast(interfaceC207249167z)) == null) {
                try {
                    tNewInstance = cls.newInstance();
                    ((ConcurrentHashMap) this.LL).put(cls, tNewInstance);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("class ");
                    sbLIZ.append(cls);
                    sbLIZ.append(" init fail");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                } catch (InstantiationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("class ");
                    sbLIZ2.append(cls);
                    sbLIZ2.append(" init fail");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
                }
            }
            t = tNewInstance;
        }
        return t;
    }

    public final <T extends InterfaceC207249167z<O>, O> T wQ2(Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 24) {
            return cls.cast(((ConcurrentHashMap) this.LL).computeIfAbsent(cls, new Function() { // from class: X.0k5o
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Constructor<T> declaredConstructor;
                    InterfaceC207249167z<?> interfaceC207249167zInvoke;
                    Class<?> cls2 = (Class) obj;
                    Function0<InterfaceC207249167z<?>> function0 = C1306110k5p.LIZ.get(cls2);
                    if (function0 != null && (interfaceC207249167zInvoke = function0.invoke()) != null) {
                        return interfaceC207249167zInvoke;
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 24) {
                            declaredConstructor = (Constructor) C1306110k5p.LIZIZ.computeIfAbsent(cls2, new Function() { // from class: X.0k5n
                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((Class) obj2).getDeclaredConstructor(new Class[0]);
                                }
                            });
                        } else {
                            declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        }
                        declaredConstructor.setAccessible(true);
                        return (InterfaceC207249167z) declaredConstructor.newInstance(new Object[0]);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to create instance of class ");
                        sbLIZ.append(cls2);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }
            }));
        }
        Object obj = ((ConcurrentHashMap) this.LL).get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        synchronized (this) {
            try {
                InterfaceC207249167z interfaceC207249167z = (InterfaceC207249167z) ((ConcurrentHashMap) this.LL).get(cls);
                if (interfaceC207249167z != null) {
                    return cls.cast(interfaceC207249167z);
                }
                try {
                    try {
                        T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        ((ConcurrentHashMap) this.LL).put(cls, tNewInstance);
                        return tNewInstance;
                    } catch (InstantiationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("class ");
                        sbLIZ.append(cls);
                        sbLIZ.append(" init fail");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                } catch (IllegalAccessException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("class ");
                    sbLIZ2.append(cls);
                    sbLIZ2.append(" init fail");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void zQ2(Object obj) {
        Map map = (Map) ((ConcurrentHashMap) this.LLILLJJLI).remove(obj);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object obj2 = (InterfaceC207249167z) ((ConcurrentHashMap) this.LL).get(entry.getKey());
                if (obj2 != null && (obj2 instanceof NextLiveData)) {
                    LiveData liveData = (LiveData) obj2;
                    liveData.removeObserver((Observer) entry.getValue());
                    if (!liveData.hasObservers() && (((obj2 instanceof GlobalChannel) && !((GlobalChannel) obj2).getKeepInMemory$live_datachannel_release()) || (obj2 instanceof Event))) {
                        ((ConcurrentHashMap) this.LL).remove(entry.getKey());
                    }
                }
            }
        }
    }

    public final <T extends NextLiveData<O>, O> void yQ2(Object obj, LifecycleOwner lifecycleOwner, Class<T> cls, boolean z, Function1<? super O, Unit> function1) {
        Map map;
        NextLiveData nextLiveData;
        C500270Jjd c500270JjdObserve;
        if (!((ConcurrentHashMap) this.LLILLJJLI).containsKey(obj)) {
            ((ConcurrentHashMap) this.LLILLJJLI).put(obj, new HashMap());
        }
        Map map2 = (Map) ((ConcurrentHashMap) this.LLILLJJLI).get(obj);
        if ((map2 == null || !map2.containsKey(cls)) && (map = (Map) ((ConcurrentHashMap) this.LLILLJJLI).get(obj)) != null && (nextLiveData = (NextLiveData) vQ2(cls)) != null) {
            if (lifecycleOwner == null) {
                c500270JjdObserve = nextLiveData.observeForever(function1, z);
            } else {
                c500270JjdObserve = nextLiveData.observe(lifecycleOwner, function1, z);
            }
            map.put(cls, c500270JjdObserve);
        }
    }
}
