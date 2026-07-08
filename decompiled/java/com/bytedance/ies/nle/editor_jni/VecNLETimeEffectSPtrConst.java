package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETimeEffectSPtrConst extends AbstractList<NLETimeEffect> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETimeEffectSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLETimeEffectSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLETimeEffectSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETimeEffectSPtrConst(Iterable<NLETimeEffect> iterable) {
        this();
        Iterator<NLETimeEffect> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETimeEffect nLETimeEffect) {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLETimeEffect.getCPtr(nLETimeEffect), nLETimeEffect);
    }

    private NLETimeEffect doGet(int i) {
        long jVecNLETimeEffectSPtrConst_doGet = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLETimeEffectSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETimeEffect(jVecNLETimeEffectSPtrConst_doGet, true);
    }

    private NLETimeEffect doRemove(int i) {
        long jVecNLETimeEffectSPtrConst_doRemove = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLETimeEffectSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETimeEffect(jVecNLETimeEffectSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst) {
        if (vecNLETimeEffectSPtrConst == null) {
            return 0L;
        }
        return vecNLETimeEffectSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETimeEffect nLETimeEffect) {
        ((AbstractList) this).modCount++;
        doAdd(nLETimeEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeEffect get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeEffect remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETimeEffectSPtrConst(NLETimeEffect[] nLETimeEffectArr) {
        this();
        reserve(nLETimeEffectArr.length);
        for (NLETimeEffect nLETimeEffect : nLETimeEffectArr) {
            add(nLETimeEffect);
        }
    }

    public VecNLETimeEffectSPtrConst(VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLETimeEffectSPtrConst__SWIG_1(getCPtr(vecNLETimeEffectSPtrConst), vecNLETimeEffectSPtrConst), true);
    }

    public VecNLETimeEffectSPtrConst(int i, NLETimeEffect nLETimeEffect) {
        this(NLEEditorJniJNI.new_VecNLETimeEffectSPtrConst__SWIG_2(i, NLETimeEffect.getCPtr(nLETimeEffect), nLETimeEffect), true);
    }

    private void doAdd(int i, NLETimeEffect nLETimeEffect) {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLETimeEffect.getCPtr(nLETimeEffect), nLETimeEffect);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETimeEffect doSet(int i, NLETimeEffect nLETimeEffect) {
        long jVecNLETimeEffectSPtrConst_doSet = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doSet(this.swigCPtr, this, i, NLETimeEffect.getCPtr(nLETimeEffect), nLETimeEffect);
        if (jVecNLETimeEffectSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETimeEffect(jVecNLETimeEffectSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETimeEffect nLETimeEffect) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETimeEffect);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETimeEffectSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeEffect set(int i, NLETimeEffect nLETimeEffect) {
        return doSet(i, nLETimeEffect);
    }
}
