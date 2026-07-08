package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class VecMeta extends AbstractList<Meta> implements RandomAccess {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_VecMeta(j);
                }
                this.LL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecMeta_clear(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecMeta_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecMeta_doSize(this.LL, this);
    }

    public VecMeta() {
        this(SmartMovieJniJNI.new_VecMeta__SWIG_0());
    }

    public VecMeta(long j) {
        this.LLILLJJLI = true;
        this.LL = j;
    }

    public static long LJ(VecMeta vecMeta) {
        if (vecMeta == null) {
            return 0L;
        }
        return vecMeta.LL;
    }

    public final void LIZJ(Meta meta) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doAdd__SWIG_0(this.LL, this, Meta.LIZ(meta), meta);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((Meta) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new Meta(SmartMovieJniJNI.VecMeta_doGet(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new Meta(SmartMovieJniJNI.VecMeta_doRemove(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Meta meta = (Meta) obj;
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doAdd__SWIG_1(this.LL, this, i, Meta.LIZ(meta), meta);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doRemoveRange(this.LL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Meta meta = (Meta) obj;
        return new Meta(SmartMovieJniJNI.VecMeta_doSet(this.LL, this, i, Meta.LIZ(meta), meta));
    }
}
