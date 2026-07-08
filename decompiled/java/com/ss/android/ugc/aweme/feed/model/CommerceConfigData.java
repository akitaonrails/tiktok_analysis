package com.ss.android.ugc.aweme.feed.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceConfigData implements Serializable {

    @C09CT("data")
    @C09CS(StringJsonAdapterFactory.class)
    public ItemCommentEggGroup itemCommentEggGroup;

    @C09CT("item_like_egg")
    public ItemLikeEggData itemLikeEggData;

    @C09CT("type")
    public int type;

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup) {
        this.itemCommentEggGroup = itemCommentEggGroup;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData) {
        this.itemLikeEggData = itemLikeEggData;
    }

    public void setType(int i) {
        this.type = i;
    }
}
