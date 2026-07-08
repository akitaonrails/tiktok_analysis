package com.ss.ugc.android.davinciresource.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecVecString extends AbstractList<VecString> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_VecVecString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return DavinciResourceJniJNI.VecVecString_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return DavinciResourceJniJNI.VecVecString_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DavinciResourceJniJNI.VecVecString_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return DavinciResourceJniJNI.VecVecString_isEmpty(this.swigCPtr, this);
    }

    public VecVecString() {
        this(DavinciResourceJniJNI.new_VecVecString__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecVecString(Iterable<VecString> iterable) {
        this();
        Iterator<VecString> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(VecString vecString) {
        DavinciResourceJniJNI.VecVecString_doAdd__SWIG_0(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    private VecString doGet(int i) {
        return new VecString(DavinciResourceJniJNI.VecVecString_doGet(this.swigCPtr, this, i), false);
    }

    private VecString doRemove(int i) {
        return new VecString(DavinciResourceJniJNI.VecVecString_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecVecString vecVecString) {
        if (vecVecString == null) {
            return 0L;
        }
        return vecVecString.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(VecString vecString) {
        ((AbstractList) this).modCount++;
        doAdd(vecString);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public VecString get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public VecString remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        DavinciResourceJniJNI.VecVecString_reserve(this.swigCPtr, this, j);
    }

    public VecVecString(VecString[] vecStringArr) {
        this();
        reserve(vecStringArr.length);
        for (VecString vecString : vecStringArr) {
            add(vecString);
        }
    }

    public VecVecString(VecVecString vecVecString) {
        this(DavinciResourceJniJNI.new_VecVecString__SWIG_1(getCPtr(vecVecString), vecVecString), true);
    }

    public VecVecString(int i, VecString vecString) {
        this(DavinciResourceJniJNI.new_VecVecString__SWIG_2(i, VecString.getCPtr(vecString), vecString), true);
    }

    private void doAdd(int i, VecString vecString) {
        DavinciResourceJniJNI.VecVecString_doAdd__SWIG_1(this.swigCPtr, this, i, VecString.getCPtr(vecString), vecString);
    }

    private void doRemoveRange(int i, int i2) {
        DavinciResourceJniJNI.VecVecString_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private VecString doSet(int i, VecString vecString) {
        return new VecString(DavinciResourceJniJNI.VecVecString_doSet(this.swigCPtr, this, i, VecString.getCPtr(vecString), vecString), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, VecString vecString) {
        ((AbstractList) this).modCount++;
        doAdd(i, vecString);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecVecString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public VecString set(int i, VecString vecString) {
        return doSet(i, vecString);
    }
}
