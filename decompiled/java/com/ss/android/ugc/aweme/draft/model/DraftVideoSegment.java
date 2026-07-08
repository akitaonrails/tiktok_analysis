package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC1294060jmO
public final class DraftVideoSegment implements Parcelable {
    public static final Parcelable.Creator<DraftVideoSegment> CREATOR = new Parcelable.Creator<DraftVideoSegment>() { // from class: X.0MZT
        @Override // android.os.Parcelable.Creator
        public final DraftVideoSegment createFromParcel(Parcel parcel) {
            return new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftVideoSegment[] newArray(int i) {
            return new DraftVideoSegment[i];
        }
    };

    @C09CT("audio_path")
    public String audioPath;

    @C09CT("duration")
    public int duration;

    @C09CT("end")
    public int end;

    @C09CT("height")
    public int height;

    @C09CT("reverse_path")
    public String reversePath;

    @C09CT("roatete")
    public int rotate;

    @C09CT("speed")
    public float speed;

    @C09CT("start")
    public int start;

    @C09CT("temp_path")
    public String tempVideoPath;

    @C09CT("video_path")
    public String videoPath;

    @C09CT("width")
    public int width;

    public DraftVideoSegment() {
        this(0, 0, 0, 0, 0, 1.0f, 0, "", null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftVideoSegment)) {
            return false;
        }
        DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
        return this.width == draftVideoSegment.width && this.height == draftVideoSegment.height && this.start == draftVideoSegment.start && this.end == draftVideoSegment.end && this.duration == draftVideoSegment.duration && Float.compare(this.speed, draftVideoSegment.speed) == 0 && this.rotate == draftVideoSegment.rotate && Intrinsics.LJFF(this.videoPath, draftVideoSegment.videoPath) && Intrinsics.LJFF(this.audioPath, draftVideoSegment.audioPath) && Intrinsics.LJFF(this.reversePath, draftVideoSegment.reversePath) && Intrinsics.LJFF(this.tempVideoPath, draftVideoSegment.tempVideoPath);
    }

    public final String toString() {
        return "DraftVideoSegment(width=" + this.width + ", height=" + this.height + ", start=" + this.start + ", end=" + this.end + ", duration=" + this.duration + ", speed=" + this.speed + ", rotate=" + this.rotate + ", videoPath=" + this.videoPath + ", audioPath=" + this.audioPath + ", reversePath=" + this.reversePath + ", tempVideoPath=" + this.tempVideoPath + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeInt(this.duration);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.reversePath);
        parcel.writeString(this.tempVideoPath);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((((((((this.width * 31) + this.height) * 31) + this.start) * 31) + this.end) * 31) + this.duration) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.rotate) * 31) + this.videoPath.hashCode()) * 31;
        String str = this.audioPath;
        int iHashCode = (iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reversePath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tempVideoPath;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String str, String str2, String str3, String str4) {
        this.width = i;
        this.height = i2;
        this.start = i3;
        this.end = i4;
        this.duration = i5;
        this.speed = f;
        this.rotate = i6;
        this.videoPath = str;
        this.audioPath = str2;
        this.reversePath = str3;
        this.tempVideoPath = str4;
    }
}
