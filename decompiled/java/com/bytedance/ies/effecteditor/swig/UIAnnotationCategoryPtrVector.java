package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationCategoryPtrVector extends AbstractList<UIAnnotationCategory> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationCategoryPtrVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectEditorJniJNI.UIAnnotationCategoryPtrVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectEditorJniJNI.UIAnnotationCategoryPtrVector_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectEditorJniJNI.UIAnnotationCategoryPtrVector_isEmpty(this.swigCPtr, this);
    }

    public UIAnnotationCategoryPtrVector() {
        this(EffectEditorJniJNI.new_UIAnnotationCategoryPtrVector__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public UIAnnotationCategoryPtrVector(Iterable<UIAnnotationCategory> iterable) {
        this();
        Iterator<UIAnnotationCategory> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(UIAnnotationCategory uIAnnotationCategory) {
        EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doAdd__SWIG_0(this.swigCPtr, this, UIAnnotationCategory.getCPtr(uIAnnotationCategory), uIAnnotationCategory);
    }

    private UIAnnotationCategory doGet(int i) {
        long jUIAnnotationCategoryPtrVector_doGet = EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doGet(this.swigCPtr, this, i);
        if (jUIAnnotationCategoryPtrVector_doGet == 0) {
            return null;
        }
        return new UIAnnotationCategory(jUIAnnotationCategoryPtrVector_doGet, true);
    }

    private UIAnnotationCategory doRemove(int i) {
        long jUIAnnotationCategoryPtrVector_doRemove = EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doRemove(this.swigCPtr, this, i);
        if (jUIAnnotationCategoryPtrVector_doRemove == 0) {
            return null;
        }
        return new UIAnnotationCategory(jUIAnnotationCategoryPtrVector_doRemove, true);
    }

    public static long getCPtr(UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector) {
        if (uIAnnotationCategoryPtrVector == null) {
            return 0L;
        }
        return uIAnnotationCategoryPtrVector.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(UIAnnotationCategory uIAnnotationCategory) {
        ((AbstractList) this).modCount++;
        doAdd(uIAnnotationCategory);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationCategory get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationCategory remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectEditorJniJNI.UIAnnotationCategoryPtrVector_reserve(this.swigCPtr, this, j);
    }

    public UIAnnotationCategoryPtrVector(UIAnnotationCategory[] uIAnnotationCategoryArr) {
        this();
        reserve(uIAnnotationCategoryArr.length);
        for (UIAnnotationCategory uIAnnotationCategory : uIAnnotationCategoryArr) {
            add(uIAnnotationCategory);
        }
    }

    public UIAnnotationCategoryPtrVector(UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector) {
        this(EffectEditorJniJNI.new_UIAnnotationCategoryPtrVector__SWIG_1(getCPtr(uIAnnotationCategoryPtrVector), uIAnnotationCategoryPtrVector), true);
    }

    public UIAnnotationCategoryPtrVector(int i, UIAnnotationCategory uIAnnotationCategory) {
        this(EffectEditorJniJNI.new_UIAnnotationCategoryPtrVector__SWIG_2(i, UIAnnotationCategory.getCPtr(uIAnnotationCategory), uIAnnotationCategory), true);
    }

    private void doAdd(int i, UIAnnotationCategory uIAnnotationCategory) {
        EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doAdd__SWIG_1(this.swigCPtr, this, i, UIAnnotationCategory.getCPtr(uIAnnotationCategory), uIAnnotationCategory);
    }

    private void doRemoveRange(int i, int i2) {
        EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private UIAnnotationCategory doSet(int i, UIAnnotationCategory uIAnnotationCategory) {
        long jUIAnnotationCategoryPtrVector_doSet = EffectEditorJniJNI.UIAnnotationCategoryPtrVector_doSet(this.swigCPtr, this, i, UIAnnotationCategory.getCPtr(uIAnnotationCategory), uIAnnotationCategory);
        if (jUIAnnotationCategoryPtrVector_doSet == 0) {
            return null;
        }
        return new UIAnnotationCategory(jUIAnnotationCategoryPtrVector_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, UIAnnotationCategory uIAnnotationCategory) {
        ((AbstractList) this).modCount++;
        doAdd(i, uIAnnotationCategory);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public UIAnnotationCategoryPtrVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationCategory set(int i, UIAnnotationCategory uIAnnotationCategory) {
        return doSet(i, uIAnnotationCategory);
    }
}
