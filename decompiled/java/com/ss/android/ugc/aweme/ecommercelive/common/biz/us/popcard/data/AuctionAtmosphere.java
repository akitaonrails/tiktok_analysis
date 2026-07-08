package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionAtmosphere {

    @C09CT("auction_img")
    public final ECImage auctionImg;

    @C09CT("colors")
    public final List<Color> colors;

    public AuctionAtmosphere() {
        this(null, null);
    }

    public AuctionAtmosphere(ECImage eCImage, List<Color> list) {
        this.auctionImg = eCImage;
        this.colors = list;
    }
}
