package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpPostInfo implements Serializable {

    @C09CT("comment_button_text")
    public String commentButtonText;

    @C09CT("mob_extra")
    public Map<String, String> mobExtra;

    public HelpPostInfo() {
        this("", new HashMap());
    }

    public final void setCommentButtonText(String str) {
        this.commentButtonText = str;
    }

    public final void setMobExtra(Map<String, String> map) {
        this.mobExtra = map;
    }

    public HelpPostInfo(String str, Map<String, String> map) {
        this.commentButtonText = str;
        this.mobExtra = map;
    }
}
