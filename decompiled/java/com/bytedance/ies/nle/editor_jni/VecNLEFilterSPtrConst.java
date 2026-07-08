package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEFilterSPtrConst extends AbstractList<NLEFilter> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEFilterSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEFilterSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEFilterSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEFilterSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEFilterSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEFilterSPtrConst(Iterable<NLEFilter> iterable) {
        this();
        Iterator<NLEFilter> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEFilter nLEFilter) {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    private NLEFilter doGet(int i) {
        long jVecNLEFilterSPtrConst_doGet = NLEEditorJniJNI.VecNLEFilterSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEFilterSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtrConst_doGet, true);
    }

    private NLEFilter doRemove(int i) {
        long jVecNLEFilterSPtrConst_doRemove = NLEEditorJniJNI.VecNLEFilterSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEFilterSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEFilterSPtrConst vecNLEFilterSPtrConst) {
        if (vecNLEFilterSPtrConst == null) {
            return 0L;
        }
        return vecNLEFilterSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEFilter nLEFilter) {
        ((AbstractList) this).modCount++;
        doAdd(nLEFilter);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEFilter get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEFilter remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEFilterSPtrConst(NLEFilter[] nLEFilterArr) {
        this();
        reserve(nLEFilterArr.length);
        for (NLEFilter nLEFilter : nLEFilterArr) {
            add(nLEFilter);
        }
    }

    public VecNLEFilterSPtrConst(VecNLEFilterSPtrConst vecNLEFilterSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtrConst__SWIG_1(getCPtr(vecNLEFilterSPtrConst), vecNLEFilterSPtrConst), true);
    }

    public VecNLEFilterSPtrConst(int i, NLEFilter nLEFilter) {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtrConst__SWIG_2(i, NLEFilter.getCPtr(nLEFilter), nLEFilter), true);
    }

    private void doAdd(int i, NLEFilter nLEFilter) {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEFilter doSet(int i, NLEFilter nLEFilter) {
        long jVecNLEFilterSPtrConst_doSet = NLEEditorJniJNI.VecNLEFilterSPtrConst_doSet(this.swigCPtr, this, i, NLEFilter.getCPtr(nLEFilter), nLEFilter);
        if (jVecNLEFilterSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEFilter nLEFilter) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEFilter);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEFilterSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEFilter set(int i, NLEFilter nLEFilter) {
        return doSet(i, nLEFilter);
    }
}
