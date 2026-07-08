package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEKeyframe extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEKeyframe(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearKeyframe() {
        NLEEditorJniJNI.NLEKeyframe_clearKeyframe(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEKeyframe_clone = NLEEditorJniJNI.NLEKeyframe_clone(this.swigCPtr, this);
        if (jNLEKeyframe_clone == 0) {
            return null;
        }
        return new NLENode(jNLEKeyframe_clone, true);
    }

    public String getKeyframeProperty() {
        return NLEEditorJniJNI.NLEKeyframe_getKeyframeProperty(this.swigCPtr, this);
    }

    public NLEKeyframeType getKeyframeType() {
        return NLEKeyframeType.swigToEnum(NLEEditorJniJNI.NLEKeyframe_getKeyframeType(this.swigCPtr, this));
    }

    public VecNLECommonKeyframe getKeyframes() {
        return new VecNLECommonKeyframe(NLEEditorJniJNI.NLEKeyframe_getKeyframes(this.swigCPtr, this), true);
    }

    public VecNLECommonKeyframe getSortedCommonKeyframes() {
        return new VecNLECommonKeyframe(NLEEditorJniJNI.NLEKeyframe_getSortedCommonKeyframes(this.swigCPtr, this), true);
    }

    public boolean hasKeyframeProperty() {
        return NLEEditorJniJNI.NLEKeyframe_hasKeyframeProperty(this.swigCPtr, this);
    }

    public boolean hasKeyframeType() {
        return NLEEditorJniJNI.NLEKeyframe_hasKeyframeType(this.swigCPtr, this);
    }

    public NLEKeyframe() {
        this(NLEEditorJniJNI.new_NLEKeyframe(), true);
    }

    public static NLEKeyframe create() {
        long jNLEKeyframe_create__SWIG_2 = NLEEditorJniJNI.NLEKeyframe_create__SWIG_2();
        if (jNLEKeyframe_create__SWIG_2 == 0) {
            return null;
        }
        return new NLEKeyframe(jNLEKeyframe_create__SWIG_2, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEKeyframe create(NLEKeyframeType nLEKeyframeType) {
        long jNLEKeyframe_create__SWIG_1 = NLEEditorJniJNI.NLEKeyframe_create__SWIG_1(nLEKeyframeType.swigValue());
        if (jNLEKeyframe_create__SWIG_1 == 0) {
            return null;
        }
        return new NLEKeyframe(jNLEKeyframe_create__SWIG_1, true);
    }

    public static NLEKeyframe dynamicCast(NLENode nLENode) {
        long jNLEKeyframe_dynamicCast = NLEEditorJniJNI.NLEKeyframe_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEKeyframe_dynamicCast == 0) {
            return null;
        }
        return new NLEKeyframe(jNLEKeyframe_dynamicCast, true);
    }

    public static long getCPtr(NLEKeyframe nLEKeyframe) {
        if (nLEKeyframe == null) {
            return 0L;
        }
        return nLEKeyframe.swigCPtr;
    }

    public void addKeyframe(NLECommonKeyframe nLECommonKeyframe) {
        NLEEditorJniJNI.NLEKeyframe_addKeyframe(this.swigCPtr, this, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe);
    }

    public boolean removeKeyframe(NLECommonKeyframe nLECommonKeyframe) {
        return NLEEditorJniJNI.NLEKeyframe_removeKeyframe(this.swigCPtr, this, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe);
    }

    public void setKeyframeProperty(String str) {
        NLEEditorJniJNI.NLEKeyframe_setKeyframeProperty(this.swigCPtr, this, str);
    }

    public void setKeyframeType(NLEKeyframeType nLEKeyframeType) {
        NLEEditorJniJNI.NLEKeyframe_setKeyframeType(this.swigCPtr, this, nLEKeyframeType.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEKeyframe(long j, boolean z) {
        super(NLEEditorJniJNI.NLEKeyframe_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static NLEKeyframe create(NLEKeyframeType nLEKeyframeType, String str) {
        long jNLEKeyframe_create__SWIG_0 = NLEEditorJniJNI.NLEKeyframe_create__SWIG_0(nLEKeyframeType.swigValue(), str);
        if (jNLEKeyframe_create__SWIG_0 == 0) {
            return null;
        }
        return new NLEKeyframe(jNLEKeyframe_create__SWIG_0, true);
    }

    public NLECommonKeyframe commonKeyframeAtTimeOffset(long j, long j2) {
        long jNLEKeyframe_commonKeyframeAtTimeOffset = NLEEditorJniJNI.NLEKeyframe_commonKeyframeAtTimeOffset(this.swigCPtr, this, j, j2);
        if (jNLEKeyframe_commonKeyframeAtTimeOffset == 0) {
            return null;
        }
        return new NLECommonKeyframe(jNLEKeyframe_commonKeyframeAtTimeOffset, true);
    }

    public void addOrUpdateCommonKeyframeAtTimeOffset(long j, long j2, VecDouble vecDouble) {
        NLEEditorJniJNI.NLEKeyframe_addOrUpdateCommonKeyframeAtTimeOffset(this.swigCPtr, this, j, j2, VecDouble.getCPtr(vecDouble), vecDouble);
    }
}
