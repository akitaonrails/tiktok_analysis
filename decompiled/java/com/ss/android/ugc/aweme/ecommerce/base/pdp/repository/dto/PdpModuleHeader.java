package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpModuleHeader;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TriggeredEventVariants;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpModuleHeader implements Parcelable {

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("jump_schema_track_params")
    public final String jumpSchemaTrackParams;

    @C09CT("show_chevron")
    public final Boolean showChevron;

    @C09CT("title")
    public final ECRichText title;

    @C09CT("triggered_event_variants")
    public final TriggeredEventVariants triggeredEventVariants;
    public static final Parcelable.Creator<PdpModuleHeader> CREATOR = new Parcelable.Creator<PdpModuleHeader>() { // from class: X.0via
        @Override // android.os.Parcelable.Creator
        public final PdpModuleHeader createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PdpModuleHeader.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            TriggeredEventVariants triggeredEventVariantsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                triggeredEventVariantsCreateFromParcel = TriggeredEventVariants.CREATOR.createFromParcel(parcel);
            }
            return new PdpModuleHeader(eCRichText, string, string2, boolValueOf, string3, triggeredEventVariantsCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpModuleHeader[] newArray(int i) {
            return new PdpModuleHeader[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpModuleHeader)) {
            return false;
        }
        PdpModuleHeader pdpModuleHeader = (PdpModuleHeader) obj;
        return Intrinsics.LJFF(this.title, pdpModuleHeader.title) && Intrinsics.LJFF(this.jumpSchema, pdpModuleHeader.jumpSchema) && Intrinsics.LJFF(this.btmCode, pdpModuleHeader.btmCode) && Intrinsics.LJFF(this.showChevron, pdpModuleHeader.showChevron) && Intrinsics.LJFF(this.daInfo, pdpModuleHeader.daInfo) && Intrinsics.LJFF(this.triggeredEventVariants, pdpModuleHeader.triggeredEventVariants) && Intrinsics.LJFF(this.jumpSchemaTrackParams, pdpModuleHeader.jumpSchemaTrackParams);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.jumpSchema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.btmCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.showChevron;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.daInfo;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TriggeredEventVariants triggeredEventVariants = this.triggeredEventVariants;
        int iHashCode6 = (iHashCode5 + (triggeredEventVariants == null ? 0 : triggeredEventVariants.hashCode())) * 31;
        String str4 = this.jumpSchemaTrackParams;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpModuleHeader(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", btmCode=");
        sbLIZ.append(this.btmCode);
        sbLIZ.append(", showChevron=");
        sbLIZ.append(this.showChevron);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", triggeredEventVariants=");
        sbLIZ.append(this.triggeredEventVariants);
        sbLIZ.append(", jumpSchemaTrackParams=");
        sbLIZ.append(this.jumpSchemaTrackParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        parcel.writeString(this.jumpSchema);
        parcel.writeString(this.btmCode);
        Boolean bool = this.showChevron;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.daInfo);
        TriggeredEventVariants triggeredEventVariants = this.triggeredEventVariants;
        if (triggeredEventVariants == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            triggeredEventVariants.writeToParcel(parcel, i);
        }
        parcel.writeString(this.jumpSchemaTrackParams);
    }

    public PdpModuleHeader(ECRichText eCRichText, String str, String str2, Boolean bool, String str3, TriggeredEventVariants triggeredEventVariants, String str4) {
        this.title = eCRichText;
        this.jumpSchema = str;
        this.btmCode = str2;
        this.showChevron = bool;
        this.daInfo = str3;
        this.triggeredEventVariants = triggeredEventVariants;
        this.jumpSchemaTrackParams = str4;
    }
}
