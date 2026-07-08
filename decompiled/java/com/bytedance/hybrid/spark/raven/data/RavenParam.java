package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenParam implements Serializable {

    @C09CT("is_event")
    public final Boolean isEvent;

    @C09CT("node_update_list")
    public final List<NodeUpdate> nodeUpdateList;

    @C09CT("page_id")
    public final String pageId;

    public RavenParam() {
        this(null, null, null);
    }

    public final Boolean isEvent() {
        return this.isEvent;
    }

    public RavenParam(Boolean bool, String str, List<NodeUpdate> list) {
        this.isEvent = bool;
        this.pageId = str;
        this.nodeUpdateList = list;
    }
}
