package com.ss.android.ugc.aweme.component.searchcomponent.shopheader;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdShopInfoHeaderModel {

    @C09CT("jump_data")
    public final JumpData jump_data;

    @C09CT("tags")
    public final List<ShopTagInfo> tagList;

    public SearchAdShopInfoHeaderModel(JumpData jumpData, List<ShopTagInfo> list) {
        this.jump_data = jumpData;
        this.tagList = list;
    }
}
