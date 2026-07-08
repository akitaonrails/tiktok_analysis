package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEMVExternalAlgorithmResultSPtrConst extends AbstractList<NLEMVExternalAlgorithmResult> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEMVExternalAlgorithmResultSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst(Iterable<NLEMVExternalAlgorithmResult> iterable) {
        this();
        Iterator<NLEMVExternalAlgorithmResult> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    private NLEMVExternalAlgorithmResult doGet(int i) {
        long jVecNLEMVExternalAlgorithmResultSPtrConst_doGet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEMVExternalAlgorithmResultSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtrConst_doGet, true);
    }

    private NLEMVExternalAlgorithmResult doRemove(int i) {
        long jVecNLEMVExternalAlgorithmResultSPtrConst_doRemove = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMVExternalAlgorithmResultSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst) {
        if (vecNLEMVExternalAlgorithmResultSPtrConst == null) {
            return 0L;
        }
        return vecNLEMVExternalAlgorithmResultSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        ((AbstractList) this).modCount++;
        doAdd(nLEMVExternalAlgorithmResult);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVExternalAlgorithmResult get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVExternalAlgorithmResult remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst(NLEMVExternalAlgorithmResult[] nLEMVExternalAlgorithmResultArr) {
        this();
        reserve(nLEMVExternalAlgorithmResultArr.length);
        for (NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult : nLEMVExternalAlgorithmResultArr) {
            add(nLEMVExternalAlgorithmResult);
        }
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst(VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_1(getCPtr(vecNLEMVExternalAlgorithmResultSPtrConst), vecNLEMVExternalAlgorithmResultSPtrConst), true);
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_2(i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult), true);
    }

    private void doAdd(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMVExternalAlgorithmResult doSet(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        long jVecNLEMVExternalAlgorithmResultSPtrConst_doSet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doSet(this.swigCPtr, this, i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        if (jVecNLEMVExternalAlgorithmResultSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEMVExternalAlgorithmResult);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVExternalAlgorithmResult set(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        return doSet(i, nLEMVExternalAlgorithmResult);
    }
}
