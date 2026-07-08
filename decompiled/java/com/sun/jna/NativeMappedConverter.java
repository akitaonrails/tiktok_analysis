package com.sun.jna;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class NativeMappedConverter implements TypeConverter {
    public static final Map<Class<?>, Reference<NativeMappedConverter>> converters = new WeakHashMap();
    public final NativeMapped instance;
    public final Class<?> nativeType;
    public final Class<?> type;

    public NativeMapped defaultValue() {
        return this.type.isEnum() ? (NativeMapped) this.type.getEnumConstants()[0] : (NativeMapped) Klass.newInstance(this.type);
    }

    @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
    public Class<?> nativeType() {
        return this.nativeType;
    }

    public NativeMappedConverter(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            this.type = cls;
            NativeMapped nativeMappedDefaultValue = defaultValue();
            this.instance = nativeMappedDefaultValue;
            this.nativeType = nativeMappedDefaultValue.nativeType();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Type must derive from ");
        sbLIZ.append(NativeMapped.class);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NativeMappedConverter getInstance(Class<?> cls) {
        NativeMappedConverter nativeMappedConverter;
        Map<Class<?>, Reference<NativeMappedConverter>> map = converters;
        synchronized (map) {
            try {
                Reference<NativeMappedConverter> reference = map.get(cls);
                if (reference == null || (nativeMappedConverter = reference.get()) == null) {
                    nativeMappedConverter = new NativeMappedConverter(cls);
                    map.put(cls, new SoftReference(nativeMappedConverter));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return nativeMappedConverter;
    }

    @Override // com.sun.jna.FromNativeConverter
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        return this.instance.fromNative(obj, fromNativeContext);
    }

    @Override // com.sun.jna.ToNativeConverter
    public Object toNative(Object obj, ToNativeContext toNativeContext) {
        if (obj == null) {
            if (Pointer.class.isAssignableFrom(this.nativeType)) {
                return null;
            }
            obj = defaultValue();
        }
        return ((NativeMapped) obj).toNative();
    }
}
