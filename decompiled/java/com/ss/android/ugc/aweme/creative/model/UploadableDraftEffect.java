package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class UploadableDraftEffect implements Parcelable {
    public static final Parcelable.Creator<UploadableDraftEffect> CREATOR = new Parcelable.Creator<UploadableDraftEffect>() { // from class: X.0sid
        @Override // android.os.Parcelable.Creator
        public final UploadableDraftEffect createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new UploadableDraftEffect(string, string2, string3, string4, string5, string6, z, z2, string7, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadableDraftEffect[] newArray(int i) {
            return new UploadableDraftEffect[i];
        }
    };

    @C09CT("capturedInPhotoMode")
    public boolean capturedInPhotoMode;

    @C09CT("draftId")
    public final String draftId;

    @C09CT("effectId")
    public String effectId;

    @C09CT("effectName")
    public String effectName;

    @C09CT("enableSubmission")
    public boolean enableSubmission;

    @C09CT("hintStarlingKey")
    public String hintStarlingKey;

    @C09CT("iconFilePath")
    public String iconFilePath;

    @C09CT("needSubmission")
    public boolean needSubmission;

    @C09CT("prompt")
    public String prompt;

    @C09CT("unzipFilePath")
    public final String unzipFilePath;

    @InterfaceC2270908v5
    @C09CT("zipFilePath")
    public String zipFilePath;

    public UploadableDraftEffect() {
        this("", "", "", "", "", "", false, true, "", false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadableDraftEffect)) {
            return false;
        }
        UploadableDraftEffect uploadableDraftEffect = (UploadableDraftEffect) obj;
        return Intrinsics.LJFF(this.effectId, uploadableDraftEffect.effectId) && Intrinsics.LJFF(this.draftId, uploadableDraftEffect.draftId) && Intrinsics.LJFF(this.effectName, uploadableDraftEffect.effectName) && Intrinsics.LJFF(this.iconFilePath, uploadableDraftEffect.iconFilePath) && Intrinsics.LJFF(this.zipFilePath, uploadableDraftEffect.zipFilePath) && Intrinsics.LJFF(this.unzipFilePath, uploadableDraftEffect.unzipFilePath) && this.needSubmission == uploadableDraftEffect.needSubmission && this.enableSubmission == uploadableDraftEffect.enableSubmission && Intrinsics.LJFF(this.hintStarlingKey, uploadableDraftEffect.hintStarlingKey) && this.capturedInPhotoMode == uploadableDraftEffect.capturedInPhotoMode && Intrinsics.LJFF(this.prompt, uploadableDraftEffect.prompt);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.effectId.hashCode() * 31) + this.draftId.hashCode()) * 31) + this.effectName.hashCode()) * 31) + this.iconFilePath.hashCode()) * 31) + this.zipFilePath.hashCode()) * 31) + this.unzipFilePath.hashCode()) * 31) + C786410Ut5.Z2(this.needSubmission)) * 31) + C786410Ut5.Z2(this.enableSubmission)) * 31) + this.hintStarlingKey.hashCode()) * 31) + C786410Ut5.Z2(this.capturedInPhotoMode)) * 31;
        String str = this.prompt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UploadableDraftEffect(effectId=" + this.effectId + ", draftId=" + this.draftId + ", effectName=" + this.effectName + ", iconFilePath=" + this.iconFilePath + ", zipFilePath=" + this.zipFilePath + ", unzipFilePath=" + this.unzipFilePath + ", needSubmission=" + this.needSubmission + ", enableSubmission=" + this.enableSubmission + ", hintStarlingKey=" + this.hintStarlingKey + ", capturedInPhotoMode=" + this.capturedInPhotoMode + ", prompt=" + this.prompt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.draftId);
        parcel.writeString(this.effectName);
        parcel.writeString(this.iconFilePath);
        parcel.writeString(this.zipFilePath);
        parcel.writeString(this.unzipFilePath);
        parcel.writeInt(this.needSubmission ? 1 : 0);
        parcel.writeInt(this.enableSubmission ? 1 : 0);
        parcel.writeString(this.hintStarlingKey);
        parcel.writeInt(this.capturedInPhotoMode ? 1 : 0);
        parcel.writeString(this.prompt);
    }

    public UploadableDraftEffect(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, boolean z3, String str8) {
        this.effectId = str;
        this.draftId = str2;
        this.effectName = str3;
        this.iconFilePath = str4;
        this.zipFilePath = str5;
        this.unzipFilePath = str6;
        this.needSubmission = z;
        this.enableSubmission = z2;
        this.hintStarlingKey = str7;
        this.capturedInPhotoMode = z3;
        this.prompt = str8;
    }
}
