package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecDouble extends AbstractList<Double> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecDouble(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecDouble_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecDouble_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecDouble_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecDouble_isEmpty(this.swigCPtr, this);
    }

    public VecDouble() {
        this(NLEEditorJniJNI.new_VecDouble__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecDouble(Iterable<Double> iterable) {
        this();
        Iterator<Double> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(Double.valueOf(it2.next().doubleValue()));
        }
    }

    private void doAdd(double d) {
        NLEEditorJniJNI.VecDouble_doAdd__SWIG_0(this.swigCPtr, this, d);
    }

    private double doGet(int i) {
        return NLEEditorJniJNI.VecDouble_doGet(this.swigCPtr, this, i);
    }

    private double doRemove(int i) {
        return NLEEditorJniJNI.VecDouble_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecDouble vecDouble) {
        if (vecDouble == null) {
            return 0L;
        }
        return vecDouble.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d) {
        ((AbstractList) this).modCount++;
        doAdd(d.doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i) {
        return Double.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Double remove(int i) {
        ((AbstractList) this).modCount++;
        return Double.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecDouble_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecDouble(double[] dArr) {
        this();
        reserve(dArr.length);
        for (double d : dArr) {
            add(Double.valueOf(d));
        }
    }

    public VecDouble(VecDouble vecDouble) {
        this(NLEEditorJniJNI.new_VecDouble__SWIG_1(getCPtr(vecDouble), vecDouble), true);
    }

    public VecDouble(int i, double d) {
        this(NLEEditorJniJNI.new_VecDouble__SWIG_2(i, d), true);
    }

    private void doAdd(int i, double d) {
        NLEEditorJniJNI.VecDouble_doAdd__SWIG_1(this.swigCPtr, this, i, d);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecDouble_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private double doSet(int i, double d) {
        return NLEEditorJniJNI.VecDouble_doSet(this.swigCPtr, this, i, d);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Double d) {
        ((AbstractList) this).modCount++;
        doAdd(i, d.doubleValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Double set(int i, Double d) {
        return Double.valueOf(doSet(i, d.doubleValue()));
    }

    public VecDouble(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
