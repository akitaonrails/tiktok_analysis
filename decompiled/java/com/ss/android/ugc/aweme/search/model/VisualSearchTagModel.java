package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VisualSearchTagModel implements Serializable {

    @C09CT("all_vtags")
    public String allVtags;

    @C09CT("clicked_tag_id")
    public final String clickedTagId;

    @C09CT("cur_detection")
    public final String curDetection;

    @C09CT("is_after_circle_search_block")
    public String isAfterCircleSearchBlock;

    @C09CT("tag_name")
    public final String tagName;

    @C09CT("tag_type")
    public final String tagType;

    @C09CT("tag_uid")
    public final String tagUid;

    @C09CT("unified_tag_id")
    public final String unifiedTagId;

    @C09CT("visual_tag_pos")
    public final String visualTagPos;

    public VisualSearchTagModel() {
        this("", "", "", "", "", "", "", null, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchTagModel)) {
            return false;
        }
        VisualSearchTagModel visualSearchTagModel = (VisualSearchTagModel) obj;
        return Intrinsics.LJFF(this.curDetection, visualSearchTagModel.curDetection) && Intrinsics.LJFF(this.allVtags, visualSearchTagModel.allVtags) && Intrinsics.LJFF(this.tagUid, visualSearchTagModel.tagUid) && Intrinsics.LJFF(this.unifiedTagId, visualSearchTagModel.unifiedTagId) && Intrinsics.LJFF(this.clickedTagId, visualSearchTagModel.clickedTagId) && Intrinsics.LJFF(this.tagName, visualSearchTagModel.tagName) && Intrinsics.LJFF(this.visualTagPos, visualSearchTagModel.visualTagPos) && Intrinsics.LJFF(this.tagType, visualSearchTagModel.tagType) && Intrinsics.LJFF(this.isAfterCircleSearchBlock, visualSearchTagModel.isAfterCircleSearchBlock);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.curDetection.hashCode() * 31) + this.allVtags.hashCode()) * 31) + this.tagUid.hashCode()) * 31) + this.unifiedTagId.hashCode()) * 31) + this.clickedTagId.hashCode()) * 31) + this.tagName.hashCode()) * 31) + this.visualTagPos.hashCode()) * 31;
        String str = this.tagType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.isAfterCircleSearchBlock.hashCode();
    }

    public final String isAfterCircleSearchBlock() {
        return this.isAfterCircleSearchBlock;
    }

    public final void setAfterCircleSearchBlock(String str) {
        this.isAfterCircleSearchBlock = str;
    }

    public final void setAllVtags(String str) {
        this.allVtags = str;
    }

    public VisualSearchTagModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.curDetection = str;
        this.allVtags = str2;
        this.tagUid = str3;
        this.unifiedTagId = str4;
        this.clickedTagId = str5;
        this.tagName = str6;
        this.visualTagPos = str7;
        this.tagType = str8;
        this.isAfterCircleSearchBlock = str9;
    }
}
