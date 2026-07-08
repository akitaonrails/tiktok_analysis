package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class NewsAnchorEditInfo {

    @C09CT("action")
    public final Integer action;

    @C09CT("news_anchor_content")
    public final CreateAnchorInfo anchorContent;

    public NewsAnchorEditInfo(Integer num, CreateAnchorInfo createAnchorInfo) {
        this.action = num;
        this.anchorContent = createAnchorInfo;
    }
}
