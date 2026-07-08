package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class IcAigcCommonMessageCard {

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("image_card")
    public final ImageCardContent imageCardContent;

    @C09CT("rich_md_text_card")
    public final MarkDownTextCardContent markdownTextCardContent;

    @C09CT("context")
    public final MessageContext messageContext;

    @C09CT("meta_data")
    public final Map<String, String> metricsData;

    @C09CT("rich_text_card")
    public final RichTextCardContent richTextCardContent;

    @C09CT("task_info")
    public final TaskInfo taskInfo;

    @C09CT("text_card")
    public final TextCardContent textCardContent;

    @C09CT("video_card")
    public final VideoCardContent videoCardContent;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IcAigcCommonMessageCard)) {
            return false;
        }
        IcAigcCommonMessageCard icAigcCommonMessageCard = (IcAigcCommonMessageCard) obj;
        return Intrinsics.LJFF(this.cardType, icAigcCommonMessageCard.cardType) && Intrinsics.LJFF(this.taskInfo, icAigcCommonMessageCard.taskInfo) && Intrinsics.LJFF(this.messageContext, icAigcCommonMessageCard.messageContext) && Intrinsics.LJFF(this.textCardContent, icAigcCommonMessageCard.textCardContent) && Intrinsics.LJFF(this.imageCardContent, icAigcCommonMessageCard.imageCardContent) && Intrinsics.LJFF(this.videoCardContent, icAigcCommonMessageCard.videoCardContent) && Intrinsics.LJFF(this.richTextCardContent, icAigcCommonMessageCard.richTextCardContent) && Intrinsics.LJFF(this.markdownTextCardContent, icAigcCommonMessageCard.markdownTextCardContent) && Intrinsics.LJFF(this.metricsData, icAigcCommonMessageCard.metricsData);
    }

    public final int hashCode() {
        Integer num = this.cardType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        TaskInfo taskInfo = this.taskInfo;
        int iHashCode2 = (iHashCode + (taskInfo == null ? 0 : taskInfo.hashCode())) * 31;
        MessageContext messageContext = this.messageContext;
        int iHashCode3 = (iHashCode2 + (messageContext == null ? 0 : messageContext.hashCode())) * 31;
        TextCardContent textCardContent = this.textCardContent;
        int iHashCode4 = (iHashCode3 + (textCardContent == null ? 0 : textCardContent.hashCode())) * 31;
        ImageCardContent imageCardContent = this.imageCardContent;
        int iHashCode5 = (iHashCode4 + (imageCardContent == null ? 0 : imageCardContent.hashCode())) * 31;
        VideoCardContent videoCardContent = this.videoCardContent;
        int iHashCode6 = (iHashCode5 + (videoCardContent == null ? 0 : videoCardContent.hashCode())) * 31;
        RichTextCardContent richTextCardContent = this.richTextCardContent;
        int iHashCode7 = (iHashCode6 + (richTextCardContent == null ? 0 : richTextCardContent.hashCode())) * 31;
        MarkDownTextCardContent markDownTextCardContent = this.markdownTextCardContent;
        int iHashCode8 = (iHashCode7 + (markDownTextCardContent == null ? 0 : markDownTextCardContent.hashCode())) * 31;
        Map<String, String> map = this.metricsData;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IcAigcCommonMessageCard(cardType=");
        sbLIZ.append(this.cardType);
        sbLIZ.append(", taskInfo=");
        sbLIZ.append(this.taskInfo);
        sbLIZ.append(", messageContext=");
        sbLIZ.append(this.messageContext);
        sbLIZ.append(", textCardContent=");
        sbLIZ.append(this.textCardContent);
        sbLIZ.append(", imageCardContent=");
        sbLIZ.append(this.imageCardContent);
        sbLIZ.append(", videoCardContent=");
        sbLIZ.append(this.videoCardContent);
        sbLIZ.append(", richTextCardContent=");
        sbLIZ.append(this.richTextCardContent);
        sbLIZ.append(", markdownTextCardContent=");
        sbLIZ.append(this.markdownTextCardContent);
        sbLIZ.append(", metricsData=");
        sbLIZ.append(this.metricsData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IcAigcCommonMessageCard(Integer num, TaskInfo taskInfo, MessageContext messageContext, TextCardContent textCardContent, ImageCardContent imageCardContent, VideoCardContent videoCardContent, RichTextCardContent richTextCardContent, MarkDownTextCardContent markDownTextCardContent, Map<String, String> map) {
        this.cardType = num;
        this.taskInfo = taskInfo;
        this.messageContext = messageContext;
        this.textCardContent = textCardContent;
        this.imageCardContent = imageCardContent;
        this.videoCardContent = videoCardContent;
        this.richTextCardContent = richTextCardContent;
        this.markdownTextCardContent = markDownTextCardContent;
        this.metricsData = map;
    }
}
