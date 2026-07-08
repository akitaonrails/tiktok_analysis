package com.bytedance.common.utility.reflect;

import X.C0WZX;
import X.C2039307yp;
import X.C2039407yq;
import X.C2188811AlT;
import X.C2204961BRm;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class Reflect {
    public final boolean isClass;
    public final Object object;

    public Reflect create() {
        return create(new Object[0]);
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> clsType = type();
        do {
            for (Field field : clsType.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            clsType = clsType.getSuperclass();
        } while (clsType != null);
        return linkedHashMap;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        return this.isClass ? (Class) this.object : this.object.getClass();
    }

    public <T> T get() {
        return (T) this.object;
    }

    public Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static Class<?> forName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2039307yp(e);
        }
    }

    public static Reflect on(String str) {
        return on(forName(str));
    }

    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase(Locale.getDefault());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, 1).toLowerCase(Locale.getDefault()));
        sbLIZ.append(str.substring(1));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Class<?>[] types(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = C2039407yq.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    public <P> P as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.07yo
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                int length;
                String name = method.getName();
                try {
                    return Reflect.on(this.LLILLJJLI.object).call(name, Reflect.types(objArr), objArr).get();
                } catch (C2039307yp e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (z) {
                        Map map = (Map) this.LLILLJJLI.object;
                        if (objArr == null) {
                            length = 0;
                        } else {
                            length = objArr.length;
                        }
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e;
                }
            }
        });
    }

    public Reflect call(String str) {
        return call(str, null, new Object[0]);
    }

    public Reflect create(Object... objArr) {
        Class<?>[] clsArrTypes = types(objArr);
        try {
            return on(type().getDeclaredConstructor(clsArrTypes), objArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), clsArrTypes)) {
                    return on(constructor, objArr);
                }
            }
            throw new C2039307yp(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private Field field0(String str, Class<?>... clsArr) {
        int i;
        Class<?> clsType = type();
        if (clsArr != null && clsArr.length > 0) {
            do {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                for (Field field : clsType.getDeclaredFields()) {
                    Class<?> type = field.getType();
                    if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                        return (Field) accessible(field);
                    }
                    clsType = clsType.getSuperclass();
                }
                clsType = clsType.getSuperclass();
            } while (clsType != null);
            throw new C2039307yp("NoSuchFieldException");
        }
        try {
            return clsType.getField(str);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            do {
                try {
                    return (Field) accessible(clsType.getDeclaredField(str));
                } catch (NoSuchFieldException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    clsType = clsType.getSuperclass();
                }
            } while (clsType != null);
            throw new C2039307yp(e2);
        }
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C2039407yq.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static Reflect on(Constructor<?> constructor, Object... objArr) {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2039307yp(e);
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsType = type();
        for (Method method : clsType.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsType.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsType = clsType.getSuperclass();
        } while (clsType != null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No similar method ");
        sbLIZ.append(str);
        sbLIZ.append(" with params ");
        sbLIZ.append(Arrays.toString(clsArr));
        sbLIZ.append(" could be found on type ");
        sbLIZ.append(type());
        sbLIZ.append(e3.d);
        throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Field exactField(String str, Class<?>... clsArr) {
        return field0(str, clsArr);
    }

    public Reflect field(String str, Class<?>... clsArr) {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2039307yp(e);
        }
    }

    public <T> T get(String str, Class<?>... clsArr) {
        return (T) field(str, clsArr).get();
    }

    public Reflect set(String str, Object obj) {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2039307yp(e);
        }
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && match(method.getParameterTypes(), clsArr)) {
            return true;
        }
        return false;
    }

    public static Reflect on(Method method, Object obj, Object... objArr) throws Throwable {
        try {
            accessible(method);
            if (method.getReturnType() == Void.TYPE) {
                C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tdof/xwVMiSRiloB4siNQ=", null));
                return on(obj);
            }
            return on(C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tdof/xwVMiSRiloB4siNQ=", null)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2039307yp(e);
        }
    }

    public Reflect call(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return on(exactMethod(str, clsArr, objArr), this.object, objArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return on(similarMethod(str, clsArr), this.object, objArr);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C2039307yp(e2);
            }
        }
    }

    public Method exactMethod(String str, Class<?>[] clsArr, Object... objArr) {
        Class<?> clsType = type();
        try {
            return clsType.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            do {
                try {
                    return clsType.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    clsType = clsType.getSuperclass();
                }
            } while (clsType != null);
            for (Method method : type().getMethods()) {
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (Logger.debug()) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                        }
                    }
                    if (parameterTypes != null && parameterTypes.length == clsArr.length) {
                        return method;
                    }
                }
            }
            throw new NoSuchMethodException();
        }
    }
}
