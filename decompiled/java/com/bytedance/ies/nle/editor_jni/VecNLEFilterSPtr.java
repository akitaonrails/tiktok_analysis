package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEFilterSPtr extends AbstractList<NLEFilter> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEFilterSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEFilterSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEFilterSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEFilterSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEFilterSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEFilterSPtr() {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEFilterSPtr(Iterable<NLEFilter> iterable) {
        this();
        Iterator<NLEFilter> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEFilter nLEFilter) {
        NLEEditorJniJNI.VecNLEFilterSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    private NLEFilter doGet(int i) {
        long jVecNLEFilterSPtr_doGet = NLEEditorJniJNI.VecNLEFilterSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEFilterSPtr_doGet == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtr_doGet, true);
    }

    private NLEFilter doRemove(int i) {
        long jVecNLEFilterSPtr_doRemove = NLEEditorJniJNI.VecNLEFilterSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEFilterSPtr_doRemove == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEFilterSPtr vecNLEFilterSPtr) {
        if (vecNLEFilterSPtr == null) {
            return 0L;
        }
        return vecNLEFilterSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLEFilterSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEFilterSPtr(NLEFilter[] nLEFilterArr) {
        this();
        reserve(nLEFilterArr.length);
        for (NLEFilter nLEFilter : nLEFilterArr) {
            add(nLEFilter);
        }
    }

    public VecNLEFilterSPtr(VecNLEFilterSPtr vecNLEFilterSPtr) {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtr__SWIG_1(getCPtr(vecNLEFilterSPtr), vecNLEFilterSPtr), true);
    }

    public VecNLEFilterSPtr(int i, NLEFilter nLEFilter) {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtr__SWIG_2(i, NLEFilter.getCPtr(nLEFilter), nLEFilter), true);
    }

    private void doAdd(int i, NLEFilter nLEFilter) {
        NLEEditorJniJNI.VecNLEFilterSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEFilterSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEFilter doSet(int i, NLEFilter nLEFilter) {
        long jVecNLEFilterSPtr_doSet = NLEEditorJniJNI.VecNLEFilterSPtr_doSet(this.swigCPtr, this, i, NLEFilter.getCPtr(nLEFilter), nLEFilter);
        if (jVecNLEFilterSPtr_doSet == 0) {
            return null;
        }
        return new NLEFilter(jVecNLEFilterSPtr_doSet, true);
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

    public VecNLEFilterSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEFilter set(int i, NLEFilter nLEFilter) {
        return doSet(i, nLEFilter);
    }
}
