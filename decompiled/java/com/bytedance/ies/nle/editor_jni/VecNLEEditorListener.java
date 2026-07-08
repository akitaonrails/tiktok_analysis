package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEEditorListener extends AbstractList<NLEEditorListener> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEEditorListener(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEEditorListener_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEEditorListener_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEEditorListener_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEEditorListener_isEmpty(this.swigCPtr, this);
    }

    public VecNLEEditorListener() {
        this(NLEEditorJniJNI.new_VecNLEEditorListener__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEEditorListener(Iterable<NLEEditorListener> iterable) {
        this();
        Iterator<NLEEditorListener> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEEditorListener nLEEditorListener) {
        NLEEditorJniJNI.VecNLEEditorListener_doAdd__SWIG_0(this.swigCPtr, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    private NLEEditorListener doGet(int i) {
        long jVecNLEEditorListener_doGet = NLEEditorJniJNI.VecNLEEditorListener_doGet(this.swigCPtr, this, i);
        if (jVecNLEEditorListener_doGet == 0) {
            return null;
        }
        return new NLEEditorListener(jVecNLEEditorListener_doGet, true);
    }

    private NLEEditorListener doRemove(int i) {
        long jVecNLEEditorListener_doRemove = NLEEditorJniJNI.VecNLEEditorListener_doRemove(this.swigCPtr, this, i);
        if (jVecNLEEditorListener_doRemove == 0) {
            return null;
        }
        return new NLEEditorListener(jVecNLEEditorListener_doRemove, true);
    }

    public static long getCPtr(VecNLEEditorListener vecNLEEditorListener) {
        if (vecNLEEditorListener == null) {
            return 0L;
        }
        return vecNLEEditorListener.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEEditorListener nLEEditorListener) {
        ((AbstractList) this).modCount++;
        doAdd(nLEEditorListener);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEEditorListener get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEEditorListener remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEEditorListener_reserve(this.swigCPtr, this, j);
    }

    public VecNLEEditorListener(NLEEditorListener[] nLEEditorListenerArr) {
        this();
        reserve(nLEEditorListenerArr.length);
        for (NLEEditorListener nLEEditorListener : nLEEditorListenerArr) {
            add(nLEEditorListener);
        }
    }

    public VecNLEEditorListener(VecNLEEditorListener vecNLEEditorListener) {
        this(NLEEditorJniJNI.new_VecNLEEditorListener__SWIG_1(getCPtr(vecNLEEditorListener), vecNLEEditorListener), true);
    }

    public VecNLEEditorListener(int i, NLEEditorListener nLEEditorListener) {
        this(NLEEditorJniJNI.new_VecNLEEditorListener__SWIG_2(i, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener), true);
    }

    private void doAdd(int i, NLEEditorListener nLEEditorListener) {
        NLEEditorJniJNI.VecNLEEditorListener_doAdd__SWIG_1(this.swigCPtr, this, i, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEEditorListener_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEEditorListener doSet(int i, NLEEditorListener nLEEditorListener) {
        long jVecNLEEditorListener_doSet = NLEEditorJniJNI.VecNLEEditorListener_doSet(this.swigCPtr, this, i, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
        if (jVecNLEEditorListener_doSet == 0) {
            return null;
        }
        return new NLEEditorListener(jVecNLEEditorListener_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEEditorListener nLEEditorListener) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEEditorListener);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEEditorListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEEditorListener set(int i, NLEEditorListener nLEEditorListener) {
        return doSet(i, nLEEditorListener);
    }
}
