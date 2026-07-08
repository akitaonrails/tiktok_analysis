package com.ss.android.ugc.aweme.poi.compliance.repo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ToastContent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PassportToastContent implements Serializable {

    @C09CT("duration")
    public final Integer duration;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_height")
    public final Integer iconHeight;

    @C09CT("icon_weight")
    public final Integer iconWidth;

    @C09CT("message")
    public final String message;

    @C09CT("toast_type")
    public final Integer toastType;

    public PassportToastContent() {
        this(null, null, null, null, null, null);
    }

    public final ToastContent convertToLsToastContent() {
        return new ToastContent(this.duration, this.icon, this.iconHeight, this.iconWidth, this.message, this.toastType, null, null);
    }

    public PassportToastContent(Integer num, String str, Integer num2, Integer num3, String str2, Integer num4) {
        this.duration = num;
        this.icon = str;
        this.iconHeight = num2;
        this.iconWidth = num3;
        this.message = str2;
        this.toastType = num4;
    }
}
