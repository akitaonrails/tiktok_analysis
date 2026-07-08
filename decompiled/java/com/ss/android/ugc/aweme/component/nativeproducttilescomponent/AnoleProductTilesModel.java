package com.ss.android.ugc.aweme.component.nativeproducttilescomponent;

import X.C09CT;
import X.C1021770chD;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleProductTilesModel implements Serializable {

    @C09CT("carousel_product_tiles_style")
    public final Integer carouselProductTilesStyle;

    @C09CT("log_info")
    public final LogInfo logInfo;

    @C09CT("product_tiles")
    public final List<ProductTile> productTiles;

    @C09CT("tile_size")
    public final Integer tileSize;

    @C09CT("tile_space")
    public final Integer tileSpace;
    public static final C1021770chD Companion = new Object() { // from class: X.0chD
    };
    public static final int $stable = 8;

    public AnoleProductTilesModel() {
        this(null, null, null, null, null);
    }

    public AnoleProductTilesModel(Integer num, Integer num2, Integer num3, LogInfo logInfo, List<ProductTile> list) {
        this.tileSize = num;
        this.tileSpace = num2;
        this.carouselProductTilesStyle = num3;
        this.logInfo = logInfo;
        this.productTiles = list;
    }
}
