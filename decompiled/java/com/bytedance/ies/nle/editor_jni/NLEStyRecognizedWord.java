package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyRecognizedWord extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyRecognizedWord(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyRecognizedWord_clone = NLEEditorJniJNI.NLEStyRecognizedWord_clone(this.swigCPtr, this);
        if (jNLEStyRecognizedWord_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyRecognizedWord_clone, true);
    }

    public VecInt getEndTime() {
        return new VecInt(NLEEditorJniJNI.NLEStyRecognizedWord_getEndTime(this.swigCPtr, this), true);
    }

    public VecInt getIsKey() {
        return new VecInt(NLEEditorJniJNI.NLEStyRecognizedWord_getIsKey(this.swigCPtr, this), true);
    }

    public VecInt getStartTime() {
        return new VecInt(NLEEditorJniJNI.NLEStyRecognizedWord_getStartTime(this.swigCPtr, this), true);
    }

    public VecString getText() {
        return new VecString(NLEEditorJniJNI.NLEStyRecognizedWord_getText(this.swigCPtr, this), true);
    }

    public boolean hasEndTime() {
        return NLEEditorJniJNI.NLEStyRecognizedWord_hasEndTime(this.swigCPtr, this);
    }

    public boolean hasIsKey() {
        return NLEEditorJniJNI.NLEStyRecognizedWord_hasIsKey(this.swigCPtr, this);
    }

    public boolean hasStartTime() {
        return NLEEditorJniJNI.NLEStyRecognizedWord_hasStartTime(this.swigCPtr, this);
    }

    public boolean hasText() {
        return NLEEditorJniJNI.NLEStyRecognizedWord_hasText(this.swigCPtr, this);
    }

    public NLEStyRecognizedWord() {
        this(NLEEditorJniJNI.new_NLEStyRecognizedWord(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEStyRecognizedWord dynamicCast(NLENode nLENode) {
        long jNLEStyRecognizedWord_dynamicCast = NLEEditorJniJNI.NLEStyRecognizedWord_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyRecognizedWord_dynamicCast == 0) {
            return null;
        }
        return new NLEStyRecognizedWord(jNLEStyRecognizedWord_dynamicCast, true);
    }

    public static long getCPtr(NLEStyRecognizedWord nLEStyRecognizedWord) {
        if (nLEStyRecognizedWord == null) {
            return 0L;
        }
        return nLEStyRecognizedWord.swigCPtr;
    }

    public void setEndTime(VecInt vecInt) {
        NLEEditorJniJNI.NLEStyRecognizedWord_setEndTime(this.swigCPtr, this, VecInt.getCPtr(vecInt), vecInt);
    }

    public void setIsKey(VecInt vecInt) {
        NLEEditorJniJNI.NLEStyRecognizedWord_setIsKey(this.swigCPtr, this, VecInt.getCPtr(vecInt), vecInt);
    }

    public void setStartTime(VecInt vecInt) {
        NLEEditorJniJNI.NLEStyRecognizedWord_setStartTime(this.swigCPtr, this, VecInt.getCPtr(vecInt), vecInt);
    }

    public void setText(VecString vecString) {
        NLEEditorJniJNI.NLEStyRecognizedWord_setText(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyRecognizedWord(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyRecognizedWord_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
