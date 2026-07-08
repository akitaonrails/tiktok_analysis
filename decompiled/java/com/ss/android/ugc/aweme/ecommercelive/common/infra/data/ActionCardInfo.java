package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ActionCardInfo {

    @C09CT("action_scene")
    public Integer actionScene;

    @C09CT("button_style")
    public BuyButtonProperty buttonStyle;

    @C09CT("show_time_ms")
    public Long showTimeMs;

    @C09CT("ui_type")
    public Integer uiType;

    public ActionCardInfo() {
        this(null, null, null, null);
    }

    public ActionCardInfo(Integer num, Long l, Integer num2, BuyButtonProperty buyButtonProperty) {
        this.actionScene = num;
        this.showTimeMs = l;
        this.uiType = num2;
        this.buttonStyle = buyButtonProperty;
    }
}
