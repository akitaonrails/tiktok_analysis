package com.ss.android.ugc.aweme.commercialize.coupon.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class CouponInfo extends BaseResponse implements Serializable {

    @C09CT("abbr_condition")
    public String abbrCondition;

    @C09CT("activity_id")
    public int activityId;

    @C09CT("can_rate")
    public int canRate;

    @C09CT("codabar_image_url")
    public String codabarImageUrl;

    @C09CT("code")
    public String code;

    @C09CT("code_id")
    public String codeId;

    @C09CT("condition")
    public String condition;

    @C09CT("coupon_id")
    public int couponId;

    @C09CT("coupon_source")
    public int couponSource;

    @C09CT("coupon_type")
    public int couponType;

    @C09CT("create_time")
    public String createTime;

    @C09CT("desc")
    public String desc;

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("group")
    public String group;

    @C09CT("head_image_url")
    public UrlModel headImageUrl;

    @C09CT("hint_text")
    public String hintText;

    @C09CT("is_default_head_image")
    public boolean isDefaultHeadImage;

    @C09CT("logo_image_url")
    public UrlModel logoImageUrl;

    @C09CT("sec_uid")
    public String mSecUid;

    @C09CT("merchant_name")
    public String merchantName;

    @C09CT("notification")
    public String notification;

    @C09CT("object_type")
    public int objectType;

    @C09CT("pay_type")
    public int payType;

    @C09CT("qrcode_url")
    public UrlModel qrCodeUrl;

    @C09CT("service_tel")
    public String serviceTel;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("store_page_link")
    public String storePageLink;

    @C09CT("title")
    public String title;

    @C09CT("use_page_link")
    public String usePageLink;

    @C09CT("user_id")
    public Long userId;

    @C09CT("valid_date_text")
    public String validDateText;

    @C09CT("valid_end")
    public String validEnd;

    @C09CT("valid_start")
    public String validStart;

    public String getAbbrCondition() {
        return this.abbrCondition;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public String getCodabarImageUrl() {
        return this.codabarImageUrl;
    }

    public String getCode() {
        return this.code;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getCondition() {
        return this.condition;
    }

    public int getCouponId() {
        return this.couponId;
    }

    public int getCouponSource() {
        return this.couponSource;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getGroup() {
        return this.group;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public UrlModel getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNotification() {
        return this.notification;
    }

    public int getPayType() {
        return this.payType;
    }

    public UrlModel getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStorePageLink() {
        return this.storePageLink;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsePageLink() {
        return this.usePageLink;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getValidEnd() {
        return this.validEnd;
    }

    public String getValidStart() {
        return this.validStart;
    }

    public boolean isDefaultHeadImage() {
        return this.isDefaultHeadImage;
    }

    public void setAbbrCondition(String str) {
        this.abbrCondition = str;
    }

    public void setActivityId(int i) {
        this.activityId = i;
    }

    public void setCodabarImageUrl(String str) {
        this.codabarImageUrl = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public void setCouponId(int i) {
        this.couponId = i;
    }

    public void setCouponSource(int i) {
        this.couponSource = i;
    }

    public void setCouponType(int i) {
        this.couponType = i;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.isDefaultHeadImage = z;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.logoImageUrl = urlModel;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.qrCodeUrl = urlModel;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStorePageLink(String str) {
        this.storePageLink = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUsePageLink(String str) {
        this.usePageLink = str;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }

    public void setValidEnd(String str) {
        this.validEnd = str;
    }

    public void setValidStart(String str) {
        this.validStart = str;
    }
}
