package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEPointSPtr extends AbstractList<NLEPoint> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEPointSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEPointSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEPointSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEPointSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEPointSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEPointSPtr() {
        this(NLEEditorJniJNI.new_VecNLEPointSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEPointSPtr(Iterable<NLEPoint> iterable) {
        this();
        Iterator<NLEPoint> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEPoint nLEPoint) {
        NLEEditorJniJNI.VecNLEPointSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    private NLEPoint doGet(int i) {
        long jVecNLEPointSPtr_doGet = NLEEditorJniJNI.VecNLEPointSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEPointSPtr_doGet == 0) {
            return null;
        }
        return new NLEPoint(jVecNLEPointSPtr_doGet, true);
    }

    private NLEPoint doRemove(int i) {
        long jVecNLEPointSPtr_doRemove = NLEEditorJniJNI.VecNLEPointSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEPointSPtr_doRemove == 0) {
            return null;
        }
        return new NLEPoint(jVecNLEPointSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEPointSPtr vecNLEPointSPtr) {
        if (vecNLEPointSPtr == null) {
            return 0L;
        }
        return vecNLEPointSPtr.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEPoint nLEPoint) {
        ((AbstractList) this).modCount++;
        doAdd(nLEPoint);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEPoint get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEPoint remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEPointSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEPointSPtr(NLEPoint[] nLEPointArr) {
        this();
        reserve(nLEPointArr.length);
        for (NLEPoint nLEPoint : nLEPointArr) {
            add(nLEPoint);
        }
    }

    public VecNLEPointSPtr(VecNLEPointSPtr vecNLEPointSPtr) {
        this(NLEEditorJniJNI.new_VecNLEPointSPtr__SWIG_1(getCPtr(vecNLEPointSPtr), vecNLEPointSPtr), true);
    }

    public VecNLEPointSPtr(int i, NLEPoint nLEPoint) {
        this(NLEEditorJniJNI.new_VecNLEPointSPtr__SWIG_2(i, NLEPoint.getCPtr(nLEPoint), nLEPoint), true);
    }

    private void doAdd(int i, NLEPoint nLEPoint) {
        NLEEditorJniJNI.VecNLEPointSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEPointSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEPoint doSet(int i, NLEPoint nLEPoint) {
        long jVecNLEPointSPtr_doSet = NLEEditorJniJNI.VecNLEPointSPtr_doSet(this.swigCPtr, this, i, NLEPoint.getCPtr(nLEPoint), nLEPoint);
        if (jVecNLEPointSPtr_doSet == 0) {
            return null;
        }
        return new NLEPoint(jVecNLEPointSPtr_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEPoint nLEPoint) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEPoint);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEPointSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEPoint set(int i, NLEPoint nLEPoint) {
        return doSet(i, nLEPoint);
    }
}
