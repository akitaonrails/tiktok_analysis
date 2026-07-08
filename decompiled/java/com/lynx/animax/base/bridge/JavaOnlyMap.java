package com.lynx.animax.base.bridge;

import X.C2188811AlT;
import X.InterfaceC1285700jYu;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap {
    @Override // com.lynx.animax.base.bridge.ReadableMap
    public HashMap<String, Object> asHashMap() {
        return this;
    }

    public static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    public JavaOnlyMap() {
    }

    public JavaOnlyMap(Map map) {
        super(map);
    }

    public static JavaOnlyMap from(Map map) {
        return new JavaOnlyMap(map);
    }

    @Override // com.lynx.animax.base.bridge.ReadableMap
    public InterfaceC1285700jYu getArray(String str) {
        Object obj = get(str);
        if (obj instanceof JavaOnlyArray) {
            return (JavaOnlyArray) obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(InterfaceC1285700jYu.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.animax.base.bridge.ReadableMap
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

    @Override // com.lynx.animax.base.bridge.ReadableMap
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
            if (obj instanceof InterfaceC1285700jYu) {
                return ReadableType.Array;
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

    @Override // com.lynx.animax.base.bridge.ReadableMap
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

    @Override // com.lynx.animax.base.bridge.ReadableMap
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

    @Override // com.lynx.animax.base.bridge.ReadableMap
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

    public void putArray(String str, JavaOnlyArray javaOnlyArray) {
        put(str, javaOnlyArray);
    }

    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    public void putString(String str, String str2) {
        put(str, str2);
    }
}
