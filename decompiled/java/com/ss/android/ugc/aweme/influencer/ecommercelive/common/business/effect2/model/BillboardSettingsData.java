package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardMultiGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardNewUser;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSettingsData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardSettingsData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BillboardSettingsData> CREATOR = new Parcelable.Creator<BillboardSettingsData>() { // from class: X.0v5u
        @Override // android.os.Parcelable.Creator
        public final BillboardSettingsData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            BillboardSetting billboardSettingCreateFromParcel = BillboardSetting.CREATOR.createFromParcel(parcel);
            BillboardNewUser billboardNewUserCreateFromParcel = BillboardNewUser.CREATOR.createFromParcel(parcel);
            BillboardMultiGuide billboardMultiGuideCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                billboardMultiGuideCreateFromParcel = BillboardMultiGuide.CREATOR.createFromParcel(parcel);
            }
            return new BillboardSettingsData(billboardSettingCreateFromParcel, billboardNewUserCreateFromParcel, numValueOf, billboardMultiGuideCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardSettingsData[] newArray(int i) {
            return new BillboardSettingsData[i];
        }
    };

    @C09CT("billboard_max_display_count")
    public final Integer maxDisplayCount;

    @C09CT("multi_guide")
    public final BillboardMultiGuide multiGuide;

    @C09CT("billboard_new_user")
    public final BillboardNewUser newUser;

    @C09CT("billboard_setting")
    public final BillboardSetting setting;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillboardSettingsData)) {
            return false;
        }
        BillboardSettingsData billboardSettingsData = (BillboardSettingsData) obj;
        return Intrinsics.LJFF(this.setting, billboardSettingsData.setting) && Intrinsics.LJFF(this.newUser, billboardSettingsData.newUser) && Intrinsics.LJFF(this.maxDisplayCount, billboardSettingsData.maxDisplayCount) && Intrinsics.LJFF(this.multiGuide, billboardSettingsData.multiGuide);
    }

    public final int hashCode() {
        int iHashCode = ((this.setting.hashCode() * 31) + this.newUser.hashCode()) * 31;
        Integer num = this.maxDisplayCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BillboardMultiGuide billboardMultiGuide = this.multiGuide;
        return iHashCode2 + (billboardMultiGuide != null ? billboardMultiGuide.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardSettingsData(setting=");
        sbLIZ.append(this.setting);
        sbLIZ.append(", newUser=");
        sbLIZ.append(this.newUser);
        sbLIZ.append(", maxDisplayCount=");
        sbLIZ.append(this.maxDisplayCount);
        sbLIZ.append(", multiGuide=");
        sbLIZ.append(this.multiGuide);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setting.isAutoDisplay ? 1 : 0);
        this.newUser.writeToParcel(parcel, i);
        Integer num = this.maxDisplayCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        BillboardMultiGuide billboardMultiGuide = this.multiGuide;
        if (billboardMultiGuide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billboardMultiGuide.writeToParcel(parcel, i);
        }
    }

    public BillboardSettingsData(BillboardSetting billboardSetting, BillboardNewUser billboardNewUser, Integer num, BillboardMultiGuide billboardMultiGuide) {
        this.setting = billboardSetting;
        this.newUser = billboardNewUser;
        this.maxDisplayCount = num;
        this.multiGuide = billboardMultiGuide;
    }
}
