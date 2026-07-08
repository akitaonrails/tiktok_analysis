package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class EEStdStringVector extends AbstractList<String> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_EEStdStringVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectEditorJniJNI.EEStdStringVector_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectEditorJniJNI.EEStdStringVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectEditorJniJNI.EEStdStringVector_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectEditorJniJNI.EEStdStringVector_isEmpty(this.swigCPtr, this);
    }

    public EEStdStringVector() {
        this(EffectEditorJniJNI.new_EEStdStringVector__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringVector(Iterable<String> iterable) {
        this();
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(String str) {
        EffectEditorJniJNI.EEStdStringVector_doAdd__SWIG_0(this.swigCPtr, this, str);
    }

    private String doGet(int i) {
        return EffectEditorJniJNI.EEStdStringVector_doGet(this.swigCPtr, this, i);
    }

    private String doRemove(int i) {
        return EffectEditorJniJNI.EEStdStringVector_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(EEStdStringVector eEStdStringVector) {
        if (eEStdStringVector == null) {
            return 0L;
        }
        return eEStdStringVector.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(String str) {
        ((AbstractList) this).modCount++;
        doAdd(str);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectEditorJniJNI.EEStdStringVector_reserve(this.swigCPtr, this, j);
    }

    public EEStdStringVector(String[] strArr) {
        this();
        reserve(strArr.length);
        for (String str : strArr) {
            add(str);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return doGet(i);
    }

    public EEStdStringVector(EEStdStringVector eEStdStringVector) {
        this(EffectEditorJniJNI.new_EEStdStringVector__SWIG_1(getCPtr(eEStdStringVector), eEStdStringVector), true);
    }

    public EEStdStringVector(int i, String str) {
        this(EffectEditorJniJNI.new_EEStdStringVector__SWIG_2(i, str), true);
    }

    private void doAdd(int i, String str) {
        EffectEditorJniJNI.EEStdStringVector_doAdd__SWIG_1(this.swigCPtr, this, i, str);
    }

    private void doRemoveRange(int i, int i2) {
        EffectEditorJniJNI.EEStdStringVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private String doSet(int i, String str) {
        return EffectEditorJniJNI.EEStdStringVector_doSet(this.swigCPtr, this, i, str);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ((AbstractList) this).modCount++;
        doAdd(i, str);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdStringVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return doSet(i, str);
    }
}
