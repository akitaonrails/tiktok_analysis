package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageAIGCQueryResponse {

    @C09CT("ai_url_info_list")
    public final List<AiUrlInfo> data;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageAIGCQueryResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Text2ImageAIGCQueryResponse(List<AiUrlInfo> list) {
        this.data = list;
    }

    public /* synthetic */ Text2ImageAIGCQueryResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
