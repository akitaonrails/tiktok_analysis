package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETrackType extends AbstractList<NLETrackType> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETrackType(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETrackType_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETrackType_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETrackType_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackType_isEmpty(this.swigCPtr, this);
    }

    public VecNLETrackType() {
        this(NLEEditorJniJNI.new_VecNLETrackType__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETrackType(Iterable<NLETrackType> iterable) {
        this();
        Iterator<NLETrackType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETrackType nLETrackType) {
        NLEEditorJniJNI.VecNLETrackType_doAdd__SWIG_0(this.swigCPtr, this, nLETrackType.swigValue());
    }

    private NLETrackType doGet(int i) {
        return NLETrackType.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doGet(this.swigCPtr, this, i));
    }

    private NLETrackType doRemove(int i) {
        return NLETrackType.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doRemove(this.swigCPtr, this, i));
    }

    public static long getCPtr(VecNLETrackType vecNLETrackType) {
        if (vecNLETrackType == null) {
            return 0L;
        }
        return vecNLETrackType.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETrackType nLETrackType) {
        ((AbstractList) this).modCount++;
        doAdd(nLETrackType);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackType get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackType remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETrackType_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETrackType(NLETrackType[] nLETrackTypeArr) {
        this();
        reserve(nLETrackTypeArr.length);
        for (NLETrackType nLETrackType : nLETrackTypeArr) {
            add(nLETrackType);
        }
    }

    public VecNLETrackType(VecNLETrackType vecNLETrackType) {
        this(NLEEditorJniJNI.new_VecNLETrackType__SWIG_1(getCPtr(vecNLETrackType), vecNLETrackType), true);
    }

    public VecNLETrackType(int i, NLETrackType nLETrackType) {
        this(NLEEditorJniJNI.new_VecNLETrackType__SWIG_2(i, nLETrackType.swigValue()), true);
    }

    private void doAdd(int i, NLETrackType nLETrackType) {
        NLEEditorJniJNI.VecNLETrackType_doAdd__SWIG_1(this.swigCPtr, this, i, nLETrackType.swigValue());
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETrackType_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETrackType doSet(int i, NLETrackType nLETrackType) {
        return NLETrackType.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doSet(this.swigCPtr, this, i, nLETrackType.swigValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETrackType nLETrackType) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETrackType);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETrackType(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETrackType set(int i, NLETrackType nLETrackType) {
        return doSet(i, nLETrackType);
    }
}
