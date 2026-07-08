package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class FavoriteProductRequest {

    @C09CT("favorite_infos")
    public final List<FavoriteInfo> favoriteInfos;

    @C09CT("saved_source_page")
    public final Integer savedSourcePage;

    public FavoriteProductRequest(List<FavoriteInfo> list, Integer num) {
        this.favoriteInfos = list;
        this.savedSourcePage = num;
    }
}
