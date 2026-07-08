package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLETimeSpaceNodeSPtrConst extends AbstractList<NLETimeSpaceNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLETimeSpaceNodeSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLETimeSpaceNodeSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLETimeSpaceNodeSPtrConst(Iterable<NLETimeSpaceNode> iterable) {
        this();
        Iterator<NLETimeSpaceNode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLETimeSpaceNode nLETimeSpaceNode) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    private NLETimeSpaceNode doGet(int i) {
        long jVecNLETimeSpaceNodeSPtrConst_doGet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLETimeSpaceNodeSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtrConst_doGet, true);
    }

    private NLETimeSpaceNode doRemove(int i) {
        long jVecNLETimeSpaceNodeSPtrConst_doRemove = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLETimeSpaceNodeSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst) {
        if (vecNLETimeSpaceNodeSPtrConst == null) {
            return 0L;
        }
        return vecNLETimeSpaceNodeSPtrConst.swigCPtr;
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
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLETimeSpaceNodeSPtrConst(NLETimeSpaceNode[] nLETimeSpaceNodeArr) {
        this();
        reserve(nLETimeSpaceNodeArr.length);
        for (NLETimeSpaceNode nLETimeSpaceNode : nLETimeSpaceNodeArr) {
            add(nLETimeSpaceNode);
        }
    }

    public VecNLETimeSpaceNodeSPtrConst(VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtrConst__SWIG_1(getCPtr(vecNLETimeSpaceNodeSPtrConst), vecNLETimeSpaceNodeSPtrConst), true);
    }

    public VecNLETimeSpaceNodeSPtrConst(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        this(NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtrConst__SWIG_2(i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode), true);
    }

    private void doAdd(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLETimeSpaceNode doSet(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        long jVecNLETimeSpaceNodeSPtrConst_doSet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtrConst_doSet(this.swigCPtr, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        if (jVecNLETimeSpaceNodeSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(jVecNLETimeSpaceNodeSPtrConst_doSet, true);
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

    public VecNLETimeSpaceNodeSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLETimeSpaceNode set(int i, NLETimeSpaceNode nLETimeSpaceNode) {
        return doSet(i, nLETimeSpaceNode);
    }
}
