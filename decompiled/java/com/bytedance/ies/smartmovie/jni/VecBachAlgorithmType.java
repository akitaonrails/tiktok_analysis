package com.bytedance.ies.smartmovie.jni;

import X.EnumC1419970n3T;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class VecBachAlgorithmType extends AbstractList<EnumC1419970n3T> implements RandomAccess {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_VecBachAlgorithmType(j);
                }
                this.LL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecBachAlgorithmType_clear(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecBachAlgorithmType_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecBachAlgorithmType_doSize(this.LL, this);
    }

    public VecBachAlgorithmType() {
        long jNew_VecBachAlgorithmType__SWIG_0 = SmartMovieJniJNI.new_VecBachAlgorithmType__SWIG_0();
        this.LLILLJJLI = true;
        this.LL = jNew_VecBachAlgorithmType__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doAdd__SWIG_0(this.LL, this, ((EnumC1419970n3T) obj).swigValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return EnumC1419970n3T.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doGet(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return EnumC1419970n3T.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doRemove(this.LL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doAdd__SWIG_1(this.LL, this, i, ((EnumC1419970n3T) obj).swigValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doRemoveRange(this.LL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return EnumC1419970n3T.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doSet(this.LL, this, i, ((EnumC1419970n3T) obj).swigValue()));
    }
}
