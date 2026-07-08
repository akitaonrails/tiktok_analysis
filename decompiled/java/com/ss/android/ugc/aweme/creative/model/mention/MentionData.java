package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionData {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("mention_list")
    public final List<NetworkMentionDataItem> mentionData;

    @C09CT("prompt")
    public final String prompt;

    public MentionData() {
        this(null, Boolean.FALSE, null);
    }

    public MentionData(List<NetworkMentionDataItem> list, Boolean bool, String str) {
        this.mentionData = list;
        this.hasMore = bool;
        this.prompt = str;
    }
}
