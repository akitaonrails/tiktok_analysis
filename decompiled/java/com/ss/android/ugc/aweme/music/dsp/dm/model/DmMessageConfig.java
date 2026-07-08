package com.ss.android.ugc.aweme.music.dsp.dm.model;

import X.C2188811AlT;
import X.C618960OPm;
import X.EnumC626270OhN;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DmMessageConfig implements Parcelable {
    public final String artistUserId;
    public final EnumC626270OhN contentType;
    public final String coverImageUrl;
    public final DspPlatform dspPlatform;
    public final String entityUri;
    public final String messageId;
    public final String musicId;
    public final String shareUrl;
    public final String subtitle;
    public final String title;
    public static final C618960OPm Companion = new Object() { // from class: X.0OPm
    };
    public static final Parcelable.Creator<DmMessageConfig> CREATOR = new Parcelable.Creator<DmMessageConfig>() { // from class: X.0OPl
        @Override // android.os.Parcelable.Creator
        public final DmMessageConfig createFromParcel(Parcel parcel) {
            return new DmMessageConfig(parcel.readString(), EnumC626270OhN.valueOf(parcel.readString()), DspPlatform.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DmMessageConfig[] newArray(int i) {
            return new DmMessageConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DmMessageConfig)) {
            return false;
        }
        DmMessageConfig dmMessageConfig = (DmMessageConfig) obj;
        return Intrinsics.LJFF(this.messageId, dmMessageConfig.messageId) && this.contentType == dmMessageConfig.contentType && this.dspPlatform == dmMessageConfig.dspPlatform && Intrinsics.LJFF(this.title, dmMessageConfig.title) && Intrinsics.LJFF(this.subtitle, dmMessageConfig.subtitle) && Intrinsics.LJFF(this.shareUrl, dmMessageConfig.shareUrl) && Intrinsics.LJFF(this.musicId, dmMessageConfig.musicId) && Intrinsics.LJFF(this.coverImageUrl, dmMessageConfig.coverImageUrl) && Intrinsics.LJFF(this.artistUserId, dmMessageConfig.artistUserId) && Intrinsics.LJFF(this.entityUri, dmMessageConfig.entityUri);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.messageId.hashCode() * 31) + this.contentType.hashCode()) * 31) + this.dspPlatform.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.shareUrl.hashCode()) * 31;
        String str = this.musicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.artistUserId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entityUri;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DmMessageConfig(messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", dspPlatform=");
        sbLIZ.append(this.dspPlatform);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", shareUrl=");
        sbLIZ.append(this.shareUrl);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", coverImageUrl=");
        sbLIZ.append(this.coverImageUrl);
        sbLIZ.append(", artistUserId=");
        sbLIZ.append(this.artistUserId);
        sbLIZ.append(", entityUri=");
        sbLIZ.append(this.entityUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeString(this.contentType.name());
        parcel.writeString(this.dspPlatform.name());
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.musicId);
        parcel.writeString(this.coverImageUrl);
        parcel.writeString(this.artistUserId);
        parcel.writeString(this.entityUri);
    }

    public DmMessageConfig(String str, EnumC626270OhN enumC626270OhN, DspPlatform dspPlatform, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.messageId = str;
        this.contentType = enumC626270OhN;
        this.dspPlatform = dspPlatform;
        this.title = str2;
        this.subtitle = str3;
        this.shareUrl = str4;
        this.musicId = str5;
        this.coverImageUrl = str6;
        this.artistUserId = str7;
        this.entityUri = str8;
    }
}
