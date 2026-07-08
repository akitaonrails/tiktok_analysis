package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentComposite extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentComposite(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentComposite_clone = NLEEditorJniJNI.NLESegmentComposite_clone(this.swigCPtr, this);
        if (jNLESegmentComposite_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentComposite_clone, true);
    }

    public float getAlpha() {
        return NLEEditorJniJNI.NLESegmentComposite_getAlpha(this.swigCPtr, this);
    }

    public NLEResourceComposite getCompositeResource() {
        long jNLESegmentComposite_getCompositeResource = NLEEditorJniJNI.NLESegmentComposite_getCompositeResource(this.swigCPtr, this);
        if (jNLESegmentComposite_getCompositeResource == 0) {
            return null;
        }
        return new NLEResourceComposite(jNLESegmentComposite_getCompositeResource, true);
    }

    public long getTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentComposite_getTimeClipEnd(this.swigCPtr, this);
    }

    public long getTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentComposite_getTimeClipStart(this.swigCPtr, this);
    }

    public boolean hasAlpha() {
        return NLEEditorJniJNI.NLESegmentComposite_hasAlpha(this.swigCPtr, this);
    }

    public boolean hasTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentComposite_hasTimeClipEnd(this.swigCPtr, this);
    }

    public boolean hasTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentComposite_hasTimeClipStart(this.swigCPtr, this);
    }

    public NLESegmentComposite() {
        this(NLEEditorJniJNI.new_NLESegmentComposite(), true);
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

    public static NLESegmentComposite dynamicCast(NLENode nLENode) {
        long jNLESegmentComposite_dynamicCast = NLEEditorJniJNI.NLESegmentComposite_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentComposite_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentComposite(jNLESegmentComposite_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentComposite nLESegmentComposite) {
        if (nLESegmentComposite == null) {
            return 0L;
        }
        return nLESegmentComposite.swigCPtr;
    }

    public void setAlpha(float f) {
        NLEEditorJniJNI.NLESegmentComposite_setAlpha(this.swigCPtr, this, f);
    }

    public void setCompositeResource(NLEResourceComposite nLEResourceComposite) {
        NLEEditorJniJNI.NLESegmentComposite_setCompositeResource(this.swigCPtr, this, NLEResourceComposite.getCPtr(nLEResourceComposite), nLEResourceComposite);
    }

    public void setTimeClipEnd(long j) {
        NLEEditorJniJNI.NLESegmentComposite_setTimeClipEnd(this.swigCPtr, this, j);
    }

    public void setTimeClipStart(long j) {
        NLEEditorJniJNI.NLESegmentComposite_setTimeClipStart(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentComposite(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentComposite_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
