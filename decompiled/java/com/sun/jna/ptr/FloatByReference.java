package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class FloatByReference extends ByReference {
    public FloatByReference() {
        this(0.0f);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return C786410Ut5.j4("float@0x%x=%s", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Float.valueOf(getValue())});
    }

    public float getValue() {
        return getPointer().getFloat(0L);
    }

    public FloatByReference(float f) {
        super(4);
        setValue(f);
    }

    public void setValue(float f) {
        getPointer().setFloat(0L, f);
    }
}
