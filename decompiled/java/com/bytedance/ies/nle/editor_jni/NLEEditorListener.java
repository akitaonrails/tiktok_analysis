package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEEditorListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEEditorListener(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEEditorJniJNI.NLEEditorListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEEditorJniJNI.NLEEditorListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onChanged() {
        NLEEditorJniJNI.NLEEditorListener_onChanged(this.swigCPtr, this);
    }

    public NLEEditorListener() {
        this(NLEEditorJniJNI.new_NLEEditorListener(), true);
        NLEEditorJniJNI.NLEEditorListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEditorListener nLEEditorListener) {
        if (nLEEditorListener == null) {
            return 0L;
        }
        return nLEEditorListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEEditorListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
