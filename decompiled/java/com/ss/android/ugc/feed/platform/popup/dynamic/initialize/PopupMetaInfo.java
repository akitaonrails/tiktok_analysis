package com.ss.android.ugc.feed.platform.popup.dynamic.initialize;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupMetaInfo {

    @C09CT("gecko_channel_list")
    public final List<String> geckoChannelList;

    @C09CT("popup_key")
    public final String popupKey;

    @C09CT("preload_image_list")
    public final List<String> preloadImageList;

    public PopupMetaInfo() {
        this(null, null, null);
    }

    public PopupMetaInfo(String str, List<String> list, List<String> list2) {
        this.popupKey = str;
        this.geckoChannelList = list;
        this.preloadImageList = list2;
    }
}
