package com.ss.android.ugc.aweme.tag.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionCheckSingleTypeResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("block_type")
    public int blockType;

    @C09CT("mention_type")
    public int mentionType;

    public MentionCheckSingleTypeResult() {
        this(0, 0);
    }

    public final void setBlockType(int i) {
        this.blockType = i;
    }

    public final void setMentionType(int i) {
        this.mentionType = i;
    }

    public MentionCheckSingleTypeResult(int i, int i2) {
        this.mentionType = i;
        this.blockType = i2;
    }
}
