package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class INLEMonitor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_INLEMonitor(j);
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
        NLEEditorJniJNI.INLEMonitor_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEEditorJniJNI.INLEMonitor_change_ownership(this, this.swigCPtr, true);
    }

    public INLEMonitor() {
        this(NLEEditorJniJNI.new_INLEMonitor(), true);
        NLEEditorJniJNI.INLEMonitor_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEMonitor iNLEMonitor) {
        if (iNLEMonitor == null) {
            return 0L;
        }
        return iNLEMonitor.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEMonitor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onEvent(String str, int i, String str2, long j) {
        if (getClass() == INLEMonitor.class) {
            NLEEditorJniJNI.INLEMonitor_onEvent(this.swigCPtr, this, str, i, str2, j);
        } else {
            NLEEditorJniJNI.INLEMonitor_onEventSwigExplicitINLEMonitor(this.swigCPtr, this, str, i, str2, j);
        }
    }
}
