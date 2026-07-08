package com.sun.jna;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes31.dex */
public class StructureReadContext extends FromNativeContext {
    public Field field;
    public Structure structure;

    public Field getField() {
        return this.field;
    }

    public Structure getStructure() {
        return this.structure;
    }

    public StructureReadContext(Structure structure, Field field) {
        super(field.getType());
        this.structure = structure;
        this.field = field;
    }
}
