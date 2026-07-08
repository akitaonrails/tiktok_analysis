package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;

/* JADX INFO: loaded from: classes29.dex */
public final class LabelInfoTemplate {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("text_content")
    public final String content;

    @C09CT("matched_friend")
    public final MatchedFriendStruct matchedFriendStruct;

    @C09CT("schema_url")
    public final String schema;

    @C09CT("view_type")
    public final int viewType;

    public LabelInfoTemplate(int i, String str, int i2, String str2, MatchedFriendStruct matchedFriendStruct) {
        this.viewType = i;
        this.content = str;
        this.actionType = i2;
        this.schema = str2;
        this.matchedFriendStruct = matchedFriendStruct;
    }
}
