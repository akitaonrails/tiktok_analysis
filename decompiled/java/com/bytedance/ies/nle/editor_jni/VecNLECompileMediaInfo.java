package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLECompileMediaInfo extends AbstractList<NLECompileMediaInfo> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLECompileMediaInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLECompileMediaInfo_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLECompileMediaInfo_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLECompileMediaInfo_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLECompileMediaInfo_isEmpty(this.swigCPtr, this);
    }

    public VecNLECompileMediaInfo() {
        this(NLEMediaJniJNI.new_VecNLECompileMediaInfo__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLECompileMediaInfo(Iterable<NLECompileMediaInfo> iterable) {
        this();
        Iterator<NLECompileMediaInfo> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLECompileMediaInfo nLECompileMediaInfo) {
        NLEMediaJniJNI.VecNLECompileMediaInfo_doAdd__SWIG_0(this.swigCPtr, this, NLECompileMediaInfo.getCPtr(nLECompileMediaInfo), nLECompileMediaInfo);
    }

    private NLECompileMediaInfo doGet(int i) {
        return new NLECompileMediaInfo(NLEMediaJniJNI.VecNLECompileMediaInfo_doGet(this.swigCPtr, this, i), false);
    }

    private NLECompileMediaInfo doRemove(int i) {
        return new NLECompileMediaInfo(NLEMediaJniJNI.VecNLECompileMediaInfo_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecNLECompileMediaInfo vecNLECompileMediaInfo) {
        if (vecNLECompileMediaInfo == null) {
            return 0L;
        }
        return vecNLECompileMediaInfo.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLECompileMediaInfo nLECompileMediaInfo) {
        ((AbstractList) this).modCount++;
        doAdd(nLECompileMediaInfo);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECompileMediaInfo get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECompileMediaInfo remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLECompileMediaInfo_reserve(this.swigCPtr, this, j);
    }

    public VecNLECompileMediaInfo(NLECompileMediaInfo[] nLECompileMediaInfoArr) {
        this();
        reserve(nLECompileMediaInfoArr.length);
        for (NLECompileMediaInfo nLECompileMediaInfo : nLECompileMediaInfoArr) {
            add(nLECompileMediaInfo);
        }
    }

    public VecNLECompileMediaInfo(VecNLECompileMediaInfo vecNLECompileMediaInfo) {
        this(NLEMediaJniJNI.new_VecNLECompileMediaInfo__SWIG_1(getCPtr(vecNLECompileMediaInfo), vecNLECompileMediaInfo), true);
    }

    public VecNLECompileMediaInfo(int i, NLECompileMediaInfo nLECompileMediaInfo) {
        this(NLEMediaJniJNI.new_VecNLECompileMediaInfo__SWIG_2(i, NLECompileMediaInfo.getCPtr(nLECompileMediaInfo), nLECompileMediaInfo), true);
    }

    private void doAdd(int i, NLECompileMediaInfo nLECompileMediaInfo) {
        NLEMediaJniJNI.VecNLECompileMediaInfo_doAdd__SWIG_1(this.swigCPtr, this, i, NLECompileMediaInfo.getCPtr(nLECompileMediaInfo), nLECompileMediaInfo);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLECompileMediaInfo_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLECompileMediaInfo doSet(int i, NLECompileMediaInfo nLECompileMediaInfo) {
        return new NLECompileMediaInfo(NLEMediaJniJNI.VecNLECompileMediaInfo_doSet(this.swigCPtr, this, i, NLECompileMediaInfo.getCPtr(nLECompileMediaInfo), nLECompileMediaInfo), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLECompileMediaInfo nLECompileMediaInfo) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLECompileMediaInfo);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLECompileMediaInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLECompileMediaInfo set(int i, NLECompileMediaInfo nLECompileMediaInfo) {
        return doSet(i, nLECompileMediaInfo);
    }
}
