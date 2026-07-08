package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class VecLong extends AbstractList<Long> implements RandomAccess {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_VecLong(j);
                }
                this.LL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecLong_clear(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecLong_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecLong_doSize(this.LL, this);
    }

    public VecLong() {
        long jNew_VecLong__SWIG_0 = SmartMovieJniJNI.new_VecLong__SWIG_0();
        this.LLILLJJLI = true;
        this.LL = jNew_VecLong__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecLong_doAdd__SWIG_0(this.LL, this, ((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(SmartMovieJniJNI.VecLong_doGet(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(SmartMovieJniJNI.VecLong_doRemove(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecLong_doAdd__SWIG_1(this.LL, this, i, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecLong_doRemoveRange(this.LL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(SmartMovieJniJNI.VecLong_doSet(this.LL, this, i, ((Long) obj).longValue()));
    }
}
