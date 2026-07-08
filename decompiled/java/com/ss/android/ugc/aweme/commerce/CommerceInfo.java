package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceInfo implements Serializable {

    @C09CT("challenge_list")
    public List<Challenge> challengeList;

    @C09CT("head_image_url")
    public UrlModel headImageUrl;

    @C09CT("offline_info_list")
    public List<OfflineInfo> offlineInfoList;

    @C09CT("quick_shop_name")
    public String quickShopName;

    @C09CT("quick_shop_url")
    public String quickShopUrl;

    @C09CT("site_id")
    public String siteId;

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<OfflineInfo> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<OfflineInfo> list) {
        this.offlineInfoList = list;
    }
}
