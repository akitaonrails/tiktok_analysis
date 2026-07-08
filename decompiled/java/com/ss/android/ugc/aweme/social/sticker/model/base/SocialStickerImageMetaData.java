package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class SocialStickerImageMetaData implements Serializable {
    public static final int $stable = 8;

    @C09CT("business_info")
    public BusinessInfo infoData;

    @C09CT("interaction_type")
    public Integer interActionType;

    @C09CT("is_circle")
    public Boolean isCircle;

    @C09CT("res_id")
    public String resId;

    public SocialStickerImageMetaData() {
        this(null, null, null, null);
    }

    public final BusinessInfo getInfoData() {
        return this.infoData;
    }

    public final Integer getInterActionType() {
        return this.interActionType;
    }

    public final String getResId() {
        return this.resId;
    }

    public final Boolean isCircle() {
        return this.isCircle;
    }

    public final void setCircle(Boolean bool) {
        this.isCircle = bool;
    }

    public final void setInfoData(BusinessInfo businessInfo) {
        this.infoData = businessInfo;
    }

    public final void setInterActionType(Integer num) {
        this.interActionType = num;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public SocialStickerImageMetaData(String str, Boolean bool, BusinessInfo businessInfo, Integer num) {
        this.resId = str;
        this.isCircle = bool;
        this.infoData = businessInfo;
        this.interActionType = num;
    }
}
