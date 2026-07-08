package com.google.gson.internal;

import X.AbstractC1971607nu;
import X.C2277581ECu;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public final Map<Type, com.google.gson.g<?>> LIZ;
    public final AbstractC1971607nu LIZIZ = AbstractC1971607nu.LIZ;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public final class a<T> implements t<T> {
        public final /* synthetic */ com.google.gson.g LIZ;

        @Override // com.google.gson.internal.t
        public final T LIZ() {
            return (T) this.LIZ.LIZ();
        }

        public a(com.google.gson.g gVar, Type type) {
            this.LIZ = gVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public final class b<T> implements t<T> {
        public final /* synthetic */ com.google.gson.g LIZ;

        @Override // com.google.gson.internal.t
        public final T LIZ() {
            return (T) this.LIZ.LIZ();
        }

        public b(com.google.gson.g gVar, Type type) {
            this.LIZ = gVar;
        }
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public h(Map<Type, com.google.gson.g<?>> map) {
        this.LIZ = map;
    }

    public final <T> t<T> LIZ(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        com.google.gson.g<?> gVar = this.LIZ.get(type);
        if (gVar != null) {
            return new a(gVar, type);
        }
        com.google.gson.g<?> gVar2 = this.LIZ.get(rawType);
        if (gVar2 != null) {
            return new b(gVar2, type);
        }
        if (!((Boolean) C2277581ECu.LJFF.getValue()).booleanValue() || !Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                if (!declaredConstructor.isAccessible()) {
                    this.LIZIZ.LIZ(declaredConstructor);
                }
                return new i(declaredConstructor);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                return new j();
            }
            if (EnumSet.class.isAssignableFrom(rawType)) {
                return new k(type);
            }
            if (Set.class.isAssignableFrom(rawType)) {
                return new l();
            }
            if (Queue.class.isAssignableFrom(rawType)) {
                return new m();
            }
            return new n();
        }
        if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                return new o();
            }
            if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                return new c();
            }
            if (SortedMap.class.isAssignableFrom(rawType)) {
                return new d();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new e();
            }
            return new f();
        }
        return new g(rawType, type);
    }
}
