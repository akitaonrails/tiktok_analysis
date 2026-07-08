package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinStyleStruct {

    @C09CT("background_model")
    public final BulletinStyleBackgroundStruct backgroundModel;

    @C09CT("badge_model")
    public final BulletinStyleBadgeModel badgeModel;

    @C09CT("extra")
    public final List<BulletinCardKV> extra;

    @C09CT("front_style")
    public final Integer frontStyle;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("text_model")
    public final BulletinStyleTextModel textModel;

    public BulletinStyleStruct() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinStyleStruct)) {
            return false;
        }
        BulletinStyleStruct bulletinStyleStruct = (BulletinStyleStruct) obj;
        return Intrinsics.LJFF(this.styleId, bulletinStyleStruct.styleId) && Intrinsics.LJFF(this.textModel, bulletinStyleStruct.textModel) && Intrinsics.LJFF(this.backgroundModel, bulletinStyleStruct.backgroundModel) && Intrinsics.LJFF(this.badgeModel, bulletinStyleStruct.badgeModel) && Intrinsics.LJFF(this.frontStyle, bulletinStyleStruct.frontStyle) && Intrinsics.LJFF(this.extra, bulletinStyleStruct.extra);
    }

    public final int hashCode() {
        String str = this.styleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BulletinStyleTextModel bulletinStyleTextModel = this.textModel;
        int iHashCode2 = (iHashCode + (bulletinStyleTextModel == null ? 0 : bulletinStyleTextModel.hashCode())) * 31;
        BulletinStyleBackgroundStruct bulletinStyleBackgroundStruct = this.backgroundModel;
        int iHashCode3 = (iHashCode2 + (bulletinStyleBackgroundStruct == null ? 0 : bulletinStyleBackgroundStruct.hashCode())) * 31;
        BulletinStyleBadgeModel bulletinStyleBadgeModel = this.badgeModel;
        int iHashCode4 = (iHashCode3 + (bulletinStyleBadgeModel == null ? 0 : bulletinStyleBadgeModel.hashCode())) * 31;
        Integer num = this.frontStyle;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<BulletinCardKV> list = this.extra;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinStyleStruct(styleId=");
        sbLIZ.append(this.styleId);
        sbLIZ.append(", textModel=");
        sbLIZ.append(this.textModel);
        sbLIZ.append(", backgroundModel=");
        sbLIZ.append(this.backgroundModel);
        sbLIZ.append(", badgeModel=");
        sbLIZ.append(this.badgeModel);
        sbLIZ.append(", frontStyle=");
        sbLIZ.append(this.frontStyle);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinStyleStruct(String str, BulletinStyleTextModel bulletinStyleTextModel, BulletinStyleBackgroundStruct bulletinStyleBackgroundStruct, BulletinStyleBadgeModel bulletinStyleBadgeModel, Integer num, List<BulletinCardKV> list) {
        this.styleId = str;
        this.textModel = bulletinStyleTextModel;
        this.backgroundModel = bulletinStyleBackgroundStruct;
        this.badgeModel = bulletinStyleBadgeModel;
        this.frontStyle = num;
        this.extra = list;
    }
}
