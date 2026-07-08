package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class TempPublishAnchorModel {

    @C09CT("anchor_business_type")
    public int anchorBusinessType;

    @C09CT("anchor_content")
    public String anchorContent;

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("source")
    public int source;

    public TempPublishAnchorModel() {
        this(-1, 0, null, null);
    }

    public TempPublishAnchorModel(int i, int i2, String str, String str2) {
        this.anchorBusinessType = i;
        this.source = i2;
        this.anchorId = str;
        this.anchorContent = str2;
    }
}
