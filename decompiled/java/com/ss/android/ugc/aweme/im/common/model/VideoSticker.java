package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.InterfaceC449850HkV;
import X.InterfaceC451150Hmb;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoSticker implements InterfaceC449850HkV, InterfaceC451150Hmb, Serializable {

    @C09CT("animated_urls")
    public final StickerUrlStruct animateUrl;

    @C09CT("creator_avatar_thumb")
    public final UrlModel creatorAvatarThumb;

    @C09CT("creator_nickname")
    public final String creatorNickName;

    @C09CT("creator_sec_uid")
    public final String creatorSecUid;

    @C09CT("creator_uid")
    public final Long creatorUid;

    @C09CT("creator_uniq_id")
    public final String creatorUniqueId;

    @C09CT("have_favorite")
    public final Integer haveFavorite;

    @C09CT("origin_video_id")
    public final Long originVideoId;

    @C09CT("origin_video_user_id")
    public final Long originVideoUserId;

    @C09CT("review_msg")
    public final String reviewMsg;

    @C09CT("static_urls")
    public final StickerUrlStruct staticUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long videoStickerId;

    public VideoSticker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final VideoSticker copy(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4) {
        return new VideoSticker(l, l2, l3, l4, str, num, num2, stickerUrlStruct, stickerUrlStruct2, num3, str2, str3, urlModel, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSticker)) {
            return false;
        }
        VideoSticker videoSticker = (VideoSticker) obj;
        return Intrinsics.LJFF(this.videoStickerId, videoSticker.videoStickerId) && Intrinsics.LJFF(this.originVideoId, videoSticker.originVideoId) && Intrinsics.LJFF(this.originVideoUserId, videoSticker.originVideoUserId) && Intrinsics.LJFF(this.creatorUid, videoSticker.creatorUid) && Intrinsics.LJFF(this.creatorSecUid, videoSticker.creatorSecUid) && Intrinsics.LJFF(this.status, videoSticker.status) && Intrinsics.LJFF(this.stickerType, videoSticker.stickerType) && Intrinsics.LJFF(this.staticUrl, videoSticker.staticUrl) && Intrinsics.LJFF(this.animateUrl, videoSticker.animateUrl) && Intrinsics.LJFF(this.haveFavorite, videoSticker.haveFavorite) && Intrinsics.LJFF(this.reviewMsg, videoSticker.reviewMsg) && Intrinsics.LJFF(this.creatorNickName, videoSticker.creatorNickName) && Intrinsics.LJFF(this.creatorAvatarThumb, videoSticker.creatorAvatarThumb) && Intrinsics.LJFF(this.creatorUniqueId, videoSticker.creatorUniqueId);
    }

    public int hashCode() {
        Long l = this.videoStickerId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.originVideoId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.originVideoUserId;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.creatorUid;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.creatorSecUid;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stickerType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.staticUrl;
        int iHashCode8 = (iHashCode7 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct2 = this.animateUrl;
        int iHashCode9 = (iHashCode8 + (stickerUrlStruct2 == null ? 0 : stickerUrlStruct2.hashCode())) * 31;
        Integer num3 = this.haveFavorite;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.reviewMsg;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creatorNickName;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.creatorAvatarThumb;
        int iHashCode13 = (iHashCode12 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.creatorUniqueId;
        return iHashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "VideoSticker(videoStickerId=" + this.videoStickerId + ", originVideoId=" + this.originVideoId + ", originVideoUserId=" + this.originVideoUserId + ", creatorUid=" + this.creatorUid + ", creatorSecUid=" + this.creatorSecUid + ", status=" + this.status + ", stickerType=" + this.stickerType + ", staticUrl=" + this.staticUrl + ", animateUrl=" + this.animateUrl + ", haveFavorite=" + this.haveFavorite + ", reviewMsg=" + this.reviewMsg + ", creatorNickName=" + this.creatorNickName + ", creatorAvatarThumb=" + this.creatorAvatarThumb + ", creatorUniqueId=" + this.creatorUniqueId + ')';
    }

    public final StickerUrlStruct getAnimateUrl() {
        return this.animateUrl;
    }

    public final UrlModel getCreatorAvatarThumb() {
        return this.creatorAvatarThumb;
    }

    public final String getCreatorNickName() {
        return this.creatorNickName;
    }

    public final String getCreatorSecUid() {
        return this.creatorSecUid;
    }

    public final Long getCreatorUid() {
        return this.creatorUid;
    }

    public final String getCreatorUniqueId() {
        return this.creatorUniqueId;
    }

    public final Integer getHaveFavorite() {
        return this.haveFavorite;
    }

    public final Long getOriginVideoId() {
        return this.originVideoId;
    }

    public final Long getOriginVideoUserId() {
        return this.originVideoUserId;
    }

    public final String getReviewMsg() {
        return this.reviewMsg;
    }

    public final StickerUrlStruct getStaticUrl() {
        return this.staticUrl;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final Long getVideoStickerId() {
        return this.videoStickerId;
    }

    public VideoSticker(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4) {
        this.videoStickerId = l;
        this.originVideoId = l2;
        this.originVideoUserId = l3;
        this.creatorUid = l4;
        this.creatorSecUid = str;
        this.status = num;
        this.stickerType = num2;
        this.staticUrl = stickerUrlStruct;
        this.animateUrl = stickerUrlStruct2;
        this.haveFavorite = num3;
        this.reviewMsg = str2;
        this.creatorNickName = str3;
        this.creatorAvatarThumb = urlModel;
        this.creatorUniqueId = str4;
    }
}
