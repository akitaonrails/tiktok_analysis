package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETemplateEditor extends NLEEditor {
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLETemplateEditor(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public NLETemplateEditor() {
        this(NLETemplateJNI.new_NLETemplateEditor(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLETemplateEditor nLETemplateEditor) {
        if (nLETemplateEditor == null) {
            return 0L;
        }
        return nLETemplateEditor.swigCPtr;
    }

    public NLETemplateEditor(long j, boolean z) {
        super(NLETemplateJNI.NLETemplateEditor_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
