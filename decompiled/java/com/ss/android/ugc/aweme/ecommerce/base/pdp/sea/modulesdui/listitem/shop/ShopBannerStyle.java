package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopBannerStyle {

    @C09CT("banner_countdown")
    public final SeaBannerCountDown bannerCountDown;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("end_suffix_icon")
    public final Icon endSuffixIcon;

    @C09CT("end_text")
    public final ECRichText endText;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("start_icon")
    public final Icon startIcon;

    @C09CT("start_text")
    public final ECRichText startText;

    public ShopBannerStyle() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBannerStyle)) {
            return false;
        }
        ShopBannerStyle shopBannerStyle = (ShopBannerStyle) obj;
        return Intrinsics.LJFF(this.startIcon, shopBannerStyle.startIcon) && Intrinsics.LJFF(this.startText, shopBannerStyle.startText) && Intrinsics.LJFF(this.endText, shopBannerStyle.endText) && Intrinsics.LJFF(this.endSuffixIcon, shopBannerStyle.endSuffixIcon) && Intrinsics.LJFF(this.bannerCountDown, shopBannerStyle.bannerCountDown) && Intrinsics.LJFF(this.jumpSchema, shopBannerStyle.jumpSchema) && Intrinsics.LJFF(this.daInfo, shopBannerStyle.daInfo);
    }

    public final int hashCode() {
        Icon icon = this.startIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.startText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.endText;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Icon icon2 = this.endSuffixIcon;
        int iHashCode4 = (iHashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        SeaBannerCountDown seaBannerCountDown = this.bannerCountDown;
        int iHashCode5 = (iHashCode4 + (seaBannerCountDown == null ? 0 : seaBannerCountDown.hashCode())) * 31;
        String str = this.jumpSchema;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopBannerStyle(startIcon=");
        sbLIZ.append(this.startIcon);
        sbLIZ.append(", startText=");
        sbLIZ.append(this.startText);
        sbLIZ.append(", endText=");
        sbLIZ.append(this.endText);
        sbLIZ.append(", endSuffixIcon=");
        sbLIZ.append(this.endSuffixIcon);
        sbLIZ.append(", bannerCountDown=");
        sbLIZ.append(this.bannerCountDown);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopBannerStyle(Icon icon, ECRichText eCRichText, ECRichText eCRichText2, Icon icon2, SeaBannerCountDown seaBannerCountDown, String str, String str2) {
        this.startIcon = icon;
        this.startText = eCRichText;
        this.endText = eCRichText2;
        this.endSuffixIcon = icon2;
        this.bannerCountDown = seaBannerCountDown;
        this.jumpSchema = str;
        this.daInfo = str2;
    }
}
