package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class TTMMapParam extends ITTMParamData {
    public Map<String, Object> inputData;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getDictDoubleValuesImmediate() {
        Map<String, Object> map = this.inputData;
        if (map == null) {
            return null;
        }
        Collection<Object> collectionValues = map.values();
        double[] dArr = new double[collectionValues.size()];
        Iterator<Object> it2 = collectionValues.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            dArr[i] = C829740Wgm.LIZ(dArr, null);
            i++;
        }
        return dArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getDictIntValuesImmediate() {
        Map<String, Object> map = this.inputData;
        if (map == null) {
            return null;
        }
        Collection<Object> collectionValues = map.values();
        long[] jArr = new long[collectionValues.size()];
        Iterator<Object> it2 = collectionValues.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            jArr[i] = C829740Wgm.LIZIZ(jArr, null);
            i++;
        }
        return jArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictKeys() {
        Map<String, Object> map = this.inputData;
        if (map == null) {
            return null;
        }
        Set<String> setKeySet = map.keySet();
        return (String[]) setKeySet.toArray(new String[setKeySet.size()]);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictStringValuesImmediate() {
        Map<String, Object> map = this.inputData;
        if (map == null) {
            return null;
        }
        Collection<Object> collectionValues = map.values();
        String[] strArr = new String[collectionValues.size()];
        Iterator<Object> it2 = collectionValues.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            strArr[i] = C829740Wgm.LIZJ(strArr, null);
            i++;
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object[] getDictValuesImmediate() {
        Map<String, Object> map = this.inputData;
        if (map == null) {
            return null;
        }
        Collection<Object> collectionValues = map.values();
        return collectionValues.toArray(new Object[collectionValues.size()]);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.inputData;
    }

    public TTMMapParam(Map<String, Object> map) {
        this.inputData = map;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean containsKey(String str) {
        Map<String, Object> map = this.inputData;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        Map<String, Object> map;
        ITTMParamData iTTMParamDataLIZ;
        if (str == null || (map = this.inputData) == null || (iTTMParamDataLIZ = C829660Wge.LIZ(map.get(str))) == null) {
            return null;
        }
        return iTTMParamDataLIZ.getAllDoubleValue(null);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        Map<String, Object> map;
        ITTMParamData iTTMParamDataLIZ;
        if (str == null || (map = this.inputData) == null || (iTTMParamDataLIZ = C829660Wge.LIZ(map.get(str))) == null) {
            return null;
        }
        return iTTMParamDataLIZ.getAllIntValue(null);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        Map<String, Object> map;
        ITTMParamData iTTMParamDataLIZ;
        if (str == null || (map = this.inputData) == null || (iTTMParamDataLIZ = C829660Wge.LIZ(map.get(str))) == null) {
            return null;
        }
        return iTTMParamDataLIZ.getAllStringValue(null);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getObjectItem(String str) {
        return C829660Wge.LIZ(this.inputData.get(str));
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void removeData(String str) {
        Map<String, Object> map = this.inputData;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null) {
            return C829740Wgm.LIZ(map.get(str), str);
        }
        return Double.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null) {
            return C829740Wgm.LIZIZ(map.get(str), str);
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null) {
            return C829740Wgm.LIZJ(map.get(str), str);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) {
        Map<String, Object> map = this.inputData;
        if (map != null) {
            map.put(str, iTTMParamData.getInputData());
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null) {
            map.remove(str);
            return true;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null) {
            map.put(str, obj);
            return true;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        Map<String, Object> map;
        if (str != null && (map = this.inputData) != null && map.containsKey(str)) {
            this.inputData.put(str, obj);
            return true;
        }
        return false;
    }
}
