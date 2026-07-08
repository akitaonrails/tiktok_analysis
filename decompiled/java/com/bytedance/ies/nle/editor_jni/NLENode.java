package com.bytedance.ies.nle.editor_jni;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes6.dex */
public class NLENode {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLENode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearExtra() {
        NLEEditorJniJNI.NLENode_clearExtra(this.swigCPtr, this);
    }

    public void clearListener() {
        NLEEditorJniJNI.NLENode_clearListener(this.swigCPtr, this);
    }

    public void clearTransientExtra() {
        NLEEditorJniJNI.NLENode_clearTransientExtra(this.swigCPtr, this);
    }

    public void clearWorkingDirty() {
        NLEEditorJniJNI.NLENode_clearWorkingDirty(this.swigCPtr, this);
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NLENode mo130clone() {
        long jNLENode_clone = NLEEditorJniJNI.NLENode_clone(this.swigCPtr, this);
        if (jNLENode_clone == 0) {
            return null;
        }
        return new NLENode(jNLENode_clone, true);
    }

    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLENode_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public NLENode deepClone() {
        long jNLENode_deepClone__SWIG_0 = NLEEditorJniJNI.NLENode_deepClone__SWIG_0(this.swigCPtr, this);
        if (jNLENode_deepClone__SWIG_0 == 0) {
            return null;
        }
        return new NLENode(jNLENode_deepClone__SWIG_0, true);
    }

    public MapStrNLENodeSPtr getChildren() {
        return new MapStrNLENodeSPtr(NLEEditorJniJNI.NLENode_getChildren(this.swigCPtr, this), false);
    }

    public NLEClassType getClassType() {
        return NLEClassType.swigToEnum(NLEEditorJniJNI.NLENode_getClassType(this.swigCPtr, this));
    }

    public boolean getEnable() {
        return NLEEditorJniJNI.NLENode_getEnable(this.swigCPtr, this);
    }

    public VecString getExtraKeys() {
        return new VecString(NLEEditorJniJNI.NLENode_getExtraKeys(this.swigCPtr, this), true);
    }

    public VecString getFeatureList() {
        return new VecString(NLEEditorJniJNI.NLENode_getFeatureList(this.swigCPtr, this), true);
    }

    public long getId() {
        return NLEEditorJniJNI.NLENode_getId(this.swigCPtr, this);
    }

    public String getName() {
        return NLEEditorJniJNI.NLENode_getName(this.swigCPtr, this);
    }

    public NLENode getStage() {
        long jNLENode_getStage = NLEEditorJniJNI.NLENode_getStage(this.swigCPtr, this);
        if (jNLENode_getStage == 0) {
            return null;
        }
        return new NLENode(jNLENode_getStage, true);
    }

    public String getStringId() {
        return NLEEditorJniJNI.NLENode_getStringId(this.swigCPtr, this);
    }

    public String getUUID() {
        return NLEEditorJniJNI.NLENode_getUUID(this.swigCPtr, this);
    }

    public boolean hasEnable() {
        return NLEEditorJniJNI.NLENode_hasEnable(this.swigCPtr, this);
    }

    public boolean hasName() {
        return NLEEditorJniJNI.NLENode_hasName(this.swigCPtr, this);
    }

    public boolean hasUUID() {
        return NLEEditorJniJNI.NLENode_hasUUID(this.swigCPtr, this);
    }

    public boolean isPropertyDirty() {
        return NLEEditorJniJNI.NLENode_isPropertyDirty(this.swigCPtr, this);
    }

    public boolean isWorkingDirty() {
        return NLEEditorJniJNI.NLENode_isWorkingDirty(this.swigCPtr, this);
    }

    public String toJsonString() {
        return NLEEditorJniJNI.NLENode_toJsonString(this.swigCPtr, this);
    }

    public String toModelJson() {
        return NLEEditorJniJNI.NLENode_toModelJson(this.swigCPtr, this);
    }

    public String toString() {
        return NLEEditorJniJNI.NLENode_toString(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static NLENode fromModelJson(String str) {
        long jNLENode_fromModelJson = NLEEditorJniJNI.NLENode_fromModelJson(str);
        if (jNLENode_fromModelJson == 0) {
            return null;
        }
        return new NLENode(jNLENode_fromModelJson, true);
    }

    public static long getCPtr(NLENode nLENode) {
        if (nLENode == null) {
            return 0L;
        }
        return nLENode.swigCPtr;
    }

    public void addFeature(int i) {
        NLEEditorJniJNI.NLENode_addFeature(this.swigCPtr, this, i);
    }

    public void addListener(NLEChangeListener nLEChangeListener) {
        NLEEditorJniJNI.NLENode_addListener(this.swigCPtr, this, NLEChangeListener.getCPtr(nLEChangeListener), nLEChangeListener);
    }

    public NLENode addToStage(long j) {
        long jNLENode_addToStage = NLEEditorJniJNI.NLENode_addToStage(this.swigCPtr, this, j);
        if (jNLENode_addToStage == 0) {
            return null;
        }
        return new NLENode(jNLENode_addToStage, true);
    }

    public boolean addToWorking(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_addToWorking(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public void clearExtraRecursively(VecString vecString) {
        NLEEditorJniJNI.NLENode_clearExtraRecursively(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void clearUnnecessaryExtraRecursively(VecString vecString) {
        NLEEditorJniJNI.NLENode_clearUnnecessaryExtraRecursively(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void collectResources(VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr) {
        NLEEditorJniJNI.NLENode_collectResources(this.swigCPtr, this, VecNLEResourceNodeSPtr.getCPtr(vecNLEResourceNodeSPtr), vecNLEResourceNodeSPtr);
    }

    public NLENode deepClone(boolean z) {
        long jNLENode_deepClone__SWIG_1 = NLEEditorJniJNI.NLENode_deepClone__SWIG_1(this.swigCPtr, this, z);
        if (jNLENode_deepClone__SWIG_1 == 0) {
            return null;
        }
        return new NLENode(jNLENode_deepClone__SWIG_1, true);
    }

    public NLENode deepCloneWithUUID(String str) {
        long jNLENode_deepCloneWithUUID = NLEEditorJniJNI.NLENode_deepCloneWithUUID(this.swigCPtr, this, str);
        if (jNLENode_deepCloneWithUUID == 0) {
            return null;
        }
        return new NLENode(jNLENode_deepCloneWithUUID, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            try {
                return equals((NLENode) obj);
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public String getExtra(String str) {
        return NLEEditorJniJNI.NLENode_getExtra(this.swigCPtr, this, str);
    }

    public String getTransientExtra(String str) {
        return NLEEditorJniJNI.NLENode_getTransientExtra(this.swigCPtr, this, str);
    }

    public boolean hasExtra(String str) {
        return NLEEditorJniJNI.NLENode_hasExtra(this.swigCPtr, this, str);
    }

    public boolean hasTransientExtra(String str) {
        return NLEEditorJniJNI.NLENode_hasTransientExtra(this.swigCPtr, this, str);
    }

    public void removeExtraWithKey(String str) {
        NLEEditorJniJNI.NLENode_removeExtraWithKey(this.swigCPtr, this, str);
    }

    public void removeFeature(int i) {
        NLEEditorJniJNI.NLENode_removeFeature(this.swigCPtr, this, i);
    }

    public void removeTransientExtraWithKey(String str) {
        NLEEditorJniJNI.NLENode_removeTransientExtraWithKey(this.swigCPtr, this, str);
    }

    public void setEnable(boolean z) {
        NLEEditorJniJNI.NLENode_setEnable(this.swigCPtr, this, z);
    }

    public void setName(String str) {
        NLEEditorJniJNI.NLENode_setName(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public boolean unorderEquals(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_unorderEquals__SWIG_1(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public boolean equals(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_equals(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public NLENode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void cloneToNode(NLENode nLENode, boolean z) {
        NLEEditorJniJNI.NLENode_cloneToNode(this.swigCPtr, this, getCPtr(nLENode), nLENode, z);
    }

    public void setExtra(String str, String str2) {
        NLEEditorJniJNI.NLENode_setExtra(this.swigCPtr, this, str, str2);
    }

    public void setTransientExtra(String str, String str2) {
        NLEEditorJniJNI.NLENode_setTransientExtra(this.swigCPtr, this, str, str2);
    }

    public boolean unorderEquals(NLENode nLENode, boolean z) {
        return NLEEditorJniJNI.NLENode_unorderEquals__SWIG_0(this.swigCPtr, this, getCPtr(nLENode), nLENode, z);
    }
}
