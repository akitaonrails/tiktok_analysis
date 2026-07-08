package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEVideoAnimationSPtrConst extends AbstractList<NLEVideoAnimation> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEVideoAnimationSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEVideoAnimationSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEVideoAnimationSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEVideoAnimationSPtrConst(Iterable<NLEVideoAnimation> iterable) {
        this();
        Iterator<NLEVideoAnimation> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEVideoAnimation nLEVideoAnimation) {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
    }

    private NLEVideoAnimation doGet(int i) {
        long jVecNLEVideoAnimationSPtrConst_doGet = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEVideoAnimationSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEVideoAnimation(jVecNLEVideoAnimationSPtrConst_doGet, true);
    }

    private NLEVideoAnimation doRemove(int i) {
        long jVecNLEVideoAnimationSPtrConst_doRemove = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEVideoAnimationSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEVideoAnimation(jVecNLEVideoAnimationSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst) {
        if (vecNLEVideoAnimationSPtrConst == null) {
            return 0L;
        }
        return vecNLEVideoAnimationSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEVideoAnimation nLEVideoAnimation) {
        ((AbstractList) this).modCount++;
        doAdd(nLEVideoAnimation);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoAnimation get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoAnimation remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEVideoAnimationSPtrConst(NLEVideoAnimation[] nLEVideoAnimationArr) {
        this();
        reserve(nLEVideoAnimationArr.length);
        for (NLEVideoAnimation nLEVideoAnimation : nLEVideoAnimationArr) {
            add(nLEVideoAnimation);
        }
    }

    public VecNLEVideoAnimationSPtrConst(VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEVideoAnimationSPtrConst__SWIG_1(getCPtr(vecNLEVideoAnimationSPtrConst), vecNLEVideoAnimationSPtrConst), true);
    }

    public VecNLEVideoAnimationSPtrConst(int i, NLEVideoAnimation nLEVideoAnimation) {
        this(NLEEditorJniJNI.new_VecNLEVideoAnimationSPtrConst__SWIG_2(i, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation), true);
    }

    private void doAdd(int i, NLEVideoAnimation nLEVideoAnimation) {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEVideoAnimation doSet(int i, NLEVideoAnimation nLEVideoAnimation) {
        long jVecNLEVideoAnimationSPtrConst_doSet = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doSet(this.swigCPtr, this, i, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
        if (jVecNLEVideoAnimationSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEVideoAnimation(jVecNLEVideoAnimationSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEVideoAnimation nLEVideoAnimation) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEVideoAnimation);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEVideoAnimationSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoAnimation set(int i, NLEVideoAnimation nLEVideoAnimation) {
        return doSet(i, nLEVideoAnimation);
    }
}
