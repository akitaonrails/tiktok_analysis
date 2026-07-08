package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEChromaChannelSPtrConst extends AbstractList<NLEChromaChannel> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEChromaChannelSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEChromaChannelSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEChromaChannelSPtrConst(Iterable<NLEChromaChannel> iterable) {
        this();
        Iterator<NLEChromaChannel> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEChromaChannel nLEChromaChannel) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    private NLEChromaChannel doGet(int i) {
        long jVecNLEChromaChannelSPtrConst_doGet = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEChromaChannelSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtrConst_doGet, true);
    }

    private NLEChromaChannel doRemove(int i) {
        long jVecNLEChromaChannelSPtrConst_doRemove = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEChromaChannelSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst) {
        if (vecNLEChromaChannelSPtrConst == null) {
            return 0L;
        }
        return vecNLEChromaChannelSPtrConst.swigCPtr;
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
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEChromaChannelSPtrConst(NLEChromaChannel[] nLEChromaChannelArr) {
        this();
        reserve(nLEChromaChannelArr.length);
        for (NLEChromaChannel nLEChromaChannel : nLEChromaChannelArr) {
            add(nLEChromaChannel);
        }
    }

    public VecNLEChromaChannelSPtrConst(VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtrConst__SWIG_1(getCPtr(vecNLEChromaChannelSPtrConst), vecNLEChromaChannelSPtrConst), true);
    }

    public VecNLEChromaChannelSPtrConst(int i, NLEChromaChannel nLEChromaChannel) {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtrConst__SWIG_2(i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel), true);
    }

    private void doAdd(int i, NLEChromaChannel nLEChromaChannel) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEChromaChannel doSet(int i, NLEChromaChannel nLEChromaChannel) {
        long jVecNLEChromaChannelSPtrConst_doSet = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doSet(this.swigCPtr, this, i, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
        if (jVecNLEChromaChannelSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEChromaChannel(jVecNLEChromaChannelSPtrConst_doSet, true);
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

    public VecNLEChromaChannelSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEChromaChannel set(int i, NLEChromaChannel nLEChromaChannel) {
        return doSet(i, nLEChromaChannel);
    }
}
