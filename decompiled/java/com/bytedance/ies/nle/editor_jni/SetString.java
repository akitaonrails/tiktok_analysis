package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes36.dex */
public class SetString extends AbstractSet<String> {
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
                    NLETemplateJNI.delete_SetString_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String derefUnchecked() {
            return NLETemplateJNI.SetString_Iterator_derefUnchecked(this.swigCPtr, this);
        }

        public void incrementUnchecked() {
            NLETemplateJNI.SetString_Iterator_incrementUnchecked(this.swigCPtr, this);
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
            return NLETemplateJNI.SetString_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
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
                NLETemplateJNI.delete_SetString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int sizeImpl() {
        return NLETemplateJNI.SetString_sizeImpl(this.swigCPtr, this);
    }

    public Iterator begin() {
        return new Iterator(NLETemplateJNI.SetString_begin(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        NLETemplateJNI.SetString_clear(this.swigCPtr, this);
    }

    public Iterator end() {
        return new Iterator(NLETemplateJNI.SetString_end(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return NLETemplateJNI.SetString_isEmpty(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.ies.nle.editor_jni.SetString$1, java.util.Iterator<java.lang.String>] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<String> iterator() {
        ?? r0 = new java.util.Iterator<String>() { // from class: com.bytedance.ies.nle.editor_jni.SetString.1
            public Iterator curr;
            public Iterator end;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.curr.isNot(this.end);
            }

            public java.util.Iterator<String> init() {
                this.curr = SetString.this.begin();
                this.end = SetString.this.end();
                return this;
            }

            @Override // java.util.Iterator
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String strDerefUnchecked = this.curr.derefUnchecked();
                this.curr.incrementUnchecked();
                return strDerefUnchecked;
            }
        };
        r0.init();
        return r0;
    }

    public SetString() {
        this(NLETemplateJNI.new_SetString__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public SetString(SetString setString) {
        this(NLETemplateJNI.new_SetString__SWIG_1(getCPtr(setString), setString), true);
    }

    private boolean containsImpl(String str) {
        return NLETemplateJNI.SetString_containsImpl(this.swigCPtr, this, str);
    }

    public static long getCPtr(SetString setString) {
        if (setString == null) {
            return 0L;
        }
        return setString.swigCPtr;
    }

    private boolean hasNextImpl(Iterator iterator) {
        return NLETemplateJNI.SetString_hasNextImpl(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    private boolean removeImpl(String str) {
        return NLETemplateJNI.SetString_removeImpl(this.swigCPtr, this, str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends String> collection) {
        java.util.Iterator<? extends String> it2 = collection.iterator();
        boolean zAdd = false;
        while (it2.hasNext()) {
            zAdd |= add(it2.next());
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
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
        if (!(obj instanceof String)) {
            return false;
        }
        return removeImpl((String) obj);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public SetString(Collection<? extends String> collection) {
        this();
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(String str) {
        return NLETemplateJNI.SetString_add(this.swigCPtr, this, str);
    }

    public SetString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
