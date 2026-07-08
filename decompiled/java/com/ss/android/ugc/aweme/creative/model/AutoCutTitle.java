package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutTitle implements Parcelable {
    public static final Parcelable.Creator<AutoCutTitle> CREATOR = new Parcelable.Creator<AutoCutTitle>() { // from class: X.0mbu
        @Override // android.os.Parcelable.Creator
        public final AutoCutTitle createFromParcel(Parcel parcel) {
            return new AutoCutTitle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutTitle[] newArray(int i) {
            return new AutoCutTitle[i];
        }
    };

    @C09CT("autocut_actual_caption_location")
    public final String actualCaptionLocation;

    @C09CT("autocut_caption")
    public final String caption;

    @C09CT("autocut_caption_font_id")
    public final String captionFontId;

    @C09CT("autocut_origin_caption_location")
    public final String originCaptionLocation;

    public AutoCutTitle() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutTitle)) {
            return false;
        }
        AutoCutTitle autoCutTitle = (AutoCutTitle) obj;
        return Intrinsics.LJFF(this.caption, autoCutTitle.caption) && Intrinsics.LJFF(this.captionFontId, autoCutTitle.captionFontId) && Intrinsics.LJFF(this.originCaptionLocation, autoCutTitle.originCaptionLocation) && Intrinsics.LJFF(this.actualCaptionLocation, autoCutTitle.actualCaptionLocation);
    }

    public final int hashCode() {
        String str = this.caption;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captionFontId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originCaptionLocation;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actualCaptionLocation;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTitle(caption=");
        sbLIZ.append(this.caption);
        sbLIZ.append(", captionFontId=");
        sbLIZ.append(this.captionFontId);
        sbLIZ.append(", originCaptionLocation=");
        sbLIZ.append(this.originCaptionLocation);
        sbLIZ.append(", actualCaptionLocation=");
        sbLIZ.append(this.actualCaptionLocation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.caption);
        parcel.writeString(this.captionFontId);
        parcel.writeString(this.originCaptionLocation);
        parcel.writeString(this.actualCaptionLocation);
    }

    public AutoCutTitle(String str, String str2, String str3, String str4) {
        this.caption = str;
        this.captionFontId = str2;
        this.originCaptionLocation = str3;
        this.actualCaptionLocation = str4;
    }
}
