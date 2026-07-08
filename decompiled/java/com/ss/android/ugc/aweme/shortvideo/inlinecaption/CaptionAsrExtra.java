package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionAsrExtra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CaptionAsrExtra implements Parcelable {
    public static final Parcelable.Creator<CaptionAsrExtra> CREATOR = new Parcelable.Creator<CaptionAsrExtra>() { // from class: X.0o9Y
        @Override // android.os.Parcelable.Creator
        public final CaptionAsrExtra createFromParcel(Parcel parcel) {
            return new CaptionAsrExtra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionAsrExtra[] newArray(int i) {
            return new CaptionAsrExtra[i];
        }
    };
    public String asrService;
    public String audioUri;
    public String srcLanguage;
    public String taskId;

    public CaptionAsrExtra() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionAsrExtra)) {
            return false;
        }
        CaptionAsrExtra captionAsrExtra = (CaptionAsrExtra) obj;
        return Intrinsics.LJFF(this.audioUri, captionAsrExtra.audioUri) && Intrinsics.LJFF(this.taskId, captionAsrExtra.taskId) && Intrinsics.LJFF(this.srcLanguage, captionAsrExtra.srcLanguage) && Intrinsics.LJFF(this.asrService, captionAsrExtra.asrService);
    }

    public final int hashCode() {
        return (((((this.audioUri.hashCode() * 31) + this.taskId.hashCode()) * 31) + this.srcLanguage.hashCode()) * 31) + this.asrService.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionAsrExtra(audioUri=");
        sbLIZ.append(this.audioUri);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", srcLanguage=");
        sbLIZ.append(this.srcLanguage);
        sbLIZ.append(", asrService=");
        sbLIZ.append(this.asrService);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioUri);
        parcel.writeString(this.taskId);
        parcel.writeString(this.srcLanguage);
        parcel.writeString(this.asrService);
    }

    public /* synthetic */ CaptionAsrExtra(int i) {
        this("", "", "", "");
    }

    public CaptionAsrExtra(String str, String str2, String str3, String str4) {
        this.audioUri = str;
        this.taskId = str2;
        this.srcLanguage = str3;
        this.asrService = str4;
    }
}
