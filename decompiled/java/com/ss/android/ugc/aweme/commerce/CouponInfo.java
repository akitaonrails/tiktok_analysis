package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CouponInfo implements Serializable {

    @C09CT("coupon_code")
    public String couponCode;

    @C09CT("coupon_id")
    public Long couponId;

    @C09CT("description")
    public String description;

    @C09CT("discount_rate")
    public Integer discountRate;

    @C09CT("expire_time")
    public Long expireTime;

    @C09CT("followers_only")
    public boolean followersOnly;

    @C09CT("received_id")
    public String receivedId;

    @C09CT("redeemed")
    public boolean redeemed;

    @C09CT("start_time")
    public Long startTime;

    @C09CT("website")
    public String website;

    @C09CT("website_secure")
    public String websiteSecure;

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final Long getCouponId() {
        return this.couponId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    public final Long getExpireTime() {
        return this.expireTime;
    }

    public final boolean getFollowersOnly() {
        return this.followersOnly;
    }

    public final String getReceivedId() {
        return this.receivedId;
    }

    public final boolean getRedeemed() {
        return this.redeemed;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getWebsite() {
        return this.website;
    }

    public final String getWebsiteSecure() {
        return this.websiteSecure;
    }

    public final void setCouponCode(String str) {
        this.couponCode = str;
    }

    public final void setCouponId(Long l) {
        this.couponId = l;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDiscountRate(Integer num) {
        this.discountRate = num;
    }

    public final void setExpireTime(Long l) {
        this.expireTime = l;
    }

    public final void setFollowersOnly(boolean z) {
        this.followersOnly = z;
    }

    public final void setReceivedId(String str) {
        this.receivedId = str;
    }

    public final void setRedeemed(boolean z) {
        this.redeemed = z;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }

    public final void setWebsiteSecure(String str) {
        this.websiteSecure = str;
    }
}
