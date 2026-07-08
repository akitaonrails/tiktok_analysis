package com.sun.jna;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes31.dex */
public class StructureWriteContext extends ToNativeContext {
    public Field field;
    public Structure struct;

    public Field getField() {
        return this.field;
    }

    public Structure getStructure() {
        return this.struct;
    }

    public StructureWriteContext(Structure structure, Field field) {
        this.struct = structure;
        this.field = field;
    }
}
