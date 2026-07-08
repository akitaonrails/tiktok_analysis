package com.ss.android.ugc.feed.platform.popup.dynamic.initialize;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class DynamicPopupConfig {

    @C09CT("popup_meta_info")
    public final List<PopupMetaInfo> popupMetaInfo;

    public DynamicPopupConfig() {
        this(null);
    }

    public DynamicPopupConfig(List<PopupMetaInfo> list) {
        this.popupMetaInfo = list;
    }
}
