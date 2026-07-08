package com.sun.jna.ptr;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class PointerByReference extends ByReference {
    public PointerByReference() {
        this(null);
    }

    public Pointer getValue() {
        return getPointer().getPointer(0L);
    }

    public PointerByReference(Pointer pointer) {
        super(Native.POINTER_SIZE);
        setValue(pointer);
    }

    public void setValue(Pointer pointer) {
        getPointer().setPointer(0L, pointer);
    }
}
