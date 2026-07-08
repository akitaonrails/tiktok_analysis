package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiTabContentChunkData {

    @C09CT("bff_type")
    public final Integer bffType;

    @C09CT("gecko_preload_lists")
    public final List<String> geckoPreloadList;

    @C09CT("global_data")
    public final n globalData;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("interface_preload")
    public final List<StoreInterfacePreloadData> interfacePreload;

    @C09CT("spark_preload")
    public final List<SparkPreloadData> sparkPreload;

    @C09CT("multi_tab_content_list")
    public final List<TabContentListItemData> tabContentList;

    @C09CT("timing_info")
    public n timingInfo;

    public MultiTabContentChunkData(String str, Integer num, List<TabContentListItemData> list, List<String> list2, n nVar, List<StoreInterfacePreloadData> list3, n nVar2, List<SparkPreloadData> list4) {
        this.id = str;
        this.bffType = num;
        this.tabContentList = list;
        this.geckoPreloadList = list2;
        this.globalData = nVar;
        this.interfacePreload = list3;
        this.timingInfo = nVar2;
        this.sparkPreload = list4;
    }
}
