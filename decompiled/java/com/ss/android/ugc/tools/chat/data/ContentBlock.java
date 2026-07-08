package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ContentBlock {

    @C09CT("type")
    public final Integer contentType;

    @C09CT("dynamic_display_data")
    public final DynamicDisplayData dynamicDisplayData;

    @C09CT("image")
    public final ImageBlock image;

    @C09CT("is_aigc")
    public final Boolean isAigc;

    @C09CT("reasoning_content")
    public final String reasoningContent;

    @C09CT("text")
    public final String text;

    @C09CT("video")
    public final VideoBlock video;

    public ContentBlock() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentBlock)) {
            return false;
        }
        ContentBlock contentBlock = (ContentBlock) obj;
        return Intrinsics.LJFF(this.contentType, contentBlock.contentType) && Intrinsics.LJFF(this.text, contentBlock.text) && Intrinsics.LJFF(this.image, contentBlock.image) && Intrinsics.LJFF(this.video, contentBlock.video) && Intrinsics.LJFF(this.reasoningContent, contentBlock.reasoningContent) && Intrinsics.LJFF(this.dynamicDisplayData, contentBlock.dynamicDisplayData) && Intrinsics.LJFF(this.isAigc, contentBlock.isAigc);
    }

    public final int hashCode() {
        Integer num = this.contentType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageBlock imageBlock = this.image;
        int iHashCode3 = (iHashCode2 + (imageBlock == null ? 0 : imageBlock.hashCode())) * 31;
        VideoBlock videoBlock = this.video;
        int iHashCode4 = (iHashCode3 + (videoBlock == null ? 0 : videoBlock.hashCode())) * 31;
        String str2 = this.reasoningContent;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DynamicDisplayData dynamicDisplayData = this.dynamicDisplayData;
        int iHashCode6 = (iHashCode5 + (dynamicDisplayData == null ? 0 : dynamicDisplayData.hashCode())) * 31;
        Boolean bool = this.isAigc;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentBlock(contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", reasoningContent=");
        sbLIZ.append(this.reasoningContent);
        sbLIZ.append(", dynamicDisplayData=");
        sbLIZ.append(this.dynamicDisplayData);
        sbLIZ.append(", isAigc=");
        sbLIZ.append(this.isAigc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentBlock(Integer num, String str, ImageBlock imageBlock, VideoBlock videoBlock, String str2, DynamicDisplayData dynamicDisplayData, Boolean bool) {
        this.contentType = num;
        this.text = str;
        this.image = imageBlock;
        this.video = videoBlock;
        this.reasoningContent = str2;
        this.dynamicDisplayData = dynamicDisplayData;
        this.isAigc = bool;
    }
}
