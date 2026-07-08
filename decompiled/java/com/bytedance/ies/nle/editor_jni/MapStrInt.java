package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public class MapStrInt extends AbstractMap<String, Integer> {
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
                    NLEMediaPublicJniJNI.delete_MapStrInt_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return NLEMediaPublicJniJNI.MapStrInt_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(NLEMediaPublicJniJNI.MapStrInt_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public int getValue() {
            return NLEMediaPublicJniJNI.MapStrInt_Iterator_getValue(this.swigCPtr, this);
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
            return NLEMediaPublicJniJNI.MapStrInt_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(int i) {
            NLEMediaPublicJniJNI.MapStrInt_Iterator_setValue(this.swigCPtr, this, i);
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
                NLEMediaPublicJniJNI.delete_MapStrInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(NLEMediaPublicJniJNI.MapStrInt_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(NLEMediaPublicJniJNI.MapStrInt_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return NLEMediaPublicJniJNI.MapStrInt_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        NLEMediaPublicJniJNI.MapStrInt_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.nle.editor_jni.MapStrInt$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Integer>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<String, Integer>() { // from class: com.bytedance.ies.nle.editor_jni.MapStrInt.1
                public Iterator iterator;

                @Override // java.util.Map.Entry
                public String getKey() {
                    return this.iterator.getKey();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public Integer getValue() {
                    return Integer.valueOf(this.iterator.getValue());
                }

                public Map.Entry<String, Integer> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public Integer setValue(Integer num) {
                    Integer numValueOf = Integer.valueOf(this.iterator.getValue());
                    this.iterator.setValue(num.intValue());
                    return numValueOf;
                }
            };
            r0.init(iteratorBegin);
            hashSet.add(r0);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return NLEMediaPublicJniJNI.MapStrInt_isEmpty(this.swigCPtr, this);
    }

    public MapStrInt() {
        this(NLEMediaPublicJniJNI.new_MapStrInt__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public MapStrInt(MapStrInt mapStrInt) {
        this(NLEMediaPublicJniJNI.new_MapStrInt__SWIG_1(getCPtr(mapStrInt), mapStrInt), true);
    }

    private boolean containsImpl(String str) {
        return NLEMediaPublicJniJNI.MapStrInt_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(NLEMediaPublicJniJNI.MapStrInt_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(MapStrInt mapStrInt) {
        if (mapStrInt == null) {
            return 0L;
        }
        return mapStrInt.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        NLEMediaPublicJniJNI.MapStrInt_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Integer get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        return Integer.valueOf(iteratorFind.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Integer remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(iteratorFind.getValue());
        removeUnchecked(iteratorFind);
        return numValueOf;
    }

    public MapStrInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, int i) {
        NLEMediaPublicJniJNI.MapStrInt_putUnchecked(this.swigCPtr, this, str, i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Integer put(String str, Integer num) {
        Iterator iteratorFind = find(str);
        if (iteratorFind.isNot(end())) {
            Integer numValueOf = Integer.valueOf(iteratorFind.getValue());
            iteratorFind.setValue(num.intValue());
            return numValueOf;
        }
        putUnchecked(str, num.intValue());
        return null;
    }
}
