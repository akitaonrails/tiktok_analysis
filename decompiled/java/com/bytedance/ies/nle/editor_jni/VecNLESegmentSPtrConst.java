package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLESegmentSPtrConst extends AbstractList<NLESegment> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLESegmentSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLESegmentSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLESegmentSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLESegmentSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLESegmentSPtrConst(Iterable<NLESegment> iterable) {
        this();
        Iterator<NLESegment> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLESegment nLESegment) {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLESegment.getCPtr(nLESegment), nLESegment);
    }

    private NLESegment doGet(int i) {
        long jVecNLESegmentSPtrConst_doGet = NLEEditorJniJNI.VecNLESegmentSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLESegmentSPtrConst_doGet == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtrConst_doGet, true);
    }

    private NLESegment doRemove(int i) {
        long jVecNLESegmentSPtrConst_doRemove = NLEEditorJniJNI.VecNLESegmentSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLESegmentSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLESegmentSPtrConst vecNLESegmentSPtrConst) {
        if (vecNLESegmentSPtrConst == null) {
            return 0L;
        }
        return vecNLESegmentSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLESegment nLESegment) {
        ((AbstractList) this).modCount++;
        doAdd(nLESegment);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLESegment get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLESegment remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLESegmentSPtrConst(NLESegment[] nLESegmentArr) {
        this();
        reserve(nLESegmentArr.length);
        for (NLESegment nLESegment : nLESegmentArr) {
            add(nLESegment);
        }
    }

    public VecNLESegmentSPtrConst(VecNLESegmentSPtrConst vecNLESegmentSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtrConst__SWIG_1(getCPtr(vecNLESegmentSPtrConst), vecNLESegmentSPtrConst), true);
    }

    public VecNLESegmentSPtrConst(int i, NLESegment nLESegment) {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtrConst__SWIG_2(i, NLESegment.getCPtr(nLESegment), nLESegment), true);
    }

    private void doAdd(int i, NLESegment nLESegment) {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLESegment.getCPtr(nLESegment), nLESegment);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLESegment doSet(int i, NLESegment nLESegment) {
        long jVecNLESegmentSPtrConst_doSet = NLEEditorJniJNI.VecNLESegmentSPtrConst_doSet(this.swigCPtr, this, i, NLESegment.getCPtr(nLESegment), nLESegment);
        if (jVecNLESegmentSPtrConst_doSet == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLESegment nLESegment) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLESegment);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLESegmentSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLESegment set(int i, NLESegment nLESegment) {
        return doSet(i, nLESegment);
    }
}
