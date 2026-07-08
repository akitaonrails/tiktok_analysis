package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ToastContent implements Serializable {

    @C09CT("duration")
    public final Integer duration;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_height")
    public final Integer iconHeight;

    @C09CT("icon_width")
    public final Integer iconWidth;

    @C09CT("message")
    public final String message;

    @C09CT("post_action_payload")
    public final ButtonActionPayload postActionPayload;

    @C09CT("post_action_type")
    public final Integer postActionType;

    @C09CT("toast_type")
    public final Integer toastType;

    public ToastContent() {
        this(null, null, null, null, null, null, null, null);
    }

    public ToastContent(Integer num, String str, Integer num2, Integer num3, String str2, Integer num4, Integer num5, ButtonActionPayload buttonActionPayload) {
        this.duration = num;
        this.icon = str;
        this.iconHeight = num2;
        this.iconWidth = num3;
        this.message = str2;
        this.toastType = num4;
        this.postActionType = num5;
        this.postActionPayload = buttonActionPayload;
    }
}
