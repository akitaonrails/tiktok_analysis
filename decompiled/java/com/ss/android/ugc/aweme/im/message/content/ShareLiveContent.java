package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C09EF;
import X.InterfaceC1294060jmO;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.utils.SlimContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveContent extends BaseContent implements SlimContent {

    @C09CT("extra_jump")
    public LiveExtraJump extraJump;

    @C09CT("itemType")
    public String itemType;

    @C09CT("message_config")
    public MessageConfig messageConfig;

    @C09CT("push_detail")
    public String pushDetail;

    @C09CT("cover_url")
    public UrlModel roomCover;

    @C09CT("room_description")
    public String roomDesc;

    @C09CT("room_id")
    public String roomId;

    @C09CT("room_owner_avatar")
    public UrlModel roomOwnerAvatar;

    @C09CT("room_owner_id")
    public String roomOwnerId;

    @C09CT("room_owner_name")
    public String roomOwnerName;

    @C09CT("room_owner_sec_id")
    public String roomSecOwnerId;

    @C09CT("share_live_intent")
    public String shareLiveIntent;

    @C09CT("share_live_trace_id")
    public String shareLiveTraceId;

    @C09CT("shared_enter_from")
    public String sharedEnterFrom;

    public ShareLiveContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSharedEnterFrom$annotations() {
    }

    public final ShareLiveContent copy(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, String str5, String str6, String str7, String str8, String str9, String str10, MessageConfig messageConfig, LiveExtraJump liveExtraJump) {
        return new ShareLiveContent(str, str2, str3, str4, urlModel, urlModel2, str5, str6, str7, str8, str9, str10, messageConfig, liveExtraJump);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareLiveContent)) {
            return false;
        }
        ShareLiveContent shareLiveContent = (ShareLiveContent) obj;
        return Intrinsics.LJFF(this.roomId, shareLiveContent.roomId) && Intrinsics.LJFF(this.roomOwnerId, shareLiveContent.roomOwnerId) && Intrinsics.LJFF(this.roomSecOwnerId, shareLiveContent.roomSecOwnerId) && Intrinsics.LJFF(this.roomOwnerName, shareLiveContent.roomOwnerName) && Intrinsics.LJFF(this.roomOwnerAvatar, shareLiveContent.roomOwnerAvatar) && Intrinsics.LJFF(this.roomCover, shareLiveContent.roomCover) && Intrinsics.LJFF(this.roomDesc, shareLiveContent.roomDesc) && Intrinsics.LJFF(this.pushDetail, shareLiveContent.pushDetail) && Intrinsics.LJFF(this.shareLiveIntent, shareLiveContent.shareLiveIntent) && Intrinsics.LJFF(this.shareLiveTraceId, shareLiveContent.shareLiveTraceId) && Intrinsics.LJFF(this.sharedEnterFrom, shareLiveContent.sharedEnterFrom) && Intrinsics.LJFF(this.itemType, shareLiveContent.itemType) && Intrinsics.LJFF(this.messageConfig, shareLiveContent.messageConfig) && Intrinsics.LJFF(this.extraJump, shareLiveContent.extraJump);
    }

    public int hashCode() {
        String str = this.roomId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomOwnerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.roomSecOwnerId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.roomOwnerName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.roomOwnerAvatar;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.roomCover;
        int iHashCode6 = (iHashCode5 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        String str5 = this.roomDesc;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pushDetail;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shareLiveIntent;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shareLiveTraceId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sharedEnterFrom;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.itemType;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        MessageConfig messageConfig = this.messageConfig;
        int iHashCode13 = (iHashCode12 + (messageConfig == null ? 0 : messageConfig.hashCode())) * 31;
        LiveExtraJump liveExtraJump = this.extraJump;
        return iHashCode13 + (liveExtraJump != null ? liveExtraJump.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        return "ShareLiveContent(roomId=" + this.roomId + ", roomOwnerId=" + this.roomOwnerId + ", roomSecOwnerId=" + this.roomSecOwnerId + ", roomOwnerName=" + this.roomOwnerName + ", roomOwnerAvatar=" + this.roomOwnerAvatar + ", roomCover=" + this.roomCover + ", roomDesc=" + this.roomDesc + ", pushDetail=" + this.pushDetail + ", shareLiveIntent=" + this.shareLiveIntent + ", shareLiveTraceId=" + this.shareLiveTraceId + ", sharedEnterFrom=" + this.sharedEnterFrom + ", itemType=" + this.itemType + ", messageConfig=" + this.messageConfig + ", extraJump=" + this.extraJump + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.utils.SlimContent
    public String trimToSlimContent() {
        ShareLiveContent shareLiveContentCopy = copy(this.roomId, this.roomOwnerId, this.roomSecOwnerId, this.roomOwnerName, this.roomOwnerAvatar, this.roomCover, this.roomDesc, this.pushDetail, this.shareLiveIntent, this.shareLiveTraceId, this.sharedEnterFrom, this.itemType, this.messageConfig, this.extraJump);
        shareLiveContentCopy.roomSecOwnerId = null;
        shareLiveContentCopy.roomOwnerAvatar = null;
        shareLiveContentCopy.roomCover = null;
        shareLiveContentCopy.copyBaseContentRequestFieldsFrom(this);
        return GsonProtectorUtils.toJson(C09EF.LIZ, shareLiveContentCopy);
    }

    public final LiveExtraJump getExtraJump() {
        return this.extraJump;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final MessageConfig getMessageConfig() {
        return this.messageConfig;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final UrlModel getRoomCover() {
        return this.roomCover;
    }

    public final String getRoomDesc() {
        return this.roomDesc;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public final String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public final String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public final String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    public final String getShareLiveIntent() {
        return this.shareLiveIntent;
    }

    public final String getShareLiveTraceId() {
        return this.shareLiveTraceId;
    }

    public final String getSharedEnterFrom() {
        return this.sharedEnterFrom;
    }

    public final void setExtraJump(LiveExtraJump liveExtraJump) {
        this.extraJump = liveExtraJump;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setMessageConfig(MessageConfig messageConfig) {
        this.messageConfig = messageConfig;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public final void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public final void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public final void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public final void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    public final void setShareLiveIntent(String str) {
        this.shareLiveIntent = str;
    }

    public final void setShareLiveTraceId(String str) {
        this.shareLiveTraceId = str;
    }

    public final void setSharedEnterFrom(String str) {
        this.sharedEnterFrom = str;
    }

    public ShareLiveContent(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, String str5, String str6, String str7, String str8, String str9, String str10, MessageConfig messageConfig, LiveExtraJump liveExtraJump) {
        this.roomId = str;
        this.roomOwnerId = str2;
        this.roomSecOwnerId = str3;
        this.roomOwnerName = str4;
        this.roomOwnerAvatar = urlModel;
        this.roomCover = urlModel2;
        this.roomDesc = str5;
        this.pushDetail = str6;
        this.shareLiveIntent = str7;
        this.shareLiveTraceId = str8;
        this.sharedEnterFrom = str9;
        this.itemType = str10;
        this.messageConfig = messageConfig;
        this.extraJump = liveExtraJump;
    }
}
