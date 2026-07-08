package com.bytedance.vmsdk.jsbridge.utils;

import X.C2188811AlT;
import X.C2204581BQa;
import X.C2204621BQe;
import X.C830490Whz;
import X.InterfaceC2204631BQf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    public static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator(this) { // from class: X.0pxK
            public final Iterator<String> LIZ;

            @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator
            public final boolean hasNextKey() {
                return this.LIZ.hasNext();
            }

            @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator
            public final String nextKey() {
                return this.LIZ.next();
            }

            {
                this.LIZ = this.keySet().iterator();
            }
        };
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public C830490Whz<String, Object> toArrayMap() {
        C830490Whz<String, Object> c830490Whz = new C830490Whz<>();
        c830490Whz.putAll(this);
        return c830490Whz;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        if (size() == 0) {
            return jSONObject;
        }
        for (String str : keySet()) {
            Object obj = get(str);
            try {
                if (getType(str) == ReadableType.Map) {
                    jSONObject.putOpt(str, ((JavaOnlyMap) obj).toJSONObject());
                } else if (getType(str) == ReadableType.Array) {
                    jSONObject.putOpt(str, ((JavaOnlyArray) obj).toJSONArray());
                } else if (getType(str) == ReadableType.Null) {
                    jSONObject.putOpt(str, JSONObject.NULL);
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int size() {
        return super.size();
    }

    public JavaOnlyMap() {
    }

    public JavaOnlyMap(Map map) {
        super(map);
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (C2204581BQa.LIZ[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putInt(strNextKey, readableMap.getInt(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putLong(strNextKey, readableMap.getLong(strNextKey));
                    break;
                case 5:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 6:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 7:
                    javaOnlyMap.putMap(strNextKey, deepClone(readableMap.getMap(strNextKey)));
                    break;
                case 8:
                    javaOnlyMap.putArray(strNextKey, JavaOnlyArray.deepClone(readableMap.getArray(strNextKey)));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    javaOnlyMap.putByteArray(strNextKey, (byte[]) readableMap.getByteArray(strNextKey).clone());
                    break;
            }
        }
        return javaOnlyMap;
    }

    public static JavaOnlyMap from(Map map) {
        return new JavaOnlyMap(map);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public JavaOnlyArray getArray(String str) {
        Object obj = get(str);
        if (obj instanceof JavaOnlyArray) {
            return (JavaOnlyArray) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(JavaOnlyArray.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getName());
            sbLIZ.append(" cannot be cast to java.lang.Boolean, key: ");
            sbLIZ.append(str);
            throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key: ");
        sbLIZ2.append(str);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public byte[] getByteArray(String str) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(byte[].class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getName());
            sbLIZ.append(" cannot be cast to java.lang.Number, key: ");
            sbLIZ.append(str);
            throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key: ");
        sbLIZ2.append(str);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public InterfaceC2204631BQf getDynamic(String str) {
        C2204621BQe c2204621BQeLIZIZ = C2204621BQe.LIZJ.LIZIZ();
        if (c2204621BQeLIZIZ == null) {
            c2204621BQeLIZIZ = new C2204621BQe();
        }
        c2204621BQeLIZIZ.LIZ = this;
        c2204621BQeLIZIZ.LIZIZ = str;
        return c2204621BQeLIZIZ;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getName());
            sbLIZ.append(" cannot be cast to java.lang.Number, key: ");
            sbLIZ.append(str);
            throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key: ");
        sbLIZ2.append(str);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getName());
            sbLIZ.append(" cannot be cast to java.lang.Long, key: ");
            sbLIZ.append(str);
            throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key: ");
        sbLIZ2.append(str);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMap getMap(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(ReadableMap.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public NativeHostObject getNativeHostObject(String str) {
        Object obj = get(str);
        if (obj instanceof NativeHostObject) {
            return (NativeHostObject) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(JavaOnlyArray.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to java.lang.String, key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableType getType(String str) {
        Object obj = get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if (!(obj instanceof Number) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return ReadableType.String;
            }
            if (obj instanceof Boolean) {
                return ReadableType.Boolean;
            }
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            if (obj instanceof ReadableArray) {
                return ReadableType.Array;
            }
            if (obj instanceof byte[]) {
                return ReadableType.ByteArray;
            }
            if (obj instanceof InterfaceC2204631BQf) {
                return ((InterfaceC2204631BQf) obj).getType();
            }
            if (obj instanceof NativeHostObject) {
                return ReadableType.NativeHostObject;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid value ");
            sbLIZ.append(obj.toString());
            sbLIZ.append(" for key ");
            sbLIZ.append(str);
            sbLIZ.append("contained in JavaOnlyMap");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return ReadableType.Number;
    }

    public int getTypeIndex(String str) {
        return getType(str).ordinal();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((JavaOnlyMap) readableMap);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putNativeHostObject(String str, NativeHostObject nativeHostObject) {
        put(str, nativeHostObject);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }
}
