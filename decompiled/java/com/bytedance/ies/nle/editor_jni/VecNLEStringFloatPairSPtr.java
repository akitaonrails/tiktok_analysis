package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEStringFloatPairSPtr extends AbstractList<NLEStringFloatPair> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEStringFloatPairSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEStringFloatPairSPtr() {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEStringFloatPairSPtr(Iterable<NLEStringFloatPair> iterable) {
        this();
        Iterator<NLEStringFloatPair> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    private NLEStringFloatPair doGet(int i) {
        long jVecNLEStringFloatPairSPtr_doGet = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEStringFloatPairSPtr_doGet == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtr_doGet, true);
    }

    private NLEStringFloatPair doRemove(int i) {
        long jVecNLEStringFloatPairSPtr_doRemove = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEStringFloatPairSPtr_doRemove == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr) {
        if (vecNLEStringFloatPairSPtr == null) {
            return 0L;
        }
        return vecNLEStringFloatPairSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEStringFloatPairSPtr(NLEStringFloatPair[] nLEStringFloatPairArr) {
        this();
        reserve(nLEStringFloatPairArr.length);
        for (NLEStringFloatPair nLEStringFloatPair : nLEStringFloatPairArr) {
            add(nLEStringFloatPair);
        }
    }

    public VecNLEStringFloatPairSPtr(VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr) {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtr__SWIG_1(getCPtr(vecNLEStringFloatPairSPtr), vecNLEStringFloatPairSPtr), true);
    }

    public VecNLEStringFloatPairSPtr(int i, NLEStringFloatPair nLEStringFloatPair) {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtr__SWIG_2(i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair), true);
    }

    private void doAdd(int i, NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEStringFloatPair doSet(int i, NLEStringFloatPair nLEStringFloatPair) {
        long jVecNLEStringFloatPairSPtr_doSet = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doSet(this.swigCPtr, this, i, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
        if (jVecNLEStringFloatPairSPtr_doSet == 0) {
            return null;
        }
        return new NLEStringFloatPair(jVecNLEStringFloatPairSPtr_doSet, true);
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

    public VecNLEStringFloatPairSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStringFloatPair set(int i, NLEStringFloatPair nLEStringFloatPair) {
        return doSet(i, nLEStringFloatPair);
    }
}
