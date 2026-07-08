package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.InterfaceC1294060jmO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class RavenComponentBaseModel implements Serializable {

    @C09CT("events")
    public final Events events;

    @C09CT("page_info")
    public PageInfo pageInfo;

    public RavenComponentBaseModel() {
        this(null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEvents$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getPageInfo$annotations() {
    }

    public final Events getEvents() {
        return this.events;
    }

    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public final void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public RavenComponentBaseModel(Events events, PageInfo pageInfo) {
        this.events = events;
        this.pageInfo = pageInfo;
    }
}
