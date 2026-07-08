package com.ss.ugc.android.davinciresource.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecPairStringString extends AbstractList<PairStringString> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_VecPairStringString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return DavinciResourceJniJNI.VecPairStringString_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return DavinciResourceJniJNI.VecPairStringString_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DavinciResourceJniJNI.VecPairStringString_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return DavinciResourceJniJNI.VecPairStringString_isEmpty(this.swigCPtr, this);
    }

    public VecPairStringString() {
        this(DavinciResourceJniJNI.new_VecPairStringString__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecPairStringString(Iterable<PairStringString> iterable) {
        this();
        Iterator<PairStringString> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(PairStringString pairStringString) {
        DavinciResourceJniJNI.VecPairStringString_doAdd__SWIG_0(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString);
    }

    private PairStringString doGet(int i) {
        return new PairStringString(DavinciResourceJniJNI.VecPairStringString_doGet(this.swigCPtr, this, i), false);
    }

    private PairStringString doRemove(int i) {
        return new PairStringString(DavinciResourceJniJNI.VecPairStringString_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecPairStringString vecPairStringString) {
        if (vecPairStringString == null) {
            return 0L;
        }
        return vecPairStringString.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(PairStringString pairStringString) {
        ((AbstractList) this).modCount++;
        doAdd(pairStringString);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStringString get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStringString remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        DavinciResourceJniJNI.VecPairStringString_reserve(this.swigCPtr, this, j);
    }

    public VecPairStringString(PairStringString[] pairStringStringArr) {
        this();
        reserve(pairStringStringArr.length);
        for (PairStringString pairStringString : pairStringStringArr) {
            add(pairStringString);
        }
    }

    public VecPairStringString(VecPairStringString vecPairStringString) {
        this(DavinciResourceJniJNI.new_VecPairStringString__SWIG_1(getCPtr(vecPairStringString), vecPairStringString), true);
    }

    public VecPairStringString(int i, PairStringString pairStringString) {
        this(DavinciResourceJniJNI.new_VecPairStringString__SWIG_2(i, PairStringString.getCPtr(pairStringString), pairStringString), true);
    }

    private void doAdd(int i, PairStringString pairStringString) {
        DavinciResourceJniJNI.VecPairStringString_doAdd__SWIG_1(this.swigCPtr, this, i, PairStringString.getCPtr(pairStringString), pairStringString);
    }

    private void doRemoveRange(int i, int i2) {
        DavinciResourceJniJNI.VecPairStringString_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private PairStringString doSet(int i, PairStringString pairStringString) {
        return new PairStringString(DavinciResourceJniJNI.VecPairStringString_doSet(this.swigCPtr, this, i, PairStringString.getCPtr(pairStringString), pairStringString), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, PairStringString pairStringString) {
        ((AbstractList) this).modCount++;
        doAdd(i, pairStringString);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecPairStringString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public PairStringString set(int i, PairStringString pairStringString) {
        return doSet(i, pairStringString);
    }
}
