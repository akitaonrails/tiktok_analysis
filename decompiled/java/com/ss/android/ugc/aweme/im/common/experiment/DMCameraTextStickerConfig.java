package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class DMCameraTextStickerConfig implements Serializable {

    @C09CT("color")
    public final String color;

    @C09CT("enabled")
    public final int enabled;

    @C09CT("font")
    public final long font;

    @C09CT("fontSize")
    public final int fontSize;

    @C09CT("location")
    public final int location;

    @C09CT("style")
    public final int style;

    public DMCameraTextStickerConfig() {
        this(0, 0, 0, 6792500966827495950L, 28, "0xFFFFFF");
    }

    public DMCameraTextStickerConfig(int i, int i2, int i3, long j, int i4, String str) {
        this.enabled = i;
        this.style = i2;
        this.location = i3;
        this.font = j;
        this.fontSize = i4;
        this.color = str;
    }
}
