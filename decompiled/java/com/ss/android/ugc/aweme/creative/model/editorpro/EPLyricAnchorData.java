package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPLyricAnchorData;

/* JADX INFO: loaded from: classes9.dex */
public final class EPLyricAnchorData implements Parcelable {
    public static final Parcelable.Creator<EPLyricAnchorData> CREATOR = new Parcelable.Creator<EPLyricAnchorData>() { // from class: X.0MUA
        @Override // android.os.Parcelable.Creator
        public final EPLyricAnchorData createFromParcel(Parcel parcel) {
            return new EPLyricAnchorData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EPLyricAnchorData[] newArray(int i) {
            return new EPLyricAnchorData[i];
        }
    };

    @C09CT("main_anchor_type")
    public String mainAnchorType;

    @C09CT("music_id")
    public String musicId;

    @C09CT("template_dispatch_type")
    public String templateDispatchType;

    public EPLyricAnchorData() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicId);
        parcel.writeString(this.templateDispatchType);
        parcel.writeString(this.mainAnchorType);
    }

    public EPLyricAnchorData(String str, String str2, String str3) {
        this.musicId = str;
        this.templateDispatchType = str2;
        this.mainAnchorType = str3;
    }
}
