package com.bytedance.pitaya.api.feature;

import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes28.dex */
public final class FeatureCoreFactory implements ReflectionCall {
    public static final FeatureCoreFactory INSTANCE = new FeatureCoreFactory();
    public static final ConcurrentHashMap<String, IFeatureCore> cores = new ConcurrentHashMap<>();
    public static final PTYFeatureStoreInstance featureStore = PTYFeatureStoreInstance.INSTANCE;

    public final ConcurrentHashMap<String, IFeatureCore> getCores() {
        return cores;
    }

    public final PTYFeatureStoreInstance getFeatureStore() {
        return featureStore;
    }

    public final IFeatureCore getFeatureCore(String str) {
        IFeatureCore iFeatureCore;
        ConcurrentHashMap<String, IFeatureCore> concurrentHashMap = cores;
        synchronized (concurrentHashMap) {
            try {
                iFeatureCore = concurrentHashMap.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iFeatureCore;
    }
}
