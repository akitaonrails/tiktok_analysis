package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETextTemplateClipSPtrConst extends AbstractList<NLETextTemplateClip> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETextTemplateClipSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLETextTemplateClipSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETextTemplateClipSPtrConst(Iterable<NLETextTemplateClip> iterable) {
        this();
        Iterator<NLETextTemplateClip> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETextTemplateClip nLETextTemplateClip) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    private NLETextTemplateClip doGet(int i) {
        long jVecNLETextTemplateClipSPtrConst_doGet = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLETextTemplateClipSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtrConst_doGet, true);
    }

    private NLETextTemplateClip doRemove(int i) {
        long jVecNLETextTemplateClipSPtrConst_doRemove = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLETextTemplateClipSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst) {
        if (vecNLETextTemplateClipSPtrConst == null) {
            return 0L;
        }
        return vecNLETextTemplateClipSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETextTemplateClip nLETextTemplateClip) {
        ((AbstractList) this).modCount++;
        doAdd(nLETextTemplateClip);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETextTemplateClipSPtrConst(NLETextTemplateClip[] nLETextTemplateClipArr) {
        this();
        reserve(nLETextTemplateClipArr.length);
        for (NLETextTemplateClip nLETextTemplateClip : nLETextTemplateClipArr) {
            add(nLETextTemplateClip);
        }
    }

    public VecNLETextTemplateClipSPtrConst(VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtrConst__SWIG_1(getCPtr(vecNLETextTemplateClipSPtrConst), vecNLETextTemplateClipSPtrConst), true);
    }

    public VecNLETextTemplateClipSPtrConst(int i, NLETextTemplateClip nLETextTemplateClip) {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtrConst__SWIG_2(i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip), true);
    }

    private void doAdd(int i, NLETextTemplateClip nLETextTemplateClip) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETextTemplateClip doSet(int i, NLETextTemplateClip nLETextTemplateClip) {
        long jVecNLETextTemplateClipSPtrConst_doSet = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doSet(this.swigCPtr, this, i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
        if (jVecNLETextTemplateClipSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETextTemplateClip nLETextTemplateClip) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETextTemplateClip);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETextTemplateClipSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip set(int i, NLETextTemplateClip nLETextTemplateClip) {
        return doSet(i, nLETextTemplateClip);
    }
}
