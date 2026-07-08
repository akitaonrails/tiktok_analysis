package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLEMVResourceBean extends AbstractList<NLEMVResourceBean> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLEMVResourceBean(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLEMVResourceBean_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLEMVResourceBean_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLEMVResourceBean_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEMVResourceBean_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMVResourceBean() {
        this(NLEMediaJniJNI.new_VecNLEMVResourceBean__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMVResourceBean(Iterable<NLEMVResourceBean> iterable) {
        this();
        Iterator<NLEMVResourceBean> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMVResourceBean nLEMVResourceBean) {
        NLEMediaJniJNI.VecNLEMVResourceBean_doAdd__SWIG_0(this.swigCPtr, this, NLEMVResourceBean.getCPtr(nLEMVResourceBean), nLEMVResourceBean);
    }

    private NLEMVResourceBean doGet(int i) {
        long jVecNLEMVResourceBean_doGet = NLEMediaJniJNI.VecNLEMVResourceBean_doGet(this.swigCPtr, this, i);
        if (jVecNLEMVResourceBean_doGet == 0) {
            return null;
        }
        return new NLEMVResourceBean(jVecNLEMVResourceBean_doGet, true);
    }

    private NLEMVResourceBean doRemove(int i) {
        long jVecNLEMVResourceBean_doRemove = NLEMediaJniJNI.VecNLEMVResourceBean_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMVResourceBean_doRemove == 0) {
            return null;
        }
        return new NLEMVResourceBean(jVecNLEMVResourceBean_doRemove, true);
    }

    public static long getCPtr(VecNLEMVResourceBean vecNLEMVResourceBean) {
        if (vecNLEMVResourceBean == null) {
            return 0L;
        }
        return vecNLEMVResourceBean.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEMVResourceBean nLEMVResourceBean) {
        ((AbstractList) this).modCount++;
        doAdd(nLEMVResourceBean);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVResourceBean get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVResourceBean remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLEMVResourceBean_reserve(this.swigCPtr, this, j);
    }

    public VecNLEMVResourceBean(NLEMVResourceBean[] nLEMVResourceBeanArr) {
        this();
        reserve(nLEMVResourceBeanArr.length);
        for (NLEMVResourceBean nLEMVResourceBean : nLEMVResourceBeanArr) {
            add(nLEMVResourceBean);
        }
    }

    public VecNLEMVResourceBean(VecNLEMVResourceBean vecNLEMVResourceBean) {
        this(NLEMediaJniJNI.new_VecNLEMVResourceBean__SWIG_1(getCPtr(vecNLEMVResourceBean), vecNLEMVResourceBean), true);
    }

    public VecNLEMVResourceBean(int i, NLEMVResourceBean nLEMVResourceBean) {
        this(NLEMediaJniJNI.new_VecNLEMVResourceBean__SWIG_2(i, NLEMVResourceBean.getCPtr(nLEMVResourceBean), nLEMVResourceBean), true);
    }

    private void doAdd(int i, NLEMVResourceBean nLEMVResourceBean) {
        NLEMediaJniJNI.VecNLEMVResourceBean_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMVResourceBean.getCPtr(nLEMVResourceBean), nLEMVResourceBean);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLEMVResourceBean_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMVResourceBean doSet(int i, NLEMVResourceBean nLEMVResourceBean) {
        long jVecNLEMVResourceBean_doSet = NLEMediaJniJNI.VecNLEMVResourceBean_doSet(this.swigCPtr, this, i, NLEMVResourceBean.getCPtr(nLEMVResourceBean), nLEMVResourceBean);
        if (jVecNLEMVResourceBean_doSet == 0) {
            return null;
        }
        return new NLEMVResourceBean(jVecNLEMVResourceBean_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEMVResourceBean nLEMVResourceBean) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEMVResourceBean);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEMVResourceBean(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMVResourceBean set(int i, NLEMVResourceBean nLEMVResourceBean) {
        return doSet(i, nLEMVResourceBean);
    }
}
