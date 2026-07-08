package com.ss.android.ugc.aweme.tools.music.music.collect.count.api;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class CollectCountResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("count")
    public Integer count;

    public final Integer getCount() {
        return this.count;
    }

    public final void setCount(Integer num) {
        this.count = num;
    }
}
