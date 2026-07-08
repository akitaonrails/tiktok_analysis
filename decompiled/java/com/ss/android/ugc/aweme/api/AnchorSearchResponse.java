package com.ss.android.ugc.aweme.api;

import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorSearchResponse {

    @C09CT("ranked_anchor_list")
    public final List<AnchorPublishStruct> rankedAnchorList;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AnchorSearchResponse(int i, String str, List<AnchorPublishStruct> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.rankedAnchorList = list;
    }
}
