package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class UnorderedMapStrStr extends AbstractMap<String, String> {
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
                    NLEEditorJniJNI.delete_UnorderedMapStrStr_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public String getValue() {
            return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(this.swigCPtr, this);
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
            return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(String str) {
            NLEEditorJniJNI.UnorderedMapStrStr_Iterator_setValue(this.swigCPtr, this, str);
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
                NLEEditorJniJNI.delete_UnorderedMapStrStr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return NLEEditorJniJNI.UnorderedMapStrStr_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        NLEEditorJniJNI.UnorderedMapStrStr_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<String, String>() { // from class: com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr.1
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
        return NLEEditorJniJNI.UnorderedMapStrStr_isEmpty(this.swigCPtr, this);
    }

    public UnorderedMapStrStr() {
        this(NLEEditorJniJNI.new_UnorderedMapStrStr__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public UnorderedMapStrStr(UnorderedMapStrStr unorderedMapStrStr) {
        this(NLEEditorJniJNI.new_UnorderedMapStrStr__SWIG_1(getCPtr(unorderedMapStrStr), unorderedMapStrStr), true);
    }

    private boolean containsImpl(String str) {
        return NLEEditorJniJNI.UnorderedMapStrStr_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(UnorderedMapStrStr unorderedMapStrStr) {
        if (unorderedMapStrStr == null) {
            return 0L;
        }
        return unorderedMapStrStr.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        NLEEditorJniJNI.UnorderedMapStrStr_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UnorderedMapStrStr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, String str2) {
        NLEEditorJniJNI.UnorderedMapStrStr_putUnchecked(this.swigCPtr, this, str, str2);
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
