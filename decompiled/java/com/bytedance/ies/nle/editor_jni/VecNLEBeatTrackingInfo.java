package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes28.dex */
public class VecNLEBeatTrackingInfo extends AbstractList<NLEBeatTrackingInfo> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_VecNLEBeatTrackingInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEMediaJniJNI.VecNLEBeatTrackingInfo_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEMediaJniJNI.VecNLEBeatTrackingInfo_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEBeatTrackingInfo_isEmpty(this.swigCPtr, this);
    }

    public VecNLEBeatTrackingInfo() {
        this(NLEMediaJniJNI.new_VecNLEBeatTrackingInfo__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEBeatTrackingInfo(Iterable<NLEBeatTrackingInfo> iterable) {
        this();
        Iterator<NLEBeatTrackingInfo> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doAdd__SWIG_0(this.swigCPtr, this, NLEBeatTrackingInfo.getCPtr(nLEBeatTrackingInfo), nLEBeatTrackingInfo);
    }

    private NLEBeatTrackingInfo doGet(int i) {
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doGet(this.swigCPtr, this, i), false);
    }

    private NLEBeatTrackingInfo doRemove(int i) {
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo) {
        if (vecNLEBeatTrackingInfo == null) {
            return 0L;
        }
        return vecNLEBeatTrackingInfo.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        ((AbstractList) this).modCount++;
        doAdd(nLEBeatTrackingInfo);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBeatTrackingInfo get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBeatTrackingInfo remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_reserve(this.swigCPtr, this, j);
    }

    public VecNLEBeatTrackingInfo(NLEBeatTrackingInfo[] nLEBeatTrackingInfoArr) {
        this();
        reserve(nLEBeatTrackingInfoArr.length);
        for (NLEBeatTrackingInfo nLEBeatTrackingInfo : nLEBeatTrackingInfoArr) {
            add(nLEBeatTrackingInfo);
        }
    }

    public VecNLEBeatTrackingInfo(VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo) {
        this(NLEMediaJniJNI.new_VecNLEBeatTrackingInfo__SWIG_1(getCPtr(vecNLEBeatTrackingInfo), vecNLEBeatTrackingInfo), true);
    }

    public VecNLEBeatTrackingInfo(int i, NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        this(NLEMediaJniJNI.new_VecNLEBeatTrackingInfo__SWIG_2(i, NLEBeatTrackingInfo.getCPtr(nLEBeatTrackingInfo), nLEBeatTrackingInfo), true);
    }

    private void doAdd(int i, NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doAdd__SWIG_1(this.swigCPtr, this, i, NLEBeatTrackingInfo.getCPtr(nLEBeatTrackingInfo), nLEBeatTrackingInfo);
    }

    private void doRemoveRange(int i, int i2) {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEBeatTrackingInfo doSet(int i, NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doSet(this.swigCPtr, this, i, NLEBeatTrackingInfo.getCPtr(nLEBeatTrackingInfo), nLEBeatTrackingInfo), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEBeatTrackingInfo);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEBeatTrackingInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEBeatTrackingInfo set(int i, NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        return doSet(i, nLEBeatTrackingInfo);
    }
}
