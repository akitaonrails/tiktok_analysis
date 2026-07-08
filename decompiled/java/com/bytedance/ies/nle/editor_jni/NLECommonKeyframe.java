package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLECommonKeyframe extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLECommonKeyframe(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLECommonKeyframe_clone = NLEEditorJniJNI.NLECommonKeyframe_clone(this.swigCPtr, this);
        if (jNLECommonKeyframe_clone == 0) {
            return null;
        }
        return new NLENode(jNLECommonKeyframe_clone, true);
    }

    public NLEKeyframeGraphType getGraphType() {
        return NLEKeyframeGraphType.swigToEnum(NLEEditorJniJNI.NLECommonKeyframe_getGraphType(this.swigCPtr, this));
    }

    public NLETimePointPair getLeftControl() {
        long jNLECommonKeyframe_getLeftControl = NLEEditorJniJNI.NLECommonKeyframe_getLeftControl(this.swigCPtr, this);
        if (jNLECommonKeyframe_getLeftControl == 0) {
            return null;
        }
        return new NLETimePointPair(jNLECommonKeyframe_getLeftControl, true);
    }

    public long getLeftControlTime() {
        return NLEEditorJniJNI.NLECommonKeyframe_getLeftControlTime(this.swigCPtr, this);
    }

    public VecDouble getLeftControlValue() {
        return new VecDouble(NLEEditorJniJNI.NLECommonKeyframe_getLeftControlValue(this.swigCPtr, this), true);
    }

    public NLETimePointPair getRightControl() {
        long jNLECommonKeyframe_getRightControl = NLEEditorJniJNI.NLECommonKeyframe_getRightControl(this.swigCPtr, this);
        if (jNLECommonKeyframe_getRightControl == 0) {
            return null;
        }
        return new NLETimePointPair(jNLECommonKeyframe_getRightControl, true);
    }

    public long getRightControlTime() {
        return NLEEditorJniJNI.NLECommonKeyframe_getRightControlTime(this.swigCPtr, this);
    }

    public VecDouble getRightControlValue() {
        return new VecDouble(NLEEditorJniJNI.NLECommonKeyframe_getRightControlValue(this.swigCPtr, this), true);
    }

    public long getTimeOffset() {
        return NLEEditorJniJNI.NLECommonKeyframe_getTimeOffset(this.swigCPtr, this);
    }

    public VecDouble getValue() {
        return new VecDouble(NLEEditorJniJNI.NLECommonKeyframe_getValue(this.swigCPtr, this), true);
    }

    public boolean hasGraphType() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasGraphType(this.swigCPtr, this);
    }

    public boolean hasLeftControlTime() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasLeftControlTime(this.swigCPtr, this);
    }

    public boolean hasLeftControlValue() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasLeftControlValue(this.swigCPtr, this);
    }

    public boolean hasRightControlTime() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasRightControlTime(this.swigCPtr, this);
    }

    public boolean hasRightControlValue() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasRightControlValue(this.swigCPtr, this);
    }

    public boolean hasTimeOffset() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasTimeOffset(this.swigCPtr, this);
    }

    public boolean hasValue() {
        return NLEEditorJniJNI.NLECommonKeyframe_hasValue(this.swigCPtr, this);
    }

    public NLECommonKeyframe() {
        this(NLEEditorJniJNI.new_NLECommonKeyframe(), true);
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

    public static NLECommonKeyframe dynamicCast(NLENode nLENode) {
        long jNLECommonKeyframe_dynamicCast = NLEEditorJniJNI.NLECommonKeyframe_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLECommonKeyframe_dynamicCast == 0) {
            return null;
        }
        return new NLECommonKeyframe(jNLECommonKeyframe_dynamicCast, true);
    }

    public static long getCPtr(NLECommonKeyframe nLECommonKeyframe) {
        if (nLECommonKeyframe == null) {
            return 0L;
        }
        return nLECommonKeyframe.swigCPtr;
    }

    public void setGraphType(NLEKeyframeGraphType nLEKeyframeGraphType) {
        NLEEditorJniJNI.NLECommonKeyframe_setGraphType(this.swigCPtr, this, nLEKeyframeGraphType.swigValue());
    }

    public void setKeyframeValue(double d) {
        NLEEditorJniJNI.NLECommonKeyframe_setKeyframeValue(this.swigCPtr, this, d);
    }

    public void setLeftControl(NLETimePointPair nLETimePointPair) {
        NLEEditorJniJNI.NLECommonKeyframe_setLeftControl(this.swigCPtr, this, NLETimePointPair.getCPtr(nLETimePointPair), nLETimePointPair);
    }

    public void setLeftControlTime(long j) {
        NLEEditorJniJNI.NLECommonKeyframe_setLeftControlTime(this.swigCPtr, this, j);
    }

    public void setLeftControlValue(VecDouble vecDouble) {
        NLEEditorJniJNI.NLECommonKeyframe_setLeftControlValue(this.swigCPtr, this, VecDouble.getCPtr(vecDouble), vecDouble);
    }

    public void setRightControl(NLETimePointPair nLETimePointPair) {
        NLEEditorJniJNI.NLECommonKeyframe_setRightControl(this.swigCPtr, this, NLETimePointPair.getCPtr(nLETimePointPair), nLETimePointPair);
    }

    public void setRightControlTime(long j) {
        NLEEditorJniJNI.NLECommonKeyframe_setRightControlTime(this.swigCPtr, this, j);
    }

    public void setRightControlValue(VecDouble vecDouble) {
        NLEEditorJniJNI.NLECommonKeyframe_setRightControlValue(this.swigCPtr, this, VecDouble.getCPtr(vecDouble), vecDouble);
    }

    public void setTimeOffset(long j) {
        NLEEditorJniJNI.NLECommonKeyframe_setTimeOffset(this.swigCPtr, this, j);
    }

    public void setValue(VecDouble vecDouble) {
        NLEEditorJniJNI.NLECommonKeyframe_setValue(this.swigCPtr, this, VecDouble.getCPtr(vecDouble), vecDouble);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLECommonKeyframe(long j, boolean z) {
        super(NLEEditorJniJNI.NLECommonKeyframe_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
