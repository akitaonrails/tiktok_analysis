package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class StoryBlockInfo implements Serializable {

    @C09CT("life_story_block")
    public boolean isBlock;

    @C09CT("life_story_blocked")
    public boolean isBlocked;

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
