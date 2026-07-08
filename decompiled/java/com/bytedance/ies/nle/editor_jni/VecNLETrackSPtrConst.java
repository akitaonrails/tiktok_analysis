package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETrackSPtrConst extends AbstractList<NLETrack> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETrackSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETrackSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETrackSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETrackSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLETrackSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLETrackSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETrackSPtrConst(Iterable<NLETrack> iterable) {
        this();
        Iterator<NLETrack> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETrack nLETrack) {
        NLEEditorJniJNI.VecNLETrackSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    private NLETrack doGet(int i) {
        long jVecNLETrackSPtrConst_doGet = NLEEditorJniJNI.VecNLETrackSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLETrackSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtrConst_doGet, true);
    }

    private NLETrack doRemove(int i) {
        long jVecNLETrackSPtrConst_doRemove = NLEEditorJniJNI.VecNLETrackSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLETrackSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLETrackSPtrConst vecNLETrackSPtrConst) {
        if (vecNLETrackSPtrConst == null) {
            return 0L;
        }
        return vecNLETrackSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETrack nLETrack) {
        ((AbstractList) this).modCount++;
        doAdd(nLETrack);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrack get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrack remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETrackSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETrackSPtrConst(NLETrack[] nLETrackArr) {
        this();
        reserve(nLETrackArr.length);
        for (NLETrack nLETrack : nLETrackArr) {
            add(nLETrack);
        }
    }

    public VecNLETrackSPtrConst(VecNLETrackSPtrConst vecNLETrackSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLETrackSPtrConst__SWIG_1(getCPtr(vecNLETrackSPtrConst), vecNLETrackSPtrConst), true);
    }

    public VecNLETrackSPtrConst(int i, NLETrack nLETrack) {
        this(NLEEditorJniJNI.new_VecNLETrackSPtrConst__SWIG_2(i, NLETrack.getCPtr(nLETrack), nLETrack), true);
    }

    private void doAdd(int i, NLETrack nLETrack) {
        NLEEditorJniJNI.VecNLETrackSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETrackSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETrack doSet(int i, NLETrack nLETrack) {
        long jVecNLETrackSPtrConst_doSet = NLEEditorJniJNI.VecNLETrackSPtrConst_doSet(this.swigCPtr, this, i, NLETrack.getCPtr(nLETrack), nLETrack);
        if (jVecNLETrackSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETrack nLETrack) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETrack);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETrackSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrack set(int i, NLETrack nLETrack) {
        return doSet(i, nLETrack);
    }
}
