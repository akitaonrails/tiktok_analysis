package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETimeSpaceNodeSPtr extends AbstractList<NLETimeSpaceNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETimeSpaceNodeSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLETimeSpaceNodeSPtr() {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETimeSpaceNodeSPtr(Iterable<NLETimeSpaceNode> iterable) {
        this();
        Iterator<NLETimeSpaceNode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETimeSpaceNode nLETimeSpaceNode) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    private NLETimeSpaceNode doGet(int i) {
        long jVecNLETimeSpaceNodeSPtr_doGet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLETimeSpaceNodeSPtr_doGet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtr_doGet, true);
    }

    private NLETimeSpaceNode doRemove(int i) {
        long jVecNLETimeSpaceNodeSPtr_doRemove = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLETimeSpaceNodeSPtr_doRemove == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr) {
        if (vecNLETimeSpaceNodeSPtr == null) {
            return 0L;
        }
        return vecNLETimeSpaceNodeSPtr.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLETimeSpaceNode nLETimeSpaceNode) {
        ((AbstractList) this).modCount++;
        doAdd(nLETimeSpaceNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeSpaceNode get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeSpaceNode remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETimeSpaceNodeSPtr(NLETimeSpaceNode[] nLETimeSpaceNodeArr) {
        this();
        reserve(nLETimeSpaceNodeArr.length);
        for (NLETimeSpaceNode nLETimeSpaceNode : nLETimeSpaceNodeArr) {
            add(nLETimeSpaceNode);
        }
    }

    public VecNLETimeSpaceNodeSPtr(VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr) {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtr__SWIG_1(getCPtr(vecNLETimeSpaceNodeSPtr), vecNLETimeSpaceNodeSPtr), true);
    }

    public VecNLETimeSpaceNodeSPtr(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtr__SWIG_2(i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode), true);
    }

    private void doAdd(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETimeSpaceNode doSet(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        long jVecNLETimeSpaceNodeSPtr_doSet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doSet(this.swigCPtr, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        if (jVecNLETimeSpaceNodeSPtr_doSet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtr_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLETimeSpaceNode);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLETimeSpaceNodeSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeSpaceNode set(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        return doSet(i, nLETimeSpaceNode);
    }
}
