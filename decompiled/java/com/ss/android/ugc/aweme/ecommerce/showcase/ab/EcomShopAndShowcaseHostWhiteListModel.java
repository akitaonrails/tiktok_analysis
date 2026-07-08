package com.ss.android.ugc.aweme.ecommerce.showcase.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class EcomShopAndShowcaseHostWhiteListModel {

    @C09CT("verify_host")
    public final boolean verifyHost = true;

    @C09CT("white_list")
    public final List<String> whiteHostList = C1697810uHb.LJ("lf16-gecko-source.tiktokcdn.com", "lf19-gecko-source.tiktokcdn.com", "lf16-gecko-source.tiktokcdn-us.com", "lf19-gecko-source.tiktokcdn-us.com", "lf-main-gecko-source.tiktokcdn.com");

    public final boolean getVerifyHost() {
        return this.verifyHost;
    }

    public final List<String> getWhiteHostList() {
        return this.whiteHostList;
    }
}
