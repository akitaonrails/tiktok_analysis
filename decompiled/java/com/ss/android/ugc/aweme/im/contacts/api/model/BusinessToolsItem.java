package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class BusinessToolsItem {

    @C09CT("business_tools_status")
    public final Integer businessToolStatus;

    @C09CT("business_tools_type")
    public final Integer businessToolType;

    public BusinessToolsItem() {
        this(null, null);
    }

    public BusinessToolsItem(Integer num, Integer num2) {
        this.businessToolType = num;
        this.businessToolStatus = num2;
    }
}
