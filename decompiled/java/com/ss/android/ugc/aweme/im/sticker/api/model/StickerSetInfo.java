package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.common.model.SubscriptionStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerSetInfo implements Serializable {

    @C09CT("creator_avatar_url")
    public final UrlModel authorAvatar;

    @C09CT("creator_nickname")
    public final String authorName;

    @C09CT("creator_uid")
    public final Long authorUid;

    @C09CT("created_time")
    public final Long createdTime;

    @C09CT("creation_task_id")
    public final String creationTaskId;

    @C09CT("call_to_action_link")
    public final String ctaLink;

    @C09CT("call_to_action_text")
    public final String ctaText;

    @C09CT("description")
    public final String desc;
    public final transient String enterMethod;
    public final transient String enterMethodForRedesign;
    public final transient Integer fakeInputHash;

    @C09CT("icon_url")
    public final StickerUrlStruct iconUrl;

    @C09CT("name")
    public final String name;

    @C09CT("privilege_url")
    public final String privilegeUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long setId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer setStatus;

    @C09CT("status_msg")
    public final String setStatusMsg;

    @C09CT("unlock_sticker")
    public final Boolean shouldLockSticker;
    public final transient IMStickerMeta stickerMeta;

    @C09CT("sticker_sub_type")
    public final StickerSubType stickerSubType;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("subscription_status")
    public final SubscriptionStatus subscribeStatus;

    @C09CT("tier_id")
    public final String tierId;

    @C09CT("updated_time")
    public final Long updatedTime;

    public StickerSetInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, SubscriptionStatus.UNKNOWN, null, null, null, null, null, null, "click", "icon", null);
    }

    public final StickerSetInfo copy(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, Boolean bool, StickerSubType stickerSubType, SubscriptionStatus subscriptionStatus, String str5, String str6, String str7, String str8, String str9, IMStickerMeta iMStickerMeta, String str10, String str11, Integer num3) {
        return new StickerSetInfo(l, str, str2, stickerUrlStruct, num, l2, urlModel, str3, num2, str4, l3, l4, bool, stickerSubType, subscriptionStatus, str5, str6, str7, str8, str9, iMStickerMeta, str10, str11, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSetInfo)) {
            return false;
        }
        StickerSetInfo stickerSetInfo = (StickerSetInfo) obj;
        return Intrinsics.LJFF(this.setId, stickerSetInfo.setId) && Intrinsics.LJFF(this.name, stickerSetInfo.name) && Intrinsics.LJFF(this.desc, stickerSetInfo.desc) && Intrinsics.LJFF(this.iconUrl, stickerSetInfo.iconUrl) && Intrinsics.LJFF(this.stickerType, stickerSetInfo.stickerType) && Intrinsics.LJFF(this.authorUid, stickerSetInfo.authorUid) && Intrinsics.LJFF(this.authorAvatar, stickerSetInfo.authorAvatar) && Intrinsics.LJFF(this.authorName, stickerSetInfo.authorName) && Intrinsics.LJFF(this.setStatus, stickerSetInfo.setStatus) && Intrinsics.LJFF(this.setStatusMsg, stickerSetInfo.setStatusMsg) && Intrinsics.LJFF(this.createdTime, stickerSetInfo.createdTime) && Intrinsics.LJFF(this.updatedTime, stickerSetInfo.updatedTime) && Intrinsics.LJFF(this.shouldLockSticker, stickerSetInfo.shouldLockSticker) && this.stickerSubType == stickerSetInfo.stickerSubType && this.subscribeStatus == stickerSetInfo.subscribeStatus && Intrinsics.LJFF(this.tierId, stickerSetInfo.tierId) && Intrinsics.LJFF(this.privilegeUrl, stickerSetInfo.privilegeUrl) && Intrinsics.LJFF(this.ctaText, stickerSetInfo.ctaText) && Intrinsics.LJFF(this.ctaLink, stickerSetInfo.ctaLink) && Intrinsics.LJFF(this.creationTaskId, stickerSetInfo.creationTaskId) && Intrinsics.LJFF(this.stickerMeta, stickerSetInfo.stickerMeta) && Intrinsics.LJFF(this.enterMethod, stickerSetInfo.enterMethod) && Intrinsics.LJFF(this.enterMethodForRedesign, stickerSetInfo.enterMethodForRedesign) && Intrinsics.LJFF(this.fakeInputHash, stickerSetInfo.fakeInputHash);
    }

    public int hashCode() {
        Long l = this.setId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        Integer num = this.stickerType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.authorUid;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        UrlModel urlModel = this.authorAvatar;
        int iHashCode7 = (iHashCode6 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.authorName;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.setStatus;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.setStatusMsg;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.createdTime;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.updatedTime;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.shouldLockSticker;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        StickerSubType stickerSubType = this.stickerSubType;
        int iHashCode14 = (iHashCode13 + (stickerSubType == null ? 0 : stickerSubType.hashCode())) * 31;
        SubscriptionStatus subscriptionStatus = this.subscribeStatus;
        int iHashCode15 = (iHashCode14 + (subscriptionStatus == null ? 0 : subscriptionStatus.hashCode())) * 31;
        String str5 = this.tierId;
        int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.privilegeUrl;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ctaText;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ctaLink;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.creationTaskId;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        IMStickerMeta iMStickerMeta = this.stickerMeta;
        int iHashCode21 = (((((iHashCode20 + (iMStickerMeta == null ? 0 : iMStickerMeta.hashCode())) * 31) + this.enterMethod.hashCode()) * 31) + this.enterMethodForRedesign.hashCode()) * 31;
        Integer num3 = this.fakeInputHash;
        return iHashCode21 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "StickerSetInfo(setId=" + this.setId + ", name=" + this.name + ", desc=" + this.desc + ", iconUrl=" + this.iconUrl + ", stickerType=" + this.stickerType + ", authorUid=" + this.authorUid + ", authorAvatar=" + this.authorAvatar + ", authorName=" + this.authorName + ", setStatus=" + this.setStatus + ", setStatusMsg=" + this.setStatusMsg + ", createdTime=" + this.createdTime + ", updatedTime=" + this.updatedTime + ", shouldLockSticker=" + this.shouldLockSticker + ", stickerSubType=" + this.stickerSubType + ", subscribeStatus=" + this.subscribeStatus + ", tierId=" + this.tierId + ", privilegeUrl=" + this.privilegeUrl + ", ctaText=" + this.ctaText + ", ctaLink=" + this.ctaLink + ", creationTaskId=" + this.creationTaskId + ", stickerMeta=" + this.stickerMeta + ", enterMethod=" + this.enterMethod + ", enterMethodForRedesign=" + this.enterMethodForRedesign + ", fakeInputHash=" + this.fakeInputHash + ')';
    }

    public StickerSetInfo(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, Boolean bool, StickerSubType stickerSubType, SubscriptionStatus subscriptionStatus, String str5, String str6, String str7, String str8, String str9, IMStickerMeta iMStickerMeta, String str10, String str11, Integer num3) {
        this.setId = l;
        this.name = str;
        this.desc = str2;
        this.iconUrl = stickerUrlStruct;
        this.stickerType = num;
        this.authorUid = l2;
        this.authorAvatar = urlModel;
        this.authorName = str3;
        this.setStatus = num2;
        this.setStatusMsg = str4;
        this.createdTime = l3;
        this.updatedTime = l4;
        this.shouldLockSticker = bool;
        this.stickerSubType = stickerSubType;
        this.subscribeStatus = subscriptionStatus;
        this.tierId = str5;
        this.privilegeUrl = str6;
        this.ctaText = str7;
        this.ctaLink = str8;
        this.creationTaskId = str9;
        this.stickerMeta = iMStickerMeta;
        this.enterMethod = str10;
        this.enterMethodForRedesign = str11;
        this.fakeInputHash = num3;
    }
}
