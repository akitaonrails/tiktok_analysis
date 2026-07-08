package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEBranchListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEBranchListener(j);
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
        NLEEditorJniJNI.NLEBranchListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEEditorJniJNI.NLEBranchListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onChanged() {
        NLEEditorJniJNI.NLEBranchListener_onChanged(this.swigCPtr, this);
    }

    public NLEBranchListener() {
        this(NLEEditorJniJNI.new_NLEBranchListener(), true);
        NLEEditorJniJNI.NLEBranchListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBranchListener nLEBranchListener) {
        if (nLEBranchListener == null) {
            return 0L;
        }
        return nLEBranchListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBranchListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
