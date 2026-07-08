package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEMaskSPtrConst extends AbstractList<NLEMask> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEMaskSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEMaskSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEMaskSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMaskSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMaskSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEMaskSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMaskSPtrConst(Iterable<NLEMask> iterable) {
        this();
        Iterator<NLEMask> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMask nLEMask) {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEMask.getCPtr(nLEMask), nLEMask);
    }

    private NLEMask doGet(int i) {
        long jVecNLEMaskSPtrConst_doGet = NLEEditorJniJNI.VecNLEMaskSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEMaskSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEMask(jVecNLEMaskSPtrConst_doGet, true);
    }

    private NLEMask doRemove(int i) {
        long jVecNLEMaskSPtrConst_doRemove = NLEEditorJniJNI.VecNLEMaskSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMaskSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEMask(jVecNLEMaskSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEMaskSPtrConst vecNLEMaskSPtrConst) {
        if (vecNLEMaskSPtrConst == null) {
            return 0L;
        }
        return vecNLEMaskSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEMask nLEMask) {
        ((AbstractList) this).modCount++;
        doAdd(nLEMask);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMask get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMask remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEMaskSPtrConst(NLEMask[] nLEMaskArr) {
        this();
        reserve(nLEMaskArr.length);
        for (NLEMask nLEMask : nLEMaskArr) {
            add(nLEMask);
        }
    }

    public VecNLEMaskSPtrConst(VecNLEMaskSPtrConst vecNLEMaskSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEMaskSPtrConst__SWIG_1(getCPtr(vecNLEMaskSPtrConst), vecNLEMaskSPtrConst), true);
    }

    public VecNLEMaskSPtrConst(int i, NLEMask nLEMask) {
        this(NLEEditorJniJNI.new_VecNLEMaskSPtrConst__SWIG_2(i, NLEMask.getCPtr(nLEMask), nLEMask), true);
    }

    private void doAdd(int i, NLEMask nLEMask) {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMask.getCPtr(nLEMask), nLEMask);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMask doSet(int i, NLEMask nLEMask) {
        long jVecNLEMaskSPtrConst_doSet = NLEEditorJniJNI.VecNLEMaskSPtrConst_doSet(this.swigCPtr, this, i, NLEMask.getCPtr(nLEMask), nLEMask);
        if (jVecNLEMaskSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEMask(jVecNLEMaskSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEMask nLEMask) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEMask);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEMaskSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMask set(int i, NLEMask nLEMask) {
        return doSet(i, nLEMask);
    }
}
