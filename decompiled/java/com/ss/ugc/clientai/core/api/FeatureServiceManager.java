package com.ss.ugc.clientai.core.api;

import X.C1510050pOl;
import X.C1510130pOt;
import X.C15438062q;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1152700g6O;
import X.InterfaceC1510030pOj;
import X.InterfaceC1510070pOn;
import X.InterfaceC1510080pOo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.FeatureSetConfig;
import com.ss.ugc.clientai.core.api.meta.FlattenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class FeatureServiceManager extends FeatureProducer implements InterfaceC1510030pOj, InterfaceC1510080pOo {
    public static boolean initState;
    public static final C1510050pOl Companion = new C1510050pOl();
    public static final List<InterfaceC1510070pOn> listenerList = new ArrayList();
    public final String TAG = "FeatureServiceManager";
    public final ConcurrentHashMap<Integer, ConcurrentHashMap<String, FeatureProducer>> sourceTypeProducers = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<InterfaceC1510030pOj, Object> appLogListeners = new ConcurrentHashMap<>();
    public HashSet<String> appLogEventListenMap = new HashSet<>();
    public final ConcurrentHashMap<InterfaceC1152700g6O, Object> globalFeatureChangeListeners = new ConcurrentHashMap<>();
    public Map<String, FeatureSetConfig> featureSetMap = new LinkedHashMap();
    public Map<String, String> dataSetMap = new LinkedHashMap();
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> featureRegisterStatus = new ConcurrentHashMap<>();

    public static final FeatureServiceManager instance() {
        Companion.getClass();
        return C1510050pOl.LIZ();
    }

    public FeatureProducer getCommonProducer() {
        return this;
    }

    public void init() {
        initState = true;
        List<InterfaceC1510070pOn> list = listenerList;
        synchronized (list) {
            try {
                Iterator<InterfaceC1510070pOn> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                listenerList.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void tryRegisterProducer(FeatureGroup featureGroup) {
    }

    public void updateListenAppLogEvents() {
        HashSet<String> hashSet = new HashSet<>();
        Iterator<Map.Entry<InterfaceC1510030pOj, Object>> it2 = this.appLogListeners.entrySet().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().getKey().events());
        }
        this.appLogEventListenMap = hashSet;
    }

    @Override // X.InterfaceC1510030pOj
    public Set<String> events() {
        return this.appLogEventListenMap;
    }

    public final HashSet<String> getAppLogEventListenMap() {
        return this.appLogEventListenMap;
    }

    public final ConcurrentHashMap<InterfaceC1510030pOj, Object> getAppLogListeners() {
        return this.appLogListeners;
    }

    public final ConcurrentHashMap<InterfaceC1152700g6O, Object> getGlobalFeatureChangeListeners() {
        return this.globalFeatureChangeListeners;
    }

    public boolean getInitState() {
        return initState;
    }

    public final ConcurrentHashMap<Integer, ConcurrentHashMap<String, FeatureProducer>> getSourceTypeProducers() {
        return this.sourceTypeProducers;
    }

    public void addAppLogListener(InterfaceC1510030pOj interfaceC1510030pOj) {
        this.appLogListeners.put(interfaceC1510030pOj, Boolean.TRUE);
        updateListenAppLogEvents();
    }

    public void addGlobalFeatureChangeListener(InterfaceC1152700g6O interfaceC1152700g6O) {
        this.globalFeatureChangeListeners.put(interfaceC1152700g6O, Boolean.TRUE);
    }

    public void addInitListener(InterfaceC1510070pOn interfaceC1510070pOn) {
        List<InterfaceC1510070pOn> list = listenerList;
        synchronized (list) {
            try {
                list.add(interfaceC1510070pOn);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void enableBatchProducer(List<FeatureGroup> list) {
        for (FeatureGroup featureGroup : list) {
            String str = featureGroup.groupName;
            if (str != null) {
                FeatureProducer producer = getProducer(str, featureGroup.sourceType);
                if (producer != null) {
                    producer.enableProducer(featureGroup.features);
                    if (Unit.LIZ == null) {
                    }
                }
                tryRegisterProducer(featureGroup);
            }
        }
    }

    public FeatureProducer getOnlyProducer(String str) {
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap;
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap2;
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap3;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return null;
        }
        String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        Object obj = ListProtector.get(listLJJLIIIJILLIZJL, 1);
        int iHashCode = str2.hashCode();
        if (iHashCode != -1052618729) {
            if (iHashCode != -987979858) {
                if (iHashCode != 1916528071 || !str2.equals("ttmachine") || (concurrentHashMap3 = this.sourceTypeProducers.get(2)) == null) {
                    return null;
                }
                return concurrentHashMap3.get(obj);
            }
            if (!str2.equals("pitaya") || (concurrentHashMap2 = this.sourceTypeProducers.get(1)) == null) {
                return null;
            }
            return concurrentHashMap2.get(obj);
        }
        if (!str2.equals("native") || (concurrentHashMap = this.sourceTypeProducers.get(0)) == null) {
            return null;
        }
        return concurrentHashMap.get(obj);
        return null;
    }

    public final void initDataSet(HashMap<String, String> map) {
        this.dataSetMap.putAll(map);
    }

    public final void initFeatureSet(HashMap<String, FeatureSetConfig> map) {
        this.featureSetMap.putAll(map);
    }

    public void removeAppLogListener(InterfaceC1510030pOj interfaceC1510030pOj) {
        this.appLogListeners.remove(interfaceC1510030pOj);
        updateListenAppLogEvents();
    }

    public void removeGlobalFeatureChangeListener(InterfaceC1152700g6O interfaceC1152700g6O) {
        this.globalFeatureChangeListeners.remove(interfaceC1152700g6O);
    }

    public final void setAppLogEventListenMap(HashSet<String> hashSet) {
        this.appLogEventListenMap = hashSet;
    }

    public void enableBatchProducer(String str) {
        try {
            List<FeatureGroup> list = (List) new Gson().LJIIIIZZ(str, new TypeToken<List<? extends FeatureGroup>>() { // from class: X.0pOi
            }.getType());
            if (list != null) {
                enableBatchProducer(list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public boolean containProducer(String str, int i) {
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap = this.sourceTypeProducers.get(Integer.valueOf(i));
        if (concurrentHashMap != null) {
            return concurrentHashMap.contains(str);
        }
        return false;
    }

    public JSONObject getFeatureSetFromDataSet(String str, JSONObject jSONObject) {
        String str2 = this.dataSetMap.get(str);
        if (str2 != null) {
            return getFeatureSet(str2, str, jSONObject);
        }
        return null;
    }

    public FeatureProducer getProducer(String str, int i) {
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap = this.sourceTypeProducers.get(Integer.valueOf(i));
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    @Override // X.InterfaceC1510030pOj
    public void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        if (this.appLogEventListenMap.contains(str)) {
            Iterator<Map.Entry<InterfaceC1510030pOj, Object>> it2 = this.appLogListeners.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getKey().handleAppLogEvent(str, c1510130pOt);
            }
        }
    }

    public boolean isFeatureRegisterAlready(String str, String str2) {
        Integer num;
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.featureRegisterStatus.get(str);
        if (concurrentHashMap == null || (num = concurrentHashMap.get(str2)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public void removeProducer(String str, int i) {
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap = this.sourceTypeProducers.get(Integer.valueOf(i));
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
        }
    }

    private final void saveFeatureRegisterStatus(String str, String str2, int i) {
        ConcurrentHashMap<String, Integer> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> concurrentHashMap = this.featureRegisterStatus;
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(str2, Integer.valueOf(i));
    }

    public void addProducer(String str, FeatureProducer featureProducer, int i) {
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, FeatureProducer>> concurrentHashMap = this.sourceTypeProducers;
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap<String, FeatureProducer> concurrentHashMap2 = concurrentHashMap.get(numValueOf);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(str, featureProducer);
    }

    public String getBatchFeatures(String str, FlattenConfig flattenConfig, String str2) {
        List list;
        try {
            list = (List) new Gson().LJIIIIZZ(str, new TypeToken<List<? extends FeatureGroup>>() { // from class: X.0pOh
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        if (list == null) {
            return "";
        }
        return C786410Ut5.J3(getBatchFeatures$default(this, list, flattenConfig, null, str2, false, 20, null));
    }

    public JSONObject getFeatureSet(String str, String str2, JSONObject jSONObject) {
        FeatureSetConfig featureSetConfig = this.featureSetMap.get(str);
        if (featureSetConfig != null) {
            List<FeatureGroup> list = featureSetConfig.features;
            FlattenConfig flattenConfig = featureSetConfig.flattenConfig;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            return getBatchFeatures$default(this, list, flattenConfig, jSONObject, C2188811AlT.LIZIZ(sbLIZ), false, 16, null);
        }
        return null;
    }

    @Override // X.InterfaceC1510080pOo
    public void notifyGlobalFeatureChange(String str, String str2, int i) {
        List<String> list;
        if (i == 1) {
            saveFeatureRegisterStatus(str, str2, i);
        }
        for (Map.Entry<InterfaceC1152700g6O, Object> entry : this.globalFeatureChangeListeners.entrySet()) {
            Map<String, List<String>> mapLIZIZ = entry.getKey().LIZIZ();
            if (mapLIZIZ.containsKey(str) && ((list = mapLIZIZ.get(str)) == null || list.isEmpty() || list.contains(str2))) {
                entry.getKey().LIZ(i, str, str2);
            }
        }
    }

    public static /* synthetic */ boolean containProducer$default(FeatureServiceManager featureServiceManager, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return featureServiceManager.containProducer(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: containProducer");
    }

    public static /* synthetic */ JSONObject getFeatureSetFromDataSet$default(FeatureServiceManager featureServiceManager, String str, JSONObject jSONObject, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            return featureServiceManager.getFeatureSetFromDataSet(str, jSONObject);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureSetFromDataSet");
    }

    public static /* synthetic */ FeatureProducer getProducer$default(FeatureServiceManager featureServiceManager, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return featureServiceManager.getProducer(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProducer");
    }

    public static /* synthetic */ void removeProducer$default(FeatureServiceManager featureServiceManager, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            featureServiceManager.removeProducer(str, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeProducer");
    }

    public JSONObject getBatchFeatures(List<FeatureGroup> list, FlattenConfig flattenConfig, JSONObject jSONObject, String str, boolean z) {
        String str2;
        JSONObject batchFeature;
        Unit unit;
        Iterator<String> itKeys;
        JSONObject jSONObject2 = new JSONObject();
        ArrayList<FeatureGroup> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<FeatureGroup> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().copy());
        }
        try {
            for (FeatureGroup featureGroup : arrayList) {
                List<FeatureItem> list2 = featureGroup.features;
                if (list2 != null) {
                    for (FeatureItem featureItem : list2) {
                        if (featureItem.params == null) {
                            featureItem.setParams(featureGroup.params);
                        }
                        String strLJJIFFI = featureItem.params;
                        if (strLJJIFFI != null) {
                            if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, next, jSONObject.opt(next).toString(), false);
                                }
                            }
                            featureItem.setParams(strLJJIFFI);
                        }
                    }
                }
            }
            for (FeatureGroup featureGroup2 : arrayList) {
                String str3 = featureGroup2.trans;
                if (str3 == null) {
                    str3 = featureGroup2.groupName;
                }
                List<FeatureItem> list3 = featureGroup2.features;
                if (list3 != null && (str2 = featureGroup2.groupName) != null) {
                    JSONObject batchFeature2 = null;
                    if (flattenConfig != null) {
                        if (str3 != null) {
                            flattenConfig.prefix = str3;
                        }
                        FeatureProducer producer = getProducer(str2, featureGroup2.sourceType);
                        if (producer != null) {
                            batchFeature = producer.getBatchFeature(list3, flattenConfig, str, z);
                        } else {
                            batchFeature = null;
                        }
                        if (batchFeature != null) {
                            Iterator<String> itKeys2 = batchFeature.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                jSONObject2.put(next2, batchFeature.opt(next2));
                            }
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                        }
                    }
                    FeatureProducer producer2 = getProducer(str2, featureGroup2.sourceType);
                    if (producer2 != null) {
                        batchFeature2 = producer2.getBatchFeature(list3, null, str, z);
                    }
                    if (batchFeature2 != null) {
                        jSONObject2.put(str3, batchFeature2);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject2;
    }

    public static /* synthetic */ void addProducer$default(FeatureServiceManager featureServiceManager, String str, FeatureProducer featureProducer, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            featureServiceManager.addProducer(str, featureProducer, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProducer");
    }

    public static /* synthetic */ JSONObject getFeatureSet$default(FeatureServiceManager featureServiceManager, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                jSONObject = null;
            }
            return featureServiceManager.getFeatureSet(str, str2, jSONObject);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureSet");
    }

    public static /* synthetic */ JSONObject getBatchFeatures$default(FeatureServiceManager featureServiceManager, List list, FlattenConfig flattenConfig, JSONObject jSONObject, String str, boolean z, int i, Object obj) {
        boolean z2 = z;
        FlattenConfig flattenConfig2 = flattenConfig;
        if (obj == null) {
            JSONObject jSONObject2 = null;
            if ((i & 2) != 0) {
                flattenConfig2 = null;
            }
            if ((i & 4) == 0) {
                jSONObject2 = jSONObject;
            }
            if ((i & 16) != 0) {
                z2 = false;
            }
            return featureServiceManager.getBatchFeatures(list, flattenConfig2, jSONObject2, str, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBatchFeatures");
    }
}
