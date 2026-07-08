package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class MusicHighPrecisionDuration implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicHighPrecisionDuration> CREATOR = new Creator();

    @C09CT("audition_duration_precision")
    public Float auditionDurationPrecision;

    @C09CT("duration_precision")
    public Float durationPrecision;

    @C09CT("shoot_duration_precision")
    public Float shootDurationPrecision;

    @C09CT("video_duration_precision")
    public Float videoDurationPrecision;

    public static final class Creator implements Parcelable.Creator<MusicHighPrecisionDuration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicHighPrecisionDuration createFromParcel(Parcel parcel) {
            return new MusicHighPrecisionDuration(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicHighPrecisionDuration[] newArray(int i) {
            return new MusicHighPrecisionDuration[i];
        }
    }

    public MusicHighPrecisionDuration() {
        this(null, null, null, null);
    }

    public final float convertMS2S(int i) {
        return i / LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public final int convertS2MS(float f) {
        return (int) (f * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.durationPrecision;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.shootDurationPrecision;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.auditionDurationPrecision;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.videoDurationPrecision;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
    }

    public final Float getAuditionDurationPrecision() {
        return this.auditionDurationPrecision;
    }

    public final Float getDurationPrecision() {
        return this.durationPrecision;
    }

    public final Float getShootDurationPrecision() {
        return this.shootDurationPrecision;
    }

    public final Float getVideoDurationPrecision() {
        return this.videoDurationPrecision;
    }

    public final boolean checkDataValidate(Float f) {
        if (f == null) {
            return false;
        }
        f.floatValue();
        if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void setAuditionDurationPrecision(Float f) {
        this.auditionDurationPrecision = f;
    }

    public final void setDurationPrecision(Float f) {
        this.durationPrecision = f;
    }

    public final void setShootDurationPrecision(Float f) {
        this.shootDurationPrecision = f;
    }

    public final void setVideoDurationPrecision(Float f) {
        this.videoDurationPrecision = f;
    }

    public MusicHighPrecisionDuration(Float f, Float f2, Float f3, Float f4) {
        this.durationPrecision = f;
        this.shootDurationPrecision = f2;
        this.auditionDurationPrecision = f3;
        this.videoDurationPrecision = f4;
    }
}
