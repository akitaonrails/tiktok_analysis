package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes36.dex */
public class SetInt extends AbstractSet<Integer> {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public static class Iterator {
        public transient boolean swigCMemOwn;
        public transient long swigCPtr;

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NLETemplateJNI.delete_SetInt_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public int derefUnchecked() {
            return NLETemplateJNI.SetInt_Iterator_derefUnchecked(this.swigCPtr, this);
        }

        public void incrementUnchecked() {
            NLETemplateJNI.SetInt_Iterator_incrementUnchecked(this.swigCPtr, this);
        }

        public void finalize() {
            delete();
        }

        public static long getCPtr(Iterator iterator) {
            if (iterator == null) {
                return 0L;
            }
            return iterator.swigCPtr;
        }

        public boolean isNot(Iterator iterator) {
            return NLETemplateJNI.SetInt_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public Iterator(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_SetInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int sizeImpl() {
        return NLETemplateJNI.SetInt_sizeImpl(this.swigCPtr, this);
    }

    public Iterator begin() {
        return new Iterator(NLETemplateJNI.SetInt_begin(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        NLETemplateJNI.SetInt_clear(this.swigCPtr, this);
    }

    public Iterator end() {
        return new Iterator(NLETemplateJNI.SetInt_end(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return NLETemplateJNI.SetInt_isEmpty(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.ies.nle.editor_jni.SetInt$1, java.util.Iterator<java.lang.Integer>] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<Integer> iterator() {
        ?? r0 = new java.util.Iterator<Integer>() { // from class: com.bytedance.ies.nle.editor_jni.SetInt.1
            public Iterator curr;
            public Iterator end;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.curr.isNot(this.end);
            }

            public java.util.Iterator<Integer> init() {
                this.curr = SetInt.this.begin();
                this.end = SetInt.this.end();
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer numValueOf = Integer.valueOf(this.curr.derefUnchecked());
                this.curr.incrementUnchecked();
                return numValueOf;
            }
        };
        r0.init();
        return r0;
    }

    public SetInt() {
        this(NLETemplateJNI.new_SetInt__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public SetInt(SetInt setInt) {
        this(NLETemplateJNI.new_SetInt__SWIG_1(getCPtr(setInt), setInt), true);
    }

    private boolean containsImpl(int i) {
        return NLETemplateJNI.SetInt_containsImpl(this.swigCPtr, this, i);
    }

    public static long getCPtr(SetInt setInt) {
        if (setInt == null) {
            return 0L;
        }
        return setInt.swigCPtr;
    }

    private boolean hasNextImpl(Iterator iterator) {
        return NLETemplateJNI.SetInt_hasNextImpl(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    private boolean removeImpl(int i) {
        return NLETemplateJNI.SetInt_removeImpl(this.swigCPtr, this, i);
    }

    public boolean add(int i) {
        return NLETemplateJNI.SetInt_add(this.swigCPtr, this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Integer> collection) {
        java.util.Iterator<? extends Integer> it2 = collection.iterator();
        boolean zAdd = false;
        while (it2.hasNext()) {
            zAdd |= add(it2.next());
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return containsImpl(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        java.util.Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return removeImpl(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        java.util.Iterator<?> it2 = collection.iterator();
        boolean zRemove = false;
        while (it2.hasNext()) {
            zRemove |= remove(it2.next());
        }
        return zRemove;
    }

    public SetInt(Collection<? extends Integer> collection) {
        this();
        addAll(collection);
    }

    public SetInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
