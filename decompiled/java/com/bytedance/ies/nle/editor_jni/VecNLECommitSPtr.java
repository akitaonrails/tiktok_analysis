package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLECommitSPtr {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLECommitSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLECommit back() {
        long jVecNLECommitSPtr_back = NLEEditorJniJNI.VecNLECommitSPtr_back(this.swigCPtr, this);
        if (jVecNLECommitSPtr_back == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtr_back, true);
    }

    public void clear() {
        NLEEditorJniJNI.VecNLECommitSPtr_clear(this.swigCPtr, this);
    }

    public boolean empty() {
        return NLEEditorJniJNI.VecNLECommitSPtr_empty(this.swigCPtr, this);
    }

    public NLECommit front() {
        long jVecNLECommitSPtr_front = NLEEditorJniJNI.VecNLECommitSPtr_front(this.swigCPtr, this);
        if (jVecNLECommitSPtr_front == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtr_front, true);
    }

    public long max_size() {
        return NLEEditorJniJNI.VecNLECommitSPtr_max_size(this.swigCPtr, this);
    }

    public void pop_back() {
        NLEEditorJniJNI.VecNLECommitSPtr_pop_back(this.swigCPtr, this);
    }

    public void pop_front() {
        NLEEditorJniJNI.VecNLECommitSPtr_pop_front(this.swigCPtr, this);
    }

    public long size() {
        return NLEEditorJniJNI.VecNLECommitSPtr_size(this.swigCPtr, this);
    }

    public VecNLECommitSPtr() {
        this(NLEEditorJniJNI.new_VecNLECommitSPtr__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public VecNLECommitSPtr(VecNLECommitSPtr vecNLECommitSPtr) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtr__SWIG_3(getCPtr(vecNLECommitSPtr), vecNLECommitSPtr), true);
    }

    public static long getCPtr(VecNLECommitSPtr vecNLECommitSPtr) {
        if (vecNLECommitSPtr == null) {
            return 0L;
        }
        return vecNLECommitSPtr.swigCPtr;
    }

    public void delitem(int i) {
        NLEEditorJniJNI.VecNLECommitSPtr_delitem(this.swigCPtr, this, i);
    }

    public NLECommit getitem(int i) {
        long jVecNLECommitSPtr_getitem = NLEEditorJniJNI.VecNLECommitSPtr_getitem(this.swigCPtr, this, i);
        if (jVecNLECommitSPtr_getitem == 0) {
            return null;
        }
        return new NLECommit(jVecNLECommitSPtr_getitem, true);
    }

    public void push_back(NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtr_push_back(this.swigCPtr, this, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void push_front(NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtr_push_front(this.swigCPtr, this, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void resize(long j) {
        NLEEditorJniJNI.VecNLECommitSPtr_resize__SWIG_1(this.swigCPtr, this, j);
    }

    public void swap(VecNLECommitSPtr vecNLECommitSPtr) {
        NLEEditorJniJNI.VecNLECommitSPtr_swap(this.swigCPtr, this, getCPtr(vecNLECommitSPtr), vecNLECommitSPtr);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLECommitSPtr(long j) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtr__SWIG_2(j), true);
    }

    public VecNLECommitSPtr(long j, NLECommit nLECommit) {
        this(NLEEditorJniJNI.new_VecNLECommitSPtr__SWIG_1(j, NLECommit.getCPtr(nLECommit), nLECommit), true);
    }

    public void assign(long j, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtr_assign(this.swigCPtr, this, j, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void delslice(int i, int i2) {
        NLEEditorJniJNI.VecNLECommitSPtr_delslice(this.swigCPtr, this, i, i2);
    }

    public VecNLECommitSPtr getslice(int i, int i2) {
        return new VecNLECommitSPtr(NLEEditorJniJNI.VecNLECommitSPtr_getslice(this.swigCPtr, this, i, i2), true);
    }

    public void resize(long j, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtr_resize__SWIG_0(this.swigCPtr, this, j, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public void setitem(int i, NLECommit nLECommit) {
        NLEEditorJniJNI.VecNLECommitSPtr_setitem(this.swigCPtr, this, i, NLECommit.getCPtr(nLECommit), nLECommit);
    }

    public VecNLECommitSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setslice(int i, int i2, VecNLECommitSPtr vecNLECommitSPtr) {
        NLEEditorJniJNI.VecNLECommitSPtr_setslice(this.swigCPtr, this, i, i2, getCPtr(vecNLECommitSPtr), vecNLECommitSPtr);
    }
}
