package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETextTemplateClipSPtr extends AbstractList<NLETextTemplateClip> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETextTemplateClipSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLETextTemplateClipSPtr() {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETextTemplateClipSPtr(Iterable<NLETextTemplateClip> iterable) {
        this();
        Iterator<NLETextTemplateClip> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETextTemplateClip nLETextTemplateClip) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    private NLETextTemplateClip doGet(int i) {
        long jVecNLETextTemplateClipSPtr_doGet = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLETextTemplateClipSPtr_doGet == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtr_doGet, true);
    }

    private NLETextTemplateClip doRemove(int i) {
        long jVecNLETextTemplateClipSPtr_doRemove = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLETextTemplateClipSPtr_doRemove == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr) {
        if (vecNLETextTemplateClipSPtr == null) {
            return 0L;
        }
        return vecNLETextTemplateClipSPtr.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETextTemplateClip nLETextTemplateClip) {
        ((AbstractList) this).modCount++;
        doAdd(nLETextTemplateClip);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETextTemplateClipSPtr(NLETextTemplateClip[] nLETextTemplateClipArr) {
        this();
        reserve(nLETextTemplateClipArr.length);
        for (NLETextTemplateClip nLETextTemplateClip : nLETextTemplateClipArr) {
            add(nLETextTemplateClip);
        }
    }

    public VecNLETextTemplateClipSPtr(VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr) {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtr__SWIG_1(getCPtr(vecNLETextTemplateClipSPtr), vecNLETextTemplateClipSPtr), true);
    }

    public VecNLETextTemplateClipSPtr(int i, NLETextTemplateClip nLETextTemplateClip) {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtr__SWIG_2(i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip), true);
    }

    private void doAdd(int i, NLETextTemplateClip nLETextTemplateClip) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETextTemplateClip doSet(int i, NLETextTemplateClip nLETextTemplateClip) {
        long jVecNLETextTemplateClipSPtr_doSet = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doSet(this.swigCPtr, this, i, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
        if (jVecNLETextTemplateClipSPtr_doSet == 0) {
            return null;
        }
        return new NLETextTemplateClip(jVecNLETextTemplateClipSPtr_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETextTemplateClip nLETextTemplateClip) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETextTemplateClip);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETextTemplateClipSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETextTemplateClip set(int i, NLETextTemplateClip nLETextTemplateClip) {
        return doSet(i, nLETextTemplateClip);
    }
}
