package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecUInt32 extends AbstractList<Long> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_VecUInt32(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLETemplateJNI.VecUInt32_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLETemplateJNI.VecUInt32_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLETemplateJNI.VecUInt32_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLETemplateJNI.VecUInt32_isEmpty(this.swigCPtr, this);
    }

    public VecUInt32() {
        this(NLETemplateJNI.new_VecUInt32__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecUInt32(Iterable<Long> iterable) {
        this();
        Iterator<Long> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(Long.valueOf(it2.next().longValue()));
        }
    }

    private void doAdd(long j) {
        NLETemplateJNI.VecUInt32_doAdd__SWIG_0(this.swigCPtr, this, j);
    }

    private long doGet(int i) {
        return NLETemplateJNI.VecUInt32_doGet(this.swigCPtr, this, i);
    }

    private long doRemove(int i) {
        return NLETemplateJNI.VecUInt32_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecUInt32 vecUInt32) {
        if (vecUInt32 == null) {
            return 0L;
        }
        return vecUInt32.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        ((AbstractList) this).modCount++;
        doAdd(l.longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        NLETemplateJNI.VecUInt32_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecUInt32(long[] jArr) {
        this();
        reserve(jArr.length);
        for (long j : jArr) {
            add(Long.valueOf(j));
        }
    }

    public VecUInt32(VecUInt32 vecUInt32) {
        this(NLETemplateJNI.new_VecUInt32__SWIG_1(getCPtr(vecUInt32), vecUInt32), true);
    }

    public VecUInt32(int i, long j) {
        this(NLETemplateJNI.new_VecUInt32__SWIG_2(i, j), true);
    }

    private void doAdd(int i, long j) {
        NLETemplateJNI.VecUInt32_doAdd__SWIG_1(this.swigCPtr, this, i, j);
    }

    private void doRemoveRange(int i, int i2) {
        NLETemplateJNI.VecUInt32_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private long doSet(int i, long j) {
        return NLETemplateJNI.VecUInt32_doSet(this.swigCPtr, this, i, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        ((AbstractList) this).modCount++;
        doAdd(i, l.longValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(doSet(i, l.longValue()));
    }

    public VecUInt32(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
