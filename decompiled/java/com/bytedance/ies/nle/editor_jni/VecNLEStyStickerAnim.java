package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public class VecNLEStyStickerAnim extends AbstractList<NLEStyStickerAnim> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_VecNLEStyStickerAnim(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return NLEEditorJniJNI.VecNLEStyStickerAnim_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return NLEEditorJniJNI.VecNLEStyStickerAnim_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        NLEEditorJniJNI.VecNLEStyStickerAnim_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStyStickerAnim_isEmpty(this.swigCPtr, this);
    }

    public VecNLEStyStickerAnim() {
        this(NLEEditorJniJNI.new_VecNLEStyStickerAnim__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public VecNLEStyStickerAnim(Iterable<NLEStyStickerAnim> iterable) {
        this();
        Iterator<NLEStyStickerAnim> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    private void doAdd(NLEStyStickerAnim nLEStyStickerAnim) {
        NLEEditorJniJNI.VecNLEStyStickerAnim_doAdd__SWIG_0(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    private NLEStyStickerAnim doGet(int i) {
        long jVecNLEStyStickerAnim_doGet = NLEEditorJniJNI.VecNLEStyStickerAnim_doGet(this.swigCPtr, this, i);
        if (jVecNLEStyStickerAnim_doGet == 0) {
            return null;
        }
        return new NLEStyStickerAnim(jVecNLEStyStickerAnim_doGet, true);
    }

    private NLEStyStickerAnim doRemove(int i) {
        long jVecNLEStyStickerAnim_doRemove = NLEEditorJniJNI.VecNLEStyStickerAnim_doRemove(this.swigCPtr, this, i);
        if (jVecNLEStyStickerAnim_doRemove == 0) {
            return null;
        }
        return new NLEStyStickerAnim(jVecNLEStyStickerAnim_doRemove, true);
    }

    public static long getCPtr(VecNLEStyStickerAnim vecNLEStyStickerAnim) {
        if (vecNLEStyStickerAnim == null) {
            return 0L;
        }
        return vecNLEStyStickerAnim.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NLEStyStickerAnim nLEStyStickerAnim) {
        ((AbstractList) this).modCount++;
        doAdd(nLEStyStickerAnim);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStyStickerAnim get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStyStickerAnim remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        NLEEditorJniJNI.VecNLEStyStickerAnim_reserve(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecNLEStyStickerAnim(NLEStyStickerAnim[] nLEStyStickerAnimArr) {
        this();
        reserve(nLEStyStickerAnimArr.length);
        for (NLEStyStickerAnim nLEStyStickerAnim : nLEStyStickerAnimArr) {
            add(nLEStyStickerAnim);
        }
    }

    public VecNLEStyStickerAnim(VecNLEStyStickerAnim vecNLEStyStickerAnim) {
        this(NLEEditorJniJNI.new_VecNLEStyStickerAnim__SWIG_1(getCPtr(vecNLEStyStickerAnim), vecNLEStyStickerAnim), true);
    }

    public VecNLEStyStickerAnim(int i, NLEStyStickerAnim nLEStyStickerAnim) {
        this(NLEEditorJniJNI.new_VecNLEStyStickerAnim__SWIG_2(i, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim), true);
    }

    private void doAdd(int i, NLEStyStickerAnim nLEStyStickerAnim) {
        NLEEditorJniJNI.VecNLEStyStickerAnim_doAdd__SWIG_1(this.swigCPtr, this, i, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    private void doRemoveRange(int i, int i2) {
        NLEEditorJniJNI.VecNLEStyStickerAnim_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private NLEStyStickerAnim doSet(int i, NLEStyStickerAnim nLEStyStickerAnim) {
        long jVecNLEStyStickerAnim_doSet = NLEEditorJniJNI.VecNLEStyStickerAnim_doSet(this.swigCPtr, this, i, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
        if (jVecNLEStyStickerAnim_doSet == 0) {
            return null;
        }
        return new NLEStyStickerAnim(jVecNLEStyStickerAnim_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NLEStyStickerAnim nLEStyStickerAnim) {
        ((AbstractList) this).modCount++;
        doAdd(i, nLEStyStickerAnim);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public VecNLEStyStickerAnim(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public NLEStyStickerAnim set(int i, NLEStyStickerAnim nLEStyStickerAnim) {
        return doSet(i, nLEStyStickerAnim);
    }
}
