package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class TabSetting implements Serializable {

    @C09CT("ba_tab")
    public BATab baTab;

    @C09CT("favorite_tab")
    public FavoriteTab favoriteTab;

    @C09CT("hide_like_tab")
    public boolean hideLikeTab;

    @C09CT("private_tab")
    public PrivateTab privateTab;

    @C09CT("repost_tab")
    public RepostTab repostTab;

    @C09CT("shop_tab")
    public ShopTab shopTab;

    @C09CT("sticker_tab")
    public StickerTab stickerTab;

    public FavoriteTab getFavoriteTab() {
        return this.favoriteTab;
    }

    public PrivateTab getPrivateTab() {
        return this.privateTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setFavoriteTab(FavoriteTab favoriteTab) {
        this.favoriteTab = favoriteTab;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
