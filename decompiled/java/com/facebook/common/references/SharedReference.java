package com.facebook.common.references;

import X.C1322350kW1;
import X.C1328570kg3;
import X.InterfaceC1290810jh9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class SharedReference<T> {
    public static final Map<Object, Integer> sLiveObjects = new IdentityHashMap();
    public int mRefCount;
    public final InterfaceC1290810jh9<T> mResourceReleaser;
    public T mValue;

    public synchronized void addReference() {
        ensureValid();
        this.mRefCount++;
    }

    public synchronized int decreaseRefCount() {
        int i;
        ensureValid();
        C1322350kW1.LIZIZ(this.mRefCount > 0);
        i = this.mRefCount - 1;
        this.mRefCount = i;
        return i;
    }

    public synchronized T get() {
        return this.mValue;
    }

    public synchronized int getRefCountTestOnly() {
        return this.mRefCount;
    }

    public synchronized boolean isValid() {
        return this.mRefCount > 0;
    }

    private void ensureValid() {
        if (!isValid(this)) {
            throw new RuntimeException() { // from class: X.0kXB
            };
        }
    }

    public void deleteReference() {
        T t;
        if (decreaseRefCount() == 0) {
            synchronized (this) {
                try {
                    t = this.mValue;
                    this.mValue = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.mResourceReleaser.LIZ(t);
            removeLiveReference(t);
        }
    }

    public static Map<Object, Integer> getLiveObjects() {
        return sLiveObjects;
    }

    public int getRefCount() {
        return this.mRefCount;
    }

    public static void addLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean isValid(SharedReference<?> sharedReference) {
        if (sharedReference != null && sharedReference.isValid()) {
            return true;
        }
        return false;
    }

    public static void removeLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    C1328570kg3.LJIJI("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public SharedReference(T t, InterfaceC1290810jh9<T> interfaceC1290810jh9) {
        t.getClass();
        this.mValue = t;
        interfaceC1290810jh9.getClass();
        this.mResourceReleaser = interfaceC1290810jh9;
        this.mRefCount = 1;
        addLiveReference(t);
    }
}
