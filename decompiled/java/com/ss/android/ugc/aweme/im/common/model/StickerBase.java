package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerBase implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("image")
    public final StickerImage image;

    @C09CT("moderation_status")
    public final Integer moderationStatus;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("third_party_str_id")
    public final String thirdPartyStickerId;

    @C09CT("thumbnail")
    public final StickerImage thumbnail;

    @C09CT("title")
    public final String title;

    public StickerBase() {
        this(null, null, null, null, null, null, null);
    }

    public final StickerBase copy(Long l, StickerImage stickerImage, StickerImage stickerImage2, Integer num, Integer num2, String str, String str2) {
        return new StickerBase(l, stickerImage, stickerImage2, num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerBase)) {
            return false;
        }
        StickerBase stickerBase = (StickerBase) obj;
        return Intrinsics.LJFF(this.id, stickerBase.id) && Intrinsics.LJFF(this.image, stickerBase.image) && Intrinsics.LJFF(this.thumbnail, stickerBase.thumbnail) && Intrinsics.LJFF(this.stickerType, stickerBase.stickerType) && Intrinsics.LJFF(this.moderationStatus, stickerBase.moderationStatus) && Intrinsics.LJFF(this.title, stickerBase.title) && Intrinsics.LJFF(this.thirdPartyStickerId, stickerBase.thirdPartyStickerId);
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        StickerImage stickerImage = this.image;
        int iHashCode2 = (iHashCode + (stickerImage == null ? 0 : stickerImage.hashCode())) * 31;
        StickerImage stickerImage2 = this.thumbnail;
        int iHashCode3 = (iHashCode2 + (stickerImage2 == null ? 0 : stickerImage2.hashCode())) * 31;
        Integer num = this.stickerType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.moderationStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thirdPartyStickerId;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerBase(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", thumbnail=");
        sbLIZ.append(this.thumbnail);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.stickerType);
        sbLIZ.append(", moderationStatus=");
        sbLIZ.append(this.moderationStatus);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", thirdPartyStickerId=");
        sbLIZ.append(this.thirdPartyStickerId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerBase(Long l, StickerImage stickerImage, StickerImage stickerImage2, Integer num, Integer num2, String str, String str2) {
        this.id = l;
        this.image = stickerImage;
        this.thumbnail = stickerImage2;
        this.stickerType = num;
        this.moderationStatus = num2;
        this.title = str;
        this.thirdPartyStickerId = str2;
    }
}
