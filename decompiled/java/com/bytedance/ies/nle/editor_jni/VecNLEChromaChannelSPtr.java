package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEChromaChannelSPtr extends AbstractList<NLEChromaChannel> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEChromaChannelSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEChromaChannelSPtr() {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEChromaChannelSPtr(Iterable<NLEChromaChannel> iterable) {
        this();
        Iterator<NLEChromaChannel> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEChromaChannel nLEChromaChannel) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    private NLEChromaChannel doGet(int i) {
        long jVecNLEChromaChannelSPtr_doGet = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEChromaChannelSPtr_doGet == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtr_doGet, true);
    }

    private NLEChromaChannel doRemove(int i) {
        long jVecNLEChromaChannelSPtr_doRemove = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEChromaChannelSPtr_doRemove == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr) {
        if (vecNLEChromaChannelSPtr == null) {
            return 0L;
        }
        return vecNLEChromaChannelSPtr.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEChromaChannel nLEChromaChannel) {
        ((AbstractList) this).modCount++;
        doAdd(nLEChromaChannel);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEChromaChannel get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEChromaChannel remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEChromaChannelSPtr(NLEChromaChannel[] nLEChromaChannelArr) {
        this();
        reserve(nLEChromaChannelArr.length);
        for (NLEChromaChannel nLEChromaChannel : nLEChromaChannelArr) {
            add(nLEChromaChannel);
        }
    }

    public VecNLEChromaChannelSPtr(VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr) {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtr__SWIG_1(getCPtr(vecNLEChromaChannelSPtr), vecNLEChromaChannelSPtr), true);
    }

    public VecNLEChromaChannelSPtr(int i, NLEChromaChannel nLEChromaChannel) {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtr__SWIG_2(i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel), true);
    }

    private void doAdd(int i, NLEChromaChannel nLEChromaChannel) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEChromaChannel doSet(int i, NLEChromaChannel nLEChromaChannel) {
        long jVecNLEChromaChannelSPtr_doSet = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doSet(this.swigCPtr, this, i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
        if (jVecNLEChromaChannelSPtr_doSet == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtr_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEChromaChannel nLEChromaChannel) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEChromaChannel);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEChromaChannelSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEChromaChannel set(int i, NLEChromaChannel nLEChromaChannel) {
        return doSet(i, nLEChromaChannel);
    }
}
