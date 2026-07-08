package com.bytedance.ies.nle.editor_jni;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class NLEEditor {
    public final List<NLEEditorListener> listeners;
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEEditor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean canRedo() {
        return NLEEditorJniJNI.NLEEditor_canRedo(this.swigCPtr, this);
    }

    public boolean canUndo() {
        return NLEEditorJniJNI.NLEEditor_canUndo(this.swigCPtr, this);
    }

    public boolean commit() {
        return NLEEditorJniJNI.NLEEditor_commit(this.swigCPtr, this);
    }

    public boolean done() {
        return NLEEditorJniJNI.NLEEditor_done__SWIG_1(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtr getAllResources() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLEEditor_getAllResources(this.swigCPtr, this), true);
    }

    public NLEBranch getBranch() {
        long jNLEEditor_getBranch = NLEEditorJniJNI.NLEEditor_getBranch(this.swigCPtr, this);
        if (jNLEEditor_getBranch == 0) {
            return null;
        }
        return new NLEBranch(jNLEEditor_getBranch, true);
    }

    public NLEBranchListener getBranchListener() {
        long jNLEEditor_getBranchListener = NLEEditorJniJNI.NLEEditor_getBranchListener(this.swigCPtr, this);
        if (jNLEEditor_getBranchListener == 0) {
            return null;
        }
        return new NLEBranchListener(jNLEEditor_getBranchListener, true);
    }

    public VecNLEEditorListener getConsumer() {
        return new VecNLEEditorListener(NLEEditorJniJNI.NLEEditor_getConsumer(this.swigCPtr, this), true);
    }

    public NLEEditorListener getListener() {
        long jNLEEditor_getListener = NLEEditorJniJNI.NLEEditor_getListener(this.swigCPtr, this);
        if (jNLEEditor_getListener == 0) {
            return null;
        }
        return new NLEEditorListener(jNLEEditor_getListener, true);
    }

    public NLEModel getModel() {
        long jNLEEditor_getModel = NLEEditorJniJNI.NLEEditor_getModel(this.swigCPtr, this);
        if (jNLEEditor_getModel == 0) {
            return null;
        }
        return new NLEModel(jNLEEditor_getModel, true);
    }

    public NLEModel getStageModel() {
        long jNLEEditor_getStageModel = NLEEditorJniJNI.NLEEditor_getStageModel(this.swigCPtr, this);
        if (jNLEEditor_getStageModel == 0) {
            return null;
        }
        return new NLEModel(jNLEEditor_getStageModel, true);
    }

    public boolean redo() {
        return NLEEditorJniJNI.NLEEditor_redo__SWIG_1(this.swigCPtr, this);
    }

    public boolean resetHead() {
        return NLEEditorJniJNI.NLEEditor_resetHead(this.swigCPtr, this);
    }

    public String store() {
        return NLEEditorJniJNI.NLEEditor_store(this.swigCPtr, this);
    }

    public String storeWithoutLock() {
        return NLEEditorJniJNI.NLEEditor_storeWithoutLock(this.swigCPtr, this);
    }

    public boolean undo() {
        return NLEEditorJniJNI.NLEEditor_undo__SWIG_1(this.swigCPtr, this);
    }

    public NLEEditor() {
        this(NLEEditorJniJNI.new_NLEEditor(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEditor nLEEditor) {
        if (nLEEditor == null) {
            return 0L;
        }
        return nLEEditor.swigCPtr;
    }

    public void addConsumer(NLEEditorListener nLEEditorListener) {
        this.listeners.add(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_addConsumer(this.swigCPtr, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public boolean done(String str) {
        return NLEEditorJniJNI.NLEEditor_done__SWIG_0(this.swigCPtr, this, str);
    }

    public NLEError exportEditor(String str) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEEditor_exportEditor(this.swigCPtr, this, str));
    }

    public String getGlobalExtra(String str) {
        return NLEEditorJniJNI.NLEEditor_getGlobalExtra(this.swigCPtr, this, str);
    }

    public boolean goTo(String str) {
        return NLEEditorJniJNI.NLEEditor_goTo(this.swigCPtr, this, str);
    }

    public NLEError importEditor(String str) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEEditor_importEditor(this.swigCPtr, this, str));
    }

    public boolean redo(int i) {
        return NLEEditorJniJNI.NLEEditor_redo__SWIG_0(this.swigCPtr, this, i);
    }

    public void removeConsumer(NLEEditorListener nLEEditorListener) {
        this.listeners.remove(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_removeConsumer(this.swigCPtr, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public NLEError restore(String str) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEEditor_restore(this.swigCPtr, this, str));
    }

    public void setBranchListener(NLEBranchListener nLEBranchListener) {
        NLEEditorJniJNI.NLEEditor_setBranchListener(this.swigCPtr, this, NLEBranchListener.getCPtr(nLEBranchListener), nLEBranchListener);
    }

    public void setListener(NLEEditorListener nLEEditorListener) {
        this.listeners.add(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_setListener(this.swigCPtr, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public void setMeasureOption(boolean z) {
        NLEEditorJniJNI.NLEEditor_setMeasureOption(this.swigCPtr, this, z);
    }

    public void setModel(NLEModel nLEModel) {
        NLEEditorJniJNI.NLEEditor_setModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public boolean undo(int i) {
        return NLEEditorJniJNI.NLEEditor_undo__SWIG_0(this.swigCPtr, this, i);
    }

    public void updateRenderLayers(NLEModel nLEModel) {
        NLEEditorJniJNI.NLEEditor_updateRenderLayers(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public NLEEditor(long j, boolean z) {
        this.listeners = new ArrayList();
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setGlobalExtra(String str, String str2) {
        NLEEditorJniJNI.NLEEditor_setGlobalExtra(this.swigCPtr, this, str, str2);
    }

    public void trim(long j, long j2) {
        NLEEditorJniJNI.NLEEditor_trim(this.swigCPtr, this, j, j2);
    }

    public boolean trimRange(String str, String str2) {
        return NLEEditorJniJNI.NLEEditor_trimRange__SWIG_0(this.swigCPtr, this, str, str2);
    }

    public boolean trimRange(String str, String str2, boolean z) {
        return NLEEditorJniJNI.NLEEditor_trimRange__SWIG_1(this.swigCPtr, this, str, str2, z);
    }
}
