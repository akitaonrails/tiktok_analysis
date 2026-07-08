package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLECommonKeyframe extends AbstractList<NLECommonKeyframe> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLECommonKeyframe(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLECommonKeyframe_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLECommonKeyframe_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLECommonKeyframe_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLECommonKeyframe_isEmpty(this.swigCPtr, this);
    }

    public VecNLECommonKeyframe() {
        this(NLEEditorJniJNI.new_VecNLECommonKeyframe__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLECommonKeyframe(Iterable<NLECommonKeyframe> iterable) {
        this();
        Iterator<NLECommonKeyframe> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLECommonKeyframe nLECommonKeyframe) {
        NLEEditorJniJNI.VecNLECommonKeyframe_doAdd__SWIG_0(this.swigCPtr, this, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe);
    }

    private NLECommonKeyframe doGet(int i) {
        long jVecNLECommonKeyframe_doGet = NLEEditorJniJNI.VecNLECommonKeyframe_doGet(this.swigCPtr, this, i);
        if (jVecNLECommonKeyframe_doGet == 0) {
            return null;
        }
        return new NLECommonKeyframe(jVecNLECommonKeyframe_doGet, true);
    }

    private NLECommonKeyframe doRemove(int i) {
        long jVecNLECommonKeyframe_doRemove = NLEEditorJniJNI.VecNLECommonKeyframe_doRemove(this.swigCPtr, this, i);
        if (jVecNLECommonKeyframe_doRemove == 0) {
            return null;
        }
        return new NLECommonKeyframe(jVecNLECommonKeyframe_doRemove, true);
    }

    public static long getCPtr(VecNLECommonKeyframe vecNLECommonKeyframe) {
        if (vecNLECommonKeyframe == null) {
            return 0L;
        }
        return vecNLECommonKeyframe.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLECommonKeyframe nLECommonKeyframe) {
        ((AbstractList) this).modCount++;
        doAdd(nLECommonKeyframe);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECommonKeyframe get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECommonKeyframe remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLECommonKeyframe_reserve(this.swigCPtr, this, j);
    }

    public VecNLECommonKeyframe(NLECommonKeyframe[] nLECommonKeyframeArr) {
        this();
        reserve(nLECommonKeyframeArr.length);
        for (NLECommonKeyframe nLECommonKeyframe : nLECommonKeyframeArr) {
            add(nLECommonKeyframe);
        }
    }

    public VecNLECommonKeyframe(VecNLECommonKeyframe vecNLECommonKeyframe) {
        this(NLEEditorJniJNI.new_VecNLECommonKeyframe__SWIG_1(getCPtr(vecNLECommonKeyframe), vecNLECommonKeyframe), true);
    }

    public VecNLECommonKeyframe(int i, NLECommonKeyframe nLECommonKeyframe) {
        this(NLEEditorJniJNI.new_VecNLECommonKeyframe__SWIG_2(i, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe), true);
    }

    private void doAdd(int i, NLECommonKeyframe nLECommonKeyframe) {
        NLEEditorJniJNI.VecNLECommonKeyframe_doAdd__SWIG_1(this.swigCPtr, this, i, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLECommonKeyframe_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLECommonKeyframe doSet(int i, NLECommonKeyframe nLECommonKeyframe) {
        long jVecNLECommonKeyframe_doSet = NLEEditorJniJNI.VecNLECommonKeyframe_doSet(this.swigCPtr, this, i, NLECommonKeyframe.getCPtr(nLECommonKeyframe), nLECommonKeyframe);
        if (jVecNLECommonKeyframe_doSet == 0) {
            return null;
        }
        return new NLECommonKeyframe(jVecNLECommonKeyframe_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLECommonKeyframe nLECommonKeyframe) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLECommonKeyframe);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLECommonKeyframe(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECommonKeyframe set(int i, NLECommonKeyframe nLECommonKeyframe) {
        return doSet(i, nLECommonKeyframe);
    }
}
