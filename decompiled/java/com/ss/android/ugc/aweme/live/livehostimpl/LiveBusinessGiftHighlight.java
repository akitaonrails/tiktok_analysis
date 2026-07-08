package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveBusinessGiftHighlight implements Serializable {
    public static final int $stable = 8;

    @C09CT("business_extra")
    public final String BusinessExtra;

    @C09CT("publish_page_params")
    public final PublishPageParams PublishPageParams;

    public LiveBusinessGiftHighlight() {
        this("", new PublishPageParams());
    }

    public final String getBusinessExtra() {
        return this.BusinessExtra;
    }

    public final PublishPageParams getPublishPageParams() {
        return this.PublishPageParams;
    }

    public LiveBusinessGiftHighlight(String str, PublishPageParams publishPageParams) {
        this.BusinessExtra = str;
        this.PublishPageParams = publishPageParams;
    }
}
