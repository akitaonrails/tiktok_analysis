package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEStringStringPairSPtrConst extends AbstractList<NLEStringStringPair> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEStringStringPairSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEStringStringPairSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEStringStringPairSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEStringStringPairSPtrConst(Iterable<NLEStringStringPair> iterable) {
        this();
        Iterator<NLEStringStringPair> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEStringStringPair nLEStringStringPair) {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    private NLEStringStringPair doGet(int i) {
        long jVecNLEStringStringPairSPtrConst_doGet = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEStringStringPairSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEStringStringPair(jVecNLEStringStringPairSPtrConst_doGet, true);
    }

    private NLEStringStringPair doRemove(int i) {
        long jVecNLEStringStringPairSPtrConst_doRemove = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEStringStringPairSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEStringStringPair(jVecNLEStringStringPairSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst) {
        if (vecNLEStringStringPairSPtrConst == null) {
            return 0L;
        }
        return vecNLEStringStringPairSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEStringStringPair nLEStringStringPair) {
        ((AbstractList) this).modCount++;
        doAdd(nLEStringStringPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringStringPair get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringStringPair remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEStringStringPairSPtrConst(NLEStringStringPair[] nLEStringStringPairArr) {
        this();
        reserve(nLEStringStringPairArr.length);
        for (NLEStringStringPair nLEStringStringPair : nLEStringStringPairArr) {
            add(nLEStringStringPair);
        }
    }

    public VecNLEStringStringPairSPtrConst(VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEStringStringPairSPtrConst__SWIG_1(getCPtr(vecNLEStringStringPairSPtrConst), vecNLEStringStringPairSPtrConst), true);
    }

    public VecNLEStringStringPairSPtrConst(int i, NLEStringStringPair nLEStringStringPair) {
        this(NLEEditorJniJNI.new_VecNLEStringStringPairSPtrConst__SWIG_2(i, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair), true);
    }

    private void doAdd(int i, NLEStringStringPair nLEStringStringPair) {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEStringStringPair doSet(int i, NLEStringStringPair nLEStringStringPair) {
        long jVecNLEStringStringPairSPtrConst_doSet = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doSet(this.swigCPtr, this, i, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
        if (jVecNLEStringStringPairSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEStringStringPair(jVecNLEStringStringPairSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEStringStringPair nLEStringStringPair) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEStringStringPair);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEStringStringPairSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringStringPair set(int i, NLEStringStringPair nLEStringStringPair) {
        return doSet(i, nLEStringStringPair);
    }
}
