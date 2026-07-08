package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEBezierCurvesPoint extends AbstractList<NLEBezierCurvesPoint> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEBezierCurvesPoint(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEBezierCurvesPoint_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEBezierCurvesPoint_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEBezierCurvesPoint_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEBezierCurvesPoint_isEmpty(this.swigCPtr, this);
    }

    public VecNLEBezierCurvesPoint() {
        this(NLEEditorJniJNI.new_VecNLEBezierCurvesPoint__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEBezierCurvesPoint(Iterable<NLEBezierCurvesPoint> iterable) {
        this();
        Iterator<NLEBezierCurvesPoint> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        NLEEditorJniJNI.VecNLEBezierCurvesPoint_doAdd__SWIG_0(this.swigCPtr, this, NLEBezierCurvesPoint.getCPtr(nLEBezierCurvesPoint), nLEBezierCurvesPoint);
    }

    private NLEBezierCurvesPoint doGet(int i) {
        long jVecNLEBezierCurvesPoint_doGet = NLEEditorJniJNI.VecNLEBezierCurvesPoint_doGet(this.swigCPtr, this, i);
        if (jVecNLEBezierCurvesPoint_doGet == 0) {
            return null;
        }
        return new NLEBezierCurvesPoint(jVecNLEBezierCurvesPoint_doGet, true);
    }

    private NLEBezierCurvesPoint doRemove(int i) {
        long jVecNLEBezierCurvesPoint_doRemove = NLEEditorJniJNI.VecNLEBezierCurvesPoint_doRemove(this.swigCPtr, this, i);
        if (jVecNLEBezierCurvesPoint_doRemove == 0) {
            return null;
        }
        return new NLEBezierCurvesPoint(jVecNLEBezierCurvesPoint_doRemove, true);
    }

    public static long getCPtr(VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint) {
        if (vecNLEBezierCurvesPoint == null) {
            return 0L;
        }
        return vecNLEBezierCurvesPoint.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        ((AbstractList) this).modCount++;
        doAdd(nLEBezierCurvesPoint);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBezierCurvesPoint get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBezierCurvesPoint remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEBezierCurvesPoint_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEBezierCurvesPoint(NLEBezierCurvesPoint[] nLEBezierCurvesPointArr) {
        this();
        reserve(nLEBezierCurvesPointArr.length);
        for (NLEBezierCurvesPoint nLEBezierCurvesPoint : nLEBezierCurvesPointArr) {
            add(nLEBezierCurvesPoint);
        }
    }

    public VecNLEBezierCurvesPoint(VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint) {
        this(NLEEditorJniJNI.new_VecNLEBezierCurvesPoint__SWIG_1(getCPtr(vecNLEBezierCurvesPoint), vecNLEBezierCurvesPoint), true);
    }

    public VecNLEBezierCurvesPoint(int i, NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        this(NLEEditorJniJNI.new_VecNLEBezierCurvesPoint__SWIG_2(i, NLEBezierCurvesPoint.getCPtr(nLEBezierCurvesPoint), nLEBezierCurvesPoint), true);
    }

    private void doAdd(int i, NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        NLEEditorJniJNI.VecNLEBezierCurvesPoint_doAdd__SWIG_1(this.swigCPtr, this, i, NLEBezierCurvesPoint.getCPtr(nLEBezierCurvesPoint), nLEBezierCurvesPoint);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEBezierCurvesPoint_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEBezierCurvesPoint doSet(int i, NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        long jVecNLEBezierCurvesPoint_doSet = NLEEditorJniJNI.VecNLEBezierCurvesPoint_doSet(this.swigCPtr, this, i, NLEBezierCurvesPoint.getCPtr(nLEBezierCurvesPoint), nLEBezierCurvesPoint);
        if (jVecNLEBezierCurvesPoint_doSet == 0) {
            return null;
        }
        return new NLEBezierCurvesPoint(jVecNLEBezierCurvesPoint_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEBezierCurvesPoint);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEBezierCurvesPoint(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBezierCurvesPoint set(int i, NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        return doSet(i, nLEBezierCurvesPoint);
    }
}
