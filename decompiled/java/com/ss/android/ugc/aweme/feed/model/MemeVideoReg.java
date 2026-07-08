package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class MemeVideoReg implements Serializable {

    @C09CT("can_boost_meme")
    public int canBoostMeme;

    @C09CT("is_meme")
    public int isMeme;

    public MemeVideoReg() {
        this(0, 0);
    }

    public final int isMeme() {
        return this.isMeme;
    }

    public final void setCanBoostMeme(int i) {
        this.canBoostMeme = i;
    }

    public final void setMeme(int i) {
        this.isMeme = i;
    }

    public MemeVideoReg(int i, int i2) {
        this.isMeme = i;
        this.canBoostMeme = i2;
    }
}
