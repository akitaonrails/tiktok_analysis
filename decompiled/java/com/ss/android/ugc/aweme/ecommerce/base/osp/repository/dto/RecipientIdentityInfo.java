package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VerificationMode;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecipientIdentityInfo implements Serializable, Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("filled_note")
    public String filledNote;

    @C09CT("filled_note_icon")
    public Icon filledNoteIcon;

    @C09CT("identity_info_collection_page_schema")
    public String identityInfoCollectionPageSchema;

    @C09CT("identity_info_hash_id")
    public String identityInfoHashId;

    @C09CT("identity_info_verification_mode")
    public VerificationMode identityInfoVerificationMode;

    @C09CT("scene_code")
    public Integer sceneCode;

    @C09CT("unfilled_note")
    public String unfilledNote;

    @C09CT("unfilled_note_icon")
    public Icon unfilledNoteIcon;
    public static final Parcelable.Creator<RecipientIdentityInfo> CREATOR = new Parcelable.Creator<RecipientIdentityInfo>() { // from class: X.02wO
        @Override // android.os.Parcelable.Creator
        public final RecipientIdentityInfo createFromParcel(Parcel parcel) {
            VerificationMode verificationModeValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                verificationModeValueOf = null;
            } else {
                verificationModeValueOf = VerificationMode.valueOf(parcel.readString());
            }
            Icon icon = (Icon) parcel.readParcelable(RecipientIdentityInfo.class.getClassLoader());
            String string3 = parcel.readString();
            Icon icon2 = (Icon) parcel.readParcelable(RecipientIdentityInfo.class.getClassLoader());
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new RecipientIdentityInfo(string, string2, verificationModeValueOf, icon, string3, icon2, string4, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecipientIdentityInfo[] newArray(int i) {
            return new RecipientIdentityInfo[i];
        }
    };
    public static final int $stable = 8;

    public RecipientIdentityInfo() {
    }

    public final RecipientIdentityInfo copy(String str, String str2, VerificationMode verificationMode, Icon icon, String str3, Icon icon2, String str4, Integer num, String str5) {
        return new RecipientIdentityInfo(str, str2, verificationMode, icon, str3, icon2, str4, num, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientIdentityInfo)) {
            return false;
        }
        RecipientIdentityInfo recipientIdentityInfo = (RecipientIdentityInfo) obj;
        return Intrinsics.LJFF(this.identityInfoHashId, recipientIdentityInfo.identityInfoHashId) && Intrinsics.LJFF(this.identityInfoCollectionPageSchema, recipientIdentityInfo.identityInfoCollectionPageSchema) && this.identityInfoVerificationMode == recipientIdentityInfo.identityInfoVerificationMode && Intrinsics.LJFF(this.unfilledNoteIcon, recipientIdentityInfo.unfilledNoteIcon) && Intrinsics.LJFF(this.unfilledNote, recipientIdentityInfo.unfilledNote) && Intrinsics.LJFF(this.filledNoteIcon, recipientIdentityInfo.filledNoteIcon) && Intrinsics.LJFF(this.filledNote, recipientIdentityInfo.filledNote) && Intrinsics.LJFF(this.sceneCode, recipientIdentityInfo.sceneCode) && Intrinsics.LJFF(this.daInfo, recipientIdentityInfo.daInfo);
    }

    public int hashCode() {
        String str = this.identityInfoHashId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityInfoCollectionPageSchema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VerificationMode verificationMode = this.identityInfoVerificationMode;
        int iHashCode3 = (iHashCode2 + (verificationMode == null ? 0 : verificationMode.hashCode())) * 31;
        Icon icon = this.unfilledNoteIcon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str3 = this.unfilledNote;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon2 = this.filledNoteIcon;
        int iHashCode6 = (iHashCode5 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str4 = this.filledNote;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.sceneCode;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.daInfo;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecipientIdentityInfo(identityInfoHashId=");
        sbLIZ.append(this.identityInfoHashId);
        sbLIZ.append(", identityInfoCollectionPageSchema=");
        sbLIZ.append(this.identityInfoCollectionPageSchema);
        sbLIZ.append(", identityInfoVerificationMode=");
        sbLIZ.append(this.identityInfoVerificationMode);
        sbLIZ.append(", unfilledNoteIcon=");
        sbLIZ.append(this.unfilledNoteIcon);
        sbLIZ.append(", unfilledNote=");
        sbLIZ.append(this.unfilledNote);
        sbLIZ.append(", filledNoteIcon=");
        sbLIZ.append(this.filledNoteIcon);
        sbLIZ.append(", filledNote=");
        sbLIZ.append(this.filledNote);
        sbLIZ.append(", sceneCode=");
        sbLIZ.append(this.sceneCode);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identityInfoHashId);
        parcel.writeString(this.identityInfoCollectionPageSchema);
        VerificationMode verificationMode = this.identityInfoVerificationMode;
        if (verificationMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verificationMode.name());
        }
        parcel.writeParcelable(this.unfilledNoteIcon, i);
        parcel.writeString(this.unfilledNote);
        parcel.writeParcelable(this.filledNoteIcon, i);
        parcel.writeString(this.filledNote);
        Integer num = this.sceneCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getFilledNote() {
        return this.filledNote;
    }

    public final Icon getFilledNoteIcon() {
        return this.filledNoteIcon;
    }

    public final String getIdentityInfoCollectionPageSchema() {
        return this.identityInfoCollectionPageSchema;
    }

    public final String getIdentityInfoHashId() {
        return this.identityInfoHashId;
    }

    public final VerificationMode getIdentityInfoVerificationMode() {
        return this.identityInfoVerificationMode;
    }

    public final Integer getSceneCode() {
        return this.sceneCode;
    }

    public final String getUnfilledNote() {
        return this.unfilledNote;
    }

    public final Icon getUnfilledNoteIcon() {
        return this.unfilledNoteIcon;
    }

    public RecipientIdentityInfo(String str, String str2, VerificationMode verificationMode, Icon icon, String str3, Icon icon2, String str4, Integer num, String str5) {
        this.identityInfoHashId = str;
        this.identityInfoCollectionPageSchema = str2;
        this.identityInfoVerificationMode = verificationMode;
        this.unfilledNoteIcon = icon;
        this.unfilledNote = str3;
        this.filledNoteIcon = icon2;
        this.filledNote = str4;
        this.sceneCode = num;
        this.daInfo = str5;
    }
}
