package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveBagIconAnimationItem {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("item_img_list")
    public final List<AnimImage> itemImgList;

    @C09CT("item_rank")
    public final Integer itemRank;

    @C09CT("item_text_list")
    public final List<String> itemTextList;

    public LiveBagIconAnimationItem(List<AnimImage> list, List<String> list2, Integer num, String str) {
        this.itemImgList = list;
        this.itemTextList = list2;
        this.itemRank = num;
        this.daInfo = str;
    }
}
