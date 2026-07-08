package com.ss.android.ugc.aweme.slash.cell.card;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashImgCardCellModel extends BaseSlashCellData {

    @C09CT("bottom_left_text")
    public final String bottomLeftText;

    @C09CT("content_id")
    public final String contentId;

    @C09CT("desc")
    public final String desc;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("img_size_config")
    public final SizeConfig imgSizeConfig;

    @C09CT("img_url")
    public final String imgUrl;

    @C09CT("is_hot")
    public final Boolean isHot;

    @C09CT("top_rank")
    public final Integer topRank;

    @C09CT("top_right_icon")
    public final String topRightIcon;

    public SlashImgCardCellModel() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashImgCardCellModel)) {
            return false;
        }
        SlashImgCardCellModel slashImgCardCellModel = (SlashImgCardCellModel) obj;
        return Intrinsics.LJFF(this.id, slashImgCardCellModel.id) && Intrinsics.LJFF(this.imgUrl, slashImgCardCellModel.imgUrl) && Intrinsics.LJFF(this.desc, slashImgCardCellModel.desc) && Intrinsics.LJFF(this.topRightIcon, slashImgCardCellModel.topRightIcon) && Intrinsics.LJFF(this.imgSizeConfig, slashImgCardCellModel.imgSizeConfig) && Intrinsics.LJFF(this.contentId, slashImgCardCellModel.contentId) && Intrinsics.LJFF(this.bottomLeftText, slashImgCardCellModel.bottomLeftText) && Intrinsics.LJFF(this.isHot, slashImgCardCellModel.isHot) && Intrinsics.LJFF(this.topRank, slashImgCardCellModel.topRank);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.topRightIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SizeConfig sizeConfig = this.imgSizeConfig;
        int iHashCode5 = (iHashCode4 + (sizeConfig == null ? 0 : sizeConfig.hashCode())) * 31;
        String str5 = this.contentId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bottomLeftText;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isHot;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.topRank;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashImgCardCellModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", imgUrl=");
        sbLIZ.append(this.imgUrl);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", topRightIcon=");
        sbLIZ.append(this.topRightIcon);
        sbLIZ.append(", imgSizeConfig=");
        sbLIZ.append(this.imgSizeConfig);
        sbLIZ.append(", contentId=");
        sbLIZ.append(this.contentId);
        sbLIZ.append(", bottomLeftText=");
        sbLIZ.append(this.bottomLeftText);
        sbLIZ.append(", isHot=");
        sbLIZ.append(this.isHot);
        sbLIZ.append(", topRank=");
        sbLIZ.append(this.topRank);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashImgCardCellModel(String str, String str2, String str3, String str4, SizeConfig sizeConfig, String str5, String str6, Boolean bool, Integer num) {
        super(null, null);
        this.id = str;
        this.imgUrl = str2;
        this.desc = str3;
        this.topRightIcon = str4;
        this.imgSizeConfig = sizeConfig;
        this.contentId = str5;
        this.bottomLeftText = str6;
        this.isHot = bool;
        this.topRank = num;
    }
}
