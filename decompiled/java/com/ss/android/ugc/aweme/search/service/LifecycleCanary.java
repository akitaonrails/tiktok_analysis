package com.ss.android.ugc.aweme.search.service;

import X.C1822407Bu;
import X.C19719612Di;
import X.C19EG;
import X.C2188811AlT;
import X.C2485209oY;
import X.C2485309oZ;
import X.C356901a3;
import X.InterfaceC2485609oc;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleCanary implements InterfaceC2485609oc, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final LifecycleCanary LL = new LifecycleCanary();
    public static final ConcurrentHashMap<LifecycleOwner, CopyOnWriteArrayList<SoftReference<Object>>> LLILLJJLI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<SoftReference<Object>>> LLILLL = new ConcurrentHashMap<>();
    public static final WeakHashMap<LifecycleOwner, Integer> LLILZ = new WeakHashMap<>();

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

    @Override // X.InterfaceC2485609oc
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListRemove;
        if (C1822407Bu.LIZ() && (copyOnWriteArrayListRemove = LLILLL.remove(Integer.valueOf(lifecycleOwner.hashCode()))) != null) {
            Iterator<SoftReference<Object>> it2 = copyOnWriteArrayListRemove.iterator();
            while (it2.hasNext()) {
                it2.next().clear();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        int iHashCode;
        if (C1822407Bu.LIZ()) {
            if ((lifecycleOwner instanceof Fragment) && lifecycleOwner != null) {
                ConcurrentHashMap<Integer, CopyOnWriteArrayList<SoftReference<Object>>> concurrentHashMap = LLILLL;
                Integer num = LLILZ.get(lifecycleOwner);
                if (num != null) {
                    iHashCode = num.intValue();
                } else {
                    SAFHelper sAFHelper = SAFHelper.LIZ;
                    Fragment fragment = (Fragment) lifecycleOwner;
                    C19EG activity = fragment.getActivity();
                    sAFHelper.getClass();
                    LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, activity);
                    if (lifecycleOwnerLJIJJ != null) {
                        iHashCode = lifecycleOwnerLJIJJ.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                }
                CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListRemove = concurrentHashMap.remove(Integer.valueOf(iHashCode));
                if (copyOnWriteArrayListRemove != null) {
                    Iterator<SoftReference<Object>> it2 = copyOnWriteArrayListRemove.iterator();
                    while (it2.hasNext()) {
                        it2.next().clear();
                    }
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListRemove2 = LLILLL.remove(Integer.valueOf(lifecycleOwner.hashCode()));
            if (copyOnWriteArrayListRemove2 != null) {
                Iterator<SoftReference<Object>> it3 = copyOnWriteArrayListRemove2.iterator();
                while (it3.hasNext()) {
                    it3.next().clear();
                }
                return;
            }
            return;
        }
        CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListRemove3 = LLILLJJLI.remove(lifecycleOwner);
        if (copyOnWriteArrayListRemove3 != null) {
            Iterator<SoftReference<Object>> it4 = copyOnWriteArrayListRemove3.iterator();
            while (it4.hasNext()) {
                it4.next().clear();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        int iHashCode;
        if ((lifecycleOwner instanceof Fragment) && lifecycleOwner != null) {
            WeakHashMap<LifecycleOwner, Integer> weakHashMap = LLILZ;
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragment = (Fragment) lifecycleOwner;
            C19EG activity = fragment.getActivity();
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, activity);
            if (lifecycleOwnerLJIJJ != null) {
                iHashCode = lifecycleOwnerLJIJJ.hashCode();
            } else {
                iHashCode = 0;
            }
            weakHashMap.put(lifecycleOwner, Integer.valueOf(iHashCode));
        }
    }

    @Override // X.InterfaceC2485609oc
    public final <T> T LIZ(LifecycleOwner lifecycleOwner, T t) {
        CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListPutIfAbsent;
        CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayListPutIfAbsent2;
        if (lifecycleOwner != null && ((Number) C2485309oZ.LIZ.getValue()).intValue() == 0) {
            Class<?>[] interfaces = t.getClass().getInterfaces();
            for (Class<?> cls : interfaces) {
                LL.getClass();
                LinkedList linkedList = new LinkedList();
                linkedList.add(cls);
                while (!linkedList.isEmpty()) {
                    Class cls2 = (Class) linkedList.removeFirst();
                    for (Method method : cls2.getMethods()) {
                        if (!Intrinsics.LJFF(method.getReturnType(), Void.TYPE)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(method);
                            sbLIZ.append(" return type can only be Void type");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalArgumentException(strLIZIZ);
                        }
                    }
                    C19719612Di.LJJII(linkedList, cls2.getInterfaces());
                }
            }
            lifecycleOwner.getLifecycle().addObserver(this);
            C2485209oY c2485209oY = new C2485209oY(t);
            if (C1822407Bu.LIZ()) {
                ConcurrentHashMap<Integer, CopyOnWriteArrayList<SoftReference<Object>>> concurrentHashMap = LLILLL;
                Integer numValueOf = Integer.valueOf(lifecycleOwner.hashCode());
                CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayList = concurrentHashMap.get(numValueOf);
                if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent2 = concurrentHashMap.putIfAbsent(numValueOf, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
                    copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent2;
                }
                copyOnWriteArrayList.add(c2485209oY.LL);
            } else {
                ConcurrentHashMap<LifecycleOwner, CopyOnWriteArrayList<SoftReference<Object>>> concurrentHashMap2 = LLILLJJLI;
                CopyOnWriteArrayList<SoftReference<Object>> copyOnWriteArrayList2 = concurrentHashMap2.get(lifecycleOwner);
                if (copyOnWriteArrayList2 == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap2.putIfAbsent(lifecycleOwner, (copyOnWriteArrayList2 = new CopyOnWriteArrayList<>()))) != null) {
                    copyOnWriteArrayList2 = copyOnWriteArrayListPutIfAbsent;
                }
                copyOnWriteArrayList2.add(c2485209oY.LL);
            }
            return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), interfaces, c2485209oY);
        }
        return t;
    }
}
