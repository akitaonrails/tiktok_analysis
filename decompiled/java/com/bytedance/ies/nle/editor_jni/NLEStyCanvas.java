package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyCanvas extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyCanvas(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyCanvas_clone = NLEEditorJniJNI.NLEStyCanvas_clone(this.swigCPtr, this);
        if (jNLEStyCanvas_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyCanvas_clone, true);
    }

    public boolean getAntialiasing() {
        return NLEEditorJniJNI.NLEStyCanvas_getAntialiasing(this.swigCPtr, this);
    }

    public float getBlurRadius() {
        return NLEEditorJniJNI.NLEStyCanvas_getBlurRadius(this.swigCPtr, this);
    }

    public long getBorderColor() {
        return NLEEditorJniJNI.NLEStyCanvas_getBorderColor(this.swigCPtr, this);
    }

    public long getBorderWidth() {
        return NLEEditorJniJNI.NLEStyCanvas_getBorderWidth(this.swigCPtr, this);
    }

    public long getColor() {
        return NLEEditorJniJNI.NLEStyCanvas_getColor(this.swigCPtr, this);
    }

    public long getEndColor() {
        return NLEEditorJniJNI.NLEStyCanvas_getEndColor(this.swigCPtr, this);
    }

    public boolean getGradientColorDither() {
        return NLEEditorJniJNI.NLEStyCanvas_getGradientColorDither(this.swigCPtr, this);
    }

    public NLEResourceNode getImage() {
        long jNLEStyCanvas_getImage = NLEEditorJniJNI.NLEStyCanvas_getImage(this.swigCPtr, this);
        if (jNLEStyCanvas_getImage == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyCanvas_getImage, true);
    }

    public long getStartColor() {
        return NLEEditorJniJNI.NLEStyCanvas_getStartColor(this.swigCPtr, this);
    }

    public NLECanvasType getType() {
        return NLECanvasType.swigToEnum(NLEEditorJniJNI.NLEStyCanvas_getType(this.swigCPtr, this));
    }

    public boolean hasAntialiasing() {
        return NLEEditorJniJNI.NLEStyCanvas_hasAntialiasing(this.swigCPtr, this);
    }

    public boolean hasBlurRadius() {
        return NLEEditorJniJNI.NLEStyCanvas_hasBlurRadius(this.swigCPtr, this);
    }

    public boolean hasBorderColor() {
        return NLEEditorJniJNI.NLEStyCanvas_hasBorderColor(this.swigCPtr, this);
    }

    public boolean hasBorderWidth() {
        return NLEEditorJniJNI.NLEStyCanvas_hasBorderWidth(this.swigCPtr, this);
    }

    public boolean hasColor() {
        return NLEEditorJniJNI.NLEStyCanvas_hasColor(this.swigCPtr, this);
    }

    public boolean hasEndColor() {
        return NLEEditorJniJNI.NLEStyCanvas_hasEndColor(this.swigCPtr, this);
    }

    public boolean hasGradientColorDither() {
        return NLEEditorJniJNI.NLEStyCanvas_hasGradientColorDither(this.swigCPtr, this);
    }

    public boolean hasStartColor() {
        return NLEEditorJniJNI.NLEStyCanvas_hasStartColor(this.swigCPtr, this);
    }

    public boolean hasType() {
        return NLEEditorJniJNI.NLEStyCanvas_hasType(this.swigCPtr, this);
    }

    public NLEStyCanvas() {
        this(NLEEditorJniJNI.new_NLEStyCanvas(), true);
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

    public static NLEStyCanvas dynamicCast(NLENode nLENode) {
        long jNLEStyCanvas_dynamicCast = NLEEditorJniJNI.NLEStyCanvas_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyCanvas_dynamicCast == 0) {
            return null;
        }
        return new NLEStyCanvas(jNLEStyCanvas_dynamicCast, true);
    }

    public static long getCPtr(NLEStyCanvas nLEStyCanvas) {
        if (nLEStyCanvas == null) {
            return 0L;
        }
        return nLEStyCanvas.swigCPtr;
    }

    public void setAntialiasing(boolean z) {
        NLEEditorJniJNI.NLEStyCanvas_setAntialiasing(this.swigCPtr, this, z);
    }

    public void setBlurRadius(float f) {
        NLEEditorJniJNI.NLEStyCanvas_setBlurRadius(this.swigCPtr, this, f);
    }

    public void setBorderColor(long j) {
        NLEEditorJniJNI.NLEStyCanvas_setBorderColor(this.swigCPtr, this, j);
    }

    public void setBorderWidth(long j) {
        NLEEditorJniJNI.NLEStyCanvas_setBorderWidth(this.swigCPtr, this, j);
    }

    public void setColor(long j) {
        NLEEditorJniJNI.NLEStyCanvas_setColor(this.swigCPtr, this, j);
    }

    public void setEndColor(long j) {
        NLEEditorJniJNI.NLEStyCanvas_setEndColor(this.swigCPtr, this, j);
    }

    public void setGradientColorDither(boolean z) {
        NLEEditorJniJNI.NLEStyCanvas_setGradientColorDither(this.swigCPtr, this, z);
    }

    public void setImage(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyCanvas_setImage(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setStartColor(long j) {
        NLEEditorJniJNI.NLEStyCanvas_setStartColor(this.swigCPtr, this, j);
    }

    public void setType(NLECanvasType nLECanvasType) {
        NLEEditorJniJNI.NLEStyCanvas_setType(this.swigCPtr, this, nLECanvasType.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyCanvas(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyCanvas_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
