package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarStickerItem implements Serializable {

    @C09CT("element_id")
    public final String elementId;

    @C09CT("element_type")
    public final Integer elementType;

    @C09CT("element_url")
    public final String elementUrl;

    @C09CT("expression")
    public final String expression;

    @C09CT("input")
    public final String input;

    @C09CT("original_sa_sticker_id")
    public final Long originalSAStickerId;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("user_id")
    public final Long userId;

    public SocialAvatarStickerItem() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarStickerItem)) {
            return false;
        }
        SocialAvatarStickerItem socialAvatarStickerItem = (SocialAvatarStickerItem) obj;
        return Intrinsics.LJFF(this.userId, socialAvatarStickerItem.userId) && Intrinsics.LJFF(this.expression, socialAvatarStickerItem.expression) && Intrinsics.LJFF(this.elementType, socialAvatarStickerItem.elementType) && Intrinsics.LJFF(this.input, socialAvatarStickerItem.input) && Intrinsics.LJFF(this.prompt, socialAvatarStickerItem.prompt) && Intrinsics.LJFF(this.originalSAStickerId, socialAvatarStickerItem.originalSAStickerId) && Intrinsics.LJFF(this.elementId, socialAvatarStickerItem.elementId) && Intrinsics.LJFF(this.elementUrl, socialAvatarStickerItem.elementUrl);
    }

    public int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.expression;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.elementType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.input;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prompt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.originalSAStickerId;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.elementId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.elementUrl;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarStickerItem(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", expression=");
        sbLIZ.append(this.expression);
        sbLIZ.append(", elementType=");
        sbLIZ.append(this.elementType);
        sbLIZ.append(", input=");
        sbLIZ.append(this.input);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", originalSAStickerId=");
        sbLIZ.append(this.originalSAStickerId);
        sbLIZ.append(", elementId=");
        sbLIZ.append(this.elementId);
        sbLIZ.append(", elementUrl=");
        sbLIZ.append(this.elementUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarStickerItem(Long l, String str, Integer num, String str2, String str3, Long l2, String str4, String str5) {
        this.userId = l;
        this.expression = str;
        this.elementType = num;
        this.input = str2;
        this.prompt = str3;
        this.originalSAStickerId = l2;
        this.elementId = str4;
        this.elementUrl = str5;
    }
}
