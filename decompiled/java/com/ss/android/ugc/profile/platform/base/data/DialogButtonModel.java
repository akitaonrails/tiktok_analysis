package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DialogButtonModel implements Serializable {

    @C09CT("action")
    public final DialogButtonAction buttonAction;

    @C09CT("button_style")
    public final Integer buttonStyle;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("dismiss_after_click")
    public final Boolean dismissAfterClick;

    @C09CT("text")
    public final String remoteButtonText;

    public final DialogButtonAction getButtonAction() {
        return this.buttonAction;
    }

    public final Integer getButtonStyle() {
        return this.buttonStyle;
    }

    public final Integer getButtonType() {
        return this.buttonType;
    }

    public final Boolean getDismissAfterClick() {
        return this.dismissAfterClick;
    }

    public final String getRemoteButtonText() {
        return this.remoteButtonText;
    }
}
