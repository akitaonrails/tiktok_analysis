package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryMultiImageParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryMultiImageParams> CREATOR = new Parcelable.Creator<StoryMultiImageParams>() { // from class: X.0npn
        @Override // android.os.Parcelable.Creator
        public final StoryMultiImageParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Float fValueOf = null;
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
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new StoryMultiImageParams(numValueOf, numValueOf2, fValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryMultiImageParams[] newArray(int i) {
            return new StoryMultiImageParams[i];
        }
    };

    @C09CT("story_canvas_bg_color_end")
    public Integer bgColorEnd;

    @C09CT("story_canvas_bg_color_start")
    public Integer bgColorStart;

    @C09CT("story_crop_scale")
    public Float cropScale;

    public StoryMultiImageParams() {
        this(null, null, null);
    }

    public final StoryMultiImageParams copy(Integer num, Integer num2, Float f) {
        return new StoryMultiImageParams(num, num2, f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMultiImageParams)) {
            return false;
        }
        StoryMultiImageParams storyMultiImageParams = (StoryMultiImageParams) obj;
        return Intrinsics.LJFF(this.bgColorStart, storyMultiImageParams.bgColorStart) && Intrinsics.LJFF(this.bgColorEnd, storyMultiImageParams.bgColorEnd) && Intrinsics.LJFF(this.cropScale, storyMultiImageParams.cropScale);
    }

    public int hashCode() {
        Integer num = this.bgColorStart;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bgColorEnd;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.cropScale;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryMultiImageParams(bgColorStart=");
        sbLIZ.append(this.bgColorStart);
        sbLIZ.append(", bgColorEnd=");
        sbLIZ.append(this.bgColorEnd);
        sbLIZ.append(", cropScale=");
        sbLIZ.append(this.cropScale);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.bgColorStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.bgColorEnd;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Float f = this.cropScale;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public final Integer getBgColorEnd() {
        return this.bgColorEnd;
    }

    public final Integer getBgColorStart() {
        return this.bgColorStart;
    }

    public final Float getCropScale() {
        return this.cropScale;
    }

    public final void setBgColorEnd(Integer num) {
        this.bgColorEnd = num;
    }

    public final void setBgColorStart(Integer num) {
        this.bgColorStart = num;
    }

    public final void setCropScale(Float f) {
        this.cropScale = f;
    }

    public StoryMultiImageParams(Integer num, Integer num2, Float f) {
        this.bgColorStart = num;
        this.bgColorEnd = num2;
        this.cropScale = f;
    }
}
