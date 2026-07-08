package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLENoiseReductionSPtrConst extends AbstractList<NLENoiseReduction> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLENoiseReductionSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLENoiseReductionSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLENoiseReductionSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLENoiseReductionSPtrConst(Iterable<NLENoiseReduction> iterable) {
        this();
        Iterator<NLENoiseReduction> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLENoiseReduction nLENoiseReduction) {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction);
    }

    private NLENoiseReduction doGet(int i) {
        long jVecNLENoiseReductionSPtrConst_doGet = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLENoiseReductionSPtrConst_doGet == 0) {
            return null;
        }
        return new NLENoiseReduction(jVecNLENoiseReductionSPtrConst_doGet, true);
    }

    private NLENoiseReduction doRemove(int i) {
        long jVecNLENoiseReductionSPtrConst_doRemove = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLENoiseReductionSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLENoiseReduction(jVecNLENoiseReductionSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst) {
        if (vecNLENoiseReductionSPtrConst == null) {
            return 0L;
        }
        return vecNLENoiseReductionSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLENoiseReduction nLENoiseReduction) {
        ((AbstractList) this).modCount++;
        doAdd(nLENoiseReduction);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENoiseReduction get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENoiseReduction remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLENoiseReductionSPtrConst(NLENoiseReduction[] nLENoiseReductionArr) {
        this();
        reserve(nLENoiseReductionArr.length);
        for (NLENoiseReduction nLENoiseReduction : nLENoiseReductionArr) {
            add(nLENoiseReduction);
        }
    }

    public VecNLENoiseReductionSPtrConst(VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLENoiseReductionSPtrConst__SWIG_1(getCPtr(vecNLENoiseReductionSPtrConst), vecNLENoiseReductionSPtrConst), true);
    }

    public VecNLENoiseReductionSPtrConst(int i, NLENoiseReduction nLENoiseReduction) {
        this(NLEEditorJniJNI.new_VecNLENoiseReductionSPtrConst__SWIG_2(i, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction), true);
    }

    private void doAdd(int i, NLENoiseReduction nLENoiseReduction) {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLENoiseReduction doSet(int i, NLENoiseReduction nLENoiseReduction) {
        long jVecNLENoiseReductionSPtrConst_doSet = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doSet(this.swigCPtr, this, i, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction);
        if (jVecNLENoiseReductionSPtrConst_doSet == 0) {
            return null;
        }
        return new NLENoiseReduction(jVecNLENoiseReductionSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLENoiseReduction nLENoiseReduction) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLENoiseReduction);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLENoiseReductionSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENoiseReduction set(int i, NLENoiseReduction nLENoiseReduction) {
        return doSet(i, nLENoiseReduction);
    }
}
