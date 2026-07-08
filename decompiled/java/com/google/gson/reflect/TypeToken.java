package com.google.gson.reflect;

import X.C786410Ut5;
import com.google.gson.internal.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TypeToken<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public static TypeToken get(Class cls) {
        return com_google_gson_reflect_TypeToken_com_google_gson_reflect_TypeTokenLancet_get(cls);
    }

    public static TypeToken get(Type type) {
        return com_google_gson_reflect_TypeToken_com_google_gson_reflect_TypeTokenLancet_get(type);
    }

    public final String toString() {
        return b.LJIIIZ(this.type);
    }

    public TypeToken() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) b.LJFF(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public TypeToken(Type type) {
        type.getClass();
        Type typeLIZ = b.LIZ(type);
        this.type = typeLIZ;
        this.rawType = (Class<? super T>) b.LJFF(typeLIZ);
        this.hashCode = typeLIZ.hashCode();
    }

    public static <T> TypeToken<T> com_google_gson_reflect_TypeToken__get$___twin___(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public static TypeToken com_google_gson_reflect_TypeToken_com_google_gson_reflect_TypeTokenLancet_get(Class cls) {
        if (a.LIZ()) {
            return com_google_gson_reflect_TypeToken__get$___twin___(cls);
        }
        ConcurrentHashMap<Object, TypeToken> concurrentHashMap = a.LIZ;
        TypeToken typeToken = concurrentHashMap.get(cls);
        if (typeToken == null) {
            TypeToken typeToken2 = new TypeToken(cls);
            concurrentHashMap.put(cls, typeToken2);
            return typeToken2;
        }
        return typeToken;
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(new b.a(type));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.LIZ(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && b.LIZJ(this.type, ((TypeToken) obj).type)) {
            return true;
        }
        return false;
    }

    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(b.LJFF(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            if (!this.rawType.isAssignableFrom(b.LJFF(type)) || !isAssignableFrom(type, (GenericArrayType) this.type)) {
                return false;
            }
            return true;
        }
        throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public static TypeToken<?> com_google_gson_reflect_TypeToken__get$___twin___(Type type) {
        return new TypeToken<>(type);
    }

    public static TypeToken com_google_gson_reflect_TypeToken_com_google_gson_reflect_TypeTokenLancet_get(Type type) {
        if (a.LIZ()) {
            return com_google_gson_reflect_TypeToken__get$___twin___(type);
        }
        ConcurrentHashMap<Object, TypeToken> concurrentHashMap = a.LIZ;
        TypeToken typeToken = concurrentHashMap.get(type);
        if (typeToken == null) {
            TypeToken typeToken2 = new TypeToken(type);
            concurrentHashMap.put(type, typeToken2);
            return typeToken2;
        }
        return typeToken;
    }

    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        return new TypeToken<>(new b.C0011b(null, type, typeArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    public static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        ParameterizedType parameterizedType2;
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsLJFF = b.LJFF(type);
        if ((type instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) type) != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(clsLJFF);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                TypeVariable typeVariable = typeVariableArrV2[i];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : clsLJFF.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(clsLJFF.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean matches(Type type, Type type2, Map<String, Type> map) {
        if (!type2.equals(type)) {
            if ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }
}
