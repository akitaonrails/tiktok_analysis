package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import X.C698190Ra5;

/* JADX INFO: loaded from: classes31.dex */
public final class TextEndIcon {

    @C09CT("color")
    public final Integer color;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final C698190Ra5 icon;

    @C09CT("padding")
    public final Integer padding;

    @C09CT("radius")
    public final Float radius;

    @C09CT("width")
    public final Integer width;

    public TextEndIcon() {
        this(null, null, null, null, null, null);
    }

    public TextEndIcon(Integer num, Float f, Integer num2, Integer num3, Integer num4, C698190Ra5 c698190Ra5) {
        this.padding = num;
        this.radius = f;
        this.width = num2;
        this.height = num3;
        this.color = num4;
        this.icon = c698190Ra5;
    }
}
