package com.google.gson.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static final Map<Class<?>, Class<?>> LIZ;
    public static final Map<Class<?>, Class<?>> LIZIZ;

    static {
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        Class cls = Boolean.TYPE;
        map.put(cls, Boolean.class);
        map2.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2, Byte.class);
        map2.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(cls3, Character.class);
        map2.put(Character.class, cls3);
        Class cls4 = Double.TYPE;
        map.put(cls4, Double.class);
        map2.put(Double.class, cls4);
        Class cls5 = Float.TYPE;
        map.put(cls5, Float.class);
        map2.put(Float.class, cls5);
        Class cls6 = Integer.TYPE;
        map.put(cls6, Integer.class);
        map2.put(Integer.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7, Long.class);
        map2.put(Long.class, cls7);
        Class cls8 = Short.TYPE;
        map.put(cls8, Short.class);
        map2.put(Short.class, cls8);
        Class cls9 = Void.TYPE;
        map.put(cls9, Void.class);
        map2.put(Void.class, cls9);
        LIZ = Collections.unmodifiableMap(map);
        LIZIZ = Collections.unmodifiableMap(map2);
    }

    public static <T> Class<T> LIZ(Class<T> cls) {
        Map<Class<?>, Class<?>> map = LIZ;
        cls.getClass();
        Class<T> cls2 = (Class) map.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }
}
