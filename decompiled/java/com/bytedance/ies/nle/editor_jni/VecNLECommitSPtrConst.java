package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLECommitSPtrConst {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLECommitSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLECommit back() {
        long jVecNLECommitSPtrConst_back = NLEEditorJniJNI.VecNLECommitSPtrConst_back(this.swigCPtr, this);
        if (jVecNLECommitSPtrConst_back == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtrConst_back, true);
    }

    public void clear() {
        NLEEditorJniJNI.VecNLECommitSPtrConst_clear(this.swigCPtr, this);
    }

    public boolean empty() {
        return NLEEditorJniJNI.VecNLECommitSPtrConst_empty(this.swigCPtr, this);
    }

    public NLECommit front() {
        long jVecNLECommitSPtrConst_front = NLEEditorJniJNI.VecNLECommitSPtrConst_front(this.swigCPtr, this);
        if (jVecNLECommitSPtrConst_front == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtrConst_front, true);
    }

    public long max_size() {
        return NLEEditorJniJNI.VecNLECommitSPtrConst_max_size(this.swigCPtr, this);
    }

    public void pop_back() {
        NLEEditorJniJNI.VecNLECommitSPtrConst_pop_back(this.swigCPtr, this);
    }

    public void pop_front() {
        NLEEditorJniJNI.VecNLECommitSPtrConst_pop_front(this.swigCPtr, this);
    }

    public long size() {
        return NLEEditorJniJNI.VecNLECommitSPtrConst_size(this.swigCPtr, this);
    }

    public VecNLECommitSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLECommitSPtrConst__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public VecNLECommitSPtrConst(VecNLECommitSPtrConst vecNLECommitSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtrConst__SWIG_3(getCPtr(vecNLECommitSPtrConst), vecNLECommitSPtrConst), true);
    }

    public static long getCPtr(VecNLECommitSPtrConst vecNLECommitSPtrConst) {
        if (vecNLECommitSPtrConst == null) {
            return 0L;
        }
        return vecNLECommitSPtrConst.swigCPtr;
    }

    public void delitem(int i) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_delitem(this.swigCPtr, this, i);
    }

    public NLECommit getitem(int i) {
        long jVecNLECommitSPtrConst_getitem = NLEEditorJniJNI.VecNLECommitSPtrConst_getitem(this.swigCPtr, this, i);
        if (jVecNLECommitSPtrConst_getitem == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtrConst_getitem, true);
    }

    public void push_back(NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_push_back(this.swigCPtr, this, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void push_front(NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_push_front(this.swigCPtr, this, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void resize(long j) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_resize__SWIG_1(this.swigCPtr, this, j);
    }

    public void swap(VecNLECommitSPtrConst vecNLECommitSPtrConst) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_swap(this.swigCPtr, this, getCPtr(vecNLECommitSPtrConst), vecNLECommitSPtrConst);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLECommitSPtrConst(long j) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtrConst__SWIG_2(j), true);
    }

    public VecNLECommitSPtrConst(long j, NLECommit nLECommit) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtrConst__SWIG_1(j, NLECommit.getCPtr(nLECommit), nLECommit), true);
    }

    public void assign(long j, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_assign(this.swigCPtr, this, j, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void delslice(int i, int i2) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_delslice(this.swigCPtr, this, i, i2);
    }

    public VecNLECommitSPtrConst getslice(int i, int i2) {
        return new VecNLECommitSPtrConst(NLEEditorJniJNI.VecNLECommitSPtrConst_getslice(this.swigCPtr, this, i, i2), true);
    }

    public void resize(long j, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_resize__SWIG_0(this.swigCPtr, this, j, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void setitem(int i, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_setitem(this.swigCPtr, this, i, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public VecNLECommitSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setslice(int i, int i2, VecNLECommitSPtrConst vecNLECommitSPtrConst) {
        NLEEditorJniJNI.VecNLECommitSPtrConst_setslice(this.swigCPtr, this, i, i2, getCPtr(vecNLECommitSPtrConst), vecNLECommitSPtrConst);
    }
}
