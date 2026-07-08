package com.sun.jna.ptr;

import X.C786410Ut5;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes31.dex */
public class NativeLongByReference extends ByReference {
    public NativeLongByReference() {
        this(new NativeLong(0L));
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return NativeLong.SIZE > 4 ? C786410Ut5.j4("NativeLong@0x1$%x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Long.valueOf(getValue().longValue())}) : C786410Ut5.j4("NativeLong@0x1$%x=0x%2$x (%2$d)", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer())), Integer.valueOf(getValue().intValue())});
    }

    public NativeLong getValue() {
        return getPointer().getNativeLong(0L);
    }

    public NativeLongByReference(NativeLong nativeLong) {
        super(NativeLong.SIZE);
        setValue(nativeLong);
    }

    public void setValue(NativeLong nativeLong) {
        getPointer().setNativeLong(0L, nativeLong);
    }
}
