package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PlaybackVideoPreviewStreamData implements Parcelable {

    @C09CT("bitrate")
    public final Long bitrate;

    @C09CT("duration")
    public final Double duration;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("format")
    public final String format;

    @C09CT("height")
    public final Integer height;

    @C09CT("main_url")
    public final String mainUrl;

    @C09CT("poster_url")
    public final String posterUrl;

    @C09CT("vid")
    public final String vid;

    @C09CT("width")
    public final Integer width;
    public static final Parcelable.Creator<PlaybackVideoPreviewStreamData> CREATOR = new Parcelable.Creator<PlaybackVideoPreviewStreamData>() { // from class: X.0mfZ
        @Override // android.os.Parcelable.Creator
        public final PlaybackVideoPreviewStreamData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Double dValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new PlaybackVideoPreviewStreamData(string, string2, numValueOf, numValueOf2, dValueOf, string3, string4, string5, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackVideoPreviewStreamData[] newArray(int i) {
            return new PlaybackVideoPreviewStreamData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackVideoPreviewStreamData)) {
            return false;
        }
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = (PlaybackVideoPreviewStreamData) obj;
        return Intrinsics.LJFF(this.mainUrl, playbackVideoPreviewStreamData.mainUrl) && Intrinsics.LJFF(this.posterUrl, playbackVideoPreviewStreamData.posterUrl) && Intrinsics.LJFF(this.height, playbackVideoPreviewStreamData.height) && Intrinsics.LJFF(this.width, playbackVideoPreviewStreamData.width) && Intrinsics.LJFF(this.duration, playbackVideoPreviewStreamData.duration) && Intrinsics.LJFF(this.fileHash, playbackVideoPreviewStreamData.fileHash) && Intrinsics.LJFF(this.vid, playbackVideoPreviewStreamData.vid) && Intrinsics.LJFF(this.format, playbackVideoPreviewStreamData.format) && Intrinsics.LJFF(this.bitrate, playbackVideoPreviewStreamData.bitrate);
    }

    public final int hashCode() {
        String str = this.mainUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.posterUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.duration;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vid;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.format;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.bitrate;
        return iHashCode8 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybackVideoPreviewStreamData(mainUrl=");
        sbLIZ.append(this.mainUrl);
        sbLIZ.append(", posterUrl=");
        sbLIZ.append(this.posterUrl);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mainUrl);
        parcel.writeString(this.posterUrl);
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Double d = this.duration;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.fileHash);
        parcel.writeString(this.vid);
        parcel.writeString(this.format);
        Long l = this.bitrate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public PlaybackVideoPreviewStreamData(String str, String str2, Integer num, Integer num2, Double d, String str3, String str4, String str5, Long l) {
        this.mainUrl = str;
        this.posterUrl = str2;
        this.height = num;
        this.width = num2;
        this.duration = d;
        this.fileHash = str3;
        this.vid = str4;
        this.format = str5;
        this.bitrate = l;
    }
}
