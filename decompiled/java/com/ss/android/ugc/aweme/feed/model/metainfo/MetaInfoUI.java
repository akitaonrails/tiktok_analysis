package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoUI implements Serializable {

    @C09CT("action")
    public MetaInfoAction action;

    @C09CT("content")
    public MetaInfoContent content;

    @C09CT("head_icon")
    public String headIcon;

    public MetaInfoUI() {
        this("", null, null);
    }

    public MetaInfoUI(String str, MetaInfoContent metaInfoContent, MetaInfoAction metaInfoAction) {
        this.headIcon = str;
        this.content = metaInfoContent;
        this.action = metaInfoAction;
    }
}
