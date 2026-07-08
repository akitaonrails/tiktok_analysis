package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentTimeEffect extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentTimeEffect(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentTimeEffect_clone = NLEEditorJniJNI.NLESegmentTimeEffect_clone(this.swigCPtr, this);
        if (jNLESegmentTimeEffect_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentTimeEffect_clone, true);
    }

    public long getTimeEffectType() {
        return NLEEditorJniJNI.NLESegmentTimeEffect_getTimeEffectType(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentTimeEffect_getType(this.swigCPtr, this));
    }

    public boolean hasTimeEffectType() {
        return NLEEditorJniJNI.NLESegmentTimeEffect_hasTimeEffectType(this.swigCPtr, this);
    }

    public NLESegmentTimeEffect() {
        this(NLEEditorJniJNI.new_NLESegmentTimeEffect(), true);
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

    public static NLESegmentTimeEffect dynamicCast(NLENode nLENode) {
        long jNLESegmentTimeEffect_dynamicCast = NLEEditorJniJNI.NLESegmentTimeEffect_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentTimeEffect_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTimeEffect(jNLESegmentTimeEffect_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentTimeEffect nLESegmentTimeEffect) {
        if (nLESegmentTimeEffect == null) {
            return 0L;
        }
        return nLESegmentTimeEffect.swigCPtr;
    }

    public void setTimeEffectType(long j) {
        NLEEditorJniJNI.NLESegmentTimeEffect_setTimeEffectType(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentTimeEffect(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentTimeEffect_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
