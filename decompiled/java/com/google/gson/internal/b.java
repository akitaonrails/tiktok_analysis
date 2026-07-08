package com.google.gson.internal;

import X.C2188811AlT;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final Type[] LIZ = new Type[0];

    public static final class a implements GenericArrayType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LL;

        public final int hashCode() {
            return this.LL.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(b.LJIIIZ(this.LL));
            sbLIZ.append("[]");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.LL;
        }

        public a(Type type) {
            this.LL = b.LIZ(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && b.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    public static final class C0011b implements ParameterizedType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LL;
        public final Type LLILLJJLI;
        public final Type[] LLILLL;

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.LLILLL.clone();
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.LLILLL) ^ this.LLILLJJLI.hashCode();
            Type type = this.LL;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            int length = this.LLILLL.length;
            if (length == 0) {
                return b.LJIIIZ(this.LLILLJJLI);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.LJIIIZ(this.LLILLJJLI));
            sb.append("<");
            sb.append(b.LJIIIZ(this.LLILLL[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(b.LJIIIZ(this.LLILLL[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.LL;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.LLILLJJLI;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && b.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }

        public C0011b(Type type, Type type2, Type... typeArr) {
            Type typeLIZ;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                com.google.gson.internal.a.LIZ(z2);
            }
            if (type == null) {
                typeLIZ = null;
            } else {
                typeLIZ = b.LIZ(type);
            }
            this.LL = typeLIZ;
            this.LLILLJJLI = b.LIZ(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.LLILLL = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Type type3 = this.LLILLL[i];
                type3.getClass();
                b.LIZIZ(type3);
                Type[] typeArr3 = this.LLILLL;
                typeArr3[i] = b.LIZ(typeArr3[i]);
            }
        }
    }

    public static final class c implements WildcardType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LL;
        public final Type LLILLJJLI;

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.LL};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.LLILLJJLI;
            return type != null ? new Type[]{type} : b.LIZ;
        }

        public final int hashCode() {
            Type type = this.LLILLJJLI;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.LL.hashCode() + 31);
        }

        public final String toString() {
            if (this.LLILLJJLI != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("? super ");
                sbLIZ.append(b.LJIIIZ(this.LLILLJJLI));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (this.LL == Object.class) {
                return "?";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("? extends ");
            sbLIZ2.append(b.LJIIIZ(this.LL));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && b.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            com.google.gson.internal.a.LIZ(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.google.gson.internal.a.LIZ(z2);
            if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                b.LIZIZ(type);
                com.google.gson.internal.a.LIZ(typeArr[0] == Object.class);
                this.LLILLJJLI = b.LIZ(typeArr2[0]);
                this.LL = Object.class;
                return;
            }
            Type type2 = typeArr[0];
            type2.getClass();
            b.LIZIZ(type2);
            this.LLILLJJLI = null;
            this.LL = b.LIZ(typeArr[0]);
        }
    }

    public static Type LIZ(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new a(LIZ(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0011b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void LIZIZ(Type type) {
        boolean z;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z = false;
        } else {
            z = true;
        }
        com.google.gson.internal.a.LIZ(z);
    }

    public static Class<?> LJFF(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.a.LIZ(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(LJFF(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return LJFF(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sbLIZ.append(type);
        sbLIZ.append("> is of type ");
        sbLIZ.append(name);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJIIIZ(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static boolean LIZJ(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return LIZJ(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type LIZLLL(Type type, Class<?> cls) {
        Type typeLJI = LJI(type, cls, Collection.class);
        if (typeLJI instanceof WildcardType) {
            typeLJI = ((WildcardType) typeLJI).getUpperBounds()[0];
        }
        if (typeLJI instanceof ParameterizedType) {
            return ((ParameterizedType) typeLJI).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type LJ(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return LJ(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return LJ(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type LJI(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.a.LIZ(cls2.isAssignableFrom(cls));
        return LJII(type, cls, LJ(type, cls, cls2));
    }

    public static Type LJII(Type type, Class<?> cls, Type type2) {
        return LJIIIIZZ(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type LJIIIIZZ(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type r9, java.util.Collection<java.lang.reflect.TypeVariable> r10) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.b.LJIIIIZZ(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
