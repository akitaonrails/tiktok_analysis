package com.ss.android.ugc.aweme.feed.model.mention;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoMentionInfoStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("cover_mentioned_user_infos")
    public List<CoverMentionedUserStruct> coverMentionedUserInfos;

    @C09CT("is_mentioned")
    public boolean isMentioned;

    public static final class Companion {
    }

    public VideoMentionInfoStruct() {
        this(false, null);
    }

    public final boolean isMentioned() {
        return this.isMentioned;
    }

    public VideoMentionInfoStruct(boolean z, List<CoverMentionedUserStruct> list) {
        this.isMentioned = z;
        this.coverMentionedUserInfos = list;
    }
}
