package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C0I98;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;

/* JADX INFO: loaded from: classes15.dex */
public final class RecentActivitySticker {

    @C09CT("creator_user_id")
    public final long creatorId;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("sticker_set_id")
    public final long setId;

    @C09CT("sticker_id")
    public final long stickerId;

    @C09CT("sticker_type")
    public final int stickerType;

    @C09CT("sticker_url")
    public final String url;

    public RecentActivitySticker() {
        this("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L);
    }

    public final SetSticker LIZ() {
        UrlModel urlModelLJIILIIL = C0I98.LJIILIIL(this.url);
        long j = this.stickerId;
        long j2 = this.setId;
        long j3 = this.creatorId;
        int i = this.stickerType;
        return new SetSticker(Long.valueOf(j), null, null, new StickerUrlStruct(urlModelLJIILIIL, urlModelLJIILIIL, urlModelLJIILIIL, null), null, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), null, null, null, null, null);
    }

    public RecentActivitySticker(String str, long j, long j2, int i, String str2, long j3) {
        this.emoji = str;
        this.stickerId = j;
        this.setId = j2;
        this.stickerType = i;
        this.url = str2;
        this.creatorId = j3;
    }
}
