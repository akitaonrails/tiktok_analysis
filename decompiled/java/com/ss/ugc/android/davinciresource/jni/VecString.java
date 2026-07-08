package com.ss.ugc.android.davinciresource.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecString extends AbstractList<String> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_VecString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return DavinciResourceJniJNI.VecString_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return DavinciResourceJniJNI.VecString_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DavinciResourceJniJNI.VecString_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return DavinciResourceJniJNI.VecString_isEmpty(this.swigCPtr, this);
    }

    public VecString() {
        this(DavinciResourceJniJNI.new_VecString__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecString(Iterable<String> iterable) {
        this();
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(String str) {
        DavinciResourceJniJNI.VecString_doAdd__SWIG_0(this.swigCPtr, this, str);
    }

    private String doGet(int i) {
        return DavinciResourceJniJNI.VecString_doGet(this.swigCPtr, this, i);
    }

    private String doRemove(int i) {
        return DavinciResourceJniJNI.VecString_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(VecString vecString) {
        if (vecString == null) {
            return 0L;
        }
        return vecString.swigCPtr;
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
        DavinciResourceJniJNI.VecString_reserve(this.swigCPtr, this, j);
    }

    public VecString(String[] strArr) {
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

    public VecString(VecString vecString) {
        this(DavinciResourceJniJNI.new_VecString__SWIG_1(getCPtr(vecString), vecString), true);
    }

    public VecString(int i, String str) {
        this(DavinciResourceJniJNI.new_VecString__SWIG_2(i, str), true);
    }

    private void doAdd(int i, String str) {
        DavinciResourceJniJNI.VecString_doAdd__SWIG_1(this.swigCPtr, this, i, str);
    }

    private void doRemoveRange(int i, int i2) {
        DavinciResourceJniJNI.VecString_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private String doSet(int i, String str) {
        return DavinciResourceJniJNI.VecString_doSet(this.swigCPtr, this, i, str);
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

    public VecString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return doSet(i, str);
    }
}
