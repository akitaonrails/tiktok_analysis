package com.ss.android.vesdk;

import com.ss.android.ttve.nativePort.TEImageUndoRedoInterface;
import com.ss.android.vesdk.bean.VEUndoRedoBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes36.dex */
public class VEImageUndoRedoInvoker {
    public TEImageUndoRedoInterface mNativeUndoRedoHandler;

    public void enableUndoRedo() {
        this.mNativeUndoRedoHandler.enableUndoRedo();
    }

    public void executeConfirmParams() {
        this.mNativeUndoRedoHandler.executeConfirmParams();
    }

    public VEImageUndoRedoInvoker(VEImage vEImage) {
        throw null;
    }

    public ArrayList<VEUndoRedoBean> getUndoRedoList(Boolean bool) {
        return this.mNativeUndoRedoHandler.getUndoRedoList(bool.booleanValue(), -1);
    }

    public int getUndoRedoListSize(Boolean bool) {
        return this.mNativeUndoRedoHandler.getUndoRedoListSize(bool.booleanValue());
    }

    public String cacheCurrentFrame(String str, Boolean bool) {
        return this.mNativeUndoRedoHandler.cacheCurrentFrame(str, bool);
    }

    public ArrayList<VEUndoRedoBean> getUndoRedoList(Boolean bool, int i) {
        return this.mNativeUndoRedoHandler.getUndoRedoList(bool.booleanValue(), i);
    }

    public void executeRedoUndo(Boolean bool, int i, Boolean bool2) {
        this.mNativeUndoRedoHandler.executeRedoUndo(bool.booleanValue(), i, bool2.booleanValue());
    }
}
