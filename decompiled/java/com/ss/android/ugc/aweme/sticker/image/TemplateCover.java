package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.image.TemplateCover;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateCover implements Parcelable {

    @C09CT("height")
    public final Integer height;

    @C09CT("large")
    public final String large;

    @C09CT("medium")
    public final String medium;

    @C09CT("png_large")
    public final String pngLarge;

    @C09CT("png_medium")
    public final String pngMedium;

    @C09CT("png_small")
    public final String pngSmall;

    @C09CT("small")
    public final String small;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;
    public static final Parcelable.Creator<TemplateCover> CREATOR = new Parcelable.Creator<TemplateCover>() { // from class: X.0wRT
        @Override // android.os.Parcelable.Creator
        public final TemplateCover createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new TemplateCover(string, string2, string3, string4, string5, string6, string7, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateCover[] newArray(int i) {
            return new TemplateCover[i];
        }
    };
    public static final int $stable = 8;

    public TemplateCover() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.large);
        parcel.writeString(this.medium);
        parcel.writeString(this.small);
        parcel.writeString(this.pngLarge);
        parcel.writeString(this.pngMedium);
        parcel.writeString(this.pngSmall);
        parcel.writeString(this.url);
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
    }

    public TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
        this.pngLarge = str4;
        this.pngMedium = str5;
        this.pngSmall = str6;
        this.url = str7;
        this.height = num;
        this.width = num2;
    }
}
