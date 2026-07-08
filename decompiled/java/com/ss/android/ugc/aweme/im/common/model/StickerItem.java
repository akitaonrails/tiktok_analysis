package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C13BV;
import X.EnumC2243731Crr;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerItem implements Serializable {

    @C09CT("ai_sticker")
    public final AIStickerItem aiStickerInfo;

    @C09CT("aimoji_sticker")
    public final AIMojiStickerItem aimojiInfo;

    @C09CT("blocked_actions")
    public final List<EnumC2243731Crr> blockedActions;

    @C09CT("create_source")
    public final Integer createSource;

    @C09CT("created_at")
    public final Long createTime;

    @C09CT("description")
    public final String description;

    @C09CT("duo_avatar_sticker")
    public final DuoAvatarStickerItem duoAvatarStickerInfo;

    @C09CT("favorited_at")
    public final Long favoriteTime;

    @C09CT("imagine_studio_info")
    public final ImagineStudioInfo imagineStudioInfo;

    @C09CT("moderation_reason")
    public final String moderationReason;

    @C09CT("photo_comment_sticker")
    public final PhotoCommentStickerItem photoCommentStickerItem;

    @C09CT("set_id")
    public final Long setId;

    @C09CT("social_avatar_sticker")
    public final SocialAvatarStickerItem socialAvatarInfo;

    @C09CT("base")
    public final StickerBase stickerBase;

    @C09CT("sticker_variant")
    public final Integer stickerVariant;

    @C09CT("sticker_variant_items")
    public final List<StickerVariantItem> stickerVariantItems;

    @C09CT("sub_only_sticker")
    public final SubOnlyStickerItem subOnlyInfo;

    @C09CT("tags")
    public final List<String> tags;

    @C09CT("third_party_sticker")
    public final ThirdpartyStickerItem thirdPartyStickerInfo;

    @C09CT("typing_recommendation")
    public final TypingRecommendationItem typingRecommendationItem;

    @C09CT("updated_at")
    public final Long updateTime;

    @C09CT("sticker_creator_info")
    public final StickerUserInfo userInfo;

    @C09CT("video_sticker")
    public final VideoToStickerItem videoStickerInfo;

    public StickerItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public final StickerItem copy(StickerBase stickerBase, StickerUserInfo stickerUserInfo, Long l, Long l2, Long l3, String str, List<String> list, String str2, Long l4, Integer num, SubOnlyStickerItem subOnlyStickerItem, VideoToStickerItem videoToStickerItem, AIMojiStickerItem aIMojiStickerItem, SocialAvatarStickerItem socialAvatarStickerItem, DuoAvatarStickerItem duoAvatarStickerItem, ThirdpartyStickerItem thirdpartyStickerItem, AIStickerItem aIStickerItem, @StickerVariant Integer num2, List<StickerVariantItem> list2, List<? extends EnumC2243731Crr> list3, TypingRecommendationItem typingRecommendationItem, PhotoCommentStickerItem photoCommentStickerItem, ImagineStudioInfo imagineStudioInfo) {
        return new StickerItem(stickerBase, stickerUserInfo, l, l2, l3, str, list, str2, l4, num, subOnlyStickerItem, videoToStickerItem, aIMojiStickerItem, socialAvatarStickerItem, duoAvatarStickerItem, thirdpartyStickerItem, aIStickerItem, num2, list2, list3, typingRecommendationItem, photoCommentStickerItem, imagineStudioInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItem)) {
            return false;
        }
        StickerItem stickerItem = (StickerItem) obj;
        return Intrinsics.LJFF(this.stickerBase, stickerItem.stickerBase) && Intrinsics.LJFF(this.userInfo, stickerItem.userInfo) && Intrinsics.LJFF(this.createTime, stickerItem.createTime) && Intrinsics.LJFF(this.updateTime, stickerItem.updateTime) && Intrinsics.LJFF(this.favoriteTime, stickerItem.favoriteTime) && Intrinsics.LJFF(this.moderationReason, stickerItem.moderationReason) && Intrinsics.LJFF(this.tags, stickerItem.tags) && Intrinsics.LJFF(this.description, stickerItem.description) && Intrinsics.LJFF(this.setId, stickerItem.setId) && Intrinsics.LJFF(this.createSource, stickerItem.createSource) && Intrinsics.LJFF(this.subOnlyInfo, stickerItem.subOnlyInfo) && Intrinsics.LJFF(this.videoStickerInfo, stickerItem.videoStickerInfo) && Intrinsics.LJFF(this.aimojiInfo, stickerItem.aimojiInfo) && Intrinsics.LJFF(this.socialAvatarInfo, stickerItem.socialAvatarInfo) && Intrinsics.LJFF(this.duoAvatarStickerInfo, stickerItem.duoAvatarStickerInfo) && Intrinsics.LJFF(this.thirdPartyStickerInfo, stickerItem.thirdPartyStickerInfo) && Intrinsics.LJFF(this.aiStickerInfo, stickerItem.aiStickerInfo) && Intrinsics.LJFF(this.stickerVariant, stickerItem.stickerVariant) && Intrinsics.LJFF(this.stickerVariantItems, stickerItem.stickerVariantItems) && Intrinsics.LJFF(this.blockedActions, stickerItem.blockedActions) && Intrinsics.LJFF(this.typingRecommendationItem, stickerItem.typingRecommendationItem) && Intrinsics.LJFF(this.photoCommentStickerItem, stickerItem.photoCommentStickerItem) && Intrinsics.LJFF(this.imagineStudioInfo, stickerItem.imagineStudioInfo);
    }

    public int hashCode() {
        StickerBase stickerBase = this.stickerBase;
        int iHashCode = (stickerBase == null ? 0 : stickerBase.hashCode()) * 31;
        StickerUserInfo stickerUserInfo = this.userInfo;
        int iHashCode2 = (iHashCode + (stickerUserInfo == null ? 0 : stickerUserInfo.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.updateTime;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.favoriteTime;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.moderationReason;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.setId;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.createSource;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        SubOnlyStickerItem subOnlyStickerItem = this.subOnlyInfo;
        int iHashCode11 = (iHashCode10 + (subOnlyStickerItem == null ? 0 : subOnlyStickerItem.hashCode())) * 31;
        VideoToStickerItem videoToStickerItem = this.videoStickerInfo;
        int iHashCode12 = (iHashCode11 + (videoToStickerItem == null ? 0 : videoToStickerItem.hashCode())) * 31;
        AIMojiStickerItem aIMojiStickerItem = this.aimojiInfo;
        int iHashCode13 = (iHashCode12 + (aIMojiStickerItem == null ? 0 : aIMojiStickerItem.hashCode())) * 31;
        SocialAvatarStickerItem socialAvatarStickerItem = this.socialAvatarInfo;
        int iHashCode14 = (iHashCode13 + (socialAvatarStickerItem == null ? 0 : socialAvatarStickerItem.hashCode())) * 31;
        DuoAvatarStickerItem duoAvatarStickerItem = this.duoAvatarStickerInfo;
        int iHashCode15 = (iHashCode14 + (duoAvatarStickerItem == null ? 0 : duoAvatarStickerItem.hashCode())) * 31;
        ThirdpartyStickerItem thirdpartyStickerItem = this.thirdPartyStickerInfo;
        int iHashCode16 = (iHashCode15 + (thirdpartyStickerItem == null ? 0 : thirdpartyStickerItem.hashCode())) * 31;
        AIStickerItem aIStickerItem = this.aiStickerInfo;
        int iHashCode17 = (iHashCode16 + (aIStickerItem == null ? 0 : aIStickerItem.hashCode())) * 31;
        Integer num2 = this.stickerVariant;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<StickerVariantItem> list2 = this.stickerVariantItems;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<EnumC2243731Crr> list3 = this.blockedActions;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TypingRecommendationItem typingRecommendationItem = this.typingRecommendationItem;
        int iHashCode21 = (iHashCode20 + (typingRecommendationItem == null ? 0 : typingRecommendationItem.hashCode())) * 31;
        PhotoCommentStickerItem photoCommentStickerItem = this.photoCommentStickerItem;
        int iHashCode22 = (iHashCode21 + (photoCommentStickerItem == null ? 0 : photoCommentStickerItem.hashCode())) * 31;
        ImagineStudioInfo imagineStudioInfo = this.imagineStudioInfo;
        return iHashCode22 + (imagineStudioInfo != null ? imagineStudioInfo.hashCode() : 0);
    }

    public String toString() {
        return "StickerItem(stickerBase=" + this.stickerBase + ", userInfo=" + this.userInfo + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", favoriteTime=" + this.favoriteTime + ", moderationReason=" + this.moderationReason + ", tags=" + this.tags + ", description=" + this.description + ", setId=" + this.setId + ", createSource=" + this.createSource + ", subOnlyInfo=" + this.subOnlyInfo + ", videoStickerInfo=" + this.videoStickerInfo + ", aimojiInfo=" + this.aimojiInfo + ", socialAvatarInfo=" + this.socialAvatarInfo + ", duoAvatarStickerInfo=" + this.duoAvatarStickerInfo + ", thirdPartyStickerInfo=" + this.thirdPartyStickerInfo + ", aiStickerInfo=" + this.aiStickerInfo + ", stickerVariant=" + this.stickerVariant + ", stickerVariantItems=" + this.stickerVariantItems + ", blockedActions=" + this.blockedActions + ", typingRecommendationItem=" + this.typingRecommendationItem + ", photoCommentStickerItem=" + this.photoCommentStickerItem + ", imagineStudioInfo=" + this.imagineStudioInfo + ')';
    }

    public final StickerImage currentImage() {
        StickerVariantItem next;
        StickerImage stickerImage;
        Integer num = this.stickerVariant;
        if (num != null) {
            int iIntValue = num.intValue();
            List<StickerVariantItem> list = this.stickerVariantItems;
            if (list != null) {
                Iterator<StickerVariantItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Integer num2 = next.stickerVariant;
                    if (num2 != null && num2.intValue() == iIntValue) {
                        break;
                    }
                }
                StickerVariantItem stickerVariantItem = next;
                if (stickerVariantItem != null && (stickerImage = stickerVariantItem.image) != null) {
                    return stickerImage;
                }
            }
        }
        StickerBase stickerBase = this.stickerBase;
        if (stickerBase != null) {
            return stickerBase.image;
        }
        return null;
    }

    public final StickerImage currentThumbnail() {
        StickerVariantItem next;
        StickerImage stickerImage;
        Integer num = this.stickerVariant;
        if (num != null) {
            int iIntValue = num.intValue();
            List<StickerVariantItem> list = this.stickerVariantItems;
            if (list != null) {
                Iterator<StickerVariantItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Integer num2 = next.stickerVariant;
                    if (num2 != null && num2.intValue() == iIntValue) {
                        break;
                    }
                }
                StickerVariantItem stickerVariantItem = next;
                if (stickerVariantItem != null && (stickerImage = stickerVariantItem.thumbnail) != null) {
                    return stickerImage;
                }
            }
        }
        StickerBase stickerBase = this.stickerBase;
        if (stickerBase != null) {
            return stickerBase.thumbnail;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickerItem(StickerBase stickerBase, StickerUserInfo stickerUserInfo, Long l, Long l2, Long l3, String str, List<String> list, String str2, Long l4, Integer num, SubOnlyStickerItem subOnlyStickerItem, VideoToStickerItem videoToStickerItem, AIMojiStickerItem aIMojiStickerItem, SocialAvatarStickerItem socialAvatarStickerItem, DuoAvatarStickerItem duoAvatarStickerItem, ThirdpartyStickerItem thirdpartyStickerItem, AIStickerItem aIStickerItem, @StickerVariant Integer num2, List<StickerVariantItem> list2, List<? extends EnumC2243731Crr> list3, TypingRecommendationItem typingRecommendationItem, PhotoCommentStickerItem photoCommentStickerItem, ImagineStudioInfo imagineStudioInfo) {
        this.stickerBase = stickerBase;
        this.userInfo = stickerUserInfo;
        this.createTime = l;
        this.updateTime = l2;
        this.favoriteTime = l3;
        this.moderationReason = str;
        this.tags = list;
        this.description = str2;
        this.setId = l4;
        this.createSource = num;
        this.subOnlyInfo = subOnlyStickerItem;
        this.videoStickerInfo = videoToStickerItem;
        this.aimojiInfo = aIMojiStickerItem;
        this.socialAvatarInfo = socialAvatarStickerItem;
        this.duoAvatarStickerInfo = duoAvatarStickerItem;
        this.thirdPartyStickerInfo = thirdpartyStickerItem;
        this.aiStickerInfo = aIStickerItem;
        this.stickerVariant = num2;
        this.stickerVariantItems = list2;
        this.blockedActions = list3;
        this.typingRecommendationItem = typingRecommendationItem;
        this.photoCommentStickerItem = photoCommentStickerItem;
        this.imagineStudioInfo = imagineStudioInfo;
    }

    public StickerItem(StickerBase stickerBase, StickerUserInfo stickerUserInfo, Long l, Long l2, Long l3, String str, List list, String str2, Long l4, Integer num, SubOnlyStickerItem subOnlyStickerItem, VideoToStickerItem videoToStickerItem, AIMojiStickerItem aIMojiStickerItem, SocialAvatarStickerItem socialAvatarStickerItem, DuoAvatarStickerItem duoAvatarStickerItem, ThirdpartyStickerItem thirdpartyStickerItem, AIStickerItem aIStickerItem, Integer num2, List list2, List list3, TypingRecommendationItem typingRecommendationItem, PhotoCommentStickerItem photoCommentStickerItem, ImagineStudioInfo imagineStudioInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stickerBase, (i & 2) != 0 ? null : stickerUserInfo, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : l4, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : subOnlyStickerItem, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : videoToStickerItem, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : aIMojiStickerItem, (i & 8192) != 0 ? null : socialAvatarStickerItem, (i & 16384) != 0 ? null : duoAvatarStickerItem, (32768 & i) != 0 ? null : thirdpartyStickerItem, (65536 & i) != 0 ? null : aIStickerItem, (131072 & i) != 0 ? null : num2, (262144 & i) != 0 ? null : list2, (524288 & i) != 0 ? C13BV.INSTANCE : list3, (1048576 & i) != 0 ? null : typingRecommendationItem, (2097152 & i) != 0 ? null : photoCommentStickerItem, (i & 4194304) != 0 ? null : imagineStudioInfo);
    }
}
