package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;

/* JADX INFO: loaded from: classes4.dex */
public class PBInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "pb_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() throws Throwable {
        AbstractC20513081v.invokeMethod("com.bytedance.android.live.base.model.proto.ProtocolBuffersCollector", "init");
    }
}
