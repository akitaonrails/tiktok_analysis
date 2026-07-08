package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecFloat extends AbstractList<Float> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecFloat(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecFloat_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecFloat_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecFloat_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecFloat_isEmpty(this.swigCPtr, this);
    }

    public VecFloat() {
        this(NLEEditorJniJNI.new_VecFloat__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecFloat(Iterable<Float> iterable) {
        this();
        Iterator<Float> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(Float.valueOf(it2.next().floatValue()));
        }
    }

    private void doAdd(float f) {
        NLEEditorJniJNI.VecFloat_doAdd__SWIG_0(this.swigCPtr, this, f);
    }

    private float doGet(int i) {
        return NLEEditorJniJNI.VecFloat_doGet(this.swigCPtr, this, i);
    }

    private float doRemove(int i) {
        return NLEEditorJniJNI.VecFloat_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecFloat vecFloat) {
        if (vecFloat == null) {
            return 0L;
        }
        return vecFloat.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f) {
        ((AbstractList) this).modCount++;
        doAdd(f.floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
        return Float.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Float remove(int i) {
        ((AbstractList) this).modCount++;
        return Float.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecFloat_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecFloat(float[] fArr) {
        this();
        reserve(fArr.length);
        for (float f : fArr) {
            add(Float.valueOf(f));
        }
    }

    public VecFloat(VecFloat vecFloat) {
        this(NLEEditorJniJNI.new_VecFloat__SWIG_1(getCPtr(vecFloat), vecFloat), true);
    }

    public VecFloat(int i, float f) {
        this(NLEEditorJniJNI.new_VecFloat__SWIG_2(i, f), true);
    }

    private void doAdd(int i, float f) {
        NLEEditorJniJNI.VecFloat_doAdd__SWIG_1(this.swigCPtr, this, i, f);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecFloat_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private float doSet(int i, float f) {
        return NLEEditorJniJNI.VecFloat_doSet(this.swigCPtr, this, i, f);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Float f) {
        ((AbstractList) this).modCount++;
        doAdd(i, f.floatValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Float set(int i, Float f) {
        return Float.valueOf(doSet(i, f.floatValue()));
    }

    public VecFloat(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
