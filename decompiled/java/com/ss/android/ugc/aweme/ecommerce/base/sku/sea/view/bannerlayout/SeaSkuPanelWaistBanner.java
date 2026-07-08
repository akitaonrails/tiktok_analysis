package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelWaistBanner implements Parcelable {

    @C09CT("background")
    public SeaBannerBackground background;

    @C09CT("banner_countdown")
    public SeaBannerCountDown bannerCountDown;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("end_suffix_icon")
    public Icon endSuffixIcon;

    @C09CT("end_text")
    public ECRichText endText;

    @C09CT("jump_schema")
    public WaistJumpSchema jumpSchema;

    @C09CT("position_type")
    public Integer positionType;

    @C09CT("start_icon")
    public Icon startIcon;

    @C09CT("start_text")
    public ECRichText startText;
    public static final Parcelable.Creator<SeaSkuPanelWaistBanner> CREATOR = new Parcelable.Creator<SeaSkuPanelWaistBanner>() { // from class: X.02ln
        @Override // android.os.Parcelable.Creator
        public final SeaSkuPanelWaistBanner createFromParcel(Parcel parcel) {
            Integer numValueOf;
            SeaBannerBackground seaBannerBackgroundCreateFromParcel;
            SeaBannerCountDown seaBannerCountDownCreateFromParcel;
            WaistJumpSchema waistJumpSchemaCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                seaBannerBackgroundCreateFromParcel = null;
            } else {
                seaBannerBackgroundCreateFromParcel = SeaBannerBackground.CREATOR.createFromParcel(parcel);
            }
            SeaBannerBackground seaBannerBackground = seaBannerBackgroundCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(SeaSkuPanelWaistBanner.class.getClassLoader());
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SeaSkuPanelWaistBanner.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(SeaSkuPanelWaistBanner.class.getClassLoader());
            if (parcel.readInt() == 0) {
                seaBannerCountDownCreateFromParcel = null;
            } else {
                seaBannerCountDownCreateFromParcel = SeaBannerCountDown.CREATOR.createFromParcel(parcel);
            }
            SeaBannerCountDown seaBannerCountDown = seaBannerCountDownCreateFromParcel;
            Icon icon2 = (Icon) parcel.readParcelable(SeaSkuPanelWaistBanner.class.getClassLoader());
            if (parcel.readInt() != 0) {
                waistJumpSchemaCreateFromParcel = WaistJumpSchema.CREATOR.createFromParcel(parcel);
            }
            return new SeaSkuPanelWaistBanner(numValueOf, seaBannerBackground, icon, eCRichText, eCRichText2, seaBannerCountDown, icon2, waistJumpSchemaCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaSkuPanelWaistBanner[] newArray(int i) {
            return new SeaSkuPanelWaistBanner[i];
        }
    };
    public static final int $stable = 8;

    public SeaSkuPanelWaistBanner() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaSkuPanelWaistBanner)) {
            return false;
        }
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = (SeaSkuPanelWaistBanner) obj;
        return Intrinsics.LJFF(this.positionType, seaSkuPanelWaistBanner.positionType) && Intrinsics.LJFF(this.background, seaSkuPanelWaistBanner.background) && Intrinsics.LJFF(this.startIcon, seaSkuPanelWaistBanner.startIcon) && Intrinsics.LJFF(this.startText, seaSkuPanelWaistBanner.startText) && Intrinsics.LJFF(this.endText, seaSkuPanelWaistBanner.endText) && Intrinsics.LJFF(this.bannerCountDown, seaSkuPanelWaistBanner.bannerCountDown) && Intrinsics.LJFF(this.endSuffixIcon, seaSkuPanelWaistBanner.endSuffixIcon) && Intrinsics.LJFF(this.jumpSchema, seaSkuPanelWaistBanner.jumpSchema) && Intrinsics.LJFF(this.daInfo, seaSkuPanelWaistBanner.daInfo);
    }

    public final int hashCode() {
        Integer num = this.positionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        SeaBannerBackground seaBannerBackground = this.background;
        int iHashCode2 = (iHashCode + (seaBannerBackground == null ? 0 : seaBannerBackground.hashCode())) * 31;
        Icon icon = this.startIcon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        ECRichText eCRichText = this.startText;
        int iHashCode4 = (iHashCode3 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.endText;
        int iHashCode5 = (iHashCode4 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        SeaBannerCountDown seaBannerCountDown = this.bannerCountDown;
        int iHashCode6 = (iHashCode5 + (seaBannerCountDown == null ? 0 : seaBannerCountDown.hashCode())) * 31;
        Icon icon2 = this.endSuffixIcon;
        int iHashCode7 = (iHashCode6 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        int iHashCode8 = (iHashCode7 + (waistJumpSchema == null ? 0 : waistJumpSchema.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuPanelWaistBanner(positionType=");
        sbLIZ.append(this.positionType);
        sbLIZ.append(", background=");
        sbLIZ.append(this.background);
        sbLIZ.append(", startIcon=");
        sbLIZ.append(this.startIcon);
        sbLIZ.append(", startText=");
        sbLIZ.append(this.startText);
        sbLIZ.append(", endText=");
        sbLIZ.append(this.endText);
        sbLIZ.append(", bannerCountDown=");
        sbLIZ.append(this.bannerCountDown);
        sbLIZ.append(", endSuffixIcon=");
        sbLIZ.append(this.endSuffixIcon);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.positionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        SeaBannerBackground seaBannerBackground = this.background;
        if (seaBannerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaBannerBackground.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.startIcon, i);
        parcel.writeParcelable(this.startText, i);
        parcel.writeParcelable(this.endText, i);
        SeaBannerCountDown seaBannerCountDown = this.bannerCountDown;
        if (seaBannerCountDown == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaBannerCountDown.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.endSuffixIcon, i);
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        if (waistJumpSchema == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waistJumpSchema.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public SeaSkuPanelWaistBanner(Integer num, SeaBannerBackground seaBannerBackground, Icon icon, ECRichText eCRichText, ECRichText eCRichText2, SeaBannerCountDown seaBannerCountDown, Icon icon2, WaistJumpSchema waistJumpSchema, String str) {
        this.positionType = num;
        this.background = seaBannerBackground;
        this.startIcon = icon;
        this.startText = eCRichText;
        this.endText = eCRichText2;
        this.bannerCountDown = seaBannerCountDown;
        this.endSuffixIcon = icon2;
        this.jumpSchema = waistJumpSchema;
        this.daInfo = str;
    }
}
