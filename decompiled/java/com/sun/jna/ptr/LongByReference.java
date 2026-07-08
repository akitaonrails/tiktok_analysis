package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class LongByReference extends ByReference {
    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("long@0x%1$x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Long.valueOf(getValue())});
    }

    public LongByReference() {
        this(0L);
    }

    public long getValue() {
        return getPointer().getLong(0L);
    }

    public LongByReference(long j) {
        super(8);
        setValue(j);
    }

    public void setValue(long j) {
        getPointer().setLong(0L, j);
    }
}
