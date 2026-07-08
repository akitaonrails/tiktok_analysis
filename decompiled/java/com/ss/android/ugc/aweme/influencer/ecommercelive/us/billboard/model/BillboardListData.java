package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class BillboardListData {

    @C09CT("billboard_image_list")
    public final List<ImageItem> imageList;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("latest_billboard_id")
    public final String latestBillboardId;

    public BillboardListData() {
        this(null, null, null);
    }

    public BillboardListData(List<ImageItem> list, Boolean bool, String str) {
        this.imageList = list;
        this.isNewUser = bool;
        this.latestBillboardId = str;
    }
}
