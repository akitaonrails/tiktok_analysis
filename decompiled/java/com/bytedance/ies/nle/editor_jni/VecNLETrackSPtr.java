package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETrackSPtr extends AbstractList<NLETrack> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETrackSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETrackSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETrackSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETrackSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLETrackSPtr() {
        this(NLEEditorJniJNI.new_VecNLETrackSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETrackSPtr(Iterable<NLETrack> iterable) {
        this();
        Iterator<NLETrack> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETrack nLETrack) {
        NLEEditorJniJNI.VecNLETrackSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    private NLETrack doGet(int i) {
        long jVecNLETrackSPtr_doGet = NLEEditorJniJNI.VecNLETrackSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLETrackSPtr_doGet == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtr_doGet, true);
    }

    private NLETrack doRemove(int i) {
        long jVecNLETrackSPtr_doRemove = NLEEditorJniJNI.VecNLETrackSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLETrackSPtr_doRemove == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLETrackSPtr vecNLETrackSPtr) {
        if (vecNLETrackSPtr == null) {
            return 0L;
        }
        return vecNLETrackSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLETrackSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETrackSPtr(NLETrack[] nLETrackArr) {
        this();
        reserve(nLETrackArr.length);
        for (NLETrack nLETrack : nLETrackArr) {
            add(nLETrack);
        }
    }

    public VecNLETrackSPtr(VecNLETrackSPtr vecNLETrackSPtr) {
        this(NLEEditorJniJNI.new_VecNLETrackSPtr__SWIG_1(getCPtr(vecNLETrackSPtr), vecNLETrackSPtr), true);
    }

    public VecNLETrackSPtr(int i, NLETrack nLETrack) {
        this(NLEEditorJniJNI.new_VecNLETrackSPtr__SWIG_2(i, NLETrack.getCPtr(nLETrack), nLETrack), true);
    }

    private void doAdd(int i, NLETrack nLETrack) {
        NLEEditorJniJNI.VecNLETrackSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETrackSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETrack doSet(int i, NLETrack nLETrack) {
        long jVecNLETrackSPtr_doSet = NLEEditorJniJNI.VecNLETrackSPtr_doSet(this.swigCPtr, this, i, NLETrack.getCPtr(nLETrack), nLETrack);
        if (jVecNLETrackSPtr_doSet == 0) {
            return null;
        }
        return new NLETrack(jVecNLETrackSPtr_doSet, true);
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

    public VecNLETrackSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrack set(int i, NLETrack nLETrack) {
        return doSet(i, nLETrack);
    }
}
