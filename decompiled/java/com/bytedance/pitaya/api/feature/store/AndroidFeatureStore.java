package com.bytedance.pitaya.api.feature.store;

import X.C2188811AlT;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PitayaProxy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class AndroidFeatureStore implements IFeatureStore {
    public IFeatureStore innerFeatureStore;
    public final String TAG = "AndroidFeatureStore";
    public final ConcurrentHashMap<String, PTYFeatureProducer> producers = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, PTYModelInstance> dumpFeature = new ConcurrentHashMap<>();

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public List<String> getRegisteredProducer() {
        return Collections.list(this.producers.keys());
    }

    public final IFeatureStore getInnerFeatureStore() {
        return this.innerFeatureStore;
    }

    public final ConcurrentHashMap<String, PTYFeatureProducer> getProducers$pitayacore_release() {
        return this.producers;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final void setInnerFeatureStore(IFeatureStore iFeatureStore) {
        if (iFeatureStore != null && this.innerFeatureStore == null) {
            synchronized (this) {
                try {
                    if (this.innerFeatureStore == null) {
                        this.innerFeatureStore = iFeatureStore;
                        Iterator<Map.Entry<String, PTYFeatureProducer>> it2 = ((AndroidFeatureStore) PTYFeatureStoreInstance.INSTANCE.getFeatureStore()).producers.entrySet().iterator();
                        while (it2.hasNext()) {
                            iFeatureStore.registerFeatureProducer(it2.next().getValue(), new PTYNormalCallback() { // from class: com.bytedance.pitaya.api.feature.store.AndroidFeatureStore$innerFeatureStore$1$1
                                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                                public void onResult(boolean z, PTYError pTYError) {
                                }
                            });
                        }
                        PTYFeatureStoreInstance.INSTANCE.notifyAllListener$pitayacore_release(iFeatureStore);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureGroup(String str) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.unregisterFeatureGroup(str);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureProducer(String str) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null) {
            this.producers.remove(str);
            return true;
        }
        boolean zUnregisterFeatureProducer = iFeatureStore.unregisterFeatureProducer(str);
        if (zUnregisterFeatureProducer) {
            this.producers.remove(str);
        }
        return zUnregisterFeatureProducer;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean endSession(String str, String str2) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.endSession(str, str2);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getGroupFeature(List<PTYFeatureGroupQuery> list, boolean z) throws JSONException {
        IFeatureStore iFeatureStore;
        PTYModelInstance groupFeature;
        JSONObject features;
        Object objValueOf;
        PTYModelInstance pTYModelInstance = new PTYModelInstance(UUID.randomUUID().toString(), "{}");
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        List<String> registeredProducer = getRegisteredProducer();
        for (PTYFeatureGroupQuery pTYFeatureGroupQuery : list) {
            if (!registeredProducer.contains(pTYFeatureGroupQuery.getGroupName())) {
                arrayList.add(pTYFeatureGroupQuery);
            } else {
                PTYFeatureProducer pTYFeatureProducer = this.producers.get(pTYFeatureGroupQuery.getGroupName());
                if (pTYFeatureProducer != null) {
                    for (PTYFeatureQuery pTYFeatureQuery : pTYFeatureGroupQuery.getQueries()) {
                        if (pTYFeatureQuery.getQueryType() == 200) {
                            JSONObject jSONObject2 = null;
                            if (pTYFeatureQuery.getExtParams() != null) {
                                try {
                                    jSONObject2 = new JSONObject(pTYFeatureQuery.getExtParams());
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            switch (pTYFeatureQuery.getReturnType()) {
                                case 200:
                                    double doubleFeature = pTYFeatureProducer.getDoubleFeature(pTYFeatureQuery.getFeatureName(), jSONObject2);
                                    if (doubleFeature == 0.0d) {
                                        objValueOf = Float.valueOf(pTYFeatureProducer.getNumericFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    } else {
                                        objValueOf = Double.valueOf(doubleFeature);
                                    }
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), objValueOf);
                                    break;
                                case 201:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getStringFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                                case 202:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getDictFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                                case 203:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getSeqFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                            }
                        }
                    }
                }
            }
        }
        if ((!arrayList.isEmpty()) && (iFeatureStore = this.innerFeatureStore) != null && (groupFeature = iFeatureStore.getGroupFeature(arrayList, false)) != null && (features = groupFeature.getFeatures()) != null) {
            Iterator<String> itKeys = features.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, features.get(next));
            }
        }
        pTYModelInstance.updateFeatures$pitayacore_release(jSONObject);
        if (z) {
            this.dumpFeature.put(pTYModelInstance.getInstanceID(), pTYModelInstance);
        }
        return pTYModelInstance;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getModelInstance(String str, boolean z) {
        if (z) {
            return this.dumpFeature.remove(str);
        }
        return this.dumpFeature.get(str);
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureGroup(PTYFeatureGroup pTYFeatureGroup, PTYNormalCallback pTYNormalCallback) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null) {
            int code = PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode();
            pTYNormalCallback.onResult(false, new PTYError("FeatureStore", code, code, "Pitaya SDK not init", null));
        } else {
            iFeatureStore.registerFeatureGroup(pTYFeatureGroup, pTYNormalCallback);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureProducer(PTYFeatureProducer pTYFeatureProducer, PTYNormalCallback pTYNormalCallback) {
        List<String> registeredProducer;
        String groupName = pTYFeatureProducer.getGroupName();
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null && (registeredProducer = iFeatureStore.getRegisteredProducer()) != null && registeredProducer.contains(groupName)) {
            int code = PTYErrorCode.INVALID_DATA.getCode();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(groupName);
            sbLIZ.append(" Producer has already been registered");
            pTYNormalCallback.onResult(false, new PTYError("FeatureStore", code, code, C2188811AlT.LIZIZ(sbLIZ), null));
            return;
        }
        synchronized (PTYFeatureStoreInstance.INSTANCE) {
            try {
                this.producers.put(groupName, pTYFeatureProducer);
                IFeatureStore iFeatureStore2 = this.innerFeatureStore;
                if (iFeatureStore2 != null) {
                    iFeatureStore2.registerFeatureProducer(pTYFeatureProducer, pTYNormalCallback);
                } else {
                    pTYNormalCallback.onResult(true, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean startSession(String str, String str2) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.startSession(str, str2);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String str, float f, String str2) {
        IFeatureStore iFeatureStore;
        if ((this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) || (iFeatureStore = this.innerFeatureStore) == null) {
            return false;
        }
        return iFeatureStore.addFeature(str, f, str2);
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerCppCallback(String str, String str2, PTYFeatureChangeCallback pTYFeatureChangeCallback) {
        String strRegisterCppCallback;
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null || (strRegisterCppCallback = iFeatureStore.registerCppCallback(str, str2, pTYFeatureChangeCallback)) == null) {
            return "";
        }
        return strRegisterCppCallback;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerPyCallback(String str, String str2, String str3) {
        String strRegisterPyCallback;
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null || (strRegisterPyCallback = iFeatureStore.registerPyCallback(str, str2, str3)) == null) {
            return "";
        }
        return strRegisterPyCallback;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterCppCallback(String str, String str2, String str3) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            iFeatureStore.unregisterCppCallback(str, str2, str3);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterPyCallback(String str, String str2, String str3) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            iFeatureStore.unregisterPyCallback(str, str2, str3);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String str, String str2, String str3) {
        IFeatureStore iFeatureStore;
        if ((this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) || (iFeatureStore = this.innerFeatureStore) == null) {
            return false;
        }
        return iFeatureStore.addFeature(str, str2, str3);
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String str, JSONObject jSONObject, String str2) {
        IFeatureStore iFeatureStore;
        if ((this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) || (iFeatureStore = this.innerFeatureStore) == null) {
            return false;
        }
        return iFeatureStore.addFeature(str, jSONObject, str2);
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean upload(PTYModelInstance pTYModelInstance, float f, String str, int i, String str2) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.upload(pTYModelInstance, f, str, i, str2);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void getFeature(String str, String str2, int i, int i2, int i3, PTYFeatureCallback pTYFeatureCallback) {
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null) {
            int code = PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode();
            pTYFeatureCallback.onResult(false, new PTYError("FeatureStore", code, code, "Pitaya SDK not init", null), "");
        } else {
            iFeatureStore.getFeature(str, str2, i, i2, i3, pTYFeatureCallback);
        }
    }
}
