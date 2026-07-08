package com.ss.android.ugc.aweme.signaling.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class PostUplinkBatchResponse {

    @C09CT("biz_data_list")
    public List<? extends UplinkMessageResponse> bizDataList;

    public PostUplinkBatchResponse() {
        this(null, 1, null);
    }

    public PostUplinkBatchResponse(List<? extends UplinkMessageResponse> list) {
        this.bizDataList = list;
    }

    public PostUplinkBatchResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
