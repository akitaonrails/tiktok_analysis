package com.ss.android.ugc.feed.platform.popup.dynamic;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class DynamicPopup {

    @C09CT("show_dynamic_popup_list")
    public final List<DynamicPopupInfo> showDynamicPopupList;

    public DynamicPopup() {
        this(null);
    }

    public DynamicPopup(List<DynamicPopupInfo> list) {
        this.showDynamicPopupList = list;
    }
}
