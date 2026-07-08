package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class VecBoolean extends AbstractList<Boolean> implements RandomAccess {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_VecBoolean(j);
                }
                this.LL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecBoolean_clear(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecBoolean_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecBoolean_doSize(this.LL, this);
    }

    public VecBoolean() {
        long jNew_VecBoolean__SWIG_0 = SmartMovieJniJNI.new_VecBoolean__SWIG_0();
        this.LLILLJJLI = true;
        this.LL = jNew_VecBoolean__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBoolean_doAdd__SWIG_0(this.LL, this, ((Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Boolean.valueOf(SmartMovieJniJNI.VecBoolean_doGet(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(SmartMovieJniJNI.VecBoolean_doRemove(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBoolean_doAdd__SWIG_1(this.LL, this, i, ((Boolean) obj).booleanValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBoolean_doRemoveRange(this.LL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Boolean.valueOf(SmartMovieJniJNI.VecBoolean_doSet(this.LL, this, i, ((Boolean) obj).booleanValue()));
    }
}
