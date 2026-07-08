package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEStringFloatPairSPtrConst extends AbstractList<NLEStringFloatPair> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEStringFloatPairSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEStringFloatPairSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEStringFloatPairSPtrConst(Iterable<NLEStringFloatPair> iterable) {
        this();
        Iterator<NLEStringFloatPair> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    private NLEStringFloatPair doGet(int i) {
        long jVecNLEStringFloatPairSPtrConst_doGet = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEStringFloatPairSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtrConst_doGet, true);
    }

    private NLEStringFloatPair doRemove(int i) {
        long jVecNLEStringFloatPairSPtrConst_doRemove = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEStringFloatPairSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst) {
        if (vecNLEStringFloatPairSPtrConst == null) {
            return 0L;
        }
        return vecNLEStringFloatPairSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEStringFloatPair nLEStringFloatPair) {
        ((AbstractList) this).modCount++;
        doAdd(nLEStringFloatPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringFloatPair get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringFloatPair remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEStringFloatPairSPtrConst(NLEStringFloatPair[] nLEStringFloatPairArr) {
        this();
        reserve(nLEStringFloatPairArr.length);
        for (NLEStringFloatPair nLEStringFloatPair : nLEStringFloatPairArr) {
            add(nLEStringFloatPair);
        }
    }

    public VecNLEStringFloatPairSPtrConst(VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtrConst__SWIG_1(getCPtr(vecNLEStringFloatPairSPtrConst), vecNLEStringFloatPairSPtrConst), true);
    }

    public VecNLEStringFloatPairSPtrConst(int i, NLEStringFloatPair nLEStringFloatPair) {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtrConst__SWIG_2(i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair), true);
    }

    private void doAdd(int i, NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEStringFloatPair doSet(int i, NLEStringFloatPair nLEStringFloatPair) {
        long jVecNLEStringFloatPairSPtrConst_doSet = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doSet(this.swigCPtr, this, i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
        if (jVecNLEStringFloatPairSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEStringFloatPair nLEStringFloatPair) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEStringFloatPair);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEStringFloatPairSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringFloatPair set(int i, NLEStringFloatPair nLEStringFloatPair) {
        return doSet(i, nLEStringFloatPair);
    }
}
