package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopPromotionActivity {

    @C09CT("bg_img")
    public Image bgImg;

    @C09CT("dark_icon")
    public Image darkIcon;

    @C09CT("desc")
    public String desc;

    @C09CT("left_icon")
    public Image leftIcon;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("position_type")
    public Integer positionType;

    @C09CT("text_color")
    public Integer textColor;

    @C09CT("type")
    public Integer type;

    public ShopPromotionActivity() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopPromotionActivity)) {
            return false;
        }
        ShopPromotionActivity shopPromotionActivity = (ShopPromotionActivity) obj;
        return Intrinsics.LJFF(this.desc, shopPromotionActivity.desc) && Intrinsics.LJFF(this.type, shopPromotionActivity.type) && Intrinsics.LJFF(this.positionType, shopPromotionActivity.positionType) && Intrinsics.LJFF(this.leftIcon, shopPromotionActivity.leftIcon) && Intrinsics.LJFF(this.darkIcon, shopPromotionActivity.darkIcon) && Intrinsics.LJFF(this.bgImg, shopPromotionActivity.bgImg) && Intrinsics.LJFF(this.logExtra, shopPromotionActivity.logExtra) && Intrinsics.LJFF(this.textColor, shopPromotionActivity.textColor);
    }

    public final int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.positionType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Image image = this.leftIcon;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.darkIcon;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.bgImg;
        int iHashCode6 = (iHashCode5 + (image3 == null ? 0 : image3.hashCode())) * 31;
        String str2 = this.logExtra;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.textColor;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopPromotionActivity(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", positionType=");
        sbLIZ.append(this.positionType);
        sbLIZ.append(", leftIcon=");
        sbLIZ.append(this.leftIcon);
        sbLIZ.append(", darkIcon=");
        sbLIZ.append(this.darkIcon);
        sbLIZ.append(", bgImg=");
        sbLIZ.append(this.bgImg);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopPromotionActivity(String str, Integer num, Integer num2, Image image, Image image2, Image image3, String str2, Integer num3) {
        this.desc = str;
        this.type = num;
        this.positionType = num2;
        this.leftIcon = image;
        this.darkIcon = image2;
        this.bgImg = image3;
        this.logExtra = str2;
        this.textColor = num3;
    }
}
