package com.bytedance.android.livesdk.wallet;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityInfo;
import java.util.ArrayList;
import java.util.List;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public class DiamondPackageExtra extends Extra {

    @C09CT("recommended_packet_id")
    public int RecommendedPacketId;

    @C09CT("activity_info")
    public ExtraActivityInfo activityInfo;

    @C09CT("full_list")
    public List<Diamond> fullPackageList;

    @C09CT("iap_custom_data")
    public IapListResult.IapCustomData iapCustomData;

    @C09CT("insufficient_balance_ab_group_id")
    public String insufficientBalanceAbGroupId;

    @C09CT("coin_solution_ab_enabled")
    public boolean isCoinSolutionABEnable;

    @C09CT("is_new_recommend_package")
    public Boolean isNewRecommendPackage;

    @C09CT("badge_icon")
    public String mBadgeIcon;

    @C09CT("channel")
    public String mChannel;

    @C09CT("channel_id")
    public int mChannelId;

    @C09CT("currency_list")
    public List<String> mCurrencyList;

    @C09CT("default_currency")
    public String mDefaultCurrency;

    @C09CT("is_default")
    public boolean mIsDefault;

    @C09CT("is_recommend")
    public boolean mIsRecommend;

    @C09CT("need_auth")
    public int mNeedAuth;

    @C09CT("recently_purchased_packet_id")
    public int recentlyPurchasedPacketId;

    @C09CT("voucher_list")
    public List<IapListResult.VoucherItem> voucherList = new ArrayList();

    public String getBadgeIcon() {
        return this.mBadgeIcon;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public List<String> getCurrencyList() {
        return this.mCurrencyList;
    }

    public String getDefaultCurrency() {
        return this.mDefaultCurrency;
    }

    public List<Diamond> getFullPackageList() {
        return this.fullPackageList;
    }

    public String getInsufficientBalanceAbGroupId() {
        return this.insufficientBalanceAbGroupId;
    }

    public boolean getIsDefault() {
        return this.mIsDefault;
    }

    public boolean getIsRecommend() {
        return this.mIsRecommend;
    }

    public int getNeedAuth() {
        return this.mNeedAuth;
    }

    public Boolean getNewRecommendPackage() {
        return this.isNewRecommendPackage;
    }

    public void setBadgeIcon(String str) {
        this.mBadgeIcon = str;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    public void setCurrencyList(List<String> list) {
        this.mCurrencyList = list;
    }

    public void setDefaultCurrency(String str) {
        this.mDefaultCurrency = str;
    }

    public void setFullPackageList(List<Diamond> list) {
        this.fullPackageList = list;
    }

    public void setInsufficientBalanceAbGroupId(String str) {
        this.insufficientBalanceAbGroupId = str;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public void setIsRecommend(boolean z) {
        this.mIsRecommend = z;
    }

    public void setNeedAuth(int i) {
        this.mNeedAuth = i;
    }

    public void setNewRecommendPackage(Boolean bool) {
        this.isNewRecommendPackage = bool;
    }
}
