package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardListData {

    @C09CT("billboard_image_list")
    public final List<ImageItem> imageList;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("latest_billboard_id")
    public final String latestBillboardId;

    @C09CT("billboard_template_list")
    public final List<RespTemplateItem> templateList;

    public BillboardListData() {
        this(null, null, null, null);
    }

    public BillboardListData(List<RespTemplateItem> list, List<ImageItem> list2, Boolean bool, String str) {
        this.templateList = list;
        this.imageList = list2;
        this.isNewUser = bool;
        this.latestBillboardId = str;
    }
}
