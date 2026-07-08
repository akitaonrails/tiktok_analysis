package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VTagStruct implements IVisualSearchTagItem, Serializable {

    @C09CT("bbox")
    public TagBoundBoxStruct bbox;

    @C09CT("dynamic_frame_info_list")
    public List<DynamicFrameInfo> dynamicFrameInfoList;

    @C09CT("end")
    public int end;

    @C09CT("penetrate_info")
    public String penetrateInfo;

    @C09CT("score")
    public float score;

    @C09CT("sort_score")
    public Float sortScore;

    @C09CT("start")
    public int start;

    @C09CT("tag_coord")
    public VTagCoordStruct tagCoord;

    @C09CT("tag_id")
    public String tagId;

    @C09CT("tag_name")
    public String tagName;

    @C09CT("tag_space")
    public String tagSpace;

    @C09CT("tag_target_channel")
    public String tagTargetChannel;

    @C09CT("tag_type")
    public String tagType;

    @C09CT("tag_uid")
    public String tagUid;

    @C09CT("unified_tag_id")
    public String unifiedTagId;

    public VTagStruct() {
    }

    public final VTagStruct copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, Float f2, VTagCoordStruct vTagCoordStruct, TagBoundBoxStruct tagBoundBoxStruct, int i, int i2, String str8, List<DynamicFrameInfo> list) {
        return new VTagStruct(str, str2, str3, str4, str5, str6, str7, f, f2, vTagCoordStruct, tagBoundBoxStruct, i, i2, str8, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VTagStruct)) {
            return false;
        }
        VTagStruct vTagStruct = (VTagStruct) obj;
        return Intrinsics.LJFF(this.tagUid, vTagStruct.tagUid) && Intrinsics.LJFF(this.tagId, vTagStruct.tagId) && Intrinsics.LJFF(this.tagName, vTagStruct.tagName) && Intrinsics.LJFF(this.unifiedTagId, vTagStruct.unifiedTagId) && Intrinsics.LJFF(this.tagSpace, vTagStruct.tagSpace) && Intrinsics.LJFF(this.tagType, vTagStruct.tagType) && Intrinsics.LJFF(this.tagTargetChannel, vTagStruct.tagTargetChannel) && Float.compare(this.score, vTagStruct.score) == 0 && Intrinsics.LJFF(this.sortScore, vTagStruct.sortScore) && Intrinsics.LJFF(this.tagCoord, vTagStruct.tagCoord) && Intrinsics.LJFF(this.bbox, vTagStruct.bbox) && this.start == vTagStruct.start && this.end == vTagStruct.end && Intrinsics.LJFF(this.penetrateInfo, vTagStruct.penetrateInfo) && Intrinsics.LJFF(this.dynamicFrameInfoList, vTagStruct.dynamicFrameInfoList);
    }

    public String toString() {
        return "VTagStruct(tagUid=" + this.tagUid + ", tagId=" + this.tagId + ", tagName=" + this.tagName + ", unifiedTagId=" + this.unifiedTagId + ", tagSpace=" + this.tagSpace + ", tagType=" + this.tagType + ", tagTargetChannel=" + this.tagTargetChannel + ", score=" + this.score + ", sortScore=" + this.sortScore + ", tagCoord=" + this.tagCoord + ", bbox=" + this.bbox + ", start=" + this.start + ", end=" + this.end + ", penetrateInfo=" + this.penetrateInfo + ", dynamicFrameInfoList=" + this.dynamicFrameInfoList + ')';
    }

    public int hashCode() {
        String str = this.tagUid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tagName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unifiedTagId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tagSpace;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tagType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tagTargetChannel;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.floatToIntBits(this.score)) * 31;
        Float f = this.sortScore;
        int iHashCode8 = (((iHashCode7 + (f == null ? 0 : f.hashCode())) * 31) + this.tagCoord.hashCode()) * 31;
        TagBoundBoxStruct tagBoundBoxStruct = this.bbox;
        int iHashCode9 = (((((iHashCode8 + (tagBoundBoxStruct == null ? 0 : tagBoundBoxStruct.hashCode())) * 31) + this.start) * 31) + this.end) * 31;
        String str8 = this.penetrateInfo;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<DynamicFrameInfo> list = this.dynamicFrameInfoList;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final TagBoundBoxStruct getBbox() {
        return this.bbox;
    }

    public final List<DynamicFrameInfo> getDynamicFrameInfoList() {
        return this.dynamicFrameInfoList;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getPenetrateInfo() {
        return this.penetrateInfo;
    }

    public final float getScore() {
        return this.score;
    }

    public final Float getSortScore() {
        return this.sortScore;
    }

    public final int getStart() {
        return this.start;
    }

    public final VTagCoordStruct getTagCoord() {
        return this.tagCoord;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final String getTagSpace() {
        return this.tagSpace;
    }

    public final String getTagTargetChannel() {
        return this.tagTargetChannel;
    }

    public final String getTagType() {
        return this.tagType;
    }

    public final String getTagUid() {
        return this.tagUid;
    }

    public final String getUnifiedTagId() {
        return this.unifiedTagId;
    }

    public VTagStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, Float f2, VTagCoordStruct vTagCoordStruct, TagBoundBoxStruct tagBoundBoxStruct, int i, int i2, String str8, List<DynamicFrameInfo> list) {
        this.tagUid = str;
        this.tagId = str2;
        this.tagName = str3;
        this.unifiedTagId = str4;
        this.tagSpace = str5;
        this.tagType = str6;
        this.tagTargetChannel = str7;
        this.score = f;
        this.sortScore = f2;
        this.tagCoord = vTagCoordStruct;
        this.bbox = tagBoundBoxStruct;
        this.start = i;
        this.end = i2;
        this.penetrateInfo = str8;
        this.dynamicFrameInfoList = list;
    }
}
