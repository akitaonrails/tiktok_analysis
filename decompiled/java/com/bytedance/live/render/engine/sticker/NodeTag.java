package com.bytedance.live.render.engine.sticker;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class NodeTag {

    @C09CT("effect_id")
    public final long effectId;

    @C09CT("effect_type")
    public final int effectType;

    @C09CT("gift_id")
    public final long giftId;

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("sticker_panel")
    public final String stickerPanel;

    public NodeTag() {
        this(0, "", 0L, 0L, "");
    }

    public NodeTag(int i, String str, long j, long j2, String str2) {
        this.effectType = i;
        this.stickerPanel = str;
        this.effectId = j;
        this.giftId = j2;
        this.msgId = str2;
    }
}
