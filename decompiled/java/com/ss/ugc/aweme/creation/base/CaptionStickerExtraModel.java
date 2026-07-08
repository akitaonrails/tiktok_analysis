package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CaptionStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class CaptionStickerExtraModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CaptionStickerExtraModel> CREATOR = new Parcelable.Creator<CaptionStickerExtraModel>() { // from class: X.0k5U
        @Override // android.os.Parcelable.Creator
        public final CaptionStickerExtraModel createFromParcel(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2;
            String string = parcel.readString();
            Float fValueOf3 = null;
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            } else {
                fValueOf = null;
            }
            if (parcel.readInt() != 0) {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            } else {
                fValueOf2 = null;
            }
            if (parcel.readInt() != 0) {
                fValueOf3 = Float.valueOf(parcel.readFloat());
            }
            return new CaptionStickerExtraModel(string, fValueOf, fValueOf2, fValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionStickerExtraModel[] newArray(int i) {
            return new CaptionStickerExtraModel[i];
        }
    };

    @C09CT("end_time")
    public Float endTime;

    @C09CT("font_size")
    public Float fontSize;

    @C09CT("start_time")
    public Float startTime;

    @C09CT("text")
    public String text;

    public CaptionStickerExtraModel() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Float f = this.fontSize;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Float f2 = this.startTime;
        if (f2 != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Float f3 = this.endTime;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
    }

    public final Float getEndTime() {
        return this.endTime;
    }

    public final Float getFontSize() {
        return this.fontSize;
    }

    public final Float getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final void setEndTime(Float f) {
        this.endTime = f;
    }

    public final void setFontSize(Float f) {
        this.fontSize = f;
    }

    public final void setStartTime(Float f) {
        this.startTime = f;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public CaptionStickerExtraModel(String str, Float f, Float f2, Float f3) {
        this.text = str;
        this.fontSize = f;
        this.startTime = f2;
        this.endTime = f3;
    }
}
