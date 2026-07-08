package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class ByteByReference extends ByReference {
    public ByteByReference() {
        this((byte) 0);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("byte@0x%1$x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Byte.valueOf(getValue())});
    }

    public byte getValue() {
        return getPointer().getByte(0L);
    }

    public ByteByReference(byte b) {
        super(1);
        setValue(b);
    }

    public void setValue(byte b) {
        getPointer().setByte(0L, b);
    }
}
