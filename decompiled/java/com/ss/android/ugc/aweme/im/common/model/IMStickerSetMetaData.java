package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMStickerSetMetaData implements Serializable {

    @C09CT("ai_moji_type")
    public final Integer aiMojiType;

    @C09CT("creator_avatar_url")
    public final UrlModel authorAvatar;

    @C09CT("creator_nickname")
    public final String authorName;

    @C09CT("creator_uid")
    public final Long authorUid;

    @C09CT("avatar_duo_user_ids")
    public final List<Long> avatarDuoUserIdList;

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

    @C09CT("icon_url")
    public final StickerUrlStruct icon;

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

    public IMStickerSetMetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, SubscriptionStatus.UNKNOWN, null, null, null, null, null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMStickerSetMetaData)) {
            return false;
        }
        IMStickerSetMetaData iMStickerSetMetaData = (IMStickerSetMetaData) obj;
        return Intrinsics.LJFF(this.setId, iMStickerSetMetaData.setId) && Intrinsics.LJFF(this.name, iMStickerSetMetaData.name) && Intrinsics.LJFF(this.desc, iMStickerSetMetaData.desc) && Intrinsics.LJFF(this.icon, iMStickerSetMetaData.icon) && Intrinsics.LJFF(this.stickerType, iMStickerSetMetaData.stickerType) && Intrinsics.LJFF(this.authorUid, iMStickerSetMetaData.authorUid) && Intrinsics.LJFF(this.authorAvatar, iMStickerSetMetaData.authorAvatar) && Intrinsics.LJFF(this.authorName, iMStickerSetMetaData.authorName) && Intrinsics.LJFF(this.setStatus, iMStickerSetMetaData.setStatus) && Intrinsics.LJFF(this.setStatusMsg, iMStickerSetMetaData.setStatusMsg) && Intrinsics.LJFF(this.createdTime, iMStickerSetMetaData.createdTime) && Intrinsics.LJFF(this.updatedTime, iMStickerSetMetaData.updatedTime) && Intrinsics.LJFF(this.shouldLockSticker, iMStickerSetMetaData.shouldLockSticker) && this.stickerSubType == iMStickerSetMetaData.stickerSubType && this.subscribeStatus == iMStickerSetMetaData.subscribeStatus && Intrinsics.LJFF(this.tierId, iMStickerSetMetaData.tierId) && Intrinsics.LJFF(this.privilegeUrl, iMStickerSetMetaData.privilegeUrl) && Intrinsics.LJFF(this.ctaText, iMStickerSetMetaData.ctaText) && Intrinsics.LJFF(this.ctaLink, iMStickerSetMetaData.ctaLink) && Intrinsics.LJFF(this.avatarDuoUserIdList, iMStickerSetMetaData.avatarDuoUserIdList) && Intrinsics.LJFF(this.aiMojiType, iMStickerSetMetaData.aiMojiType) && Intrinsics.LJFF(this.creationTaskId, iMStickerSetMetaData.creationTaskId);
    }

    public int hashCode() {
        Long l = this.setId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.icon;
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
        List<Long> list = this.avatarDuoUserIdList;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.aiMojiType;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.creationTaskId;
        return iHashCode21 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "IMStickerSetMetaData(setId=" + this.setId + ", name=" + this.name + ", desc=" + this.desc + ", icon=" + this.icon + ", stickerType=" + this.stickerType + ", authorUid=" + this.authorUid + ", authorAvatar=" + this.authorAvatar + ", authorName=" + this.authorName + ", setStatus=" + this.setStatus + ", setStatusMsg=" + this.setStatusMsg + ", createdTime=" + this.createdTime + ", updatedTime=" + this.updatedTime + ", shouldLockSticker=" + this.shouldLockSticker + ", stickerSubType=" + this.stickerSubType + ", subscribeStatus=" + this.subscribeStatus + ", tierId=" + this.tierId + ", privilegeUrl=" + this.privilegeUrl + ", ctaText=" + this.ctaText + ", ctaLink=" + this.ctaLink + ", avatarDuoUserIdList=" + this.avatarDuoUserIdList + ", aiMojiType=" + this.aiMojiType + ", creationTaskId=" + this.creationTaskId + ')';
    }

    public IMStickerSetMetaData(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, Boolean bool, StickerSubType stickerSubType, SubscriptionStatus subscriptionStatus, String str5, String str6, String str7, String str8, List<Long> list, Integer num3, String str9) {
        this.setId = l;
        this.name = str;
        this.desc = str2;
        this.icon = stickerUrlStruct;
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
        this.avatarDuoUserIdList = list;
        this.aiMojiType = num3;
        this.creationTaskId = str9;
    }
}
