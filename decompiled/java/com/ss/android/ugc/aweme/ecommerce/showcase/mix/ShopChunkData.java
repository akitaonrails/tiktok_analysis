package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ShopChunkData {

    @C09CT("shop_chunk_type")
    public final Integer chunkType;

    @C09CT("shop_chunk_type_string")
    public final String chunkTypeString;

    @C09CT("header")
    public final ShopHeaderChunkData header;

    @C09CT("multi_tab_content")
    public final MultiTabContentChunkData multiTabContent;

    @C09CT("tab_bar")
    public final ShopTabBarChunkData tabBar;

    public ShopChunkData(Integer num, String str, ShopHeaderChunkData shopHeaderChunkData, ShopTabBarChunkData shopTabBarChunkData, MultiTabContentChunkData multiTabContentChunkData) {
        this.chunkType = num;
        this.chunkTypeString = str;
        this.header = shopHeaderChunkData;
        this.tabBar = shopTabBarChunkData;
        this.multiTabContent = multiTabContentChunkData;
    }
}
