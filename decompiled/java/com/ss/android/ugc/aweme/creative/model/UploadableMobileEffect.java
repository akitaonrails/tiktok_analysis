package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0MY0;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class UploadableMobileEffect implements Parcelable {
    public static final Parcelable.Creator<UploadableMobileEffect> CREATOR = new Parcelable.Creator<UploadableMobileEffect>() { // from class: X.0sie
        @Override // android.os.Parcelable.Creator
        public final UploadableMobileEffect createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new UploadableMobileEffect(string, string2, string3, string4, string5, string6, string7, z, z2, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadableMobileEffect[] newArray(int i) {
            return new UploadableMobileEffect[i];
        }
    };

    @C09CT("capturedInPhotoMode")
    public boolean capturedInPhotoMode;

    @C09CT("effectId")
    public final String effectId;

    @C09CT("effectName")
    public String effectName;

    @C09CT("enableSubmission")
    public boolean enableSubmission;

    @C09CT("iconFilePath")
    @C0MY0
    public String iconFilePath;

    @C09CT("needSubmission")
    public boolean needSubmission;

    @C09CT("prompt")
    public String prompt;

    @C09CT("selectedMedia")
    public final String selectedMedia;

    @C09CT("templateEffectId")
    public final String templateEffectId;

    @C09CT("templateResourceId")
    public final String templateResourceId;

    @C09CT("zipFilePath")
    @C0MY0
    public String zipFilePath;

    public UploadableMobileEffect() {
        this("", "", "", "", "", "", "", false, true, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadableMobileEffect)) {
            return false;
        }
        UploadableMobileEffect uploadableMobileEffect = (UploadableMobileEffect) obj;
        return Intrinsics.LJFF(this.effectId, uploadableMobileEffect.effectId) && Intrinsics.LJFF(this.effectName, uploadableMobileEffect.effectName) && Intrinsics.LJFF(this.iconFilePath, uploadableMobileEffect.iconFilePath) && Intrinsics.LJFF(this.zipFilePath, uploadableMobileEffect.zipFilePath) && Intrinsics.LJFF(this.templateResourceId, uploadableMobileEffect.templateResourceId) && Intrinsics.LJFF(this.templateEffectId, uploadableMobileEffect.templateEffectId) && Intrinsics.LJFF(this.selectedMedia, uploadableMobileEffect.selectedMedia) && this.needSubmission == uploadableMobileEffect.needSubmission && this.enableSubmission == uploadableMobileEffect.enableSubmission && this.capturedInPhotoMode == uploadableMobileEffect.capturedInPhotoMode && Intrinsics.LJFF(this.prompt, uploadableMobileEffect.prompt);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.effectId.hashCode() * 31) + this.effectName.hashCode()) * 31) + this.iconFilePath.hashCode()) * 31) + this.zipFilePath.hashCode()) * 31) + this.templateResourceId.hashCode()) * 31) + this.templateEffectId.hashCode()) * 31) + this.selectedMedia.hashCode()) * 31) + C786410Ut5.Z2(this.needSubmission)) * 31) + C786410Ut5.Z2(this.enableSubmission)) * 31) + C786410Ut5.Z2(this.capturedInPhotoMode)) * 31;
        String str = this.prompt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UploadableMobileEffect(effectId=" + this.effectId + ", effectName=" + this.effectName + ", iconFilePath=" + this.iconFilePath + ", zipFilePath=" + this.zipFilePath + ", templateResourceId=" + this.templateResourceId + ", templateEffectId=" + this.templateEffectId + ", selectedMedia=" + this.selectedMedia + ", needSubmission=" + this.needSubmission + ", enableSubmission=" + this.enableSubmission + ", capturedInPhotoMode=" + this.capturedInPhotoMode + ", prompt=" + this.prompt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.effectName);
        parcel.writeString(this.iconFilePath);
        parcel.writeString(this.zipFilePath);
        parcel.writeString(this.templateResourceId);
        parcel.writeString(this.templateEffectId);
        parcel.writeString(this.selectedMedia);
        parcel.writeInt(this.needSubmission ? 1 : 0);
        parcel.writeInt(this.enableSubmission ? 1 : 0);
        parcel.writeInt(this.capturedInPhotoMode ? 1 : 0);
        parcel.writeString(this.prompt);
    }

    public UploadableMobileEffect(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8) {
        this.effectId = str;
        this.effectName = str2;
        this.iconFilePath = str3;
        this.zipFilePath = str4;
        this.templateResourceId = str5;
        this.templateEffectId = str6;
        this.selectedMedia = str7;
        this.needSubmission = z;
        this.enableSubmission = z2;
        this.capturedInPhotoMode = z3;
        this.prompt = str8;
    }
}
