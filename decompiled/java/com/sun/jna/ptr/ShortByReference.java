package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class ShortByReference extends ByReference {
    public ShortByReference() {
        this((short) 0);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("short@0x%1$x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Short.valueOf(getValue())});
    }

    public short getValue() {
        return getPointer().getShort(0L);
    }

    public ShortByReference(short s) {
        super(2);
        setValue(s);
    }

    public void setValue(short s) {
        getPointer().setShort(0L, s);
    }
}
