package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class ECMixMallBlockRunnableOptModel {

    @C09CT("block_duration")
    public final long blockDuration;

    @C09CT("block_list")
    public final List<String> blockList;

    @C09CT("switch")
    public final int blockType;

    @C09CT("enable")
    public final boolean enable;

    public ECMixMallBlockRunnableOptModel() {
        this(false, 0, 1000L, null);
    }

    public ECMixMallBlockRunnableOptModel(boolean z, int i, long j, List<String> list) {
        this.enable = z;
        this.blockType = i;
        this.blockDuration = j;
        this.blockList = list;
    }
}
