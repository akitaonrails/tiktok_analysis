package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class DramaBlockingAdModel implements Serializable {

    @C09CT("continue_text")
    public final String countDownText;

    @C09CT("drama_block_time")
    public final int dramaBlockTime;

    @C09CT("finish_text")
    public final String finishedText;

    @C09CT("is_block_type")
    public final boolean isBlockType;

    @C09CT("swipe_text")
    public final String swipeText;

    public DramaBlockingAdModel() {
        this(false, 0, null, null, null);
    }

    public final boolean isBlockType() {
        return this.isBlockType;
    }

    public DramaBlockingAdModel(boolean z, int i, String str, String str2, String str3) {
        this.isBlockType = z;
        this.dramaBlockTime = i;
        this.countDownText = str;
        this.finishedText = str2;
        this.swipeText = str3;
    }
}
