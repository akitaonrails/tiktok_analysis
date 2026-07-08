package com.bytedance.live.render.engine.sticker;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerReplayData {

    @C09CT("effect_id")
    public final long effectId;

    @C09CT("msg_id")
    public final long msgId;

    @C09CT("path")
    public final String path;

    public StickerReplayData() {
        this(0L, "", 0L);
    }

    public StickerReplayData(long j, String str, long j2) {
        this.effectId = j;
        this.path = str;
        this.msgId = j2;
    }
}
