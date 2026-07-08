package com.lynx.react.bridge;

import X.C1297660jsC;
import X.C2188811AlT;
import X.InterfaceC1298000jsk;
import X.InterfaceC1298070jsr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.jsi.ILynxJSIObject;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.TemplateData;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes21.dex */
public class JavaOnlyArray extends ArrayList<Object> implements ReadableArray, WritableArray, InterfaceC1298000jsk {
    @Override // com.lynx.react.bridge.ReadableArray
    public ArrayList<Object> asArrayList() {
        return this;
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushNull() {
        add(null);
    }

    public static JavaOnlyArray create() {
        return new JavaOnlyArray();
    }

    @Override // com.lynx.react.bridge.ReadableArray
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

    private JavaOnlyArray shallowCopy() {
        return shallowCopy(this);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List, com.lynx.react.bridge.ReadableArray
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
            switch (C1297660jsC.LIZ[readableArray.getType(i).ordinal()]) {
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
        return new JavaOnlyArray(Arrays.asList(objArr));
    }

    public static JavaOnlyArray shallowCopy(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C1297660jsC.LIZ[readableArray.getType(i).ordinal()]) {
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
                    javaOnlyArray.pushMap((WritableMap) readableArray.getMap(i));
                    break;
                case 8:
                    javaOnlyArray.pushArray((WritableArray) readableArray.getArray(i));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    javaOnlyArray.pushByteArray(readableArray.getByteArray(i));
                    break;
            }
        }
        return javaOnlyArray;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) get(i);
    }

    public Object getAt(int i) {
        return get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) get(i)).booleanValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public byte getByte(int i) {
        return ((Number) get(i)).byteValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public byte[] getByteArray(int i) {
        return (byte[]) get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public char getChar(int i) {
        return (char) ((Number) get(i)).shortValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Number) get(i)).doubleValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public InterfaceC1298070jsr getDynamic(final int i) {
        return new InterfaceC1298070jsr(i, this) { // from class: X.0jsj
            public final ReadableArray LIZ;
            public final int LIZIZ;

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
                this.LIZIZ = i;
            }
        };
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public int getInt(int i) {
        return ((Number) get(i)).intValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public long getLong(int i) {
        return ((Number) get(i)).longValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) get(i);
    }

    public Object getObject(int i) {
        return get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public PiperData getPiperData(int i) {
        return (PiperData) get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public short getShort(int i) {
        return ((Number) get(i)).shortValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public String getString(int i) {
        return (String) get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
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
            if (obj instanceof PiperData) {
                return ReadableType.PiperData;
            }
            if (obj instanceof ILynxJSIObject) {
                return ReadableType.LynxObject;
            }
            if (obj instanceof TemplateData) {
                return ReadableType.TemplateData;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unsupported type ");
            sbLIZ.append(obj.getClass());
            sbLIZ.append(" contained in JavaOnlyArray");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return ReadableType.Number;
    }

    public int getTypeIndex(int i) {
        return getType(i).ordinal();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public boolean isNull(int i) {
        if (get(i) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushArray(WritableArray writableArray) {
        add(writableArray);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushBoolean(boolean z) {
        add(Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushByteArray(byte[] bArr) {
        add(bArr);
    }

    public void pushByteArrayAsString(byte[] bArr) {
        add(new String(bArr));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushDouble(double d) {
        add(Double.valueOf(d));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushInt(int i) {
        add(Integer.valueOf(i));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushLong(long j) {
        add(Long.valueOf(j));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushMap(WritableMap writableMap) {
        add(writableMap);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushPiperData(PiperData piperData) {
        add(piperData);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushString(String str) {
        add(str);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushTemplateData(TemplateData templateData) {
        add(templateData);
    }
}
