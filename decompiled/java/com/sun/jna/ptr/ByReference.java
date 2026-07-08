package com.sun.jna.ptr;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/* JADX INFO: loaded from: classes31.dex */
public abstract class ByReference extends PointerType {
    @Override // com.sun.jna.PointerType
    public String toString() {
        try {
            Object objInvoke = getClass().getMethod("getValue", new Class[0]).invoke(this, new Object[0]);
            return objInvoke == null ? C786410Ut5.j4("null@0x%x", new Object[]{Long.valueOf(Pointer.nativeValue(getPointer()))}) : C786410Ut5.j4("%s@0x%x=%s", new Object[]{objInvoke.getClass().getSimpleName(), Long.valueOf(Pointer.nativeValue(getPointer())), objInvoke});
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C786410Ut5.j4("ByReference Contract violated - %s#getValue raised exception: %s", new Object[]{getClass().getName(), e.getMessage()});
        }
    }

    public ByReference(int i) {
        setPointer(new Memory(i));
    }
}
