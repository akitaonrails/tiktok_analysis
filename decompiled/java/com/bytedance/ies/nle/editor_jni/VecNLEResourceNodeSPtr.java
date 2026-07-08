package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEResourceNodeSPtr extends AbstractList<NLEResourceNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEResourceNodeSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtr_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtr_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtr_isEmpty(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtr() {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEResourceNodeSPtr(Iterable<NLEResourceNode> iterable) {
        this();
        Iterator<NLEResourceNode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doAdd__SWIG_0(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    private NLEResourceNode doGet(int i) {
        long jVecNLEResourceNodeSPtr_doGet = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doGet(this.swigCPtr, this, i);
        if (jVecNLEResourceNodeSPtr_doGet == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtr_doGet, true);
    }

    private NLEResourceNode doRemove(int i) {
        long jVecNLEResourceNodeSPtr_doRemove = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doRemove(this.swigCPtr, this, i);
        if (jVecNLEResourceNodeSPtr_doRemove == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtr_doRemove, true);
    }

    public static long getCPtr(VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr) {
        if (vecNLEResourceNodeSPtr == null) {
            return 0L;
        }
        return vecNLEResourceNodeSPtr.swigCPtr;
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
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEResourceNodeSPtr(NLEResourceNode[] nLEResourceNodeArr) {
        this();
        reserve(nLEResourceNodeArr.length);
        for (NLEResourceNode nLEResourceNode : nLEResourceNodeArr) {
            add(nLEResourceNode);
        }
    }

    public VecNLEResourceNodeSPtr(VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr) {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtr__SWIG_1(getCPtr(vecNLEResourceNodeSPtr), vecNLEResourceNodeSPtr), true);
    }

    public VecNLEResourceNodeSPtr(int i, NLEResourceNode nLEResourceNode) {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtr__SWIG_2(i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode), true);
    }

    private void doAdd(int i, NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doAdd__SWIG_1(this.swigCPtr, this, i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEResourceNode doSet(int i, NLEResourceNode nLEResourceNode) {
        long jVecNLEResourceNodeSPtr_doSet = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doSet(this.swigCPtr, this, i, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
        if (jVecNLEResourceNodeSPtr_doSet == 0) {
            return null;
        }
        return new NLEResourceNode(jVecNLEResourceNodeSPtr_doSet, true);
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

    public VecNLEResourceNodeSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEResourceNode set(int i, NLEResourceNode nLEResourceNode) {
        return doSet(i, nLEResourceNode);
    }
}
