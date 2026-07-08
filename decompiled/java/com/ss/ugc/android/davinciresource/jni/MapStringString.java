package com.ss.ugc.android.davinciresource.jni;

import X.C1ECG;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public class MapStringString extends AbstractMap<String, String> {
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
                    DavinciResourceJniJNI.delete_MapStringString_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return DavinciResourceJniJNI.MapStringString_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(DavinciResourceJniJNI.MapStringString_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public String getValue() {
            return DavinciResourceJniJNI.MapStringString_Iterator_getValue(this.swigCPtr, this);
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
            return DavinciResourceJniJNI.MapStringString_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(String str) {
            DavinciResourceJniJNI.MapStringString_Iterator_setValue(this.swigCPtr, this, str);
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
                DavinciResourceJniJNI.delete_MapStringString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(DavinciResourceJniJNI.MapStringString_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(DavinciResourceJniJNI.MapStringString_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return DavinciResourceJniJNI.MapStringString_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        DavinciResourceJniJNI.MapStringString_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            C1ECG c1ecg = new C1ECG(this);
            c1ecg.LL = iteratorBegin;
            hashSet.add(c1ecg);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return DavinciResourceJniJNI.MapStringString_isEmpty(this.swigCPtr, this);
    }

    public MapStringString() {
        this(DavinciResourceJniJNI.new_MapStringString__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public MapStringString(MapStringString mapStringString) {
        this(DavinciResourceJniJNI.new_MapStringString__SWIG_1(getCPtr(mapStringString), mapStringString), true);
    }

    private boolean containsImpl(String str) {
        return DavinciResourceJniJNI.MapStringString_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(DavinciResourceJniJNI.MapStringString_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(MapStringString mapStringString) {
        if (mapStringString == null) {
            return 0L;
        }
        return mapStringString.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        DavinciResourceJniJNI.MapStringString_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        return iteratorFind.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        String value = iteratorFind.getValue();
        removeUnchecked(iteratorFind);
        return value;
    }

    public MapStringString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, String str2) {
        DavinciResourceJniJNI.MapStringString_putUnchecked(this.swigCPtr, this, str, str2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        Iterator iteratorFind = find(str);
        if (iteratorFind.isNot(end())) {
            String value = iteratorFind.getValue();
            iteratorFind.setValue(str2);
            return value;
        }
        putUnchecked(str, str2);
        return null;
    }
}
