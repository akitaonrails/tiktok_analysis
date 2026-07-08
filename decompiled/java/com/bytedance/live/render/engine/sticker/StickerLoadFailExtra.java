package com.bytedance.live.render.engine.sticker;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerLoadFailExtra {

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("path")
    public final String path;

    public StickerLoadFailExtra() {
        this("", "");
    }

    public StickerLoadFailExtra(String str, String str2) {
        this.path = str;
        this.msgId = str2;
    }
}
