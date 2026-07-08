package com.ss.android.ugc.aweme.portrait.customize.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1419230n2H;
import X.EnumC570120MXq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class PortraitRecommendedItem implements Parcelable {

    @C09CT("actual_prompt")
    public final String actualPrompt;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("current_prompt_text")
    public final String currentPromptText;

    @C09CT("is_upload_entry")
    public final Boolean isUploadEntry;

    @C09CT("reference_image")
    public final String referenceImage;

    @C09CT("res_pos")
    public final EnumC570120MXq resPos;

    @C09CT("selected")
    public final Boolean selected;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("style_type")
    public final EnumC1419230n2H styleType;
    public static final Parcelable.Creator<PortraitRecommendedItem> CREATOR = new Parcelable.Creator<PortraitRecommendedItem>() { // from class: X.0u01
        @Override // android.os.Parcelable.Creator
        public final PortraitRecommendedItem createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            EnumC1419230n2H enumC1419230n2HValueOf;
            EnumC570120MXq enumC570120MXqValueOf;
            boolean z2 = true;
            Boolean boolValueOf2 = null;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                enumC1419230n2HValueOf = null;
            } else {
                enumC1419230n2HValueOf = EnumC1419230n2H.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                enumC570120MXqValueOf = null;
            } else {
                enumC570120MXqValueOf = EnumC570120MXq.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new PortraitRecommendedItem(boolValueOf, string, string2, string3, string4, string5, enumC1419230n2HValueOf, enumC570120MXqValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PortraitRecommendedItem[] newArray(int i) {
            return new PortraitRecommendedItem[i];
        }
    };
    public static final int $stable = 8;

    public PortraitRecommendedItem() {
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
        if (!(obj instanceof PortraitRecommendedItem)) {
            return false;
        }
        PortraitRecommendedItem portraitRecommendedItem = (PortraitRecommendedItem) obj;
        return Intrinsics.LJFF(this.selected, portraitRecommendedItem.selected) && Intrinsics.LJFF(this.actualPrompt, portraitRecommendedItem.actualPrompt) && Intrinsics.LJFF(this.currentPromptText, portraitRecommendedItem.currentPromptText) && Intrinsics.LJFF(this.coverUrl, portraitRecommendedItem.coverUrl) && Intrinsics.LJFF(this.referenceImage, portraitRecommendedItem.referenceImage) && Intrinsics.LJFF(this.styleId, portraitRecommendedItem.styleId) && this.styleType == portraitRecommendedItem.styleType && this.resPos == portraitRecommendedItem.resPos && Intrinsics.LJFF(this.isUploadEntry, portraitRecommendedItem.isUploadEntry);
    }

    public final int hashCode() {
        Boolean bool = this.selected;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.actualPrompt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentPromptText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coverUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referenceImage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.styleId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EnumC1419230n2H enumC1419230n2H = this.styleType;
        int iHashCode7 = (iHashCode6 + (enumC1419230n2H == null ? 0 : enumC1419230n2H.hashCode())) * 31;
        EnumC570120MXq enumC570120MXq = this.resPos;
        int iHashCode8 = (iHashCode7 + (enumC570120MXq == null ? 0 : enumC570120MXq.hashCode())) * 31;
        Boolean bool2 = this.isUploadEntry;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitRecommendedItem(selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(", actualPrompt=");
        sbLIZ.append(this.actualPrompt);
        sbLIZ.append(", currentPromptText=");
        sbLIZ.append(this.currentPromptText);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", referenceImage=");
        sbLIZ.append(this.referenceImage);
        sbLIZ.append(", styleId=");
        sbLIZ.append(this.styleId);
        sbLIZ.append(", styleType=");
        sbLIZ.append(this.styleType);
        sbLIZ.append(", resPos=");
        sbLIZ.append(this.resPos);
        sbLIZ.append(", isUploadEntry=");
        sbLIZ.append(this.isUploadEntry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.actualPrompt);
        parcel.writeString(this.currentPromptText);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.referenceImage);
        parcel.writeString(this.styleId);
        EnumC1419230n2H enumC1419230n2H = this.styleType;
        if (enumC1419230n2H == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1419230n2H.name());
        }
        EnumC570120MXq enumC570120MXq = this.resPos;
        if (enumC570120MXq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC570120MXq.name());
        }
        Boolean bool2 = this.isUploadEntry;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static PortraitRecommendedItem LIZ(PortraitRecommendedItem portraitRecommendedItem, Boolean bool, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        EnumC1419230n2H enumC1419230n2H;
        EnumC570120MXq enumC570120MXq;
        String str6 = str2;
        String str7 = str;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            bool2 = portraitRecommendedItem.selected;
        }
        Boolean bool3 = null;
        if ((i & 2) != 0) {
            str3 = portraitRecommendedItem.actualPrompt;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str7 = portraitRecommendedItem.currentPromptText;
        }
        if ((i & 8) != 0) {
            str6 = portraitRecommendedItem.coverUrl;
        }
        if ((i & 16) != 0) {
            str4 = portraitRecommendedItem.referenceImage;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = portraitRecommendedItem.styleId;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            enumC1419230n2H = portraitRecommendedItem.styleType;
        } else {
            enumC1419230n2H = null;
        }
        if ((i & 128) != 0) {
            enumC570120MXq = portraitRecommendedItem.resPos;
        } else {
            enumC570120MXq = null;
        }
        if ((i & 256) != 0) {
            bool3 = portraitRecommendedItem.isUploadEntry;
        }
        portraitRecommendedItem.getClass();
        return new PortraitRecommendedItem(bool2, str3, str7, str6, str4, str5, enumC1419230n2H, enumC570120MXq, bool3);
    }

    public PortraitRecommendedItem(Boolean bool, String str, String str2, String str3, String str4, String str5, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, Boolean bool2) {
        this.selected = bool;
        this.actualPrompt = str;
        this.currentPromptText = str2;
        this.coverUrl = str3;
        this.referenceImage = str4;
        this.styleId = str5;
        this.styleType = enumC1419230n2H;
        this.resPos = enumC570120MXq;
        this.isUploadEntry = bool2;
    }
}
