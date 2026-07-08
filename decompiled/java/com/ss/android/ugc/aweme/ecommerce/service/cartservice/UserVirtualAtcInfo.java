package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class UserVirtualAtcInfo {

    @C09CT("user_virtual_info_id")
    public final String infoId;

    @C09CT("virtual_info")
    public final String virtualInfo;

    public UserVirtualAtcInfo() {
        this(null, null);
    }

    public UserVirtualAtcInfo(String str, String str2) {
        this.infoId = str;
        this.virtualInfo = str2;
    }
}
