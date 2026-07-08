package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEMVExternalAlgorithmResultSPtr extends AbstractList<NLEMVExternalAlgorithmResult> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEMVExternalAlgorithmResultSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMVExternalAlgorithmResultSPtr() {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMVExternalAlgorithmResultSPtr(Iterable<NLEMVExternalAlgorithmResult> iterable) {
        this();
        Iterator<NLEMVExternalAlgorithmResult> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    private NLEMVExternalAlgorithmResult doGet(int i) {
        long jVecNLEMVExternalAlgorithmResultSPtr_doGet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEMVExternalAlgorithmResultSPtr_doGet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtr_doGet, true);
    }

    private NLEMVExternalAlgorithmResult doRemove(int i) {
        long jVecNLEMVExternalAlgorithmResultSPtr_doRemove = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMVExternalAlgorithmResultSPtr_doRemove == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr) {
        if (vecNLEMVExternalAlgorithmResultSPtr == null) {
            return 0L;
        }
        return vecNLEMVExternalAlgorithmResultSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEMVExternalAlgorithmResultSPtr(NLEMVExternalAlgorithmResult[] nLEMVExternalAlgorithmResultArr) {
        this();
        reserve(nLEMVExternalAlgorithmResultArr.length);
        for (NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult : nLEMVExternalAlgorithmResultArr) {
            add(nLEMVExternalAlgorithmResult);
        }
    }

    public VecNLEMVExternalAlgorithmResultSPtr(VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr) {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_1(getCPtr(vecNLEMVExternalAlgorithmResultSPtr), vecNLEMVExternalAlgorithmResultSPtr), true);
    }

    public VecNLEMVExternalAlgorithmResultSPtr(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        this(NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_2(i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult), true);
    }

    private void doAdd(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMVExternalAlgorithmResult doSet(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        long jVecNLEMVExternalAlgorithmResultSPtr_doSet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doSet(this.swigCPtr, this, i, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        if (jVecNLEMVExternalAlgorithmResultSPtr_doSet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jVecNLEMVExternalAlgorithmResultSPtr_doSet, true);
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

    public VecNLEMVExternalAlgorithmResultSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVExternalAlgorithmResult set(int i, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        return doSet(i, nLEMVExternalAlgorithmResult);
    }
}
