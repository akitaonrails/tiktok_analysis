package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationOptionItemVector extends AbstractList<UIAnnotationOptionItem> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationOptionItemVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectEditorJniJNI.UIAnnotationOptionItemVector_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectEditorJniJNI.UIAnnotationOptionItemVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectEditorJniJNI.UIAnnotationOptionItemVector_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectEditorJniJNI.UIAnnotationOptionItemVector_isEmpty(this.swigCPtr, this);
    }

    public UIAnnotationOptionItemVector() {
        this(EffectEditorJniJNI.new_UIAnnotationOptionItemVector__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public UIAnnotationOptionItemVector(Iterable<UIAnnotationOptionItem> iterable) {
        this();
        Iterator<UIAnnotationOptionItem> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(UIAnnotationOptionItem uIAnnotationOptionItem) {
        EffectEditorJniJNI.UIAnnotationOptionItemVector_doAdd__SWIG_0(this.swigCPtr, this, UIAnnotationOptionItem.getCPtr(uIAnnotationOptionItem), uIAnnotationOptionItem);
    }

    private UIAnnotationOptionItem doGet(int i) {
        return new UIAnnotationOptionItem(EffectEditorJniJNI.UIAnnotationOptionItemVector_doGet(this.swigCPtr, this, i), false);
    }

    private UIAnnotationOptionItem doRemove(int i) {
        return new UIAnnotationOptionItem(EffectEditorJniJNI.UIAnnotationOptionItemVector_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(UIAnnotationOptionItemVector uIAnnotationOptionItemVector) {
        if (uIAnnotationOptionItemVector == null) {
            return 0L;
        }
        return uIAnnotationOptionItemVector.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(UIAnnotationOptionItem uIAnnotationOptionItem) {
        ((AbstractList) this).modCount++;
        doAdd(uIAnnotationOptionItem);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationOptionItem get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationOptionItem remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectEditorJniJNI.UIAnnotationOptionItemVector_reserve(this.swigCPtr, this, j);
    }

    public UIAnnotationOptionItemVector(UIAnnotationOptionItem[] uIAnnotationOptionItemArr) {
        this();
        reserve(uIAnnotationOptionItemArr.length);
        for (UIAnnotationOptionItem uIAnnotationOptionItem : uIAnnotationOptionItemArr) {
            add(uIAnnotationOptionItem);
        }
    }

    public UIAnnotationOptionItemVector(UIAnnotationOptionItemVector uIAnnotationOptionItemVector) {
        this(EffectEditorJniJNI.new_UIAnnotationOptionItemVector__SWIG_1(getCPtr(uIAnnotationOptionItemVector), uIAnnotationOptionItemVector), true);
    }

    public UIAnnotationOptionItemVector(int i, UIAnnotationOptionItem uIAnnotationOptionItem) {
        this(EffectEditorJniJNI.new_UIAnnotationOptionItemVector__SWIG_2(i, UIAnnotationOptionItem.getCPtr(uIAnnotationOptionItem), uIAnnotationOptionItem), true);
    }

    private void doAdd(int i, UIAnnotationOptionItem uIAnnotationOptionItem) {
        EffectEditorJniJNI.UIAnnotationOptionItemVector_doAdd__SWIG_1(this.swigCPtr, this, i, UIAnnotationOptionItem.getCPtr(uIAnnotationOptionItem), uIAnnotationOptionItem);
    }

    private void doRemoveRange(int i, int i2) {
        EffectEditorJniJNI.UIAnnotationOptionItemVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private UIAnnotationOptionItem doSet(int i, UIAnnotationOptionItem uIAnnotationOptionItem) {
        return new UIAnnotationOptionItem(EffectEditorJniJNI.UIAnnotationOptionItemVector_doSet(this.swigCPtr, this, i, UIAnnotationOptionItem.getCPtr(uIAnnotationOptionItem), uIAnnotationOptionItem), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, UIAnnotationOptionItem uIAnnotationOptionItem) {
        ((AbstractList) this).modCount++;
        doAdd(i, uIAnnotationOptionItem);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public UIAnnotationOptionItemVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationOptionItem set(int i, UIAnnotationOptionItem uIAnnotationOptionItem) {
        return doSet(i, uIAnnotationOptionItem);
    }
}
