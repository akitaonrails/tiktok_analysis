package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecNLENode extends AbstractList<NLENode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_VecNLENode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLETemplateJNI.VecNLENode_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLETemplateJNI.VecNLENode_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLETemplateJNI.VecNLENode_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLETemplateJNI.VecNLENode_isEmpty(this.swigCPtr, this);
    }

    public VecNLENode() {
        this(NLETemplateJNI.new_VecNLENode__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLENode(Iterable<NLENode> iterable) {
        this();
        Iterator<NLENode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLENode nLENode) {
        NLETemplateJNI.VecNLENode_doAdd__SWIG_0(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
    }

    private NLENode doGet(int i) {
        long jVecNLENode_doGet = NLETemplateJNI.VecNLENode_doGet(this.swigCPtr, this, i);
        if (jVecNLENode_doGet == 0) {
            return null;
        }
        return new NLENode(jVecNLENode_doGet, true);
    }

    private NLENode doRemove(int i) {
        long jVecNLENode_doRemove = NLETemplateJNI.VecNLENode_doRemove(this.swigCPtr, this, i);
        if (jVecNLENode_doRemove == 0) {
            return null;
        }
        return new NLENode(jVecNLENode_doRemove, true);
    }

    public static long getCPtr(VecNLENode vecNLENode) {
        if (vecNLENode == null) {
            return 0L;
        }
        return vecNLENode.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLENode nLENode) {
        ((AbstractList) this).modCount++;
        doAdd(nLENode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENode get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENode remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLETemplateJNI.VecNLENode_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLENode(NLENode[] nLENodeArr) {
        this();
        reserve(nLENodeArr.length);
        for (NLENode nLENode : nLENodeArr) {
            add(nLENode);
        }
    }

    public VecNLENode(VecNLENode vecNLENode) {
        this(NLETemplateJNI.new_VecNLENode__SWIG_1(getCPtr(vecNLENode), vecNLENode), true);
    }

    public VecNLENode(int i, NLENode nLENode) {
        this(NLETemplateJNI.new_VecNLENode__SWIG_2(i, NLENode.getCPtr(nLENode), nLENode), true);
    }

    private void doAdd(int i, NLENode nLENode) {
        NLETemplateJNI.VecNLENode_doAdd__SWIG_1(this.swigCPtr, this, i, NLENode.getCPtr(nLENode), nLENode);
    }

    private void doRemoveRange(int i, int i2) {
        NLETemplateJNI.VecNLENode_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLENode doSet(int i, NLENode nLENode) {
        long jVecNLENode_doSet = NLETemplateJNI.VecNLENode_doSet(this.swigCPtr, this, i, NLENode.getCPtr(nLENode), nLENode);
        if (jVecNLENode_doSet == 0) {
            return null;
        }
        return new NLENode(jVecNLENode_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLENode nLENode) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLENode);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLENode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLENode set(int i, NLENode nLENode) {
        return doSet(i, nLENode);
    }
}
