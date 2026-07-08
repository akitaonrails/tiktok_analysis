package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final Field LIZ;

    public final String LIZIZ() {
        return this.LIZ.getName();
    }

    public b(Field field) {
        field.getClass();
        this.LIZ = field;
    }

    public final <T extends Annotation> T LIZ(Class<T> cls) {
        return (T) this.LIZ.getAnnotation(cls);
    }
}
