package com.ss.android.ugc.aweme.wavepublish.monitor.callback;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishTimeoutConfigModel {
    public static final int $stable = 8;

    @C09CT("nodes")
    public final List<PublishNodeTimeout> nodes;

    public PublishTimeoutConfigModel() {
        this(null);
    }

    public PublishTimeoutConfigModel(List<PublishNodeTimeout> list) {
        this.nodes = list;
    }
}
