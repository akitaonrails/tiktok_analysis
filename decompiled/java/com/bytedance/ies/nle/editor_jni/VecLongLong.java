package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecLongLong extends AbstractList<Long> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecLongLong(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecLongLong_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecLongLong_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecLongLong_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecLongLong_isEmpty(this.swigCPtr, this);
    }

    public VecLongLong() {
        this(NLEEditorJniJNI.new_VecLongLong__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecLongLong(Iterable<Long> iterable) {
        this();
        Iterator<Long> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(Long.valueOf(it2.next().longValue()));
        }
    }

    private void doAdd(long j) {
        NLEEditorJniJNI.VecLongLong_doAdd__SWIG_0(this.swigCPtr, this, j);
    }

    private long doGet(int i) {
        return NLEEditorJniJNI.VecLongLong_doGet(this.swigCPtr, this, i);
    }

    private long doRemove(int i) {
        return NLEEditorJniJNI.VecLongLong_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecLongLong vecLongLong) {
        if (vecLongLong == null) {
            return 0L;
        }
        return vecLongLong.swigCPtr;
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
        NLEEditorJniJNI.VecLongLong_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecLongLong(long[] jArr) {
        this();
        reserve(jArr.length);
        for (long j : jArr) {
            add(Long.valueOf(j));
        }
    }

    public VecLongLong(VecLongLong vecLongLong) {
        this(NLEEditorJniJNI.new_VecLongLong__SWIG_1(getCPtr(vecLongLong), vecLongLong), true);
    }

    public VecLongLong(int i, long j) {
        this(NLEEditorJniJNI.new_VecLongLong__SWIG_2(i, j), true);
    }

    private void doAdd(int i, long j) {
        NLEEditorJniJNI.VecLongLong_doAdd__SWIG_1(this.swigCPtr, this, i, j);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecLongLong_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private long doSet(int i, long j) {
        return NLEEditorJniJNI.VecLongLong_doSet(this.swigCPtr, this, i, j);
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

    public VecLongLong(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
