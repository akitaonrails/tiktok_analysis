package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class LinkData implements Serializable {

    @C09CT("icon")
    public ImageDO icon;

    @C09CT("icon_position")
    public String iconPosition;

    @C09CT("scheme")
    public String scheme;

    @C09CT("text")
    public TextDO text;

    public LinkData() {
        this(null, null, null, null);
    }

    public final void setIcon(ImageDO imageDO) {
        this.icon = imageDO;
    }

    public final void setIconPosition(String str) {
        this.iconPosition = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setText(TextDO textDO) {
        this.text = textDO;
    }

    public LinkData(ImageDO imageDO, TextDO textDO, String str, String str2) {
        this.icon = imageDO;
        this.text = textDO;
        this.iconPosition = str;
        this.scheme = str2;
    }
}
