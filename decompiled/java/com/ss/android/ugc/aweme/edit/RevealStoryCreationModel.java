package com.ss.android.ugc.aweme.edit;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.edit.RevealStoryImageInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RevealStoryCreationModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<RevealStoryCreationModel> CREATOR = new Parcelable.Creator<RevealStoryCreationModel>() { // from class: X.0naS
        @Override // android.os.Parcelable.Creator
        public final RevealStoryCreationModel createFromParcel(Parcel parcel) {
            ImageSynthesisResult imageSynthesisResultCreateFromParcel;
            Parcelable.Creator<RevealStoryImageInfo> creator = RevealStoryImageInfo.CREATOR;
            RevealStoryImageInfo revealStoryImageInfoCreateFromParcel = creator.createFromParcel(parcel);
            RevealStoryImageInfo revealStoryImageInfoCreateFromParcel2 = creator.createFromParcel(parcel);
            RevealStoryImageInfo revealStoryImageInfoCreateFromParcel3 = creator.createFromParcel(parcel);
            RevealStoryImageInfo revealStoryImageInfoCreateFromParcel4 = creator.createFromParcel(parcel);
            String string = parcel.readString();
            ImageSynthesisResult imageSynthesisResultCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                imageSynthesisResultCreateFromParcel = null;
            } else {
                imageSynthesisResultCreateFromParcel = ImageSynthesisResult.CREATOR.createFromParcel(parcel);
            }
            ImageSynthesisResult imageSynthesisResult = imageSynthesisResultCreateFromParcel;
            if (parcel.readInt() != 0) {
                imageSynthesisResultCreateFromParcel2 = ImageSynthesisResult.CREATOR.createFromParcel(parcel);
            }
            return new RevealStoryCreationModel(revealStoryImageInfoCreateFromParcel, revealStoryImageInfoCreateFromParcel2, revealStoryImageInfoCreateFromParcel3, revealStoryImageInfoCreateFromParcel4, string, imageSynthesisResult, imageSynthesisResultCreateFromParcel2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RevealStoryCreationModel[] newArray(int i) {
            return new RevealStoryCreationModel[i];
        }
    };

    @C09CT("reveal_story_back_img")
    public final RevealStoryImageInfo backImageInfo;

    @C09CT("reveal_story_back_img_path")
    public ImageSynthesisResult backImageModel;

    @C09CT("reveal_story_blur_img")
    public final RevealStoryImageInfo blurredImageInfo;

    @C040H
    @C0MY0
    public transient String blurredImagePath;

    @C09CT("reveal_story_clear_img")
    public final RevealStoryImageInfo clearImageInfo;

    @C09CT("custom_cutout_name")
    public String customCutoutName;

    @C09CT("reveal_story_front_img")
    public final RevealStoryImageInfo frontImageInfo;

    @C09CT("reveal_story_front_img_path")
    public ImageSynthesisResult frontImageModel;

    public RevealStoryCreationModel() {
        this(new RevealStoryImageInfo(0, -1), new RevealStoryImageInfo(0, -1), new RevealStoryImageInfo(0, -1), new RevealStoryImageInfo(0, -1), null, null, null, null);
    }

    public final RevealStoryCreationModel copy(RevealStoryImageInfo revealStoryImageInfo, RevealStoryImageInfo revealStoryImageInfo2, RevealStoryImageInfo revealStoryImageInfo3, RevealStoryImageInfo revealStoryImageInfo4, String str, ImageSynthesisResult imageSynthesisResult, ImageSynthesisResult imageSynthesisResult2, String str2) {
        return new RevealStoryCreationModel(revealStoryImageInfo, revealStoryImageInfo2, revealStoryImageInfo3, revealStoryImageInfo4, str, imageSynthesisResult, imageSynthesisResult2, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevealStoryCreationModel)) {
            return false;
        }
        RevealStoryCreationModel revealStoryCreationModel = (RevealStoryCreationModel) obj;
        return Intrinsics.LJFF(this.clearImageInfo, revealStoryCreationModel.clearImageInfo) && Intrinsics.LJFF(this.blurredImageInfo, revealStoryCreationModel.blurredImageInfo) && Intrinsics.LJFF(this.frontImageInfo, revealStoryCreationModel.frontImageInfo) && Intrinsics.LJFF(this.backImageInfo, revealStoryCreationModel.backImageInfo) && Intrinsics.LJFF(this.blurredImagePath, revealStoryCreationModel.blurredImagePath) && Intrinsics.LJFF(this.frontImageModel, revealStoryCreationModel.frontImageModel) && Intrinsics.LJFF(this.backImageModel, revealStoryCreationModel.backImageModel) && Intrinsics.LJFF(this.customCutoutName, revealStoryCreationModel.customCutoutName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.clearImageInfo.hashCode() * 31) + this.blurredImageInfo.hashCode()) * 31) + this.frontImageInfo.hashCode()) * 31) + this.backImageInfo.hashCode()) * 31;
        String str = this.blurredImagePath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageSynthesisResult imageSynthesisResult = this.frontImageModel;
        int iHashCode3 = (iHashCode2 + (imageSynthesisResult == null ? 0 : imageSynthesisResult.hashCode())) * 31;
        ImageSynthesisResult imageSynthesisResult2 = this.backImageModel;
        int iHashCode4 = (iHashCode3 + (imageSynthesisResult2 == null ? 0 : imageSynthesisResult2.hashCode())) * 31;
        String str2 = this.customCutoutName;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealStoryCreationModel(clearImageInfo=");
        sbLIZ.append(this.clearImageInfo);
        sbLIZ.append(", blurredImageInfo=");
        sbLIZ.append(this.blurredImageInfo);
        sbLIZ.append(", frontImageInfo=");
        sbLIZ.append(this.frontImageInfo);
        sbLIZ.append(", backImageInfo=");
        sbLIZ.append(this.backImageInfo);
        sbLIZ.append(", blurredImagePath=");
        sbLIZ.append(this.blurredImagePath);
        sbLIZ.append(", frontImageModel=");
        sbLIZ.append(this.frontImageModel);
        sbLIZ.append(", backImageModel=");
        sbLIZ.append(this.backImageModel);
        sbLIZ.append(", customCutoutName=");
        sbLIZ.append(this.customCutoutName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.clearImageInfo.writeToParcel(parcel, i);
        this.blurredImageInfo.writeToParcel(parcel, i);
        this.frontImageInfo.writeToParcel(parcel, i);
        this.backImageInfo.writeToParcel(parcel, i);
        parcel.writeString(this.blurredImagePath);
        ImageSynthesisResult imageSynthesisResult = this.frontImageModel;
        if (imageSynthesisResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSynthesisResult.writeToParcel(parcel, i);
        }
        ImageSynthesisResult imageSynthesisResult2 = this.backImageModel;
        if (imageSynthesisResult2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSynthesisResult2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.customCutoutName);
    }

    public final RevealStoryImageInfo getBackImageInfo() {
        return this.backImageInfo;
    }

    public final ImageSynthesisResult getBackImageModel() {
        return this.backImageModel;
    }

    public final RevealStoryImageInfo getBlurredImageInfo() {
        return this.blurredImageInfo;
    }

    public final String getBlurredImagePath() {
        return this.blurredImagePath;
    }

    public final RevealStoryImageInfo getClearImageInfo() {
        return this.clearImageInfo;
    }

    public final String getCustomCutoutName() {
        return this.customCutoutName;
    }

    public final RevealStoryImageInfo getFrontImageInfo() {
        return this.frontImageInfo;
    }

    public final ImageSynthesisResult getFrontImageModel() {
        return this.frontImageModel;
    }

    public final void setBackImageModel(ImageSynthesisResult imageSynthesisResult) {
        this.backImageModel = imageSynthesisResult;
    }

    public final void setBlurredImagePath(String str) {
        this.blurredImagePath = str;
    }

    public final void setCustomCutoutName(String str) {
        this.customCutoutName = str;
    }

    public final void setFrontImageModel(ImageSynthesisResult imageSynthesisResult) {
        this.frontImageModel = imageSynthesisResult;
    }

    public RevealStoryCreationModel(RevealStoryImageInfo revealStoryImageInfo, RevealStoryImageInfo revealStoryImageInfo2, RevealStoryImageInfo revealStoryImageInfo3, RevealStoryImageInfo revealStoryImageInfo4, String str, ImageSynthesisResult imageSynthesisResult, ImageSynthesisResult imageSynthesisResult2, String str2) {
        this.clearImageInfo = revealStoryImageInfo;
        this.blurredImageInfo = revealStoryImageInfo2;
        this.frontImageInfo = revealStoryImageInfo3;
        this.backImageInfo = revealStoryImageInfo4;
        this.blurredImagePath = str;
        this.frontImageModel = imageSynthesisResult;
        this.backImageModel = imageSynthesisResult2;
        this.customCutoutName = str2;
    }
}
