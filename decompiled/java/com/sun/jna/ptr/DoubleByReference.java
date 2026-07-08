package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class DoubleByReference extends ByReference {
    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("double@0x%x=%s", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Double.valueOf(getValue())});
    }

    public DoubleByReference() {
        this(0.0d);
    }

    public double getValue() {
        return getPointer().getDouble(0L);
    }

    public DoubleByReference(double d) {
        super(8);
        setValue(d);
    }

    public void setValue(double d) {
        getPointer().setDouble(0L, d);
    }
}
