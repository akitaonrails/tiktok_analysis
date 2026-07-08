package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPowerListMemoryConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_modify_pool_size")
    public final boolean enableModifyPoolSize;

    @C09CT("pool_size_for_first_level")
    public final int poolSizeForFirstLevelComment;

    @C09CT("pool_size_for_second_level")
    public final int poolSizeForSecondLevelComment;

    public CommentPowerListMemoryConfig() {
        this(false, 5, 5);
    }

    public CommentPowerListMemoryConfig(boolean z, int i, int i2) {
        this.enableModifyPoolSize = z;
        this.poolSizeForFirstLevelComment = i;
        this.poolSizeForSecondLevelComment = i2;
    }
}
