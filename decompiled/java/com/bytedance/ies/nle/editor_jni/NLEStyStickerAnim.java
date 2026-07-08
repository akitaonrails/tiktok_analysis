package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyStickerAnim extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyStickerAnim(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyStickerAnim_clone = NLEEditorJniJNI.NLEStyStickerAnim_clone(this.swigCPtr, this);
        if (jNLEStyStickerAnim_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyStickerAnim_clone, true);
    }

    public String getAnimParams() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getAnimParams(this.swigCPtr, this);
    }

    public NLEStickerAnimType getAnimType() {
        return NLEStickerAnimType.swigToEnum(NLEEditorJniJNI.NLEStyStickerAnim_getAnimType(this.swigCPtr, this));
    }

    public NLEResourceNode getAtomAnim() {
        long jNLEStyStickerAnim_getAtomAnim = NLEEditorJniJNI.NLEStyStickerAnim_getAtomAnim(this.swigCPtr, this);
        if (jNLEStyStickerAnim_getAtomAnim == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyStickerAnim_getAtomAnim, true);
    }

    public int getAtomAnimEndTime() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getAtomAnimEndTime(this.swigCPtr, this);
    }

    public int getAtomAnimStartTime() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getAtomAnimStartTime(this.swigCPtr, this);
    }

    public NLEResourceNode getInAnim() {
        long jNLEStyStickerAnim_getInAnim = NLEEditorJniJNI.NLEStyStickerAnim_getInAnim(this.swigCPtr, this);
        if (jNLEStyStickerAnim_getInAnim == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyStickerAnim_getInAnim, true);
    }

    public int getInDuration() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getInDuration(this.swigCPtr, this);
    }

    public boolean getLoop() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getLoop(this.swigCPtr, this);
    }

    public NLEResourceNode getOutAnim() {
        long jNLEStyStickerAnim_getOutAnim = NLEEditorJniJNI.NLEStyStickerAnim_getOutAnim(this.swigCPtr, this);
        if (jNLEStyStickerAnim_getOutAnim == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyStickerAnim_getOutAnim, true);
    }

    public int getOutDuration() {
        return NLEEditorJniJNI.NLEStyStickerAnim_getOutDuration(this.swigCPtr, this);
    }

    public NLEStyRecognizedWord getRecognizedWord() {
        long jNLEStyStickerAnim_getRecognizedWord = NLEEditorJniJNI.NLEStyStickerAnim_getRecognizedWord(this.swigCPtr, this);
        if (jNLEStyStickerAnim_getRecognizedWord == 0) {
            return null;
        }
        return new NLEStyRecognizedWord(jNLEStyStickerAnim_getRecognizedWord, true);
    }

    public boolean hasAnimParams() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasAnimParams(this.swigCPtr, this);
    }

    public boolean hasAnimType() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasAnimType(this.swigCPtr, this);
    }

    public boolean hasAtomAnimEndTime() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasAtomAnimEndTime(this.swigCPtr, this);
    }

    public boolean hasAtomAnimStartTime() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasAtomAnimStartTime(this.swigCPtr, this);
    }

    public boolean hasInDuration() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasInDuration(this.swigCPtr, this);
    }

    public boolean hasLoop() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasLoop(this.swigCPtr, this);
    }

    public boolean hasOutDuration() {
        return NLEEditorJniJNI.NLEStyStickerAnim_hasOutDuration(this.swigCPtr, this);
    }

    public NLEStyStickerAnim() {
        this(NLEEditorJniJNI.new_NLEStyStickerAnim(), true);
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

    public static NLEStyStickerAnim dynamicCast(NLENode nLENode) {
        long jNLEStyStickerAnim_dynamicCast = NLEEditorJniJNI.NLEStyStickerAnim_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyStickerAnim_dynamicCast == 0) {
            return null;
        }
        return new NLEStyStickerAnim(jNLEStyStickerAnim_dynamicCast, true);
    }

    public static long getCPtr(NLEStyStickerAnim nLEStyStickerAnim) {
        if (nLEStyStickerAnim == null) {
            return 0L;
        }
        return nLEStyStickerAnim.swigCPtr;
    }

    public void setAnimParams(String str) {
        NLEEditorJniJNI.NLEStyStickerAnim_setAnimParams(this.swigCPtr, this, str);
    }

    public void setAnimType(NLEStickerAnimType nLEStickerAnimType) {
        NLEEditorJniJNI.NLEStyStickerAnim_setAnimType(this.swigCPtr, this, nLEStickerAnimType.swigValue());
    }

    public void setAtomAnim(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyStickerAnim_setAtomAnim(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setAtomAnimEndTime(int i) {
        NLEEditorJniJNI.NLEStyStickerAnim_setAtomAnimEndTime(this.swigCPtr, this, i);
    }

    public void setAtomAnimStartTime(int i) {
        NLEEditorJniJNI.NLEStyStickerAnim_setAtomAnimStartTime(this.swigCPtr, this, i);
    }

    public void setInAnim(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyStickerAnim_setInAnim(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setInDuration(int i) {
        NLEEditorJniJNI.NLEStyStickerAnim_setInDuration(this.swigCPtr, this, i);
    }

    public void setLoop(boolean z) {
        NLEEditorJniJNI.NLEStyStickerAnim_setLoop(this.swigCPtr, this, z);
    }

    public void setOutAnim(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyStickerAnim_setOutAnim(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setOutDuration(int i) {
        NLEEditorJniJNI.NLEStyStickerAnim_setOutDuration(this.swigCPtr, this, i);
    }

    public void setRecognizedWord(NLEStyRecognizedWord nLEStyRecognizedWord) {
        NLEEditorJniJNI.NLEStyStickerAnim_setRecognizedWord(this.swigCPtr, this, NLEStyRecognizedWord.getCPtr(nLEStyRecognizedWord), nLEStyRecognizedWord);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyStickerAnim(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyStickerAnim_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
