package com.tiktok.ttm;

import X.C829660Wge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCollectionParam;
import com.tiktok.ttm.ttmparam.TTMGsonJsonArrayParam;
import com.tiktok.ttm.ttmparam.TTMGsonJsonObjectParam;
import com.tiktok.ttm.ttmparam.TTMJSONArrayParam;
import com.tiktok.ttm.ttmparam.TTMMapParam;
import com.tiktok.ttm.ttmparam.TTMNumberArrayParam;
import com.tiktok.ttm.ttmparam.TTMNumberObjectArrayParam;
import com.tiktok.ttm.ttmparam.TTMNumberParam;
import com.tiktok.ttm.ttmparam.TTMStringArrayParam;
import com.tiktok.ttm.ttmparam.TTMStringParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMParamData {
    public static String TAG = "TTM/TTMParamData";
    public ITTMParamData actualParamData;

    private double[] jniGetDictDoubleValuesImmediate() {
        double[] dictDoubleValuesImmediate = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                dictDoubleValuesImmediate = iTTMParamData.getDictDoubleValuesImmediate();
                return dictDoubleValuesImmediate;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dictDoubleValuesImmediate;
    }

    private long[] jniGetDictIntValuesImmediate() {
        long[] dictIntValuesImmediate = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                dictIntValuesImmediate = iTTMParamData.getDictIntValuesImmediate();
                return dictIntValuesImmediate;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dictIntValuesImmediate;
    }

    private String[] jniGetDictStringValuesImmediate() {
        String[] dictStringValuesImmediate = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                dictStringValuesImmediate = iTTMParamData.getDictStringValuesImmediate();
                return dictStringValuesImmediate;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dictStringValuesImmediate;
    }

    public int GetArraySize() {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return 0;
            }
            return iTTMParamData.getArraySize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public String[] GetDictKeys() {
        String[] dictKeys = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                dictKeys = iTTMParamData.getDictKeys();
                return dictKeys;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dictKeys;
    }

    public Object[] GetDictValuesImmediate() {
        Object[] dictValuesImmediate = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                dictValuesImmediate = iTTMParamData.getDictValuesImmediate();
                return dictValuesImmediate;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dictValuesImmediate;
    }

    public String GetStringValue() {
        String stringValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                stringValue = iTTMParamData.getStringValue();
                return stringValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return stringValue;
    }

    public Object getInputData() {
        Object inputData = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                inputData = iTTMParamData.getInputData();
                return inputData;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return inputData;
    }

    public static TTMParamData newEmptyListData() {
        return new TTMParamData((List<Object>) new ArrayList());
    }

    public static TTMParamData newEmptyMapData() {
        return new TTMParamData((Map<String, Object>) new HashMap());
    }

    public int getType() {
        ITTMParamData iTTMParamData = this.actualParamData;
        if (iTTMParamData == null) {
            return 13;
        }
        return iTTMParamData.getType();
    }

    public int getArraySize() {
        return GetArraySize();
    }

    public String[] getDictKeys() {
        return GetDictKeys();
    }

    public double GetDoubleValue() {
        double doubleValue = Double.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                doubleValue = iTTMParamData.getDoubleValue();
                return doubleValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return doubleValue;
    }

    public long GetIntValue() {
        long intValue = Long.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                intValue = iTTMParamData.getIntValue();
                return intValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return intValue;
    }

    public ITTMParamData getActualParamData() {
        return this.actualParamData;
    }

    public TTMParamData(h hVar) {
        TTMGsonJsonArrayParam tTMGsonJsonArrayParam;
        if (hVar == null) {
            tTMGsonJsonArrayParam = null;
        } else {
            tTMGsonJsonArrayParam = new TTMGsonJsonArrayParam(hVar);
        }
        this.actualParamData = tTMGsonJsonArrayParam;
    }

    private boolean jniDictContainsKey(String str) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return false;
            }
            return iTTMParamData.containsKey(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    private double[] jniGetAllDoubleValue(String str) {
        double[] allDoubleValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                allDoubleValue = iTTMParamData.getAllDoubleValue(str);
                return allDoubleValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return allDoubleValue;
    }

    private long[] jniGetAllIntValue(String str) {
        long[] allIntValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                allIntValue = iTTMParamData.getAllIntValue(str);
                return allIntValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return allIntValue;
    }

    private String[] jniGetAllStringValue(String str) {
        String[] allStringValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                allStringValue = iTTMParamData.getAllStringValue(str);
                return allStringValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return allStringValue;
    }

    public void AddArrayItem(TTMParamData tTMParamData) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return;
            }
            iTTMParamData.addArrayItem(tTMParamData.actualParamData);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public TTMParamData GetArrayItem(int i) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                return new TTMParamData(new TTMParamData(iTTMParamData.getArrayItem(i)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public TTMParamData GetObjectItem(String str) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                ITTMParamData objectItem = iTTMParamData.getObjectItem(str);
                if (objectItem != null) {
                    return new TTMParamData(objectItem);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public boolean containsKey(String str) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return false;
            }
            return iTTMParamData.containsKey(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public TTMParamData getArrayItem(int i) {
        return GetArrayItem(i);
    }

    public double getDoubleValue(String str) {
        double doubleValue = Double.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                doubleValue = iTTMParamData.getDoubleValue(str, Integer.MAX_VALUE);
                return doubleValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return doubleValue;
    }

    public long getIntValue(String str) {
        long intValue = Long.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                intValue = iTTMParamData.getIntValue(str, Integer.MAX_VALUE);
                return intValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return intValue;
    }

    public TTMParamData getObjectItem(String str) {
        return GetObjectItem(str);
    }

    public String getStringValue(String str) {
        String stringValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                stringValue = iTTMParamData.getStringValue(str, Integer.MAX_VALUE);
                return stringValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return stringValue;
    }

    public void removeData(String str) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return;
            }
            iTTMParamData.removeData(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public boolean removeKey(String str) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return false;
            }
            return iTTMParamData.removeValue(str, Integer.MAX_VALUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public void setActualParamData(ITTMParamData iTTMParamData) {
        this.actualParamData = iTTMParamData;
    }

    public TTMParamData(n nVar) {
        TTMGsonJsonObjectParam tTMGsonJsonObjectParam;
        if (nVar == null) {
            tTMGsonJsonObjectParam = null;
        } else {
            tTMGsonJsonObjectParam = new TTMGsonJsonObjectParam(nVar);
        }
        this.actualParamData = tTMGsonJsonObjectParam;
    }

    public double getDoubleValue(int i) {
        double doubleValue = Double.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                doubleValue = iTTMParamData.getDoubleValue(null, i);
                return doubleValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return doubleValue;
    }

    public long getIntValue(int i) {
        long intValue = Long.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                intValue = iTTMParamData.getIntValue(null, i);
                return intValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return intValue;
    }

    public String getStringValue(int i) {
        String stringValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                stringValue = iTTMParamData.getStringValue(null, i);
                return stringValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return stringValue;
    }

    public TTMParamData(Boolean bool) {
        TTMNumberParam tTMNumberParam;
        if (bool == null) {
            tTMNumberParam = null;
        } else {
            tTMNumberParam = new TTMNumberParam(bool);
        }
        this.actualParamData = tTMNumberParam;
    }

    public TTMParamData(String str) {
        TTMStringParam tTMStringParam;
        if (str == null) {
            tTMStringParam = null;
        } else {
            tTMStringParam = new TTMStringParam(str);
        }
        this.actualParamData = tTMStringParam;
    }

    public TTMParamData(Collection<Object> collection) {
        TTMCollectionParam tTMCollectionParam;
        if (collection == null) {
            tTMCollectionParam = null;
        } else {
            tTMCollectionParam = new TTMCollectionParam(collection);
        }
        this.actualParamData = tTMCollectionParam;
    }

    public TTMParamData(List<Object> list) {
        TTMCollectionParam tTMCollectionParam;
        if (list == null) {
            tTMCollectionParam = null;
        } else {
            tTMCollectionParam = new TTMCollectionParam(list);
        }
        this.actualParamData = tTMCollectionParam;
    }

    public TTMParamData(Map<String, Object> map) {
        TTMMapParam tTMMapParam;
        if (map == null) {
            tTMMapParam = null;
        } else {
            tTMMapParam = new TTMMapParam(map);
        }
        this.actualParamData = tTMMapParam;
    }

    public TTMParamData(JSONArray jSONArray) {
        TTMJSONArrayParam tTMJSONArrayParam;
        if (jSONArray == null) {
            tTMJSONArrayParam = null;
        } else {
            tTMJSONArrayParam = new TTMJSONArrayParam(jSONArray);
        }
        this.actualParamData = tTMJSONArrayParam;
    }

    public TTMParamData(double[] dArr) {
        TTMNumberArrayParam tTMNumberArrayParam;
        if (dArr == null) {
            tTMNumberArrayParam = null;
        } else {
            tTMNumberArrayParam = new TTMNumberArrayParam(dArr);
        }
        this.actualParamData = tTMNumberArrayParam;
    }

    public TTMParamData(float[] fArr) {
        TTMNumberArrayParam tTMNumberArrayParam;
        if (fArr == null) {
            tTMNumberArrayParam = null;
        } else {
            tTMNumberArrayParam = new TTMNumberArrayParam(fArr);
        }
        this.actualParamData = tTMNumberArrayParam;
    }

    public TTMParamData(int[] iArr) {
        TTMNumberArrayParam tTMNumberArrayParam;
        if (iArr == null) {
            tTMNumberArrayParam = null;
        } else {
            tTMNumberArrayParam = new TTMNumberArrayParam(iArr);
        }
        this.actualParamData = tTMNumberArrayParam;
    }

    public TTMParamData(long[] jArr) {
        TTMNumberArrayParam tTMNumberArrayParam;
        if (jArr == null) {
            tTMNumberArrayParam = null;
        } else {
            tTMNumberArrayParam = new TTMNumberArrayParam(jArr);
        }
        this.actualParamData = tTMNumberArrayParam;
    }

    public TTMParamData(Number[] numberArr) {
        TTMNumberObjectArrayParam tTMNumberObjectArrayParam;
        if (numberArr == null) {
            tTMNumberObjectArrayParam = null;
        } else {
            tTMNumberObjectArrayParam = new TTMNumberObjectArrayParam(numberArr);
        }
        this.actualParamData = tTMNumberObjectArrayParam;
    }

    public TTMParamData(String[] strArr) {
        TTMStringArrayParam tTMStringArrayParam;
        if (strArr == null) {
            tTMStringArrayParam = null;
        } else {
            tTMStringArrayParam = new TTMStringArrayParam(strArr);
        }
        this.actualParamData = tTMStringArrayParam;
    }

    public TTMParamData(double d) {
        this.actualParamData = new TTMNumberParam(d);
    }

    public TTMParamData(float f) {
        this.actualParamData = new TTMNumberParam(f);
    }

    public TTMParamData(int i) {
        this.actualParamData = new TTMNumberParam(i);
    }

    public TTMParamData(long j) {
        this.actualParamData = new TTMNumberParam(j);
    }

    public TTMParamData(boolean z) {
        this.actualParamData = new TTMNumberParam(z);
    }

    public TTMParamData(Object obj) {
        this.actualParamData = C829660Wge.LIZ(obj);
    }

    public TTMParamData(JSONObject jSONObject) {
        this.actualParamData = C829660Wge.LIZIZ(jSONObject);
    }

    public TTMParamData(ITTMParamData iTTMParamData) {
        this.actualParamData = iTTMParamData;
    }

    private double JniGetDoubleValue(String str, int i) {
        double doubleValue = Double.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                doubleValue = iTTMParamData.getDoubleValue(str, i);
                return doubleValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return doubleValue;
    }

    private long JniGetIntValue(String str, int i) {
        long intValue = Long.MAX_VALUE;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                intValue = iTTMParamData.getIntValue(str, i);
                return intValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return intValue;
    }

    private String JniGetStringValue(String str, int i) {
        String stringValue = null;
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData != null) {
                stringValue = iTTMParamData.getStringValue(str, i);
                return stringValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return stringValue;
    }

    public boolean addValue(String str, Object obj) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return false;
            }
            return iTTMParamData.addValue(str, Integer.MAX_VALUE, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public void mergeDataAsSubData(String str, TTMParamData tTMParamData) {
        try {
            ITTMParamData iTTMParamData = this.actualParamData;
            if (iTTMParamData == null) {
                return;
            }
            iTTMParamData.mergeDataAsSubData(str, tTMParamData.actualParamData);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private boolean jniModifyData(String str, int i, Object obj, int i2) {
        ITTMParamData iTTMParamData = this.actualParamData;
        if (iTTMParamData == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (obj instanceof TTMParamData) {
                            obj = ((TTMParamData) obj).getInputData();
                        }
                        return this.actualParamData.addValue(str, i, obj);
                    }
                    return false;
                }
                return iTTMParamData.removeValue(str, i);
            }
            return iTTMParamData.addValue(str, i, obj);
        }
        return iTTMParamData.replaceValue(str, i, obj);
    }

    private boolean jniModifyData(String str, int i, double d, int i2) {
        ITTMParamData iTTMParamData = this.actualParamData;
        if (iTTMParamData == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return iTTMParamData.addValue(str, i, Double.valueOf(d));
            }
            return false;
        }
        return iTTMParamData.replaceValue(str, i, Double.valueOf(d));
    }

    private boolean jniModifyData(String str, int i, long j, int i2) {
        ITTMParamData iTTMParamData = this.actualParamData;
        if (iTTMParamData == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return iTTMParamData.addValue(str, i, Long.valueOf(j));
            }
            return false;
        }
        return iTTMParamData.replaceValue(str, i, Long.valueOf(j));
    }

    private boolean jniModifyData(String str, int i, boolean z, int i2) {
        ITTMParamData iTTMParamData = this.actualParamData;
        if (iTTMParamData == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return iTTMParamData.addValue(str, i, Boolean.valueOf(z));
            }
            return false;
        }
        return iTTMParamData.replaceValue(str, i, Boolean.valueOf(z));
    }
}
