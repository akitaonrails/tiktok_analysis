package com.bytedance.tt.reliability.queuemonitor.impl;

import com.bytedance.tt.reliability.queuemonitor.model.StackInfo;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class LruStackInfoCache extends LinkedHashMap<StackInfo, AtomicInteger> {
    public LruStackInfoCache() {
        super(64, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<StackInfo, AtomicInteger>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<StackInfo, AtomicInteger>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<StackInfo> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<AtomicInteger> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<StackInfo> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<AtomicInteger> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof StackInfo)) {
            return false;
        }
        return containsKey((StackInfo) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof AtomicInteger)) {
            return false;
        }
        return containsValue((AtomicInteger) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ AtomicInteger get(Object obj) {
        if (!(obj instanceof StackInfo)) {
            return null;
        }
        return get((StackInfo) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ AtomicInteger remove(Object obj) {
        if (!(obj instanceof StackInfo)) {
            return null;
        }
        return remove((StackInfo) obj);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<StackInfo, AtomicInteger> entry) {
        if (size() > 64) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(StackInfo stackInfo) {
        return super.containsKey((Object) stackInfo);
    }

    public /* bridge */ boolean containsValue(AtomicInteger atomicInteger) {
        return super.containsValue((Object) atomicInteger);
    }

    public /* bridge */ AtomicInteger get(StackInfo stackInfo) {
        return get((Object) stackInfo);
    }

    public /* bridge */ AtomicInteger remove(StackInfo stackInfo) {
        return remove((Object) stackInfo);
    }

    public final /* bridge */ AtomicInteger getOrDefault(Object obj, AtomicInteger atomicInteger) {
        if (!(obj instanceof StackInfo)) {
            return atomicInteger;
        }
        return getOrDefault((StackInfo) obj, atomicInteger);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof StackInfo) || !(obj2 instanceof AtomicInteger)) {
            return false;
        }
        return remove((StackInfo) obj, (AtomicInteger) obj2);
    }

    public /* bridge */ AtomicInteger getOrDefault(StackInfo stackInfo, AtomicInteger atomicInteger) {
        return getOrDefault((Object) stackInfo, atomicInteger);
    }

    public /* bridge */ boolean remove(StackInfo stackInfo, AtomicInteger atomicInteger) {
        return super.remove((Object) stackInfo, (Object) atomicInteger);
    }
}
