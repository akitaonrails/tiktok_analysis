package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationParser {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationParser(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getHasAnnotationChanged() {
        return EffectEditorJniJNI.UIAnnotationParser_getHasAnnotationChanged(this.swigCPtr, this);
    }

    public boolean getStickerPathChanged() {
        return EffectEditorJniJNI.UIAnnotationParser_getStickerPathChanged(this.swigCPtr, this);
    }

    public EEStdStringVector getTags() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationParser_getTags(this.swigCPtr, this), false);
    }

    public UIAnnotationCategoryPtrVector getUIAnnotationCategoryVector() {
        return new UIAnnotationCategoryPtrVector(EffectEditorJniJNI.UIAnnotationParser_getUIAnnotationCategoryVector(this.swigCPtr, this), false);
    }

    public void markHasAnnotationChanged() {
        EffectEditorJniJNI.UIAnnotationParser_markHasAnnotationChanged(this.swigCPtr, this);
    }

    public void markNoAnnotationChanged() {
        EffectEditorJniJNI.UIAnnotationParser_markNoAnnotationChanged(this.swigCPtr, this);
    }

    public void markStickerChanged() {
        EffectEditorJniJNI.UIAnnotationParser_markStickerChanged(this.swigCPtr, this);
    }

    public UIAnnotationParser() {
        this(EffectEditorJniJNI.new_UIAnnotationParser(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationParser uIAnnotationParser) {
        if (uIAnnotationParser == null) {
            return 0L;
        }
        return uIAnnotationParser.swigCPtr;
    }

    public void addTag(String str) {
        EffectEditorJniJNI.UIAnnotationParser_addTag(this.swigCPtr, this, str);
    }

    public UIAnnotationBasePtrVector getUIAnnotationVector(UIAnnotationError uIAnnotationError) {
        return new UIAnnotationBasePtrVector(EffectEditorJniJNI.UIAnnotationParser_getUIAnnotationVector(this.swigCPtr, this, UIAnnotationError.getCPtr(uIAnnotationError), uIAnnotationError), true);
    }

    public boolean hasTag(String str) {
        return EffectEditorJniJNI.UIAnnotationParser_hasTag(this.swigCPtr, this, str);
    }

    public void removeTag(String str) {
        EffectEditorJniJNI.UIAnnotationParser_removeTag(this.swigCPtr, this, str);
    }

    public void setLocalePath(String str) {
        EffectEditorJniJNI.UIAnnotationParser_setLocalePath(this.swigCPtr, this, str);
    }

    public void setStickerPath(String str) {
        EffectEditorJniJNI.UIAnnotationParser_setStickerPath(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationParser(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public UIAnnotationErrorCode saveSticker(String str, UIAnnotationParserExportHandle uIAnnotationParserExportHandle) {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationParser_saveSticker(this.swigCPtr, this, str, UIAnnotationParserExportHandle.getCPtr(uIAnnotationParserExportHandle), uIAnnotationParserExportHandle));
    }
}
