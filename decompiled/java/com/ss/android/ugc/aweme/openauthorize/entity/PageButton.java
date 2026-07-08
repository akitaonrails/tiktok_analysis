package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PageButton implements Serializable {

    @C09CT("show_switch_account_button")
    public final Boolean showSwitchAccountButton;

    public PageButton() {
        this(null);
    }

    public PageButton(Boolean bool) {
        this.showSwitchAccountButton = bool;
    }
}
