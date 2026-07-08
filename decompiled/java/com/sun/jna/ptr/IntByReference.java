package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class IntByReference extends ByReference {
    public IntByReference() {
        this(0);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("int@0x%1$x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Integer.valueOf(getValue())});
    }

    public int getValue() {
        return getPointer().getInt(0L);
    }

    public IntByReference(int i) {
        super(4);
        setValue(i);
    }

    public void setValue(int i) {
        getPointer().setInt(0L, i);
    }
}
