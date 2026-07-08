package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationParserExportHandle {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationParserExportHandle(j);
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
        EffectEditorJniJNI.UIAnnotationParserExportHandle_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectEditorJniJNI.UIAnnotationParserExportHandle_change_ownership(this, this.swigCPtr, true);
    }

    public UIAnnotationParserExportHandle() {
        this(EffectEditorJniJNI.new_UIAnnotationParserExportHandle(), true);
        EffectEditorJniJNI.UIAnnotationParserExportHandle_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationParserExportHandle uIAnnotationParserExportHandle) {
        if (uIAnnotationParserExportHandle == null) {
            return 0L;
        }
        return uIAnnotationParserExportHandle.swigCPtr;
    }

    public METEffectExportErrorCode effectExportSticker(String str) {
        return METEffectExportErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationParserExportHandle_effectExportSticker(this.swigCPtr, this, str));
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationParserExportHandle(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
