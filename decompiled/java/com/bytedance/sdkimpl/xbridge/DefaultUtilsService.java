package com.bytedance.sdkimpl.xbridge;

import X.C1298080jss;
import X.C1299060juS;
import X.C1543410qGZ;
import X.C1544000qHW;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1297560js2;
import X.InterfaceC1298030jsn;
import X.InterfaceC1298040jso;
import X.InterfaceC1298070jsr;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.services.IUtilsService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.PiperData;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultUtilsService implements IUtilsService {
    private final WritableArray convertRealArrayToWritableArray(Object[] objArr) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : objArr) {
            if (!(obj instanceof Float) && !(obj instanceof Double)) {
                if (obj instanceof Long) {
                    javaOnlyArray.pushLong(((Long) obj).longValue());
                } else if (obj instanceof Number) {
                    javaOnlyArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    javaOnlyArray.pushString((String) obj);
                } else if (obj instanceof Boolean) {
                    javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Map) {
                    javaOnlyArray.pushMap(convertMapToReadableMap((Map) obj));
                } else if (obj instanceof List) {
                    javaOnlyArray.pushArray(convertArrayToWritableArray((List) obj));
                } else if (obj instanceof Object[]) {
                    javaOnlyArray.pushArray(convertRealArrayToWritableArray((Object[]) obj));
                } else if (obj instanceof JSONArray) {
                    javaOnlyArray.pushArray(convertJsonToArray((JSONArray) obj));
                } else if (obj instanceof JSONObject) {
                    javaOnlyArray.pushMap(convertJsonToMap((JSONObject) obj));
                } else if (obj instanceof PiperData) {
                    javaOnlyArray.pushPiperData((PiperData) obj);
                }
            } else {
                javaOnlyArray.pushDouble(((Double) obj).doubleValue());
            }
        }
        return javaOnlyArray;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableArray convertArrayToWritableArray(List<? extends Object> list) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            if (obj instanceof Map) {
                try {
                    javaOnlyArray.pushMap(convertMapToReadableMap((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    javaOnlyArray.pushArray(convertArrayToWritableArray((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    javaOnlyArray.pushLong(((Number) obj).longValue());
                } else {
                    javaOnlyArray.pushDouble(((Number) obj).longValue());
                }
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else if (obj instanceof PiperData) {
                javaOnlyArray.pushPiperData((PiperData) obj);
            } else {
                try {
                    javaOnlyArray.pushString(obj.toString());
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("convertArrayToWritableArray:");
                    sbLIZ.append(e3);
                    sbLIZ.append(".message");
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                }
            }
        }
        return javaOnlyArray;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableArray convertJsonToArray(JSONArray jSONArray) throws JSONException {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    javaOnlyArray.pushLong(((Number) obj).longValue());
                } else {
                    javaOnlyArray.pushDouble(((Number) obj).longValue());
                }
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else if (!Intrinsics.LJFF(JSONObject.NULL, obj) && obj != null) {
                javaOnlyArray.pushString(obj.toString());
            } else {
                javaOnlyArray.pushNull();
            }
        }
        return javaOnlyArray;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableMap convertJsonToMap(JSONObject jSONObject) throws JSONException {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(next, convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    javaOnlyMap.putLong(next, ((Number) obj).longValue());
                } else {
                    javaOnlyMap.putDouble(next, ((Number) obj).longValue());
                }
            } else if (obj instanceof Float) {
                javaOnlyMap.putDouble(next, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyMap.putString(next, (String) obj);
            } else if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
                javaOnlyMap.putMap(next, null);
            } else {
                javaOnlyMap.putString(next, obj.toString());
            }
        }
        return javaOnlyMap;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableMap convertMapToReadableMap(Map<String, ? extends Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                try {
                    javaOnlyMap.putMap(key, convertMapToReadableMap((Map) value));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (value instanceof List) {
                try {
                    javaOnlyMap.putArray(key, convertArrayToWritableArray((List) value));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if (value instanceof Object[]) {
                try {
                    javaOnlyMap.putArray(key, convertRealArrayToWritableArray((Object[]) value));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            } else if (value instanceof Boolean) {
                javaOnlyMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                javaOnlyMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    javaOnlyMap.putLong(key, ((Number) value).longValue());
                } else {
                    javaOnlyMap.putDouble(key, ((Number) value).longValue());
                }
            } else if (value instanceof Float) {
                javaOnlyMap.putDouble(key, ((Number) value).floatValue());
            } else if (value instanceof Double) {
                javaOnlyMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                javaOnlyMap.putString(key, (String) value);
            } else if (value instanceof JSONObject) {
                javaOnlyMap.putMap(key, convertJsonToMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                javaOnlyMap.putArray(key, convertJsonToArray((JSONArray) value));
            } else if (value instanceof PiperData) {
                javaOnlyMap.putPiperData(key, (PiperData) value);
            } else if (value != null && !Intrinsics.LJFF(value, JSONObject.NULL)) {
                javaOnlyMap.putString(key, value.toString());
            } else {
                javaOnlyMap.putNull(key);
            }
        }
        return javaOnlyMap;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableArray convertXReadableArrayToReadableArray(InterfaceC1298030jsn interfaceC1298030jsn) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (interfaceC1298030jsn.size() <= 0) {
            return javaOnlyArray;
        }
        interfaceC1298030jsn.get();
        throw null;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public WritableMap convertXReadableMapToReadableMap(InterfaceC1298040jso interfaceC1298040jso) {
        new JavaOnlyMap();
        interfaceC1298040jso.LIZIZ();
        throw null;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public Object getValue(Object obj) {
        if (obj instanceof ReadableArray) {
            ReadableArray readableArray = (ReadableArray) obj;
            int size = readableArray.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(getValue(getValue(readableArray.getDynamic(i))));
            }
            return arrayList;
        }
        if (obj instanceof ReadableMap) {
            ReadableMap readableMap = (ReadableMap) obj;
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            HashMap map = new HashMap();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                map.put(strNextKey, getValue(getValue(readableMap.getDynamic(strNextKey))));
            }
            return map;
        }
        if (obj instanceof Number) {
            AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
            if (!C1544000qHW.LJ) {
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                int iIntValue = number.intValue();
                if (dDoubleValue == iIntValue) {
                    return Integer.valueOf(iIntValue);
                }
                return Double.valueOf(dDoubleValue);
            }
            Number number2 = (Number) obj;
            if (!(number2 instanceof Long)) {
                double dDoubleValue2 = number2.doubleValue();
                int iIntValue2 = number2.intValue();
                if (dDoubleValue2 == iIntValue2) {
                    return Integer.valueOf(iIntValue2);
                }
                return Double.valueOf(dDoubleValue2);
            }
        }
        return obj;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public List<Object> jsonToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (objOpt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (objOpt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            } else if (objOpt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(jsonToMap(jSONArray.optJSONObject(i)));
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(jsonToList(jSONArray.optJSONArray(i)));
            } else if (objOpt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public Map<String, Object> jsonToMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof Long) {
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (objOpt instanceof Double) {
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (objOpt instanceof Integer) {
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (objOpt instanceof String) {
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (objOpt instanceof JSONObject) {
                linkedHashMap.put(next, jsonToMap(jSONObject.optJSONObject(next)));
            } else if (objOpt instanceof JSONArray) {
                linkedHashMap.put(next, jsonToList(jSONObject.optJSONArray(next)));
            } else if (objOpt instanceof Boolean) {
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public JSONArray listSupportPiperdataToJSON(List<? extends Object> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    jSONArray.put(((Number) obj).longValue());
                } else {
                    jSONArray.put(((Number) obj).longValue());
                }
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof PiperData) {
                jSONArray.put(obj);
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(mapSupportPiperdataToJSON((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(listSupportPiperdataToJSON((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public JSONArray listToJSON(List<? extends Object> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    jSONArray.put(((Number) obj).longValue());
                } else {
                    jSONArray.put(((Number) obj).longValue());
                }
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof PiperData) {
                jSONArray.put(C1299060juS.LIZIZ((PiperData) obj));
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(mapToJSON((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(listToJSON((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public JSONObject mapSupportPiperdataToJSON(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    jSONObject.put(key, ((Number) value).longValue());
                } else {
                    jSONObject.put(key, ((Number) value).longValue());
                }
            } else if (value instanceof Float) {
                jSONObject.put(key, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(key, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof JSONObject) {
                jSONObject.put(key, value);
            } else if (value instanceof JSONArray) {
                jSONObject.put(key, value);
            } else if (value instanceof PiperData) {
                jSONObject.put(key, value);
            } else if (value instanceof Map) {
                try {
                    jSONObject.put(key, mapSupportPiperdataToJSON((Map) value));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (value instanceof List) {
                try {
                    jSONObject.put(key, listSupportPiperdataToJSON((List) value));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public JSONObject mapToJSON(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (C1544000qHW.LIZLLL) {
                    jSONObject.put(key, ((Number) value).longValue());
                } else {
                    jSONObject.put(key, ((Number) value).longValue());
                }
            } else if (value instanceof Float) {
                jSONObject.put(key, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(key, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof JSONObject) {
                jSONObject.put(key, value);
            } else if (value instanceof JSONArray) {
                jSONObject.put(key, value);
            } else if (value instanceof PiperData) {
                jSONObject.put(key, C1299060juS.LIZIZ((PiperData) value));
            } else if (value instanceof Map) {
                try {
                    jSONObject.put(key, mapToJSON((Map) value));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (value instanceof List) {
                try {
                    jSONObject.put(key, listToJSON((List) value));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.xbridge.services.IUtilsService
    public String toStringOrJson(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Map) {
            return C786410Ut5.J3(new JSONObject((Map) obj));
        }
        if (obj instanceof List) {
            return new JSONArray((Collection) obj).toString();
        }
        return obj.toString();
    }

    public final Object getValue(InterfaceC1298070jsr interfaceC1298070jsr) {
        int i;
        ReadableType type;
        ReadableType type2 = interfaceC1298070jsr.getType();
        if (type2 == null) {
            i = -1;
        } else {
            i = C1298080jss.LIZ[type2.ordinal()];
        }
        switch (i) {
            case 2:
                return interfaceC1298070jsr.asString();
            case 3:
                double dAsDouble = interfaceC1298070jsr.asDouble();
                int iAsInt = interfaceC1298070jsr.asInt();
                if (iAsInt == dAsDouble) {
                    return Integer.valueOf(iAsInt);
                }
                return Double.valueOf(dAsDouble);
            case 4:
                return Boolean.valueOf(interfaceC1298070jsr.asBoolean());
            case 5:
                return interfaceC1298070jsr.asMap();
            case 6:
                return interfaceC1298070jsr.asArray();
            case 7:
                return null;
            default:
                AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
                if (!C1544000qHW.LJ || (type = interfaceC1298070jsr.getType()) == null || C1298080jss.LIZ[type.ordinal()] != 1) {
                    return null;
                }
                return Long.valueOf(interfaceC1298070jsr.asLong());
        }
    }
}
