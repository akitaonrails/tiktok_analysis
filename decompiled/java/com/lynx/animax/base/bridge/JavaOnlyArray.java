package com.lynx.animax.base.bridge;

import X.C2188811AlT;
import X.InterfaceC1285700jYu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class JavaOnlyArray extends ArrayList<Object> implements InterfaceC1285700jYu {
    public ArrayList<Object> asArrayList() {
        return this;
    }

    public static JavaOnlyArray create() {
        return new JavaOnlyArray();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return super.size();
    }

    public String getString(int i) {
        return (String) get(i);
    }

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
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            if (obj instanceof byte[]) {
                return ReadableType.ByteArray;
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

    public void pushArray(JavaOnlyArray javaOnlyArray) {
        add(javaOnlyArray);
    }

    public void pushByteArrayAsString(byte[] bArr) {
        add(new String(bArr));
    }

    public void pushString(String str) {
        add(str);
    }
}
