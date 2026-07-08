package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C1201190hMb;
import X.C13BV;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import X.InterfaceC2337209Du;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendingTopicList extends BaseResponse implements InterfaceC1201180hMa, InterfaceC2337209Du, LazyParseTask<TrendingTopicList> {

    @C09CT("cursor")
    public final int cursor;

    @C09CT("device_type")
    public final int deviceType;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("category_list")
    public List<TrendingTopic> items;
    public transient String jsonRawData;
    public transient Callable<TrendingTopicList> lazyParseCallable;
    public C1494600ozq<?> requestInfo;

    public TrendingTopicList() {
        this(0, null, 0, 0, null, 31, null);
    }

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final boolean doesHaveMore() {
        return this.hasMore == 1;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final List<TrendingTopic> getItems() {
        return this.items;
    }

    public final String getJsonRawData() {
        return this.jsonRawData;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public Callable<TrendingTopicList> getLazyParseCallable() {
        return this.lazyParseCallable;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final void setItems(List<TrendingTopic> list) {
        this.items = list;
    }

    @Override // X.InterfaceC2337209Du
    public void setJsonData(String str) {
        this.jsonRawData = str;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public void setLazyParseCallable(Callable<TrendingTopicList> callable) {
        this.lazyParseCallable = callable;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        if (c1494600ozq != null) {
            this.requestInfo = c1494600ozq;
        }
    }

    public TrendingTopicList(int i, List<TrendingTopic> list, int i2, int i3, C1494600ozq<?> c1494600ozq) {
        this.deviceType = i;
        this.items = list;
        this.hasMore = i2;
        this.cursor = i3;
        this.requestInfo = c1494600ozq;
    }

    public TrendingTopicList(int i, List list, int i2, int i3, C1494600ozq c1494600ozq, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? C13BV.INSTANCE : list, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? null : c1494600ozq);
    }
}
