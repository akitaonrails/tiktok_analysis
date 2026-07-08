package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SubInfo {

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("grace_info")
    public GraceInfo graceInfo;

    @C09CT("is_mocked")
    public boolean isMocked;

    @C09CT("is_subscribing")
    public Boolean isSubscribing;

    @C09CT("last_operation")
    public SubOperation lastOperation;

    @C09CT("next_renew_time")
    public Long nextRenewTime;

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("pay_channel")
    public int payChannel;

    @C09CT("price_change_info")
    public PriceChangeInfo priceChangeInfo;

    @C09CT("renewal_period")
    public int renewalPeriod;

    @C09CT("sku_name")
    public String skuName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_circle")
    public long subCircle;

    @C09CT("sub_end_time")
    public Long subEndTime;

    @C09CT("sub_info_not_found")
    public Boolean subInfoNotFound;

    @C09CT("sub_level")
    public SubLevel subLevel;

    @C09CT("sub_start_time")
    public Long subStartTime;

    @C09CT("subscribed_month")
    public Integer subscribedMonth;

    @C09CT("user_id")
    public String userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.subStartTime != null) {
            sb.append(", sub_start_time=");
            sb.append(this.subStartTime);
        }
        if (this.subEndTime != null) {
            sb.append(", sub_end_time=");
            sb.append(this.subEndTime);
        }
        if (this.nextRenewTime != null) {
            sb.append(", next_renew_time=");
            sb.append(this.nextRenewTime);
        }
        if (this.subscribedMonth != null) {
            sb.append(", subscribed_month=");
            sb.append(this.subscribedMonth);
        }
        if (this.isSubscribing != null) {
            sb.append(", is_subscribing=");
            sb.append(this.isSubscribing);
        }
        if (this.subLevel != null) {
            sb.append(", sub_level=");
            sb.append(this.subLevel);
        }
        sb.append(", status=");
        sb.append(this.status);
        if (this.subInfoNotFound != null) {
            sb.append(", sub_info_not_found=");
            sb.append(this.subInfoNotFound);
        }
        if (this.skuName != null) {
            sb.append(", sku_name=");
            sb.append(this.skuName);
        }
        sb.append(", pay_channel=");
        sb.append(this.payChannel);
        if (this.graceInfo != null) {
            sb.append(", grace_info=");
            sb.append(this.graceInfo);
        }
        sb.replace(0, 2, "SubInfo{");
        sb.append('}');
        return sb.toString();
    }
}
