package com.ss.ugc.android.davinciresource.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecDAVResource extends AbstractList<DAVResource> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_VecDAVResource(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return DavinciResourceJniJNI.VecDAVResource_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return DavinciResourceJniJNI.VecDAVResource_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DavinciResourceJniJNI.VecDAVResource_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return DavinciResourceJniJNI.VecDAVResource_isEmpty(this.swigCPtr, this);
    }

    public VecDAVResource() {
        this(DavinciResourceJniJNI.new_VecDAVResource__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecDAVResource(Iterable<DAVResource> iterable) {
        this();
        Iterator<DAVResource> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(DAVResource dAVResource) {
        DavinciResourceJniJNI.VecDAVResource_doAdd__SWIG_0(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    private DAVResource doGet(int i) {
        return new DAVResource(DavinciResourceJniJNI.VecDAVResource_doGet(this.swigCPtr, this, i), true);
    }

    private DAVResource doRemove(int i) {
        return new DAVResource(DavinciResourceJniJNI.VecDAVResource_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecDAVResource vecDAVResource) {
        if (vecDAVResource == null) {
            return 0L;
        }
        return vecDAVResource.swigCPtr;
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
        DavinciResourceJniJNI.VecDAVResource_reserve(this.swigCPtr, this, j);
    }

    public VecDAVResource(DAVResource[] dAVResourceArr) {
        this();
        reserve(dAVResourceArr.length);
        for (DAVResource dAVResource : dAVResourceArr) {
            add(dAVResource);
        }
    }

    public VecDAVResource(VecDAVResource vecDAVResource) {
        this(DavinciResourceJniJNI.new_VecDAVResource__SWIG_1(getCPtr(vecDAVResource), vecDAVResource), true);
    }

    public VecDAVResource(int i, DAVResource dAVResource) {
        this(DavinciResourceJniJNI.new_VecDAVResource__SWIG_2(i, DAVResource.getCPtr(dAVResource), dAVResource), true);
    }

    private void doAdd(int i, DAVResource dAVResource) {
        DavinciResourceJniJNI.VecDAVResource_doAdd__SWIG_1(this.swigCPtr, this, i, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    private void doRemoveRange(int i, int i2) {
        DavinciResourceJniJNI.VecDAVResource_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private DAVResource doSet(int i, DAVResource dAVResource) {
        return new DAVResource(DavinciResourceJniJNI.VecDAVResource_doSet(this.swigCPtr, this, i, DAVResource.getCPtr(dAVResource), dAVResource), true);
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

    public VecDAVResource(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public DAVResource set(int i, DAVResource dAVResource) {
        return doSet(i, dAVResource);
    }
}
