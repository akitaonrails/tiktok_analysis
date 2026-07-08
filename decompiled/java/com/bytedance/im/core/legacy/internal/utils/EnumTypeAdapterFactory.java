package com.bytedance.im.core.legacy.internal.utils;

import X.C09CT;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09EK;
import X.C09EL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class EnumTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        C09EL c09el;
        Object objValueOf;
        if (typeToken == null) {
            return null;
        }
        Class<? super T> rawType = typeToken.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        final HashMap map = new HashMap();
        try {
            for (Object obj : rawType.getEnumConstants()) {
                if (obj != null) {
                    C09CT c09ct = (C09CT) obj.getClass().getField(obj.toString()).getAnnotation(C09CT.class);
                    if (c09ct != null) {
                        map.put(obj, new C09EK(c09ct.value(), C09EL.STRING));
                    } else {
                        Field[] declaredFields = obj.getClass().getDeclaredFields();
                        if (declaredFields != null && declaredFields.length > 0) {
                            for (Field field : declaredFields) {
                                String name = field.getType().getName();
                                for (int i = 0; i < C09EL.values().length; i++) {
                                    if (C09EL.values()[i].LL.equals(name)) {
                                        field.setAccessible(true);
                                        String name2 = field.getType().getName();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < C09EL.values().length) {
                                                c09el = C09EL.values()[i2];
                                                if (c09el.LL.equals(name2)) {
                                                    break;
                                                }
                                                i2++;
                                            } else {
                                                c09el = null;
                                                break;
                                            }
                                        }
                                        int iOrdinal = c09el.ordinal();
                                        if (iOrdinal != 0) {
                                            if (iOrdinal != 1) {
                                                if (iOrdinal != 2) {
                                                    if (iOrdinal != 3) {
                                                        if (iOrdinal == 4) {
                                                            objValueOf = Boolean.valueOf(field.getBoolean(obj));
                                                        }
                                                    } else {
                                                        objValueOf = Double.valueOf(field.getDouble(obj));
                                                    }
                                                } else {
                                                    objValueOf = Long.valueOf(field.getLong(obj));
                                                }
                                            } else {
                                                objValueOf = field.get(obj);
                                            }
                                        } else {
                                            objValueOf = Integer.valueOf(field.getInt(obj));
                                        }
                                        if (objValueOf != null) {
                                            map.put(obj, new C09EK(objValueOf, c09el));
                                        }
                                    }
                                }
                            }
                            map.put(obj, new C09EK(obj.toString(), C09EL.STRING));
                        } else {
                            map.put(obj, new C09EK(obj.toString(), C09EL.STRING));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new TypeAdapter<T>() { // from class: com.bytedance.im.core.legacy.internal.utils.EnumTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                String strLJJJZ = c09cu.LJJJZ();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() != null && ((C09EK) entry.getValue()).LIZ != null && ((C09EK) entry.getValue()).LIZ.toString().equals(strLJJJZ)) {
                        return (T) entry.getKey();
                    }
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) throws IOException {
                if (t == null) {
                    c09dl.LJIJJ();
                    return;
                }
                C09EK c09ek = (C09EK) map.get(t);
                if (c09ek == null) {
                    return;
                }
                int iOrdinal2 = c09ek.LIZIZ.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                if (iOrdinal2 != 4) {
                                    return;
                                }
                                c09dl.LJJJ((Boolean) c09ek.LIZ);
                                return;
                            }
                            c09dl.LJJIL(((Double) c09ek.LIZ).doubleValue());
                            return;
                        }
                        c09dl.LJJIZ(((Long) c09ek.LIZ).longValue());
                        return;
                    }
                    c09dl.LJJJJJ((String) c09ek.LIZ);
                    return;
                }
                c09dl.LJJIZ(((Integer) c09ek.LIZ).intValue());
            }
        };
    }
}
