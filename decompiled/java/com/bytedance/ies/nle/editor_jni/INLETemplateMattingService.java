package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLETemplateMattingService {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_INLETemplateMattingService(j);
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
        NLETemplateJNI.INLETemplateMattingService_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLETemplateJNI.INLETemplateMattingService_change_ownership(this, this.swigCPtr, true);
    }

    public boolean cancel() {
        return NLETemplateJNI.INLETemplateMattingService_cancel(this.swigCPtr, this);
    }

    public void clear() {
        NLETemplateJNI.INLETemplateMattingService_clear(this.swigCPtr, this);
    }

    public void removeListener() {
        NLETemplateJNI.INLETemplateMattingService_removeListener(this.swigCPtr, this);
    }

    public boolean start() {
        return NLETemplateJNI.INLETemplateMattingService_start(this.swigCPtr, this);
    }

    public INLETemplateMattingService() {
        this(NLETemplateJNI.new_INLETemplateMattingService(), true);
        NLETemplateJNI.INLETemplateMattingService_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLETemplateMattingService iNLETemplateMattingService) {
        if (iNLETemplateMattingService == null) {
            return 0L;
        }
        return iNLETemplateMattingService.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLETemplateMattingService(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
