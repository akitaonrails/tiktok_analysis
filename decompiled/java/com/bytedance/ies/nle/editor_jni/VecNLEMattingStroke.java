package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEMattingStroke extends AbstractList<NLEMattingStroke> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEMattingStroke(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEMattingStroke_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEMattingStroke_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEMattingStroke_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMattingStroke_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMattingStroke() {
        this(NLEEditorJniJNI.new_VecNLEMattingStroke__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMattingStroke(Iterable<NLEMattingStroke> iterable) {
        this();
        Iterator<NLEMattingStroke> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMattingStroke nLEMattingStroke) {
        NLEEditorJniJNI.VecNLEMattingStroke_doAdd__SWIG_0(this.swigCPtr, this, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke);
    }

    private NLEMattingStroke doGet(int i) {
        long jVecNLEMattingStroke_doGet = NLEEditorJniJNI.VecNLEMattingStroke_doGet(this.swigCPtr, this, i);
        if (jVecNLEMattingStroke_doGet == 0) {
            return null;
        }
        return new NLEMattingStroke(jVecNLEMattingStroke_doGet, true);
    }

    private NLEMattingStroke doRemove(int i) {
        long jVecNLEMattingStroke_doRemove = NLEEditorJniJNI.VecNLEMattingStroke_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMattingStroke_doRemove == 0) {
            return null;
        }
        return new NLEMattingStroke(jVecNLEMattingStroke_doRemove, true);
    }

    public static long getCPtr(VecNLEMattingStroke vecNLEMattingStroke) {
        if (vecNLEMattingStroke == null) {
            return 0L;
        }
        return vecNLEMattingStroke.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEMattingStroke nLEMattingStroke) {
        ((AbstractList) this).modCount++;
        doAdd(nLEMattingStroke);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMattingStroke get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMattingStroke remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEMattingStroke_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEMattingStroke(NLEMattingStroke[] nLEMattingStrokeArr) {
        this();
        reserve(nLEMattingStrokeArr.length);
        for (NLEMattingStroke nLEMattingStroke : nLEMattingStrokeArr) {
            add(nLEMattingStroke);
        }
    }

    public VecNLEMattingStroke(VecNLEMattingStroke vecNLEMattingStroke) {
        this(NLEEditorJniJNI.new_VecNLEMattingStroke__SWIG_1(getCPtr(vecNLEMattingStroke), vecNLEMattingStroke), true);
    }

    public VecNLEMattingStroke(int i, NLEMattingStroke nLEMattingStroke) {
        this(NLEEditorJniJNI.new_VecNLEMattingStroke__SWIG_2(i, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke), true);
    }

    private void doAdd(int i, NLEMattingStroke nLEMattingStroke) {
        NLEEditorJniJNI.VecNLEMattingStroke_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEMattingStroke_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMattingStroke doSet(int i, NLEMattingStroke nLEMattingStroke) {
        long jVecNLEMattingStroke_doSet = NLEEditorJniJNI.VecNLEMattingStroke_doSet(this.swigCPtr, this, i, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke);
        if (jVecNLEMattingStroke_doSet == 0) {
            return null;
        }
        return new NLEMattingStroke(jVecNLEMattingStroke_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEMattingStroke nLEMattingStroke) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEMattingStroke);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEMattingStroke(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMattingStroke set(int i, NLEMattingStroke nLEMattingStroke) {
        return doSet(i, nLEMattingStroke);
    }
}
