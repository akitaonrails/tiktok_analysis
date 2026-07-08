package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class EEStdStringToStringUnorderedMapList extends AbstractList<EEStdStringToStringUnorderedMap> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_EEStdStringToStringUnorderedMapList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_isEmpty(this.swigCPtr, this);
    }

    public EEStdStringToStringUnorderedMapList() {
        this(EffectEditorJniJNI.new_EEStdStringToStringUnorderedMapList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringToStringUnorderedMapList(Iterable<EEStdStringToStringUnorderedMap> iterable) {
        this();
        Iterator<EEStdStringToStringUnorderedMap> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doAdd__SWIG_0(this.swigCPtr, this, EEStdStringToStringUnorderedMap.getCPtr(eEStdStringToStringUnorderedMap), eEStdStringToStringUnorderedMap);
    }

    private EEStdStringToStringUnorderedMap doGet(int i) {
        return new EEStdStringToStringUnorderedMap(EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doGet(this.swigCPtr, this, i), false);
    }

    private EEStdStringToStringUnorderedMap doRemove(int i) {
        return new EEStdStringToStringUnorderedMap(EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList) {
        if (eEStdStringToStringUnorderedMapList == null) {
            return 0L;
        }
        return eEStdStringToStringUnorderedMapList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        ((AbstractList) this).modCount++;
        doAdd(eEStdStringToStringUnorderedMap);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EEStdStringToStringUnorderedMap get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EEStdStringToStringUnorderedMap remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_reserve(this.swigCPtr, this, j);
    }

    public EEStdStringToStringUnorderedMapList(EEStdStringToStringUnorderedMap[] eEStdStringToStringUnorderedMapArr) {
        this();
        reserve(eEStdStringToStringUnorderedMapArr.length);
        for (EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap : eEStdStringToStringUnorderedMapArr) {
            add(eEStdStringToStringUnorderedMap);
        }
    }

    public EEStdStringToStringUnorderedMapList(EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList) {
        this(EffectEditorJniJNI.new_EEStdStringToStringUnorderedMapList__SWIG_1(getCPtr(eEStdStringToStringUnorderedMapList), eEStdStringToStringUnorderedMapList), true);
    }

    public EEStdStringToStringUnorderedMapList(int i, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        this(EffectEditorJniJNI.new_EEStdStringToStringUnorderedMapList__SWIG_2(i, EEStdStringToStringUnorderedMap.getCPtr(eEStdStringToStringUnorderedMap), eEStdStringToStringUnorderedMap), true);
    }

    private void doAdd(int i, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doAdd__SWIG_1(this.swigCPtr, this, i, EEStdStringToStringUnorderedMap.getCPtr(eEStdStringToStringUnorderedMap), eEStdStringToStringUnorderedMap);
    }

    private void doRemoveRange(int i, int i2) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EEStdStringToStringUnorderedMap doSet(int i, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        return new EEStdStringToStringUnorderedMap(EffectEditorJniJNI.EEStdStringToStringUnorderedMapList_doSet(this.swigCPtr, this, i, EEStdStringToStringUnorderedMap.getCPtr(eEStdStringToStringUnorderedMap), eEStdStringToStringUnorderedMap), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        ((AbstractList) this).modCount++;
        doAdd(i, eEStdStringToStringUnorderedMap);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdStringToStringUnorderedMapList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EEStdStringToStringUnorderedMap set(int i, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        return doSet(i, eEStdStringToStringUnorderedMap);
    }
}
