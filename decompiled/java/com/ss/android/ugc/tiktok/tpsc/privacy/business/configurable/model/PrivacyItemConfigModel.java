package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CS;
import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
@C09CS(PrivacyItemConfigAdapter.class)
public final class PrivacyItemConfigModel {

    @C09CT("item_info")
    public final PrivacyItemInfoConfigModel itemInfo;

    @C09CT("item_tag")
    public final String itemTag;

    @C09CT("item_type")
    public final Integer itemType;

    public PrivacyItemConfigModel() {
        this(null, null, null);
    }

    public PrivacyItemConfigModel(Integer num, String str, PrivacyItemInfoConfigModel privacyItemInfoConfigModel) {
        this.itemType = num;
        this.itemTag = str;
        this.itemInfo = privacyItemInfoConfigModel;
    }
}
