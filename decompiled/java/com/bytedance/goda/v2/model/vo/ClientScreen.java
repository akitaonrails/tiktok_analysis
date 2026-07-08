package com.bytedance.goda.v2.model.vo;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ClientScreen {

    @C09CT("height")
    public final Float height;

    @C09CT("is_pad")
    public final Boolean isPad;

    @C09CT("scale")
    public final Float scale;

    @C09CT("width")
    public final Float width;

    public ClientScreen(Float f, Float f2, Float f3, Boolean bool) {
        this.width = f;
        this.height = f2;
        this.scale = f3;
        this.isPad = bool;
    }
}
