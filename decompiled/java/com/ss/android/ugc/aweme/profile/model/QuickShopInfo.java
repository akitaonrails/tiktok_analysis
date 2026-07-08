package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class QuickShopInfo implements Serializable {

    @C09CT("quick_shop_name")
    public String quickShopName;

    @C09CT("quick_shop_url")
    public String quickShopUrl;

    @C09CT("second_floor_info")
    public QuickShopSecondFloorInfo secondFloorInfo;

    @C09CT("with_text_entry")
    public boolean withTextEntry;

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public QuickShopSecondFloorInfo getSecondFloorInfo() {
        return this.secondFloorInfo;
    }

    public boolean isWithTextEntry() {
        return this.withTextEntry;
    }

    public void setQuickShopName(String str) {
        this.quickShopName = str;
    }

    public void setQuickShopUrl(String str) {
        this.quickShopUrl = str;
    }

    public void setSecondFloorInfo(QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        this.secondFloorInfo = quickShopSecondFloorInfo;
    }

    public void setWithTextEntry(boolean z) {
        this.withTextEntry = z;
    }
}
