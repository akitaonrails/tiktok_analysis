package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLESegmentSPtr extends AbstractList<NLESegment> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLESegmentSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLESegmentSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLESegmentSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLESegmentSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLESegmentSPtr() {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLESegmentSPtr(Iterable<NLESegment> iterable) {
        this();
        Iterator<NLESegment> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLESegment nLESegment) {
        NLEEditorJniJNI.VecNLESegmentSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLESegment.getCPtr(nLESegment), nLESegment);
    }

    private NLESegment doGet(int i) {
        long jVecNLESegmentSPtr_doGet = NLEEditorJniJNI.VecNLESegmentSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLESegmentSPtr_doGet == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtr_doGet, true);
    }

    private NLESegment doRemove(int i) {
        long jVecNLESegmentSPtr_doRemove = NLEEditorJniJNI.VecNLESegmentSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLESegmentSPtr_doRemove == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLESegmentSPtr vecNLESegmentSPtr) {
        if (vecNLESegmentSPtr == null) {
            return 0L;
        }
        return vecNLESegmentSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLESegmentSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLESegmentSPtr(NLESegment[] nLESegmentArr) {
        this();
        reserve(nLESegmentArr.length);
        for (NLESegment nLESegment : nLESegmentArr) {
            add(nLESegment);
        }
    }

    public VecNLESegmentSPtr(VecNLESegmentSPtr vecNLESegmentSPtr) {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtr__SWIG_1(getCPtr(vecNLESegmentSPtr), vecNLESegmentSPtr), true);
    }

    public VecNLESegmentSPtr(int i, NLESegment nLESegment) {
        this(NLEEditorJniJNI.new_VecNLESegmentSPtr__SWIG_2(i, NLESegment.getCPtr(nLESegment), nLESegment), true);
    }

    private void doAdd(int i, NLESegment nLESegment) {
        NLEEditorJniJNI.VecNLESegmentSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLESegment.getCPtr(nLESegment), nLESegment);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLESegmentSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLESegment doSet(int i, NLESegment nLESegment) {
        long jVecNLESegmentSPtr_doSet = NLEEditorJniJNI.VecNLESegmentSPtr_doSet(this.swigCPtr, this, i, NLESegment.getCPtr(nLESegment), nLESegment);
        if (jVecNLESegmentSPtr_doSet == 0) {
            return null;
        }
        return new NLESegment(jVecNLESegmentSPtr_doSet, true);
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

    public VecNLESegmentSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLESegment set(int i, NLESegment nLESegment) {
        return doSet(i, nLESegment);
    }
}
