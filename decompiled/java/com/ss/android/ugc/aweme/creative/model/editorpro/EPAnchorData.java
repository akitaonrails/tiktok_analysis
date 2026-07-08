package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPLyricAnchorData;

/* JADX INFO: loaded from: classes9.dex */
public final class EPAnchorData implements Parcelable {
    public static final Parcelable.Creator<EPAnchorData> CREATOR = new Parcelable.Creator<EPAnchorData>() { // from class: X.0MJk
        @Override // android.os.Parcelable.Creator
        public final EPAnchorData createFromParcel(Parcel parcel) {
            EPLyricAnchorData ePLyricAnchorDataCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                ePLyricAnchorDataCreateFromParcel = null;
            } else {
                ePLyricAnchorDataCreateFromParcel = EPLyricAnchorData.CREATOR.createFromParcel(parcel);
            }
            return new EPAnchorData(string, string2, string3, string4, ePLyricAnchorDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EPAnchorData[] newArray(int i) {
            return new EPAnchorData[i];
        }
    };

    @C09CT("editor_pro_anchor_type")
    public String editorProAnchorType;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("lyric_anchor")
    public EPLyricAnchorData lyricAnchor;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("effect_resource_type")
    public String resourceType;

    public EPAnchorData() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.editorProAnchorType);
        parcel.writeString(this.effectId);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.resourceType);
        EPLyricAnchorData ePLyricAnchorData = this.lyricAnchor;
        if (ePLyricAnchorData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ePLyricAnchorData.writeToParcel(parcel, i);
        }
    }

    public EPAnchorData(String str, String str2, String str3, String str4, EPLyricAnchorData ePLyricAnchorData) {
        this.editorProAnchorType = str;
        this.effectId = str2;
        this.resourceId = str3;
        this.resourceType = str4;
        this.lyricAnchor = ePLyricAnchorData;
    }
}
