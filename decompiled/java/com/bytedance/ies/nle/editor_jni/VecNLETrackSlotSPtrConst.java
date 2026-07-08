package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETrackSlotSPtrConst extends AbstractList<NLETrackSlot> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETrackSlotSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLETrackSlotSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETrackSlotSPtrConst(Iterable<NLETrackSlot> iterable) {
        this();
        Iterator<NLETrackSlot> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    private NLETrackSlot doGet(int i) {
        long jVecNLETrackSlotSPtrConst_doGet = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLETrackSlotSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtrConst_doGet, true);
    }

    private NLETrackSlot doRemove(int i) {
        long jVecNLETrackSlotSPtrConst_doRemove = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLETrackSlotSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst) {
        if (vecNLETrackSlotSPtrConst == null) {
            return 0L;
        }
        return vecNLETrackSlotSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETrackSlot nLETrackSlot) {
        ((AbstractList) this).modCount++;
        doAdd(nLETrackSlot);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackSlot get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackSlot remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETrackSlotSPtrConst(NLETrackSlot[] nLETrackSlotArr) {
        this();
        reserve(nLETrackSlotArr.length);
        for (NLETrackSlot nLETrackSlot : nLETrackSlotArr) {
            add(nLETrackSlot);
        }
    }

    public VecNLETrackSlotSPtrConst(VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtrConst__SWIG_1(getCPtr(vecNLETrackSlotSPtrConst), vecNLETrackSlotSPtrConst), true);
    }

    public VecNLETrackSlotSPtrConst(int i, NLETrackSlot nLETrackSlot) {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtrConst__SWIG_2(i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    private void doAdd(int i, NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETrackSlot doSet(int i, NLETrackSlot nLETrackSlot) {
        long jVecNLETrackSlotSPtrConst_doSet = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doSet(this.swigCPtr, this, i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
        if (jVecNLETrackSlotSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETrackSlot nLETrackSlot) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETrackSlot);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETrackSlotSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackSlot set(int i, NLETrackSlot nLETrackSlot) {
        return doSet(i, nLETrackSlot);
    }
}
