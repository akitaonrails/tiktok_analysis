package com.sun.jna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class DefaultTypeMapper implements TypeMapper {
    public List<Entry> toNativeConverters = new ArrayList();
    public List<Entry> fromNativeConverters = new ArrayList();

    private Class<?> getAltClass(Class<?> cls) {
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        return null;
    }

    @Override // com.sun.jna.TypeMapper
    public FromNativeConverter getFromNativeConverter(Class<?> cls) {
        return (FromNativeConverter) lookupConverter(cls, this.fromNativeConverters);
    }

    @Override // com.sun.jna.TypeMapper
    public ToNativeConverter getToNativeConverter(Class<?> cls) {
        return (ToNativeConverter) lookupConverter(cls, this.toNativeConverters);
    }

    public static class Entry {
        public Object converter;
        public Class<?> type;

        public Entry(Class<?> cls, Object obj) {
            this.type = cls;
            this.converter = obj;
        }
    }

    private Object lookupConverter(Class<?> cls, Collection<? extends Entry> collection) {
        for (Entry entry : collection) {
            if (entry.type.isAssignableFrom(cls)) {
                return entry.converter;
            }
        }
        return null;
    }

    public void addFromNativeConverter(Class<?> cls, FromNativeConverter fromNativeConverter) {
        this.fromNativeConverters.add(new Entry(cls, fromNativeConverter));
        Class<?> altClass = getAltClass(cls);
        if (altClass != null) {
            this.fromNativeConverters.add(new Entry(altClass, fromNativeConverter));
        }
    }

    public void addToNativeConverter(Class<?> cls, ToNativeConverter toNativeConverter) {
        this.toNativeConverters.add(new Entry(cls, toNativeConverter));
        Class<?> altClass = getAltClass(cls);
        if (altClass != null) {
            this.toNativeConverters.add(new Entry(altClass, toNativeConverter));
        }
    }

    public void addTypeConverter(Class<?> cls, TypeConverter typeConverter) {
        addFromNativeConverter(cls, typeConverter);
        addToNativeConverter(cls, typeConverter);
    }
}
