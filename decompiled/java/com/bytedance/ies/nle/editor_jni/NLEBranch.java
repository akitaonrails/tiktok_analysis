package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEBranch {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEBranch(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clear() {
        NLEEditorJniJNI.NLEBranch_clear(this.swigCPtr, this);
    }

    public VecNLECommitSPtr getCommits() {
        return new VecNLECommitSPtr(NLEEditorJniJNI.NLEBranch_getCommits(this.swigCPtr, this), false);
    }

    public NLECommit getHead() {
        long jNLEBranch_getHead = NLEEditorJniJNI.NLEBranch_getHead(this.swigCPtr, this);
        if (jNLEBranch_getHead == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_getHead, true);
    }

    public NLECommit getHeadNext() {
        long jNLEBranch_getHeadNext = NLEEditorJniJNI.NLEBranch_getHeadNext(this.swigCPtr, this);
        if (jNLEBranch_getHeadNext == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_getHeadNext, true);
    }

    public NLECommit getHeadPrev() {
        long jNLEBranch_getHeadPrev = NLEEditorJniJNI.NLEBranch_getHeadPrev(this.swigCPtr, this);
        if (jNLEBranch_getHeadPrev == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_getHeadPrev, true);
    }

    public NLEBranchListener getListener() {
        long jNLEBranch_getListener = NLEEditorJniJNI.NLEBranch_getListener(this.swigCPtr, this);
        if (jNLEBranch_getListener == 0) {
            return null;
        }
        return new NLEBranchListener(jNLEBranch_getListener, true);
    }

    public NLECommit resetToNext() {
        long jNLEBranch_resetToNext__SWIG_1 = NLEEditorJniJNI.NLEBranch_resetToNext__SWIG_1(this.swigCPtr, this);
        if (jNLEBranch_resetToNext__SWIG_1 == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_resetToNext__SWIG_1, true);
    }

    public NLECommit resetToPrev() {
        long jNLEBranch_resetToPrev__SWIG_1 = NLEEditorJniJNI.NLEBranch_resetToPrev__SWIG_1(this.swigCPtr, this);
        if (jNLEBranch_resetToPrev__SWIG_1 == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_resetToPrev__SWIG_1, true);
    }

    public NLEBranch() {
        this(NLEEditorJniJNI.new_NLEBranch(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBranch nLEBranch) {
        if (nLEBranch == null) {
            return 0L;
        }
        return nLEBranch.swigCPtr;
    }

    public void addCommit(NLECommit nLECommit) {
        NLEEditorJniJNI.NLEBranch_addCommit(this.swigCPtr, this, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void collectResources(VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr) {
        NLEEditorJniJNI.NLEBranch_collectResources(this.swigCPtr, this, VecNLEResourceNodeSPtr.getCPtr(vecNLEResourceNodeSPtr), vecNLEResourceNodeSPtr);
    }

    public NLECommit goTo(String str) {
        long jNLEBranch_goTo = NLEEditorJniJNI.NLEBranch_goTo(this.swigCPtr, this, str);
        if (jNLEBranch_goTo == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_goTo, true);
    }

    public NLECommit resetToNext(int i) {
        long jNLEBranch_resetToNext__SWIG_0 = NLEEditorJniJNI.NLEBranch_resetToNext__SWIG_0(this.swigCPtr, this, i);
        if (jNLEBranch_resetToNext__SWIG_0 == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_resetToNext__SWIG_0, true);
    }

    public NLECommit resetToPrev(int i) {
        long jNLEBranch_resetToPrev__SWIG_0 = NLEEditorJniJNI.NLEBranch_resetToPrev__SWIG_0(this.swigCPtr, this, i);
        if (jNLEBranch_resetToPrev__SWIG_0 == 0) {
            return null;
        }
        return new NLECommit(jNLEBranch_resetToPrev__SWIG_0, true);
    }

    public void setListener(NLEBranchListener nLEBranchListener) {
        NLEEditorJniJNI.NLEBranch_setListener(this.swigCPtr, this, NLEBranchListener.getCPtr(nLEBranchListener), nLEBranchListener);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBranch(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void trim(long j, long j2) {
        NLEEditorJniJNI.NLEBranch_trim(this.swigCPtr, this, j, j2);
    }

    public boolean trimRange(String str, String str2) {
        return NLEEditorJniJNI.NLEBranch_trimRange__SWIG_0(this.swigCPtr, this, str, str2);
    }

    public boolean trimRange(String str, String str2, boolean z) {
        return NLEEditorJniJNI.NLEBranch_trimRange__SWIG_1(this.swigCPtr, this, str, str2, z);
    }
}
