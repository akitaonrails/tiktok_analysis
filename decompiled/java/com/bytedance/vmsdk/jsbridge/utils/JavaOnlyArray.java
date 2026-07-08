package com.bytedance.vmsdk.jsbridge.utils;

import X.C1BQZ;
import X.C2204611BQd;
import X.InterfaceC2204631BQf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public class JavaOnlyArray extends ArrayList<Object> implements ReadableArray, WritableArray {
    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushNull() {
        add(null);
    }

    public static JavaOnlyArray create() {
        return new JavaOnlyArray();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this);
    }

    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = get(i);
            try {
                if (getType(i) == ReadableType.Map) {
                    jSONArray.put(((JavaOnlyMap) obj).toJSONObject());
                } else if (getType(i) == ReadableType.Array) {
                    jSONArray.put(((JavaOnlyArray) obj).toJSONArray());
                } else {
                    jSONArray.put(obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONArray;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List, com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public int size() {
        return super.size();
    }

    public JavaOnlyArray() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
    }

    public JavaOnlyArray(List list) {
        super(list);
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C1BQZ.LIZ[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushInt(readableArray.getInt(i));
                    break;
                case 4:
                    javaOnlyArray.pushLong(readableArray.getLong(i));
                    break;
                case 5:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 6:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 7:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case 8:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    javaOnlyArray.pushByteArray((byte[]) readableArray.getByteArray(i).clone());
                    break;
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    public static JavaOnlyArray of(Object... objArr) {
        if (objArr == null) {
            return new JavaOnlyArray();
        }
        return new JavaOnlyArray(Arrays.asList(objArr));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) get(i);
    }

    public Object getAt(int i) {
        return get(i);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) get(i)).booleanValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public byte getByte(int i) {
        return ((Number) get(i)).byteValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public byte[] getByteArray(int i) {
        return (byte[]) get(i);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public char getChar(int i) {
        return (char) ((Number) get(i)).shortValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public double getDouble(int i) {
        return ((Number) get(i)).doubleValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public InterfaceC2204631BQf getDynamic(int i) {
        C2204611BQd c2204611BQdLIZIZ = C2204611BQd.LIZJ.LIZIZ();
        if (c2204611BQdLIZIZ == null) {
            c2204611BQdLIZIZ = new C2204611BQd();
        }
        c2204611BQdLIZIZ.LIZ = this;
        c2204611BQdLIZIZ.LIZIZ = i;
        return c2204611BQdLIZIZ;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public int getInt(int i) {
        return ((Number) get(i)).intValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public long getLong(int i) {
        return ((Number) get(i)).longValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) get(i);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public NativeHostObject getNativeHostObject(int i) {
        return (NativeHostObject) get(i);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public short getShort(int i) {
        return ((Number) get(i)).shortValue();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public String getString(int i) {
        return (String) get(i);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public ReadableType getType(int i) {
        Object obj = get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
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
            if (obj instanceof ReadableArray) {
                return ReadableType.Array;
            }
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            if (obj instanceof byte[]) {
                return ReadableType.ByteArray;
            }
            if (obj instanceof NativeHostObject) {
                return ReadableType.NativeHostObject;
            }
            return null;
        }
        return ReadableType.Number;
    }

    public int getTypeIndex(int i) {
        return getType(i).ordinal();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableArray
    public boolean isNull(int i) {
        if (get(i) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushArray(WritableArray writableArray) {
        add(writableArray);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushBoolean(boolean z) {
        add(Boolean.valueOf(z));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushByteArray(byte[] bArr) {
        add(bArr);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushByteArrayAsString(byte[] bArr) {
        add(new String(bArr));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushDouble(double d) {
        add(Double.valueOf(d));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushInt(int i) {
        add(Integer.valueOf(i));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushLong(long j) {
        add(Long.valueOf(j));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushMap(WritableMap writableMap) {
        add(writableMap);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void pushString(String str) {
        add(str);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableArray
    public void putNativeHostObject(NativeHostObject nativeHostObject) {
        add(nativeHostObject);
    }
}
