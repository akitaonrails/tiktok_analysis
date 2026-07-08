package com.ss.android.ugc.feed.platform.popupclean;

import X.C09CT;
import X.EnumC314120CTa;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FCPPopupEnableRule implements Serializable {
    public static final int $stable = 8;
    public transient EnumC314120CTa configType = EnumC314120CTa.UNKNOWN;

    @C09CT("popups")
    public final List<Popup> popups;

    public final EnumC314120CTa getConfigType() {
        EnumC314120CTa enumC314120CTa = this.configType;
        return enumC314120CTa == null ? EnumC314120CTa.UNKNOWN : enumC314120CTa;
    }

    public FCPPopupEnableRule(List<Popup> list) {
        this.popups = list;
    }

    public final void setConfigType(EnumC314120CTa enumC314120CTa) {
        this.configType = enumC314120CTa;
    }
}
