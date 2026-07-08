package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SocialAvatarReactionResult {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("social_avatar_sticker_result_entry")
    public final List<SocialAvatarResultEntry> socialAvatarResultList;

    @C09CT("count")
    public final long totalCount;

    public SocialAvatarReactionResult() {
        this(false, 0L, 0L, null);
    }

    public SocialAvatarReactionResult(boolean z, long j, long j2, List<SocialAvatarResultEntry> list) {
        this.hasMore = z;
        this.nextCursor = j;
        this.totalCount = j2;
        this.socialAvatarResultList = list;
    }
}
