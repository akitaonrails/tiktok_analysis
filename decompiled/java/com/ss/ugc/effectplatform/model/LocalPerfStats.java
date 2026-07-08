package com.ss.ugc.effectplatform.model;

import X.C03W4;
import X.C13LQ;
import X.C1901507cb;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalPerfStats implements Map<String, Double>, C03W4 {
    public static final C1901507cb Companion = new C1901507cb();
    public static final Set<String> INCLUDED_METRICS = C13LQ.LJLIIL(new String[]{"algo_time", "render_time", "ve_post_process_time_ms", "gpu_buffer_swap_time_ms", "face_count", "effect_node_num", "render_wait_algo"});
    public final Map<String, Double> data;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: compute, reason: avoid collision after fix types in other method */
    public Double compute2(String str, BiFunction<? super String, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double compute(String str, BiFunction<? super String, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public Double computeIfAbsent2(String str, Function<? super String, ? extends Double> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double computeIfAbsent(String str, Function<? super String, ? extends Double> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public Double computeIfPresent2(String str, BiFunction<? super String, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double computeIfPresent(String str, BiFunction<? super String, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(String str) {
        return this.data.containsKey(str);
    }

    public boolean containsValue(double d) {
        return this.data.containsValue(Double.valueOf(d));
    }

    public Double get(String str) {
        return this.data.get(str);
    }

    public Set<Map.Entry<String, Double>> getEntries() {
        return this.data.entrySet();
    }

    public Set<String> getKeys() {
        return this.data.keySet();
    }

    public int getSize() {
        return this.data.size();
    }

    public Collection<Double> getValues() {
        return this.data.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    /* JADX INFO: renamed from: merge, reason: avoid collision after fix types in other method */
    public Double merge2(String str, Double d, BiFunction<? super Double, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double merge(String str, Double d, BiFunction<? super Double, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Double put(String str, double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double put(String str, Double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Double> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public Double putIfAbsent2(String str, Double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double putIfAbsent(String str, Double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public Double remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public Double replace2(String str, Double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Double replace(String str, Double d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, Double d, Double d2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, Double d, Double d2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super Double, ? extends Double> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Double>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Double> values() {
        return getValues();
    }

    public LocalPerfStats(Map<String, Double> map) {
        this.data = map;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        return containsValue(((Number) obj).doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public final /* bridge */ Double get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Double get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }
}
