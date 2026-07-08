package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class MaskLayer implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("mask_layer_type")
    public int maskLayerType;

    @C09CT("punish_info")
    public PunishEventInfo punish_info;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("title")
    public Text title;

    public static final class Companion {
    }

    public MaskLayer() {
        this(null, null, 0, null);
    }

    public final boolean isR2OrUnknownMask() {
        int i = this.maskLayerType;
        return i == 1 || i == 0;
    }

    public final void setMaskLayerType(int i) {
        this.maskLayerType = i;
    }

    public final void setPunish_info(PunishEventInfo punishEventInfo) {
        this.punish_info = punishEventInfo;
    }

    public final void setSubTitle(Text text) {
        this.subTitle = text;
    }

    public final void setTitle(Text text) {
        this.title = text;
    }

    public MaskLayer(Text text, Text text2, int i, PunishEventInfo punishEventInfo) {
        this.title = text;
        this.subTitle = text2;
        this.maskLayerType = i;
        this.punish_info = punishEventInfo;
    }
}
