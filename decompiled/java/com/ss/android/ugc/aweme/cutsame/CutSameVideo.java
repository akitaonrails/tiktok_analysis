package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CutSameVideo implements Parcelable {

    @C09CT("cover_uri")
    public final String coverUri;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("video_uri")
    public final String videoUri;

    @C09CT("video_url")
    public final String videoUrl;
    public static final Parcelable.Creator<CutSameVideo> CREATOR = new Parcelable.Creator<CutSameVideo>() { // from class: X.0n0B
        @Override // android.os.Parcelable.Creator
        public final CutSameVideo createFromParcel(Parcel parcel) {
            return new CutSameVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameVideo[] newArray(int i) {
            return new CutSameVideo[i];
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
        if (!(obj instanceof CutSameVideo)) {
            return false;
        }
        CutSameVideo cutSameVideo = (CutSameVideo) obj;
        return Intrinsics.LJFF(this.videoUri, cutSameVideo.videoUri) && Intrinsics.LJFF(this.videoUrl, cutSameVideo.videoUrl) && Intrinsics.LJFF(this.coverUri, cutSameVideo.coverUri) && Intrinsics.LJFF(this.coverUrl, cutSameVideo.coverUrl);
    }

    public final int hashCode() {
        return (((((this.videoUri.hashCode() * 31) + this.videoUrl.hashCode()) * 31) + this.coverUri.hashCode()) * 31) + this.coverUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameVideo(videoUri=");
        sbLIZ.append(this.videoUri);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.videoUrl);
        sbLIZ.append(", coverUri=");
        sbLIZ.append(this.coverUri);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoUri);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.coverUri);
        parcel.writeString(this.coverUrl);
    }

    public CutSameVideo() {
        this("", "", "", "");
    }

    public CutSameVideo(String str, String str2, String str3, String str4) {
        this.videoUri = str;
        this.videoUrl = str2;
        this.coverUri = str3;
        this.coverUrl = str4;
    }
}
