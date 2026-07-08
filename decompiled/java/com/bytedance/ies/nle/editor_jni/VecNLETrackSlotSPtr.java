package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETrackSlotSPtr extends AbstractList<NLETrackSlot> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETrackSlotSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETrackSlotSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLETrackSlotSPtr() {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETrackSlotSPtr(Iterable<NLETrackSlot> iterable) {
        this();
        Iterator<NLETrackSlot> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    private NLETrackSlot doGet(int i) {
        long jVecNLETrackSlotSPtr_doGet = NLEEditorJniJNI.VecNLETrackSlotSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLETrackSlotSPtr_doGet == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtr_doGet, true);
    }

    private NLETrackSlot doRemove(int i) {
        long jVecNLETrackSlotSPtr_doRemove = NLEEditorJniJNI.VecNLETrackSlotSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLETrackSlotSPtr_doRemove == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        if (vecNLETrackSlotSPtr == null) {
            return 0L;
        }
        return vecNLETrackSlotSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLETrackSlotSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETrackSlotSPtr(NLETrackSlot[] nLETrackSlotArr) {
        this();
        reserve(nLETrackSlotArr.length);
        for (NLETrackSlot nLETrackSlot : nLETrackSlotArr) {
            add(nLETrackSlot);
        }
    }

    public VecNLETrackSlotSPtr(VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtr__SWIG_1(getCPtr(vecNLETrackSlotSPtr), vecNLETrackSlotSPtr), true);
    }

    public VecNLETrackSlotSPtr(int i, NLETrackSlot nLETrackSlot) {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtr__SWIG_2(i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    private void doAdd(int i, NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETrackSlot doSet(int i, NLETrackSlot nLETrackSlot) {
        long jVecNLETrackSlotSPtr_doSet = NLEEditorJniJNI.VecNLETrackSlotSPtr_doSet(this.swigCPtr, this, i, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
        if (jVecNLETrackSlotSPtr_doSet == 0) {
            return null;
        }
        return new NLETrackSlot(jVecNLETrackSlotSPtr_doSet, true);
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

    public VecNLETrackSlotSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackSlot set(int i, NLETrackSlot nLETrackSlot) {
        return doSet(i, nLETrackSlot);
    }
}
