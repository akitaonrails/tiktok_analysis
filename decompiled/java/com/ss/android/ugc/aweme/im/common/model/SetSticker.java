package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.InterfaceC449850HkV;
import X.InterfaceC451150Hmb;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SetSticker implements InterfaceC449850HkV, InterfaceC451150Hmb, Serializable {

    @C09CT("animated_urls")
    public final StickerUrlStruct animateUrl;

    @C09CT("creator_uid")
    public final Long authorUid;

    @C09CT("display_order")
    public final Integer displayOrder;

    @C09CT("expressions")
    public final List<String> expressions;

    @C09CT("name")
    public final String name;

    @C09CT("original_sticker_id")
    public final Long originalStickerId;

    @C09CT("set_id")
    public final Long setId;

    @C09CT("static_urls")
    public final StickerUrlStruct staticUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long stickerId;

    @C09CT("sticker_sub_type")
    public final StickerSubType stickerSubType;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("tier_id")
    public final String tierId;

    @C09CT("typing_recommendation_id")
    public final String typingRecommendationId;

    public SetSticker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final SetSticker copy(Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2, List<String> list, String str2, StickerSubType stickerSubType, Long l4, String str3) {
        return new SetSticker(l, str, stickerUrlStruct, stickerUrlStruct2, num, l2, l3, num2, list, str2, stickerSubType, l4, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSticker)) {
            return false;
        }
        SetSticker setSticker = (SetSticker) obj;
        return Intrinsics.LJFF(this.stickerId, setSticker.stickerId) && Intrinsics.LJFF(this.name, setSticker.name) && Intrinsics.LJFF(this.staticUrl, setSticker.staticUrl) && Intrinsics.LJFF(this.animateUrl, setSticker.animateUrl) && Intrinsics.LJFF(this.displayOrder, setSticker.displayOrder) && Intrinsics.LJFF(this.setId, setSticker.setId) && Intrinsics.LJFF(this.authorUid, setSticker.authorUid) && Intrinsics.LJFF(this.stickerType, setSticker.stickerType) && Intrinsics.LJFF(this.expressions, setSticker.expressions) && Intrinsics.LJFF(this.tierId, setSticker.tierId) && this.stickerSubType == setSticker.stickerSubType && Intrinsics.LJFF(this.originalStickerId, setSticker.originalStickerId) && Intrinsics.LJFF(this.typingRecommendationId, setSticker.typingRecommendationId);
    }

    public int hashCode() {
        Long l = this.stickerId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.staticUrl;
        int iHashCode3 = (iHashCode2 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct2 = this.animateUrl;
        int iHashCode4 = (iHashCode3 + (stickerUrlStruct2 == null ? 0 : stickerUrlStruct2.hashCode())) * 31;
        Integer num = this.displayOrder;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.setId;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.authorUid;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.stickerType;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.expressions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.tierId;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StickerSubType stickerSubType = this.stickerSubType;
        int iHashCode11 = (iHashCode10 + (stickerSubType == null ? 0 : stickerSubType.hashCode())) * 31;
        Long l4 = this.originalStickerId;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.typingRecommendationId;
        return iHashCode12 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SetSticker(stickerId=" + this.stickerId + ", name=" + this.name + ", staticUrl=" + this.staticUrl + ", animateUrl=" + this.animateUrl + ", displayOrder=" + this.displayOrder + ", setId=" + this.setId + ", authorUid=" + this.authorUid + ", stickerType=" + this.stickerType + ", expressions=" + this.expressions + ", tierId=" + this.tierId + ", stickerSubType=" + this.stickerSubType + ", originalStickerId=" + this.originalStickerId + ", typingRecommendationId=" + this.typingRecommendationId + ')';
    }

    public final StickerUrlStruct getAnimateUrl() {
        return this.animateUrl;
    }

    public final Long getAuthorUid() {
        return this.authorUid;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final List<String> getExpressions() {
        return this.expressions;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getOriginalStickerId() {
        return this.originalStickerId;
    }

    public final Long getSetId() {
        return this.setId;
    }

    public final StickerUrlStruct getStaticUrl() {
        return this.staticUrl;
    }

    public final Long getStickerId() {
        return this.stickerId;
    }

    public final StickerSubType getStickerSubType() {
        return this.stickerSubType;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final String getTierId() {
        return this.tierId;
    }

    public final String getTypingRecommendationId() {
        return this.typingRecommendationId;
    }

    public SetSticker(Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2, List<String> list, String str2, StickerSubType stickerSubType, Long l4, String str3) {
        this.stickerId = l;
        this.name = str;
        this.staticUrl = stickerUrlStruct;
        this.animateUrl = stickerUrlStruct2;
        this.displayOrder = num;
        this.setId = l2;
        this.authorUid = l3;
        this.stickerType = num2;
        this.expressions = list;
        this.tierId = str2;
        this.stickerSubType = stickerSubType;
        this.originalStickerId = l4;
        this.typingRecommendationId = str3;
    }
}
