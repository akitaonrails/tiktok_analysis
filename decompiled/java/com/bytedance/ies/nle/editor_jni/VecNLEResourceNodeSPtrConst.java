package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEResourceNodeSPtrConst extends AbstractList<NLEResourceNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEResourceNodeSPtrConst(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_isEmpty(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtrConst() {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtrConst__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEResourceNodeSPtrConst(Iterable<NLEResourceNode> iterable) {
        this();
        Iterator<NLEResourceNode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doAdd__SWIG_0(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    private NLEResourceNode doGet(int i) {
        long jVecNLEResourceNodeSPtrConst_doGet = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doGet(this.swigCPtr, this, i);
        if (jVecNLEResourceNodeSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtrConst_doGet, true);
    }

    private NLEResourceNode doRemove(int i) {
        long jVecNLEResourceNodeSPtrConst_doRemove = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doRemove(this.swigCPtr, this, i);
        if (jVecNLEResourceNodeSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtrConst_doRemove, true);
    }

    public static long getCPtr(VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst) {
        if (vecNLEResourceNodeSPtrConst == null) {
            return 0L;
        }
        return vecNLEResourceNodeSPtrConst.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEResourceNode nLEResourceNode) {
        ((AbstractList) this).modCount++;
        doAdd(nLEResourceNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEResourceNode get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEResourceNode remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEResourceNodeSPtrConst(NLEResourceNode[] nLEResourceNodeArr) {
        this();
        reserve(nLEResourceNodeArr.length);
        for (NLEResourceNode nLEResourceNode : nLEResourceNodeArr) {
            add(nLEResourceNode);
        }
    }

    public VecNLEResourceNodeSPtrConst(VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst) {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtrConst__SWIG_1(getCPtr(vecNLEResourceNodeSPtrConst), vecNLEResourceNodeSPtrConst), true);
    }

    public VecNLEResourceNodeSPtrConst(int i, NLEResourceNode nLEResourceNode) {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtrConst__SWIG_2(i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode), true);
    }

    private void doAdd(int i, NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doAdd__SWIG_1(this.swigCPtr, this, i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEResourceNode doSet(int i, NLEResourceNode nLEResourceNode) {
        long jVecNLEResourceNodeSPtrConst_doSet = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doSet(this.swigCPtr, this, i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
        if (jVecNLEResourceNodeSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtrConst_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEResourceNode nLEResourceNode) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEResourceNode);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEResourceNodeSPtrConst(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEResourceNode set(int i, NLEResourceNode nLEResourceNode) {
        return doSet(i, nLEResourceNode);
    }
}
