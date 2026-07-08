package com.ss.ugc.android.davinciresource.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecPtrDAVResource extends AbstractList<DAVResource> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_VecPtrDAVResource(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return DavinciResourceJniJNI.VecPtrDAVResource_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return DavinciResourceJniJNI.VecPtrDAVResource_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DavinciResourceJniJNI.VecPtrDAVResource_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return DavinciResourceJniJNI.VecPtrDAVResource_isEmpty(this.swigCPtr, this);
    }

    public VecPtrDAVResource() {
        this(DavinciResourceJniJNI.new_VecPtrDAVResource__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecPtrDAVResource(Iterable<DAVResource> iterable) {
        this();
        Iterator<DAVResource> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(DAVResource dAVResource) {
        DavinciResourceJniJNI.VecPtrDAVResource_doAdd__SWIG_0(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    private DAVResource doGet(int i) {
        long jVecPtrDAVResource_doGet = DavinciResourceJniJNI.VecPtrDAVResource_doGet(this.swigCPtr, this, i);
        if (jVecPtrDAVResource_doGet == 0) {
            return null;
        }
        return new DAVResource(jVecPtrDAVResource_doGet, true);
    }

    private DAVResource doRemove(int i) {
        long jVecPtrDAVResource_doRemove = DavinciResourceJniJNI.VecPtrDAVResource_doRemove(this.swigCPtr, this, i);
        if (jVecPtrDAVResource_doRemove == 0) {
            return null;
        }
        return new DAVResource(jVecPtrDAVResource_doRemove, true);
    }

    public static long getCPtr(VecPtrDAVResource vecPtrDAVResource) {
        if (vecPtrDAVResource == null) {
            return 0L;
        }
        return vecPtrDAVResource.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(DAVResource dAVResource) {
        ((AbstractList) this).modCount++;
        doAdd(dAVResource);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public DAVResource get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public DAVResource remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        DavinciResourceJniJNI.VecPtrDAVResource_reserve(this.swigCPtr, this, j);
    }

    public VecPtrDAVResource(DAVResource[] dAVResourceArr) {
        this();
        reserve(dAVResourceArr.length);
        for (DAVResource dAVResource : dAVResourceArr) {
            add(dAVResource);
        }
    }

    public VecPtrDAVResource(VecPtrDAVResource vecPtrDAVResource) {
        this(DavinciResourceJniJNI.new_VecPtrDAVResource__SWIG_1(getCPtr(vecPtrDAVResource), vecPtrDAVResource), true);
    }

    public VecPtrDAVResource(int i, DAVResource dAVResource) {
        this(DavinciResourceJniJNI.new_VecPtrDAVResource__SWIG_2(i, DAVResource.getCPtr(dAVResource), dAVResource), true);
    }

    private void doAdd(int i, DAVResource dAVResource) {
        DavinciResourceJniJNI.VecPtrDAVResource_doAdd__SWIG_1(this.swigCPtr, this, i, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    private void doRemoveRange(int i, int i2) {
        DavinciResourceJniJNI.VecPtrDAVResource_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private DAVResource doSet(int i, DAVResource dAVResource) {
        long jVecPtrDAVResource_doSet = DavinciResourceJniJNI.VecPtrDAVResource_doSet(this.swigCPtr, this, i, DAVResource.getCPtr(dAVResource), dAVResource);
        if (jVecPtrDAVResource_doSet == 0) {
            return null;
        }
        return new DAVResource(jVecPtrDAVResource_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, DAVResource dAVResource) {
        ((AbstractList) this).modCount++;
        doAdd(i, dAVResource);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecPtrDAVResource(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public DAVResource set(int i, DAVResource dAVResource) {
        return doSet(i, dAVResource);
    }
}
