package com.sun.jna;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes31.dex */
public abstract class PointerType implements NativeMapped {
    public Pointer pointer;

    public int hashCode() {
        Pointer pointer = this.pointer;
        if (pointer != null) {
            return pointer.hashCode();
        }
        return 0;
    }

    public String toString() {
        if (this.pointer == null) {
            return "NULL";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.pointer.toString());
        sbLIZ.append(" (");
        sbLIZ.append(super.toString());
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PointerType() {
        this.pointer = Pointer.NULL;
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return getPointer();
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return Pointer.class;
    }

    public PointerType(Pointer pointer) {
        this.pointer = pointer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PointerType)) {
            return false;
        }
        Pointer pointer = ((PointerType) obj).getPointer();
        Pointer pointer2 = this.pointer;
        if (pointer2 == null) {
            if (pointer == null) {
                return true;
            }
            return false;
        }
        return pointer2.equals(pointer);
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        if (obj == null) {
            return null;
        }
        PointerType pointerType = (PointerType) Klass.newInstance(getClass());
        pointerType.pointer = (Pointer) obj;
        return pointerType;
    }
}
