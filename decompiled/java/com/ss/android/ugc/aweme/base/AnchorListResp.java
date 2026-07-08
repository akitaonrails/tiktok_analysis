package com.ss.android.ugc.aweme.base;

import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorListResp {

    @C09CT("anchor_list")
    public final List<AnchorPublishStruct> anchorList;

    @C09CT("register_region")
    public final String registerRegion;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AnchorListResp(int i, String str, List<AnchorPublishStruct> list, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.anchorList = list;
        this.registerRegion = str2;
    }
}
