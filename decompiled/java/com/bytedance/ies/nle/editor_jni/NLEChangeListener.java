package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEChangeListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEChangeListener(j);
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
        NLEEditorJniJNI.NLEChangeListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEEditorJniJNI.NLEChangeListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onChanged() {
        NLEEditorJniJNI.NLEChangeListener_onChanged(this.swigCPtr, this);
    }

    public NLEChangeListener() {
        this(NLEEditorJniJNI.new_NLEChangeListener(), true);
        NLEEditorJniJNI.NLEChangeListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEChangeListener nLEChangeListener) {
        if (nLEChangeListener == null) {
            return 0L;
        }
        return nLEChangeListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEChangeListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
