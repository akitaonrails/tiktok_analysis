package com.ss.android.ugc.aweme.ab.general;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GeneralSearchLynxImagePreloadModel {

    @C09CT("search_lynx_channel_array")
    public final List<String> channelList;

    @C09CT("enable")
    public final int enable;

    @C09CT("search_lynx_origin_type_array")
    public final List<Integer> originTypeList;

    public GeneralSearchLynxImagePreloadModel() {
        this(0, null, null);
    }

    public GeneralSearchLynxImagePreloadModel(int i, List<Integer> list, List<String> list2) {
        this.enable = i;
        this.originTypeList = list;
        this.channelList = list2;
    }
}
