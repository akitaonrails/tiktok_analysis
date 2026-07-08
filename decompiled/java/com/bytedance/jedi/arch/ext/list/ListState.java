package com.bytedance.jedi.arch.ext.list;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C1252530ihP;
import X.C13BV;
import X.C1761680vwc;
import X.C1761690vwd;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ListState<T, P extends C1761680vwc> implements C004I {
    public final C1761690vwd isEmpty;
    public final List<T> list;
    public final AbstractC1252750ihl<List<T>> loadMore;
    public final P payload;
    public final AbstractC1252750ihl<List<T>> refresh;

    public final ListState<T, P> copy(P p, List<? extends T> list, AbstractC1252750ihl<? extends List<? extends T>> abstractC1252750ihl, AbstractC1252750ihl<? extends List<? extends T>> abstractC1252750ihl2, C1761690vwd c1761690vwd) {
        return new ListState<>(p, list, abstractC1252750ihl, abstractC1252750ihl2, c1761690vwd);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListState)) {
            return false;
        }
        ListState listState = (ListState) obj;
        return Intrinsics.LJFF(this.payload, listState.payload) && Intrinsics.LJFF(this.list, listState.list) && Intrinsics.LJFF(this.refresh, listState.refresh) && Intrinsics.LJFF(this.loadMore, listState.loadMore) && Intrinsics.LJFF(this.isEmpty, listState.isEmpty);
    }

    public int hashCode() {
        return (((((((this.payload.hashCode() * 31) + this.list.hashCode()) * 31) + this.refresh.hashCode()) * 31) + this.loadMore.hashCode()) * 31) + this.isEmpty.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListState(payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(", list=");
        sbLIZ.append(this.list);
        sbLIZ.append(", refresh=");
        sbLIZ.append(this.refresh);
        sbLIZ.append(", loadMore=");
        sbLIZ.append(this.loadMore);
        sbLIZ.append(", isEmpty=");
        sbLIZ.append(this.isEmpty);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1761690vwd getHasMore() {
        return this.payload.LIZIZ;
    }

    public final List<T> getList() {
        return this.list;
    }

    public final AbstractC1252750ihl<List<T>> getLoadMore() {
        return this.loadMore;
    }

    public final P getPayload() {
        return this.payload;
    }

    public final AbstractC1252750ihl<List<T>> getRefresh() {
        return this.refresh;
    }

    public final C1761690vwd isEmpty() {
        return this.isEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListState(P p, List<? extends T> list, AbstractC1252750ihl<? extends List<? extends T>> abstractC1252750ihl, AbstractC1252750ihl<? extends List<? extends T>> abstractC1252750ihl2, C1761690vwd c1761690vwd) {
        this.payload = p;
        this.list = list;
        this.refresh = abstractC1252750ihl;
        this.loadMore = abstractC1252750ihl2;
        this.isEmpty = c1761690vwd;
    }

    public ListState(C1761680vwc c1761680vwc, List list, AbstractC1252750ihl abstractC1252750ihl, AbstractC1252750ihl abstractC1252750ihl2, C1761690vwd c1761690vwd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1761680vwc, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C1252530ihP.LIZ : abstractC1252750ihl, (i & 8) != 0 ? C1252530ihP.LIZ : abstractC1252750ihl2, (i & 16) != 0 ? new C1761690vwd(false) : c1761690vwd);
    }
}
