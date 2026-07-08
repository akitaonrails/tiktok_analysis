package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ContainerConfigModel {

    @C09CT("block_list")
    public final List<String> componentBlockList;

    public ContainerConfigModel() {
        this(null);
    }

    public ContainerConfigModel(List<String> list) {
        this.componentBlockList = list;
    }
}
