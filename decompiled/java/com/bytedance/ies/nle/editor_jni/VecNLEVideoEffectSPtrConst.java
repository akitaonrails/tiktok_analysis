package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEVideoEffectSPtrConst extends AbstractList<NLEVideoEffect> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEVideoEffectSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEVideoEffectSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEVideoEffectSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEVideoEffectSPtrConst(Iterable<NLEVideoEffect> iterable) {
        this();
        Iterator<NLEVideoEffect> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEVideoEffect nLEVideoEffect) {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect);
    }

    private NLEVideoEffect doGet(int i) {
        long jVecNLEVideoEffectSPtrConst_doGet = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEVideoEffectSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEVideoEffect(jVecNLEVideoEffectSPtrConst_doGet, true);
    }

    private NLEVideoEffect doRemove(int i) {
        long jVecNLEVideoEffectSPtrConst_doRemove = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEVideoEffectSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEVideoEffect(jVecNLEVideoEffectSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst) {
        if (vecNLEVideoEffectSPtrConst == null) {
            return 0L;
        }
        return vecNLEVideoEffectSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEVideoEffect nLEVideoEffect) {
        ((AbstractList) this).modCount++;
        doAdd(nLEVideoEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoEffect get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoEffect remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEVideoEffectSPtrConst(NLEVideoEffect[] nLEVideoEffectArr) {
        this();
        reserve(nLEVideoEffectArr.length);
        for (NLEVideoEffect nLEVideoEffect : nLEVideoEffectArr) {
            add(nLEVideoEffect);
        }
    }

    public VecNLEVideoEffectSPtrConst(VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEVideoEffectSPtrConst__SWIG_1(getCPtr(vecNLEVideoEffectSPtrConst), vecNLEVideoEffectSPtrConst), true);
    }

    public VecNLEVideoEffectSPtrConst(int i, NLEVideoEffect nLEVideoEffect) {
        this(NLEEditorJniJNI.new_VecNLEVideoEffectSPtrConst__SWIG_2(i, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect), true);
    }

    private void doAdd(int i, NLEVideoEffect nLEVideoEffect) {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEVideoEffect doSet(int i, NLEVideoEffect nLEVideoEffect) {
        long jVecNLEVideoEffectSPtrConst_doSet = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doSet(this.swigCPtr, this, i, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect);
        if (jVecNLEVideoEffectSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEVideoEffect(jVecNLEVideoEffectSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEVideoEffect nLEVideoEffect) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEVideoEffect);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEVideoEffectSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEVideoEffect set(int i, NLEVideoEffect nLEVideoEffect) {
        return doSet(i, nLEVideoEffect);
    }
}
