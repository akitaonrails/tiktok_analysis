package com.ss.android.ugc.aweme.live.tab;

import X.C09CT;
import com.bytedance.android.livesdk.model.ItemTab;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveTabResponse extends BaseResponse {

    @C09CT("data")
    public final List<ItemTab> data;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveTabResponse(List<? extends ItemTab> list) {
        this.data = list;
    }
}
