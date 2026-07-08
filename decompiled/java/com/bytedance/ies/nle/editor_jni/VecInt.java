package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecInt extends AbstractList<Integer> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecInt_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecInt_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecInt_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecInt_isEmpty(this.swigCPtr, this);
    }

    public VecInt() {
        this(NLEEditorJniJNI.new_VecInt__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecInt(Iterable<Integer> iterable) {
        this();
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(Integer.valueOf(it2.next().intValue()));
        }
    }

    private void doAdd(int i) {
        NLEEditorJniJNI.VecInt_doAdd__SWIG_0(this.swigCPtr, this, i);
    }

    private int doGet(int i) {
        return NLEEditorJniJNI.VecInt_doGet(this.swigCPtr, this, i);
    }

    private int doRemove(int i) {
        return NLEEditorJniJNI.VecInt_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecInt vecInt) {
        if (vecInt == null) {
            return 0L;
        }
        return vecInt.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(num.intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ((AbstractList) this).modCount++;
        return Integer.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecInt_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecInt(int[] iArr) {
        this();
        reserve(iArr.length);
        for (int i : iArr) {
            add(Integer.valueOf(i));
        }
    }

    public VecInt(VecInt vecInt) {
        this(NLEEditorJniJNI.new_VecInt__SWIG_1(getCPtr(vecInt), vecInt), true);
    }

    public VecInt(int i, int i2) {
        this(NLEEditorJniJNI.new_VecInt__SWIG_2(i, i2), true);
    }

    private void doAdd(int i, int i2) {
        NLEEditorJniJNI.VecInt_doAdd__SWIG_1(this.swigCPtr, this, i, i2);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecInt_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private int doSet(int i, int i2) {
        return NLEEditorJniJNI.VecInt_doSet(this.swigCPtr, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(i, num.intValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(doSet(i, num.intValue()));
    }

    public VecInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
