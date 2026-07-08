package com.ss.android.ugc.aweme.portrait.route;

import X.C09CT;
import X.C2188811AlT;
import X.C548920Lfu;
import X.C557120Lt8;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitEnterParams implements Parcelable {

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("cameo_image")
    public final String cameoImage;

    @C09CT("consumption_model")
    public final AIPortraitConsumptionModel consumptionModel;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("entrance_info")
    public final AIGCEntranceInfo entranceInfo;

    @C09CT("is_free_create")
    public final boolean isFreeCreate;

    @C09CT("style_item")
    public final Parcelable styleItem;

    @C09CT("theme_mode")
    public final String themeMode;
    public static final C557120Lt8 Companion = new C557120Lt8();
    public static final Parcelable.Creator<AIPortraitEnterParams> CREATOR = new Parcelable.Creator<AIPortraitEnterParams>() { // from class: X.0Krv
        @Override // android.os.Parcelable.Creator
        public final AIPortraitEnterParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AIGCEntranceInfo aIGCEntranceInfo = (AIGCEntranceInfo) parcel.readParcelable(AIPortraitEnterParams.class.getClassLoader());
            AIPortraitConsumptionModel aIPortraitConsumptionModel = (AIPortraitConsumptionModel) parcel.readParcelable(AIPortraitEnterParams.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIPortraitEnterParams(string, string2, string3, aIGCEntranceInfo, aIPortraitConsumptionModel, z, parcel.readParcelable(AIPortraitEnterParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitEnterParams[] newArray(int i) {
            return new AIPortraitEnterParams[i];
        }
    };

    public AIPortraitEnterParams() {
        this(null, null, null, null, null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitEnterParams)) {
            return false;
        }
        AIPortraitEnterParams aIPortraitEnterParams = (AIPortraitEnterParams) obj;
        return Intrinsics.LJFF(this.cameoId, aIPortraitEnterParams.cameoId) && Intrinsics.LJFF(this.cameoImage, aIPortraitEnterParams.cameoImage) && Intrinsics.LJFF(this.creationId, aIPortraitEnterParams.creationId) && Intrinsics.LJFF(this.entranceInfo, aIPortraitEnterParams.entranceInfo) && Intrinsics.LJFF(this.consumptionModel, aIPortraitEnterParams.consumptionModel) && this.isFreeCreate == aIPortraitEnterParams.isFreeCreate && Intrinsics.LJFF(this.styleItem, aIPortraitEnterParams.styleItem) && Intrinsics.LJFF(this.themeMode, aIPortraitEnterParams.themeMode);
    }

    public final int hashCode() {
        String str = this.cameoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cameoImage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AIGCEntranceInfo aIGCEntranceInfo = this.entranceInfo;
        int iHashCode4 = (iHashCode3 + (aIGCEntranceInfo == null ? 0 : aIGCEntranceInfo.hashCode())) * 31;
        AIPortraitConsumptionModel aIPortraitConsumptionModel = this.consumptionModel;
        int iHashCode5 = (((iHashCode4 + (aIPortraitConsumptionModel == null ? 0 : aIPortraitConsumptionModel.hashCode())) * 31) + C786410Ut5.Z2(this.isFreeCreate)) * 31;
        Parcelable parcelable = this.styleItem;
        int iHashCode6 = (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str4 = this.themeMode;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitEnterParams(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.cameoImage);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", entranceInfo=");
        sbLIZ.append(this.entranceInfo);
        sbLIZ.append(", consumptionModel=");
        sbLIZ.append(this.consumptionModel);
        sbLIZ.append(", isFreeCreate=");
        sbLIZ.append(this.isFreeCreate);
        sbLIZ.append(", styleItem=");
        sbLIZ.append(this.styleItem);
        sbLIZ.append(", themeMode=");
        sbLIZ.append(this.themeMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cameoId);
        parcel.writeString(this.cameoImage);
        parcel.writeString(this.creationId);
        parcel.writeParcelable(this.entranceInfo, i);
        parcel.writeParcelable(this.consumptionModel, i);
        parcel.writeInt(this.isFreeCreate ? 1 : 0);
        parcel.writeParcelable(this.styleItem, i);
        parcel.writeString(this.themeMode);
    }

    static {
        C548920Lfu.LIZ(AIPortraitEnterParams.class, AFwS239S0000000_8.get$arr$(56));
    }

    public final Bundle LIZIZ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("cameo_id", this.cameoId, bundle);
        C786410Ut5.LJJJI("cameo_image", this.cameoImage, bundle);
        C786410Ut5.LJJJI("creation_id", this.creationId, bundle);
        AIGCEntranceInfo aIGCEntranceInfo = this.entranceInfo;
        if (aIGCEntranceInfo != null) {
            C786410Ut5.LJJIJL(bundle, "entrance_info", aIGCEntranceInfo);
        }
        AIPortraitConsumptionModel aIPortraitConsumptionModel = this.consumptionModel;
        if (aIPortraitConsumptionModel != null) {
            C786410Ut5.LJJIJL(bundle, "consumption_model", aIPortraitConsumptionModel);
        }
        bundle.putBoolean("is_free_create", this.isFreeCreate);
        Parcelable parcelable = this.styleItem;
        if (parcelable != null) {
            C786410Ut5.LJJIJL(bundle, "style_item", parcelable);
        }
        String str = this.themeMode;
        if (str != null) {
            C786410Ut5.LJJJI("theme_mode", str, bundle);
        }
        return bundle;
    }

    public static AIPortraitEnterParams LIZ(AIPortraitEnterParams aIPortraitEnterParams, String str, String str2, String str3, boolean z, String str4, int i) {
        AIGCEntranceInfo aIGCEntranceInfo;
        AIPortraitConsumptionModel aIPortraitConsumptionModel;
        String str5 = str4;
        boolean z2 = z;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = aIPortraitEnterParams.cameoId;
        }
        if ((i & 2) != 0) {
            str7 = aIPortraitEnterParams.cameoImage;
        }
        if ((i & 4) != 0) {
            str6 = aIPortraitEnterParams.creationId;
        }
        Parcelable parcelable = null;
        if ((i & 8) != 0) {
            aIGCEntranceInfo = aIPortraitEnterParams.entranceInfo;
        } else {
            aIGCEntranceInfo = null;
        }
        if ((i & 16) != 0) {
            aIPortraitConsumptionModel = aIPortraitEnterParams.consumptionModel;
        } else {
            aIPortraitConsumptionModel = null;
        }
        if ((i & 32) != 0) {
            z2 = aIPortraitEnterParams.isFreeCreate;
        }
        if ((i & 64) != 0) {
            parcelable = aIPortraitEnterParams.styleItem;
        }
        if ((i & 128) != 0) {
            str5 = aIPortraitEnterParams.themeMode;
        }
        aIPortraitEnterParams.getClass();
        return new AIPortraitEnterParams(str8, str7, str6, aIGCEntranceInfo, aIPortraitConsumptionModel, z2, parcelable, str5);
    }

    public AIPortraitEnterParams(String str, String str2, String str3, AIGCEntranceInfo aIGCEntranceInfo, AIPortraitConsumptionModel aIPortraitConsumptionModel, boolean z, Parcelable parcelable, String str4) {
        this.cameoId = str;
        this.cameoImage = str2;
        this.creationId = str3;
        this.entranceInfo = aIGCEntranceInfo;
        this.consumptionModel = aIPortraitConsumptionModel;
        this.isFreeCreate = z;
        this.styleItem = parcelable;
        this.themeMode = str4;
    }
}
