package com.ss.android.ugc.aweme.effectcreator.models;

import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectObjectDataWrapper implements Parcelable {
    public static final Parcelable.Creator<EffectObjectDataWrapper> CREATOR = new Parcelable.Creator<EffectObjectDataWrapper>() { // from class: X.0vKi
        @Override // android.os.Parcelable.Creator
        public final EffectObjectDataWrapper createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EffectObjectDataWrapper(string, string2, arrayListCreateStringArrayList, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectObjectDataWrapper[] newArray(int i) {
            return new EffectObjectDataWrapper[i];
        }
    };
    public String addMethod;
    public String ameAssetId;
    public String assetId;
    public String categories;
    public String cutoutTabFrom;
    public String defaultTrackingType;
    public String distortionClass;
    public final String distortionStatus;
    public String faceStretchMode;
    public String facialCutoutArea;
    public final String featureId;
    public final String featureName;
    public String featureType;
    public String giphyInputWord;
    public String greenScreenCutoutStatus;
    public String greenScreenType;
    public String isFromCustomTab;
    public boolean isStickerImageCutout;
    public final List<String> liquifyStatus;
    public String musicId;
    public String musicName;
    public String musicSearchTerm;
    public String shapeResId;
    public String stickerAddFrom;
    public String strengthNum;
    public final String templateResourceId;
    public final String textureFrom;
    public final String textureType;
    public String trackingType;
    public String videoLength;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectObjectDataWrapper)) {
            return false;
        }
        EffectObjectDataWrapper effectObjectDataWrapper = (EffectObjectDataWrapper) obj;
        return Intrinsics.LJFF(this.featureId, effectObjectDataWrapper.featureId) && Intrinsics.LJFF(this.distortionStatus, effectObjectDataWrapper.distortionStatus) && Intrinsics.LJFF(this.liquifyStatus, effectObjectDataWrapper.liquifyStatus) && Intrinsics.LJFF(this.featureName, effectObjectDataWrapper.featureName) && Intrinsics.LJFF(this.textureFrom, effectObjectDataWrapper.textureFrom) && Intrinsics.LJFF(this.textureType, effectObjectDataWrapper.textureType) && Intrinsics.LJFF(this.assetId, effectObjectDataWrapper.assetId) && Intrinsics.LJFF(this.categories, effectObjectDataWrapper.categories) && Intrinsics.LJFF(this.featureType, effectObjectDataWrapper.featureType) && Intrinsics.LJFF(this.strengthNum, effectObjectDataWrapper.strengthNum) && Intrinsics.LJFF(this.videoLength, effectObjectDataWrapper.videoLength) && Intrinsics.LJFF(this.templateResourceId, effectObjectDataWrapper.templateResourceId) && Intrinsics.LJFF(this.distortionClass, effectObjectDataWrapper.distortionClass) && Intrinsics.LJFF(this.ameAssetId, effectObjectDataWrapper.ameAssetId) && Intrinsics.LJFF(this.trackingType, effectObjectDataWrapper.trackingType) && Intrinsics.LJFF(this.defaultTrackingType, effectObjectDataWrapper.defaultTrackingType) && Intrinsics.LJFF(this.addMethod, effectObjectDataWrapper.addMethod) && Intrinsics.LJFF(this.shapeResId, effectObjectDataWrapper.shapeResId) && Intrinsics.LJFF(this.stickerAddFrom, effectObjectDataWrapper.stickerAddFrom) && Intrinsics.LJFF(this.giphyInputWord, effectObjectDataWrapper.giphyInputWord) && Intrinsics.LJFF(this.musicId, effectObjectDataWrapper.musicId) && Intrinsics.LJFF(this.isFromCustomTab, effectObjectDataWrapper.isFromCustomTab) && Intrinsics.LJFF(this.musicName, effectObjectDataWrapper.musicName) && Intrinsics.LJFF(this.musicSearchTerm, effectObjectDataWrapper.musicSearchTerm) && Intrinsics.LJFF(this.cutoutTabFrom, effectObjectDataWrapper.cutoutTabFrom) && Intrinsics.LJFF(this.facialCutoutArea, effectObjectDataWrapper.facialCutoutArea) && this.isStickerImageCutout == effectObjectDataWrapper.isStickerImageCutout && Intrinsics.LJFF(this.greenScreenCutoutStatus, effectObjectDataWrapper.greenScreenCutoutStatus) && Intrinsics.LJFF(this.faceStretchMode, effectObjectDataWrapper.faceStretchMode) && Intrinsics.LJFF(this.greenScreenType, effectObjectDataWrapper.greenScreenType);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((this.featureId.hashCode() * 31) + this.distortionStatus.hashCode()) * 31) + this.liquifyStatus.hashCode()) * 31) + this.featureName.hashCode()) * 31) + this.textureFrom.hashCode()) * 31) + this.textureType.hashCode()) * 31) + this.assetId.hashCode()) * 31) + this.categories.hashCode()) * 31) + this.featureType.hashCode()) * 31) + this.strengthNum.hashCode()) * 31) + this.videoLength.hashCode()) * 31) + this.templateResourceId.hashCode()) * 31) + this.distortionClass.hashCode()) * 31) + this.ameAssetId.hashCode()) * 31) + this.trackingType.hashCode()) * 31) + this.defaultTrackingType.hashCode()) * 31) + this.addMethod.hashCode()) * 31) + this.shapeResId.hashCode()) * 31) + this.stickerAddFrom.hashCode()) * 31) + this.giphyInputWord.hashCode()) * 31) + this.musicId.hashCode()) * 31) + this.isFromCustomTab.hashCode()) * 31) + this.musicName.hashCode()) * 31) + this.musicSearchTerm.hashCode()) * 31) + this.cutoutTabFrom.hashCode()) * 31) + this.facialCutoutArea.hashCode()) * 31) + C786410Ut5.Z2(this.isStickerImageCutout)) * 31;
        String str = this.greenScreenCutoutStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.faceStretchMode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.greenScreenType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "EffectObjectDataWrapper(featureId=" + this.featureId + ", distortionStatus=" + this.distortionStatus + ", liquifyStatus=" + this.liquifyStatus + ", featureName=" + this.featureName + ", textureFrom=" + this.textureFrom + ", textureType=" + this.textureType + ", assetId=" + this.assetId + ", categories=" + this.categories + ", featureType=" + this.featureType + ", strengthNum=" + this.strengthNum + ", videoLength=" + this.videoLength + ", templateResourceId=" + this.templateResourceId + ", distortionClass=" + this.distortionClass + ", ameAssetId=" + this.ameAssetId + ", trackingType=" + this.trackingType + ", defaultTrackingType=" + this.defaultTrackingType + ", addMethod=" + this.addMethod + ", shapeResId=" + this.shapeResId + ", stickerAddFrom=" + this.stickerAddFrom + ", giphyInputWord=" + this.giphyInputWord + ", musicId=" + this.musicId + ", isFromCustomTab=" + this.isFromCustomTab + ", musicName=" + this.musicName + ", musicSearchTerm=" + this.musicSearchTerm + ", cutoutTabFrom=" + this.cutoutTabFrom + ", facialCutoutArea=" + this.facialCutoutArea + ", isStickerImageCutout=" + this.isStickerImageCutout + ", greenScreenCutoutStatus=" + this.greenScreenCutoutStatus + ", faceStretchMode=" + this.faceStretchMode + ", greenScreenType=" + this.greenScreenType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.featureId);
        parcel.writeString(this.distortionStatus);
        parcel.writeStringList(this.liquifyStatus);
        parcel.writeString(this.featureName);
        parcel.writeString(this.textureFrom);
        parcel.writeString(this.textureType);
        parcel.writeString(this.assetId);
        parcel.writeString(this.categories);
        parcel.writeString(this.featureType);
        parcel.writeString(this.strengthNum);
        parcel.writeString(this.videoLength);
        parcel.writeString(this.templateResourceId);
        parcel.writeString(this.distortionClass);
        parcel.writeString(this.ameAssetId);
        parcel.writeString(this.trackingType);
        parcel.writeString(this.defaultTrackingType);
        parcel.writeString(this.addMethod);
        parcel.writeString(this.shapeResId);
        parcel.writeString(this.stickerAddFrom);
        parcel.writeString(this.giphyInputWord);
        parcel.writeString(this.musicId);
        parcel.writeString(this.isFromCustomTab);
        parcel.writeString(this.musicName);
        parcel.writeString(this.musicSearchTerm);
        parcel.writeString(this.cutoutTabFrom);
        parcel.writeString(this.facialCutoutArea);
        parcel.writeInt(this.isStickerImageCutout ? 1 : 0);
        parcel.writeString(this.greenScreenCutoutStatus);
        parcel.writeString(this.faceStretchMode);
        parcel.writeString(this.greenScreenType);
    }

    public EffectObjectDataWrapper() {
        this("", "", C13BV.INSTANCE, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", false, null, null, null);
    }

    public EffectObjectDataWrapper(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28) {
        this.featureId = str;
        this.distortionStatus = str2;
        this.liquifyStatus = list;
        this.featureName = str3;
        this.textureFrom = str4;
        this.textureType = str5;
        this.assetId = str6;
        this.categories = str7;
        this.featureType = str8;
        this.strengthNum = str9;
        this.videoLength = str10;
        this.templateResourceId = str11;
        this.distortionClass = str12;
        this.ameAssetId = str13;
        this.trackingType = str14;
        this.defaultTrackingType = str15;
        this.addMethod = str16;
        this.shapeResId = str17;
        this.stickerAddFrom = str18;
        this.giphyInputWord = str19;
        this.musicId = str20;
        this.isFromCustomTab = str21;
        this.musicName = str22;
        this.musicSearchTerm = str23;
        this.cutoutTabFrom = str24;
        this.facialCutoutArea = str25;
        this.isStickerImageCutout = z;
        this.greenScreenCutoutStatus = str26;
        this.faceStretchMode = str27;
        this.greenScreenType = str28;
    }
}
