package com.bytedance.pitaya.api.feature.store;

import X.InterfaceC1843730y4x;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes28.dex */
public final class PTYFeatureStoreInstance implements ReflectionCall {
    public static final PTYFeatureStoreInstance INSTANCE = new PTYFeatureStoreInstance();
    public static final IFeatureStore featureStore = new AndroidFeatureStore();
    public static final Set<InterfaceC1843730y4x> listeners = new LinkedHashSet();

    public final IFeatureStore getFeatureStore() {
        return featureStore;
    }

    public final PTYFeatureProducer getFeatureProducer(String str) {
        AndroidFeatureStore androidFeatureStore;
        ConcurrentHashMap<String, PTYFeatureProducer> producers$pitayacore_release;
        IFeatureStore iFeatureStore = featureStore;
        if (!(iFeatureStore instanceof AndroidFeatureStore) || (androidFeatureStore = (AndroidFeatureStore) iFeatureStore) == null || (producers$pitayacore_release = androidFeatureStore.getProducers$pitayacore_release()) == null) {
            return null;
        }
        return producers$pitayacore_release.get(str);
    }

    public final void notifyAllListener$pitayacore_release(IFeatureStore iFeatureStore) {
        synchronized (this) {
            try {
                Iterator<T> it2 = listeners.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1843730y4x) it2.next()).LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void registerReadyListener(InterfaceC1843730y4x interfaceC1843730y4x) {
        synchronized (this) {
            try {
                if (((AndroidFeatureStore) featureStore).getInnerFeatureStore() != null) {
                    interfaceC1843730y4x.LIZ();
                } else {
                    listeners.add(interfaceC1843730y4x);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
