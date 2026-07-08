package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.TextDO;

/* JADX INFO: loaded from: classes27.dex */
public final class GuideDO {

    @C09CT("right_icon")
    public final ImageDO endIcon;

    @C09CT("right_space")
    public final String endPadding;

    @C09CT("left_icon")
    public final ImageDO startIcon;

    @C09CT("left_space")
    public final String startPadding;

    @C09CT("title")
    public final TextDO text;

    public GuideDO() {
        this(null, null, null, null, null);
    }

    public GuideDO(ImageDO imageDO, ImageDO imageDO2, String str, String str2, TextDO textDO) {
        this.startIcon = imageDO;
        this.endIcon = imageDO2;
        this.startPadding = str;
        this.endPadding = str2;
        this.text = textDO;
    }
}
