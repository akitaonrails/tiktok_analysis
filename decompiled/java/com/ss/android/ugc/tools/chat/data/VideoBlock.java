package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VideoBlock {

    @C09CT("anchors")
    public final List<Object> anchors;

    @C09CT("author")
    public final Author author;

    @C09CT("cameo_infos")
    public final List<CameoMentionInfo> cameoInfos;

    @C09CT("cover")
    public final ImageBlock cover;

    @C09CT("gen_details")
    public final GenerationDetails generationDetails;

    @C09CT("link_info")
    public final LinkInfo linkInfo;

    @C09CT("resolution")
    public final Resolution resolution;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_model")
    public final String videoModel;

    @C09CT("video_type")
    public final Integer videoType;

    public VideoBlock() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoBlock)) {
            return false;
        }
        VideoBlock videoBlock = (VideoBlock) obj;
        return Intrinsics.LJFF(this.videoId, videoBlock.videoId) && Intrinsics.LJFF(this.videoType, videoBlock.videoType) && Intrinsics.LJFF(this.cover, videoBlock.cover) && Intrinsics.LJFF(this.videoModel, videoBlock.videoModel) && Intrinsics.LJFF(this.linkInfo, videoBlock.linkInfo) && Intrinsics.LJFF(this.resolution, videoBlock.resolution) && Intrinsics.LJFF(this.anchors, videoBlock.anchors) && Intrinsics.LJFF(this.generationDetails, videoBlock.generationDetails) && Intrinsics.LJFF(this.author, videoBlock.author) && Intrinsics.LJFF(this.cameoInfos, videoBlock.cameoInfos);
    }

    public final int hashCode() {
        String str = this.videoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.videoType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ImageBlock imageBlock = this.cover;
        int iHashCode3 = (iHashCode2 + (imageBlock == null ? 0 : imageBlock.hashCode())) * 31;
        String str2 = this.videoModel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkInfo linkInfo = this.linkInfo;
        int iHashCode5 = (iHashCode4 + (linkInfo == null ? 0 : linkInfo.hashCode())) * 31;
        Resolution resolution = this.resolution;
        int iHashCode6 = (iHashCode5 + (resolution == null ? 0 : resolution.hashCode())) * 31;
        List<Object> list = this.anchors;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GenerationDetails generationDetails = this.generationDetails;
        int iHashCode8 = (iHashCode7 + (generationDetails == null ? 0 : generationDetails.hashCode())) * 31;
        Author author = this.author;
        int iHashCode9 = (iHashCode8 + (author == null ? 0 : author.hashCode())) * 31;
        List<CameoMentionInfo> list2 = this.cameoInfos;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoBlock(videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", videoType=");
        sbLIZ.append(this.videoType);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", videoModel=");
        sbLIZ.append(this.videoModel);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(", resolution=");
        sbLIZ.append(this.resolution);
        sbLIZ.append(", anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(", generationDetails=");
        sbLIZ.append(this.generationDetails);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", cameoInfos=");
        sbLIZ.append(this.cameoInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoBlock(String str, Integer num, ImageBlock imageBlock, String str2, LinkInfo linkInfo, Resolution resolution, List<Object> list, GenerationDetails generationDetails, Author author, List<CameoMentionInfo> list2) {
        this.videoId = str;
        this.videoType = num;
        this.cover = imageBlock;
        this.videoModel = str2;
        this.linkInfo = linkInfo;
        this.resolution = resolution;
        this.anchors = list;
        this.generationDetails = generationDetails;
        this.author = author;
        this.cameoInfos = list2;
    }
}
