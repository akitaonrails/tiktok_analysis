package com.bytedance.live.render.engine.sticker;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerResource {

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("path")
    public final String path;

    @C09CT("sticker_panel")
    public final String stickerPanel;

    public StickerResource() {
        this("", "", "");
    }

    public StickerResource(String str, String str2, String str3) {
        this.path = str;
        this.stickerPanel = str2;
        this.msgId = str3;
    }
}
