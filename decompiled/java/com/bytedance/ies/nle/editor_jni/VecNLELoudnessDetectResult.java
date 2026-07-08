package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLELoudnessDetectResult extends AbstractList<NLELoudnessDetectResult> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLELoudnessDetectResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLELoudnessDetectResult_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLELoudnessDetectResult_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLELoudnessDetectResult_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLELoudnessDetectResult_isEmpty(this.swigCPtr, this);
    }

    public VecNLELoudnessDetectResult() {
        this(NLEMediaJniJNI.new_VecNLELoudnessDetectResult__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLELoudnessDetectResult(Iterable<NLELoudnessDetectResult> iterable) {
        this();
        Iterator<NLELoudnessDetectResult> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLELoudnessDetectResult nLELoudnessDetectResult) {
        NLEMediaJniJNI.VecNLELoudnessDetectResult_doAdd__SWIG_0(this.swigCPtr, this, NLELoudnessDetectResult.getCPtr(nLELoudnessDetectResult), nLELoudnessDetectResult);
    }

    private NLELoudnessDetectResult doGet(int i) {
        return new NLELoudnessDetectResult(NLEMediaJniJNI.VecNLELoudnessDetectResult_doGet(this.swigCPtr, this, i), false);
    }

    private NLELoudnessDetectResult doRemove(int i) {
        return new NLELoudnessDetectResult(NLEMediaJniJNI.VecNLELoudnessDetectResult_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecNLELoudnessDetectResult vecNLELoudnessDetectResult) {
        if (vecNLELoudnessDetectResult == null) {
            return 0L;
        }
        return vecNLELoudnessDetectResult.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLELoudnessDetectResult nLELoudnessDetectResult) {
        ((AbstractList) this).modCount++;
        doAdd(nLELoudnessDetectResult);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLELoudnessDetectResult get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLELoudnessDetectResult remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLELoudnessDetectResult_reserve(this.swigCPtr, this, j);
    }

    public VecNLELoudnessDetectResult(NLELoudnessDetectResult[] nLELoudnessDetectResultArr) {
        this();
        reserve(nLELoudnessDetectResultArr.length);
        for (NLELoudnessDetectResult nLELoudnessDetectResult : nLELoudnessDetectResultArr) {
            add(nLELoudnessDetectResult);
        }
    }

    public VecNLELoudnessDetectResult(VecNLELoudnessDetectResult vecNLELoudnessDetectResult) {
        this(NLEMediaJniJNI.new_VecNLELoudnessDetectResult__SWIG_1(getCPtr(vecNLELoudnessDetectResult), vecNLELoudnessDetectResult), true);
    }

    public VecNLELoudnessDetectResult(int i, NLELoudnessDetectResult nLELoudnessDetectResult) {
        this(NLEMediaJniJNI.new_VecNLELoudnessDetectResult__SWIG_2(i, NLELoudnessDetectResult.getCPtr(nLELoudnessDetectResult), nLELoudnessDetectResult), true);
    }

    private void doAdd(int i, NLELoudnessDetectResult nLELoudnessDetectResult) {
        NLEMediaJniJNI.VecNLELoudnessDetectResult_doAdd__SWIG_1(this.swigCPtr, this, i, NLELoudnessDetectResult.getCPtr(nLELoudnessDetectResult), nLELoudnessDetectResult);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLELoudnessDetectResult_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLELoudnessDetectResult doSet(int i, NLELoudnessDetectResult nLELoudnessDetectResult) {
        return new NLELoudnessDetectResult(NLEMediaJniJNI.VecNLELoudnessDetectResult_doSet(this.swigCPtr, this, i, NLELoudnessDetectResult.getCPtr(nLELoudnessDetectResult), nLELoudnessDetectResult), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLELoudnessDetectResult nLELoudnessDetectResult) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLELoudnessDetectResult);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLELoudnessDetectResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLELoudnessDetectResult set(int i, NLELoudnessDetectResult nLELoudnessDetectResult) {
        return doSet(i, nLELoudnessDetectResult);
    }
}
