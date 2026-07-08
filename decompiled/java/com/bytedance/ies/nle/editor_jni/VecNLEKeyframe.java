package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEKeyframe extends AbstractList<NLEKeyframe> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEKeyframe(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEKeyframe_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEKeyframe_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEKeyframe_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEKeyframe_isEmpty(this.swigCPtr, this);
    }

    public VecNLEKeyframe() {
        this(NLEEditorJniJNI.new_VecNLEKeyframe__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEKeyframe(Iterable<NLEKeyframe> iterable) {
        this();
        Iterator<NLEKeyframe> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEKeyframe nLEKeyframe) {
        NLEEditorJniJNI.VecNLEKeyframe_doAdd__SWIG_0(this.swigCPtr, this, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
    }

    private NLEKeyframe doGet(int i) {
        long jVecNLEKeyframe_doGet = NLEEditorJniJNI.VecNLEKeyframe_doGet(this.swigCPtr, this, i);
        if (jVecNLEKeyframe_doGet == 0) {
            return null;
        }
        return new NLEKeyframe(jVecNLEKeyframe_doGet, true);
    }

    private NLEKeyframe doRemove(int i) {
        long jVecNLEKeyframe_doRemove = NLEEditorJniJNI.VecNLEKeyframe_doRemove(this.swigCPtr, this, i);
        if (jVecNLEKeyframe_doRemove == 0) {
            return null;
        }
        return new NLEKeyframe(jVecNLEKeyframe_doRemove, true);
    }

    public static long getCPtr(VecNLEKeyframe vecNLEKeyframe) {
        if (vecNLEKeyframe == null) {
            return 0L;
        }
        return vecNLEKeyframe.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEKeyframe nLEKeyframe) {
        ((AbstractList) this).modCount++;
        doAdd(nLEKeyframe);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframe get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframe remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEKeyframe_reserve(this.swigCPtr, this, j);
    }

    public VecNLEKeyframe(NLEKeyframe[] nLEKeyframeArr) {
        this();
        reserve(nLEKeyframeArr.length);
        for (NLEKeyframe nLEKeyframe : nLEKeyframeArr) {
            add(nLEKeyframe);
        }
    }

    public VecNLEKeyframe(VecNLEKeyframe vecNLEKeyframe) {
        this(NLEEditorJniJNI.new_VecNLEKeyframe__SWIG_1(getCPtr(vecNLEKeyframe), vecNLEKeyframe), true);
    }

    public VecNLEKeyframe(int i, NLEKeyframe nLEKeyframe) {
        this(NLEEditorJniJNI.new_VecNLEKeyframe__SWIG_2(i, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe), true);
    }

    private void doAdd(int i, NLEKeyframe nLEKeyframe) {
        NLEEditorJniJNI.VecNLEKeyframe_doAdd__SWIG_1(this.swigCPtr, this, i, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEKeyframe_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEKeyframe doSet(int i, NLEKeyframe nLEKeyframe) {
        long jVecNLEKeyframe_doSet = NLEEditorJniJNI.VecNLEKeyframe_doSet(this.swigCPtr, this, i, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
        if (jVecNLEKeyframe_doSet == 0) {
            return null;
        }
        return new NLEKeyframe(jVecNLEKeyframe_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEKeyframe nLEKeyframe) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEKeyframe);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEKeyframe(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEKeyframe set(int i, NLEKeyframe nLEKeyframe) {
        return doSet(i, nLEKeyframe);
    }
}
