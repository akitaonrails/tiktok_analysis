package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class VecStr extends AbstractList<String> implements RandomAccess {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_VecStr(j);
                }
                this.LL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecStr_clear(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecStr_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecStr_doSize(this.LL, this);
    }

    public VecStr() {
        this(SmartMovieJniJNI.new_VecStr__SWIG_0());
    }

    public VecStr(long j) {
        this.LLILLJJLI = true;
        this.LL = j;
    }

    public static long LJ(VecStr vecStr) {
        if (vecStr == null) {
            return 0L;
        }
        return vecStr.LL;
    }

    public final void LIZJ(String str) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doAdd__SWIG_0(this.LL, this, str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((String) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return SmartMovieJniJNI.VecStr_doGet(this.LL, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return SmartMovieJniJNI.VecStr_doRemove(this.LL, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doAdd__SWIG_1(this.LL, this, i, (String) obj);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doRemoveRange(this.LL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return SmartMovieJniJNI.VecStr_doSet(this.LL, this, i, (String) obj);
    }
}
