package com.ss.android.ugc.aweme.signaling.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class PostUplinkBatchRequest {

    @C09CT("biz_data_list")
    public List<? extends UplinkMessageRequest> bizDataList;

    public PostUplinkBatchRequest() {
        this(null, 1, null);
    }

    public PostUplinkBatchRequest(List<? extends UplinkMessageRequest> list) {
        this.bizDataList = list;
    }

    public PostUplinkBatchRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
