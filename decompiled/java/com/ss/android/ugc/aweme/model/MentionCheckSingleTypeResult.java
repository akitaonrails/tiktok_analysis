package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionCheckSingleTypeResult {

    @C09CT("block_type")
    public final long blockType;

    @C09CT("mention_type")
    public final long mentionType;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.mentionType) * 31) + C786410Ut5.Y2(this.blockType);
    }

    public MentionCheckSingleTypeResult() {
        this(0L, 0L);
    }

    public MentionCheckSingleTypeResult(long j, long j2) {
        this.mentionType = j;
        this.blockType = j2;
    }
}
