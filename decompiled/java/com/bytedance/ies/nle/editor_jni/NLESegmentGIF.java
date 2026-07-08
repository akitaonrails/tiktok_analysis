package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentGIF extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentGIF(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentGIF_clone = NLEEditorJniJNI.NLESegmentGIF_clone(this.swigCPtr, this);
        if (jNLESegmentGIF_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentGIF_clone, true);
    }

    public NLEResourceGIF getGifResource() {
        long jNLESegmentGIF_getGifResource = NLEEditorJniJNI.NLESegmentGIF_getGifResource(this.swigCPtr, this);
        if (jNLESegmentGIF_getGifResource == 0) {
            return null;
        }
        return new NLEResourceGIF(jNLESegmentGIF_getGifResource, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentGIF_getResource = NLEEditorJniJNI.NLESegmentGIF_getResource(this.swigCPtr, this);
        if (jNLESegmentGIF_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentGIF_getResource, true);
    }

    public NLESegmentGIF() {
        this(NLEEditorJniJNI.new_NLESegmentGIF(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentGIF dynamicCast(NLENode nLENode) {
        long jNLESegmentGIF_dynamicCast = NLEEditorJniJNI.NLESegmentGIF_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentGIF_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentGIF(jNLESegmentGIF_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentGIF nLESegmentGIF) {
        if (nLESegmentGIF == null) {
            return 0L;
        }
        return nLESegmentGIF.swigCPtr;
    }

    public void setGifResource(NLEResourceGIF nLEResourceGIF) {
        NLEEditorJniJNI.NLESegmentGIF_setGifResource(this.swigCPtr, this, NLEResourceGIF.getCPtr(nLEResourceGIF), nLEResourceGIF);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentGIF(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentGIF_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
