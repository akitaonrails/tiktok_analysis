package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class GifEmojiResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("emoticon_data")
    public StickerBean stickers;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final StickerBean getStickers() {
        return this.stickers;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(StickerBean stickerBean) {
        this.stickers = stickerBean;
    }
}
