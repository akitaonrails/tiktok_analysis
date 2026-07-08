package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ImagineStudioInfo implements Serializable {

    @C09CT("base_model")
    public final Integer baseModel;

    @C09CT("element_id")
    public final String elementId;

    @C09CT("element_type")
    public final Integer elementType;

    @C09CT("element_uri")
    public final String elementUri;

    @C09CT("element_url")
    public final String elementUrl;

    @C09CT("emoji_element")
    public final String emojiElement;

    @C09CT("material_sticker_id")
    public final Long materialStickerId;

    @C09CT("material_sticker_type")
    public final Integer materialStickerType;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("sticker_source_image_uri")
    public final String stickerSourceImageUri;

    @C09CT("sticker_source_image_url")
    public final String stickerSourceImageUrl;

    @C09CT("text_element")
    public final String textElement;

    @C09CT("user_ids")
    public final List<Long> userIds;

    public ImagineStudioInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagineStudioInfo)) {
            return false;
        }
        ImagineStudioInfo imagineStudioInfo = (ImagineStudioInfo) obj;
        return Intrinsics.LJFF(this.baseModel, imagineStudioInfo.baseModel) && Intrinsics.LJFF(this.elementType, imagineStudioInfo.elementType) && Intrinsics.LJFF(this.textElement, imagineStudioInfo.textElement) && Intrinsics.LJFF(this.emojiElement, imagineStudioInfo.emojiElement) && Intrinsics.LJFF(this.promptText, imagineStudioInfo.promptText) && Intrinsics.LJFF(this.materialStickerId, imagineStudioInfo.materialStickerId) && Intrinsics.LJFF(this.materialStickerType, imagineStudioInfo.materialStickerType) && Intrinsics.LJFF(this.stickerSourceImageUri, imagineStudioInfo.stickerSourceImageUri) && Intrinsics.LJFF(this.userIds, imagineStudioInfo.userIds) && Intrinsics.LJFF(this.elementId, imagineStudioInfo.elementId) && Intrinsics.LJFF(this.stickerSourceImageUrl, imagineStudioInfo.stickerSourceImageUrl) && Intrinsics.LJFF(this.elementUri, imagineStudioInfo.elementUri) && Intrinsics.LJFF(this.elementUrl, imagineStudioInfo.elementUrl);
    }

    public int hashCode() {
        Integer num = this.baseModel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.elementType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.textElement;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emojiElement;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promptText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.materialStickerId;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.materialStickerType;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.stickerSourceImageUri;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Long> list = this.userIds;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.elementId;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stickerSourceImageUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.elementUri;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.elementUrl;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "ImagineStudioInfo(baseModel=" + this.baseModel + ", elementType=" + this.elementType + ", textElement=" + this.textElement + ", emojiElement=" + this.emojiElement + ", promptText=" + this.promptText + ", materialStickerId=" + this.materialStickerId + ", materialStickerType=" + this.materialStickerType + ", stickerSourceImageUri=" + this.stickerSourceImageUri + ", userIds=" + this.userIds + ", elementId=" + this.elementId + ", stickerSourceImageUrl=" + this.stickerSourceImageUrl + ", elementUri=" + this.elementUri + ", elementUrl=" + this.elementUrl + ')';
    }

    public ImagineStudioInfo(Integer num, Integer num2, String str, String str2, String str3, Long l, Integer num3, String str4, List<Long> list, String str5, String str6, String str7, String str8) {
        this.baseModel = num;
        this.elementType = num2;
        this.textElement = str;
        this.emojiElement = str2;
        this.promptText = str3;
        this.materialStickerId = l;
        this.materialStickerType = num3;
        this.stickerSourceImageUri = str4;
        this.userIds = list;
        this.elementId = str5;
        this.stickerSourceImageUrl = str6;
        this.elementUri = str7;
        this.elementUrl = str8;
    }
}
