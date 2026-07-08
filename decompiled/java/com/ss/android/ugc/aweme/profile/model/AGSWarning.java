package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AGSWarning implements Serializable {

    @C09CT("popup_window")
    public final AGSWarningPopupWindow agsWarningPopupWindow;

    public AGSWarning() {
        this(null);
    }

    public AGSWarning(AGSWarningPopupWindow aGSWarningPopupWindow) {
        this.agsWarningPopupWindow = aGSWarningPopupWindow;
    }
}
