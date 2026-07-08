package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationBasePtrVector extends AbstractList<UIAnnotationBase> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationBasePtrVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectEditorJniJNI.UIAnnotationBasePtrVector_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectEditorJniJNI.UIAnnotationBasePtrVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectEditorJniJNI.UIAnnotationBasePtrVector_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectEditorJniJNI.UIAnnotationBasePtrVector_isEmpty(this.swigCPtr, this);
    }

    public UIAnnotationBasePtrVector() {
        this(EffectEditorJniJNI.new_UIAnnotationBasePtrVector__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public UIAnnotationBasePtrVector(Iterable<UIAnnotationBase> iterable) {
        this();
        Iterator<UIAnnotationBase> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(UIAnnotationBase uIAnnotationBase) {
        EffectEditorJniJNI.UIAnnotationBasePtrVector_doAdd__SWIG_0(this.swigCPtr, this, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
    }

    private UIAnnotationBase doGet(int i) {
        long jUIAnnotationBasePtrVector_doGet = EffectEditorJniJNI.UIAnnotationBasePtrVector_doGet(this.swigCPtr, this, i);
        if (jUIAnnotationBasePtrVector_doGet == 0) {
            return null;
        }
        return new UIAnnotationBase(jUIAnnotationBasePtrVector_doGet, true);
    }

    private UIAnnotationBase doRemove(int i) {
        long jUIAnnotationBasePtrVector_doRemove = EffectEditorJniJNI.UIAnnotationBasePtrVector_doRemove(this.swigCPtr, this, i);
        if (jUIAnnotationBasePtrVector_doRemove == 0) {
            return null;
        }
        return new UIAnnotationBase(jUIAnnotationBasePtrVector_doRemove, true);
    }

    public static long getCPtr(UIAnnotationBasePtrVector uIAnnotationBasePtrVector) {
        if (uIAnnotationBasePtrVector == null) {
            return 0L;
        }
        return uIAnnotationBasePtrVector.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(UIAnnotationBase uIAnnotationBase) {
        ((AbstractList) this).modCount++;
        doAdd(uIAnnotationBase);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectEditorJniJNI.UIAnnotationBasePtrVector_reserve(this.swigCPtr, this, j);
    }

    public UIAnnotationBasePtrVector(UIAnnotationBase[] uIAnnotationBaseArr) {
        this();
        reserve(uIAnnotationBaseArr.length);
        for (UIAnnotationBase uIAnnotationBase : uIAnnotationBaseArr) {
            add(uIAnnotationBase);
        }
    }

    public UIAnnotationBasePtrVector(UIAnnotationBasePtrVector uIAnnotationBasePtrVector) {
        this(EffectEditorJniJNI.new_UIAnnotationBasePtrVector__SWIG_1(getCPtr(uIAnnotationBasePtrVector), uIAnnotationBasePtrVector), true);
    }

    public UIAnnotationBasePtrVector(int i, UIAnnotationBase uIAnnotationBase) {
        this(EffectEditorJniJNI.new_UIAnnotationBasePtrVector__SWIG_2(i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase), true);
    }

    private void doAdd(int i, UIAnnotationBase uIAnnotationBase) {
        EffectEditorJniJNI.UIAnnotationBasePtrVector_doAdd__SWIG_1(this.swigCPtr, this, i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
    }

    private void doRemoveRange(int i, int i2) {
        EffectEditorJniJNI.UIAnnotationBasePtrVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private UIAnnotationBase doSet(int i, UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationBasePtrVector_doSet = EffectEditorJniJNI.UIAnnotationBasePtrVector_doSet(this.swigCPtr, this, i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationBasePtrVector_doSet == 0) {
            return null;
        }
        return new UIAnnotationBase(jUIAnnotationBasePtrVector_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, UIAnnotationBase uIAnnotationBase) {
        ((AbstractList) this).modCount++;
        doAdd(i, uIAnnotationBase);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public UIAnnotationBasePtrVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase set(int i, UIAnnotationBase uIAnnotationBase) {
        return doSet(i, uIAnnotationBase);
    }
}
