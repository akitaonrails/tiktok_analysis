package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class MapStrNLENodeSPtr extends AbstractMap<String, NLENode> {
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
                    NLEEditorJniJNI.delete_MapStrNLENodeSPtr_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String getKey() {
            return NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_getKey(this.swigCPtr, this);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public NLENode getValue() {
            long jMapStrNLENodeSPtr_Iterator_getValue = NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_getValue(this.swigCPtr, this);
            if (jMapStrNLENodeSPtr_Iterator_getValue == 0) {
                return null;
            }
            return new NLENode(jMapStrNLENodeSPtr_Iterator_getValue, true);
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
            return NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(NLENode nLENode) {
            NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_setValue(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
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
                NLEEditorJniJNI.delete_MapStrNLENodeSPtr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtr_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtr_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return NLEEditorJniJNI.MapStrNLENodeSPtr_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        NLEEditorJniJNI.MapStrNLENodeSPtr_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtr$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, NLENode>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<String, NLENode>() { // from class: com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtr.1
                public Iterator iterator;

                @Override // java.util.Map.Entry
                public String getKey() {
                    return this.iterator.getKey();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public NLENode getValue() {
                    return this.iterator.getValue();
                }

                public Map.Entry<String, NLENode> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public NLENode setValue(NLENode nLENode) {
                    NLENode value = this.iterator.getValue();
                    this.iterator.setValue(nLENode);
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
        return NLEEditorJniJNI.MapStrNLENodeSPtr_isEmpty(this.swigCPtr, this);
    }

    public MapStrNLENodeSPtr() {
        this(NLEEditorJniJNI.new_MapStrNLENodeSPtr__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public MapStrNLENodeSPtr(MapStrNLENodeSPtr mapStrNLENodeSPtr) {
        this(NLEEditorJniJNI.new_MapStrNLENodeSPtr__SWIG_1(getCPtr(mapStrNLENodeSPtr), mapStrNLENodeSPtr), true);
    }

    private boolean containsImpl(String str) {
        return NLEEditorJniJNI.MapStrNLENodeSPtr_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtr_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(MapStrNLENodeSPtr mapStrNLENodeSPtr) {
        if (mapStrNLENodeSPtr == null) {
            return 0L;
        }
        return mapStrNLENodeSPtr.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        NLEEditorJniJNI.MapStrNLENodeSPtr_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public NLENode get(Object obj) {
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
    public NLENode remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        NLENode value = iteratorFind.getValue();
        removeUnchecked(iteratorFind);
        return value;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MapStrNLENodeSPtr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, NLENode nLENode) {
        NLEEditorJniJNI.MapStrNLENodeSPtr_putUnchecked(this.swigCPtr, this, str, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public NLENode put(String str, NLENode nLENode) {
        Iterator iteratorFind = find(str);
        if (iteratorFind.isNot(end())) {
            NLENode value = iteratorFind.getValue();
            iteratorFind.setValue(nLENode);
            return value;
        }
        putUnchecked(str, nLENode);
        return null;
    }
}
