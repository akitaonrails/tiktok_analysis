package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETimeSpaceNode extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETimeSpaceNode(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETimeSpaceNode_clone = NLEEditorJniJNI.NLETimeSpaceNode_clone(this.swigCPtr, this);
        if (jNLETimeSpaceNode_clone == 0) {
            return null;
        }
        return new NLENode(jNLETimeSpaceNode_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLETimeSpaceNode_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public float getAbsSpeed() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getAbsSpeed(this.swigCPtr, this);
    }

    public float getAnchorX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getAnchorX(this.swigCPtr, this);
    }

    public float getAnchorY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getAnchorY(this.swigCPtr, this);
    }

    public long getDuration() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getDuration(this.swigCPtr, this);
    }

    public long getEndTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getEndTime(this.swigCPtr, this);
    }

    public int getLayer() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getLayer(this.swigCPtr, this);
    }

    public long getMeasuredEndTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getMeasuredEndTime(this.swigCPtr, this);
    }

    public long getMeasuredStartTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getMeasuredStartTime(this.swigCPtr, this);
    }

    public boolean getMirror_X() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getMirror_X(this.swigCPtr, this);
    }

    public boolean getMirror_Y() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getMirror_Y(this.swigCPtr, this);
    }

    public VecString getProcessor() {
        return new VecString(NLEEditorJniJNI.NLETimeSpaceNode_getProcessor(this.swigCPtr, this), true);
    }

    public float getRelativeHeight() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getRelativeHeight(this.swigCPtr, this);
    }

    public float getRelativeWidth() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getRelativeWidth(this.swigCPtr, this);
    }

    public boolean getRewind() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getRewind(this.swigCPtr, this);
    }

    public float getRotation() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getRotation(this.swigCPtr, this);
    }

    public float getScale() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getScale(this.swigCPtr, this);
    }

    public float getScaleX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getScaleX(this.swigCPtr, this);
    }

    public float getScaleY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getScaleY(this.swigCPtr, this);
    }

    public float getSpeed() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getSpeed(this.swigCPtr, this);
    }

    public long getStartTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getStartTime(this.swigCPtr, this);
    }

    public float getTransformX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getTransformX(this.swigCPtr, this);
    }

    public float getTransformY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getTransformY(this.swigCPtr, this);
    }

    public int getTransformZ() {
        return NLEEditorJniJNI.NLETimeSpaceNode_getTransformZ(this.swigCPtr, this);
    }

    public VecFloat getoriginScale() {
        return new VecFloat(NLEEditorJniJNI.NLETimeSpaceNode_getoriginScale(this.swigCPtr, this), true);
    }

    public boolean hasAnchorX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasAnchorX(this.swigCPtr, this);
    }

    public boolean hasAnchorY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasAnchorY(this.swigCPtr, this);
    }

    public boolean hasEndTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasEndTime(this.swigCPtr, this);
    }

    public boolean hasMirror_X() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasMirror_X(this.swigCPtr, this);
    }

    public boolean hasMirror_Y() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasMirror_Y(this.swigCPtr, this);
    }

    public boolean hasProcessor() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasProcessor(this.swigCPtr, this);
    }

    public boolean hasRelativeHeight() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasRelativeHeight(this.swigCPtr, this);
    }

    public boolean hasRelativeWidth() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasRelativeWidth(this.swigCPtr, this);
    }

    public boolean hasRotation() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasRotation(this.swigCPtr, this);
    }

    public boolean hasScale() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasScale(this.swigCPtr, this);
    }

    public boolean hasScaleX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasScaleX(this.swigCPtr, this);
    }

    public boolean hasScaleY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasScaleY(this.swigCPtr, this);
    }

    public boolean hasSpeed() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasSpeed(this.swigCPtr, this);
    }

    public boolean hasStartTime() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasStartTime(this.swigCPtr, this);
    }

    public boolean hasTransformX() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasTransformX(this.swigCPtr, this);
    }

    public boolean hasTransformY() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasTransformY(this.swigCPtr, this);
    }

    public boolean hasTransformZ() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasTransformZ(this.swigCPtr, this);
    }

    public boolean hasoriginScale() {
        return NLEEditorJniJNI.NLETimeSpaceNode_hasoriginScale(this.swigCPtr, this);
    }

    public NLETimeSpaceNode() {
        this(NLEEditorJniJNI.new_NLETimeSpaceNode(), true);
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

    public static NLETimeSpaceNode dynamicCast(NLENode nLENode) {
        long jNLETimeSpaceNode_dynamicCast = NLEEditorJniJNI.NLETimeSpaceNode_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETimeSpaceNode_dynamicCast == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jNLETimeSpaceNode_dynamicCast, true);
    }

    public static long getCPtr(NLETimeSpaceNode nLETimeSpaceNode) {
        if (nLETimeSpaceNode == null) {
            return 0L;
        }
        return nLETimeSpaceNode.swigCPtr;
    }

    public void setAbsSpeed(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setAbsSpeed(this.swigCPtr, this, f);
    }

    public void setAnchorX(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setAnchorX(this.swigCPtr, this, f);
    }

    public void setAnchorY(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setAnchorY(this.swigCPtr, this, f);
    }

    public void setDuration(long j) {
        NLEEditorJniJNI.NLETimeSpaceNode_setDuration(this.swigCPtr, this, j);
    }

    public void setEndTime(long j) {
        NLEEditorJniJNI.NLETimeSpaceNode_setEndTime(this.swigCPtr, this, j);
    }

    public void setLayer(int i) {
        NLEEditorJniJNI.NLETimeSpaceNode_setLayer(this.swigCPtr, this, i);
    }

    public void setMeasuredEndTime(long j) {
        NLEEditorJniJNI.NLETimeSpaceNode_setMeasuredEndTime(this.swigCPtr, this, j);
    }

    public void setMeasuredStartTime(long j) {
        NLEEditorJniJNI.NLETimeSpaceNode_setMeasuredStartTime(this.swigCPtr, this, j);
    }

    public void setMirror_X(boolean z) {
        NLEEditorJniJNI.NLETimeSpaceNode_setMirror_X(this.swigCPtr, this, z);
    }

    public void setMirror_Y(boolean z) {
        NLEEditorJniJNI.NLETimeSpaceNode_setMirror_Y(this.swigCPtr, this, z);
    }

    public void setProcessor(VecString vecString) {
        NLEEditorJniJNI.NLETimeSpaceNode_setProcessor(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setRelativeHeight(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setRelativeHeight(this.swigCPtr, this, f);
    }

    public void setRelativeWidth(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setRelativeWidth(this.swigCPtr, this, f);
    }

    public void setRewind(boolean z) {
        NLEEditorJniJNI.NLETimeSpaceNode_setRewind(this.swigCPtr, this, z);
    }

    public void setRotation(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setRotation(this.swigCPtr, this, f);
    }

    public void setScale(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setScale(this.swigCPtr, this, f);
    }

    public void setScaleX(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setScaleX(this.swigCPtr, this, f);
    }

    public void setScaleY(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setScaleY(this.swigCPtr, this, f);
    }

    public void setSpeed(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setSpeed(this.swigCPtr, this, f);
    }

    public void setStartTime(long j) {
        NLEEditorJniJNI.NLETimeSpaceNode_setStartTime(this.swigCPtr, this, j);
    }

    public void setTransformX(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setTransformX(this.swigCPtr, this, f);
    }

    public void setTransformY(float f) {
        NLEEditorJniJNI.NLETimeSpaceNode_setTransformY(this.swigCPtr, this, f);
    }

    public void setTransformZ(int i) {
        NLEEditorJniJNI.NLETimeSpaceNode_setTransformZ(this.swigCPtr, this, i);
    }

    public void setoriginScale(VecFloat vecFloat) {
        NLEEditorJniJNI.NLETimeSpaceNode_setoriginScale(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETimeSpaceNode(long j, boolean z) {
        super(NLEEditorJniJNI.NLETimeSpaceNode_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
