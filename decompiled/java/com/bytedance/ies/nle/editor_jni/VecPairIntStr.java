package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecPairIntStr extends AbstractList<PairIntStr> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_VecPairIntStr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLETemplateJNI.VecPairIntStr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLETemplateJNI.VecPairIntStr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLETemplateJNI.VecPairIntStr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLETemplateJNI.VecPairIntStr_isEmpty(this.swigCPtr, this);
    }

    public VecPairIntStr() {
        this(NLETemplateJNI.new_VecPairIntStr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecPairIntStr(Iterable<PairIntStr> iterable) {
        this();
        Iterator<PairIntStr> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(PairIntStr pairIntStr) {
        NLETemplateJNI.VecPairIntStr_doAdd__SWIG_0(this.swigCPtr, this, PairIntStr.getCPtr(pairIntStr), pairIntStr);
    }

    private PairIntStr doGet(int i) {
        return new PairIntStr(NLETemplateJNI.VecPairIntStr_doGet(this.swigCPtr, this, i), false);
    }

    private PairIntStr doRemove(int i) {
        return new PairIntStr(NLETemplateJNI.VecPairIntStr_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecPairIntStr vecPairIntStr) {
        if (vecPairIntStr == null) {
            return 0L;
        }
        return vecPairIntStr.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(PairIntStr pairIntStr) {
        ((AbstractList) this).modCount++;
        doAdd(pairIntStr);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairIntStr get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public PairIntStr remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLETemplateJNI.VecPairIntStr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecPairIntStr(PairIntStr[] pairIntStrArr) {
        this();
        reserve(pairIntStrArr.length);
        for (PairIntStr pairIntStr : pairIntStrArr) {
            add(pairIntStr);
        }
    }

    public VecPairIntStr(VecPairIntStr vecPairIntStr) {
        this(NLETemplateJNI.new_VecPairIntStr__SWIG_1(getCPtr(vecPairIntStr), vecPairIntStr), true);
    }

    public VecPairIntStr(int i, PairIntStr pairIntStr) {
        this(NLETemplateJNI.new_VecPairIntStr__SWIG_2(i, PairIntStr.getCPtr(pairIntStr), pairIntStr), true);
    }

    private void doAdd(int i, PairIntStr pairIntStr) {
        NLETemplateJNI.VecPairIntStr_doAdd__SWIG_1(this.swigCPtr, this, i, PairIntStr.getCPtr(pairIntStr), pairIntStr);
    }

    private void doRemoveRange(int i, int i2) {
        NLETemplateJNI.VecPairIntStr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private PairIntStr doSet(int i, PairIntStr pairIntStr) {
        return new PairIntStr(NLETemplateJNI.VecPairIntStr_doSet(this.swigCPtr, this, i, PairIntStr.getCPtr(pairIntStr), pairIntStr), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, PairIntStr pairIntStr) {
        ((AbstractList) this).modCount++;
        doAdd(i, pairIntStr);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecPairIntStr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairIntStr set(int i, PairIntStr pairIntStr) {
        return doSet(i, pairIntStr);
    }
}
