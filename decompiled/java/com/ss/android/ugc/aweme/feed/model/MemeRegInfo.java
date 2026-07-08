package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MemeRegInfo implements Serializable {

    @C09CT("meme_video_reg")
    public MemeVideoReg memeVideoReg;

    public MemeRegInfo() {
        this(null);
    }

    public MemeRegInfo(MemeVideoReg memeVideoReg) {
        this.memeVideoReg = memeVideoReg;
    }

    public final void setMemeVideoReg(MemeVideoReg memeVideoReg) {
        this.memeVideoReg = memeVideoReg;
    }
}
