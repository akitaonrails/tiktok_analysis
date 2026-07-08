package com.bytedance.ies.effecteditor.swig;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public class EEStdStringToStringUnorderedMap extends AbstractMap<String, String> {
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
                    EffectEditorJniJNI.delete_EEStdStringToStringUnorderedMap_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(EffectEditorJniJNI.EEStdStringToStringUnorderedMap_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public String getValue() {
            return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_Iterator_getValue(this.swigCPtr, this);
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
            return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(String str) {
            EffectEditorJniJNI.EEStdStringToStringUnorderedMap_Iterator_setValue(this.swigCPtr, this, str);
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
                EffectEditorJniJNI.delete_EEStdStringToStringUnorderedMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(EffectEditorJniJNI.EEStdStringToStringUnorderedMap_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(EffectEditorJniJNI.EEStdStringToStringUnorderedMap_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMap_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.effecteditor.swig.EEStdStringToStringUnorderedMap$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<String, String>() { // from class: com.bytedance.ies.effecteditor.swig.EEStdStringToStringUnorderedMap.1
                public Iterator iterator;

                @Override // java.util.Map.Entry
                public String getKey() {
                    return this.iterator.getKey();
                }

                @Override // java.util.Map.Entry
                public String getValue() {
                    return this.iterator.getValue();
                }

                public Map.Entry<String, String> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public String setValue(String str) {
                    String value = this.iterator.getValue();
                    this.iterator.setValue(str);
                    return value;
                }
            };
            r0.init(iteratorBegin);
            hashSet.add(r0);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_isEmpty(this.swigCPtr, this);
    }

    public EEStdStringToStringUnorderedMap() {
        this(EffectEditorJniJNI.new_EEStdStringToStringUnorderedMap__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringToStringUnorderedMap(EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        this(EffectEditorJniJNI.new_EEStdStringToStringUnorderedMap__SWIG_1(getCPtr(eEStdStringToStringUnorderedMap), eEStdStringToStringUnorderedMap), true);
    }

    private boolean containsImpl(String str) {
        return EffectEditorJniJNI.EEStdStringToStringUnorderedMap_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(EffectEditorJniJNI.EEStdStringToStringUnorderedMap_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap) {
        if (eEStdStringToStringUnorderedMap == null) {
            return 0L;
        }
        return eEStdStringToStringUnorderedMap.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMap_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
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

    public EEStdStringToStringUnorderedMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, String str2) {
        EffectEditorJniJNI.EEStdStringToStringUnorderedMap_putUnchecked(this.swigCPtr, this, str, str2);
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
