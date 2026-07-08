package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes36.dex */
public class VecNLEMappingNode extends AbstractList<NLEMappingNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_VecNLEMappingNode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLETemplateJNI.VecNLEMappingNode_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLETemplateJNI.VecNLEMappingNode_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLETemplateJNI.VecNLEMappingNode_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLETemplateJNI.VecNLEMappingNode_isEmpty(this.swigCPtr, this);
    }

    public VecNLEMappingNode() {
        this(NLETemplateJNI.new_VecNLEMappingNode__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEMappingNode(Iterable<NLEMappingNode> iterable) {
        this();
        Iterator<NLEMappingNode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEMappingNode nLEMappingNode) {
        NLETemplateJNI.VecNLEMappingNode_doAdd__SWIG_0(this.swigCPtr, this, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode);
    }

    private NLEMappingNode doGet(int i) {
        long jVecNLEMappingNode_doGet = NLETemplateJNI.VecNLEMappingNode_doGet(this.swigCPtr, this, i);
        if (jVecNLEMappingNode_doGet == 0) {
            return null;
        }
        return new NLEMappingNode(jVecNLEMappingNode_doGet, true);
    }

    private NLEMappingNode doRemove(int i) {
        long jVecNLEMappingNode_doRemove = NLETemplateJNI.VecNLEMappingNode_doRemove(this.swigCPtr, this, i);
        if (jVecNLEMappingNode_doRemove == 0) {
            return null;
        }
        return new NLEMappingNode(jVecNLEMappingNode_doRemove, true);
    }

    public static long getCPtr(VecNLEMappingNode vecNLEMappingNode) {
        if (vecNLEMappingNode == null) {
            return 0L;
        }
        return vecNLEMappingNode.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEMappingNode nLEMappingNode) {
        ((AbstractList) this).modCount++;
        doAdd(nLEMappingNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMappingNode get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMappingNode remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLETemplateJNI.VecNLEMappingNode_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEMappingNode(NLEMappingNode[] nLEMappingNodeArr) {
        this();
        reserve(nLEMappingNodeArr.length);
        for (NLEMappingNode nLEMappingNode : nLEMappingNodeArr) {
            add(nLEMappingNode);
        }
    }

    public VecNLEMappingNode(VecNLEMappingNode vecNLEMappingNode) {
        this(NLETemplateJNI.new_VecNLEMappingNode__SWIG_1(getCPtr(vecNLEMappingNode), vecNLEMappingNode), true);
    }

    public VecNLEMappingNode(int i, NLEMappingNode nLEMappingNode) {
        this(NLETemplateJNI.new_VecNLEMappingNode__SWIG_2(i, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode), true);
    }

    private void doAdd(int i, NLEMappingNode nLEMappingNode) {
        NLETemplateJNI.VecNLEMappingNode_doAdd__SWIG_1(this.swigCPtr, this, i, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode);
    }

    private void doRemoveRange(int i, int i2) {
        NLETemplateJNI.VecNLEMappingNode_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEMappingNode doSet(int i, NLEMappingNode nLEMappingNode) {
        long jVecNLEMappingNode_doSet = NLETemplateJNI.VecNLEMappingNode_doSet(this.swigCPtr, this, i, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode);
        if (jVecNLEMappingNode_doSet == 0) {
            return null;
        }
        return new NLEMappingNode(jVecNLEMappingNode_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEMappingNode nLEMappingNode) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEMappingNode);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEMappingNode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEMappingNode set(int i, NLEMappingNode nLEMappingNode) {
        return doSet(i, nLEMappingNode);
    }
}
