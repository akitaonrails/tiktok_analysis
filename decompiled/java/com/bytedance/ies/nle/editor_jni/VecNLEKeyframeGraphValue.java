package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEKeyframeGraphValue extends AbstractList<NLEKeyframeGraphValue> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEKeyframeGraphValue(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEKeyframeGraphValue_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEKeyframeGraphValue_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEKeyframeGraphValue_isEmpty(this.swigCPtr, this);
    }

    public VecNLEKeyframeGraphValue() {
        this(NLEEditorJniJNI.new_VecNLEKeyframeGraphValue__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEKeyframeGraphValue(Iterable<NLEKeyframeGraphValue> iterable) {
        this();
        Iterator<NLEKeyframeGraphValue> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doAdd__SWIG_0(this.swigCPtr, this, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue);
    }

    private NLEKeyframeGraphValue doGet(int i) {
        long jVecNLEKeyframeGraphValue_doGet = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doGet(this.swigCPtr, this, i);
        if (jVecNLEKeyframeGraphValue_doGet == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(jVecNLEKeyframeGraphValue_doGet, true);
    }

    private NLEKeyframeGraphValue doRemove(int i) {
        long jVecNLEKeyframeGraphValue_doRemove = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doRemove(this.swigCPtr, this, i);
        if (jVecNLEKeyframeGraphValue_doRemove == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(jVecNLEKeyframeGraphValue_doRemove, true);
    }

    public static long getCPtr(VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue) {
        if (vecNLEKeyframeGraphValue == null) {
            return 0L;
        }
        return vecNLEKeyframeGraphValue.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        ((AbstractList) this).modCount++;
        doAdd(nLEKeyframeGraphValue);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframeGraphValue get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframeGraphValue remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEKeyframeGraphValue(NLEKeyframeGraphValue[] nLEKeyframeGraphValueArr) {
        this();
        reserve(nLEKeyframeGraphValueArr.length);
        for (NLEKeyframeGraphValue nLEKeyframeGraphValue : nLEKeyframeGraphValueArr) {
            add(nLEKeyframeGraphValue);
        }
    }

    public VecNLEKeyframeGraphValue(VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue) {
        this(NLEEditorJniJNI.new_VecNLEKeyframeGraphValue__SWIG_1(getCPtr(vecNLEKeyframeGraphValue), vecNLEKeyframeGraphValue), true);
    }

    public VecNLEKeyframeGraphValue(int i, NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        this(NLEEditorJniJNI.new_VecNLEKeyframeGraphValue__SWIG_2(i, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue), true);
    }

    private void doAdd(int i, NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doAdd__SWIG_1(this.swigCPtr, this, i, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEKeyframeGraphValue doSet(int i, NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        long jVecNLEKeyframeGraphValue_doSet = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doSet(this.swigCPtr, this, i, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue);
        if (jVecNLEKeyframeGraphValue_doSet == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(jVecNLEKeyframeGraphValue_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEKeyframeGraphValue);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEKeyframeGraphValue(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframeGraphValue set(int i, NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        return doSet(i, nLEKeyframeGraphValue);
    }
}
