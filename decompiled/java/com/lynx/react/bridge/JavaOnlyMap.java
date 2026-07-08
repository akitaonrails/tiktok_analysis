package com.lynx.react.bridge;

import X.C1297670jsD;
import X.C2188811AlT;
import X.InterfaceC1298070jsr;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.TemplateData;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    @Override // com.lynx.react.bridge.ReadableMap
    public HashMap<String, Object> asHashMap() {
        return this;
    }

    public static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator(this) { // from class: X.0jjB
            public final Iterator<String> LIZ;

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public final boolean hasNextKey() {
                return this.LIZ.hasNext();
            }

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public final String nextKey() {
                return this.LIZ.next();
            }

            {
                this.LIZ = this.keySet().iterator();
            }
        };
    }

    @Override // com.lynx.react.bridge.ReadableMap
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

    private JavaOnlyMap shallowCopy() {
        return shallowCopy(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, com.lynx.react.bridge.ReadableMap
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
            switch (C1297670jsD.LIZ[readableMap.getType(strNextKey).ordinal()]) {
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

    public static JavaOnlyMap shallowCopy(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (C1297670jsD.LIZ[readableMap.getType(strNextKey).ordinal()]) {
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
                    javaOnlyMap.putMap(strNextKey, (WritableMap) readableMap.getMap(strNextKey));
                    break;
                case 8:
                    javaOnlyMap.putArray(strNextKey, (WritableArray) readableMap.getArray(strNextKey));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    javaOnlyMap.putByteArray(strNextKey, readableMap.getByteArray(strNextKey));
                    break;
            }
        }
        return javaOnlyMap;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableArray getArray(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(ReadableArray.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.equalsIgnoreCase("true") && !str2.equalsIgnoreCase("yes")) {
                return false;
            }
            return true;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key: ");
            sbLIZ.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(obj.getClass().getName());
        sbLIZ2.append(" cannot be cast to java.lang.Boolean, key: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", value: ");
        sbLIZ2.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ByteBuffer getByteBuffer(String str) {
        Object obj = get(str);
        if (obj instanceof ByteBuffer) {
            return (ByteBuffer) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(ByteBuffer.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to double, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Number, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public InterfaceC1298070jsr getDynamic(final String str) {
        return new InterfaceC1298070jsr(str, this) { // from class: X.0jsV
            public final ReadableMap LIZ;
            public final String LIZIZ;

            @Override // X.InterfaceC1298070jsr
            public final ReadableArray asArray() {
                return this.LIZ.getArray(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final boolean asBoolean() {
                return this.LIZ.getBoolean(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final double asDouble() {
                return this.LIZ.getDouble(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final int asInt() {
                return this.LIZ.getInt(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final long asLong() {
                return this.LIZ.getLong(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final ReadableMap asMap() {
                return this.LIZ.getMap(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final String asString() {
                return this.LIZ.getString(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final ReadableType getType() {
                return this.LIZ.getType(this.LIZIZ);
            }

            @Override // X.InterfaceC1298070jsr
            public final boolean isNull() {
                return this.LIZ.isNull(this.LIZIZ);
            }

            {
                this.LIZ = this;
                this.LIZIZ = str;
            }
        };
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to int, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Number, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to long int, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Long, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public PiperData getPiperData(String str) {
        Object obj = get(str);
        if (obj instanceof PiperData) {
            return (PiperData) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(PiperData.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to java.lang.String, key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public TemplateData getTemplateData(String str) {
        Object obj = get(str);
        if (obj instanceof TemplateData) {
            return (TemplateData) obj;
        }
        return null;
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
            if (obj instanceof PiperData) {
                return ReadableType.PiperData;
            }
            if (obj instanceof TemplateData) {
                return ReadableType.TemplateData;
            }
            if (obj instanceof InterfaceC1298070jsr) {
                return ((InterfaceC1298070jsr) obj).getType();
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

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll(readableMap.asHashMap());
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("yes")) {
                return true;
            }
            if (str2.equalsIgnoreCase("false") || str2.equalsIgnoreCase("no")) {
                return false;
            }
        }
        return z;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ByteBuffer getByteBuffer(String str, ByteBuffer byteBuffer) {
        Object obj = get(str);
        if (obj instanceof ByteBuffer) {
            return (ByteBuffer) obj;
        }
        return byteBuffer;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return d;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public PiperData getPiperData(String str, PiperData piperData) {
        Object obj = get(str);
        if (obj instanceof PiperData) {
            return (PiperData) obj;
        }
        return piperData;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return str2;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteBuffer(String str, ByteBuffer byteBuffer) {
        put(str, byteBuffer);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putPiperData(String str, PiperData piperData) {
        put(str, piperData);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }
}
