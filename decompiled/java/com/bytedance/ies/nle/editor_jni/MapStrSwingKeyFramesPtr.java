package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class MapStrSwingKeyFramesPtr extends AbstractMap<String, NLEKeyframe> {
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
                    NLEEditorJniJNI.delete_MapStrSwingKeyFramesPtr_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return NLEEditorJniJNI.MapStrSwingKeyFramesPtr_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(NLEEditorJniJNI.MapStrSwingKeyFramesPtr_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public NLEKeyframe getValue() {
            long jMapStrSwingKeyFramesPtr_Iterator_getValue = NLEEditorJniJNI.MapStrSwingKeyFramesPtr_Iterator_getValue(this.swigCPtr, this);
            if (jMapStrSwingKeyFramesPtr_Iterator_getValue == 0) {
                return null;
            }
            return new NLEKeyframe(jMapStrSwingKeyFramesPtr_Iterator_getValue, true);
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
            return NLEEditorJniJNI.MapStrSwingKeyFramesPtr_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(NLEKeyframe nLEKeyframe) {
            NLEEditorJniJNI.MapStrSwingKeyFramesPtr_Iterator_setValue(this.swigCPtr, this, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
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
                NLEEditorJniJNI.delete_MapStrSwingKeyFramesPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(NLEEditorJniJNI.MapStrSwingKeyFramesPtr_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(NLEEditorJniJNI.MapStrSwingKeyFramesPtr_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return NLEEditorJniJNI.MapStrSwingKeyFramesPtr_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        NLEEditorJniJNI.MapStrSwingKeyFramesPtr_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.nle.editor_jni.MapStrSwingKeyFramesPtr$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, NLEKeyframe>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<String, NLEKeyframe>() { // from class: com.bytedance.ies.nle.editor_jni.MapStrSwingKeyFramesPtr.1
                public Iterator iterator;

                @Override // java.util.Map.Entry
                public String getKey() {
                    return this.iterator.getKey();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public NLEKeyframe getValue() {
                    return this.iterator.getValue();
                }

                public Map.Entry<String, NLEKeyframe> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public NLEKeyframe setValue(NLEKeyframe nLEKeyframe) {
                    NLEKeyframe value = this.iterator.getValue();
                    this.iterator.setValue(nLEKeyframe);
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
        return NLEEditorJniJNI.MapStrSwingKeyFramesPtr_isEmpty(this.swigCPtr, this);
    }

    public MapStrSwingKeyFramesPtr() {
        this(NLEEditorJniJNI.new_MapStrSwingKeyFramesPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public MapStrSwingKeyFramesPtr(MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr) {
        this(NLEEditorJniJNI.new_MapStrSwingKeyFramesPtr__SWIG_1(getCPtr(mapStrSwingKeyFramesPtr), mapStrSwingKeyFramesPtr), true);
    }

    private boolean containsImpl(String str) {
        return NLEEditorJniJNI.MapStrSwingKeyFramesPtr_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(NLEEditorJniJNI.MapStrSwingKeyFramesPtr_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr) {
        if (mapStrSwingKeyFramesPtr == null) {
            return 0L;
        }
        return mapStrSwingKeyFramesPtr.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        NLEEditorJniJNI.MapStrSwingKeyFramesPtr_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public NLEKeyframe get(Object obj) {
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
    public NLEKeyframe remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        NLEKeyframe value = iteratorFind.getValue();
        removeUnchecked(iteratorFind);
        return value;
    }

    public MapStrSwingKeyFramesPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, NLEKeyframe nLEKeyframe) {
        NLEEditorJniJNI.MapStrSwingKeyFramesPtr_putUnchecked(this.swigCPtr, this, str, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public NLEKeyframe put(String str, NLEKeyframe nLEKeyframe) {
        Iterator iteratorFind = find(str);
        if (iteratorFind.isNot(end())) {
            NLEKeyframe value = iteratorFind.getValue();
            iteratorFind.setValue(nLEKeyframe);
            return value;
        }
        putUnchecked(str, nLEKeyframe);
        return null;
    }
}
