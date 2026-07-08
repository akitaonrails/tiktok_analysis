package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchData {

    @C09CT("product_cards")
    public final List<ProductCard> productCards;

    @C09CT("title")
    public final String title;

    public PhotoSearchData() {
        this(null, null);
    }

    public PhotoSearchData(String str, List<ProductCard> list) {
        this.title = str;
        this.productCards = list;
    }
}
