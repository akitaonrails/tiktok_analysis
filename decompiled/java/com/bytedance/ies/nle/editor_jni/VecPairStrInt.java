package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecPairStrInt extends AbstractList<PairStrInt> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_VecPairStrInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLETemplateJNI.VecPairStrInt_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLETemplateJNI.VecPairStrInt_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLETemplateJNI.VecPairStrInt_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLETemplateJNI.VecPairStrInt_isEmpty(this.swigCPtr, this);
    }

    public VecPairStrInt() {
        this(NLETemplateJNI.new_VecPairStrInt__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecPairStrInt(Iterable<PairStrInt> iterable) {
        this();
        Iterator<PairStrInt> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(PairStrInt pairStrInt) {
        NLETemplateJNI.VecPairStrInt_doAdd__SWIG_0(this.swigCPtr, this, PairStrInt.getCPtr(pairStrInt), pairStrInt);
    }

    private PairStrInt doGet(int i) {
        return new PairStrInt(NLETemplateJNI.VecPairStrInt_doGet(this.swigCPtr, this, i), false);
    }

    private PairStrInt doRemove(int i) {
        return new PairStrInt(NLETemplateJNI.VecPairStrInt_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecPairStrInt vecPairStrInt) {
        if (vecPairStrInt == null) {
            return 0L;
        }
        return vecPairStrInt.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(PairStrInt pairStrInt) {
        ((AbstractList) this).modCount++;
        doAdd(pairStrInt);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStrInt get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStrInt remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLETemplateJNI.VecPairStrInt_reserve(this.swigCPtr, this, j);
    }

    public VecPairStrInt(PairStrInt[] pairStrIntArr) {
        this();
        reserve(pairStrIntArr.length);
        for (PairStrInt pairStrInt : pairStrIntArr) {
            add(pairStrInt);
        }
    }

    public VecPairStrInt(VecPairStrInt vecPairStrInt) {
        this(NLETemplateJNI.new_VecPairStrInt__SWIG_1(getCPtr(vecPairStrInt), vecPairStrInt), true);
    }

    public VecPairStrInt(int i, PairStrInt pairStrInt) {
        this(NLETemplateJNI.new_VecPairStrInt__SWIG_2(i, PairStrInt.getCPtr(pairStrInt), pairStrInt), true);
    }

    private void doAdd(int i, PairStrInt pairStrInt) {
        NLETemplateJNI.VecPairStrInt_doAdd__SWIG_1(this.swigCPtr, this, i, PairStrInt.getCPtr(pairStrInt), pairStrInt);
    }

    private void doRemoveRange(int i, int i2) {
        NLETemplateJNI.VecPairStrInt_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private PairStrInt doSet(int i, PairStrInt pairStrInt) {
        return new PairStrInt(NLETemplateJNI.VecPairStrInt_doSet(this.swigCPtr, this, i, PairStrInt.getCPtr(pairStrInt), pairStrInt), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, PairStrInt pairStrInt) {
        ((AbstractList) this).modCount++;
        doAdd(i, pairStrInt);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecPairStrInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStrInt set(int i, PairStrInt pairStrInt) {
        return doSet(i, pairStrInt);
    }
}
