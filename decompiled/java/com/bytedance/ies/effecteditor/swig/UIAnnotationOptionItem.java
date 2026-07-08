package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationOptionItem {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationOptionItem(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getIconPath() {
        return EffectEditorJniJNI.UIAnnotationOptionItem_iconPath_get(this.swigCPtr, this);
    }

    public String getItemKey() {
        return EffectEditorJniJNI.UIAnnotationOptionItem_itemKey_get(this.swigCPtr, this);
    }

    public String getItemName() {
        return EffectEditorJniJNI.UIAnnotationOptionItem_itemName_get(this.swigCPtr, this);
    }

    public UIAnnotationOptionItem() {
        this(EffectEditorJniJNI.new_UIAnnotationOptionItem(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationOptionItem uIAnnotationOptionItem) {
        if (uIAnnotationOptionItem == null) {
            return 0L;
        }
        return uIAnnotationOptionItem.swigCPtr;
    }

    public void setIconPath(String str) {
        EffectEditorJniJNI.UIAnnotationOptionItem_iconPath_set(this.swigCPtr, this, str);
    }

    public void setItemKey(String str) {
        EffectEditorJniJNI.UIAnnotationOptionItem_itemKey_set(this.swigCPtr, this, str);
    }

    public void setItemName(String str) {
        EffectEditorJniJNI.UIAnnotationOptionItem_itemName_set(this.swigCPtr, this, str);
    }

    public UIAnnotationOptionItem(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
