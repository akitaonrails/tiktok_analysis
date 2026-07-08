package com.ss.android.ugc.aweme.attributionlink.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributionLinkStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<AttributionLinkStickerStruct> CREATOR = new Parcelable.Creator<AttributionLinkStickerStruct>() { // from class: X.02tc
        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStickerStruct createFromParcel(Parcel parcel) {
            return new AttributionLinkStickerStruct(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStickerStruct[] newArray(int i) {
            return new AttributionLinkStickerStruct[i];
        }
    };

    @C09CT("media_size")
    public int mediaSize;

    @C09CT("scenario")
    public int scenario;

    @C09CT("share_format")
    public int shareFormat;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public String url;

    public AttributionLinkStickerStruct() {
        this(0, null, null, 0, 0);
    }

    public final AttributionLinkStickerStruct copy(int i, String str, String str2, int i2, int i3) {
        return new AttributionLinkStickerStruct(i, str, str2, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionLinkStickerStruct)) {
            return false;
        }
        AttributionLinkStickerStruct attributionLinkStickerStruct = (AttributionLinkStickerStruct) obj;
        return this.scenario == attributionLinkStickerStruct.scenario && Intrinsics.LJFF(this.title, attributionLinkStickerStruct.title) && Intrinsics.LJFF(this.url, attributionLinkStickerStruct.url) && this.shareFormat == attributionLinkStickerStruct.shareFormat && this.mediaSize == attributionLinkStickerStruct.mediaSize;
    }

    public int hashCode() {
        int i = this.scenario * 31;
        String str = this.title;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.shareFormat) * 31) + this.mediaSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttributionLinkStickerStruct(scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", shareFormat=");
        sbLIZ.append(this.shareFormat);
        sbLIZ.append(", mediaSize=");
        sbLIZ.append(this.mediaSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.scenario);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeInt(this.shareFormat);
        parcel.writeInt(this.mediaSize);
    }

    public final int getMediaSize() {
        return this.mediaSize;
    }

    public final int getScenario() {
        return this.scenario;
    }

    public final int getShareFormat() {
        return this.shareFormat;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public AttributionLinkStickerStruct(int i, String str, String str2, int i2, int i3) {
        this.scenario = i;
        this.title = str;
        this.url = str2;
        this.shareFormat = i2;
        this.mediaSize = i3;
    }
}
