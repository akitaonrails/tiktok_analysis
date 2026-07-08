package com.bytedance.android.livesdk.signaling.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class BaseDownlinkData implements Serializable {

    @C09CT("biz_push_tsms")
    public final Long bizPushTsms;

    public final Long getBizPushTsms() {
        return this.bizPushTsms;
    }
}
