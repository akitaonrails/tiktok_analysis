package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C0C15;
import X.C1762370vxj;
import X.EnumC1058004Bu;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CompatibleParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExplainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionWaist implements Parcelable {

    @C09CT("background")
    public final PromotionWaistBannerBackground background;

    @C09CT("background_image")
    public final Icon backgroundImage;

    @C09CT("banner_type")
    public final Integer bannerType;

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("compatible_params")
    public final CompatibleParams compatibleParams;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("explain_info")
    public final ExplainInfo explain_info;

    @C09CT("head_component")
    public final BannerComponent headComponent;

    @C09CT("jump_schema")
    public final WaistJumpSchema jumpSchema;

    @C09CT("countdown_end_auto_refresh_mode")
    public final Integer refreshMode;

    @C09CT("extend_style")
    public final WaistStyle style;

    @C09CT("suffix_icon")
    public final Icon suffixIcon;

    @C09CT("tail_component")
    public final BannerComponent tailComponent;

    @C09CT("ui_config")
    public final PromotionWaistUIConfig uiConfig;

    @C09CT("waist_banner_scope")
    public final Integer waistBannerScope;
    public static final C1762370vxj WaistBannerScope = new Object() { // from class: X.0vxj
    };
    public static final Parcelable.Creator<PromotionWaist> CREATOR = new Parcelable.Creator<PromotionWaist>() { // from class: X.0vxe
        @Override // android.os.Parcelable.Creator
        public final PromotionWaist createFromParcel(Parcel parcel) {
            BannerComponent bannerComponentCreateFromParcel;
            BannerComponent bannerComponentCreateFromParcel2;
            WaistJumpSchema waistJumpSchemaCreateFromParcel;
            ExplainInfo explainInfoCreateFromParcel;
            Integer numValueOf;
            CompatibleParams compatibleParamsCreateFromParcel;
            PromotionWaistBannerBackground promotionWaistBannerBackgroundCreateFromParcel;
            Integer numValueOf2;
            Integer numValueOf3;
            WaistStyle waistStyleCreateFromParcel;
            PromotionWaistUIConfig promotionWaistUIConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                bannerComponentCreateFromParcel = null;
            } else {
                bannerComponentCreateFromParcel = BannerComponent.CREATOR.createFromParcel(parcel);
            }
            BannerComponent bannerComponent = bannerComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                bannerComponentCreateFromParcel2 = null;
            } else {
                bannerComponentCreateFromParcel2 = BannerComponent.CREATOR.createFromParcel(parcel);
            }
            BannerComponent bannerComponent2 = bannerComponentCreateFromParcel2;
            Icon icon = (Icon) parcel.readParcelable(PromotionWaist.class.getClassLoader());
            if (parcel.readInt() == 0) {
                waistJumpSchemaCreateFromParcel = null;
            } else {
                waistJumpSchemaCreateFromParcel = WaistJumpSchema.CREATOR.createFromParcel(parcel);
            }
            WaistJumpSchema waistJumpSchema = waistJumpSchemaCreateFromParcel;
            Icon icon2 = (Icon) parcel.readParcelable(PromotionWaist.class.getClassLoader());
            if (parcel.readInt() == 0) {
                explainInfoCreateFromParcel = null;
            } else {
                explainInfoCreateFromParcel = ExplainInfo.CREATOR.createFromParcel(parcel);
            }
            ExplainInfo explainInfo = explainInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                compatibleParamsCreateFromParcel = null;
            } else {
                compatibleParamsCreateFromParcel = CompatibleParams.CREATOR.createFromParcel(parcel);
            }
            CompatibleParams compatibleParams = compatibleParamsCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionWaistBannerBackgroundCreateFromParcel = null;
            } else {
                promotionWaistBannerBackgroundCreateFromParcel = PromotionWaistBannerBackground.CREATOR.createFromParcel(parcel);
            }
            PromotionWaistBannerBackground promotionWaistBannerBackground = promotionWaistBannerBackgroundCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                waistStyleCreateFromParcel = null;
            } else {
                waistStyleCreateFromParcel = WaistStyle.CREATOR.createFromParcel(parcel);
            }
            WaistStyle waistStyle = waistStyleCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                promotionWaistUIConfigCreateFromParcel = PromotionWaistUIConfig.CREATOR.createFromParcel(parcel);
            }
            return new PromotionWaist(bannerComponent, bannerComponent2, icon, waistJumpSchema, icon2, explainInfo, numValueOf, compatibleParams, promotionWaistBannerBackground, numValueOf2, string, numValueOf3, waistStyle, string2, promotionWaistUIConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionWaist[] newArray(int i) {
            return new PromotionWaist[i];
        }
    };
    public static final int $stable = 8;

    public PromotionWaist() {
        this(null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC1058004Bu.AUTO_REFRESH_MODE.getValue()), null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionWaist)) {
            return false;
        }
        PromotionWaist promotionWaist = (PromotionWaist) obj;
        return Intrinsics.LJFF(this.headComponent, promotionWaist.headComponent) && Intrinsics.LJFF(this.tailComponent, promotionWaist.tailComponent) && Intrinsics.LJFF(this.backgroundImage, promotionWaist.backgroundImage) && Intrinsics.LJFF(this.jumpSchema, promotionWaist.jumpSchema) && Intrinsics.LJFF(this.suffixIcon, promotionWaist.suffixIcon) && Intrinsics.LJFF(this.explain_info, promotionWaist.explain_info) && Intrinsics.LJFF(this.waistBannerScope, promotionWaist.waistBannerScope) && Intrinsics.LJFF(this.compatibleParams, promotionWaist.compatibleParams) && Intrinsics.LJFF(this.background, promotionWaist.background) && Intrinsics.LJFF(this.bannerType, promotionWaist.bannerType) && Intrinsics.LJFF(this.daInfo, promotionWaist.daInfo) && Intrinsics.LJFF(this.refreshMode, promotionWaist.refreshMode) && Intrinsics.LJFF(this.style, promotionWaist.style) && Intrinsics.LJFF(this.btmCode, promotionWaist.btmCode) && Intrinsics.LJFF(this.uiConfig, promotionWaist.uiConfig);
    }

    public final int hashCode() {
        BannerComponent bannerComponent = this.headComponent;
        int iHashCode = (bannerComponent == null ? 0 : bannerComponent.hashCode()) * 31;
        BannerComponent bannerComponent2 = this.tailComponent;
        int iHashCode2 = (iHashCode + (bannerComponent2 == null ? 0 : bannerComponent2.hashCode())) * 31;
        Icon icon = this.backgroundImage;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        int iHashCode4 = (iHashCode3 + (waistJumpSchema == null ? 0 : waistJumpSchema.hashCode())) * 31;
        Icon icon2 = this.suffixIcon;
        int iHashCode5 = (iHashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        ExplainInfo explainInfo = this.explain_info;
        int iHashCode6 = (iHashCode5 + (explainInfo == null ? 0 : explainInfo.hashCode())) * 31;
        Integer num = this.waistBannerScope;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        CompatibleParams compatibleParams = this.compatibleParams;
        int iHashCode8 = (iHashCode7 + (compatibleParams == null ? 0 : compatibleParams.hashCode())) * 31;
        PromotionWaistBannerBackground promotionWaistBannerBackground = this.background;
        int iHashCode9 = (iHashCode8 + (promotionWaistBannerBackground == null ? 0 : promotionWaistBannerBackground.hashCode())) * 31;
        Integer num2 = this.bannerType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.refreshMode;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        WaistStyle waistStyle = this.style;
        int iHashCode13 = (iHashCode12 + (waistStyle == null ? 0 : waistStyle.hashCode())) * 31;
        String str2 = this.btmCode;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PromotionWaistUIConfig promotionWaistUIConfig = this.uiConfig;
        return iHashCode14 + (promotionWaistUIConfig != null ? promotionWaistUIConfig.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionWaist(headComponent=" + this.headComponent + ", tailComponent=" + this.tailComponent + ", backgroundImage=" + this.backgroundImage + ", jumpSchema=" + this.jumpSchema + ", suffixIcon=" + this.suffixIcon + ", explain_info=" + this.explain_info + ", waistBannerScope=" + this.waistBannerScope + ", compatibleParams=" + this.compatibleParams + ", background=" + this.background + ", bannerType=" + this.bannerType + ", daInfo=" + this.daInfo + ", refreshMode=" + this.refreshMode + ", style=" + this.style + ", btmCode=" + this.btmCode + ", uiConfig=" + this.uiConfig + ')';
    }

    public final boolean LIZ() {
        Integer num;
        PromotionWaistBannerBackground promotionWaistBannerBackground = this.background;
        return promotionWaistBannerBackground != null && (num = promotionWaistBannerBackground.backgroundRadius) != null && num.intValue() == 1 && C0C15.LIZ();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BannerComponent bannerComponent = this.headComponent;
        if (bannerComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerComponent.writeToParcel(parcel, i);
        }
        BannerComponent bannerComponent2 = this.tailComponent;
        if (bannerComponent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerComponent2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.backgroundImage, i);
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        if (waistJumpSchema == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waistJumpSchema.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.suffixIcon, i);
        ExplainInfo explainInfo = this.explain_info;
        if (explainInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            explainInfo.writeToParcel(parcel, i);
        }
        Integer num = this.waistBannerScope;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        CompatibleParams compatibleParams = this.compatibleParams;
        if (compatibleParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(compatibleParams.flashSaleId);
        }
        PromotionWaistBannerBackground promotionWaistBannerBackground = this.background;
        if (promotionWaistBannerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaistBannerBackground.writeToParcel(parcel, i);
        }
        Integer num2 = this.bannerType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.daInfo);
        Integer num3 = this.refreshMode;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        WaistStyle waistStyle = this.style;
        if (waistStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waistStyle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.btmCode);
        PromotionWaistUIConfig promotionWaistUIConfig = this.uiConfig;
        if (promotionWaistUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaistUIConfig.writeToParcel(parcel, i);
        }
    }

    public PromotionWaist(BannerComponent bannerComponent, BannerComponent bannerComponent2, Icon icon, WaistJumpSchema waistJumpSchema, Icon icon2, ExplainInfo explainInfo, Integer num, CompatibleParams compatibleParams, PromotionWaistBannerBackground promotionWaistBannerBackground, Integer num2, String str, Integer num3, WaistStyle waistStyle, String str2, PromotionWaistUIConfig promotionWaistUIConfig) {
        this.headComponent = bannerComponent;
        this.tailComponent = bannerComponent2;
        this.backgroundImage = icon;
        this.jumpSchema = waistJumpSchema;
        this.suffixIcon = icon2;
        this.explain_info = explainInfo;
        this.waistBannerScope = num;
        this.compatibleParams = compatibleParams;
        this.background = promotionWaistBannerBackground;
        this.bannerType = num2;
        this.daInfo = str;
        this.refreshMode = num3;
        this.style = waistStyle;
        this.btmCode = str2;
        this.uiConfig = promotionWaistUIConfig;
    }
}
