package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0MY0;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.GreenScreenInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class UploadableMobileEffect2 implements Parcelable {
    public static final Parcelable.Creator<UploadableMobileEffect2> CREATOR = new Parcelable.Creator<UploadableMobileEffect2>() { // from class: X.0siZ
        @Override // android.os.Parcelable.Creator
        public final UploadableMobileEffect2 createFromParcel(Parcel parcel) {
            TemplateEffectInfo templateEffectInfoCreateFromParcel;
            GreenScreenInfo greenScreenInfoCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            DraftInfo draftInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                templateEffectInfoCreateFromParcel = null;
            } else {
                templateEffectInfoCreateFromParcel = TemplateEffectInfo.CREATOR.createFromParcel(parcel);
            }
            TemplateEffectInfo templateEffectInfo = templateEffectInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                greenScreenInfoCreateFromParcel = null;
            } else {
                greenScreenInfoCreateFromParcel = GreenScreenInfo.CREATOR.createFromParcel(parcel);
            }
            GreenScreenInfo greenScreenInfo = greenScreenInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                draftInfoCreateFromParcel = DraftInfo.CREATOR.createFromParcel(parcel);
            }
            DraftInfo draftInfo = draftInfoCreateFromParcel;
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new UploadableMobileEffect2(string, string2, string3, string4, string5, templateEffectInfo, greenScreenInfo, draftInfo, z, z2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadableMobileEffect2[] newArray(int i) {
            return new UploadableMobileEffect2[i];
        }
    };

    @C09CT("capturedInPhotoMode")
    public boolean capturedInPhotoMode;

    @C09CT("dirPath")
    public final String dirPath;

    @C09CT("draftInfo")
    public DraftInfo draftInfo;

    @C09CT("effectId")
    public String effectId;

    @C09CT("effectName")
    public String effectName;

    @C09CT("enableMETSubmission")
    public boolean enableMETSubmission;

    @C09CT("greenScreenInfo")
    public GreenScreenInfo greenScreenInfo;

    @C09CT("iconFilePath")
    @C0MY0
    public String iconFilePath;

    @C09CT("prompt")
    public String prompt;

    @C09CT("templateInfo")
    public TemplateEffectInfo templateInfo;

    @C09CT("zipFilePath")
    @C0MY0
    public String zipFilePath;

    public UploadableMobileEffect2() {
        this("", "", "", "", null, null, null, null, true, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadableMobileEffect2)) {
            return false;
        }
        UploadableMobileEffect2 uploadableMobileEffect2 = (UploadableMobileEffect2) obj;
        return Intrinsics.LJFF(this.effectId, uploadableMobileEffect2.effectId) && Intrinsics.LJFF(this.effectName, uploadableMobileEffect2.effectName) && Intrinsics.LJFF(this.iconFilePath, uploadableMobileEffect2.iconFilePath) && Intrinsics.LJFF(this.zipFilePath, uploadableMobileEffect2.zipFilePath) && Intrinsics.LJFF(this.dirPath, uploadableMobileEffect2.dirPath) && Intrinsics.LJFF(this.templateInfo, uploadableMobileEffect2.templateInfo) && Intrinsics.LJFF(this.greenScreenInfo, uploadableMobileEffect2.greenScreenInfo) && Intrinsics.LJFF(this.draftInfo, uploadableMobileEffect2.draftInfo) && this.enableMETSubmission == uploadableMobileEffect2.enableMETSubmission && this.capturedInPhotoMode == uploadableMobileEffect2.capturedInPhotoMode && Intrinsics.LJFF(this.prompt, uploadableMobileEffect2.prompt);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.effectId.hashCode() * 31) + this.effectName.hashCode()) * 31) + this.iconFilePath.hashCode()) * 31) + this.zipFilePath.hashCode()) * 31;
        String str = this.dirPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TemplateEffectInfo templateEffectInfo = this.templateInfo;
        int iHashCode3 = (iHashCode2 + (templateEffectInfo == null ? 0 : templateEffectInfo.hashCode())) * 31;
        GreenScreenInfo greenScreenInfo = this.greenScreenInfo;
        int iHashCode4 = (iHashCode3 + (greenScreenInfo == null ? 0 : greenScreenInfo.hashCode())) * 31;
        DraftInfo draftInfo = this.draftInfo;
        int iHashCode5 = (((((iHashCode4 + (draftInfo == null ? 0 : draftInfo.hashCode())) * 31) + C786410Ut5.Z2(this.enableMETSubmission)) * 31) + C786410Ut5.Z2(this.capturedInPhotoMode)) * 31;
        String str2 = this.prompt;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UploadableMobileEffect2(effectId=" + this.effectId + ", effectName=" + this.effectName + ", iconFilePath=" + this.iconFilePath + ", zipFilePath=" + this.zipFilePath + ", dirPath=" + this.dirPath + ", templateInfo=" + this.templateInfo + ", greenScreenInfo=" + this.greenScreenInfo + ", draftInfo=" + this.draftInfo + ", enableMETSubmission=" + this.enableMETSubmission + ", capturedInPhotoMode=" + this.capturedInPhotoMode + ", prompt=" + this.prompt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.effectName);
        parcel.writeString(this.iconFilePath);
        parcel.writeString(this.zipFilePath);
        parcel.writeString(this.dirPath);
        TemplateEffectInfo templateEffectInfo = this.templateInfo;
        if (templateEffectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateEffectInfo.writeToParcel(parcel, i);
        }
        GreenScreenInfo greenScreenInfo = this.greenScreenInfo;
        if (greenScreenInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(greenScreenInfo.selectedMedia);
        }
        DraftInfo draftInfo = this.draftInfo;
        if (draftInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            draftInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableMETSubmission ? 1 : 0);
        parcel.writeInt(this.capturedInPhotoMode ? 1 : 0);
        parcel.writeString(this.prompt);
    }

    public UploadableMobileEffect2(String str, String str2, String str3, String str4, String str5, TemplateEffectInfo templateEffectInfo, GreenScreenInfo greenScreenInfo, DraftInfo draftInfo, boolean z, boolean z2, String str6) {
        this.effectId = str;
        this.effectName = str2;
        this.iconFilePath = str3;
        this.zipFilePath = str4;
        this.dirPath = str5;
        this.templateInfo = templateEffectInfo;
        this.greenScreenInfo = greenScreenInfo;
        this.draftInfo = draftInfo;
        this.enableMETSubmission = z;
        this.capturedInPhotoMode = z2;
        this.prompt = str6;
    }
}
