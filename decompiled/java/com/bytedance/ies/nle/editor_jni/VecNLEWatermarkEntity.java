package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLEWatermarkEntity extends AbstractList<NLEWatermarkEntity> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLEWatermarkEntity(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLEWatermarkEntity_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLEWatermarkEntity_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLEWatermarkEntity_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEWatermarkEntity_isEmpty(this.swigCPtr, this);
    }

    public VecNLEWatermarkEntity() {
        this(NLEMediaJniJNI.new_VecNLEWatermarkEntity__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEWatermarkEntity(Iterable<NLEWatermarkEntity> iterable) {
        this();
        Iterator<NLEWatermarkEntity> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEWatermarkEntity nLEWatermarkEntity) {
        NLEMediaJniJNI.VecNLEWatermarkEntity_doAdd__SWIG_0(this.swigCPtr, this, NLEWatermarkEntity.getCPtr(nLEWatermarkEntity), nLEWatermarkEntity);
    }

    private NLEWatermarkEntity doGet(int i) {
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doGet(this.swigCPtr, this, i), true);
    }

    private NLEWatermarkEntity doRemove(int i) {
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecNLEWatermarkEntity vecNLEWatermarkEntity) {
        if (vecNLEWatermarkEntity == null) {
            return 0L;
        }
        return vecNLEWatermarkEntity.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEWatermarkEntity nLEWatermarkEntity) {
        ((AbstractList) this).modCount++;
        doAdd(nLEWatermarkEntity);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEWatermarkEntity get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEWatermarkEntity remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLEWatermarkEntity_reserve(this.swigCPtr, this, j);
    }

    public VecNLEWatermarkEntity(NLEWatermarkEntity[] nLEWatermarkEntityArr) {
        this();
        reserve(nLEWatermarkEntityArr.length);
        for (NLEWatermarkEntity nLEWatermarkEntity : nLEWatermarkEntityArr) {
            add(nLEWatermarkEntity);
        }
    }

    public VecNLEWatermarkEntity(VecNLEWatermarkEntity vecNLEWatermarkEntity) {
        this(NLEMediaJniJNI.new_VecNLEWatermarkEntity__SWIG_1(getCPtr(vecNLEWatermarkEntity), vecNLEWatermarkEntity), true);
    }

    public VecNLEWatermarkEntity(int i, NLEWatermarkEntity nLEWatermarkEntity) {
        this(NLEMediaJniJNI.new_VecNLEWatermarkEntity__SWIG_2(i, NLEWatermarkEntity.getCPtr(nLEWatermarkEntity), nLEWatermarkEntity), true);
    }

    private void doAdd(int i, NLEWatermarkEntity nLEWatermarkEntity) {
        NLEMediaJniJNI.VecNLEWatermarkEntity_doAdd__SWIG_1(this.swigCPtr, this, i, NLEWatermarkEntity.getCPtr(nLEWatermarkEntity), nLEWatermarkEntity);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLEWatermarkEntity_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEWatermarkEntity doSet(int i, NLEWatermarkEntity nLEWatermarkEntity) {
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doSet(this.swigCPtr, this, i, NLEWatermarkEntity.getCPtr(nLEWatermarkEntity), nLEWatermarkEntity), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEWatermarkEntity nLEWatermarkEntity) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEWatermarkEntity);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEWatermarkEntity(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEWatermarkEntity set(int i, NLEWatermarkEntity nLEWatermarkEntity) {
        return doSet(i, nLEWatermarkEntity);
    }
}
