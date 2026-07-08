package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoFirstShow implements Serializable {

    @C09CT("next_cid")
    public Long nextCid;

    public final Long getNextCid() {
        return this.nextCid;
    }

    public final void setNextCid(Long l) {
        this.nextCid = l;
    }
}
