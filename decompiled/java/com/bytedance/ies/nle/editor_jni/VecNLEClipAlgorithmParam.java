package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLEClipAlgorithmParam extends AbstractList<NLEClipAlgorithmParam> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLEClipAlgorithmParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLEClipAlgorithmParam_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLEClipAlgorithmParam_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEClipAlgorithmParam_isEmpty(this.swigCPtr, this);
    }

    public VecNLEClipAlgorithmParam() {
        this(NLEMediaJniJNI.new_VecNLEClipAlgorithmParam__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEClipAlgorithmParam(Iterable<NLEClipAlgorithmParam> iterable) {
        this();
        Iterator<NLEClipAlgorithmParam> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doAdd__SWIG_0(this.swigCPtr, this, NLEClipAlgorithmParam.getCPtr(nLEClipAlgorithmParam), nLEClipAlgorithmParam);
    }

    private NLEClipAlgorithmParam doGet(int i) {
        long jVecNLEClipAlgorithmParam_doGet = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doGet(this.swigCPtr, this, i);
        if (jVecNLEClipAlgorithmParam_doGet == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(jVecNLEClipAlgorithmParam_doGet, true);
    }

    private NLEClipAlgorithmParam doRemove(int i) {
        long jVecNLEClipAlgorithmParam_doRemove = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doRemove(this.swigCPtr, this, i);
        if (jVecNLEClipAlgorithmParam_doRemove == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(jVecNLEClipAlgorithmParam_doRemove, true);
    }

    public static long getCPtr(VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam) {
        if (vecNLEClipAlgorithmParam == null) {
            return 0L;
        }
        return vecNLEClipAlgorithmParam.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        ((AbstractList) this).modCount++;
        doAdd(nLEClipAlgorithmParam);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEClipAlgorithmParam get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEClipAlgorithmParam remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_reserve(this.swigCPtr, this, j);
    }

    public VecNLEClipAlgorithmParam(NLEClipAlgorithmParam[] nLEClipAlgorithmParamArr) {
        this();
        reserve(nLEClipAlgorithmParamArr.length);
        for (NLEClipAlgorithmParam nLEClipAlgorithmParam : nLEClipAlgorithmParamArr) {
            add(nLEClipAlgorithmParam);
        }
    }

    public VecNLEClipAlgorithmParam(VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam) {
        this(NLEMediaJniJNI.new_VecNLEClipAlgorithmParam__SWIG_1(getCPtr(vecNLEClipAlgorithmParam), vecNLEClipAlgorithmParam), true);
    }

    public VecNLEClipAlgorithmParam(int i, NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        this(NLEMediaJniJNI.new_VecNLEClipAlgorithmParam__SWIG_2(i, NLEClipAlgorithmParam.getCPtr(nLEClipAlgorithmParam), nLEClipAlgorithmParam), true);
    }

    private void doAdd(int i, NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doAdd__SWIG_1(this.swigCPtr, this, i, NLEClipAlgorithmParam.getCPtr(nLEClipAlgorithmParam), nLEClipAlgorithmParam);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEClipAlgorithmParam doSet(int i, NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        long jVecNLEClipAlgorithmParam_doSet = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doSet(this.swigCPtr, this, i, NLEClipAlgorithmParam.getCPtr(nLEClipAlgorithmParam), nLEClipAlgorithmParam);
        if (jVecNLEClipAlgorithmParam_doSet == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(jVecNLEClipAlgorithmParam_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEClipAlgorithmParam);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEClipAlgorithmParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEClipAlgorithmParam set(int i, NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        return doSet(i, nLEClipAlgorithmParam);
    }
}
