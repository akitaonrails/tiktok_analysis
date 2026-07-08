package com.bytedance.effectcreatormobile.ckeapi.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PassThroughParams implements Parcelable {
    public static final Parcelable.Creator<PassThroughParams> CREATOR = new Parcelable.Creator<PassThroughParams>() { // from class: X.0vJw
        @Override // android.os.Parcelable.Creator
        public final PassThroughParams createFromParcel(Parcel parcel) {
            return new PassThroughParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(PassThroughParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AigcParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PassThroughParams[] newArray(int i) {
            return new PassThroughParams[i];
        }
    };
    public final AigcParams aigcParams;
    public final String ameAigcEnterFrom;
    public final String ameEnterFrom;
    public final String ameTemplateId;
    public final String campaignBindMethod;
    public final String campaignId;
    public final String creationId;
    public final String effectStatus;
    public final String enterFrom;
    public final String enterType;
    public final String isPhotoMode;
    public final String propId;
    public final Uri routeUri;
    public final String shootPageEnterFrom;
    public final String shootTabName;
    public final String shootWay;
    public final String tabKey;
    public final String templateResourceId;
    public final String userEntryMethod;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassThroughParams)) {
            return false;
        }
        PassThroughParams passThroughParams = (PassThroughParams) obj;
        return Intrinsics.LJFF(this.enterFrom, passThroughParams.enterFrom) && Intrinsics.LJFF(this.ameEnterFrom, passThroughParams.ameEnterFrom) && Intrinsics.LJFF(this.shootPageEnterFrom, passThroughParams.shootPageEnterFrom) && Intrinsics.LJFF(this.shootWay, passThroughParams.shootWay) && Intrinsics.LJFF(this.creationId, passThroughParams.creationId) && Intrinsics.LJFF(this.isPhotoMode, passThroughParams.isPhotoMode) && Intrinsics.LJFF(this.tabKey, passThroughParams.tabKey) && Intrinsics.LJFF(this.shootTabName, passThroughParams.shootTabName) && Intrinsics.LJFF(this.routeUri, passThroughParams.routeUri) && Intrinsics.LJFF(this.ameTemplateId, passThroughParams.ameTemplateId) && Intrinsics.LJFF(this.templateResourceId, passThroughParams.templateResourceId) && Intrinsics.LJFF(this.propId, passThroughParams.propId) && Intrinsics.LJFF(this.effectStatus, passThroughParams.effectStatus) && Intrinsics.LJFF(this.ameAigcEnterFrom, passThroughParams.ameAigcEnterFrom) && Intrinsics.LJFF(this.campaignId, passThroughParams.campaignId) && Intrinsics.LJFF(this.campaignBindMethod, passThroughParams.campaignBindMethod) && Intrinsics.LJFF(this.enterType, passThroughParams.enterType) && Intrinsics.LJFF(this.userEntryMethod, passThroughParams.userEntryMethod) && Intrinsics.LJFF(this.aigcParams, passThroughParams.aigcParams);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.enterFrom.hashCode() * 31) + this.ameEnterFrom.hashCode()) * 31) + this.shootPageEnterFrom.hashCode()) * 31) + this.shootWay.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.isPhotoMode.hashCode()) * 31) + this.tabKey.hashCode()) * 31) + this.shootTabName.hashCode()) * 31;
        Uri uri = this.routeUri;
        int iHashCode2 = (((((((((((((((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.ameTemplateId.hashCode()) * 31) + this.templateResourceId.hashCode()) * 31) + this.propId.hashCode()) * 31) + this.effectStatus.hashCode()) * 31) + this.ameAigcEnterFrom.hashCode()) * 31) + this.campaignId.hashCode()) * 31) + this.campaignBindMethod.hashCode()) * 31) + this.enterType.hashCode()) * 31;
        String str = this.userEntryMethod;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.aigcParams.hashCode();
    }

    public final String toString() {
        return "PassThroughParams(enterFrom=" + this.enterFrom + ", ameEnterFrom=" + this.ameEnterFrom + ", shootPageEnterFrom=" + this.shootPageEnterFrom + ", shootWay=" + this.shootWay + ", creationId=" + this.creationId + ", isPhotoMode=" + this.isPhotoMode + ", tabKey=" + this.tabKey + ", shootTabName=" + this.shootTabName + ", routeUri=" + this.routeUri + ", ameTemplateId=" + this.ameTemplateId + ", templateResourceId=" + this.templateResourceId + ", propId=" + this.propId + ", effectStatus=" + this.effectStatus + ", ameAigcEnterFrom=" + this.ameAigcEnterFrom + ", campaignId=" + this.campaignId + ", campaignBindMethod=" + this.campaignBindMethod + ", enterType=" + this.enterType + ", userEntryMethod=" + this.userEntryMethod + ", aigcParams=" + this.aigcParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.ameEnterFrom);
        parcel.writeString(this.shootPageEnterFrom);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.creationId);
        parcel.writeString(this.isPhotoMode);
        parcel.writeString(this.tabKey);
        parcel.writeString(this.shootTabName);
        parcel.writeParcelable(this.routeUri, i);
        parcel.writeString(this.ameTemplateId);
        parcel.writeString(this.templateResourceId);
        parcel.writeString(this.propId);
        parcel.writeString(this.effectStatus);
        parcel.writeString(this.ameAigcEnterFrom);
        parcel.writeString(this.campaignId);
        parcel.writeString(this.campaignBindMethod);
        parcel.writeString(this.enterType);
        parcel.writeString(this.userEntryMethod);
        this.aigcParams.writeToParcel(parcel, i);
    }

    public static PassThroughParams LIZ(PassThroughParams passThroughParams, String str, String str2, String str3, String str4, String str5, String str6, AigcParams aigcParams, int i) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Uri uri;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        AigcParams aigcParams2 = aigcParams;
        String str17 = str6;
        String str18 = str2;
        String str19 = str5;
        String str20 = str4;
        String str21 = str3;
        String str22 = str;
        if ((i & 1) != 0) {
            str22 = passThroughParams.enterFrom;
        }
        if ((i & 2) != 0) {
            str18 = passThroughParams.ameEnterFrom;
        }
        String str23 = null;
        if ((i & 4) != 0) {
            str7 = passThroughParams.shootPageEnterFrom;
        } else {
            str7 = null;
        }
        if ((i & 8) != 0) {
            str21 = passThroughParams.shootWay;
        }
        if ((i & 16) != 0) {
            str8 = passThroughParams.creationId;
        } else {
            str8 = null;
        }
        if ((i & 32) != 0) {
            str9 = passThroughParams.isPhotoMode;
        } else {
            str9 = null;
        }
        if ((i & 64) != 0) {
            str10 = passThroughParams.tabKey;
        } else {
            str10 = null;
        }
        if ((i & 128) != 0) {
            str11 = passThroughParams.shootTabName;
        } else {
            str11 = null;
        }
        if ((i & 256) != 0) {
            uri = passThroughParams.routeUri;
        } else {
            uri = null;
        }
        if ((i & 512) != 0) {
            str12 = passThroughParams.ameTemplateId;
        } else {
            str12 = null;
        }
        if ((i & 1024) != 0) {
            str13 = passThroughParams.templateResourceId;
        } else {
            str13 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str14 = passThroughParams.propId;
        } else {
            str14 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str15 = passThroughParams.effectStatus;
        } else {
            str15 = null;
        }
        if ((i & 8192) != 0) {
            str16 = passThroughParams.ameAigcEnterFrom;
        } else {
            str16 = null;
        }
        if ((i & 16384) != 0) {
            str20 = passThroughParams.campaignId;
        }
        if ((32768 & i) != 0) {
            str19 = passThroughParams.campaignBindMethod;
        }
        if ((65536 & i) != 0) {
            str17 = passThroughParams.enterType;
        }
        if ((131072 & i) != 0) {
            str23 = passThroughParams.userEntryMethod;
        }
        if ((i & 262144) != 0) {
            aigcParams2 = passThroughParams.aigcParams;
        }
        passThroughParams.getClass();
        return new PassThroughParams(str22, str18, str7, str21, str8, str9, str10, str11, uri, str12, str13, str14, str15, str16, str20, str19, str17, str23, aigcParams2);
    }

    public PassThroughParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Uri uri, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, AigcParams aigcParams) {
        this.enterFrom = str;
        this.ameEnterFrom = str2;
        this.shootPageEnterFrom = str3;
        this.shootWay = str4;
        this.creationId = str5;
        this.isPhotoMode = str6;
        this.tabKey = str7;
        this.shootTabName = str8;
        this.routeUri = uri;
        this.ameTemplateId = str9;
        this.templateResourceId = str10;
        this.propId = str11;
        this.effectStatus = str12;
        this.ameAigcEnterFrom = str13;
        this.campaignId = str14;
        this.campaignBindMethod = str15;
        this.enterType = str16;
        this.userEntryMethod = str17;
        this.aigcParams = aigcParams;
    }
}
